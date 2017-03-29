/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerImpl#getMicrocontrollerType <em>Microcontroller Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.MicrocontrollerImpl#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicrocontrollerImpl extends ComplexNodeImpl implements Microcontroller {
	/**
	 * The cached value of the '{@link #getMicrocontrollerType() <em>Microcontroller Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrocontrollerType()
	 * @generated
	 * @ordered
	 */
	protected MicrocontrollerType microcontrollerType;

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected Core cores;

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
		return AMALTHEAPackage.Literals.MICROCONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerType getMicrocontrollerType() {
		if (microcontrollerType != null && microcontrollerType.eIsProxy()) {
			InternalEObject oldMicrocontrollerType = (InternalEObject)microcontrollerType;
			microcontrollerType = (MicrocontrollerType)eResolveProxy(oldMicrocontrollerType);
			if (microcontrollerType != oldMicrocontrollerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE, oldMicrocontrollerType, microcontrollerType));
			}
		}
		return microcontrollerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicrocontrollerType basicGetMicrocontrollerType() {
		return microcontrollerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicrocontrollerType(MicrocontrollerType newMicrocontrollerType) {
		MicrocontrollerType oldMicrocontrollerType = microcontrollerType;
		microcontrollerType = newMicrocontrollerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE, oldMicrocontrollerType, microcontrollerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core getCores() {
		if (cores != null && cores.eIsProxy()) {
			InternalEObject oldCores = (InternalEObject)cores;
			cores = (Core)eResolveProxy(oldCores);
			if (cores != oldCores) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.MICROCONTROLLER__CORES, oldCores, cores));
			}
		}
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Core basicGetCores() {
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCores(Core newCores) {
		Core oldCores = cores;
		cores = newCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.MICROCONTROLLER__CORES, oldCores, cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE:
				if (resolve) return getMicrocontrollerType();
				return basicGetMicrocontrollerType();
			case AMALTHEAPackage.MICROCONTROLLER__CORES:
				if (resolve) return getCores();
				return basicGetCores();
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
			case AMALTHEAPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE:
				setMicrocontrollerType((MicrocontrollerType)newValue);
				return;
			case AMALTHEAPackage.MICROCONTROLLER__CORES:
				setCores((Core)newValue);
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
			case AMALTHEAPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE:
				setMicrocontrollerType((MicrocontrollerType)null);
				return;
			case AMALTHEAPackage.MICROCONTROLLER__CORES:
				setCores((Core)null);
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
			case AMALTHEAPackage.MICROCONTROLLER__MICROCONTROLLER_TYPE:
				return microcontrollerType != null;
			case AMALTHEAPackage.MICROCONTROLLER__CORES:
				return cores != null;
		}
		return super.eIsSet(featureID);
	}

} //MicrocontrollerImpl
