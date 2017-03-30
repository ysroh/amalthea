/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduling Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingUnit#getBase_Element <em>Base Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getSchedulingUnit()
 * @model abstract="true"
 * @generated
 */
public interface SchedulingUnit extends EObject {

	/**
	 * Returns the value of the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Element</em>' reference.
	 * @see #setBase_Element(Element)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getSchedulingUnit_Base_Element()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Element getBase_Element();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedulingUnit#getBase_Element <em>Base Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Element</em>' reference.
	 * @see #getBase_Element()
	 * @generated
	 */
	void setBase_Element(Element value);
} // SchedulingUnit
