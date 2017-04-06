/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConstraintsModel'"
 * @generated
 */
public interface ConstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/2017/Amalthea/Constraints";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Constraints";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintsPackage eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsModelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getConstraintsModel()
	 * @generated
	 */
	int CONSTRAINTS_MODEL = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_MODEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SEVERITY = 0;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ProcessRequirementImpl <em>Process Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ProcessRequirementImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getProcessRequirement()
	 * @generated
	 */
	int PROCESS_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT__SEVERITY = REQUIREMENT__SEVERITY;

	/**
	 * The number of structural features of the '<em>Process Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementLimitImpl <em>Requirement Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementLimitImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getRequirementLimit()
	 * @generated
	 */
	int REQUIREMENT_LIMIT = 3;

	/**
	 * The number of structural features of the '<em>Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_LIMIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_LIMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.TimeRequirementLimitImpl <em>Time Requirement Limit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.TimeRequirementLimitImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getTimeRequirementLimit()
	 * @generated
	 */
	int TIME_REQUIREMENT_LIMIT = 4;

	/**
	 * The number of structural features of the '<em>Time Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REQUIREMENT_LIMIT_FEATURE_COUNT = REQUIREMENT_LIMIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Requirement Limit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REQUIREMENT_LIMIT_OPERATION_COUNT = REQUIREMENT_LIMIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Severity
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsModel
	 * @generated
	 */
	EClass getConstraintsModel();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Requirement#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Requirement#getSeverity()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Severity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement <em>Process Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Requirement</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement
	 * @generated
	 */
	EClass getProcessRequirement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.RequirementLimit <em>Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Limit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.RequirementLimit
	 * @generated
	 */
	EClass getRequirementLimit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit <em>Time Requirement Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Requirement Limit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit
	 * @generated
	 */
	EClass getTimeRequirementLimit();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintsFactory getConstraintsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsModelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getConstraintsModel()
		 * @generated
		 */
		EClass CONSTRAINTS_MODEL = eINSTANCE.getConstraintsModel();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();
		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SEVERITY = eINSTANCE.getRequirement_Severity();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ProcessRequirementImpl <em>Process Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ProcessRequirementImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getProcessRequirement()
		 * @generated
		 */
		EClass PROCESS_REQUIREMENT = eINSTANCE.getProcessRequirement();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementLimitImpl <em>Requirement Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementLimitImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getRequirementLimit()
		 * @generated
		 */
		EClass REQUIREMENT_LIMIT = eINSTANCE.getRequirementLimit();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.TimeRequirementLimitImpl <em>Time Requirement Limit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.TimeRequirementLimitImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getTimeRequirementLimit()
		 * @generated
		 */
		EClass TIME_REQUIREMENT_LIMIT = eINSTANCE.getTimeRequirementLimit();
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Severity
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

	}

} //ConstraintsPackage
