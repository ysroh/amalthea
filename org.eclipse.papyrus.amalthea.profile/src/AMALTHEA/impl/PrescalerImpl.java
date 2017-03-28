/**
 */
package AMALTHEA.impl;

import AMALTHEA.AMALTHEAPackage;
import AMALTHEA.Prescaler;
import AMALTHEA.Quartz;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescaler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.impl.PrescalerImpl#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link AMALTHEA.impl.PrescalerImpl#getClockRatio <em>Clock Ratio</em>}</li>
 *   <li>{@link AMALTHEA.impl.PrescalerImpl#getQuartz <em>Quartz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescalerImpl extends MinimalEObjectImpl.Container implements Prescaler {
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
	public DataType getBase_DataType() {
		if (base_DataType != null && base_DataType.eIsProxy()) {
			InternalEObject oldBase_DataType = (InternalEObject)base_DataType;
			base_DataType = (DataType)eResolveProxy(oldBase_DataType);
			if (base_DataType != oldBase_DataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.PRESCALER__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.PRESCALER__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.PRESCALER__BASE_DATA_TYPE:
				if (resolve) return getBase_DataType();
				return basicGetBase_DataType();
			case AMALTHEAPackage.PRESCALER__CLOCK_RATIO:
				return getClockRatio();
			case AMALTHEAPackage.PRESCALER__QUARTZ:
				if (resolve) return getQuartz();
				return basicGetQuartz();
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
			case AMALTHEAPackage.PRESCALER__BASE_DATA_TYPE:
				setBase_DataType((DataType)newValue);
				return;
			case AMALTHEAPackage.PRESCALER__CLOCK_RATIO:
				setClockRatio((Double)newValue);
				return;
			case AMALTHEAPackage.PRESCALER__QUARTZ:
				setQuartz((Quartz)newValue);
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
			case AMALTHEAPackage.PRESCALER__BASE_DATA_TYPE:
				setBase_DataType((DataType)null);
				return;
			case AMALTHEAPackage.PRESCALER__CLOCK_RATIO:
				setClockRatio(CLOCK_RATIO_EDEFAULT);
				return;
			case AMALTHEAPackage.PRESCALER__QUARTZ:
				setQuartz((Quartz)null);
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
			case AMALTHEAPackage.PRESCALER__BASE_DATA_TYPE:
				return base_DataType != null;
			case AMALTHEAPackage.PRESCALER__CLOCK_RATIO:
				return clockRatio != CLOCK_RATIO_EDEFAULT;
			case AMALTHEAPackage.PRESCALER__QUARTZ:
				return quartz != null;
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
		result.append(')');
		return result.toString();
	}

} //PrescalerImpl
