/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptSchedulingAlgorithm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.InterruptControllerImpl#getInterruptSchedulingAlgorithm <em>Interrupt Scheduling Algorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterruptControllerImpl extends SchedulerImpl implements InterruptController {
	/**
	 * The cached value of the '{@link #getInterruptSchedulingAlgorithm() <em>Interrupt Scheduling Algorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptSchedulingAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected InterruptSchedulingAlgorithm interruptSchedulingAlgorithm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.INTERRUPT_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptSchedulingAlgorithm getInterruptSchedulingAlgorithm() {
		if (interruptSchedulingAlgorithm != null && interruptSchedulingAlgorithm.eIsProxy()) {
			InternalEObject oldInterruptSchedulingAlgorithm = (InternalEObject)interruptSchedulingAlgorithm;
			interruptSchedulingAlgorithm = (InterruptSchedulingAlgorithm)eResolveProxy(oldInterruptSchedulingAlgorithm);
			if (interruptSchedulingAlgorithm != oldInterruptSchedulingAlgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.INTERRUPT_CONTROLLER__INTERRUPT_SCHEDULING_ALGORITHM, oldInterruptSchedulingAlgorithm, interruptSchedulingAlgorithm));
			}
		}
		return interruptSchedulingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptSchedulingAlgorithm basicGetInterruptSchedulingAlgorithm() {
		return interruptSchedulingAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptSchedulingAlgorithm(InterruptSchedulingAlgorithm newInterruptSchedulingAlgorithm) {
		InterruptSchedulingAlgorithm oldInterruptSchedulingAlgorithm = interruptSchedulingAlgorithm;
		interruptSchedulingAlgorithm = newInterruptSchedulingAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.INTERRUPT_CONTROLLER__INTERRUPT_SCHEDULING_ALGORITHM, oldInterruptSchedulingAlgorithm, interruptSchedulingAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.INTERRUPT_CONTROLLER__INTERRUPT_SCHEDULING_ALGORITHM:
				if (resolve) return getInterruptSchedulingAlgorithm();
				return basicGetInterruptSchedulingAlgorithm();
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
			case AMALTHEAPackage.INTERRUPT_CONTROLLER__INTERRUPT_SCHEDULING_ALGORITHM:
				setInterruptSchedulingAlgorithm((InterruptSchedulingAlgorithm)newValue);
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
			case AMALTHEAPackage.INTERRUPT_CONTROLLER__INTERRUPT_SCHEDULING_ALGORITHM:
				setInterruptSchedulingAlgorithm((InterruptSchedulingAlgorithm)null);
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
			case AMALTHEAPackage.INTERRUPT_CONTROLLER__INTERRUPT_SCHEDULING_ALGORITHM:
				return interruptSchedulingAlgorithm != null;
		}
		return super.eIsSet(featureID);
	}

} //InterruptControllerImpl
