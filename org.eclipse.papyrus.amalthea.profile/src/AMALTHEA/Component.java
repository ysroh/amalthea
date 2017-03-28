/**
 */
package AMALTHEA;

import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.Component#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Block {
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
	 * @see AMALTHEA.AMALTHEAPackage#getComponent_Base_Component()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Component getBase_Component();

	/**
	 * Sets the value of the '{@link AMALTHEA.Component#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(org.eclipse.uml2.uml.Component value);

} // Component
