/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

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
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU#getMicrocontrollers <em>Microcontrollers</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU#getEcutype <em>Ecutype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getECU()
 * @model
 * @generated
 */
public interface ECU extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Microcontrollers</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microcontrollers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontrollers</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getECU_Microcontrollers()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Microcontroller> getMicrocontrollers();

	/**
	 * Returns the value of the '<em><b>Ecutype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecutype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecutype</em>' reference.
	 * @see #setEcutype(ECUType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getECU_Ecutype()
	 * @model ordered="false"
	 * @generated
	 */
	ECUType getEcutype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU#getEcutype <em>Ecutype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecutype</em>' reference.
	 * @see #getEcutype()
	 * @generated
	 */
	void setEcutype(ECUType value);

} // ECU
