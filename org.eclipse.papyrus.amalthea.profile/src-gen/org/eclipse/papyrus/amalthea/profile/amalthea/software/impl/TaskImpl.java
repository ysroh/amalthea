/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskImpl#getPreemption <em>Preemption</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskImpl#getMultipleTaskActivationLimit <em>Multiple Task Activation Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends ProcessImpl implements Task {
	/**
	 * The default value of the '{@link #getPreemption() <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemption()
	 * @generated
	 * @ordered
	 */
	protected static final Preemption PREEMPTION_EDEFAULT = Preemption._UNDEFINED_;

	/**
	 * The cached value of the '{@link #getPreemption() <em>Preemption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemption()
	 * @generated
	 * @ordered
	 */
	protected Preemption preemption = PREEMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleTaskActivationLimit() <em>Multiple Task Activation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleTaskActivationLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLE_TASK_ACTIVATION_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultipleTaskActivationLimit() <em>Multiple Task Activation Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleTaskActivationLimit()
	 * @generated
	 * @ordered
	 */
	protected int multipleTaskActivationLimit = MULTIPLE_TASK_ACTIVATION_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preemption getPreemption() {
		return preemption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreemption(Preemption newPreemption) {
		Preemption oldPreemption = preemption;
		preemption = newPreemption == null ? PREEMPTION_EDEFAULT : newPreemption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.TASK__PREEMPTION, oldPreemption, preemption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultipleTaskActivationLimit() {
		return multipleTaskActivationLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleTaskActivationLimit(int newMultipleTaskActivationLimit) {
		int oldMultipleTaskActivationLimit = multipleTaskActivationLimit;
		multipleTaskActivationLimit = newMultipleTaskActivationLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.TASK__MULTIPLE_TASK_ACTIVATION_LIMIT, oldMultipleTaskActivationLimit, multipleTaskActivationLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.TASK__PREEMPTION:
				return getPreemption();
			case SoftwarePackage.TASK__MULTIPLE_TASK_ACTIVATION_LIMIT:
				return getMultipleTaskActivationLimit();
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
			case SoftwarePackage.TASK__PREEMPTION:
				setPreemption((Preemption)newValue);
				return;
			case SoftwarePackage.TASK__MULTIPLE_TASK_ACTIVATION_LIMIT:
				setMultipleTaskActivationLimit((Integer)newValue);
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
			case SoftwarePackage.TASK__PREEMPTION:
				setPreemption(PREEMPTION_EDEFAULT);
				return;
			case SoftwarePackage.TASK__MULTIPLE_TASK_ACTIVATION_LIMIT:
				setMultipleTaskActivationLimit(MULTIPLE_TASK_ACTIVATION_LIMIT_EDEFAULT);
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
			case SoftwarePackage.TASK__PREEMPTION:
				return preemption != PREEMPTION_EDEFAULT;
			case SoftwarePackage.TASK__MULTIPLE_TASK_ACTIVATION_LIMIT:
				return multipleTaskActivationLimit != MULTIPLE_TASK_ACTIVATION_LIMIT_EDEFAULT;
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
		result.append(" (preemption: ");
		result.append(preemption);
		result.append(", multipleTaskActivationLimit: ");
		result.append(multipleTaskActivationLimit);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
