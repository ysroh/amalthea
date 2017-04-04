/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph#getGraphentries <em>Graphentries</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getCallGraph()
 * @model
 * @generated
 */
public interface CallGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Graphentries</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graphentries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Graphentries</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getCallGraph_Graphentries()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<GraphEntry> getGraphentries();

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getCallGraph_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // CallGraph
