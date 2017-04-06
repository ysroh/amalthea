/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.Scheduler;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingUnit;

import org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulerImpl#getScheduleUnitPriority <em>Schedule Unit Priority</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulerImpl#getSchedulingunit <em>Schedulingunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SchedulerImpl extends BlockImpl implements Scheduler {
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
	 * The cached value of the '{@link #getSchedulingunit() <em>Schedulingunit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingunit()
	 * @generated
	 * @ordered
	 */
	protected SchedulingUnit schedulingunit;

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
	public SchedulingUnit getSchedulingunit() {
		if (schedulingunit != null && schedulingunit.eIsProxy()) {
			InternalEObject oldSchedulingunit = (InternalEObject)schedulingunit;
			schedulingunit = (SchedulingUnit)eResolveProxy(oldSchedulingunit);
			if (schedulingunit != oldSchedulingunit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsPackage.SCHEDULER__SCHEDULINGUNIT, oldSchedulingunit, schedulingunit));
			}
		}
		return schedulingunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingUnit basicGetSchedulingunit() {
		return schedulingunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingunit(SchedulingUnit newSchedulingunit) {
		SchedulingUnit oldSchedulingunit = schedulingunit;
		schedulingunit = newSchedulingunit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsPackage.SCHEDULER__SCHEDULINGUNIT, oldSchedulingunit, schedulingunit));
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
			case OsPackage.SCHEDULER__SCHEDULINGUNIT:
				if (resolve) return getSchedulingunit();
				return basicGetSchedulingunit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsPackage.SCHEDULER__SCHEDULE_UNIT_PRIORITY:
				setScheduleUnitPriority((Integer)newValue);
				return;
			case OsPackage.SCHEDULER__SCHEDULINGUNIT:
				setSchedulingunit((SchedulingUnit)newValue);
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
			case OsPackage.SCHEDULER__SCHEDULINGUNIT:
				setSchedulingunit((SchedulingUnit)null);
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
			case OsPackage.SCHEDULER__SCHEDULINGUNIT:
				return schedulingunit != null;
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
