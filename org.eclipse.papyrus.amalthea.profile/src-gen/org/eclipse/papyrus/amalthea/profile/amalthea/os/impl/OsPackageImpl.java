/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.AmaltheaPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.impl.AmaltheaPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.mapping.MappingPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.mapping.impl.MappingPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptSchedulingAlgorithm;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsFactory;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.PriorityBased;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.Scheduler;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingHWUnit;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingUnit;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskSchedulingAlgorithm;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml14.sysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsPackageImpl extends EPackageImpl implements OsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskSchedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskSchedulingAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptSchedulingAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingHWUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorityBasedEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OsPackageImpl() {
		super(eNS_URI, OsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OsPackage init() {
		if (isInited) return (OsPackage)EPackage.Registry.INSTANCE.getEPackage(OsPackage.eNS_URI);

		// Obtain or create and register package
		OsPackageImpl theOsPackage = (OsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		sysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AmaltheaPackageImpl theAmaltheaPackage = (AmaltheaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmaltheaPackage.eNS_URI) instanceof AmaltheaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmaltheaPackage.eNS_URI) : AmaltheaPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) instanceof ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) : ComponentsPackage.eINSTANCE);
		SoftwarePackageImpl theSoftwarePackage = (SoftwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) instanceof SoftwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) : SoftwarePackage.eINSTANCE);
		StimuliPackageImpl theStimuliPackage = (StimuliPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI) instanceof StimuliPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI) : StimuliPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) : ConstraintsPackage.eINSTANCE);

		// Create package meta-data objects
		theOsPackage.createPackageContents();
		theAmaltheaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theSoftwarePackage.createPackageContents();
		theStimuliPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theMappingPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();

		// Initialize created meta-data
		theOsPackage.initializePackageContents();
		theAmaltheaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theSoftwarePackage.initializePackageContents();
		theStimuliPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theMappingPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OsPackage.eNS_URI, theOsPackage);
		return theOsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_Taskscheduler() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingSystem_Interruptcontroller() {
		return (EReference)operatingSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskScheduler() {
		return taskSchedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskScheduler_Schedulingalgorithm() {
		return (EReference)taskSchedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduler() {
		return schedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduler_ScheduleUnitPriority() {
		return (EAttribute)schedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScheduler_Schedulingunit() {
		return (EReference)schedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingUnit() {
		return schedulingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskSchedulingAlgorithm() {
		return taskSchedulingAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptController() {
		return interruptControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptController_Schedulingalgorithm() {
		return (EReference)interruptControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptSchedulingAlgorithm() {
		return interruptSchedulingAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedulingHWUnit() {
		return schedulingHWUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedulingHWUnit_Delay() {
		return (EReference)schedulingHWUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSEK() {
		return osekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorityBased() {
		return priorityBasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsFactory getOsFactory() {
		return (OsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		operatingSystemEClass = createEClass(OPERATING_SYSTEM);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__TASKSCHEDULER);
		createEReference(operatingSystemEClass, OPERATING_SYSTEM__INTERRUPTCONTROLLER);

		taskSchedulerEClass = createEClass(TASK_SCHEDULER);
		createEReference(taskSchedulerEClass, TASK_SCHEDULER__SCHEDULINGALGORITHM);

		schedulerEClass = createEClass(SCHEDULER);
		createEAttribute(schedulerEClass, SCHEDULER__SCHEDULE_UNIT_PRIORITY);
		createEReference(schedulerEClass, SCHEDULER__SCHEDULINGUNIT);

		schedulingUnitEClass = createEClass(SCHEDULING_UNIT);

		taskSchedulingAlgorithmEClass = createEClass(TASK_SCHEDULING_ALGORITHM);

		interruptControllerEClass = createEClass(INTERRUPT_CONTROLLER);
		createEReference(interruptControllerEClass, INTERRUPT_CONTROLLER__SCHEDULINGALGORITHM);

		interruptSchedulingAlgorithmEClass = createEClass(INTERRUPT_SCHEDULING_ALGORITHM);

		schedulingHWUnitEClass = createEClass(SCHEDULING_HW_UNIT);
		createEReference(schedulingHWUnitEClass, SCHEDULING_HW_UNIT__DELAY);

		osekEClass = createEClass(OSEK);

		priorityBasedEClass = createEClass(PRIORITY_BASED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operatingSystemEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		taskSchedulerEClass.getESuperTypes().add(this.getScheduler());
		schedulerEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		schedulingUnitEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		taskSchedulingAlgorithmEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		interruptControllerEClass.getESuperTypes().add(this.getScheduler());
		interruptSchedulingAlgorithmEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		schedulingHWUnitEClass.getESuperTypes().add(this.getSchedulingUnit());
		osekEClass.getESuperTypes().add(this.getTaskSchedulingAlgorithm());
		priorityBasedEClass.getESuperTypes().add(this.getInterruptSchedulingAlgorithm());

		// Initialize classes, features, and operations; add parameters
		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperatingSystem_Taskscheduler(), this.getTaskScheduler(), null, "taskscheduler", null, 0, -1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperatingSystem_Interruptcontroller(), this.getInterruptController(), null, "interruptcontroller", null, 0, -1, OperatingSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(taskSchedulerEClass, TaskScheduler.class, "TaskScheduler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskScheduler_Schedulingalgorithm(), this.getTaskSchedulingAlgorithm(), null, "schedulingalgorithm", null, 0, 1, TaskScheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(schedulerEClass, Scheduler.class, "Scheduler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduler_ScheduleUnitPriority(), theTypesPackage.getInteger(), "scheduleUnitPriority", "0", 1, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScheduler_Schedulingunit(), this.getSchedulingUnit(), null, "schedulingunit", null, 0, 1, Scheduler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(schedulingUnitEClass, SchedulingUnit.class, "SchedulingUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskSchedulingAlgorithmEClass, TaskSchedulingAlgorithm.class, "TaskSchedulingAlgorithm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interruptControllerEClass, InterruptController.class, "InterruptController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterruptController_Schedulingalgorithm(), this.getInterruptSchedulingAlgorithm(), null, "schedulingalgorithm", null, 0, 1, InterruptController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interruptSchedulingAlgorithmEClass, InterruptSchedulingAlgorithm.class, "InterruptSchedulingAlgorithm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schedulingHWUnitEClass, SchedulingHWUnit.class, "SchedulingHWUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchedulingHWUnit_Delay(), theCommonPackage.getTime(), null, "delay", null, 0, 1, SchedulingHWUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(osekEClass, org.eclipse.papyrus.amalthea.profile.amalthea.os.OSEK.class, "OSEK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(priorityBasedEClass, PriorityBased.class, "PriorityBased", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "OSModel"
		   });
	}

} //OsPackageImpl
