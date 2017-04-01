/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HwSystemImpl#getEcus <em>Ecus</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HwSystemImpl#getSystemtype <em>Systemtype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwSystemImpl extends ComplexNodeImpl implements HwSystem {
	/**
	 * The cached value of the '{@link #getEcus() <em>Ecus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcus()
	 * @generated
	 * @ordered
	 */
	protected EList<ECU> ecus;

	/**
	 * The cached value of the '{@link #getSystemtype() <em>Systemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemtype()
	 * @generated
	 * @ordered
	 */
	protected SystemType systemtype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HwSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.HW_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECU> getEcus() {
		if (ecus == null) {
			ecus = new EObjectResolvingEList<ECU>(ECU.class, this, HardwarePackage.HW_SYSTEM__ECUS);
		}
		return ecus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType getSystemtype() {
		if (systemtype != null && systemtype.eIsProxy()) {
			InternalEObject oldSystemtype = (InternalEObject)systemtype;
			systemtype = (SystemType)eResolveProxy(oldSystemtype);
			if (systemtype != oldSystemtype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePackage.HW_SYSTEM__SYSTEMTYPE, oldSystemtype, systemtype));
			}
		}
		return systemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType basicGetSystemtype() {
		return systemtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemtype(SystemType newSystemtype) {
		SystemType oldSystemtype = systemtype;
		systemtype = newSystemtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.HW_SYSTEM__SYSTEMTYPE, oldSystemtype, systemtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwarePackage.HW_SYSTEM__ECUS:
				return getEcus();
			case HardwarePackage.HW_SYSTEM__SYSTEMTYPE:
				if (resolve) return getSystemtype();
				return basicGetSystemtype();
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
			case HardwarePackage.HW_SYSTEM__ECUS:
				getEcus().clear();
				getEcus().addAll((Collection<? extends ECU>)newValue);
				return;
			case HardwarePackage.HW_SYSTEM__SYSTEMTYPE:
				setSystemtype((SystemType)newValue);
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
			case HardwarePackage.HW_SYSTEM__ECUS:
				getEcus().clear();
				return;
			case HardwarePackage.HW_SYSTEM__SYSTEMTYPE:
				setSystemtype((SystemType)null);
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
			case HardwarePackage.HW_SYSTEM__ECUS:
				return ecus != null && !ecus.isEmpty();
			case HardwarePackage.HW_SYSTEM__SYSTEMTYPE:
				return systemtype != null;
		}
		return super.eIsSet(featureID);
	}

} //HwSystemImpl
