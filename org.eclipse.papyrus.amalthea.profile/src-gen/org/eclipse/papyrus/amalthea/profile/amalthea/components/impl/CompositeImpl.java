/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.components.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentInstance;
import org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.components.Composite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.CompositeImpl#getComponentinstances <em>Componentinstances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends ComponentImpl implements Composite {
	/**
	 * The cached value of the '{@link #getComponentinstances() <em>Componentinstances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentinstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentinstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentinstances() {
		if (componentinstances == null) {
			componentinstances = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, ComponentsPackage.COMPOSITE__COMPONENTINSTANCES);
		}
		return componentinstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.COMPOSITE__COMPONENTINSTANCES:
				return getComponentinstances();
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
			case ComponentsPackage.COMPOSITE__COMPONENTINSTANCES:
				getComponentinstances().clear();
				getComponentinstances().addAll((Collection<? extends ComponentInstance>)newValue);
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
			case ComponentsPackage.COMPOSITE__COMPONENTINSTANCES:
				getComponentinstances().clear();
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
			case ComponentsPackage.COMPOSITE__COMPONENTINSTANCES:
				return componentinstances != null && !componentinstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeImpl
