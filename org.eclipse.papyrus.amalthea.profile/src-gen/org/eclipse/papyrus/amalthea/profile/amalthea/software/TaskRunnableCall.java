/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Runnable Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall#getRunnable <em>Runnable</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getTaskRunnableCall()
 * @model
 * @generated
 */
public interface TaskRunnableCall extends CallSequenceItem {
	/**
	 * Returns the value of the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runnable</em>' reference.
	 * @see #setRunnable(org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getTaskRunnableCall_Runnable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable getRunnable();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall#getRunnable <em>Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runnable</em>' reference.
	 * @see #getRunnable()
	 * @generated
	 */
	void setRunnable(org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable value);

} // TaskRunnableCall
