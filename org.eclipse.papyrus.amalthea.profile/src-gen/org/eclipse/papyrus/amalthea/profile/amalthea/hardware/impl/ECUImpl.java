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
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUImpl#getMicrocontrollers <em>Microcontrollers</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ECUImpl#getEcutype <em>Ecutype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECUImpl extends ComplexNodeImpl implements ECU {
	/**
	 * The cached value of the '{@link #getMicrocontrollers() <em>Microcontrollers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicrocontrollers()
	 * @generated
	 * @ordered
	 */
	protected EList<Microcontroller> microcontrollers;

	/**
	 * The cached value of the '{@link #getEcutype() <em>Ecutype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcutype()
	 * @generated
	 * @ordered
	 */
	protected ECUType ecutype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.ECU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Microcontroller> getMicrocontrollers() {
		if (microcontrollers == null) {
			microcontrollers = new EObjectResolvingEList<Microcontroller>(Microcontroller.class, this, HardwarePackage.ECU__MICROCONTROLLERS);
		}
		return microcontrollers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECUType getEcutype() {
		if (ecutype != null && ecutype.eIsProxy()) {
			InternalEObject oldEcutype = (InternalEObject)ecutype;
			ecutype = (ECUType)eResolveProxy(oldEcutype);
			if (ecutype != oldEcutype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePackage.ECU__ECUTYPE, oldEcutype, ecutype));
			}
		}
		return ecutype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECUType basicGetEcutype() {
		return ecutype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcutype(ECUType newEcutype) {
		ECUType oldEcutype = ecutype;
		ecutype = newEcutype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.ECU__ECUTYPE, oldEcutype, ecutype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwarePackage.ECU__MICROCONTROLLERS:
				return getMicrocontrollers();
			case HardwarePackage.ECU__ECUTYPE:
				if (resolve) return getEcutype();
				return basicGetEcutype();
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
			case HardwarePackage.ECU__MICROCONTROLLERS:
				getMicrocontrollers().clear();
				getMicrocontrollers().addAll((Collection<? extends Microcontroller>)newValue);
				return;
			case HardwarePackage.ECU__ECUTYPE:
				setEcutype((ECUType)newValue);
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
			case HardwarePackage.ECU__MICROCONTROLLERS:
				getMicrocontrollers().clear();
				return;
			case HardwarePackage.ECU__ECUTYPE:
				setEcutype((ECUType)null);
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
			case HardwarePackage.ECU__MICROCONTROLLERS:
				return microcontrollers != null && !microcontrollers.isEmpty();
			case HardwarePackage.ECU__ECUTYPE:
				return ecutype != null;
		}
		return super.eIsSet(featureID);
	}

} //ECUImpl
