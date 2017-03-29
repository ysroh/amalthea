/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

import org.eclipse.uml2.uml.ConnectorEnd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getBase_ConnectorEnd <em>Base Connector End</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getQualifiedPort()
 * @model
 * @generated
 */
public interface QualifiedPort extends BaseObject {
	/**
	 * Returns the value of the '<em><b>Base Connector End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector End</em>' reference.
	 * @see #setBase_ConnectorEnd(ConnectorEnd)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getQualifiedPort_Base_ConnectorEnd()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectorEnd getBase_ConnectorEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getBase_ConnectorEnd <em>Base Connector End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector End</em>' reference.
	 * @see #getBase_ConnectorEnd()
	 * @generated
	 */
	void setBase_ConnectorEnd(ConnectorEnd value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(ComponentInstance)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getQualifiedPort_Instance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentInstance getInstance();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getQualifiedPort_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // QualifiedPort
