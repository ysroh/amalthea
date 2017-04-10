/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.SignedTime;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeMetric;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.TimeRequirementLimitImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.TimeRequirementLimitImpl#getLimitValue <em>Limit Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeRequirementLimitImpl extends RequirementLimitImpl implements TimeRequirementLimit {
	/**
	 * The default value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected static final TimeMetric METRIC_EDEFAULT = TimeMetric._UNDEFINED_;
	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected TimeMetric metric = METRIC_EDEFAULT;
	/**
	 * The cached value of the '{@link #getLimitValue() <em>Limit Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitValue()
	 * @generated
	 * @ordered
	 */
	protected SignedTime limitValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeRequirementLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.TIME_REQUIREMENT_LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeMetric getMetric() {
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetric(TimeMetric newMetric) {
		TimeMetric oldMetric = metric;
		metric = newMetric == null ? METRIC_EDEFAULT : newMetric;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.TIME_REQUIREMENT_LIMIT__METRIC, oldMetric, metric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedTime getLimitValue() {
		if (limitValue != null && limitValue.eIsProxy()) {
			InternalEObject oldLimitValue = (InternalEObject)limitValue;
			limitValue = (SignedTime)eResolveProxy(oldLimitValue);
			if (limitValue != oldLimitValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintsPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE, oldLimitValue, limitValue));
			}
		}
		return limitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedTime basicGetLimitValue() {
		return limitValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitValue(SignedTime newLimitValue) {
		SignedTime oldLimitValue = limitValue;
		limitValue = newLimitValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE, oldLimitValue, limitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.TIME_REQUIREMENT_LIMIT__METRIC:
				return getMetric();
			case ConstraintsPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				if (resolve) return getLimitValue();
				return basicGetLimitValue();
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
			case ConstraintsPackage.TIME_REQUIREMENT_LIMIT__METRIC:
				setMetric((TimeMetric)newValue);
				return;
			case ConstraintsPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue((SignedTime)newValue);
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
			case ConstraintsPackage.TIME_REQUIREMENT_LIMIT__METRIC:
				setMetric(METRIC_EDEFAULT);
				return;
			case ConstraintsPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				setLimitValue((SignedTime)null);
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
			case ConstraintsPackage.TIME_REQUIREMENT_LIMIT__METRIC:
				return metric != METRIC_EDEFAULT;
			case ConstraintsPackage.TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				return limitValue != null;
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
		result.append(" (metric: ");
		result.append(metric);
		result.append(')');
		return result.toString();
	}

} //TimeRequirementLimitImpl
