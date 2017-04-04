/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter;
import org.eclipse.uml2.uml.DataType;

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
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CounterImpl#getBase_DataType <em>Base Data Type</em>}</li>
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
	 * The cached value of the '{@link #getBase_DataType() <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_DataType()
	 * @generated
	 * @ordered
	 */
	protected DataType base_DataType;

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
	public DataType getBase_DataType() {
		if (base_DataType != null && base_DataType.eIsProxy()) {
			InternalEObject oldBase_DataType = (InternalEObject)base_DataType;
			base_DataType = (DataType)eResolveProxy(oldBase_DataType);
			if (base_DataType != oldBase_DataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.COUNTER__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
			}
		}
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBase_DataType() {
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_DataType(DataType newBase_DataType) {
		DataType oldBase_DataType = base_DataType;
		base_DataType = newBase_DataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.COUNTER__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
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
			case CommonPackage.COUNTER__BASE_DATA_TYPE:
				if (resolve) return getBase_DataType();
				return basicGetBase_DataType();
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
			case CommonPackage.COUNTER__BASE_DATA_TYPE:
				setBase_DataType((DataType)newValue);
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
			case CommonPackage.COUNTER__BASE_DATA_TYPE:
				setBase_DataType((DataType)null);
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
			case CommonPackage.COUNTER__BASE_DATA_TYPE:
				return base_DataType != null;
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
