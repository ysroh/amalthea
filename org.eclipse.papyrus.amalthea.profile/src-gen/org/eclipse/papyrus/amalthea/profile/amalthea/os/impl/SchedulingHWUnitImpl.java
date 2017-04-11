/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Time;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingHWUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling HW Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.SchedulingHWUnitImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingHWUnitImpl extends SchedulingUnitImpl implements SchedulingHWUnit {
	/**
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected Time delay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingHWUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsPackage.Literals.SCHEDULING_HW_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getDelay() {
		if (delay != null && delay.eIsProxy()) {
			InternalEObject oldDelay = (InternalEObject)delay;
			delay = (Time)eResolveProxy(oldDelay);
			if (delay != oldDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsPackage.SCHEDULING_HW_UNIT__DELAY, oldDelay, delay));
			}
		}
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(Time newDelay) {
		Time oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsPackage.SCHEDULING_HW_UNIT__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsPackage.SCHEDULING_HW_UNIT__DELAY:
				if (resolve) return getDelay();
				return basicGetDelay();
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
			case OsPackage.SCHEDULING_HW_UNIT__DELAY:
				setDelay((Time)newValue);
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
			case OsPackage.SCHEDULING_HW_UNIT__DELAY:
				setDelay((Time)null);
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
			case OsPackage.SCHEDULING_HW_UNIT__DELAY:
				return delay != null;
		}
		return super.eIsSet(featureID);
	}

} //SchedulingHWUnitImpl
