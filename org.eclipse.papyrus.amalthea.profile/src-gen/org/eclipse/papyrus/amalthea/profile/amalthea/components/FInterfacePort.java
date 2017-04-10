/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.components;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FInterface Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FInterfacePort is owend port
 * of Component.
 * Kind is represented by isConjugate property
 * of UML port
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort#getInterfaceName <em>Interface Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage#getFInterfacePort()
 * @model
 * @generated
 */
public interface FInterfacePort extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage#getFInterfacePort_Base_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage#getFInterfacePort_InterfaceName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

} // FInterfacePort
