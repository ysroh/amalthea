/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.stimuli;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Single#getActivation <em>Activation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage#getSingle()
 * @model
 * @generated
 */
public interface Single extends Stimulus {
	/**
	 * Returns the value of the '<em><b>Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' reference.
	 * @see #setActivation(Time)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage#getSingle_Activation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Time getActivation();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Single#getActivation <em>Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' reference.
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(Time value);

} // Single
