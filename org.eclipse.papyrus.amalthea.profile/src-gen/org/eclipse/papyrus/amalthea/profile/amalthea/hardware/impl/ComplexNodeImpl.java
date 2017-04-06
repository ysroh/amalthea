/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz;

import org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ComplexNodeImpl#getQuartzes <em>Quartzes</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ComplexNodeImpl#getPrescaler <em>Prescaler</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.ComplexNodeImpl#getNetworks <em>Networks</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComplexNodeImpl extends BlockImpl implements ComplexNode {
	/**
	 * The cached value of the '{@link #getQuartzes() <em>Quartzes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuartzes()
	 * @generated
	 * @ordered
	 */
	protected EList<Quartz> quartzes;

	/**
	 * The cached value of the '{@link #getPrescaler() <em>Prescaler</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescaler()
	 * @generated
	 * @ordered
	 */
	protected EList<Prescaler> prescaler;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Network> networks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HardwarePackage.Literals.COMPLEX_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quartz> getQuartzes() {
		if (quartzes == null) {
			quartzes = new EObjectResolvingEList<Quartz>(Quartz.class, this, HardwarePackage.COMPLEX_NODE__QUARTZES);
		}
		return quartzes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Prescaler> getPrescaler() {
		if (prescaler == null) {
			prescaler = new EObjectResolvingEList<Prescaler>(Prescaler.class, this, HardwarePackage.COMPLEX_NODE__PRESCALER);
		}
		return prescaler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Network> getNetworks() {
		if (networks == null) {
			networks = new EObjectResolvingEList<Network>(Network.class, this, HardwarePackage.COMPLEX_NODE__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HardwarePackage.COMPLEX_NODE__QUARTZES:
				return getQuartzes();
			case HardwarePackage.COMPLEX_NODE__PRESCALER:
				return getPrescaler();
			case HardwarePackage.COMPLEX_NODE__NETWORKS:
				return getNetworks();
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
			case HardwarePackage.COMPLEX_NODE__QUARTZES:
				getQuartzes().clear();
				getQuartzes().addAll((Collection<? extends Quartz>)newValue);
				return;
			case HardwarePackage.COMPLEX_NODE__PRESCALER:
				getPrescaler().clear();
				getPrescaler().addAll((Collection<? extends Prescaler>)newValue);
				return;
			case HardwarePackage.COMPLEX_NODE__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends Network>)newValue);
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
			case HardwarePackage.COMPLEX_NODE__QUARTZES:
				getQuartzes().clear();
				return;
			case HardwarePackage.COMPLEX_NODE__PRESCALER:
				getPrescaler().clear();
				return;
			case HardwarePackage.COMPLEX_NODE__NETWORKS:
				getNetworks().clear();
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
			case HardwarePackage.COMPLEX_NODE__QUARTZES:
				return quartzes != null && !quartzes.isEmpty();
			case HardwarePackage.COMPLEX_NODE__PRESCALER:
				return prescaler != null && !prescaler.isEmpty();
			case HardwarePackage.COMPLEX_NODE__NETWORKS:
				return networks != null && !networks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComplexNodeImpl
