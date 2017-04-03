/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deviation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getDeviation()
 * @model
 * @generated
 */
public interface Deviation extends EObject {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' reference.
	 * @see #setDistribution(Distribution)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getDeviation_Distribution()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Distribution getDistribution();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation#getDistribution <em>Distribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(Distribution value);

} // Deviation
