/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Stimulus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inter Process Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.InterProcessActivationImpl#getStimulus <em>Stimulus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterProcessActivationImpl extends CallSequenceItemImpl implements InterProcessActivation {
	/**
	 * The cached value of the '{@link #getStimulus() <em>Stimulus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStimulus()
	 * @generated
	 * @ordered
	 */
	protected Stimulus stimulus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterProcessActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.INTER_PROCESS_ACTIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus getStimulus() {
		if (stimulus != null && stimulus.eIsProxy()) {
			InternalEObject oldStimulus = (InternalEObject)stimulus;
			stimulus = (Stimulus)eResolveProxy(oldStimulus);
			if (stimulus != oldStimulus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.INTER_PROCESS_ACTIVATION__STIMULUS, oldStimulus, stimulus));
			}
		}
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stimulus basicGetStimulus() {
		return stimulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStimulus(Stimulus newStimulus) {
		Stimulus oldStimulus = stimulus;
		stimulus = newStimulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.INTER_PROCESS_ACTIVATION__STIMULUS, oldStimulus, stimulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.INTER_PROCESS_ACTIVATION__STIMULUS:
				if (resolve) return getStimulus();
				return basicGetStimulus();
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
			case SoftwarePackage.INTER_PROCESS_ACTIVATION__STIMULUS:
				setStimulus((Stimulus)newValue);
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
			case SoftwarePackage.INTER_PROCESS_ACTIVATION__STIMULUS:
				setStimulus((Stimulus)null);
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
			case SoftwarePackage.INTER_PROCESS_ACTIVATION__STIMULUS:
				return stimulus != null;
		}
		return super.eIsSet(featureID);
	}

} //InterProcessActivationImpl
