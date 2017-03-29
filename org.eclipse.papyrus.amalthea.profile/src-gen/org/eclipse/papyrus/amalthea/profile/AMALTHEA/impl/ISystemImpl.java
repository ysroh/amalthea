/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ISystemImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ISystemImpl#getGroundedPorts <em>Grounded Ports</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ISystemImpl#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ISystemImpl#getInnerPorts <em>Inner Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ISystemImpl extends MinimalEObjectImpl.Container implements ISystem {
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
	protected ISystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.ISYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectResolvingEList<Connector>(Connector.class, this, AMALTHEAPackage.ISYSTEM__CONNECTORS);
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
			groundedPorts = new EObjectResolvingEList<QualifiedPort>(QualifiedPort.class, this, AMALTHEAPackage.ISYSTEM__GROUNDED_PORTS);
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
			componentInstances = new EObjectResolvingEList<ComponentInstance>(ComponentInstance.class, this, AMALTHEAPackage.ISYSTEM__COMPONENT_INSTANCES);
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
			case AMALTHEAPackage.ISYSTEM__CONNECTORS:
				return getConnectors();
			case AMALTHEAPackage.ISYSTEM__GROUNDED_PORTS:
				return getGroundedPorts();
			case AMALTHEAPackage.ISYSTEM__COMPONENT_INSTANCES:
				return getComponentInstances();
			case AMALTHEAPackage.ISYSTEM__INNER_PORTS:
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
			case AMALTHEAPackage.ISYSTEM__CONNECTORS:
				getConnectors().clear();
				getConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case AMALTHEAPackage.ISYSTEM__GROUNDED_PORTS:
				getGroundedPorts().clear();
				getGroundedPorts().addAll((Collection<? extends QualifiedPort>)newValue);
				return;
			case AMALTHEAPackage.ISYSTEM__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				getComponentInstances().addAll((Collection<? extends ComponentInstance>)newValue);
				return;
			case AMALTHEAPackage.ISYSTEM__INNER_PORTS:
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
			case AMALTHEAPackage.ISYSTEM__CONNECTORS:
				getConnectors().clear();
				return;
			case AMALTHEAPackage.ISYSTEM__GROUNDED_PORTS:
				getGroundedPorts().clear();
				return;
			case AMALTHEAPackage.ISYSTEM__COMPONENT_INSTANCES:
				getComponentInstances().clear();
				return;
			case AMALTHEAPackage.ISYSTEM__INNER_PORTS:
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
			case AMALTHEAPackage.ISYSTEM__CONNECTORS:
				return connectors != null && !connectors.isEmpty();
			case AMALTHEAPackage.ISYSTEM__GROUNDED_PORTS:
				return groundedPorts != null && !groundedPorts.isEmpty();
			case AMALTHEAPackage.ISYSTEM__COMPONENT_INSTANCES:
				return componentInstances != null && !componentInstances.isEmpty();
			case AMALTHEAPackage.ISYSTEM__INNER_PORTS:
				return basicGetInnerPorts() != null;
		}
		return super.eIsSet(featureID);
	}

} //ISystemImpl
