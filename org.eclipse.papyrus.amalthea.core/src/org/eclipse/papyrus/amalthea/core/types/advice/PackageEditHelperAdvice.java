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
import org.eclipse.papyrus.infra.services.edit.service.ElementEditServiceUtils;
import org.eclipse.papyrus.infra.services.edit.service.IElementEditService;
import org.eclipse.papyrus.infra.services.edit.utils.RequestParameterConstants;
import org.eclipse.uml2.uml.Class;
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
			return new AbstractTransactionalCommand(TransactionUtil.getEditingDomain(request.getContainer()),
					"Create Deviation", Collections.EMPTY_LIST) {

				@Override
				protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info)
						throws ExecutionException {
					Class weibull = (Class) request.getNewElement();
					WeibullEstimators dist = UMLUtil.getStereotypeApplication(weibull, WeibullEstimators.class);
					Package container = (Package) request.getContainer();

					Class result = createHelper(container, IAmaltheaTypes.DEVIATION, "Deviation");
					Deviation deviation = UMLUtil.getStereotypeApplication(result, Deviation.class);
					deviation.setDistribution(dist);

					Class result2 = createHelper(container, IAmaltheaTypes.INSTRUCTIONS_DEVIATION,
							"InstructionsDeviation");
					UMLUtil.getStereotypeApplication(result2, InstructionsDeviation.class).setDeviation(deviation);

					return CommandResult.newOKCommandResult();
				}
			};
		}
		return super.getAfterCreateCommand(request);
	}

	private Class createHelper(Package container, String type, String name) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(container);
		IElementEditService provider = ElementEditServiceUtils.getCommandProvider(container);

		CreateElementRequest request = new CreateElementRequest(container,
				ElementTypeRegistry.getInstance().getType(type));
		request.setParameter(RequestParameterConstants.NAME_TO_SET, name);

		ICommand command = provider.getEditCommand(request);
		domain.getCommandStack()
				.execute(org.eclipse.papyrus.infra.emf.gmf.command.GMFtoEMFCommandWrapper.wrap(command));
		return (Class) command.getCommandResult().getReturnValue();
	}
}
