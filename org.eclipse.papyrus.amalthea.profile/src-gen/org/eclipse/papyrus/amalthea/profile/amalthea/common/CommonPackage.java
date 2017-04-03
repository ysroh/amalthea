/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CommonModel'"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/2017/Amalthea/Common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CustomPropertyImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getCustomProperty()
	 * @generated
	 */
	int CUSTOM_PROPERTY = 0;

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
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.AbstractTimeImpl <em>Abstract Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.AbstractTimeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getAbstractTime()
	 * @generated
	 */
	int ABSTRACT_TIME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME__UNIT = 1;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME__BASE_DATA_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Abstract Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.TimeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__VALUE = ABSTRACT_TIME__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__UNIT = ABSTRACT_TIME__UNIT;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__BASE_DATA_TYPE = ABSTRACT_TIME__BASE_DATA_TYPE;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = ABSTRACT_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OPERATION_COUNT = ABSTRACT_TIME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.IAnnotatableImpl <em>IAnnotatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.IAnnotatableImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getIAnnotatable()
	 * @generated
	 */
	int IANNOTATABLE = 3;

	/**
	 * The number of structural features of the '<em>IAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IANNOTATABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IAnnotatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IANNOTATABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.InstructionsImpl <em>Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.InstructionsImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getInstructions()
	 * @generated
	 */
	int INSTRUCTIONS = 4;

	/**
	 * The number of structural features of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DeviationImpl <em>Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DeviationImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getDeviation()
	 * @generated
	 */
	int DEVIATION = 5;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION__DISTRIBUTION = 0;

	/**
	 * The number of structural features of the '<em>Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DistributionImpl <em>Distribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DistributionImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getDistribution()
	 * @generated
	 */
	int DISTRIBUTION = 6;

	/**
	 * The number of structural features of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Distribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.WeibullEstimatorsImpl <em>Weibull Estimators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.WeibullEstimatorsImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getWeibullEstimators()
	 * @generated
	 */
	int WEIBULL_ESTIMATORS = 7;

	/**
	 * The feature id for the '<em><b>PRemain Promille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_ESTIMATORS__PREMAIN_PROMILLE = DISTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_ESTIMATORS__MEAN = DISTRIBUTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weibull Estimators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_ESTIMATORS_FEATURE_COUNT = DISTRIBUTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Weibull Estimators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEIBULL_ESTIMATORS_OPERATION_COUNT = DISTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.InstructionsDeviationImpl <em>Instructions Deviation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.InstructionsDeviationImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getInstructionsDeviation()
	 * @generated
	 */
	int INSTRUCTIONS_DEVIATION = 8;

	/**
	 * The feature id for the '<em><b>Deviation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_DEVIATION__DEVIATION = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instructions Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_DEVIATION_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instructions Deviation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_DEVIATION_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CounterImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 9;

	/**
	 * The feature id for the '<em><b>Counter Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__COUNTER_OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Counter Prescaler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__COUNTER_PRESCALER = 1;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DataSizeImpl <em>Data Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DataSizeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getDataSize()
	 * @generated
	 */
	int DATA_SIZE = 10;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.TimeUnit
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.DataUnit <em>Data Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.DataUnit
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getDataUnit()
	 * @generated
	 */
	int DATA_UNIT = 12;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.CustomProperty <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Property</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CustomProperty
	 * @generated
	 */
	EClass getCustomProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.CustomProperty#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CustomProperty#getKey()
	 * @see #getCustomProperty()
	 * @generated
	 */
	EAttribute getCustomProperty_Key();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.CustomProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CustomProperty#getBase_Property()
	 * @see #getCustomProperty()
	 * @generated
	 */
	EReference getCustomProperty_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime <em>Abstract Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Time</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime
	 * @generated
	 */
	EClass getAbstractTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getValue()
	 * @see #getAbstractTime()
	 * @generated
	 */
	EAttribute getAbstractTime_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getUnit()
	 * @see #getAbstractTime()
	 * @generated
	 */
	EAttribute getAbstractTime_Unit();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getBase_DataType()
	 * @see #getAbstractTime()
	 * @generated
	 */
	EReference getAbstractTime_Base_DataType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.IAnnotatable <em>IAnnotatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAnnotatable</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.IAnnotatable
	 * @generated
	 */
	EClass getIAnnotatable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.Instructions
	 * @generated
	 */
	EClass getInstructions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deviation</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation
	 * @generated
	 */
	EClass getDeviation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Distribution</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation#getDistribution()
	 * @see #getDeviation()
	 * @generated
	 */
	EReference getDeviation_Distribution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Distribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distribution</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.Distribution
	 * @generated
	 */
	EClass getDistribution();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators <em>Weibull Estimators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weibull Estimators</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators
	 * @generated
	 */
	EClass getWeibullEstimators();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators#getPRemainPromille <em>PRemain Promille</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PRemain Promille</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators#getPRemainPromille()
	 * @see #getWeibullEstimators()
	 * @generated
	 */
	EAttribute getWeibullEstimators_PRemainPromille();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators#getMean()
	 * @see #getWeibullEstimators()
	 * @generated
	 */
	EAttribute getWeibullEstimators_Mean();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation <em>Instructions Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions Deviation</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation
	 * @generated
	 */
	EClass getInstructionsDeviation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation#getDeviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deviation</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation#getDeviation()
	 * @see #getInstructionsDeviation()
	 * @generated
	 */
	EReference getInstructionsDeviation_Deviation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter#getCounterOffset <em>Counter Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Offset</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter#getCounterOffset()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_CounterOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter#getCounterPrescaler <em>Counter Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Prescaler</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter#getCounterPrescaler()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_CounterPrescaler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.DataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Size</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.DataSize
	 * @generated
	 */
	EClass getDataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.DataSize#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.DataSize#getUnit()
	 * @see #getDataSize()
	 * @generated
	 */
	EAttribute getDataSize_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.DataSize#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.DataSize#getValue()
	 * @see #getDataSize()
	 * @generated
	 */
	EAttribute getDataSize_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.DataUnit <em>Data Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Unit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.DataUnit
	 * @generated
	 */
	EEnum getDataUnit();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CustomPropertyImpl <em>Custom Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CustomPropertyImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getCustomProperty()
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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.AbstractTimeImpl <em>Abstract Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.AbstractTimeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getAbstractTime()
		 * @generated
		 */
		EClass ABSTRACT_TIME = eINSTANCE.getAbstractTime();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TIME__VALUE = eINSTANCE.getAbstractTime_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_TIME__UNIT = eINSTANCE.getAbstractTime_Unit();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TIME__BASE_DATA_TYPE = eINSTANCE.getAbstractTime_Base_DataType();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.TimeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.IAnnotatableImpl <em>IAnnotatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.IAnnotatableImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getIAnnotatable()
		 * @generated
		 */
		EClass IANNOTATABLE = eINSTANCE.getIAnnotatable();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.InstructionsImpl <em>Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.InstructionsImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getInstructions()
		 * @generated
		 */
		EClass INSTRUCTIONS = eINSTANCE.getInstructions();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DeviationImpl <em>Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DeviationImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getDeviation()
		 * @generated
		 */
		EClass DEVIATION = eINSTANCE.getDeviation();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVIATION__DISTRIBUTION = eINSTANCE.getDeviation_Distribution();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DistributionImpl <em>Distribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DistributionImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getDistribution()
		 * @generated
		 */
		EClass DISTRIBUTION = eINSTANCE.getDistribution();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.WeibullEstimatorsImpl <em>Weibull Estimators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.WeibullEstimatorsImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getWeibullEstimators()
		 * @generated
		 */
		EClass WEIBULL_ESTIMATORS = eINSTANCE.getWeibullEstimators();

		/**
		 * The meta object literal for the '<em><b>PRemain Promille</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIBULL_ESTIMATORS__PREMAIN_PROMILLE = eINSTANCE.getWeibullEstimators_PRemainPromille();

		/**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEIBULL_ESTIMATORS__MEAN = eINSTANCE.getWeibullEstimators_Mean();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.InstructionsDeviationImpl <em>Instructions Deviation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.InstructionsDeviationImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getInstructionsDeviation()
		 * @generated
		 */
		EClass INSTRUCTIONS_DEVIATION = eINSTANCE.getInstructionsDeviation();

		/**
		 * The meta object literal for the '<em><b>Deviation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTIONS_DEVIATION__DEVIATION = eINSTANCE.getInstructionsDeviation_Deviation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CounterImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();

		/**
		 * The meta object literal for the '<em><b>Counter Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__COUNTER_OFFSET = eINSTANCE.getCounter_CounterOffset();

		/**
		 * The meta object literal for the '<em><b>Counter Prescaler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__COUNTER_PRESCALER = eINSTANCE.getCounter_CounterPrescaler();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DataSizeImpl <em>Data Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DataSizeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getDataSize()
		 * @generated
		 */
		EClass DATA_SIZE = eINSTANCE.getDataSize();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SIZE__UNIT = eINSTANCE.getDataSize_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SIZE__VALUE = eINSTANCE.getDataSize_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.TimeUnit
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.DataUnit <em>Data Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.DataUnit
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl#getDataUnit()
		 * @generated
		 */
		EEnum DATA_UNIT = eINSTANCE.getDataUnit();

	}

} //CommonPackage
