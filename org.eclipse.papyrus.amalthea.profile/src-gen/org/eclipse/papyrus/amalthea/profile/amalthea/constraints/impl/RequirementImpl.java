/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Requirement;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.RequirementLimit;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Severity;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.RequirementImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity = SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected RequirementLimit limit;

	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Severity newSeverity) {
		Severity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.REQUIREMENT__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementLimit getLimit() {
		if (limit != null && limit.eIsProxy()) {
			InternalEObject oldLimit = (InternalEObject)limit;
			limit = (RequirementLimit)eResolveProxy(oldLimit);
			if (limit != oldLimit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintsPackage.REQUIREMENT__LIMIT, oldLimit, limit));
			}
		}
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementLimit basicGetLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(RequirementLimit newLimit) {
		RequirementLimit oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.REQUIREMENT__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject)base_Constraint;
			base_Constraint = (Constraint)eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintsPackage.REQUIREMENT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.REQUIREMENT__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.REQUIREMENT__SEVERITY:
				return getSeverity();
			case ConstraintsPackage.REQUIREMENT__LIMIT:
				if (resolve) return getLimit();
				return basicGetLimit();
			case ConstraintsPackage.REQUIREMENT__BASE_CONSTRAINT:
				if (resolve) return getBase_Constraint();
				return basicGetBase_Constraint();
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
			case ConstraintsPackage.REQUIREMENT__SEVERITY:
				setSeverity((Severity)newValue);
				return;
			case ConstraintsPackage.REQUIREMENT__LIMIT:
				setLimit((RequirementLimit)newValue);
				return;
			case ConstraintsPackage.REQUIREMENT__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)newValue);
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
			case ConstraintsPackage.REQUIREMENT__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case ConstraintsPackage.REQUIREMENT__LIMIT:
				setLimit((RequirementLimit)null);
				return;
			case ConstraintsPackage.REQUIREMENT__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)null);
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
			case ConstraintsPackage.REQUIREMENT__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case ConstraintsPackage.REQUIREMENT__LIMIT:
				return limit != null;
			case ConstraintsPackage.REQUIREMENT__BASE_CONSTRAINT:
				return base_Constraint != null;
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
		result.append(" (severity: ");
		result.append(severity);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
