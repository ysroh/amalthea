/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interrupt Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController#getSchedulingalgorithm <em>Schedulingalgorithm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getInterruptController()
 * @model
 * @generated
 */
public interface InterruptController extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Schedulingalgorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulingalgorithm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulingalgorithm</em>' reference.
	 * @see #setSchedulingalgorithm(InterruptSchedulingAlgorithm)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getInterruptController_Schedulingalgorithm()
	 * @model ordered="false"
	 * @generated
	 */
	InterruptSchedulingAlgorithm getSchedulingalgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController#getSchedulingalgorithm <em>Schedulingalgorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedulingalgorithm</em>' reference.
	 * @see #getSchedulingalgorithm()
	 * @generated
	 */
	void setSchedulingalgorithm(InterruptSchedulingAlgorithm value);

} // InterruptController
