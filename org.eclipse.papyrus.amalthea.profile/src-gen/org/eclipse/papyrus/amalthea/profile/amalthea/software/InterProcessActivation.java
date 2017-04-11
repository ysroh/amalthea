/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Stimulus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inter Process Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation#getStimulus <em>Stimulus</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getInterProcessActivation()
 * @model
 * @generated
 */
public interface InterProcessActivation extends CallSequenceItem {
	/**
	 * Returns the value of the '<em><b>Stimulus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stimulus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stimulus</em>' reference.
	 * @see #setStimulus(Stimulus)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getInterProcessActivation_Stimulus()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Stimulus getStimulus();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation#getStimulus <em>Stimulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stimulus</em>' reference.
	 * @see #getStimulus()
	 * @generated
	 */
	void setStimulus(Stimulus value);

} // InterProcessActivation
