/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ProcessRequirementImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessRequirementImpl extends RequirementImpl implements ProcessRequirement {
	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected AbstractProcess process;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.PROCESS_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProcess getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject)process;
			process = (AbstractProcess)eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintsPackage.PROCESS_REQUIREMENT__PROCESS, oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractProcess basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(AbstractProcess newProcess) {
		AbstractProcess oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.PROCESS_REQUIREMENT__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.PROCESS_REQUIREMENT__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
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
			case ConstraintsPackage.PROCESS_REQUIREMENT__PROCESS:
				setProcess((AbstractProcess)newValue);
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
			case ConstraintsPackage.PROCESS_REQUIREMENT__PROCESS:
				setProcess((AbstractProcess)null);
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
			case ConstraintsPackage.PROCESS_REQUIREMENT__PROCESS:
				return process != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessRequirementImpl
