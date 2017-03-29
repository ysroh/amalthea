/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConnectorImpl#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConnectorImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.ConnectorImpl#getTargetPort <em>Target Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends BaseObjectImpl implements Connector {
	/**
	 * The cached value of the '{@link #getBase_Connector() <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Connector()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Connector base_Connector;

	/**
	 * The cached value of the '{@link #getSourcePort() <em>Source Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePort()
	 * @generated
	 * @ordered
	 */
	protected QualifiedPort sourcePort;

	/**
	 * The cached value of the '{@link #getTargetPort() <em>Target Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPort()
	 * @generated
	 * @ordered
	 */
	protected QualifiedPort targetPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Connector getBase_Connector() {
		if (base_Connector != null && base_Connector.eIsProxy()) {
			InternalEObject oldBase_Connector = (InternalEObject)base_Connector;
			base_Connector = (org.eclipse.uml2.uml.Connector)eResolveProxy(oldBase_Connector);
			if (base_Connector != oldBase_Connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
			}
		}
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Connector basicGetBase_Connector() {
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Connector(org.eclipse.uml2.uml.Connector newBase_Connector) {
		org.eclipse.uml2.uml.Connector oldBase_Connector = base_Connector;
		base_Connector = newBase_Connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort getSourcePort() {
		if (sourcePort != null && sourcePort.eIsProxy()) {
			InternalEObject oldSourcePort = (InternalEObject)sourcePort;
			sourcePort = (QualifiedPort)eResolveProxy(oldSourcePort);
			if (sourcePort != oldSourcePort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.CONNECTOR__SOURCE_PORT, oldSourcePort, sourcePort));
			}
		}
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort basicGetSourcePort() {
		return sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePort(QualifiedPort newSourcePort) {
		QualifiedPort oldSourcePort = sourcePort;
		sourcePort = newSourcePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.CONNECTOR__SOURCE_PORT, oldSourcePort, sourcePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort getTargetPort() {
		if (targetPort != null && targetPort.eIsProxy()) {
			InternalEObject oldTargetPort = (InternalEObject)targetPort;
			targetPort = (QualifiedPort)eResolveProxy(oldTargetPort);
			if (targetPort != oldTargetPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AMALTHEAPackage.CONNECTOR__TARGET_PORT, oldTargetPort, targetPort));
			}
		}
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualifiedPort basicGetTargetPort() {
		return targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPort(QualifiedPort newTargetPort) {
		QualifiedPort oldTargetPort = targetPort;
		targetPort = newTargetPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.CONNECTOR__TARGET_PORT, oldTargetPort, targetPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.CONNECTOR__BASE_CONNECTOR:
				if (resolve) return getBase_Connector();
				return basicGetBase_Connector();
			case AMALTHEAPackage.CONNECTOR__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case AMALTHEAPackage.CONNECTOR__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
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
			case AMALTHEAPackage.CONNECTOR__BASE_CONNECTOR:
				setBase_Connector((org.eclipse.uml2.uml.Connector)newValue);
				return;
			case AMALTHEAPackage.CONNECTOR__SOURCE_PORT:
				setSourcePort((QualifiedPort)newValue);
				return;
			case AMALTHEAPackage.CONNECTOR__TARGET_PORT:
				setTargetPort((QualifiedPort)newValue);
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
			case AMALTHEAPackage.CONNECTOR__BASE_CONNECTOR:
				setBase_Connector((org.eclipse.uml2.uml.Connector)null);
				return;
			case AMALTHEAPackage.CONNECTOR__SOURCE_PORT:
				setSourcePort((QualifiedPort)null);
				return;
			case AMALTHEAPackage.CONNECTOR__TARGET_PORT:
				setTargetPort((QualifiedPort)null);
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
			case AMALTHEAPackage.CONNECTOR__BASE_CONNECTOR:
				return base_Connector != null;
			case AMALTHEAPackage.CONNECTOR__SOURCE_PORT:
				return sourcePort != null;
			case AMALTHEAPackage.CONNECTOR__TARGET_PORT:
				return targetPort != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
