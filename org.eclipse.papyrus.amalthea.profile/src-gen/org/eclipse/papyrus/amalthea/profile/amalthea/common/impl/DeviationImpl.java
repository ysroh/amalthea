/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Distribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.DeviationImpl#getDistribution <em>Distribution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviationImpl extends MinimalEObjectImpl.Container implements Deviation {
	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected Distribution distribution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.DEVIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution getDistribution() {
		if (distribution != null && distribution.eIsProxy()) {
			InternalEObject oldDistribution = (InternalEObject)distribution;
			distribution = (Distribution)eResolveProxy(oldDistribution);
			if (distribution != oldDistribution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommonPackage.DEVIATION__DISTRIBUTION, oldDistribution, distribution));
			}
		}
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distribution basicGetDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(Distribution newDistribution) {
		Distribution oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.DEVIATION__DISTRIBUTION, oldDistribution, distribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.DEVIATION__DISTRIBUTION:
				if (resolve) return getDistribution();
				return basicGetDistribution();
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
			case CommonPackage.DEVIATION__DISTRIBUTION:
				setDistribution((Distribution)newValue);
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
			case CommonPackage.DEVIATION__DISTRIBUTION:
				setDistribution((Distribution)null);
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
			case CommonPackage.DEVIATION__DISTRIBUTION:
				return distribution != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviationImpl
