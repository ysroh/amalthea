/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler#getSchedulingalgorithm <em>Schedulingalgorithm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getTaskScheduler()
 * @model
 * @generated
 */
public interface TaskScheduler extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Schedulingalgorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedulingalgorithm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedulingalgorithm</em>' reference.
	 * @see #setSchedulingalgorithm(TaskSchedulingAlgorithm)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getTaskScheduler_Schedulingalgorithm()
	 * @model ordered="false"
	 * @generated
	 */
	TaskSchedulingAlgorithm getSchedulingalgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler#getSchedulingalgorithm <em>Schedulingalgorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedulingalgorithm</em>' reference.
	 * @see #getSchedulingalgorithm()
	 * @generated
	 */
	void setSchedulingalgorithm(TaskSchedulingAlgorithm value);

} // TaskScheduler
