/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Time;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling HW Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingHWUnit#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getSchedulingHWUnit()
 * @model
 * @generated
 */
public interface SchedulingHWUnit extends SchedulingUnit {

	/**
	 * Returns the value of the '<em><b>Time</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' reference.
	 * @see #setTime(Time)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getSchedulingHWUnit_Time()
	 * @model ordered="false"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingHWUnit#getTime <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);
} // SchedulingHWUnit
