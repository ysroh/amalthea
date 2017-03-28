/**
 */
package AMALTHEA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see AMALTHEA.AMALTHEAFactory
 * @model kind="package"
 * @generated
 */
public interface AMALTHEAPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AMALTHEA";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/2017/amalthea";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "AMALTHEA";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AMALTHEAPackage eINSTANCE = AMALTHEA.impl.AMALTHEAPackageImpl.init();

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.RunnableImpl <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.RunnableImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getRunnable()
	 * @generated
	 */
	int RUNNABLE = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link AMALTHEA.impl.ComponentsModelImpl <em>Components Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.ComponentsModelImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComponentsModel()
	 * @generated
	 */
	int COMPONENTS_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Components Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Components Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.HWModelImpl <em>HW Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.HWModelImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getHWModel()
	 * @generated
	 */
	int HW_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>HW Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>HW Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.OSModelImpl <em>OS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.OSModelImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getOSModel()
	 * @generated
	 */
	int OS_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>OS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>OS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.MappingModelImpl <em>Mapping Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.MappingModelImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getMappingModel()
	 * @generated
	 */
	int MAPPING_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.StimuliModelImpl <em>Stimuli Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.StimuliModelImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getStimuliModel()
	 * @generated
	 */
	int STIMULI_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_MODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Stimuli Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stimuli Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULI_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.SoftwareModelImpl <em>Software Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.SoftwareModelImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getSoftwareModel()
	 * @generated
	 */
	int SOFTWARE_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Software Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Software Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.ConstraintsModelImpl <em>Constraints Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.ConstraintsModelImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getConstraintsModel()
	 * @generated
	 */
	int CONSTRAINTS_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL__BASE_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Constraints Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraints Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.ComponentImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BASE_COMPONENT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.CompositeImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__BASE_CLASS = COMPONENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__IS_ENCAPSULATED = COMPONENT__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__BASE_COMPONENT = COMPONENT__BASE_COMPONENT;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE___GET_REFERENCES = COMPONENT___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE___GET_PARTS = COMPONENT___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE___GET_FLOW_PROPERTIES = COMPONENT___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.ComponentInstanceImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.ConnectorImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 11;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BASE_CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.QualifiedPortImpl <em>Qualified Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.QualifiedPortImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getQualifiedPort()
	 * @generated
	 */
	int QUALIFIED_PORT = 12;

	/**
	 * The feature id for the '<em><b>Base Connector End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT__BASE_CONNECTOR_END = 0;

	/**
	 * The number of structural features of the '<em>Qualified Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Qualified Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.IAnnotatableImpl <em>IAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.IAnnotatableImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getIAnnotatable()
	 * @generated
	 */
	int IANNOTATABLE = 14;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IANNOTATABLE__CUSTOM_PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>IAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IANNOTATABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>IAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IANNOTATABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.PortImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 13;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CUSTOM_PROPERTIES = IANNOTATABLE__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BASE_PORT = IANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = IANNOTATABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___COMPUTE_UNIQUE_NAME = IANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = IANNOTATABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.CustomPropertyImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getCustomProperty()
	 * @generated
	 */
	int CUSTOM_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Custom Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.FInterfacePortImpl <em>FInterface Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.FInterfacePortImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getFInterfacePort()
	 * @generated
	 */
	int FINTERFACE_PORT = 16;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__CUSTOM_PROPERTIES = PORT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__BASE_PORT = PORT__BASE_PORT;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__KIND = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FInterface Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT___COMPUTE_UNIQUE_NAME = PORT___COMPUTE_UNIQUE_NAME;

	/**
	 * The number of operations of the '<em>FInterface Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.CoreTypeImpl <em>Core Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.CoreTypeImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getCoreType()
	 * @generated
	 */
	int CORE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__BASE_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__BIT_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Instructions Per Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_TYPE__INSTRUCTIONS_PER_CYCLE = 2;

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
	 * The meta object id for the '{@link AMALTHEA.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.ComplexNodeImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComplexNode()
	 * @generated
	 */
	int COMPLEX_NODE = 19;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__QUARTZES = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE__PRESCALER = BlocksPackage.BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Complex Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_NODE_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link AMALTHEA.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.CoreImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getCore()
	 * @generated
	 */
	int CORE = 18;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Core Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__CORE_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lockstep Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__LOCKSTEP_GROUP = COMPLEX_NODE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link AMALTHEA.impl.QuartzImpl <em>Quartz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.QuartzImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getQuartz()
	 * @generated
	 */
	int QUARTZ = 20;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUARTZ__TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
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
	 * The meta object id for the '{@link AMALTHEA.impl.FrequencyImpl <em>Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.FrequencyImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getFrequency()
	 * @generated
	 */
	int FREQUENCY = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY__BASE_DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY___TO_STRING = 0;

	/**
	 * The number of operations of the '<em>Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.PrescalerImpl <em>Prescaler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.PrescalerImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getPrescaler()
	 * @generated
	 */
	int PRESCALER = 22;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__BASE_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Clock Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__CLOCK_RATIO = 1;

	/**
	 * The feature id for the '<em><b>Quartz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER__QUARTZ = 2;

	/**
	 * The number of structural features of the '<em>Prescaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Prescaler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCALER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.BusImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 23;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.NetworkTypeImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 24;

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
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BASE_CLASS = NETWORK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__IS_ENCAPSULATED = NETWORK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bus Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__BUS_TYPE = NETWORK_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = NETWORK_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___GET_REFERENCES = NETWORK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___GET_PARTS = NETWORK_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS___GET_FLOW_PROPERTIES = NETWORK_TYPE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = NETWORK_TYPE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link AMALTHEA.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.SystemTypeImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 25;

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
	 * The meta object id for the '{@link AMALTHEA.impl.ECUTypeImpl <em>ECU Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.ECUTypeImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getECUType()
	 * @generated
	 */
	int ECU_TYPE = 26;

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
	 * The meta object id for the '{@link AMALTHEA.impl.MicrocontrollerTypeImpl <em>Microcontroller Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.MicrocontrollerTypeImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getMicrocontrollerType()
	 * @generated
	 */
	int MICROCONTROLLER_TYPE = 27;

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
	 * The meta object id for the '{@link AMALTHEA.impl.HwSystemImpl <em>Hw System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.HwSystemImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getHwSystem()
	 * @generated
	 */
	int HW_SYSTEM = 28;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>System Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__SYSTEM_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ecus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__ECUS = COMPLEX_NODE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link AMALTHEA.impl.ECUImpl <em>ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.ECUImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getECU()
	 * @generated
	 */
	int ECU = 29;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Ecu Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__ECU_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Microcontrollers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__MICROCONTROLLERS = COMPLEX_NODE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link AMALTHEA.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.MicrocontrollerImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getMicrocontroller()
	 * @generated
	 */
	int MICROCONTROLLER = 30;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Microcontroller Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__MICROCONTROLLER_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__CORES = COMPLEX_NODE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link AMALTHEA.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.impl.NetworkImpl
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 31;

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
	 * The feature id for the '<em><b>Quartzes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__QUARTZES = COMPLEX_NODE__QUARTZES;

	/**
	 * The feature id for the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__PRESCALER = COMPLEX_NODE__PRESCALER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link AMALTHEA.InterfaceKind <em>Interface Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.InterfaceKind
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getInterfaceKind()
	 * @generated
	 */
	int INTERFACE_KIND = 32;

	/**
	 * The meta object id for the '{@link AMALTHEA.QType <em>QType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.QType
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getQType()
	 * @generated
	 */
	int QTYPE = 33;

	/**
	 * The meta object id for the '{@link AMALTHEA.SchedType <em>Sched Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.SchedType
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getSchedType()
	 * @generated
	 */
	int SCHED_TYPE = 34;

	/**
	 * The meta object id for the '{@link AMALTHEA.BusType <em>Bus Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.BusType
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getBusType()
	 * @generated
	 */
	int BUS_TYPE = 35;


	/**
	 * The meta object id for the '{@link AMALTHEA.FrequencyUnit <em>Frequency Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AMALTHEA.FrequencyUnit
	 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getFrequencyUnit()
	 * @generated
	 */
	int FREQUENCY_UNIT = 36;


	/**
	 * Returns the meta object for class '{@link AMALTHEA.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see AMALTHEA.Runnable
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.Runnable#isService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see AMALTHEA.Runnable#isService()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Service();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.ComponentsModel <em>Components Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components Model</em>'.
	 * @see AMALTHEA.ComponentsModel
	 * @generated
	 */
	EClass getComponentsModel();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.ComponentsModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see AMALTHEA.ComponentsModel#getBase_Model()
	 * @see #getComponentsModel()
	 * @generated
	 */
	EReference getComponentsModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.HWModel <em>HW Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Model</em>'.
	 * @see AMALTHEA.HWModel
	 * @generated
	 */
	EClass getHWModel();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.HWModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see AMALTHEA.HWModel#getBase_Model()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.OSModel <em>OS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Model</em>'.
	 * @see AMALTHEA.OSModel
	 * @generated
	 */
	EClass getOSModel();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.OSModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see AMALTHEA.OSModel#getBase_Model()
	 * @see #getOSModel()
	 * @generated
	 */
	EReference getOSModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Model</em>'.
	 * @see AMALTHEA.MappingModel
	 * @generated
	 */
	EClass getMappingModel();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.MappingModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see AMALTHEA.MappingModel#getBase_Model()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.StimuliModel <em>Stimuli Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimuli Model</em>'.
	 * @see AMALTHEA.StimuliModel
	 * @generated
	 */
	EClass getStimuliModel();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.StimuliModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see AMALTHEA.StimuliModel#getBase_Model()
	 * @see #getStimuliModel()
	 * @generated
	 */
	EReference getStimuliModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.SoftwareModel <em>Software Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Model</em>'.
	 * @see AMALTHEA.SoftwareModel
	 * @generated
	 */
	EClass getSoftwareModel();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.SoftwareModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see AMALTHEA.SoftwareModel#getBase_Model()
	 * @see #getSoftwareModel()
	 * @generated
	 */
	EReference getSoftwareModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.ConstraintsModel <em>Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Model</em>'.
	 * @see AMALTHEA.ConstraintsModel
	 * @generated
	 */
	EClass getConstraintsModel();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.ConstraintsModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see AMALTHEA.ConstraintsModel#getBase_Model()
	 * @see #getConstraintsModel()
	 * @generated
	 */
	EReference getConstraintsModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see AMALTHEA.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.Component#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see AMALTHEA.Component#getBase_Component()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Base_Component();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see AMALTHEA.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see AMALTHEA.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.ComponentInstance#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see AMALTHEA.ComponentInstance#getBase_Property()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Base_Property();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see AMALTHEA.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.Connector#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see AMALTHEA.Connector#getBase_Connector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Base_Connector();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.QualifiedPort <em>Qualified Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Port</em>'.
	 * @see AMALTHEA.QualifiedPort
	 * @generated
	 */
	EClass getQualifiedPort();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.QualifiedPort#getBase_ConnectorEnd <em>Base Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector End</em>'.
	 * @see AMALTHEA.QualifiedPort#getBase_ConnectorEnd()
	 * @see #getQualifiedPort()
	 * @generated
	 */
	EReference getQualifiedPort_Base_ConnectorEnd();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see AMALTHEA.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.Port#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see AMALTHEA.Port#getBase_Port()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Base_Port();

	/**
	 * Returns the meta object for the '{@link AMALTHEA.Port#computeUniqueName() <em>Compute Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Unique Name</em>' operation.
	 * @see AMALTHEA.Port#computeUniqueName()
	 * @generated
	 */
	EOperation getPort__ComputeUniqueName();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.IAnnotatable <em>IAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAnnotatable</em>'.
	 * @see AMALTHEA.IAnnotatable
	 * @generated
	 */
	EClass getIAnnotatable();

	/**
	 * Returns the meta object for the containment reference list '{@link AMALTHEA.IAnnotatable#getCustomProperties <em>Custom Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Properties</em>'.
	 * @see AMALTHEA.IAnnotatable#getCustomProperties()
	 * @see #getIAnnotatable()
	 * @generated
	 */
	EReference getIAnnotatable_CustomProperties();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.CustomProperty <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Property</em>'.
	 * @see AMALTHEA.CustomProperty
	 * @generated
	 */
	EClass getCustomProperty();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.CustomProperty#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see AMALTHEA.CustomProperty#getKey()
	 * @see #getCustomProperty()
	 * @generated
	 */
	EAttribute getCustomProperty_Key();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.CustomProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see AMALTHEA.CustomProperty#getValue()
	 * @see #getCustomProperty()
	 * @generated
	 */
	EReference getCustomProperty_Value();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.FInterfacePort <em>FInterface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FInterface Port</em>'.
	 * @see AMALTHEA.FInterfacePort
	 * @generated
	 */
	EClass getFInterfacePort();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.FInterfacePort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see AMALTHEA.FInterfacePort#getKind()
	 * @see #getFInterfacePort()
	 * @generated
	 */
	EAttribute getFInterfacePort_Kind();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.CoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Type</em>'.
	 * @see AMALTHEA.CoreType
	 * @generated
	 */
	EClass getCoreType();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.CoreType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AMALTHEA.CoreType#getBase_DataType()
	 * @see #getCoreType()
	 * @generated
	 */
	EReference getCoreType_Base_DataType();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.CoreType#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see AMALTHEA.CoreType#getBitWidth()
	 * @see #getCoreType()
	 * @generated
	 */
	EAttribute getCoreType_BitWidth();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.CoreType#getInstructionsPerCycle <em>Instructions Per Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions Per Cycle</em>'.
	 * @see AMALTHEA.CoreType#getInstructionsPerCycle()
	 * @see #getCoreType()
	 * @generated
	 */
	EAttribute getCoreType_InstructionsPerCycle();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see AMALTHEA.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.Core#getCoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Type</em>'.
	 * @see AMALTHEA.Core#getCoreType()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_CoreType();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.Core#getLockstepGroup <em>Lockstep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lockstep Group</em>'.
	 * @see AMALTHEA.Core#getLockstepGroup()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_LockstepGroup();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Node</em>'.
	 * @see AMALTHEA.ComplexNode
	 * @generated
	 */
	EClass getComplexNode();

	/**
	 * Returns the meta object for the containment reference list '{@link AMALTHEA.ComplexNode#getQuartzes <em>Quartzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quartzes</em>'.
	 * @see AMALTHEA.ComplexNode#getQuartzes()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Quartzes();

	/**
	 * Returns the meta object for the containment reference '{@link AMALTHEA.ComplexNode#getPrescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescaler</em>'.
	 * @see AMALTHEA.ComplexNode#getPrescaler()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Prescaler();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Quartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quartz</em>'.
	 * @see AMALTHEA.Quartz
	 * @generated
	 */
	EClass getQuartz();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.Quartz#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AMALTHEA.Quartz#getType()
	 * @see #getQuartz()
	 * @generated
	 */
	EAttribute getQuartz_Type();

	/**
	 * Returns the meta object for the containment reference '{@link AMALTHEA.Quartz#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see AMALTHEA.Quartz#getFrequency()
	 * @see #getQuartz()
	 * @generated
	 */
	EReference getQuartz_Frequency();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency</em>'.
	 * @see AMALTHEA.Frequency
	 * @generated
	 */
	EClass getFrequency();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.Frequency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see AMALTHEA.Frequency#getValue()
	 * @see #getFrequency()
	 * @generated
	 */
	EAttribute getFrequency_Value();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.Frequency#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AMALTHEA.Frequency#getBase_DataType()
	 * @see #getFrequency()
	 * @generated
	 */
	EReference getFrequency_Base_DataType();

	/**
	 * Returns the meta object for the '{@link AMALTHEA.Frequency#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see AMALTHEA.Frequency#toString()
	 * @generated
	 */
	EOperation getFrequency__ToString();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Prescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescaler</em>'.
	 * @see AMALTHEA.Prescaler
	 * @generated
	 */
	EClass getPrescaler();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.Prescaler#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AMALTHEA.Prescaler#getBase_DataType()
	 * @see #getPrescaler()
	 * @generated
	 */
	EReference getPrescaler_Base_DataType();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.Prescaler#getClockRatio <em>Clock Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Ratio</em>'.
	 * @see AMALTHEA.Prescaler#getClockRatio()
	 * @see #getPrescaler()
	 * @generated
	 */
	EAttribute getPrescaler_ClockRatio();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.Prescaler#getQuartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quartz</em>'.
	 * @see AMALTHEA.Prescaler#getQuartz()
	 * @see #getPrescaler()
	 * @generated
	 */
	EReference getPrescaler_Quartz();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see AMALTHEA.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.Bus#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Type</em>'.
	 * @see AMALTHEA.Bus#getBusType()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_BusType();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Type</em>'.
	 * @see AMALTHEA.NetworkType
	 * @generated
	 */
	EClass getNetworkType();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.NetworkType#getSchedPolicy <em>Sched Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sched Policy</em>'.
	 * @see AMALTHEA.NetworkType#getSchedPolicy()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_SchedPolicy();

	/**
	 * Returns the meta object for the attribute '{@link AMALTHEA.NetworkType#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see AMALTHEA.NetworkType#getBitWidth()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_BitWidth();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.NetworkType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AMALTHEA.NetworkType#getBase_DataType()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Base_DataType();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Type</em>'.
	 * @see AMALTHEA.SystemType
	 * @generated
	 */
	EClass getSystemType();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.SystemType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AMALTHEA.SystemType#getBase_DataType()
	 * @see #getSystemType()
	 * @generated
	 */
	EReference getSystemType_Base_DataType();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.ECUType <em>ECU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU Type</em>'.
	 * @see AMALTHEA.ECUType
	 * @generated
	 */
	EClass getECUType();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.ECUType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AMALTHEA.ECUType#getBase_DataType()
	 * @see #getECUType()
	 * @generated
	 */
	EReference getECUType_Base_DataType();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.MicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller Type</em>'.
	 * @see AMALTHEA.MicrocontrollerType
	 * @generated
	 */
	EClass getMicrocontrollerType();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.MicrocontrollerType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see AMALTHEA.MicrocontrollerType#getBase_DataType()
	 * @see #getMicrocontrollerType()
	 * @generated
	 */
	EReference getMicrocontrollerType_Base_DataType();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.HwSystem <em>Hw System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw System</em>'.
	 * @see AMALTHEA.HwSystem
	 * @generated
	 */
	EClass getHwSystem();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.HwSystem#getSystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Type</em>'.
	 * @see AMALTHEA.HwSystem#getSystemType()
	 * @see #getHwSystem()
	 * @generated
	 */
	EReference getHwSystem_SystemType();

	/**
	 * Returns the meta object for the containment reference list '{@link AMALTHEA.HwSystem#getEcus <em>Ecus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecus</em>'.
	 * @see AMALTHEA.HwSystem#getEcus()
	 * @see #getHwSystem()
	 * @generated
	 */
	EReference getHwSystem_Ecus();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU</em>'.
	 * @see AMALTHEA.ECU
	 * @generated
	 */
	EClass getECU();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.ECU#getEcuType <em>Ecu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecu Type</em>'.
	 * @see AMALTHEA.ECU#getEcuType()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_EcuType();

	/**
	 * Returns the meta object for the containment reference list '{@link AMALTHEA.ECU#getMicrocontrollers <em>Microcontrollers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microcontrollers</em>'.
	 * @see AMALTHEA.ECU#getMicrocontrollers()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Microcontrollers();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller</em>'.
	 * @see AMALTHEA.Microcontroller
	 * @generated
	 */
	EClass getMicrocontroller();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.Microcontroller#getMicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microcontroller Type</em>'.
	 * @see AMALTHEA.Microcontroller#getMicrocontrollerType()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_MicrocontrollerType();

	/**
	 * Returns the meta object for the containment reference '{@link AMALTHEA.Microcontroller#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cores</em>'.
	 * @see AMALTHEA.Microcontroller#getCores()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Cores();

	/**
	 * Returns the meta object for class '{@link AMALTHEA.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see AMALTHEA.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the reference '{@link AMALTHEA.Network#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see AMALTHEA.Network#getType()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Type();

	/**
	 * Returns the meta object for enum '{@link AMALTHEA.InterfaceKind <em>Interface Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Kind</em>'.
	 * @see AMALTHEA.InterfaceKind
	 * @generated
	 */
	EEnum getInterfaceKind();

	/**
	 * Returns the meta object for enum '{@link AMALTHEA.QType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>QType</em>'.
	 * @see AMALTHEA.QType
	 * @generated
	 */
	EEnum getQType();

	/**
	 * Returns the meta object for enum '{@link AMALTHEA.SchedType <em>Sched Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sched Type</em>'.
	 * @see AMALTHEA.SchedType
	 * @generated
	 */
	EEnum getSchedType();

	/**
	 * Returns the meta object for enum '{@link AMALTHEA.BusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Type</em>'.
	 * @see AMALTHEA.BusType
	 * @generated
	 */
	EEnum getBusType();

	/**
	 * Returns the meta object for enum '{@link AMALTHEA.FrequencyUnit <em>Frequency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency Unit</em>'.
	 * @see AMALTHEA.FrequencyUnit
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
	AMALTHEAFactory getAMALTHEAFactory();

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
		 * The meta object literal for the '{@link AMALTHEA.impl.RunnableImpl <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.RunnableImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getRunnable()
		 * @generated
		 */
		EClass RUNNABLE = eINSTANCE.getRunnable();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__SERVICE = eINSTANCE.getRunnable_Service();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.ComponentsModelImpl <em>Components Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.ComponentsModelImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComponentsModel()
		 * @generated
		 */
		EClass COMPONENTS_MODEL = eINSTANCE.getComponentsModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS_MODEL__BASE_MODEL = eINSTANCE.getComponentsModel_Base_Model();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.HWModelImpl <em>HW Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.HWModelImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getHWModel()
		 * @generated
		 */
		EClass HW_MODEL = eINSTANCE.getHWModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_MODEL__BASE_MODEL = eINSTANCE.getHWModel_Base_Model();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.OSModelImpl <em>OS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.OSModelImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getOSModel()
		 * @generated
		 */
		EClass OS_MODEL = eINSTANCE.getOSModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OS_MODEL__BASE_MODEL = eINSTANCE.getOSModel_Base_Model();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.MappingModelImpl <em>Mapping Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.MappingModelImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getMappingModel()
		 * @generated
		 */
		EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__BASE_MODEL = eINSTANCE.getMappingModel_Base_Model();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.StimuliModelImpl <em>Stimuli Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.StimuliModelImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getStimuliModel()
		 * @generated
		 */
		EClass STIMULI_MODEL = eINSTANCE.getStimuliModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STIMULI_MODEL__BASE_MODEL = eINSTANCE.getStimuliModel_Base_Model();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.SoftwareModelImpl <em>Software Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.SoftwareModelImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getSoftwareModel()
		 * @generated
		 */
		EClass SOFTWARE_MODEL = eINSTANCE.getSoftwareModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_MODEL__BASE_MODEL = eINSTANCE.getSoftwareModel_Base_Model();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.ConstraintsModelImpl <em>Constraints Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.ConstraintsModelImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getConstraintsModel()
		 * @generated
		 */
		EClass CONSTRAINTS_MODEL = eINSTANCE.getConstraintsModel();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_MODEL__BASE_MODEL = eINSTANCE.getConstraintsModel_Base_Model();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.ComponentImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BASE_COMPONENT = eINSTANCE.getComponent_Base_Component();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.CompositeImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.ComponentInstanceImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__BASE_PROPERTY = eINSTANCE.getComponentInstance_Base_Property();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.ConnectorImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__BASE_CONNECTOR = eINSTANCE.getConnector_Base_Connector();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.QualifiedPortImpl <em>Qualified Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.QualifiedPortImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getQualifiedPort()
		 * @generated
		 */
		EClass QUALIFIED_PORT = eINSTANCE.getQualifiedPort();

		/**
		 * The meta object literal for the '<em><b>Base Connector End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_PORT__BASE_CONNECTOR_END = eINSTANCE.getQualifiedPort_Base_ConnectorEnd();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.PortImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BASE_PORT = eINSTANCE.getPort_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Compute Unique Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORT___COMPUTE_UNIQUE_NAME = eINSTANCE.getPort__ComputeUniqueName();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.IAnnotatableImpl <em>IAnnotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.IAnnotatableImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getIAnnotatable()
		 * @generated
		 */
		EClass IANNOTATABLE = eINSTANCE.getIAnnotatable();

		/**
		 * The meta object literal for the '<em><b>Custom Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IANNOTATABLE__CUSTOM_PROPERTIES = eINSTANCE.getIAnnotatable_CustomProperties();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.CustomPropertyImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getCustomProperty()
		 * @generated
		 */
		EClass CUSTOM_PROPERTY = eINSTANCE.getCustomProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_PROPERTY__KEY = eINSTANCE.getCustomProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_PROPERTY__VALUE = eINSTANCE.getCustomProperty_Value();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.FInterfacePortImpl <em>FInterface Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.FInterfacePortImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getFInterfacePort()
		 * @generated
		 */
		EClass FINTERFACE_PORT = eINSTANCE.getFInterfacePort();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINTERFACE_PORT__KIND = eINSTANCE.getFInterfacePort_Kind();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.CoreTypeImpl <em>Core Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.CoreTypeImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getCoreType()
		 * @generated
		 */
		EClass CORE_TYPE = eINSTANCE.getCoreType();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_TYPE__BASE_DATA_TYPE = eINSTANCE.getCoreType_Base_DataType();

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
		 * The meta object literal for the '{@link AMALTHEA.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.CoreImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getCore()
		 * @generated
		 */
		EClass CORE = eINSTANCE.getCore();

		/**
		 * The meta object literal for the '<em><b>Core Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE__CORE_TYPE = eINSTANCE.getCore_CoreType();

		/**
		 * The meta object literal for the '<em><b>Lockstep Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__LOCKSTEP_GROUP = eINSTANCE.getCore_LockstepGroup();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.ComplexNodeImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getComplexNode()
		 * @generated
		 */
		EClass COMPLEX_NODE = eINSTANCE.getComplexNode();

		/**
		 * The meta object literal for the '<em><b>Quartzes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_NODE__QUARTZES = eINSTANCE.getComplexNode_Quartzes();

		/**
		 * The meta object literal for the '<em><b>Prescaler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_NODE__PRESCALER = eINSTANCE.getComplexNode_Prescaler();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.QuartzImpl <em>Quartz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.QuartzImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getQuartz()
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
		 * The meta object literal for the '<em><b>Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUARTZ__FREQUENCY = eINSTANCE.getQuartz_Frequency();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.FrequencyImpl <em>Frequency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.FrequencyImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getFrequency()
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
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY__BASE_DATA_TYPE = eINSTANCE.getFrequency_Base_DataType();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FREQUENCY___TO_STRING = eINSTANCE.getFrequency__ToString();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.PrescalerImpl <em>Prescaler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.PrescalerImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getPrescaler()
		 * @generated
		 */
		EClass PRESCALER = eINSTANCE.getPrescaler();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCALER__BASE_DATA_TYPE = eINSTANCE.getPrescaler_Base_DataType();

		/**
		 * The meta object literal for the '<em><b>Clock Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCALER__CLOCK_RATIO = eINSTANCE.getPrescaler_ClockRatio();

		/**
		 * The meta object literal for the '<em><b>Quartz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCALER__QUARTZ = eINSTANCE.getPrescaler_Quartz();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.BusImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getBus()
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
		 * The meta object literal for the '{@link AMALTHEA.impl.NetworkTypeImpl <em>Network Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.NetworkTypeImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getNetworkType()
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
		 * The meta object literal for the '{@link AMALTHEA.impl.SystemTypeImpl <em>System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.SystemTypeImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getSystemType()
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
		 * The meta object literal for the '{@link AMALTHEA.impl.ECUTypeImpl <em>ECU Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.ECUTypeImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getECUType()
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
		 * The meta object literal for the '{@link AMALTHEA.impl.MicrocontrollerTypeImpl <em>Microcontroller Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.MicrocontrollerTypeImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getMicrocontrollerType()
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
		 * The meta object literal for the '{@link AMALTHEA.impl.HwSystemImpl <em>Hw System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.HwSystemImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getHwSystem()
		 * @generated
		 */
		EClass HW_SYSTEM = eINSTANCE.getHwSystem();

		/**
		 * The meta object literal for the '<em><b>System Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_SYSTEM__SYSTEM_TYPE = eINSTANCE.getHwSystem_SystemType();

		/**
		 * The meta object literal for the '<em><b>Ecus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_SYSTEM__ECUS = eINSTANCE.getHwSystem_Ecus();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.ECUImpl <em>ECU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.ECUImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getECU()
		 * @generated
		 */
		EClass ECU = eINSTANCE.getECU();

		/**
		 * The meta object literal for the '<em><b>Ecu Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__ECU_TYPE = eINSTANCE.getECU_EcuType();

		/**
		 * The meta object literal for the '<em><b>Microcontrollers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__MICROCONTROLLERS = eINSTANCE.getECU_Microcontrollers();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.MicrocontrollerImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getMicrocontroller()
		 * @generated
		 */
		EClass MICROCONTROLLER = eINSTANCE.getMicrocontroller();

		/**
		 * The meta object literal for the '<em><b>Microcontroller Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__MICROCONTROLLER_TYPE = eINSTANCE.getMicrocontroller_MicrocontrollerType();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__CORES = eINSTANCE.getMicrocontroller_Cores();

		/**
		 * The meta object literal for the '{@link AMALTHEA.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.impl.NetworkImpl
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__TYPE = eINSTANCE.getNetwork_Type();

		/**
		 * The meta object literal for the '{@link AMALTHEA.InterfaceKind <em>Interface Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.InterfaceKind
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getInterfaceKind()
		 * @generated
		 */
		EEnum INTERFACE_KIND = eINSTANCE.getInterfaceKind();

		/**
		 * The meta object literal for the '{@link AMALTHEA.QType <em>QType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.QType
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getQType()
		 * @generated
		 */
		EEnum QTYPE = eINSTANCE.getQType();

		/**
		 * The meta object literal for the '{@link AMALTHEA.SchedType <em>Sched Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.SchedType
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getSchedType()
		 * @generated
		 */
		EEnum SCHED_TYPE = eINSTANCE.getSchedType();

		/**
		 * The meta object literal for the '{@link AMALTHEA.BusType <em>Bus Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.BusType
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getBusType()
		 * @generated
		 */
		EEnum BUS_TYPE = eINSTANCE.getBusType();

		/**
		 * The meta object literal for the '{@link AMALTHEA.FrequencyUnit <em>Frequency Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AMALTHEA.FrequencyUnit
		 * @see AMALTHEA.impl.AMALTHEAPackageImpl#getFrequencyUnit()
		 * @generated
		 */
		EEnum FREQUENCY_UNIT = eINSTANCE.getFrequencyUnit();

	}

} //AMALTHEAPackage
