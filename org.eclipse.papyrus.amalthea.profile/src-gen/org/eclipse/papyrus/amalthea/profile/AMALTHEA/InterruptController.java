/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController#getInterruptSchedulingAlgorithm <em>Interrupt Scheduling Algorithm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getInterruptController()
 * @model
 * @generated
 */
public interface InterruptController extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Interrupt Scheduling Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupt Scheduling Algorithm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupt Scheduling Algorithm</em>' reference.
	 * @see #setInterruptSchedulingAlgorithm(InterruptSchedulingAlgorithm)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getInterruptController_InterruptSchedulingAlgorithm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InterruptSchedulingAlgorithm getInterruptSchedulingAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController#getInterruptSchedulingAlgorithm <em>Interrupt Scheduling Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupt Scheduling Algorithm</em>' reference.
	 * @see #getInterruptSchedulingAlgorithm()
	 * @generated
	 */
	void setInterruptSchedulingAlgorithm(InterruptSchedulingAlgorithm value);

} // InterruptController
