/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hw System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HwSystemImpl#getSystemType <em>System Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.HwSystemImpl#getEcus <em>Ecus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HwSystemImpl extends ComplexNodeImpl implements HwSystem {
	/**
	 * The cached value of the '{@link #getSystemType() <em>System Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemType()
	 * @generated
	 * @ordered
	 */
	protected SystemType systemType;

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
		return AMALTHEAPackage.Literals.HW_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType getSystemType() {
		if (systemType != null && systemType.eIsProxy()) {
			InternalEObject oldSystemType = (InternalEObject)systemType;
			systemType = (SystemType)eResolveProxy(oldSystemType);
			if (systemType != oldSystemType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.HW_SYSTEM__SYSTEM_TYPE, oldSystemType, systemType));
			}
		}
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType basicGetSystemType() {
		return systemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemType(SystemType newSystemType) {
		SystemType oldSystemType = systemType;
		systemType = newSystemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.HW_SYSTEM__SYSTEM_TYPE, oldSystemType, systemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECU> getEcus() {
		if (ecus == null) {
			ecus = new EObjectResolvingEList<ECU>(ECU.class, this, AMALTHEAPackage.HW_SYSTEM__ECUS);
		}
		return ecus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.HW_SYSTEM__SYSTEM_TYPE:
				if (resolve) return getSystemType();
				return basicGetSystemType();
			case AMALTHEAPackage.HW_SYSTEM__ECUS:
				return getEcus();
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
			case AMALTHEAPackage.HW_SYSTEM__SYSTEM_TYPE:
				setSystemType((SystemType)newValue);
				return;
			case AMALTHEAPackage.HW_SYSTEM__ECUS:
				getEcus().clear();
				getEcus().addAll((Collection<? extends ECU>)newValue);
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
			case AMALTHEAPackage.HW_SYSTEM__SYSTEM_TYPE:
				setSystemType((SystemType)null);
				return;
			case AMALTHEAPackage.HW_SYSTEM__ECUS:
				getEcus().clear();
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
			case AMALTHEAPackage.HW_SYSTEM__SYSTEM_TYPE:
				return systemType != null;
			case AMALTHEAPackage.HW_SYSTEM__ECUS:
				return ecus != null && !ecus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HwSystemImpl
