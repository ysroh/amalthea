/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel#getBase_Model <em>Base Model</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getConstraintsModel()
 * @model
 * @generated
 */
public interface ConstraintsModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Model</em>' reference.
	 * @see #setBase_Model(Model)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getConstraintsModel_Base_Model()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Model getBase_Model();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel#getBase_Model <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Model</em>' reference.
	 * @see #getBase_Model()
	 * @generated
	 */
	void setBase_Model(Model value);

} // ConstraintsModel
