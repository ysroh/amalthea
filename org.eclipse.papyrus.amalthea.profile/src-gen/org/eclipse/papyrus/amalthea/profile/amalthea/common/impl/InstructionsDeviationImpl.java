/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instructions Deviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.InstructionsDeviationImpl#getDeviation <em>Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionsDeviationImpl extends InstructionsImpl implements InstructionsDeviation {
	/**
	 * The cached value of the '{@link #getDeviation() <em>Deviation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviation()
	 * @generated
	 * @ordered
	 */
	protected Deviation deviation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionsDeviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.INSTRUCTIONS_DEVIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviation getDeviation() {
		if (deviation != null && deviation.eIsProxy()) {
			InternalEObject oldDeviation = (InternalEObject)deviation;
			deviation = (Deviation)eResolveProxy(oldDeviation);
			if (deviation != oldDeviation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.INSTRUCTIONS_DEVIATION__DEVIATION, oldDeviation, deviation));
			}
		}
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deviation basicGetDeviation() {
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviation(Deviation newDeviation) {
		Deviation oldDeviation = deviation;
		deviation = newDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.INSTRUCTIONS_DEVIATION__DEVIATION, oldDeviation, deviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.INSTRUCTIONS_DEVIATION__DEVIATION:
				if (resolve) return getDeviation();
				return basicGetDeviation();
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
			case CommonPackage.INSTRUCTIONS_DEVIATION__DEVIATION:
				setDeviation((Deviation)newValue);
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
			case CommonPackage.INSTRUCTIONS_DEVIATION__DEVIATION:
				setDeviation((Deviation)null);
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
			case CommonPackage.INSTRUCTIONS_DEVIATION__DEVIATION:
				return deviation != null;
		}
		return super.eIsSet(featureID);
	}

} //InstructionsDeviationImpl
