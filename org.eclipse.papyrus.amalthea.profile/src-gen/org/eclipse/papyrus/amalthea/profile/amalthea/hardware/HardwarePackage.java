/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ComplexNodeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getComplexNode()
	 * @generated
	 */
	int COMPLEX_NODE = 1;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__QUARTZES = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__PRESCALER = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__NETWORKS = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Complex Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 3;

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
	int HW_SYSTEM = 0;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Ecus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__ECUS = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Systemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__SYSTEMTYPE = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hw System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.QuartzImpl <em>Quartz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.QuartzImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getQuartz()
	 * @generated
	 */
	int QUARTZ = 2;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__FREQUENCY = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quartz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

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
	int PRESCALER = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUImpl <em>ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getECU()
	 * @generated
	 */
	int ECU = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getMicrocontroller()
	 * @generated
	 */
	int MICROCONTROLLER = 8;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreTypeImpl <em>Core Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getCoreType()
	 * @generated
	 */
	int CORE_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerTypeImpl <em>Microcontroller Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getMicrocontrollerType()
	 * @generated
	 */
	int MICROCONTROLLER_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUTypeImpl <em>ECU Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getECUType()
	 * @generated
	 */
	int ECU_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.SystemTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.BusImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getBus()
	 * @generated
	 */
	int BUS = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.FrequencyImpl <em>Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.FrequencyImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getFrequency()
	 * @generated
	 */
	int FREQUENCY = 3;

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
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Clock Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__CLOCK_RATIO = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prescaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Prescaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Networktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NETWORKTYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE__BASE_DATA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Network Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_TYPE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Microcontrollers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__MICROCONTROLLERS = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ecutype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__ECUTYPE = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ECU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__CORES = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Microcontrollertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__MICROCONTROLLERTYPE = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Microcontroller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NETWORKS = COMPLEX_NODE__NETWORKS;

	/**
	 * The feature id for the '<em><b>Lockstep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__LOCKSTEP_GROUP = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coretype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CORETYPE = COMPLEX_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = COMPLEX_NODE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__BASE_DATA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Core Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Core Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE__BASE_DATA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Microcontroller Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Microcontroller Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE__BASE_DATA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>ECU Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ECU Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__BASE_DATA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BASE_DATA_TYPE = NETWORK_TYPE__BASE_DATA_TYPE;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType <em>QType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getQType()
	 * @generated
	 */
	int QTYPE = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType <em>Sched Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getSchedType()
	 * @generated
	 */
	int SCHED_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.BusType <em>Bus Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.BusType
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getBusType()
	 * @generated
	 */
	int BUS_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit <em>Frequency Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getFrequencyUnit()
	 * @generated
	 */
	int FREQUENCY_UNIT = 16;


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
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem#getEcus <em>Ecus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ecus</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem#getEcus()
	 * @see #getHwSystem()
	 * @generated
	 */
	EReference getHwSystem_Ecus();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem#getSystemtype <em>Systemtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Systemtype</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem#getSystemtype()
	 * @see #getHwSystem()
	 * @generated
	 */
	EReference getHwSystem_Systemtype();

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
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode#getQuartzes <em>Quartzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quartzes</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode#getQuartzes()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Quartzes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode#getPrescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescaler</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode#getPrescaler()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Prescaler();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Networks</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode#getNetworks()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Networks();

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
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frequency</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz#getFrequency()
	 * @see #getQuartz()
	 * @generated
	 */
	EReference getQuartz_Frequency();

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
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network#getNetworktype <em>Networktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Networktype</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network#getNetworktype()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Networktype();

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
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getBase_DataType()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Base_DataType();

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
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU#getMicrocontrollers <em>Microcontrollers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Microcontrollers</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU#getMicrocontrollers()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Microcontrollers();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU#getEcutype <em>Ecutype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecutype</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU#getEcutype()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Ecutype();

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
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cores</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller#getCores()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Cores();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller#getMicrocontrollertype <em>Microcontrollertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microcontrollertype</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller#getMicrocontrollertype()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Microcontrollertype();

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
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core#getCoretype <em>Coretype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coretype</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core#getCoretype()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_Coretype();

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
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getBase_DataType()
	 * @see #getCoreType()
	 * @generated
	 */
	EReference getCoreType_Base_DataType();

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
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType#getBase_DataType()
	 * @see #getMicrocontrollerType()
	 * @generated
	 */
	EReference getMicrocontrollerType_Base_DataType();

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
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType#getBase_DataType()
	 * @see #getECUType()
	 * @generated
	 */
	EReference getECUType_Base_DataType();

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
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType#getBase_DataType()
	 * @see #getSystemType()
	 * @generated
	 */
	EReference getSystemType_Base_DataType();

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
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>QType</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType
	 * @generated
	 */
	EEnum getQType();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HwSystemImpl <em>Hw System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HwSystemImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getHwSystem()
		 * @generated
		 */
		EClass HW_SYSTEM = eINSTANCE.getHwSystem();

		/**
		 * The meta object literal for the '<em><b>Ecus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_SYSTEM__ECUS = eINSTANCE.getHwSystem_Ecus();

		/**
		 * The meta object literal for the '<em><b>Systemtype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_SYSTEM__SYSTEMTYPE = eINSTANCE.getHwSystem_Systemtype();

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
		 * The meta object literal for the '<em><b>Quartzes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_NODE__QUARTZES = eINSTANCE.getComplexNode_Quartzes();

		/**
		 * The meta object literal for the '<em><b>Prescaler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_NODE__PRESCALER = eINSTANCE.getComplexNode_Prescaler();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_NODE__NETWORKS = eINSTANCE.getComplexNode_Networks();

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
		 * The meta object literal for the '<em><b>Frequency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUARTZ__FREQUENCY = eINSTANCE.getQuartz_Frequency();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Networktype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__NETWORKTYPE = eINSTANCE.getNetwork_Networktype();

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
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_TYPE__BASE_DATA_TYPE = eINSTANCE.getNetworkType_Base_DataType();

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
		 * The meta object literal for the '<em><b>Microcontrollers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__MICROCONTROLLERS = eINSTANCE.getECU_Microcontrollers();

		/**
		 * The meta object literal for the '<em><b>Ecutype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__ECUTYPE = eINSTANCE.getECU_Ecutype();

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
		 * The meta object literal for the '<em><b>Cores</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__CORES = eINSTANCE.getMicrocontroller_Cores();

		/**
		 * The meta object literal for the '<em><b>Microcontrollertype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__MICROCONTROLLERTYPE = eINSTANCE.getMicrocontroller_Microcontrollertype();

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
		 * The meta object literal for the '<em><b>Coretype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__CORETYPE = eINSTANCE.getCore_Coretype();

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
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_TYPE__BASE_DATA_TYPE = eINSTANCE.getCoreType_Base_DataType();

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
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER_TYPE__BASE_DATA_TYPE = eINSTANCE.getMicrocontrollerType_Base_DataType();

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
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU_TYPE__BASE_DATA_TYPE = eINSTANCE.getECUType_Base_DataType();

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
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_TYPE__BASE_DATA_TYPE = eINSTANCE.getSystemType_Base_DataType();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType <em>QType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl#getQType()
		 * @generated
		 */
		EEnum QTYPE = eINSTANCE.getQType();

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
