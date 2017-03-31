/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.Scheduler#getScheduleUnitPriority <em>Schedule Unit Priority</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getScheduler()
 * @model abstract="true"
 * @generated
 */
public interface Scheduler extends EObject {
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
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getScheduler_ScheduleUnitPriority()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getScheduleUnitPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.Scheduler#getScheduleUnitPriority <em>Schedule Unit Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Unit Priority</em>' attribute.
	 * @see #getScheduleUnitPriority()
	 * @generated
	 */
	void setScheduleUnitPriority(int value);

} // Scheduler
