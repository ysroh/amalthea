/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.stimuli;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Time;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic#getRecurrence <em>Recurrence</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage#getPeriodic()
 * @model
 * @generated
 */
public interface Periodic extends Stimulus {
	/**
	 * Returns the value of the '<em><b>Recurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recurrence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrence</em>' reference.
	 * @see #setRecurrence(Time)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage#getPeriodic_Recurrence()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Time getRecurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic#getRecurrence <em>Recurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrence</em>' reference.
	 * @see #getRecurrence()
	 * @generated
	 */
	void setRecurrence(Time value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' reference.
	 * @see #setOffset(Time)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage#getPeriodic_Offset()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Time getOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic#getOffset <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Time value);

} // Periodic
