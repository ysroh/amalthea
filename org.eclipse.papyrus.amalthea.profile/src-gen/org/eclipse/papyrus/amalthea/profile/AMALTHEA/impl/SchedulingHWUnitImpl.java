/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingHWUnit;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingUnit;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Time;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling HW Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SchedulingHWUnitImpl#getBase_Element <em>Base Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.SchedulingHWUnitImpl#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingHWUnitImpl extends BaseObjectImpl implements SchedulingHWUnit {
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
	 * The cached value of the '{@link #getDelay() <em>Delay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay()
	 * @generated
	 * @ordered
	 */
	protected Time delay;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingHWUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.SCHEDULING_HW_UNIT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.SCHEDULING_HW_UNIT__BASE_ELEMENT, oldBase_Element, base_Element));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.SCHEDULING_HW_UNIT__BASE_ELEMENT, oldBase_Element, base_Element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getDelay() {
		if (delay != null && delay.eIsProxy()) {
			InternalEObject oldDelay = (InternalEObject)delay;
			delay = (Time)eResolveProxy(oldDelay);
			if (delay != oldDelay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.SCHEDULING_HW_UNIT__DELAY, oldDelay, delay));
			}
		}
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time basicGetDelay() {
		return delay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(Time newDelay) {
		Time oldDelay = delay;
		delay = newDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.SCHEDULING_HW_UNIT__DELAY, oldDelay, delay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.SCHEDULING_HW_UNIT__BASE_ELEMENT:
				if (resolve) return getBase_Element();
				return basicGetBase_Element();
			case AMALTHEAPackage.SCHEDULING_HW_UNIT__DELAY:
				if (resolve) return getDelay();
				return basicGetDelay();
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
			case AMALTHEAPackage.SCHEDULING_HW_UNIT__BASE_ELEMENT:
				setBase_Element((Element)newValue);
				return;
			case AMALTHEAPackage.SCHEDULING_HW_UNIT__DELAY:
				setDelay((Time)newValue);
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
			case AMALTHEAPackage.SCHEDULING_HW_UNIT__BASE_ELEMENT:
				setBase_Element((Element)null);
				return;
			case AMALTHEAPackage.SCHEDULING_HW_UNIT__DELAY:
				setDelay((Time)null);
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
			case AMALTHEAPackage.SCHEDULING_HW_UNIT__BASE_ELEMENT:
				return base_Element != null;
			case AMALTHEAPackage.SCHEDULING_HW_UNIT__DELAY:
				return delay != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SchedulingUnit.class) {
			switch (derivedFeatureID) {
				case AMALTHEAPackage.SCHEDULING_HW_UNIT__BASE_ELEMENT: return AMALTHEAPackage.SCHEDULING_UNIT__BASE_ELEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SchedulingUnit.class) {
			switch (baseFeatureID) {
				case AMALTHEAPackage.SCHEDULING_UNIT__BASE_ELEMENT: return AMALTHEAPackage.SCHEDULING_HW_UNIT__BASE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SchedulingHWUnitImpl
