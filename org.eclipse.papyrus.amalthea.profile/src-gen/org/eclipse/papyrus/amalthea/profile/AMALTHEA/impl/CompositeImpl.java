/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Composite;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CompositeImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CompositeImpl#getGroundedPorts <em>Grounded Ports</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CompositeImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.CompositeImpl#getInnerPorts <em>Inner Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends ComponentImpl implements Composite {
	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connectors;

	/**
	 * The cached value of the '{@link #getGroundedPorts() <em>Grounded Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<QualifiedPort> groundedPorts;

	/**
	 * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInstance> componentInstances;

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
		return AMALTHEAPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectResolvingEList<Connector>(Connector.class, this, AMALTHEAPackage.COMPOSITE__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QualifiedPort> getGroundedPorts() {
		if (groundedPorts == null) {
			groundedPorts = new EObjectResolvingEList<QualifiedPort>(QualifiedPort.class, this, AMALTHEAPackage.COMPOSITE__GROUNDED_PORTS);
		}
		return groundedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInstance> getComponentInstances() {
		if (componentInstances == null) {
			componentInstances = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, AMALTHEAPackage.COMPOSITE__COMPONENT_INSTANCES);
		}
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort getInnerPorts() {
		QualifiedPort innerPorts = basicGetInnerPorts();
		return innerPorts != null && innerPorts.eIsProxy() ? (QualifiedPort)eResolveProxy((InternalEObject)innerPorts) : innerPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort basicGetInnerPorts() {
		// TODO: implement this method to return the 'Inner Ports' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerPorts(QualifiedPort newInnerPorts) {
		// TODO: implement this method to set the 'Inner Ports' reference
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
			case AMALTHEAPackage.COMPOSITE__CONNECTORS:
				return getConnectors();
			case AMALTHEAPackage.COMPOSITE__GROUNDED_PORTS:
				return getGroundedPorts();
			case AMALTHEAPackage.COMPOSITE__COMPONENT_INSTANCES:
				return getComponentInstances();
			case AMALTHEAPackage.COMPOSITE__INNER_PORTS:
				if (resolve) return getInnerPorts();
				return basicGetInnerPorts();
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
			case AMALTHEAPackage.COMPOSITE__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case AMALTHEAPackage.COMPOSITE__GROUNDED_PORTS:
				getGroundedPorts().clear();
				getGroundedPorts().addAll((Collection<? extends QualifiedPort>)newValue);
				return;
			case AMALTHEAPackage.COMPOSITE__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case AMALTHEAPackage.COMPOSITE__INNER_PORTS:
				setInnerPorts((QualifiedPort)newValue);
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
			case AMALTHEAPackage.COMPOSITE__CONNECTORS:
				getConnectors().clear();
				return;
			case AMALTHEAPackage.COMPOSITE__GROUNDED_PORTS:
				getGroundedPorts().clear();
				return;
			case AMALTHEAPackage.COMPOSITE__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				return;
			case AMALTHEAPackage.COMPOSITE__INNER_PORTS:
				setInnerPorts((QualifiedPort)null);
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
			case AMALTHEAPackage.COMPOSITE__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case AMALTHEAPackage.COMPOSITE__GROUNDED_PORTS:
				return groundedPorts != null && !groundedPorts.isEmpty();
			case AMALTHEAPackage.COMPOSITE__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
			case AMALTHEAPackage.COMPOSITE__INNER_PORTS:
				return basicGetInnerPorts() != null;
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
		if (baseClass == ISystem.class) {
			switch (derivedFeatureID) {
				case AMALTHEAPackage.COMPOSITE__CONNECTORS: return AMALTHEAPackage.ISYSTEM__CONNECTORS;
				case AMALTHEAPackage.COMPOSITE__GROUNDED_PORTS: return AMALTHEAPackage.ISYSTEM__GROUNDED_PORTS;
				case AMALTHEAPackage.COMPOSITE__COMPONENT_INSTANCES: return AMALTHEAPackage.ISYSTEM__COMPONENT_INSTANCES;
				case AMALTHEAPackage.COMPOSITE__INNER_PORTS: return AMALTHEAPackage.ISYSTEM__INNER_PORTS;
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
		if (baseClass == ISystem.class) {
			switch (baseFeatureID) {
				case AMALTHEAPackage.ISYSTEM__CONNECTORS: return AMALTHEAPackage.COMPOSITE__CONNECTORS;
				case AMALTHEAPackage.ISYSTEM__GROUNDED_PORTS: return AMALTHEAPackage.COMPOSITE__GROUNDED_PORTS;
				case AMALTHEAPackage.ISYSTEM__COMPONENT_INSTANCES: return AMALTHEAPackage.COMPOSITE__COMPONENT_INSTANCES;
				case AMALTHEAPackage.ISYSTEM__INNER_PORTS: return AMALTHEAPackage.COMPOSITE__INNER_PORTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CompositeImpl
