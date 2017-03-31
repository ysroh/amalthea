/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescaler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.PrescalerImpl#getClockRatio <em>Clock Ratio</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.PrescalerImpl#getName <em>Name</em>}</li>
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
		return HardwarePackage.Literals.PRESCALER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.PRESCALER__CLOCK_RATIO, oldClockRatio, clockRatio));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.PRESCALER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwarePackage.PRESCALER__CLOCK_RATIO:
				return getClockRatio();
			case HardwarePackage.PRESCALER__NAME:
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
			case HardwarePackage.PRESCALER__CLOCK_RATIO:
				setClockRatio((Double)newValue);
				return;
			case HardwarePackage.PRESCALER__NAME:
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
			case HardwarePackage.PRESCALER__CLOCK_RATIO:
				setClockRatio(CLOCK_RATIO_EDEFAULT);
				return;
			case HardwarePackage.PRESCALER__NAME:
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
			case HardwarePackage.PRESCALER__CLOCK_RATIO:
				return clockRatio != CLOCK_RATIO_EDEFAULT;
			case HardwarePackage.PRESCALER__NAME:
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
