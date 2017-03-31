/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OSModel'"
 * @generated
 */
public interface OsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "os";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/2017/Amalthea/OperatingSystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Os";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsPackage eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OperatingSystemImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulerImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 2;

	/**
	 * The feature id for the '<em><b>Schedule Unit Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__SCHEDULE_UNIT_PRIORITY = 0;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.TaskSchedulerImpl <em>Task Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.TaskSchedulerImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getTaskScheduler()
	 * @generated
	 */
	int TASK_SCHEDULER = 1;

	/**
	 * The feature id for the '<em><b>Schedule Unit Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER__SCHEDULE_UNIT_PRIORITY = SCHEDULER__SCHEDULE_UNIT_PRIORITY;

	/**
	 * The number of structural features of the '<em>Task Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER_FEATURE_COUNT = SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULER_OPERATION_COUNT = SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.InterruptControllerImpl <em>Interrupt Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.InterruptControllerImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getInterruptController()
	 * @generated
	 */
	int INTERRUPT_CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Schedule Unit Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER__SCHEDULE_UNIT_PRIORITY = SCHEDULER__SCHEDULE_UNIT_PRIORITY;

	/**
	 * The number of structural features of the '<em>Interrupt Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER_FEATURE_COUNT = SCHEDULER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interrupt Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_CONTROLLER_OPERATION_COUNT = SCHEDULER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulingUnitImpl <em>Scheduling Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulingUnitImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getSchedulingUnit()
	 * @generated
	 */
	int SCHEDULING_UNIT = 4;

	/**
	 * The number of structural features of the '<em>Scheduling Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Scheduling Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulingHWUnitImpl <em>Scheduling HW Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulingHWUnitImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getSchedulingHWUnit()
	 * @generated
	 */
	int SCHEDULING_HW_UNIT = 5;

	/**
	 * The number of structural features of the '<em>Scheduling HW Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_HW_UNIT_FEATURE_COUNT = SCHEDULING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scheduling HW Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_HW_UNIT_OPERATION_COUNT = SCHEDULING_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.TaskSchedulingAlgorithmImpl <em>Task Scheduling Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.TaskSchedulingAlgorithmImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getTaskSchedulingAlgorithm()
	 * @generated
	 */
	int TASK_SCHEDULING_ALGORITHM = 6;

	/**
	 * The number of structural features of the '<em>Task Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Task Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OSEKImpl <em>OSEK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OSEKImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getOSEK()
	 * @generated
	 */
	int OSEK = 7;

	/**
	 * The number of structural features of the '<em>OSEK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_FEATURE_COUNT = TASK_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OSEK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSEK_OPERATION_COUNT = TASK_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.InterruptSchedulingAlgorithmImpl <em>Interrupt Scheduling Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.InterruptSchedulingAlgorithmImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getInterruptSchedulingAlgorithm()
	 * @generated
	 */
	int INTERRUPT_SCHEDULING_ALGORITHM = 8;

	/**
	 * The number of structural features of the '<em>Interrupt Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_SCHEDULING_ALGORITHM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interrupt Scheduling Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_SCHEDULING_ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.PriorityBasedImpl <em>Priority Based</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.PriorityBasedImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getPriorityBased()
	 * @generated
	 */
	int PRIORITY_BASED = 9;

	/**
	 * The number of structural features of the '<em>Priority Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_BASED_FEATURE_COUNT = INTERRUPT_SCHEDULING_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Priority Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_BASED_OPERATION_COUNT = INTERRUPT_SCHEDULING_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OSModelImpl <em>OS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OSModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getOSModel()
	 * @generated
	 */
	int OS_MODEL = 10;

	/**
	 * The number of structural features of the '<em>OS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>OS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler <em>Task Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Scheduler</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler
	 * @generated
	 */
	EClass getTaskScheduler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.Scheduler#getScheduleUnitPriority <em>Schedule Unit Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Unit Priority</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.Scheduler#getScheduleUnitPriority()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_ScheduleUnitPriority();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController <em>Interrupt Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt Controller</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController
	 * @generated
	 */
	EClass getInterruptController();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingUnit <em>Scheduling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Unit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingUnit
	 * @generated
	 */
	EClass getSchedulingUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingHWUnit <em>Scheduling HW Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling HW Unit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingHWUnit
	 * @generated
	 */
	EClass getSchedulingHWUnit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskSchedulingAlgorithm <em>Task Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Scheduling Algorithm</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskSchedulingAlgorithm
	 * @generated
	 */
	EClass getTaskSchedulingAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.OSEK <em>OSEK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSEK</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OSEK
	 * @generated
	 */
	EClass getOSEK();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptSchedulingAlgorithm <em>Interrupt Scheduling Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt Scheduling Algorithm</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptSchedulingAlgorithm
	 * @generated
	 */
	EClass getInterruptSchedulingAlgorithm();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.PriorityBased <em>Priority Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Based</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.PriorityBased
	 * @generated
	 */
	EClass getPriorityBased();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.OSModel <em>OS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OSModel
	 * @generated
	 */
	EClass getOSModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OsFactory getOsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OperatingSystemImpl <em>Operating System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OperatingSystemImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EClass OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.TaskSchedulerImpl <em>Task Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.TaskSchedulerImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getTaskScheduler()
		 * @generated
		 */
		EClass TASK_SCHEDULER = eINSTANCE.getTaskScheduler();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulerImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Schedule Unit Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__SCHEDULE_UNIT_PRIORITY = eINSTANCE.getScheduler_ScheduleUnitPriority();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.InterruptControllerImpl <em>Interrupt Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.InterruptControllerImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getInterruptController()
		 * @generated
		 */
		EClass INTERRUPT_CONTROLLER = eINSTANCE.getInterruptController();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulingUnitImpl <em>Scheduling Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulingUnitImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getSchedulingUnit()
		 * @generated
		 */
		EClass SCHEDULING_UNIT = eINSTANCE.getSchedulingUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulingHWUnitImpl <em>Scheduling HW Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulingHWUnitImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getSchedulingHWUnit()
		 * @generated
		 */
		EClass SCHEDULING_HW_UNIT = eINSTANCE.getSchedulingHWUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.TaskSchedulingAlgorithmImpl <em>Task Scheduling Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.TaskSchedulingAlgorithmImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getTaskSchedulingAlgorithm()
		 * @generated
		 */
		EClass TASK_SCHEDULING_ALGORITHM = eINSTANCE.getTaskSchedulingAlgorithm();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OSEKImpl <em>OSEK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OSEKImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getOSEK()
		 * @generated
		 */
		EClass OSEK = eINSTANCE.getOSEK();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.InterruptSchedulingAlgorithmImpl <em>Interrupt Scheduling Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.InterruptSchedulingAlgorithmImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getInterruptSchedulingAlgorithm()
		 * @generated
		 */
		EClass INTERRUPT_SCHEDULING_ALGORITHM = eINSTANCE.getInterruptSchedulingAlgorithm();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.PriorityBasedImpl <em>Priority Based</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.PriorityBasedImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getPriorityBased()
		 * @generated
		 */
		EClass PRIORITY_BASED = eINSTANCE.getPriorityBased();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OSModelImpl <em>OS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OSModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl#getOSModel()
		 * @generated
		 */
		EClass OS_MODEL = eINSTANCE.getOSModel();

	}

} //OsPackage
