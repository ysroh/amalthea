/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.Scheduler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulerImpl#getScheduleUnitPriority <em>Schedule Unit Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SchedulerImpl extends MinimalEObjectImpl.Container implements Scheduler {
	/**
	 * The default value of the '{@link #getScheduleUnitPriority() <em>Schedule Unit Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleUnitPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int SCHEDULE_UNIT_PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScheduleUnitPriority() <em>Schedule Unit Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleUnitPriority()
	 * @generated
	 * @ordered
	 */
	protected int scheduleUnitPriority = SCHEDULE_UNIT_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsPackage.Literals.SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScheduleUnitPriority() {
		return scheduleUnitPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleUnitPriority(int newScheduleUnitPriority) {
		int oldScheduleUnitPriority = scheduleUnitPriority;
		scheduleUnitPriority = newScheduleUnitPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY, oldScheduleUnitPriority, scheduleUnitPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY:
				return getScheduleUnitPriority();
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
			case OsPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY:
				setScheduleUnitPriority((Integer)newValue);
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
			case OsPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY:
				setScheduleUnitPriority(SCHEDULE_UNIT_PRIORITY_EDEFAULT);
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
			case OsPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY:
				return scheduleUnitPriority != SCHEDULE_UNIT_PRIORITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scheduleUnitPriority: ");
		result.append(scheduleUnitPriority);
		result.append(')');
		return result.toString();
	}

} //SchedulerImpl
