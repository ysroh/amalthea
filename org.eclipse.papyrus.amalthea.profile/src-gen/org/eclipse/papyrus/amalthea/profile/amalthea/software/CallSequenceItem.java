/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Sequence Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CallSequenceItems are owned
 * operations of CallSequence Class
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getCallSequenceItem()
 * @model abstract="true"
 * @generated
 */
public interface CallSequenceItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Operation</em>' reference.
	 * @see #setBase_Operation(Operation)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getCallSequenceItem_Base_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' reference.
	 * @see #setCounter(Counter)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getCallSequenceItem_Counter()
	 * @model ordered="false"
	 * @generated
	 */
	Counter getCounter();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem#getCounter <em>Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(Counter value);

} // CallSequenceItem
