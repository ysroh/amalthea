/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwareFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HWModel'"
 * @generated
 */
public interface HardwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hardware";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/2017/Amalthea/Hardware";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Hardware";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HardwarePackage eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.SystemTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 0;

	/**
	 * The number of structural features of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUTypeImpl <em>ECU Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getECUType()
	 * @generated
	 */
	int ECU_TYPE = 1;

	/**
	 * The number of structural features of the '<em>ECU Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ECU Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerTypeImpl <em>Microcontroller Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getMicrocontrollerType()
	 * @generated
	 */
	int MICROCONTROLLER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Microcontroller Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Microcontroller Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ComplexNodeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getComplexNode()
	 * @generated
	 */
	int COMPLEX_NODE = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Complex Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Complex Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HwSystemImpl <em>Hw System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HwSystemImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getHwSystem()
	 * @generated
	 */
	int HW_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__BASE_CLASS = COMPLEX_NODE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__IS_ENCAPSULATED = COMPLEX_NODE__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Hw System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM___GET_REFERENCES = COMPLEX_NODE___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM___GET_PARTS = COMPLEX_NODE___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM___GET_FLOW_PROPERTIES = COMPLEX_NODE___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Hw System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUImpl <em>ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getECU()
	 * @generated
	 */
	int ECU = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__BASE_CLASS = COMPLEX_NODE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__IS_ENCAPSULATED = COMPLEX_NODE__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU___GET_REFERENCES = COMPLEX_NODE___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU___GET_PARTS = COMPLEX_NODE___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU___GET_FLOW_PROPERTIES = COMPLEX_NODE___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getMicrocontroller()
	 * @generated
	 */
	int MICROCONTROLLER = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__BASE_CLASS = COMPLEX_NODE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__IS_ENCAPSULATED = COMPLEX_NODE__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Microcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER___GET_REFERENCES = COMPLEX_NODE___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER___GET_PARTS = COMPLEX_NODE___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER___GET_FLOW_PROPERTIES = COMPLEX_NODE___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Microcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__BASE_CLASS = COMPLEX_NODE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IS_ENCAPSULATED = COMPLEX_NODE__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___GET_REFERENCES = COMPLEX_NODE___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___GET_PARTS = COMPLEX_NODE___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK___GET_FLOW_PROPERTIES = COMPLEX_NODE___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__SCHED_POLICY = 0;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__BIT_WIDTH = 1;

	/**
	 * The number of structural features of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getCore()
	 * @generated
	 */
	int CORE = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__BASE_CLASS = COMPLEX_NODE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__IS_ENCAPSULATED = COMPLEX_NODE__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Lockstep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__LOCKSTEP_GROUP = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE___GET_REFERENCES = COMPLEX_NODE___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE___GET_PARTS = COMPLEX_NODE___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE___GET_FLOW_PROPERTIES = COMPLEX_NODE___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.BusImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getBus()
	 * @generated
	 */
	int BUS = 10;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SCHED_POLICY = NETWORK_TYPE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BIT_WIDTH = NETWORK_TYPE__BIT_WIDTH;

	/**
	 * The feature id for the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BUS_TYPE = NETWORK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = NETWORK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = NETWORK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.QuartzImpl <em>Quartz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.QuartzImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getQuartz()
	 * @generated
	 */
	int QUARTZ = 11;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__BASE_CLASS = COMPLEX_NODE__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__IS_ENCAPSULATED = COMPLEX_NODE__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quartz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ___GET_REFERENCES = COMPLEX_NODE___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ___GET_PARTS = COMPLEX_NODE___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ___GET_FLOW_PROPERTIES = COMPLEX_NODE___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Quartz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ_OPERATION_COUNT = COMPLEX_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.PrescalerImpl <em>Prescaler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.PrescalerImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getPrescaler()
	 * @generated
	 */
	int PRESCALER = 12;

	/**
	 * The feature id for the '<em><b>Clock Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__CLOCK_RATIO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Prescaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Prescaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.FrequencyImpl <em>Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.FrequencyImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getFrequency()
	 * @generated
	 */
	int FREQUENCY = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HWModelImpl <em>HW Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HWModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getHWModel()
	 * @generated
	 */
	int HW_MODEL = 14;

	/**
	 * The number of structural features of the '<em>HW Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>HW Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreTypeImpl <em>Core Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getCoreType()
	 * @generated
	 */
	int CORE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__BIT_WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Instructions Per Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__INSTRUCTIONS_PER_CYCLE = 1;

	/**
	 * The number of structural features of the '<em>Core Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Core Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType <em>Sched Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getSchedType()
	 * @generated
	 */
	int SCHED_TYPE = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.BusType <em>Bus Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.BusType
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getBusType()
	 * @generated
	 */
	int BUS_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType <em>QType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getQType()
	 * @generated
	 */
	int QTYPE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit <em>Frequency Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getFrequencyUnit()
	 * @generated
	 */
	int FREQUENCY_UNIT = 19;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType
	 * @generated
	 */
	EClass getSystemType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType <em>ECU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType
	 * @generated
	 */
	EClass getECUType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType
	 * @generated
	 */
	EClass getMicrocontrollerType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem <em>Hw System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw System</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem
	 * @generated
	 */
	EClass getHwSystem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Node</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode
	 * @generated
	 */
	EClass getComplexNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU
	 * @generated
	 */
	EClass getECU();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller
	 * @generated
	 */
	EClass getMicrocontroller();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType
	 * @generated
	 */
	EClass getNetworkType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getSchedPolicy <em>Sched Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sched Policy</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getSchedPolicy()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_SchedPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getBitWidth()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_BitWidth();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core#getLockstepGroup <em>Lockstep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lockstep Group</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core#getLockstepGroup()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_LockstepGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Bus#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Bus#getBusType()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_BusType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quartz</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz
	 * @generated
	 */
	EClass getQuartz();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz#getType()
	 * @see #getQuartz()
	 * @generated
	 */
	EAttribute getQuartz_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescaler</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler
	 * @generated
	 */
	EClass getPrescaler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler#getClockRatio <em>Clock Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Ratio</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler#getClockRatio()
	 * @see #getPrescaler()
	 * @generated
	 */
	EAttribute getPrescaler_ClockRatio();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler#getName()
	 * @see #getPrescaler()
	 * @generated
	 */
	EAttribute getPrescaler_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency
	 * @generated
	 */
	EClass getFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency#getValue()
	 * @see #getFrequency()
	 * @generated
	 */
	EAttribute getFrequency_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency#getUnit()
	 * @see #getFrequency()
	 * @generated
	 */
	EAttribute getFrequency_Unit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HWModel <em>HW Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HWModel
	 * @generated
	 */
	EClass getHWModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType
	 * @generated
	 */
	EClass getCoreType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getBitWidth()
	 * @see #getCoreType()
	 * @generated
	 */
	EAttribute getCoreType_BitWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getInstructionsPerCycle <em>Instructions Per Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions Per Cycle</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getInstructionsPerCycle()
	 * @see #getCoreType()
	 * @generated
	 */
	EAttribute getCoreType_InstructionsPerCycle();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType <em>Sched Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sched Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType
	 * @generated
	 */
	EEnum getSchedType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.BusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.BusType
	 * @generated
	 */
	EEnum getBusType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>QType</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType
	 * @generated
	 */
	EEnum getQType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit <em>Frequency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency Unit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit
	 * @generated
	 */
	EEnum getFrequencyUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HardwareFactory getHardwareFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.SystemTypeImpl <em>System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.SystemTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getSystemType()
		 * @generated
		 */
		EClass SYSTEM_TYPE = eINSTANCE.getSystemType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUTypeImpl <em>ECU Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getECUType()
		 * @generated
		 */
		EClass ECU_TYPE = eINSTANCE.getECUType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerTypeImpl <em>Microcontroller Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getMicrocontrollerType()
		 * @generated
		 */
		EClass MICROCONTROLLER_TYPE = eINSTANCE.getMicrocontrollerType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HwSystemImpl <em>Hw System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HwSystemImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getHwSystem()
		 * @generated
		 */
		EClass HW_SYSTEM = eINSTANCE.getHwSystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ComplexNodeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getComplexNode()
		 * @generated
		 */
		EClass COMPLEX_NODE = eINSTANCE.getComplexNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUImpl <em>ECU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getECU()
		 * @generated
		 */
		EClass ECU = eINSTANCE.getECU();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getMicrocontroller()
		 * @generated
		 */
		EClass MICROCONTROLLER = eINSTANCE.getMicrocontroller();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkTypeImpl <em>Network Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getNetworkType()
		 * @generated
		 */
		EClass NETWORK_TYPE = eINSTANCE.getNetworkType();

		/**
		 * The meta object literal for the '<em><b>Sched Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_TYPE__SCHED_POLICY = eINSTANCE.getNetworkType_SchedPolicy();

		/**
		 * The meta object literal for the '<em><b>Bit Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_TYPE__BIT_WIDTH = eINSTANCE.getNetworkType_BitWidth();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getCore()
		 * @generated
		 */
		EClass CORE = eINSTANCE.getCore();

		/**
		 * The meta object literal for the '<em><b>Lockstep Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__LOCKSTEP_GROUP = eINSTANCE.getCore_LockstepGroup();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.BusImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Bus Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__BUS_TYPE = eINSTANCE.getBus_BusType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.QuartzImpl <em>Quartz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.QuartzImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getQuartz()
		 * @generated
		 */
		EClass QUARTZ = eINSTANCE.getQuartz();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUARTZ__TYPE = eINSTANCE.getQuartz_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.PrescalerImpl <em>Prescaler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.PrescalerImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getPrescaler()
		 * @generated
		 */
		EClass PRESCALER = eINSTANCE.getPrescaler();

		/**
		 * The meta object literal for the '<em><b>Clock Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCALER__CLOCK_RATIO = eINSTANCE.getPrescaler_ClockRatio();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCALER__NAME = eINSTANCE.getPrescaler_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.FrequencyImpl <em>Frequency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.FrequencyImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getFrequency()
		 * @generated
		 */
		EClass FREQUENCY = eINSTANCE.getFrequency();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY__VALUE = eINSTANCE.getFrequency_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY__UNIT = eINSTANCE.getFrequency_Unit();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HWModelImpl <em>HW Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HWModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getHWModel()
		 * @generated
		 */
		EClass HW_MODEL = eINSTANCE.getHWModel();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreTypeImpl <em>Core Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getCoreType()
		 * @generated
		 */
		EClass CORE_TYPE = eINSTANCE.getCoreType();

		/**
		 * The meta object literal for the '<em><b>Bit Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_TYPE__BIT_WIDTH = eINSTANCE.getCoreType_BitWidth();

		/**
		 * The meta object literal for the '<em><b>Instructions Per Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_TYPE__INSTRUCTIONS_PER_CYCLE = eINSTANCE.getCoreType_InstructionsPerCycle();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType <em>Sched Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getSchedType()
		 * @generated
		 */
		EEnum SCHED_TYPE = eINSTANCE.getSchedType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.BusType <em>Bus Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.BusType
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getBusType()
		 * @generated
		 */
		EEnum BUS_TYPE = eINSTANCE.getBusType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType <em>QType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getQType()
		 * @generated
		 */
		EEnum QTYPE = eINSTANCE.getQType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit <em>Frequency Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getFrequencyUnit()
		 * @generated
		 */
		EEnum FREQUENCY_UNIT = eINSTANCE.getFrequencyUnit();

	}

} //HardwarePackage
