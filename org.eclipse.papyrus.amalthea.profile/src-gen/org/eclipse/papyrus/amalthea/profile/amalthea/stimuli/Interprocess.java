/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.stimuli;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interprocess</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Interprocess#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage#getInterprocess()
 * @model
 * @generated
 */
public interface Interprocess extends Stimulus {

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' reference.
	 * @see #setCounter(Counter)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage#getInterprocess_Counter()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Counter getCounter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Interprocess#getCounter <em>Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(Counter value);
} // Interprocess
