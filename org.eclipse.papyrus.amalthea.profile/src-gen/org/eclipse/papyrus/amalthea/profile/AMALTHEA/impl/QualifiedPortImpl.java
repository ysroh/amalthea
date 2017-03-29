/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;

import org.eclipse.uml2.uml.ConnectorEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QualifiedPortImpl#getBase_ConnectorEnd <em>Base Connector End</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QualifiedPortImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.QualifiedPortImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedPortImpl extends BaseObjectImpl implements QualifiedPort {
	/**
	 * The cached value of the '{@link #getBase_ConnectorEnd() <em>Base Connector End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ConnectorEnd()
	 * @generated
	 * @ordered
	 */
	protected ConnectorEnd base_ConnectorEnd;

	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance instance;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Port port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualifiedPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.QUALIFIED_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd getBase_ConnectorEnd() {
		if (base_ConnectorEnd != null && base_ConnectorEnd.eIsProxy()) {
			InternalEObject oldBase_ConnectorEnd = (InternalEObject)base_ConnectorEnd;
			base_ConnectorEnd = (ConnectorEnd)eResolveProxy(oldBase_ConnectorEnd);
			if (base_ConnectorEnd != oldBase_ConnectorEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.QUALIFIED_PORT__BASE_CONNECTOR_END, oldBase_ConnectorEnd, base_ConnectorEnd));
			}
		}
		return base_ConnectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorEnd basicGetBase_ConnectorEnd() {
		return base_ConnectorEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ConnectorEnd(ConnectorEnd newBase_ConnectorEnd) {
		ConnectorEnd oldBase_ConnectorEnd = base_ConnectorEnd;
		base_ConnectorEnd = newBase_ConnectorEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.QUALIFIED_PORT__BASE_CONNECTOR_END, oldBase_ConnectorEnd, base_ConnectorEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = (ComponentInstance)eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.QUALIFIED_PORT__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(ComponentInstance newInstance) {
		ComponentInstance oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.QUALIFIED_PORT__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject)port;
			port = (Port)eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.QUALIFIED_PORT__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Port newPort) {
		Port oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.QUALIFIED_PORT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.QUALIFIED_PORT__BASE_CONNECTOR_END:
				if (resolve) return getBase_ConnectorEnd();
				return basicGetBase_ConnectorEnd();
			case AMALTHEAPackage.QUALIFIED_PORT__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case AMALTHEAPackage.QUALIFIED_PORT__PORT:
				if (resolve) return getPort();
				return basicGetPort();
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
			case AMALTHEAPackage.QUALIFIED_PORT__BASE_CONNECTOR_END:
				setBase_ConnectorEnd((ConnectorEnd)newValue);
				return;
			case AMALTHEAPackage.QUALIFIED_PORT__INSTANCE:
				setInstance((ComponentInstance)newValue);
				return;
			case AMALTHEAPackage.QUALIFIED_PORT__PORT:
				setPort((Port)newValue);
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
			case AMALTHEAPackage.QUALIFIED_PORT__BASE_CONNECTOR_END:
				setBase_ConnectorEnd((ConnectorEnd)null);
				return;
			case AMALTHEAPackage.QUALIFIED_PORT__INSTANCE:
				setInstance((ComponentInstance)null);
				return;
			case AMALTHEAPackage.QUALIFIED_PORT__PORT:
				setPort((Port)null);
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
			case AMALTHEAPackage.QUALIFIED_PORT__BASE_CONNECTOR_END:
				return base_ConnectorEnd != null;
			case AMALTHEAPackage.QUALIFIED_PORT__INSTANCE:
				return instance != null;
			case AMALTHEAPackage.QUALIFIED_PORT__PORT:
				return port != null;
		}
		return super.eIsSet(featureID);
	}

} //QualifiedPortImpl
