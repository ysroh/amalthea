/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Scheduler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SchedulerImpl#getScheduleUnitPriority <em>Schedule Unit Priority</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SchedulerImpl#getSchedulingUnit <em>Scheduling Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SchedulerImpl extends ReferableBaseObjectImpl implements Scheduler {
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
	 * The cached value of the '{@link #getSchedulingUnit() <em>Scheduling Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingUnit()
	 * @generated
	 * @ordered
	 */
	protected SchedulingUnit schedulingUnit;

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
		return AMALTHEAPackage.Literals.SCHEDULER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY, oldScheduleUnitPriority, scheduleUnitPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingUnit getSchedulingUnit() {
		if (schedulingUnit != null && schedulingUnit.eIsProxy()) {
			InternalEObject oldSchedulingUnit = (InternalEObject)schedulingUnit;
			schedulingUnit = (SchedulingUnit)eResolveProxy(oldSchedulingUnit);
			if (schedulingUnit != oldSchedulingUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.SCHEDULER__SCHEDULING_UNIT, oldSchedulingUnit, schedulingUnit));
			}
		}
		return schedulingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingUnit basicGetSchedulingUnit() {
		return schedulingUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingUnit(SchedulingUnit newSchedulingUnit) {
		SchedulingUnit oldSchedulingUnit = schedulingUnit;
		schedulingUnit = newSchedulingUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.SCHEDULER__SCHEDULING_UNIT, oldSchedulingUnit, schedulingUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY:
				return getScheduleUnitPriority();
			case AMALTHEAPackage.SCHEDULER__SCHEDULING_UNIT:
				if (resolve) return getSchedulingUnit();
				return basicGetSchedulingUnit();
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
			case AMALTHEAPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY:
				setScheduleUnitPriority((Integer)newValue);
				return;
			case AMALTHEAPackage.SCHEDULER__SCHEDULING_UNIT:
				setSchedulingUnit((SchedulingUnit)newValue);
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
			case AMALTHEAPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY:
				setScheduleUnitPriority(SCHEDULE_UNIT_PRIORITY_EDEFAULT);
				return;
			case AMALTHEAPackage.SCHEDULER__SCHEDULING_UNIT:
				setSchedulingUnit((SchedulingUnit)null);
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
			case AMALTHEAPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY:
				return scheduleUnitPriority != SCHEDULE_UNIT_PRIORITY_EDEFAULT;
			case AMALTHEAPackage.SCHEDULER__SCHEDULING_UNIT:
				return schedulingUnit != null;
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
