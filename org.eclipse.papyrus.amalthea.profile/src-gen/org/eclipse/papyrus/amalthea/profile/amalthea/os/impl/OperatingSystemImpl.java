/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler;

import org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OperatingSystemImpl#getTaskscheduler <em>Taskscheduler</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OperatingSystemImpl#getInterruptcontroller <em>Interruptcontroller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingSystemImpl extends BlockImpl implements OperatingSystem {
	/**
	 * The cached value of the '{@link #getTaskscheduler() <em>Taskscheduler</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskscheduler()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskScheduler> taskscheduler;

	/**
	 * The cached value of the '{@link #getInterruptcontroller() <em>Interruptcontroller</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptcontroller()
	 * @generated
	 * @ordered
	 */
	protected EList<InterruptController> interruptcontroller;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsPackage.Literals.OPERATING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskScheduler> getTaskscheduler() {
		if (taskscheduler == null) {
			taskscheduler = new EObjectResolvingEList<TaskScheduler>(TaskScheduler.class, this, OsPackage.OPERATING_SYSTEM__TASKSCHEDULER);
		}
		return taskscheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterruptController> getInterruptcontroller() {
		if (interruptcontroller == null) {
			interruptcontroller = new EObjectResolvingEList<InterruptController>(InterruptController.class, this, OsPackage.OPERATING_SYSTEM__INTERRUPTCONTROLLER);
		}
		return interruptcontroller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsPackage.OPERATING_SYSTEM__TASKSCHEDULER:
				return getTaskscheduler();
			case OsPackage.OPERATING_SYSTEM__INTERRUPTCONTROLLER:
				return getInterruptcontroller();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsPackage.OPERATING_SYSTEM__TASKSCHEDULER:
				getTaskscheduler().clear();
				getTaskscheduler().addAll((Collection<? extends TaskScheduler>)newValue);
				return;
			case OsPackage.OPERATING_SYSTEM__INTERRUPTCONTROLLER:
				getInterruptcontroller().clear();
				getInterruptcontroller().addAll((Collection<? extends InterruptController>)newValue);
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
			case OsPackage.OPERATING_SYSTEM__TASKSCHEDULER:
				getTaskscheduler().clear();
				return;
			case OsPackage.OPERATING_SYSTEM__INTERRUPTCONTROLLER:
				getInterruptcontroller().clear();
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
			case OsPackage.OPERATING_SYSTEM__TASKSCHEDULER:
				return taskscheduler != null && !taskscheduler.isEmpty();
			case OsPackage.OPERATING_SYSTEM__INTERRUPTCONTROLLER:
				return interruptcontroller != null && !interruptcontroller.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperatingSystemImpl
