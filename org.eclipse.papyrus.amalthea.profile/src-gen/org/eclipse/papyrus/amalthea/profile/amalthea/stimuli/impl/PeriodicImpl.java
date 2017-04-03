/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Time;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic;
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.PeriodicImpl#getRecurrence <em>Recurrence</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.PeriodicImpl#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicImpl extends StimulusImpl implements Periodic {
	/**
	 * The cached value of the '{@link #getRecurrence() <em>Recurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrence()
	 * @generated
	 * @ordered
	 */
	protected Time recurrence;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Time offset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StimuliPackage.Literals.PERIODIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getRecurrence() {
		if (recurrence != null && recurrence.eIsProxy()) {
			InternalEObject oldRecurrence = (InternalEObject)recurrence;
			recurrence = (Time)eResolveProxy(oldRecurrence);
			if (recurrence != oldRecurrence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StimuliPackage.PERIODIC__RECURRENCE, oldRecurrence, recurrence));
			}
		}
		return recurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetRecurrence() {
		return recurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecurrence(Time newRecurrence) {
		Time oldRecurrence = recurrence;
		recurrence = newRecurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StimuliPackage.PERIODIC__RECURRENCE, oldRecurrence, recurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getOffset() {
		if (offset != null && offset.eIsProxy()) {
			InternalEObject oldOffset = (InternalEObject)offset;
			offset = (Time)eResolveProxy(oldOffset);
			if (offset != oldOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StimuliPackage.PERIODIC__OFFSET, oldOffset, offset));
			}
		}
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Time newOffset) {
		Time oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StimuliPackage.PERIODIC__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StimuliPackage.PERIODIC__RECURRENCE:
				if (resolve) return getRecurrence();
				return basicGetRecurrence();
			case StimuliPackage.PERIODIC__OFFSET:
				if (resolve) return getOffset();
				return basicGetOffset();
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
			case StimuliPackage.PERIODIC__RECURRENCE:
				setRecurrence((Time)newValue);
				return;
			case StimuliPackage.PERIODIC__OFFSET:
				setOffset((Time)newValue);
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
			case StimuliPackage.PERIODIC__RECURRENCE:
				setRecurrence((Time)null);
				return;
			case StimuliPackage.PERIODIC__OFFSET:
				setOffset((Time)null);
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
			case StimuliPackage.PERIODIC__RECURRENCE:
				return recurrence != null;
			case StimuliPackage.PERIODIC__OFFSET:
				return offset != null;
		}
		return super.eIsSet(featureID);
	}

} //PeriodicImpl
