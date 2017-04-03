/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Time;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Single;
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.SingleImpl#getActivation <em>Activation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleImpl extends StimulusImpl implements Single {
	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected Time activation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StimuliPackage.Literals.SINGLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getActivation() {
		if (activation != null && activation.eIsProxy()) {
			InternalEObject oldActivation = (InternalEObject)activation;
			activation = (Time)eResolveProxy(oldActivation);
			if (activation != oldActivation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StimuliPackage.SINGLE__ACTIVATION, oldActivation, activation));
			}
		}
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation(Time newActivation) {
		Time oldActivation = activation;
		activation = newActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StimuliPackage.SINGLE__ACTIVATION, oldActivation, activation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StimuliPackage.SINGLE__ACTIVATION:
				if (resolve) return getActivation();
				return basicGetActivation();
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
			case StimuliPackage.SINGLE__ACTIVATION:
				setActivation((Time)newValue);
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
			case StimuliPackage.SINGLE__ACTIVATION:
				setActivation((Time)null);
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
			case StimuliPackage.SINGLE__ACTIVATION:
				return activation != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleImpl
