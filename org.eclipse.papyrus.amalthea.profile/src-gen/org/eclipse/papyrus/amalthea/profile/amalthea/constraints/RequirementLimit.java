/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.RequirementLimit#getLimitType <em>Limit Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.RequirementLimit#getBase_DataType <em>Base Data Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#getRequirementLimit()
 * @model abstract="true"
 * @generated
 */
public interface RequirementLimit extends EObject {

	/**
	 * Returns the value of the '<em><b>Limit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.LimitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Type</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.LimitType
	 * @see #setLimitType(LimitType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#getRequirementLimit_LimitType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LimitType getLimitType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.RequirementLimit#getLimitType <em>Limit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Type</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.LimitType
	 * @see #getLimitType()
	 * @generated
	 */
	void setLimitType(LimitType value);

	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#getRequirementLimit_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.RequirementLimit#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);
} // RequirementLimit
