package org.eclipse.papyrus.amalthea.core.types.advice;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.AbstractEditHelperAdvice;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.papyrus.amalthea.core.types.IAmaltheaTypes;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller;
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.services.edit.utils.RequestParameterConstants;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.util.UMLUtil;

public class PackageEditHelperAdvice extends AbstractEditHelperAdvice {

	@Override
	public boolean approveRequest(IEditCommandRequest request) {
		return super.approveRequest(request);
	}

	@Override
	public void configureRequest(IEditCommandRequest request) {
		if (request instanceof CreateElementRequest) {
			IElementType type = ((CreateElementRequest) request).getElementType();
			if (IAmaltheaTypes.WEIBULL_ESTIMATORS.equals(type.getId())) {
				request.setParameter(RequestParameterConstants.NAME_TO_SET, "WeibullEstimators");
			}
		}
	}

	@Override
	protected ICommand getAfterCreateCommand(CreateElementRequest request) {
		if (request.getElementType().getId().equals(IAmaltheaTypes.WEIBULL_ESTIMATORS)) {
			return getCommandForWeibullEstimators(request);
		}
		
		if (request.getElementType().getId().equals(IAmaltheaTypes.HW_SYSTEM)) {
			return getCommandForHwSystem(request);
		}
		
		return super.getAfterCreateCommand(request);
	}
	
	private ICommand getCommandForHwSystem(final CreateElementRequest request) {
		return new AbstractTransactionalCommand(TransactionUtil.getEditingDomain(request.getContainer()),
				"Create HwSystems", Collections.EMPTY_LIST) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				Element hwSystem = (Class) request.getNewElement();
				HwSystem hwSystemApp = UMLUtil.getStereotypeApplication(hwSystem, HwSystem.class);
				Package container = (Package) request.getContainer();

				Element result = createHelper(container, IAmaltheaTypes.ECU, "ECU_1");
				ECU ecuApp = UMLUtil.getStereotypeApplication(result, ECU.class);
				hwSystemApp.getEcus().add(ecuApp);

				Element result1 = createHelper(container, IAmaltheaTypes.MICROCONTROLLER, "Processor_1");
				Microcontroller processorApp = UMLUtil.getStereotypeApplication(result1, Microcontroller.class);
				ecuApp.getMicrocontrollers().add(processorApp);
				
				Element result2 = createHelper(container, IAmaltheaTypes.CORE, "Core_1");
				Core coreApp = UMLUtil.getStereotypeApplication(result2, Core.class);
				processorApp.getCores().add(coreApp);
				
				Element result3 = createHelper(container, IAmaltheaTypes.CORE_TYPE, "DefaultCoreType");
				CoreType coreTypeApp = UMLUtil.getStereotypeApplication(result3, CoreType.class);
				coreApp.setCoretype(coreTypeApp);
				
				return CommandResult.newOKCommandResult();
			}
		};
	}


	private ICommand getCommandForWeibullEstimators(final CreateElementRequest request) {
		return new AbstractTransactionalCommand(TransactionUtil.getEditingDomain(request.getContainer()),
				"Create Deviation", Collections.EMPTY_LIST) {

			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				Element weibull = (Class) request.getNewElement();
				WeibullEstimators dist = UMLUtil.getStereotypeApplication(weibull, WeibullEstimators.class);
				Package container = (Package) request.getContainer();

				Element result = createHelper(container, IAmaltheaTypes.DEVIATION, "Deviation");
				Deviation deviation = UMLUtil.getStereotypeApplication(result, Deviation.class);
				deviation.setDistribution(dist);

				Element result2 = createHelper(container, IAmaltheaTypes.INSTRUCTIONS_DEVIATION, "InstructionsDeviation");
				UMLUtil.getStereotypeApplication(result2, InstructionsDeviation.class).setDeviation(deviation);

				return CommandResult.newOKCommandResult();
			}
		};
	}

	private Element createHelper(Package container, String type, String name) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(container);
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);

		CreateElementRequest request = new CreateElementRequest(container,
				ElementTypeRegistry.getInstance().getType(type));
		request.setParameter(RequestParameterConstants.NAME_TO_SET, name);

		ICommand command = provider.getEditCommand(request);
		domain.getCommandStack()
				.execute(org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper.wrap(command));
		return (Element) command.getCommandResult().getReturnValue();
	}
}
