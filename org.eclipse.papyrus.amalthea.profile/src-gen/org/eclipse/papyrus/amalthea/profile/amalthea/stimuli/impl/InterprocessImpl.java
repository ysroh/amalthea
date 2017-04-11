/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Interprocess;
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interprocess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.InterprocessImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterprocessImpl extends StimulusImpl implements Interprocess {
	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Counter counter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterprocessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StimuliPackage.Literals.INTERPROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter getCounter() {
		if (counter != null && counter.eIsProxy()) {
			InternalEObject oldCounter = (InternalEObject)counter;
			counter = (Counter)eResolveProxy(oldCounter);
			if (counter != oldCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StimuliPackage.INTERPROCESS__COUNTER, oldCounter, counter));
			}
		}
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter basicGetCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(Counter newCounter) {
		Counter oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StimuliPackage.INTERPROCESS__COUNTER, oldCounter, counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StimuliPackage.INTERPROCESS__COUNTER:
				if (resolve) return getCounter();
				return basicGetCounter();
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
			case StimuliPackage.INTERPROCESS__COUNTER:
				setCounter((Counter)newValue);
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
			case StimuliPackage.INTERPROCESS__COUNTER:
				setCounter((Counter)null);
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
			case StimuliPackage.INTERPROCESS__COUNTER:
				return counter != null;
		}
		return super.eIsSet(featureID);
	}

} //InterprocessImpl
