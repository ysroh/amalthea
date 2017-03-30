/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskSchedulingAlgorithm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.TaskSchedulerImpl#getTaskSchedulingAlgorithm <em>Task Scheduling Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskSchedulerImpl extends SchedulerImpl implements TaskScheduler {
	/**
	 * The cached value of the '{@link #getTaskSchedulingAlgorithm() <em>Task Scheduling Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSchedulingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected TaskSchedulingAlgorithm taskSchedulingAlgorithm;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskSchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.TASK_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingAlgorithm getTaskSchedulingAlgorithm() {
		if (taskSchedulingAlgorithm != null && taskSchedulingAlgorithm.eIsProxy()) {
			InternalEObject oldTaskSchedulingAlgorithm = (InternalEObject)taskSchedulingAlgorithm;
			taskSchedulingAlgorithm = (TaskSchedulingAlgorithm)eResolveProxy(oldTaskSchedulingAlgorithm);
			if (taskSchedulingAlgorithm != oldTaskSchedulingAlgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.TASK_SCHEDULER__TASK_SCHEDULING_ALGORITHM, oldTaskSchedulingAlgorithm, taskSchedulingAlgorithm));
			}
		}
		return taskSchedulingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingAlgorithm basicGetTaskSchedulingAlgorithm() {
		return taskSchedulingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskSchedulingAlgorithm(TaskSchedulingAlgorithm newTaskSchedulingAlgorithm) {
		TaskSchedulingAlgorithm oldTaskSchedulingAlgorithm = taskSchedulingAlgorithm;
		taskSchedulingAlgorithm = newTaskSchedulingAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.TASK_SCHEDULER__TASK_SCHEDULING_ALGORITHM, oldTaskSchedulingAlgorithm, taskSchedulingAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.TASK_SCHEDULER__TASK_SCHEDULING_ALGORITHM:
				if (resolve) return getTaskSchedulingAlgorithm();
				return basicGetTaskSchedulingAlgorithm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AMALTHEAPackage.TASK_SCHEDULER__TASK_SCHEDULING_ALGORITHM:
				setTaskSchedulingAlgorithm((TaskSchedulingAlgorithm)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AMALTHEAPackage.TASK_SCHEDULER__TASK_SCHEDULING_ALGORITHM:
				setTaskSchedulingAlgorithm((TaskSchedulingAlgorithm)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AMALTHEAPackage.TASK_SCHEDULER__TASK_SCHEDULING_ALGORITHM:
				return taskSchedulingAlgorithm != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskSchedulerImpl
