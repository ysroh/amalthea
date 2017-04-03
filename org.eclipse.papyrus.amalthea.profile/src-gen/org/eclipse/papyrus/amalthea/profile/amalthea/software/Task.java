/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Task#getPreemption <em>Preemption</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Task#getMultipleTaskActivationLimit <em>Multiple Task Activation Limit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends org.eclipse.papyrus.amalthea.profile.amalthea.software.Process {
	/**
	 * Returns the value of the '<em><b>Preemption</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preemption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preemption</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption
	 * @see #setPreemption(Preemption)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getTask_Preemption()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Preemption getPreemption();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Task#getPreemption <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preemption</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption
	 * @see #getPreemption()
	 * @generated
	 */
	void setPreemption(Preemption value);

	/**
	 * Returns the value of the '<em><b>Multiple Task Activation Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Task Activation Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Task Activation Limit</em>' attribute.
	 * @see #setMultipleTaskActivationLimit(int)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getTask_MultipleTaskActivationLimit()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getMultipleTaskActivationLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Task#getMultipleTaskActivationLimit <em>Multiple Task Activation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Task Activation Limit</em>' attribute.
	 * @see #getMultipleTaskActivationLimit()
	 * @generated
	 */
	void setMultipleTaskActivationLimit(int value);

} // Task
