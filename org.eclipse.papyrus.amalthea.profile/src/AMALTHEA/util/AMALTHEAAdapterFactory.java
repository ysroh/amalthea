/**
 */
package AMALTHEA.util;

import AMALTHEA.AMALTHEAPackage;

import AMALTHEA.Bus;
import AMALTHEA.ComplexNode;
import AMALTHEA.Component;
import AMALTHEA.ComponentInstance;
import AMALTHEA.ComponentsModel;
import AMALTHEA.Composite;
import AMALTHEA.Connector;
import AMALTHEA.ConstraintsModel;
import AMALTHEA.Core;
import AMALTHEA.CoreType;
import AMALTHEA.CustomProperty;
import AMALTHEA.ECU;
import AMALTHEA.ECUType;
import AMALTHEA.FInterfacePort;
import AMALTHEA.Frequency;
import AMALTHEA.HWModel;
import AMALTHEA.HwSystem;
import AMALTHEA.IAnnotatable;
import AMALTHEA.MappingModel;
import AMALTHEA.Microcontroller;
import AMALTHEA.MicrocontrollerType;
import AMALTHEA.Network;
import AMALTHEA.NetworkType;
import AMALTHEA.OSModel;
import AMALTHEA.Port;
import AMALTHEA.Prescaler;
import AMALTHEA.QualifiedPort;
import AMALTHEA.Quartz;
import AMALTHEA.SoftwareModel;
import AMALTHEA.StimuliModel;
import AMALTHEA.SystemType;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AMALTHEA.AMALTHEAPackage
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
			public Adapter caseRunnable(AMALTHEA.Runnable object) {
				return createRunnableAdapter();
			}
			@Override
			public Adapter caseComponentsModel(ComponentsModel object) {
				return createComponentsModelAdapter();
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
			public Adapter caseComposite(Composite object) {
				return createCompositeAdapter();
			}
			@Override
			public Adapter caseComponentInstance(ComponentInstance object) {
				return createComponentInstanceAdapter();
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
			public Adapter casePort(Port object) {
				return createPortAdapter();
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
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
			}
			@Override
			public Adapter caseNetworkType(NetworkType object) {
				return createNetworkTypeAdapter();
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
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
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
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Runnable
	 * @generated
	 */
	public Adapter createRunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.ComponentsModel <em>Components Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.ComponentsModel
	 * @generated
	 */
	public Adapter createComponentsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.HWModel <em>HW Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.HWModel
	 * @generated
	 */
	public Adapter createHWModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.OSModel <em>OS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.OSModel
	 * @generated
	 */
	public Adapter createOSModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.MappingModel
	 * @generated
	 */
	public Adapter createMappingModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.StimuliModel <em>Stimuli Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.StimuliModel
	 * @generated
	 */
	public Adapter createStimuliModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.SoftwareModel <em>Software Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.SoftwareModel
	 * @generated
	 */
	public Adapter createSoftwareModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.ConstraintsModel <em>Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.ConstraintsModel
	 * @generated
	 */
	public Adapter createConstraintsModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.ComponentInstance
	 * @generated
	 */
	public Adapter createComponentInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.QualifiedPort <em>Qualified Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.QualifiedPort
	 * @generated
	 */
	public Adapter createQualifiedPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.IAnnotatable <em>IAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.IAnnotatable
	 * @generated
	 */
	public Adapter createIAnnotatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.CustomProperty <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.CustomProperty
	 * @generated
	 */
	public Adapter createCustomPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.FInterfacePort <em>FInterface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.FInterfacePort
	 * @generated
	 */
	public Adapter createFInterfacePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.CoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.CoreType
	 * @generated
	 */
	public Adapter createCoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.ComplexNode
	 * @generated
	 */
	public Adapter createComplexNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Quartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Quartz
	 * @generated
	 */
	public Adapter createQuartzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Frequency
	 * @generated
	 */
	public Adapter createFrequencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Prescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Prescaler
	 * @generated
	 */
	public Adapter createPrescalerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.NetworkType
	 * @generated
	 */
	public Adapter createNetworkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.ECUType <em>ECU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.ECUType
	 * @generated
	 */
	public Adapter createECUTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.MicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.MicrocontrollerType
	 * @generated
	 */
	public Adapter createMicrocontrollerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.HwSystem <em>Hw System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.HwSystem
	 * @generated
	 */
	public Adapter createHwSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.ECU
	 * @generated
	 */
	public Adapter createECUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Microcontroller
	 * @generated
	 */
	public Adapter createMicrocontrollerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AMALTHEA.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AMALTHEA.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
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
