/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling HW Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingHWUnit#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getSchedulingHWUnit()
 * @model
 * @generated
 */
public interface SchedulingHWUnit extends BaseObject, SchedulingUnit {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' reference.
	 * @see #setDelay(Time)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getSchedulingHWUnit_Delay()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Time getDelay();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingHWUnit#getDelay <em>Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(Time value);

} // SchedulingHWUnit
