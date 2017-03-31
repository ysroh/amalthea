/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkTypeImpl#getSchedPolicy <em>Sched Policy</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.NetworkTypeImpl#getBitWidth <em>Bit Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkTypeImpl extends MinimalEObjectImpl.Container implements NetworkType {
	/**
	 * The default value of the '{@link #getSchedPolicy() <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedType SCHED_POLICY_EDEFAULT = SchedType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getSchedPolicy() <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedType schedPolicy = SCHED_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BIT_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected int bitWidth = BIT_WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.NETWORK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedType getSchedPolicy() {
		return schedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedPolicy(SchedType newSchedPolicy) {
		SchedType oldSchedPolicy = schedPolicy;
		schedPolicy = newSchedPolicy == null ? SCHED_POLICY_EDEFAULT : newSchedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.NETWORK_TYPE__SCHED_POLICY, oldSchedPolicy, schedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBitWidth() {
		return bitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitWidth(int newBitWidth) {
		int oldBitWidth = bitWidth;
		bitWidth = newBitWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.NETWORK_TYPE__BIT_WIDTH, oldBitWidth, bitWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwarePackage.NETWORK_TYPE__SCHED_POLICY:
				return getSchedPolicy();
			case HardwarePackage.NETWORK_TYPE__BIT_WIDTH:
				return getBitWidth();
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
			case HardwarePackage.NETWORK_TYPE__SCHED_POLICY:
				setSchedPolicy((SchedType)newValue);
				return;
			case HardwarePackage.NETWORK_TYPE__BIT_WIDTH:
				setBitWidth((Integer)newValue);
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
			case HardwarePackage.NETWORK_TYPE__SCHED_POLICY:
				setSchedPolicy(SCHED_POLICY_EDEFAULT);
				return;
			case HardwarePackage.NETWORK_TYPE__BIT_WIDTH:
				setBitWidth(BIT_WIDTH_EDEFAULT);
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
			case HardwarePackage.NETWORK_TYPE__SCHED_POLICY:
				return schedPolicy != SCHED_POLICY_EDEFAULT;
			case HardwarePackage.NETWORK_TYPE__BIT_WIDTH:
				return bitWidth != BIT_WIDTH_EDEFAULT;
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
		result.append(" (schedPolicy: ");
		result.append(schedPolicy);
		result.append(", bitWidth: ");
		result.append(bitWidth);
		result.append(')');
		return result.toString();
	}

} //NetworkTypeImpl
