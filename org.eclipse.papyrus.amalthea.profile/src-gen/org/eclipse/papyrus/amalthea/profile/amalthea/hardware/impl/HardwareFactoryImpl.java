/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareFactoryImpl extends EFactoryImpl implements HardwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HardwareFactory init() {
		try {
			HardwareFactory theHardwareFactory = (HardwareFactory)EPackage.Registry.INSTANCE.getEFactory(HardwarePackage.eNS_URI);
			if (theHardwareFactory != null) {
				return theHardwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HardwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareFactoryImpl() {
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
			case HardwarePackage.HW_SYSTEM: return createHwSystem();
			case HardwarePackage.QUARTZ: return createQuartz();
			case HardwarePackage.FREQUENCY: return createFrequency();
			case HardwarePackage.PRESCALER: return createPrescaler();
			case HardwarePackage.NETWORK: return createNetwork();
			case HardwarePackage.NETWORK_TYPE: return createNetworkType();
			case HardwarePackage.ECU: return createECU();
			case HardwarePackage.MICROCONTROLLER: return createMicrocontroller();
			case HardwarePackage.CORE: return createCore();
			case HardwarePackage.CORE_TYPE: return createCoreType();
			case HardwarePackage.MICROCONTROLLER_TYPE: return createMicrocontrollerType();
			case HardwarePackage.ECU_TYPE: return createECUType();
			case HardwarePackage.SYSTEM_TYPE: return createSystemType();
			case HardwarePackage.BUS: return createBus();
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
			case HardwarePackage.QTYPE:
				return createQTypeFromString(eDataType, initialValue);
			case HardwarePackage.FREQUENCY_UNIT:
				return createFrequencyUnitFromString(eDataType, initialValue);
			case HardwarePackage.SCHED_TYPE:
				return createSchedTypeFromString(eDataType, initialValue);
			case HardwarePackage.BUS_TYPE:
				return createBusTypeFromString(eDataType, initialValue);
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
			case HardwarePackage.QTYPE:
				return convertQTypeToString(eDataType, instanceValue);
			case HardwarePackage.FREQUENCY_UNIT:
				return convertFrequencyUnitToString(eDataType, instanceValue);
			case HardwarePackage.SCHED_TYPE:
				return convertSchedTypeToString(eDataType, instanceValue);
			case HardwarePackage.BUS_TYPE:
				return convertBusTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
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
	public Core createCore() {
		CoreImpl core = new CoreImpl();
		return core;
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
	public MicrocontrollerType createMicrocontrollerType() {
		MicrocontrollerTypeImpl microcontrollerType = new MicrocontrollerTypeImpl();
		return microcontrollerType;
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
	public SystemType createSystemType() {
		SystemTypeImpl systemType = new SystemTypeImpl();
		return systemType;
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
	public HardwarePackage getHardwarePackage() {
		return (HardwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HardwarePackage getPackage() {
		return HardwarePackage.eINSTANCE;
	}

} //HardwareFactoryImpl
