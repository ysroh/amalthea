/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

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
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAFactory
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
	AMALTHEAPackage eINSTANCE = org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.RunnableImpl <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.RunnableImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getRunnable()
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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.IAnnotatableImpl <em>IAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.IAnnotatableImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getIAnnotatable()
	 * @generated
	 */
	int IANNOTATABLE = 3;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.BaseObjectImpl <em>Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.BaseObjectImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getBaseObject()
	 * @generated
	 */
	int BASE_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT__CUSTOM_PROPERTIES = IANNOTATABLE__CUSTOM_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_FEATURE_COUNT = IANNOTATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_OBJECT_OPERATION_COUNT = IANNOTATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentsModelImpl <em>Components Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentsModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComponentsModel()
	 * @generated
	 */
	int COMPONENTS_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL__BASE_PACKAGE = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Components Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Components Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_MODEL_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CustomPropertyImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getCustomProperty()
	 * @generated
	 */
	int CUSTOM_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_PROPERTY__BASE_PROPERTY = 1;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HWModelImpl <em>HW Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HWModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getHWModel()
	 * @generated
	 */
	int HW_MODEL = 5;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.OSModelImpl <em>OS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.OSModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getOSModel()
	 * @generated
	 */
	int OS_MODEL = 6;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MappingModelImpl <em>Mapping Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MappingModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getMappingModel()
	 * @generated
	 */
	int MAPPING_MODEL = 7;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.StimuliModelImpl <em>Stimuli Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.StimuliModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getStimuliModel()
	 * @generated
	 */
	int STIMULI_MODEL = 8;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SoftwareModelImpl <em>Software Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SoftwareModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getSoftwareModel()
	 * @generated
	 */
	int SOFTWARE_MODEL = 9;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConstraintsModelImpl <em>Constraints Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConstraintsModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getConstraintsModel()
	 * @generated
	 */
	int CONSTRAINTS_MODEL = 10;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.IReferableImpl <em>IReferable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.IReferableImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getIReferable()
	 * @generated
	 */
	int IREFERABLE = 13;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE__UNIQUE_NAME = 1;

	/**
	 * The number of structural features of the '<em>IReferable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE___COMPUTE_UNIQUE_NAME = 0;

	/**
	 * The number of operations of the '<em>IReferable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ReferableBaseObjectImpl <em>Referable Base Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ReferableBaseObjectImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getReferableBaseObject()
	 * @generated
	 */
	int REFERABLE_BASE_OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT__BASE_NAMED_ELEMENT = IREFERABLE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT__UNIQUE_NAME = IREFERABLE__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES = IREFERABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referable Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT_FEATURE_COUNT = IREFERABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME = IREFERABLE___COMPUTE_UNIQUE_NAME;

	/**
	 * The number of operations of the '<em>Referable Base Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERABLE_BASE_OBJECT_OPERATION_COUNT = IREFERABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BASE_NAMED_ELEMENT = REFERABLE_BASE_OBJECT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BASE_CLASS = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_ENCAPSULATED = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BASE_COMPONENT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_REFERENCES = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_PARTS = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_FLOW_PROPERTIES = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CompositeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 14;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__BASE_NAMED_ELEMENT = COMPONENT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__UNIQUE_NAME = COMPONENT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CUSTOM_PROPERTIES = COMPONENT__CUSTOM_PROPERTIES;

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
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__CONNECTORS = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Grounded Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__GROUNDED_PORTS = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COMPONENT_INSTANCES = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inner Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__INNER_PORTS = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE___COMPUTE_UNIQUE_NAME = COMPONENT___COMPUTE_UNIQUE_NAME;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ISystemImpl <em>ISystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ISystemImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getISystem()
	 * @generated
	 */
	int ISYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__CONNECTORS = 0;

	/**
	 * The feature id for the '<em><b>Grounded Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__GROUNDED_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Component Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__COMPONENT_INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Inner Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM__INNER_PORTS = 3;

	/**
	 * The number of structural features of the '<em>ISystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>ISystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConnectorImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 16;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BASE_CONNECTOR = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__SOURCE_PORT = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TARGET_PORT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QualifiedPortImpl <em>Qualified Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QualifiedPortImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getQualifiedPort()
	 * @generated
	 */
	int QUALIFIED_PORT = 17;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT__CUSTOM_PROPERTIES = BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Base Connector End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT__BASE_CONNECTOR_END = BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT__INSTANCE = BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT__PORT = BASE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Qualified Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT_FEATURE_COUNT = BASE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Qualified Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_PORT_OPERATION_COUNT = BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentInstanceImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 18;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BASE_NAMED_ELEMENT = REFERABLE_BASE_OBJECT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BASE_PROPERTY = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PortImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 19;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BASE_NAMED_ELEMENT = REFERABLE_BASE_OBJECT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__UNIQUE_NAME = REFERABLE_BASE_OBJECT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CUSTOM_PROPERTIES = REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BASE_PORT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = REFERABLE_BASE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Compute Unique Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___COMPUTE_UNIQUE_NAME = REFERABLE_BASE_OBJECT___COMPUTE_UNIQUE_NAME;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = REFERABLE_BASE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.FInterfacePortImpl <em>FInterface Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.FInterfacePortImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getFInterfacePort()
	 * @generated
	 */
	int FINTERFACE_PORT = 20;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__BASE_NAMED_ELEMENT = PORT__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Unique Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__UNIQUE_NAME = PORT__UNIQUE_NAME;

	/**
	 * The feature id for the '<em><b>Custom Properties</b></em>' reference list.
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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CoreTypeImpl <em>Core Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CoreTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getCoreType()
	 * @generated
	 */
	int CORE_TYPE = 21;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComplexNodeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComplexNode()
	 * @generated
	 */
	int COMPLEX_NODE = 23;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CoreImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getCore()
	 * @generated
	 */
	int CORE = 22;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QuartzImpl <em>Quartz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QuartzImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getQuartz()
	 * @generated
	 */
	int QUARTZ = 24;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.FrequencyImpl <em>Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.FrequencyImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getFrequency()
	 * @generated
	 */
	int FREQUENCY = 25;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PrescalerImpl <em>Prescaler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PrescalerImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getPrescaler()
	 * @generated
	 */
	int PRESCALER = 26;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.NetworkImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 27;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.NetworkTypeImpl <em>Network Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.NetworkTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getNetworkType()
	 * @generated
	 */
	int NETWORK_TYPE = 28;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.BusImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 29;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SystemTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 30;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ECUTypeImpl <em>ECU Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ECUTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getECUType()
	 * @generated
	 */
	int ECU_TYPE = 31;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerTypeImpl <em>Microcontroller Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerTypeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getMicrocontrollerType()
	 * @generated
	 */
	int MICROCONTROLLER_TYPE = 32;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HwSystemImpl <em>Hw System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HwSystemImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getHwSystem()
	 * @generated
	 */
	int HW_SYSTEM = 33;

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
	 * The feature id for the '<em><b>System Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HW_SYSTEM__SYSTEM_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ecus</b></em>' reference list.
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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ECUImpl <em>ECU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ECUImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getECU()
	 * @generated
	 */
	int ECU = 34;

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
	 * The feature id for the '<em><b>Ecu Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECU__ECU_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Microcontrollers</b></em>' reference list.
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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerImpl
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getMicrocontroller()
	 * @generated
	 */
	int MICROCONTROLLER = 35;

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
	 * The feature id for the '<em><b>Microcontroller Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROCONTROLLER__MICROCONTROLLER_TYPE = COMPLEX_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' reference.
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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind <em>Interface Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getInterfaceKind()
	 * @generated
	 */
	int INTERFACE_KIND = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType <em>QType</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getQType()
	 * @generated
	 */
	int QTYPE = 37;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedType <em>Sched Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedType
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getSchedType()
	 * @generated
	 */
	int SCHED_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType <em>Bus Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getBusType()
	 * @generated
	 */
	int BUS_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit <em>Frequency Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getFrequencyUnit()
	 * @generated
	 */
	int FREQUENCY_UNIT = 40;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable#isService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable#isService()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentsModel <em>Components Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentsModel
	 * @generated
	 */
	EClass getComponentsModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentsModel#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentsModel#getBase_Package()
	 * @see #getComponentsModel()
	 * @generated
	 */
	EReference getComponentsModel_Base_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.BaseObject <em>Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Object</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.BaseObject
	 * @generated
	 */
	EClass getBaseObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable <em>IAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAnnotatable</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable
	 * @generated
	 */
	EClass getIAnnotatable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable#getCustomProperties <em>Custom Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Custom Properties</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable#getCustomProperties()
	 * @see #getIAnnotatable()
	 * @generated
	 */
	EReference getIAnnotatable_CustomProperties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Property</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty
	 * @generated
	 */
	EClass getCustomProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty#getKey()
	 * @see #getCustomProperty()
	 * @generated
	 */
	EAttribute getCustomProperty_Key();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty#getBase_Property()
	 * @see #getCustomProperty()
	 * @generated
	 */
	EReference getCustomProperty_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HWModel <em>HW Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HW Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.HWModel
	 * @generated
	 */
	EClass getHWModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HWModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.HWModel#getBase_Model()
	 * @see #getHWModel()
	 * @generated
	 */
	EReference getHWModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSModel <em>OS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSModel
	 * @generated
	 */
	EClass getOSModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSModel#getBase_Model()
	 * @see #getOSModel()
	 * @generated
	 */
	EReference getOSModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.MappingModel
	 * @generated
	 */
	EClass getMappingModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.MappingModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.MappingModel#getBase_Model()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.StimuliModel <em>Stimuli Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimuli Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.StimuliModel
	 * @generated
	 */
	EClass getStimuliModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.StimuliModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.StimuliModel#getBase_Model()
	 * @see #getStimuliModel()
	 * @generated
	 */
	EReference getStimuliModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SoftwareModel <em>Software Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SoftwareModel
	 * @generated
	 */
	EClass getSoftwareModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SoftwareModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SoftwareModel#getBase_Model()
	 * @see #getSoftwareModel()
	 * @generated
	 */
	EReference getSoftwareModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel <em>Constraints Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel
	 * @generated
	 */
	EClass getConstraintsModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel#getBase_Model()
	 * @see #getConstraintsModel()
	 * @generated
	 */
	EReference getConstraintsModel_Base_Model();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component#getBase_Component()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ReferableBaseObject <em>Referable Base Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referable Base Object</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ReferableBaseObject
	 * @generated
	 */
	EClass getReferableBaseObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable <em>IReferable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReferable</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable
	 * @generated
	 */
	EClass getIReferable();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable#getBase_NamedElement()
	 * @see #getIReferable()
	 * @generated
	 */
	EReference getIReferable_Base_NamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable#getUniqueName <em>Unique Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Name</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable#getUniqueName()
	 * @see #getIReferable()
	 * @generated
	 */
	EAttribute getIReferable_UniqueName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable#computeUniqueName() <em>Compute Unique Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Unique Name</em>' operation.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable#computeUniqueName()
	 * @generated
	 */
	EOperation getIReferable__ComputeUniqueName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem <em>ISystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISystem</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem
	 * @generated
	 */
	EClass getISystem();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectors</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getConnectors()
	 * @see #getISystem()
	 * @generated
	 */
	EReference getISystem_Connectors();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getGroundedPorts <em>Grounded Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Grounded Ports</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getGroundedPorts()
	 * @see #getISystem()
	 * @generated
	 */
	EReference getISystem_GroundedPorts();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component Instances</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getComponentInstances()
	 * @see #getISystem()
	 * @generated
	 */
	EReference getISystem_ComponentInstances();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getInnerPorts <em>Inner Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inner Ports</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getInnerPorts()
	 * @see #getISystem()
	 * @generated
	 */
	EReference getISystem_InnerPorts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector#getBase_Connector()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Base_Connector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector#getSourcePort <em>Source Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Port</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector#getSourcePort()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_SourcePort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector#getTargetPort <em>Target Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Port</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector#getTargetPort()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_TargetPort();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort <em>Qualified Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Port</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort
	 * @generated
	 */
	EClass getQualifiedPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getBase_ConnectorEnd <em>Base Connector End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector End</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getBase_ConnectorEnd()
	 * @see #getQualifiedPort()
	 * @generated
	 */
	EReference getQualifiedPort_Base_ConnectorEnd();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getInstance()
	 * @see #getQualifiedPort()
	 * @generated
	 */
	EReference getQualifiedPort_Instance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getPort()
	 * @see #getQualifiedPort()
	 * @generated
	 */
	EReference getQualifiedPort_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance#getBase_Property()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port#getBase_Port()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort <em>FInterface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FInterface Port</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort
	 * @generated
	 */
	EClass getFInterfacePort();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort#getKind()
	 * @see #getFInterfacePort()
	 * @generated
	 */
	EAttribute getFInterfacePort_Kind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType
	 * @generated
	 */
	EClass getCoreType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType#getBase_DataType()
	 * @see #getCoreType()
	 * @generated
	 */
	EReference getCoreType_Base_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType#getBitWidth()
	 * @see #getCoreType()
	 * @generated
	 */
	EAttribute getCoreType_BitWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType#getInstructionsPerCycle <em>Instructions Per Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructions Per Cycle</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType#getInstructionsPerCycle()
	 * @see #getCoreType()
	 * @generated
	 */
	EAttribute getCoreType_InstructionsPerCycle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core#getCoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core#getCoreType()
	 * @see #getCore()
	 * @generated
	 */
	EReference getCore_CoreType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core#getLockstepGroup <em>Lockstep Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lockstep Group</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core#getLockstepGroup()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_LockstepGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Node</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode
	 * @generated
	 */
	EClass getComplexNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getQuartzes <em>Quartzes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quartzes</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getQuartzes()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Quartzes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getPrescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescaler</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getPrescaler()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Prescaler();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Networks</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getNetworks()
	 * @see #getComplexNode()
	 * @generated
	 */
	EReference getComplexNode_Networks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quartz</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz
	 * @generated
	 */
	EClass getQuartz();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz#getType()
	 * @see #getQuartz()
	 * @generated
	 */
	EAttribute getQuartz_Type();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frequency</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz#getFrequency()
	 * @see #getQuartz()
	 * @generated
	 */
	EReference getQuartz_Frequency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency
	 * @generated
	 */
	EClass getFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency#getValue()
	 * @see #getFrequency()
	 * @generated
	 */
	EAttribute getFrequency_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency#getBase_DataType()
	 * @see #getFrequency()
	 * @generated
	 */
	EReference getFrequency_Base_DataType();

	/**
	 * Returns the meta object for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency#toString()
	 * @generated
	 */
	EOperation getFrequency__ToString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescaler</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler
	 * @generated
	 */
	EClass getPrescaler();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler#getBase_DataType()
	 * @see #getPrescaler()
	 * @generated
	 */
	EReference getPrescaler_Base_DataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler#getClockRatio <em>Clock Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Ratio</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler#getClockRatio()
	 * @see #getPrescaler()
	 * @generated
	 */
	EAttribute getPrescaler_ClockRatio();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler#getQuartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quartz</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler#getQuartz()
	 * @see #getPrescaler()
	 * @generated
	 */
	EReference getPrescaler_Quartz();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network#getType()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType
	 * @generated
	 */
	EClass getNetworkType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType#getSchedPolicy <em>Sched Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sched Policy</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType#getSchedPolicy()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_SchedPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType#getBitWidth()
	 * @see #getNetworkType()
	 * @generated
	 */
	EAttribute getNetworkType_BitWidth();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType#getBase_DataType()
	 * @see #getNetworkType()
	 * @generated
	 */
	EReference getNetworkType_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus#getBusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus#getBusType()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_BusType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType
	 * @generated
	 */
	EClass getSystemType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType#getBase_DataType()
	 * @see #getSystemType()
	 * @generated
	 */
	EReference getSystemType_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType <em>ECU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType
	 * @generated
	 */
	EClass getECUType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType#getBase_DataType()
	 * @see #getECUType()
	 * @generated
	 */
	EReference getECUType_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType
	 * @generated
	 */
	EClass getMicrocontrollerType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType#getBase_DataType()
	 * @see #getMicrocontrollerType()
	 * @generated
	 */
	EReference getMicrocontrollerType_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem <em>Hw System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hw System</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem
	 * @generated
	 */
	EClass getHwSystem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem#getSystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem#getSystemType()
	 * @see #getHwSystem()
	 * @generated
	 */
	EReference getHwSystem_SystemType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem#getEcus <em>Ecus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ecus</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem#getEcus()
	 * @see #getHwSystem()
	 * @generated
	 */
	EReference getHwSystem_Ecus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECU</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU
	 * @generated
	 */
	EClass getECU();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU#getEcuType <em>Ecu Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecu Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU#getEcuType()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_EcuType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU#getMicrocontrollers <em>Microcontrollers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Microcontrollers</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU#getMicrocontrollers()
	 * @see #getECU()
	 * @generated
	 */
	EReference getECU_Microcontrollers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microcontroller</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller
	 * @generated
	 */
	EClass getMicrocontroller();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller#getMicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microcontroller Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller#getMicrocontrollerType()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_MicrocontrollerType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cores</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller#getCores()
	 * @see #getMicrocontroller()
	 * @generated
	 */
	EReference getMicrocontroller_Cores();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind <em>Interface Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Kind</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind
	 * @generated
	 */
	EEnum getInterfaceKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>QType</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType
	 * @generated
	 */
	EEnum getQType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedType <em>Sched Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sched Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedType
	 * @generated
	 */
	EEnum getSchedType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType <em>Bus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bus Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType
	 * @generated
	 */
	EEnum getBusType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit <em>Frequency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency Unit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.RunnableImpl <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.RunnableImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getRunnable()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentsModelImpl <em>Components Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentsModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComponentsModel()
		 * @generated
		 */
		EClass COMPONENTS_MODEL = eINSTANCE.getComponentsModel();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS_MODEL__BASE_PACKAGE = eINSTANCE.getComponentsModel_Base_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.BaseObjectImpl <em>Base Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.BaseObjectImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getBaseObject()
		 * @generated
		 */
		EClass BASE_OBJECT = eINSTANCE.getBaseObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.IAnnotatableImpl <em>IAnnotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.IAnnotatableImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getIAnnotatable()
		 * @generated
		 */
		EClass IANNOTATABLE = eINSTANCE.getIAnnotatable();

		/**
		 * The meta object literal for the '<em><b>Custom Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IANNOTATABLE__CUSTOM_PROPERTIES = eINSTANCE.getIAnnotatable_CustomProperties();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CustomPropertyImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getCustomProperty()
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
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_PROPERTY__BASE_PROPERTY = eINSTANCE.getCustomProperty_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HWModelImpl <em>HW Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HWModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getHWModel()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.OSModelImpl <em>OS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.OSModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getOSModel()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MappingModelImpl <em>Mapping Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MappingModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getMappingModel()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.StimuliModelImpl <em>Stimuli Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.StimuliModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getStimuliModel()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SoftwareModelImpl <em>Software Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SoftwareModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getSoftwareModel()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConstraintsModelImpl <em>Constraints Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConstraintsModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getConstraintsModel()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComponent()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ReferableBaseObjectImpl <em>Referable Base Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ReferableBaseObjectImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getReferableBaseObject()
		 * @generated
		 */
		EClass REFERABLE_BASE_OBJECT = eINSTANCE.getReferableBaseObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.IReferableImpl <em>IReferable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.IReferableImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getIReferable()
		 * @generated
		 */
		EClass IREFERABLE = eINSTANCE.getIReferable();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IREFERABLE__BASE_NAMED_ELEMENT = eINSTANCE.getIReferable_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Unique Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IREFERABLE__UNIQUE_NAME = eINSTANCE.getIReferable_UniqueName();

		/**
		 * The meta object literal for the '<em><b>Compute Unique Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IREFERABLE___COMPUTE_UNIQUE_NAME = eINSTANCE.getIReferable__ComputeUniqueName();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CompositeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ISystemImpl <em>ISystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ISystemImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getISystem()
		 * @generated
		 */
		EClass ISYSTEM = eINSTANCE.getISystem();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISYSTEM__CONNECTORS = eINSTANCE.getISystem_Connectors();

		/**
		 * The meta object literal for the '<em><b>Grounded Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISYSTEM__GROUNDED_PORTS = eINSTANCE.getISystem_GroundedPorts();

		/**
		 * The meta object literal for the '<em><b>Component Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISYSTEM__COMPONENT_INSTANCES = eINSTANCE.getISystem_ComponentInstances();

		/**
		 * The meta object literal for the '<em><b>Inner Ports</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISYSTEM__INNER_PORTS = eINSTANCE.getISystem_InnerPorts();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConnectorImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getConnector()
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
		 * The meta object literal for the '<em><b>Source Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__SOURCE_PORT = eINSTANCE.getConnector_SourcePort();

		/**
		 * The meta object literal for the '<em><b>Target Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TARGET_PORT = eINSTANCE.getConnector_TargetPort();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QualifiedPortImpl <em>Qualified Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QualifiedPortImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getQualifiedPort()
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
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_PORT__INSTANCE = eINSTANCE.getQualifiedPort_Instance();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALIFIED_PORT__PORT = eINSTANCE.getQualifiedPort_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentInstanceImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComponentInstance()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PortImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getPort()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.FInterfacePortImpl <em>FInterface Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.FInterfacePortImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getFInterfacePort()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CoreTypeImpl <em>Core Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CoreTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getCoreType()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CoreImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getCore()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComplexNodeImpl <em>Complex Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComplexNodeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getComplexNode()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QuartzImpl <em>Quartz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QuartzImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getQuartz()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.FrequencyImpl <em>Frequency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.FrequencyImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getFrequency()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PrescalerImpl <em>Prescaler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PrescalerImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getPrescaler()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.NetworkImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getNetwork()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.NetworkTypeImpl <em>Network Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.NetworkTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getNetworkType()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.BusImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getBus()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SystemTypeImpl <em>System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SystemTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getSystemType()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ECUTypeImpl <em>ECU Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ECUTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getECUType()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerTypeImpl <em>Microcontroller Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerTypeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getMicrocontrollerType()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HwSystemImpl <em>Hw System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HwSystemImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getHwSystem()
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
		 * The meta object literal for the '<em><b>Ecus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HW_SYSTEM__ECUS = eINSTANCE.getHwSystem_Ecus();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ECUImpl <em>ECU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ECUImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getECU()
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
		 * The meta object literal for the '<em><b>Microcontrollers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECU__MICROCONTROLLERS = eINSTANCE.getECU_Microcontrollers();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerImpl <em>Microcontroller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerImpl
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getMicrocontroller()
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
		 * The meta object literal for the '<em><b>Cores</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROCONTROLLER__CORES = eINSTANCE.getMicrocontroller_Cores();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind <em>Interface Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getInterfaceKind()
		 * @generated
		 */
		EEnum INTERFACE_KIND = eINSTANCE.getInterfaceKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType <em>QType</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getQType()
		 * @generated
		 */
		EEnum QTYPE = eINSTANCE.getQType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedType <em>Sched Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedType
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getSchedType()
		 * @generated
		 */
		EEnum SCHED_TYPE = eINSTANCE.getSchedType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType <em>Bus Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getBusType()
		 * @generated
		 */
		EEnum BUS_TYPE = eINSTANCE.getBusType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit <em>Frequency Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit
		 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AMALTHEAPackageImpl#getFrequencyUnit()
		 * @generated
		 */
		EEnum FREQUENCY_UNIT = eINSTANCE.getFrequencyUnit();

	}

} //AMALTHEAPackage
