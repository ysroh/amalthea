/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU#getEcuType <em>Ecu Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU#getMicrocontrollers <em>Microcontrollers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getECU()
 * @model
 * @generated
 */
public interface ECU extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Ecu Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecu Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecu Type</em>' reference.
	 * @see #setEcuType(ECUType)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getECU_EcuType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ECUType getEcuType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU#getEcuType <em>Ecu Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecu Type</em>' reference.
	 * @see #getEcuType()
	 * @generated
	 */
	void setEcuType(ECUType value);

	/**
	 * Returns the value of the '<em><b>Microcontrollers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microcontrollers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontrollers</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getECU_Microcontrollers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Microcontroller> getMicrocontrollers();

} // ECU
