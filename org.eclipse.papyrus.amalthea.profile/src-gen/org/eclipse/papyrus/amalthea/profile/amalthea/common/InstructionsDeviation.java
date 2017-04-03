/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructions Deviation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation#getDeviation <em>Deviation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getInstructionsDeviation()
 * @model
 * @generated
 */
public interface InstructionsDeviation extends Instructions {
	/**
	 * Returns the value of the '<em><b>Deviation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviation</em>' reference.
	 * @see #setDeviation(Deviation)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getInstructionsDeviation_Deviation()
	 * @model ordered="false"
	 * @generated
	 */
	Deviation getDeviation();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation#getDeviation <em>Deviation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviation</em>' reference.
	 * @see #getDeviation()
	 * @generated
	 */
	void setDeviation(Deviation value);

} // InstructionsDeviation
