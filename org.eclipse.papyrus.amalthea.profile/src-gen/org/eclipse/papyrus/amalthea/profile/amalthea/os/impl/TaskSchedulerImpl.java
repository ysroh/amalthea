/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskSchedulingAlgorithm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.TaskSchedulerImpl#getSchedulingalgorithm <em>Schedulingalgorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskSchedulerImpl extends SchedulerImpl implements TaskScheduler {
	/**
	 * The cached value of the '{@link #getSchedulingalgorithm() <em>Schedulingalgorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingalgorithm()
	 * @generated
	 * @ordered
	 */
	protected TaskSchedulingAlgorithm schedulingalgorithm;

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
		return OsPackage.Literals.TASK_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingAlgorithm getSchedulingalgorithm() {
		if (schedulingalgorithm != null && schedulingalgorithm.eIsProxy()) {
			InternalEObject oldSchedulingalgorithm = (InternalEObject)schedulingalgorithm;
			schedulingalgorithm = (TaskSchedulingAlgorithm)eResolveProxy(oldSchedulingalgorithm);
			if (schedulingalgorithm != oldSchedulingalgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsPackage.TASK_SCHEDULER__SCHEDULINGALGORITHM, oldSchedulingalgorithm, schedulingalgorithm));
			}
		}
		return schedulingalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSchedulingAlgorithm basicGetSchedulingalgorithm() {
		return schedulingalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingalgorithm(TaskSchedulingAlgorithm newSchedulingalgorithm) {
		TaskSchedulingAlgorithm oldSchedulingalgorithm = schedulingalgorithm;
		schedulingalgorithm = newSchedulingalgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsPackage.TASK_SCHEDULER__SCHEDULINGALGORITHM, oldSchedulingalgorithm, schedulingalgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsPackage.TASK_SCHEDULER__SCHEDULINGALGORITHM:
				if (resolve) return getSchedulingalgorithm();
				return basicGetSchedulingalgorithm();
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
			case OsPackage.TASK_SCHEDULER__SCHEDULINGALGORITHM:
				setSchedulingalgorithm((TaskSchedulingAlgorithm)newValue);
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
			case OsPackage.TASK_SCHEDULER__SCHEDULINGALGORITHM:
				setSchedulingalgorithm((TaskSchedulingAlgorithm)null);
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
			case OsPackage.TASK_SCHEDULER__SCHEDULINGALGORITHM:
				return schedulingalgorithm != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskSchedulerImpl
