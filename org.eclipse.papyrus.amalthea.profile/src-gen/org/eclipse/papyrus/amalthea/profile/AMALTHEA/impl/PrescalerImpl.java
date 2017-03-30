/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescaler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PrescalerImpl#getClockRatio <em>Clock Ratio</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PrescalerImpl#getQuartz <em>Quartz</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PrescalerImpl#getBase_Element <em>Base Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.PrescalerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescalerImpl extends MinimalEObjectImpl.Container implements Prescaler {
	/**
	 * The default value of the '{@link #getClockRatio() <em>Clock Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double CLOCK_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getClockRatio() <em>Clock Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockRatio()
	 * @generated
	 * @ordered
	 */
	protected double clockRatio = CLOCK_RATIO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQuartz() <em>Quartz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuartz()
	 * @generated
	 * @ordered
	 */
	protected Quartz quartz;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescalerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.PRESCALER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getClockRatio() {
		return clockRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockRatio(double newClockRatio) {
		double oldClockRatio = clockRatio;
		clockRatio = newClockRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.PRESCALER__CLOCK_RATIO, oldClockRatio, clockRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz getQuartz() {
		if (quartz != null && quartz.eIsProxy()) {
			InternalEObject oldQuartz = (InternalEObject)quartz;
			quartz = (Quartz)eResolveProxy(oldQuartz);
			if (quartz != oldQuartz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.PRESCALER__QUARTZ, oldQuartz, quartz));
			}
		}
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quartz basicGetQuartz() {
		return quartz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuartz(Quartz newQuartz) {
		Quartz oldQuartz = quartz;
		quartz = newQuartz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.PRESCALER__QUARTZ, oldQuartz, quartz));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.PRESCALER__BASE_ELEMENT, oldBase_Element, base_Element));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.PRESCALER__BASE_ELEMENT, oldBase_Element, base_Element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.PRESCALER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.PRESCALER__CLOCK_RATIO:
				return getClockRatio();
			case AMALTHEAPackage.PRESCALER__QUARTZ:
				if (resolve) return getQuartz();
				return basicGetQuartz();
			case AMALTHEAPackage.PRESCALER__BASE_ELEMENT:
				if (resolve) return getBase_Element();
				return basicGetBase_Element();
			case AMALTHEAPackage.PRESCALER__NAME:
				return getName();
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
			case AMALTHEAPackage.PRESCALER__CLOCK_RATIO:
				setClockRatio((Double)newValue);
				return;
			case AMALTHEAPackage.PRESCALER__QUARTZ:
				setQuartz((Quartz)newValue);
				return;
			case AMALTHEAPackage.PRESCALER__BASE_ELEMENT:
				setBase_Element((Element)newValue);
				return;
			case AMALTHEAPackage.PRESCALER__NAME:
				setName((String)newValue);
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
			case AMALTHEAPackage.PRESCALER__CLOCK_RATIO:
				setClockRatio(CLOCK_RATIO_EDEFAULT);
				return;
			case AMALTHEAPackage.PRESCALER__QUARTZ:
				setQuartz((Quartz)null);
				return;
			case AMALTHEAPackage.PRESCALER__BASE_ELEMENT:
				setBase_Element((Element)null);
				return;
			case AMALTHEAPackage.PRESCALER__NAME:
				setName(NAME_EDEFAULT);
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
			case AMALTHEAPackage.PRESCALER__CLOCK_RATIO:
				return clockRatio != CLOCK_RATIO_EDEFAULT;
			case AMALTHEAPackage.PRESCALER__QUARTZ:
				return quartz != null;
			case AMALTHEAPackage.PRESCALER__BASE_ELEMENT:
				return base_Element != null;
			case AMALTHEAPackage.PRESCALER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (clockRatio: ");
		result.append(clockRatio);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PrescalerImpl
