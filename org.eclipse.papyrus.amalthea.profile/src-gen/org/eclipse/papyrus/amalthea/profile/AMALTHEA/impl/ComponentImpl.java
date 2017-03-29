/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component;

import org.eclipse.papyrus.sysml14.blocks.Block;
import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentImpl#isEncapsulated <em>Is Encapsulated</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ComponentImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ReferableBaseObjectImpl implements Component {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #isEncapsulated() <em>Is Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENCAPSULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEncapsulated() <em>Is Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean isEncapsulated = IS_ENCAPSULATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Component base_Component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.COMPONENT__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.COMPONENT__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEncapsulated() {
		return isEncapsulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEncapsulated(boolean newIsEncapsulated) {
		boolean oldIsEncapsulated = isEncapsulated;
		isEncapsulated = newIsEncapsulated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.COMPONENT__IS_ENCAPSULATED, oldIsEncapsulated, isEncapsulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (org.eclipse.uml2.uml.Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.COMPONENT__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(org.eclipse.uml2.uml.Component newBase_Component) {
		org.eclipse.uml2.uml.Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.COMPONENT__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getReferences() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getParts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getFlowProperties() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.COMPONENT__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case AMALTHEAPackage.COMPONENT__IS_ENCAPSULATED:
				return isEncapsulated();
			case AMALTHEAPackage.COMPONENT__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
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
			case AMALTHEAPackage.COMPONENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case AMALTHEAPackage.COMPONENT__IS_ENCAPSULATED:
				setIsEncapsulated((Boolean)newValue);
				return;
			case AMALTHEAPackage.COMPONENT__BASE_COMPONENT:
				setBase_Component((org.eclipse.uml2.uml.Component)newValue);
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
			case AMALTHEAPackage.COMPONENT__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case AMALTHEAPackage.COMPONENT__IS_ENCAPSULATED:
				setIsEncapsulated(IS_ENCAPSULATED_EDEFAULT);
				return;
			case AMALTHEAPackage.COMPONENT__BASE_COMPONENT:
				setBase_Component((org.eclipse.uml2.uml.Component)null);
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
			case AMALTHEAPackage.COMPONENT__BASE_CLASS:
				return base_Class != null;
			case AMALTHEAPackage.COMPONENT__IS_ENCAPSULATED:
				return isEncapsulated != IS_ENCAPSULATED_EDEFAULT;
			case AMALTHEAPackage.COMPONENT__BASE_COMPONENT:
				return base_Component != null;
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
		if (baseClass == Block.class) {
			switch (derivedFeatureID) {
				case AMALTHEAPackage.COMPONENT__BASE_CLASS: return BlocksPackage.BLOCK__BASE_CLASS;
				case AMALTHEAPackage.COMPONENT__IS_ENCAPSULATED: return BlocksPackage.BLOCK__IS_ENCAPSULATED;
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
		if (baseClass == Block.class) {
			switch (baseFeatureID) {
				case BlocksPackage.BLOCK__BASE_CLASS: return AMALTHEAPackage.COMPONENT__BASE_CLASS;
				case BlocksPackage.BLOCK__IS_ENCAPSULATED: return AMALTHEAPackage.COMPONENT__IS_ENCAPSULATED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Block.class) {
			switch (baseOperationID) {
				case BlocksPackage.BLOCK___GET_REFERENCES: return AMALTHEAPackage.COMPONENT___GET_REFERENCES;
				case BlocksPackage.BLOCK___GET_PARTS: return AMALTHEAPackage.COMPONENT___GET_PARTS;
				case BlocksPackage.BLOCK___GET_FLOW_PROPERTIES: return AMALTHEAPackage.COMPONENT___GET_FLOW_PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AMALTHEAPackage.COMPONENT___GET_REFERENCES:
				return getReferences();
			case AMALTHEAPackage.COMPONENT___GET_PARTS:
				return getParts();
			case AMALTHEAPackage.COMPONENT___GET_FLOW_PROPERTIES:
				return getFlowProperties();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isEncapsulated: ");
		result.append(isEncapsulated);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
