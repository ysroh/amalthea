/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

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
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.OperatingSystem#getTaskSchedulers <em>Task Schedulers</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.OperatingSystem#getInterruptControllers <em>Interrupt Controllers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getOperatingSystem()
 * @model
 * @generated
 */
public interface OperatingSystem extends Block, BaseObject {
	/**
	 * Returns the value of the '<em><b>Task Schedulers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Schedulers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Schedulers</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getOperatingSystem_TaskSchedulers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TaskScheduler> getTaskSchedulers();

	/**
	 * Returns the value of the '<em><b>Interrupt Controllers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interrupt Controllers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupt Controllers</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getOperatingSystem_InterruptControllers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InterruptController> getInterruptControllers();

} // OperatingSystem
