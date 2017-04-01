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

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.MicrocontrollerImpl#getMicrocontrollertype <em>Microcontrollertype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicrocontrollerImpl extends ComplexNodeImpl implements Microcontroller {
	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected EList<Core> cores;

	/**
	 * The cached value of the '{@link #getMicrocontrollertype() <em>Microcontrollertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrocontrollertype()
	 * @generated
	 * @ordered
	 */
	protected MicrocontrollerType microcontrollertype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicrocontrollerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.MICROCONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Core> getCores() {
		if (cores == null) {
			cores = new EObjectResolvingEList<Core>(Core.class, this, HardwarePackage.MICROCONTROLLER__CORES);
		}
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerType getMicrocontrollertype() {
		if (microcontrollertype != null && microcontrollertype.eIsProxy()) {
			InternalEObject oldMicrocontrollertype = (InternalEObject)microcontrollertype;
			microcontrollertype = (MicrocontrollerType)eResolveProxy(oldMicrocontrollertype);
			if (microcontrollertype != oldMicrocontrollertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePackage.MICROCONTROLLER__MICROCONTROLLERTYPE, oldMicrocontrollertype, microcontrollertype));
			}
		}
		return microcontrollertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerType basicGetMicrocontrollertype() {
		return microcontrollertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicrocontrollertype(MicrocontrollerType newMicrocontrollertype) {
		MicrocontrollerType oldMicrocontrollertype = microcontrollertype;
		microcontrollertype = newMicrocontrollertype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.MICROCONTROLLER__MICROCONTROLLERTYPE, oldMicrocontrollertype, microcontrollertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwarePackage.MICROCONTROLLER__CORES:
				return getCores();
			case HardwarePackage.MICROCONTROLLER__MICROCONTROLLERTYPE:
				if (resolve) return getMicrocontrollertype();
				return basicGetMicrocontrollertype();
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
			case HardwarePackage.MICROCONTROLLER__CORES:
				getCores().clear();
				getCores().addAll((Collection<? extends Core>)newValue);
				return;
			case HardwarePackage.MICROCONTROLLER__MICROCONTROLLERTYPE:
				setMicrocontrollertype((MicrocontrollerType)newValue);
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
			case HardwarePackage.MICROCONTROLLER__CORES:
				getCores().clear();
				return;
			case HardwarePackage.MICROCONTROLLER__MICROCONTROLLERTYPE:
				setMicrocontrollertype((MicrocontrollerType)null);
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
			case HardwarePackage.MICROCONTROLLER__CORES:
				return cores != null && !cores.isEmpty();
			case HardwarePackage.MICROCONTROLLER__MICROCONTROLLERTYPE:
				return microcontrollertype != null;
		}
		return super.eIsSet(featureID);
	}

} //MicrocontrollerImpl
