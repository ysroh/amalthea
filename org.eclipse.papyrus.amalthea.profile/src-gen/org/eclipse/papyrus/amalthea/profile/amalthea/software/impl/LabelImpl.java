/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.Label;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelImpl#isBVolatile <em>BVolatile</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelImpl#isBuffered <em>Buffered</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelImpl#getNumberBits <em>Number Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends AbstractElementMemoryInformationImpl implements Label {
	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBVolatile() <em>BVolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BVOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBVolatile() <em>BVolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean bVolatile = BVOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuffered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUFFERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBuffered() <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuffered()
	 * @generated
	 * @ordered
	 */
	protected boolean buffered = BUFFERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberBits() <em>Number Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBits()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_BITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberBits() <em>Number Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberBits()
	 * @generated
	 * @ordered
	 */
	protected int numberBits = NUMBER_BITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.LABEL__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBVolatile() {
		return bVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBVolatile(boolean newBVolatile) {
		boolean oldBVolatile = bVolatile;
		bVolatile = newBVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.LABEL__BVOLATILE, oldBVolatile, bVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBuffered() {
		return buffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffered(boolean newBuffered) {
		boolean oldBuffered = buffered;
		buffered = newBuffered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.LABEL__BUFFERED, oldBuffered, buffered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberBits() {
		return numberBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberBits(int newNumberBits) {
		int oldNumberBits = numberBits;
		numberBits = newNumberBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.LABEL__NUMBER_BITS, oldNumberBits, numberBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.LABEL__CONSTANT:
				return isConstant();
			case SoftwarePackage.LABEL__BVOLATILE:
				return isBVolatile();
			case SoftwarePackage.LABEL__BUFFERED:
				return isBuffered();
			case SoftwarePackage.LABEL__NUMBER_BITS:
				return getNumberBits();
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
			case SoftwarePackage.LABEL__CONSTANT:
				setConstant((Boolean)newValue);
				return;
			case SoftwarePackage.LABEL__BVOLATILE:
				setBVolatile((Boolean)newValue);
				return;
			case SoftwarePackage.LABEL__BUFFERED:
				setBuffered((Boolean)newValue);
				return;
			case SoftwarePackage.LABEL__NUMBER_BITS:
				setNumberBits((Integer)newValue);
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
			case SoftwarePackage.LABEL__CONSTANT:
				setConstant(CONSTANT_EDEFAULT);
				return;
			case SoftwarePackage.LABEL__BVOLATILE:
				setBVolatile(BVOLATILE_EDEFAULT);
				return;
			case SoftwarePackage.LABEL__BUFFERED:
				setBuffered(BUFFERED_EDEFAULT);
				return;
			case SoftwarePackage.LABEL__NUMBER_BITS:
				setNumberBits(NUMBER_BITS_EDEFAULT);
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
			case SoftwarePackage.LABEL__CONSTANT:
				return constant != CONSTANT_EDEFAULT;
			case SoftwarePackage.LABEL__BVOLATILE:
				return bVolatile != BVOLATILE_EDEFAULT;
			case SoftwarePackage.LABEL__BUFFERED:
				return buffered != BUFFERED_EDEFAULT;
			case SoftwarePackage.LABEL__NUMBER_BITS:
				return numberBits != NUMBER_BITS_EDEFAULT;
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
		result.append(" (constant: ");
		result.append(constant);
		result.append(", bVolatile: ");
		result.append(bVolatile);
		result.append(", buffered: ");
		result.append(buffered);
		result.append(", numberBits: ");
		result.append(numberBits);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
