/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptSchedulingAlgorithm;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interrupt Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.InterruptControllerImpl#getSchedulingalgorithm <em>Schedulingalgorithm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterruptControllerImpl extends SchedulerImpl implements InterruptController {
	/**
	 * The cached value of the '{@link #getSchedulingalgorithm() <em>Schedulingalgorithm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingalgorithm()
	 * @generated
	 * @ordered
	 */
	protected InterruptSchedulingAlgorithm schedulingalgorithm;

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
		return OsPackage.Literals.INTERRUPT_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptSchedulingAlgorithm getSchedulingalgorithm() {
		if (schedulingalgorithm != null && schedulingalgorithm.eIsProxy()) {
			InternalEObject oldSchedulingalgorithm = (InternalEObject)schedulingalgorithm;
			schedulingalgorithm = (InterruptSchedulingAlgorithm)eResolveProxy(oldSchedulingalgorithm);
			if (schedulingalgorithm != oldSchedulingalgorithm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OsPackage.INTERRUPT_CONTROLLER__SCHEDULINGALGORITHM, oldSchedulingalgorithm, schedulingalgorithm));
			}
		}
		return schedulingalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptSchedulingAlgorithm basicGetSchedulingalgorithm() {
		return schedulingalgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingalgorithm(InterruptSchedulingAlgorithm newSchedulingalgorithm) {
		InterruptSchedulingAlgorithm oldSchedulingalgorithm = schedulingalgorithm;
		schedulingalgorithm = newSchedulingalgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsPackage.INTERRUPT_CONTROLLER__SCHEDULINGALGORITHM, oldSchedulingalgorithm, schedulingalgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsPackage.INTERRUPT_CONTROLLER__SCHEDULINGALGORITHM:
				if (resolve) return getSchedulingalgorithm();
				return basicGetSchedulingalgorithm();
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
			case OsPackage.INTERRUPT_CONTROLLER__SCHEDULINGALGORITHM:
				setSchedulingalgorithm((InterruptSchedulingAlgorithm)newValue);
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
			case OsPackage.INTERRUPT_CONTROLLER__SCHEDULINGALGORITHM:
				setSchedulingalgorithm((InterruptSchedulingAlgorithm)null);
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
			case OsPackage.INTERRUPT_CONTROLLER__SCHEDULINGALGORITHM:
				return schedulingalgorithm != null;
		}
		return super.eIsSet(featureID);
	}

} //InterruptControllerImpl
