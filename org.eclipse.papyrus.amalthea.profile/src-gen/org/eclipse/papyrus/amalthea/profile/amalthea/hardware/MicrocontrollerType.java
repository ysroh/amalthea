/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microcontroller Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType#getBase_DataType <em>Base Data Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getMicrocontrollerType()
 * @model
 * @generated
 */
public interface MicrocontrollerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getMicrocontrollerType_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

} // MicrocontrollerType
