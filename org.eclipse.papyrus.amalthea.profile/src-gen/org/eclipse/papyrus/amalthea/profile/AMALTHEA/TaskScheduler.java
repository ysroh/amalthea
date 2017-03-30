/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler#getTaskSchedulingAlgorithm <em>Task Scheduling Algorithm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getTaskScheduler()
 * @model
 * @generated
 */
public interface TaskScheduler extends Scheduler {
	/**
	 * Returns the value of the '<em><b>Task Scheduling Algorithm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Scheduling Algorithm</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Scheduling Algorithm</em>' reference.
	 * @see #setTaskSchedulingAlgorithm(TaskSchedulingAlgorithm)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getTaskScheduler_TaskSchedulingAlgorithm()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TaskSchedulingAlgorithm getTaskSchedulingAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler#getTaskSchedulingAlgorithm <em>Task Scheduling Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Scheduling Algorithm</em>' reference.
	 * @see #getTaskSchedulingAlgorithm()
	 * @generated
	 */
	void setTaskSchedulingAlgorithm(TaskSchedulingAlgorithm value);

} // TaskScheduler
