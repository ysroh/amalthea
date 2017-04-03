/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weibull Estimators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators#getPRemainPromille <em>PRemain Promille</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators#getMean <em>Mean</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getWeibullEstimators()
 * @model
 * @generated
 */
public interface WeibullEstimators extends Distribution {
	/**
	 * Returns the value of the '<em><b>PRemain Promille</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRemain Promille</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRemain Promille</em>' attribute.
	 * @see #setPRemainPromille(double)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getWeibullEstimators_PRemainPromille()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getPRemainPromille();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators#getPRemainPromille <em>PRemain Promille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRemain Promille</em>' attribute.
	 * @see #getPRemainPromille()
	 * @generated
	 */
	void setPRemainPromille(double value);

	/**
	 * Returns the value of the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean</em>' attribute.
	 * @see #setMean(int)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getWeibullEstimators_Mean()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMean();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators#getMean <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean</em>' attribute.
	 * @see #getMean()
	 * @generated
	 */
	void setMean(int value);

} // WeibullEstimators
