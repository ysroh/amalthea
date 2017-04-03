/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CounterImpl#getCounterOffset <em>Counter Offset</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CounterImpl#getCounterPrescaler <em>Counter Prescaler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CounterImpl extends MinimalEObjectImpl.Container implements Counter {
	/**
	 * The default value of the '{@link #getCounterOffset() <em>Counter Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTER_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCounterOffset() <em>Counter Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterOffset()
	 * @generated
	 * @ordered
	 */
	protected int counterOffset = COUNTER_OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounterPrescaler() <em>Counter Prescaler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterPrescaler()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTER_PRESCALER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCounterPrescaler() <em>Counter Prescaler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterPrescaler()
	 * @generated
	 * @ordered
	 */
	protected int counterPrescaler = COUNTER_PRESCALER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCounterOffset() {
		return counterOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterOffset(int newCounterOffset) {
		int oldCounterOffset = counterOffset;
		counterOffset = newCounterOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.COUNTER__COUNTER_OFFSET, oldCounterOffset, counterOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCounterPrescaler() {
		return counterPrescaler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterPrescaler(int newCounterPrescaler) {
		int oldCounterPrescaler = counterPrescaler;
		counterPrescaler = newCounterPrescaler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.COUNTER__COUNTER_PRESCALER, oldCounterPrescaler, counterPrescaler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.COUNTER__COUNTER_OFFSET:
				return getCounterOffset();
			case CommonPackage.COUNTER__COUNTER_PRESCALER:
				return getCounterPrescaler();
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
			case CommonPackage.COUNTER__COUNTER_OFFSET:
				setCounterOffset((Integer)newValue);
				return;
			case CommonPackage.COUNTER__COUNTER_PRESCALER:
				setCounterPrescaler((Integer)newValue);
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
			case CommonPackage.COUNTER__COUNTER_OFFSET:
				setCounterOffset(COUNTER_OFFSET_EDEFAULT);
				return;
			case CommonPackage.COUNTER__COUNTER_PRESCALER:
				setCounterPrescaler(COUNTER_PRESCALER_EDEFAULT);
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
			case CommonPackage.COUNTER__COUNTER_OFFSET:
				return counterOffset != COUNTER_OFFSET_EDEFAULT;
			case CommonPackage.COUNTER__COUNTER_PRESCALER:
				return counterPrescaler != COUNTER_PRESCALER_EDEFAULT;
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
		result.append(" (counterOffset: ");
		result.append(counterOffset);
		result.append(", counterPrescaler: ");
		result.append(counterPrescaler);
		result.append(')');
		return result.toString();
	}

} //CounterImpl
