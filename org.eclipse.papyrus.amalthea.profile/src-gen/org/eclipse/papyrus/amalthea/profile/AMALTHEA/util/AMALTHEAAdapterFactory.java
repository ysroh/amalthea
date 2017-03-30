/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.BaseObject;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentsModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Composite;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.HWModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptSchedulingAlgorithm;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.MappingModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSEK;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.OperatingSystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.PriorityBased;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ReferableBaseObject;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Scheduler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingHWUnit;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingUnit;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SoftwareModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.StimuliModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskSchedulingAlgorithm;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Time;
import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage
 * @generated
 */
public class AMALTHEAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AMALTHEAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMALTHEAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AMALTHEAPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AMALTHEASwitch<Adapter> modelSwitch =
		new AMALTHEASwitch<Adapter>() {
			@Override
			public Adapter caseRunnable(org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable object) {
				return createRunnableAdapter();
			}
			@Override
			public Adapter caseComponentsModel(ComponentsModel object) {
				return createComponentsModelAdapter();
			}
			@Override
			public Adapter caseBaseObject(BaseObject object) {
				return createBaseObjectAdapter();
			}
			@Override
			public Adapter caseIAnnotatable(IAnnotatable object) {
				return createIAnnotatableAdapter();
			}
			@Override
			public Adapter caseCustomProperty(CustomProperty object) {
				return createCustomPropertyAdapter();
			}
			@Override
			public Adapter caseHWModel(HWModel object) {
				return createHWModelAdapter();
			}
			@Override
			public Adapter caseOSModel(OSModel object) {
				return createOSModelAdapter();
			}
			@Override
			public Adapter caseMappingModel(MappingModel object) {
				return createMappingModelAdapter();
			}
			@Override
			public Adapter caseStimuliModel(StimuliModel object) {
				return createStimuliModelAdapter();
			}
			@Override
			public Adapter caseSoftwareModel(SoftwareModel object) {
				return createSoftwareModelAdapter();
			}
			@Override
			public Adapter caseConstraintsModel(ConstraintsModel object) {
				return createConstraintsModelAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseReferableBaseObject(ReferableBaseObject object) {
				return createReferableBaseObjectAdapter();
			}
			@Override
			public Adapter caseIReferable(IReferable object) {
				return createIReferableAdapter();
			}
			@Override
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseISystem(ISystem object) {
				return createISystemAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseQualifiedPort(QualifiedPort object) {
				return createQualifiedPortAdapter();
			}
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseFInterfacePort(FInterfacePort object) {
				return createFInterfacePortAdapter();
			}
			@Override
			public Adapter caseCoreType(CoreType object) {
				return createCoreTypeAdapter();
			}
			@Override
			public Adapter caseCore(Core object) {
				return createCoreAdapter();
			}
			@Override
			public Adapter caseComplexNode(ComplexNode object) {
				return createComplexNodeAdapter();
			}
			@Override
			public Adapter caseQuartz(Quartz object) {
				return createQuartzAdapter();
			}
			@Override
			public Adapter caseFrequency(Frequency object) {
				return createFrequencyAdapter();
			}
			@Override
			public Adapter casePrescaler(Prescaler object) {
				return createPrescalerAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseNetworkType(NetworkType object) {
				return createNetworkTypeAdapter();
			}
			@Override
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
			}
			@Override
			public Adapter caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			@Override
			public Adapter caseECUType(ECUType object) {
				return createECUTypeAdapter();
			}
			@Override
			public Adapter caseMicrocontrollerType(MicrocontrollerType object) {
				return createMicrocontrollerTypeAdapter();
			}
			@Override
			public Adapter caseHwSystem(HwSystem object) {
				return createHwSystemAdapter();
			}
			@Override
			public Adapter caseECU(ECU object) {
				return createECUAdapter();
			}
			@Override
			public Adapter caseMicrocontroller(Microcontroller object) {
				return createMicrocontrollerAdapter();
			}
			@Override
			public Adapter caseAbstractTime(AbstractTime object) {
				return createAbstractTimeAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseOperatingSystem(OperatingSystem object) {
				return createOperatingSystemAdapter();
			}
			@Override
			public Adapter caseTaskScheduler(TaskScheduler object) {
				return createTaskSchedulerAdapter();
			}
			@Override
			public Adapter caseScheduler(Scheduler object) {
				return createSchedulerAdapter();
			}
			@Override
			public Adapter caseSchedulingUnit(SchedulingUnit object) {
				return createSchedulingUnitAdapter();
			}
			@Override
			public Adapter caseTaskSchedulingAlgorithm(TaskSchedulingAlgorithm object) {
				return createTaskSchedulingAlgorithmAdapter();
			}
			@Override
			public Adapter caseInterruptController(InterruptController object) {
				return createInterruptControllerAdapter();
			}
			@Override
			public Adapter caseInterruptSchedulingAlgorithm(InterruptSchedulingAlgorithm object) {
				return createInterruptSchedulingAlgorithmAdapter();
			}
			@Override
			public Adapter caseSchedulingHWUnit(SchedulingHWUnit object) {
				return createSchedulingHWUnitAdapter();
			}
			@Override
			public Adapter caseOSEK(OSEK object) {
				return createOSEKAdapter();
			}
			@Override
			public Adapter casePriorityBased(PriorityBased object) {
				return createPriorityBasedAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable
	 * @generated
	 */
	public Adapter createRunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentsModel <em>Components Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentsModel
	 * @generated
	 */
	public Adapter createComponentsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.BaseObject <em>Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.BaseObject
	 * @generated
	 */
	public Adapter createBaseObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable <em>IAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable
	 * @generated
	 */
	public Adapter createIAnnotatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty
	 * @generated
	 */
	public Adapter createCustomPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HWModel <em>HW Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.HWModel
	 * @generated
	 */
	public Adapter createHWModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSModel <em>OS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSModel
	 * @generated
	 */
	public Adapter createOSModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.MappingModel
	 * @generated
	 */
	public Adapter createMappingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.StimuliModel <em>Stimuli Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.StimuliModel
	 * @generated
	 */
	public Adapter createStimuliModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SoftwareModel <em>Software Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SoftwareModel
	 * @generated
	 */
	public Adapter createSoftwareModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel <em>Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel
	 * @generated
	 */
	public Adapter createConstraintsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ReferableBaseObject <em>Referable Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ReferableBaseObject
	 * @generated
	 */
	public Adapter createReferableBaseObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable <em>IReferable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable
	 * @generated
	 */
	public Adapter createIReferableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem <em>ISystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem
	 * @generated
	 */
	public Adapter createISystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort <em>Qualified Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort
	 * @generated
	 */
	public Adapter createQualifiedPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort <em>FInterface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort
	 * @generated
	 */
	public Adapter createFInterfacePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType
	 * @generated
	 */
	public Adapter createCoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode
	 * @generated
	 */
	public Adapter createComplexNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz
	 * @generated
	 */
	public Adapter createQuartzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency
	 * @generated
	 */
	public Adapter createFrequencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler
	 * @generated
	 */
	public Adapter createPrescalerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType
	 * @generated
	 */
	public Adapter createNetworkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType <em>ECU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType
	 * @generated
	 */
	public Adapter createECUTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType
	 * @generated
	 */
	public Adapter createMicrocontrollerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem <em>Hw System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem
	 * @generated
	 */
	public Adapter createHwSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU
	 * @generated
	 */
	public Adapter createECUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller
	 * @generated
	 */
	public Adapter createMicrocontrollerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime <em>Abstract Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime
	 * @generated
	 */
	public Adapter createAbstractTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.OperatingSystem
	 * @generated
	 */
	public Adapter createOperatingSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler <em>Task Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler
	 * @generated
	 */
	public Adapter createTaskSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Scheduler
	 * @generated
	 */
	public Adapter createSchedulerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingUnit <em>Scheduling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingUnit
	 * @generated
	 */
	public Adapter createSchedulingUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskSchedulingAlgorithm <em>Task Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskSchedulingAlgorithm
	 * @generated
	 */
	public Adapter createTaskSchedulingAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController <em>Interrupt Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController
	 * @generated
	 */
	public Adapter createInterruptControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptSchedulingAlgorithm <em>Interrupt Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptSchedulingAlgorithm
	 * @generated
	 */
	public Adapter createInterruptSchedulingAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingHWUnit <em>Scheduling HW Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingHWUnit
	 * @generated
	 */
	public Adapter createSchedulingHWUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSEK <em>OSEK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSEK
	 * @generated
	 */
	public Adapter createOSEKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.PriorityBased <em>Priority Based</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.PriorityBased
	 * @generated
	 */
	public Adapter createPriorityBasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml14.blocks.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml14.blocks.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AMALTHEAAdapterFactory
