/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelAccessImpl#isBuffered <em>Is Buffered</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelAccessImpl#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelAccessImpl extends RunnableItemImpl implements LabelAccess {
	/**
	 * The default value of the '{@link #isBuffered() <em>Is Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuffered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BUFFERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBuffered() <em>Is Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBuffered()
	 * @generated
	 * @ordered
	 */
	protected boolean isBuffered = IS_BUFFERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAccessEnum ACCESS_EDEFAULT = LabelAccessEnum._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessEnum access = ACCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.LABEL_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBuffered() {
		return isBuffered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBuffered(boolean newIsBuffered) {
		boolean oldIsBuffered = isBuffered;
		isBuffered = newIsBuffered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.LABEL_ACCESS__IS_BUFFERED, oldIsBuffered, isBuffered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessEnum getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(LabelAccessEnum newAccess) {
		LabelAccessEnum oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.LABEL_ACCESS__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.LABEL_ACCESS__IS_BUFFERED:
				return isBuffered();
			case SoftwarePackage.LABEL_ACCESS__ACCESS:
				return getAccess();
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
			case SoftwarePackage.LABEL_ACCESS__IS_BUFFERED:
				setIsBuffered((Boolean)newValue);
				return;
			case SoftwarePackage.LABEL_ACCESS__ACCESS:
				setAccess((LabelAccessEnum)newValue);
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
			case SoftwarePackage.LABEL_ACCESS__IS_BUFFERED:
				setIsBuffered(IS_BUFFERED_EDEFAULT);
				return;
			case SoftwarePackage.LABEL_ACCESS__ACCESS:
				setAccess(ACCESS_EDEFAULT);
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
			case SoftwarePackage.LABEL_ACCESS__IS_BUFFERED:
				return isBuffered != IS_BUFFERED_EDEFAULT;
			case SoftwarePackage.LABEL_ACCESS__ACCESS:
				return access != ACCESS_EDEFAULT;
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
		result.append(" (isBuffered: ");
		result.append(isBuffered);
		result.append(", access: ");
		result.append(access);
		result.append(')');
		return result.toString();
	}

} //LabelAccessImpl
