/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TimeUnit;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AbstractTimeImpl#getBase_Element <em>Base Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AbstractTimeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.AbstractTimeImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractTimeImpl extends MinimalEObjectImpl.Container implements AbstractTime {
	/**
	 * The cached value of the '{@link #getBase_Element() <em>Base Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Element()
	 * @generated
	 * @ordered
	 */
	protected Element base_Element;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit UNIT_EDEFAULT = TimeUnit._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit unit = UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.ABSTRACT_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getBase_Element() {
		if (base_Element != null && base_Element.eIsProxy()) {
			InternalEObject oldBase_Element = (InternalEObject)base_Element;
			base_Element = (Element)eResolveProxy(oldBase_Element);
			if (base_Element != oldBase_Element) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.ABSTRACT_TIME__BASE_ELEMENT, oldBase_Element, base_Element));
			}
		}
		return base_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetBase_Element() {
		return base_Element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Element(Element newBase_Element) {
		Element oldBase_Element = base_Element;
		base_Element = newBase_Element;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.ABSTRACT_TIME__BASE_ELEMENT, oldBase_Element, base_Element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.ABSTRACT_TIME__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnit newUnit) {
		TimeUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.ABSTRACT_TIME__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.ABSTRACT_TIME__BASE_ELEMENT:
				if (resolve) return getBase_Element();
				return basicGetBase_Element();
			case AMALTHEAPackage.ABSTRACT_TIME__VALUE:
				return getValue();
			case AMALTHEAPackage.ABSTRACT_TIME__UNIT:
				return getUnit();
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
			case AMALTHEAPackage.ABSTRACT_TIME__BASE_ELEMENT:
				setBase_Element((Element)newValue);
				return;
			case AMALTHEAPackage.ABSTRACT_TIME__VALUE:
				setValue((Integer)newValue);
				return;
			case AMALTHEAPackage.ABSTRACT_TIME__UNIT:
				setUnit((TimeUnit)newValue);
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
			case AMALTHEAPackage.ABSTRACT_TIME__BASE_ELEMENT:
				setBase_Element((Element)null);
				return;
			case AMALTHEAPackage.ABSTRACT_TIME__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case AMALTHEAPackage.ABSTRACT_TIME__UNIT:
				setUnit(UNIT_EDEFAULT);
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
			case AMALTHEAPackage.ABSTRACT_TIME__BASE_ELEMENT:
				return base_Element != null;
			case AMALTHEAPackage.ABSTRACT_TIME__VALUE:
				return value != VALUE_EDEFAULT;
			case AMALTHEAPackage.ABSTRACT_TIME__UNIT:
				return unit != UNIT_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(')');
		return result.toString();
	}

} //AbstractTimeImpl
