/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ReferableBaseObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referable Base Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ReferableBaseObjectImpl#getCustomProperties <em>Custom Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferableBaseObjectImpl extends IReferableImpl implements ReferableBaseObject {
	/**
	 * The cached value of the '{@link #getCustomProperties() <em>Custom Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomProperty> customProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferableBaseObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.REFERABLE_BASE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomProperty> getCustomProperties() {
		if (customProperties == null) {
			customProperties = new EObjectResolvingEList<CustomProperty>(CustomProperty.class, this, AMALTHEAPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES);
		}
		return customProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES:
				return getCustomProperties();
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
			case AMALTHEAPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES:
				getCustomProperties().clear();
				getCustomProperties().addAll((Collection<? extends CustomProperty>)newValue);
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
			case AMALTHEAPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES:
				getCustomProperties().clear();
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
			case AMALTHEAPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES:
				return customProperties != null && !customProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IAnnotatable.class) {
			switch (derivedFeatureID) {
				case AMALTHEAPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES: return AMALTHEAPackage.IANNOTATABLE__CUSTOM_PROPERTIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IAnnotatable.class) {
			switch (baseFeatureID) {
				case AMALTHEAPackage.IANNOTATABLE__CUSTOM_PROPERTIES: return AMALTHEAPackage.REFERABLE_BASE_OBJECT__CUSTOM_PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReferableBaseObjectImpl
