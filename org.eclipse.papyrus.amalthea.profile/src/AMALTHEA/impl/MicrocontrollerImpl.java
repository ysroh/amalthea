/**
 */
package AMALTHEA.impl;

import AMALTHEA.AMALTHEAPackage;
import AMALTHEA.Core;
import AMALTHEA.Microcontroller;
import AMALTHEA.MicrocontrollerType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.impl.MicrocontrollerImpl#getMicrocontrollerType <em>Microcontroller Type</em>}</li>
 *   <li>{@link AMALTHEA.impl.MicrocontrollerImpl#getCores <em>Cores</em>}</li>
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
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' containment reference.
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
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCores(Core newCores, NotificationChain msgs) {
		Core oldCores = cores;
		cores = newCores;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.MICROCONTROLLER__CORES, oldCores, newCores);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCores(Core newCores) {
		if (newCores != cores) {
			NotificationChain msgs = null;
			if (cores != null)
				msgs = ((InternalEObject)cores).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AMALTHEAPackage.MICROCONTROLLER__CORES, null, msgs);
			if (newCores != null)
				msgs = ((InternalEObject)newCores).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AMALTHEAPackage.MICROCONTROLLER__CORES, null, msgs);
			msgs = basicSetCores(newCores, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.MICROCONTROLLER__CORES, newCores, newCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AMALTHEAPackage.MICROCONTROLLER__CORES:
				return basicSetCores(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getCores();
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
