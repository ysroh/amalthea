/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.components;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.Component#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.Component#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(org.eclipse.uml2.uml.Component)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage#getComponent_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Component getBase_Component();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.Component#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(org.eclipse.uml2.uml.Component value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference.
	 * @see #setPorts(FInterfacePort)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage#getComponent_Ports()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FInterfacePort getPorts();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.Component#getPorts <em>Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ports</em>' reference.
	 * @see #getPorts()
	 * @generated
	 */
	void setPorts(FInterfacePort value);

} // Component
