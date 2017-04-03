/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weibull Estimators</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.WeibullEstimatorsImpl#getPRemainPromille <em>PRemain Promille</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.WeibullEstimatorsImpl#getMean <em>Mean</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeibullEstimatorsImpl extends DistributionImpl implements WeibullEstimators {
	/**
	 * The default value of the '{@link #getPRemainPromille() <em>PRemain Promille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRemainPromille()
	 * @generated
	 * @ordered
	 */
	protected static final double PREMAIN_PROMILLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPRemainPromille() <em>PRemain Promille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRemainPromille()
	 * @generated
	 * @ordered
	 */
	protected double pRemainPromille = PREMAIN_PROMILLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected static final int MEAN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMean()
	 * @generated
	 * @ordered
	 */
	protected int mean = MEAN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WeibullEstimatorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.WEIBULL_ESTIMATORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPRemainPromille() {
		return pRemainPromille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRemainPromille(double newPRemainPromille) {
		double oldPRemainPromille = pRemainPromille;
		pRemainPromille = newPRemainPromille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.WEIBULL_ESTIMATORS__PREMAIN_PROMILLE, oldPRemainPromille, pRemainPromille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMean() {
		return mean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMean(int newMean) {
		int oldMean = mean;
		mean = newMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.WEIBULL_ESTIMATORS__MEAN, oldMean, mean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.WEIBULL_ESTIMATORS__PREMAIN_PROMILLE:
				return getPRemainPromille();
			case CommonPackage.WEIBULL_ESTIMATORS__MEAN:
				return getMean();
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
			case CommonPackage.WEIBULL_ESTIMATORS__PREMAIN_PROMILLE:
				setPRemainPromille((Double)newValue);
				return;
			case CommonPackage.WEIBULL_ESTIMATORS__MEAN:
				setMean((Integer)newValue);
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
			case CommonPackage.WEIBULL_ESTIMATORS__PREMAIN_PROMILLE:
				setPRemainPromille(PREMAIN_PROMILLE_EDEFAULT);
				return;
			case CommonPackage.WEIBULL_ESTIMATORS__MEAN:
				setMean(MEAN_EDEFAULT);
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
			case CommonPackage.WEIBULL_ESTIMATORS__PREMAIN_PROMILLE:
				return pRemainPromille != PREMAIN_PROMILLE_EDEFAULT;
			case CommonPackage.WEIBULL_ESTIMATORS__MEAN:
				return mean != MEAN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pRemainPromille: ");
		result.append(pRemainPromille);
		result.append(", mean: ");
		result.append(mean);
		result.append(')');
		return result.toString();
	}

} //WeibullEstimatorsImpl
