/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Bus;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.BusType;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.BusImpl#getBusType <em>Bus Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusImpl extends NetworkTypeImpl implements Bus {
	/**
	 * The default value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected static final BusType BUS_TYPE_EDEFAULT = BusType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getBusType() <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusType()
	 * @generated
	 * @ordered
	 */
	protected BusType busType = BUS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusType getBusType() {
		return busType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusType(BusType newBusType) {
		BusType oldBusType = busType;
		busType = newBusType == null ? BUS_TYPE_EDEFAULT : newBusType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.BUS__BUS_TYPE, oldBusType, busType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwarePackage.BUS__BUS_TYPE:
				return getBusType();
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
			case HardwarePackage.BUS__BUS_TYPE:
				setBusType((BusType)newValue);
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
			case HardwarePackage.BUS__BUS_TYPE:
				setBusType(BUS_TYPE_EDEFAULT);
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
			case HardwarePackage.BUS__BUS_TYPE:
				return busType != BUS_TYPE_EDEFAULT;
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
		result.append(" (busType: ");
		result.append(busType);
		result.append(')');
		return result.toString();
	}

} //BusImpl
