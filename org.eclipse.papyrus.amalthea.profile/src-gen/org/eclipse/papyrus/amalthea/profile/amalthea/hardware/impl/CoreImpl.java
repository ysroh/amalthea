/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreImpl#getLockstepGroup <em>Lockstep Group</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.CoreImpl#getCoretype <em>Coretype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreImpl extends ComplexNodeImpl implements Core {
	/**
	 * The default value of the '{@link #getLockstepGroup() <em>Lockstep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockstepGroup()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCKSTEP_GROUP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLockstepGroup() <em>Lockstep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockstepGroup()
	 * @generated
	 * @ordered
	 */
	protected int lockstepGroup = LOCKSTEP_GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoretype() <em>Coretype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoretype()
	 * @generated
	 * @ordered
	 */
	protected CoreType coretype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLockstepGroup() {
		return lockstepGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockstepGroup(int newLockstepGroup) {
		int oldLockstepGroup = lockstepGroup;
		lockstepGroup = newLockstepGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CORE__LOCKSTEP_GROUP, oldLockstepGroup, lockstepGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreType getCoretype() {
		if (coretype != null && coretype.eIsProxy()) {
			InternalEObject oldCoretype = (InternalEObject)coretype;
			coretype = (CoreType)eResolveProxy(oldCoretype);
			if (coretype != oldCoretype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HardwarePackage.CORE__CORETYPE, oldCoretype, coretype));
			}
		}
		return coretype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreType basicGetCoretype() {
		return coretype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoretype(CoreType newCoretype) {
		CoreType oldCoretype = coretype;
		coretype = newCoretype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HardwarePackage.CORE__CORETYPE, oldCoretype, coretype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwarePackage.CORE__LOCKSTEP_GROUP:
				return getLockstepGroup();
			case HardwarePackage.CORE__CORETYPE:
				if (resolve) return getCoretype();
				return basicGetCoretype();
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
			case HardwarePackage.CORE__LOCKSTEP_GROUP:
				setLockstepGroup((Integer)newValue);
				return;
			case HardwarePackage.CORE__CORETYPE:
				setCoretype((CoreType)newValue);
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
			case HardwarePackage.CORE__LOCKSTEP_GROUP:
				setLockstepGroup(LOCKSTEP_GROUP_EDEFAULT);
				return;
			case HardwarePackage.CORE__CORETYPE:
				setCoretype((CoreType)null);
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
			case HardwarePackage.CORE__LOCKSTEP_GROUP:
				return lockstepGroup != LOCKSTEP_GROUP_EDEFAULT;
			case HardwarePackage.CORE__CORETYPE:
				return coretype != null;
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
		result.append(" (lockstepGroup: ");
		result.append(lockstepGroup);
		result.append(')');
		return result.toString();
	}

} //CoreImpl
