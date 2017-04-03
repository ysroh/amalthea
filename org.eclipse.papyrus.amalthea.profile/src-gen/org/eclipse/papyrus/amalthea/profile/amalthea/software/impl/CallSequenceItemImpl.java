/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Sequence Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceItemImpl#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceItemImpl#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CallSequenceItemImpl extends MinimalEObjectImpl.Container implements CallSequenceItem {
	/**
	 * The cached value of the '{@link #getBase_Operation() <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Operation()
	 * @generated
	 * @ordered
	 */
	protected Operation base_Operation;

	/**
	 * The cached value of the '{@link #getCounter() <em>Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounter()
	 * @generated
	 * @ordered
	 */
	protected Counter counter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallSequenceItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.CALL_SEQUENCE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getBase_Operation() {
		if (base_Operation != null && base_Operation.eIsProxy()) {
			InternalEObject oldBase_Operation = (InternalEObject)base_Operation;
			base_Operation = (Operation)eResolveProxy(oldBase_Operation);
			if (base_Operation != oldBase_Operation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.CALL_SEQUENCE_ITEM__BASE_OPERATION, oldBase_Operation, base_Operation));
			}
		}
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBase_Operation() {
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Operation(Operation newBase_Operation) {
		Operation oldBase_Operation = base_Operation;
		base_Operation = newBase_Operation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.CALL_SEQUENCE_ITEM__BASE_OPERATION, oldBase_Operation, base_Operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter getCounter() {
		if (counter != null && counter.eIsProxy()) {
			InternalEObject oldCounter = (InternalEObject)counter;
			counter = (Counter)eResolveProxy(oldCounter);
			if (counter != oldCounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.CALL_SEQUENCE_ITEM__COUNTER, oldCounter, counter));
			}
		}
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Counter basicGetCounter() {
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounter(Counter newCounter) {
		Counter oldCounter = counter;
		counter = newCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.CALL_SEQUENCE_ITEM__COUNTER, oldCounter, counter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.CALL_SEQUENCE_ITEM__BASE_OPERATION:
				if (resolve) return getBase_Operation();
				return basicGetBase_Operation();
			case SoftwarePackage.CALL_SEQUENCE_ITEM__COUNTER:
				if (resolve) return getCounter();
				return basicGetCounter();
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
			case SoftwarePackage.CALL_SEQUENCE_ITEM__BASE_OPERATION:
				setBase_Operation((Operation)newValue);
				return;
			case SoftwarePackage.CALL_SEQUENCE_ITEM__COUNTER:
				setCounter((Counter)newValue);
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
			case SoftwarePackage.CALL_SEQUENCE_ITEM__BASE_OPERATION:
				setBase_Operation((Operation)null);
				return;
			case SoftwarePackage.CALL_SEQUENCE_ITEM__COUNTER:
				setCounter((Counter)null);
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
			case SoftwarePackage.CALL_SEQUENCE_ITEM__BASE_OPERATION:
				return base_Operation != null;
			case SoftwarePackage.CALL_SEQUENCE_ITEM__COUNTER:
				return counter != null;
		}
		return super.eIsSet(featureID);
	}

} //CallSequenceItemImpl
