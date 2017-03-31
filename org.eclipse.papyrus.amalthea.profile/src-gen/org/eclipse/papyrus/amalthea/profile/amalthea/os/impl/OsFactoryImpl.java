/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsFactoryImpl extends EFactoryImpl implements OsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OsFactory init() {
		try {
			OsFactory theOsFactory = (OsFactory)EPackage.Registry.INSTANCE.getEFactory(OsPackage.eNS_URI);
			if (theOsFactory != null) {
				return theOsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsFactoryImpl() {
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
			case OsPackage.OPERATING_SYSTEM: return createOperatingSystem();
			case OsPackage.TASK_SCHEDULER: return createTaskScheduler();
			case OsPackage.INTERRUPT_CONTROLLER: return createInterruptController();
			case OsPackage.SCHEDULING_HW_UNIT: return createSchedulingHWUnit();
			case OsPackage.OSEK: return createOSEK();
			case OsPackage.PRIORITY_BASED: return createPriorityBased();
			case OsPackage.OS_MODEL: return createOSModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingSystem createOperatingSystem() {
		OperatingSystemImpl operatingSystem = new OperatingSystemImpl();
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskScheduler createTaskScheduler() {
		TaskSchedulerImpl taskScheduler = new TaskSchedulerImpl();
		return taskScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptController createInterruptController() {
		InterruptControllerImpl interruptController = new InterruptControllerImpl();
		return interruptController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingHWUnit createSchedulingHWUnit() {
		SchedulingHWUnitImpl schedulingHWUnit = new SchedulingHWUnitImpl();
		return schedulingHWUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSEK createOSEK() {
		OSEKImpl osek = new OSEKImpl();
		return osek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityBased createPriorityBased() {
		PriorityBasedImpl priorityBased = new PriorityBasedImpl();
		return priorityBased;
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
	public OsPackage getOsPackage() {
		return (OsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OsPackage getPackage() {
		return OsPackage.eINSTANCE;
	}

} //OsFactoryImpl
