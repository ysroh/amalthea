/**
 */
package AMALTHEA.impl;

import AMALTHEA.AMALTHEAFactory;
import AMALTHEA.AMALTHEAPackage;

import AMALTHEA.Bus;
import AMALTHEA.BusType;
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
import AMALTHEA.FrequencyUnit;
import AMALTHEA.HWModel;
import AMALTHEA.HwSystem;
import AMALTHEA.InterfaceKind;
import AMALTHEA.MappingModel;
import AMALTHEA.Microcontroller;
import AMALTHEA.MicrocontrollerType;
import AMALTHEA.Network;
import AMALTHEA.NetworkType;
import AMALTHEA.OSModel;
import AMALTHEA.Prescaler;
import AMALTHEA.QType;
import AMALTHEA.QualifiedPort;
import AMALTHEA.Quartz;
import AMALTHEA.SchedType;
import AMALTHEA.SoftwareModel;
import AMALTHEA.StimuliModel;
import AMALTHEA.SystemType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AMALTHEAFactoryImpl extends EFactoryImpl implements AMALTHEAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AMALTHEAFactory init() {
		try {
			AMALTHEAFactory theAMALTHEAFactory = (AMALTHEAFactory)EPackage.Registry.INSTANCE.getEFactory(AMALTHEAPackage.eNS_URI);
			if (theAMALTHEAFactory != null) {
				return theAMALTHEAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AMALTHEAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMALTHEAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AMALTHEAPackage.RUNNABLE: return createRunnable();
			case AMALTHEAPackage.COMPONENTS_MODEL: return createComponentsModel();
			case AMALTHEAPackage.HW_MODEL: return createHWModel();
			case AMALTHEAPackage.OS_MODEL: return createOSModel();
			case AMALTHEAPackage.MAPPING_MODEL: return createMappingModel();
			case AMALTHEAPackage.STIMULI_MODEL: return createStimuliModel();
			case AMALTHEAPackage.SOFTWARE_MODEL: return createSoftwareModel();
			case AMALTHEAPackage.CONSTRAINTS_MODEL: return createConstraintsModel();
			case AMALTHEAPackage.COMPONENT: return createComponent();
			case AMALTHEAPackage.COMPOSITE: return createComposite();
			case AMALTHEAPackage.COMPONENT_INSTANCE: return createComponentInstance();
			case AMALTHEAPackage.CONNECTOR: return createConnector();
			case AMALTHEAPackage.QUALIFIED_PORT: return createQualifiedPort();
			case AMALTHEAPackage.CUSTOM_PROPERTY: return createCustomProperty();
			case AMALTHEAPackage.FINTERFACE_PORT: return createFInterfacePort();
			case AMALTHEAPackage.CORE_TYPE: return createCoreType();
			case AMALTHEAPackage.CORE: return createCore();
			case AMALTHEAPackage.QUARTZ: return createQuartz();
			case AMALTHEAPackage.FREQUENCY: return createFrequency();
			case AMALTHEAPackage.PRESCALER: return createPrescaler();
			case AMALTHEAPackage.BUS: return createBus();
			case AMALTHEAPackage.NETWORK_TYPE: return createNetworkType();
			case AMALTHEAPackage.SYSTEM_TYPE: return createSystemType();
			case AMALTHEAPackage.ECU_TYPE: return createECUType();
			case AMALTHEAPackage.MICROCONTROLLER_TYPE: return createMicrocontrollerType();
			case AMALTHEAPackage.HW_SYSTEM: return createHwSystem();
			case AMALTHEAPackage.ECU: return createECU();
			case AMALTHEAPackage.MICROCONTROLLER: return createMicrocontroller();
			case AMALTHEAPackage.NETWORK: return createNetwork();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AMALTHEAPackage.INTERFACE_KIND:
				return createInterfaceKindFromString(eDataType, initialValue);
			case AMALTHEAPackage.QTYPE:
				return createQTypeFromString(eDataType, initialValue);
			case AMALTHEAPackage.SCHED_TYPE:
				return createSchedTypeFromString(eDataType, initialValue);
			case AMALTHEAPackage.BUS_TYPE:
				return createBusTypeFromString(eDataType, initialValue);
			case AMALTHEAPackage.FREQUENCY_UNIT:
				return createFrequencyUnitFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AMALTHEAPackage.INTERFACE_KIND:
				return convertInterfaceKindToString(eDataType, instanceValue);
			case AMALTHEAPackage.QTYPE:
				return convertQTypeToString(eDataType, instanceValue);
			case AMALTHEAPackage.SCHED_TYPE:
				return convertSchedTypeToString(eDataType, instanceValue);
			case AMALTHEAPackage.BUS_TYPE:
				return convertBusTypeToString(eDataType, instanceValue);
			case AMALTHEAPackage.FREQUENCY_UNIT:
				return convertFrequencyUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMALTHEA.Runnable createRunnable() {
		RunnableImpl runnable = new RunnableImpl();
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsModel createComponentsModel() {
		ComponentsModelImpl componentsModel = new ComponentsModelImpl();
		return componentsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HWModel createHWModel() {
		HWModelImpl hwModel = new HWModelImpl();
		return hwModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSModel createOSModel() {
		OSModelImpl osModel = new OSModelImpl();
		return osModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel createMappingModel() {
		MappingModelImpl mappingModel = new MappingModelImpl();
		return mappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimuliModel createStimuliModel() {
		StimuliModelImpl stimuliModel = new StimuliModelImpl();
		return stimuliModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareModel createSoftwareModel() {
		SoftwareModelImpl softwareModel = new SoftwareModelImpl();
		return softwareModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsModel createConstraintsModel() {
		ConstraintsModelImpl constraintsModel = new ConstraintsModelImpl();
		return constraintsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort createQualifiedPort() {
		QualifiedPortImpl qualifiedPort = new QualifiedPortImpl();
		return qualifiedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomProperty createCustomProperty() {
		CustomPropertyImpl customProperty = new CustomPropertyImpl();
		return customProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FInterfacePort createFInterfacePort() {
		FInterfacePortImpl fInterfacePort = new FInterfacePortImpl();
		return fInterfacePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreType createCoreType() {
		CoreTypeImpl coreType = new CoreTypeImpl();
		return coreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core createCore() {
		CoreImpl core = new CoreImpl();
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz createQuartz() {
		QuartzImpl quartz = new QuartzImpl();
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frequency createFrequency() {
		FrequencyImpl frequency = new FrequencyImpl();
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescaler createPrescaler() {
		PrescalerImpl prescaler = new PrescalerImpl();
		return prescaler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkType createNetworkType() {
		NetworkTypeImpl networkType = new NetworkTypeImpl();
		return networkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType createSystemType() {
		SystemTypeImpl systemType = new SystemTypeImpl();
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECUType createECUType() {
		ECUTypeImpl ecuType = new ECUTypeImpl();
		return ecuType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerType createMicrocontrollerType() {
		MicrocontrollerTypeImpl microcontrollerType = new MicrocontrollerTypeImpl();
		return microcontrollerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HwSystem createHwSystem() {
		HwSystemImpl hwSystem = new HwSystemImpl();
		return hwSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECU createECU() {
		ECUImpl ecu = new ECUImpl();
		return ecu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microcontroller createMicrocontroller() {
		MicrocontrollerImpl microcontroller = new MicrocontrollerImpl();
		return microcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceKind createInterfaceKindFromString(EDataType eDataType, String initialValue) {
		InterfaceKind result = InterfaceKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QType createQTypeFromString(EDataType eDataType, String initialValue) {
		QType result = QType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedType createSchedTypeFromString(EDataType eDataType, String initialValue) {
		SchedType result = SchedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusType createBusTypeFromString(EDataType eDataType, String initialValue) {
		BusType result = BusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyUnit createFrequencyUnitFromString(EDataType eDataType, String initialValue) {
		FrequencyUnit result = FrequencyUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMALTHEAPackage getAMALTHEAPackage() {
		return (AMALTHEAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AMALTHEAPackage getPackage() {
		return AMALTHEAPackage.eINSTANCE;
	}

} //AMALTHEAFactoryImpl
