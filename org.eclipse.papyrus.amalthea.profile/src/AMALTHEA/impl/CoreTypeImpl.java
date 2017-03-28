/**
 */
package AMALTHEA.impl;

import AMALTHEA.AMALTHEAPackage;
import AMALTHEA.CoreType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.impl.CoreTypeImpl#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link AMALTHEA.impl.CoreTypeImpl#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link AMALTHEA.impl.CoreTypeImpl#getInstructionsPerCycle <em>Instructions Per Cycle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreTypeImpl extends MinimalEObjectImpl.Container implements CoreType {
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
	 * The default value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BIT_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected int bitWidth = BIT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructionsPerCycle() <em>Instructions Per Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsPerCycle()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTRUCTIONS_PER_CYCLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstructionsPerCycle() <em>Instructions Per Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsPerCycle()
	 * @generated
	 * @ordered
	 */
	protected int instructionsPerCycle = INSTRUCTIONS_PER_CYCLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.CORE_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.CORE_TYPE__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.CORE_TYPE__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBitWidth() {
		return bitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitWidth(int newBitWidth) {
		int oldBitWidth = bitWidth;
		bitWidth = newBitWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.CORE_TYPE__BIT_WIDTH, oldBitWidth, bitWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstructionsPerCycle() {
		return instructionsPerCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructionsPerCycle(int newInstructionsPerCycle) {
		int oldInstructionsPerCycle = instructionsPerCycle;
		instructionsPerCycle = newInstructionsPerCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE, oldInstructionsPerCycle, instructionsPerCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.CORE_TYPE__BASE_DATA_TYPE:
				if (resolve) return getBase_DataType();
				return basicGetBase_DataType();
			case AMALTHEAPackage.CORE_TYPE__BIT_WIDTH:
				return getBitWidth();
			case AMALTHEAPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE:
				return getInstructionsPerCycle();
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
			case AMALTHEAPackage.CORE_TYPE__BASE_DATA_TYPE:
				setBase_DataType((DataType)newValue);
				return;
			case AMALTHEAPackage.CORE_TYPE__BIT_WIDTH:
				setBitWidth((Integer)newValue);
				return;
			case AMALTHEAPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE:
				setInstructionsPerCycle((Integer)newValue);
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
			case AMALTHEAPackage.CORE_TYPE__BASE_DATA_TYPE:
				setBase_DataType((DataType)null);
				return;
			case AMALTHEAPackage.CORE_TYPE__BIT_WIDTH:
				setBitWidth(BIT_WIDTH_EDEFAULT);
				return;
			case AMALTHEAPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE:
				setInstructionsPerCycle(INSTRUCTIONS_PER_CYCLE_EDEFAULT);
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
			case AMALTHEAPackage.CORE_TYPE__BASE_DATA_TYPE:
				return base_DataType != null;
			case AMALTHEAPackage.CORE_TYPE__BIT_WIDTH:
				return bitWidth != BIT_WIDTH_EDEFAULT;
			case AMALTHEAPackage.CORE_TYPE__INSTRUCTIONS_PER_CYCLE:
				return instructionsPerCycle != INSTRUCTIONS_PER_CYCLE_EDEFAULT;
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
		result.append(" (bitWidth: ");
		result.append(bitWidth);
		result.append(", instructionsPerCycle: ");
		result.append(instructionsPerCycle);
		result.append(')');
		return result.toString();
	}

} //CoreTypeImpl
