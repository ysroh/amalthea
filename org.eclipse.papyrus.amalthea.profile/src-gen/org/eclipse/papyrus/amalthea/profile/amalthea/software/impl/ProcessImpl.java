/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.ProcessImpl#getCallgraph <em>Callgraph</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessImpl extends AbstractProcessImpl implements org.eclipse.papyrus.amalthea.profile.amalthea.software.Process {
	/**
	 * The cached value of the '{@link #getCallgraph() <em>Callgraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallgraph()
	 * @generated
	 * @ordered
	 */
	protected CallGraph callgraph;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoftwarePackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallGraph getCallgraph() {
		if (callgraph != null && callgraph.eIsProxy()) {
			InternalEObject oldCallgraph = (InternalEObject)callgraph;
			callgraph = (CallGraph)eResolveProxy(oldCallgraph);
			if (callgraph != oldCallgraph) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoftwarePackage.PROCESS__CALLGRAPH, oldCallgraph, callgraph));
			}
		}
		return callgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallGraph basicGetCallgraph() {
		return callgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallgraph(CallGraph newCallgraph) {
		CallGraph oldCallgraph = callgraph;
		callgraph = newCallgraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoftwarePackage.PROCESS__CALLGRAPH, oldCallgraph, callgraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoftwarePackage.PROCESS__CALLGRAPH:
				if (resolve) return getCallgraph();
				return basicGetCallgraph();
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
			case SoftwarePackage.PROCESS__CALLGRAPH:
				setCallgraph((CallGraph)newValue);
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
			case SoftwarePackage.PROCESS__CALLGRAPH:
				setCallgraph((CallGraph)null);
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
			case SoftwarePackage.PROCESS__CALLGRAPH:
				return callgraph != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessImpl
