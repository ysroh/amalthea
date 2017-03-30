/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Scheduler#getScheduleUnitPriority <em>Schedule Unit Priority</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Scheduler#getSchedulingUnit <em>Scheduling Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getScheduler()
 * @model abstract="true"
 * @generated
 */
public interface Scheduler extends ReferableBaseObject {
	/**
	 * Returns the value of the '<em><b>Schedule Unit Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Unit Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Unit Priority</em>' attribute.
	 * @see #setScheduleUnitPriority(int)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getScheduler_ScheduleUnitPriority()
	 * @model default="0" required="true" ordered="false"
	 * @generated
	 */
	int getScheduleUnitPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Scheduler#getScheduleUnitPriority <em>Schedule Unit Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Unit Priority</em>' attribute.
	 * @see #getScheduleUnitPriority()
	 * @generated
	 */
	void setScheduleUnitPriority(int value);

	/**
	 * Returns the value of the '<em><b>Scheduling Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Unit</em>' reference.
	 * @see #setSchedulingUnit(SchedulingUnit)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getScheduler_SchedulingUnit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SchedulingUnit getSchedulingUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Scheduler#getSchedulingUnit <em>Scheduling Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Unit</em>' reference.
	 * @see #getSchedulingUnit()
	 * @generated
	 */
	void setSchedulingUnit(SchedulingUnit value);

} // Scheduler
