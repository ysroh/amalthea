/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem#getTaskscheduler <em>Taskscheduler</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem#getInterruptcontroller <em>Interruptcontroller</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends Block {
	/**
	 * Returns the value of the '<em><b>Taskscheduler</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taskscheduler</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taskscheduler</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getOperatingSystem_Taskscheduler()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TaskScheduler> getTaskscheduler();

	/**
	 * Returns the value of the '<em><b>Interruptcontroller</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interruptcontroller</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interruptcontroller</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage#getOperatingSystem_Interruptcontroller()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InterruptController> getInterruptcontroller();

} // OperatingSystem
