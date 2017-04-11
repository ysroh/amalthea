/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.LimitType;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.RequirementLimit;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementLimitImpl#getLimitType <em>Limit Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementLimitImpl#getBase_DataType <em>Base Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementLimitImpl extends MinimalEObjectImpl.Container implements RequirementLimit {
	/**
	 * The default value of the '{@link #getLimitType() <em>Limit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitType()
	 * @generated
	 * @ordered
	 */
	protected static final LimitType LIMIT_TYPE_EDEFAULT = LimitType._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getLimitType() <em>Limit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimitType()
	 * @generated
	 * @ordered
	 */
	protected LimitType limitType = LIMIT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_DataType() <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_DataType()
	 * @generated
	 * @ordered
	 */
	protected DataType base_DataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementLimitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.REQUIREMENT_LIMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitType getLimitType() {
		return limitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimitType(LimitType newLimitType) {
		LimitType oldLimitType = limitType;
		limitType = newLimitType == null ? LIMIT_TYPE_EDEFAULT : newLimitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.REQUIREMENT_LIMIT__LIMIT_TYPE, oldLimitType, limitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBase_DataType() {
		if (base_DataType != null && base_DataType.eIsProxy()) {
			InternalEObject oldBase_DataType = (InternalEObject)base_DataType;
			base_DataType = (DataType)eResolveProxy(oldBase_DataType);
			if (base_DataType != oldBase_DataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintsPackage.REQUIREMENT_LIMIT__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
			}
		}
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBase_DataType() {
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_DataType(DataType newBase_DataType) {
		DataType oldBase_DataType = base_DataType;
		base_DataType = newBase_DataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.REQUIREMENT_LIMIT__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.REQUIREMENT_LIMIT__LIMIT_TYPE:
				return getLimitType();
			case ConstraintsPackage.REQUIREMENT_LIMIT__BASE_DATA_TYPE:
				if (resolve) return getBase_DataType();
				return basicGetBase_DataType();
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
			case ConstraintsPackage.REQUIREMENT_LIMIT__LIMIT_TYPE:
				setLimitType((LimitType)newValue);
				return;
			case ConstraintsPackage.REQUIREMENT_LIMIT__BASE_DATA_TYPE:
				setBase_DataType((DataType)newValue);
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
			case ConstraintsPackage.REQUIREMENT_LIMIT__LIMIT_TYPE:
				setLimitType(LIMIT_TYPE_EDEFAULT);
				return;
			case ConstraintsPackage.REQUIREMENT_LIMIT__BASE_DATA_TYPE:
				setBase_DataType((DataType)null);
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
			case ConstraintsPackage.REQUIREMENT_LIMIT__LIMIT_TYPE:
				return limitType != LIMIT_TYPE_EDEFAULT;
			case ConstraintsPackage.REQUIREMENT_LIMIT__BASE_DATA_TYPE:
				return base_DataType != null;
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
		result.append(" (limitType: ");
		result.append(limitType);
		result.append(')');
		return result.toString();
	}

} //RequirementLimitImpl
