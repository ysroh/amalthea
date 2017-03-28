/**
 */
package AMALTHEA.impl;

import AMALTHEA.AMALTHEAPackage;
import AMALTHEA.Core;
import AMALTHEA.CoreType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.impl.CoreImpl#getCoreType <em>Core Type</em>}</li>
 *   <li>{@link AMALTHEA.impl.CoreImpl#getLockstepGroup <em>Lockstep Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreImpl extends ComplexNodeImpl implements Core {
	/**
	 * The cached value of the '{@link #getCoreType() <em>Core Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreType()
	 * @generated
	 * @ordered
	 */
	protected CoreType coreType;

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
		return AMALTHEAPackage.Literals.CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreType getCoreType() {
		if (coreType != null && coreType.eIsProxy()) {
			InternalEObject oldCoreType = (InternalEObject)coreType;
			coreType = (CoreType)eResolveProxy(oldCoreType);
			if (coreType != oldCoreType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.CORE__CORE_TYPE, oldCoreType, coreType));
			}
		}
		return coreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreType basicGetCoreType() {
		return coreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreType(CoreType newCoreType) {
		CoreType oldCoreType = coreType;
		coreType = newCoreType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.CORE__CORE_TYPE, oldCoreType, coreType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.CORE__LOCKSTEP_GROUP, oldLockstepGroup, lockstepGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.CORE__CORE_TYPE:
				if (resolve) return getCoreType();
				return basicGetCoreType();
			case AMALTHEAPackage.CORE__LOCKSTEP_GROUP:
				return getLockstepGroup();
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
			case AMALTHEAPackage.CORE__CORE_TYPE:
				setCoreType((CoreType)newValue);
				return;
			case AMALTHEAPackage.CORE__LOCKSTEP_GROUP:
				setLockstepGroup((Integer)newValue);
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
			case AMALTHEAPackage.CORE__CORE_TYPE:
				setCoreType((CoreType)null);
				return;
			case AMALTHEAPackage.CORE__LOCKSTEP_GROUP:
				setLockstepGroup(LOCKSTEP_GROUP_EDEFAULT);
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
			case AMALTHEAPackage.CORE__CORE_TYPE:
				return coreType != null;
			case AMALTHEAPackage.CORE__LOCKSTEP_GROUP:
				return lockstepGroup != LOCKSTEP_GROUP_EDEFAULT;
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
