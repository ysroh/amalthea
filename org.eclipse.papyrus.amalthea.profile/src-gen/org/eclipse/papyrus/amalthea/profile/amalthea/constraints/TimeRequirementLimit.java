/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.SignedTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit#getLimitValue <em>Limit Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#getTimeRequirementLimit()
 * @model
 * @generated
 */
public interface TimeRequirementLimit extends RequirementLimit {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeMetric}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeMetric
	 * @see #setMetric(TimeMetric)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#getTimeRequirementLimit_Metric()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimeMetric getMetric();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeMetric
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(TimeMetric value);

	/**
	 * Returns the value of the '<em><b>Limit Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit Value</em>' reference.
	 * @see #setLimitValue(SignedTime)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#getTimeRequirementLimit_LimitValue()
	 * @model ordered="false"
	 * @generated
	 */
	SignedTime getLimitValue();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit#getLimitValue <em>Limit Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit Value</em>' reference.
	 * @see #getLimitValue()
	 * @generated
	 */
	void setLimitValue(SignedTime value);

} // TimeRequirementLimit
