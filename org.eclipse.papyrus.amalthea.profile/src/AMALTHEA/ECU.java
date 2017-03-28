/**
 */
package AMALTHEA;

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
 *   <li>{@link AMALTHEA.ECU#getEcuType <em>Ecu Type</em>}</li>
 *   <li>{@link AMALTHEA.ECU#getMicrocontrollers <em>Microcontrollers</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getECU()
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
	 * @see AMALTHEA.AMALTHEAPackage#getECU_EcuType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ECUType getEcuType();

	/**
	 * Sets the value of the '{@link AMALTHEA.ECU#getEcuType <em>Ecu Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ecu Type</em>' reference.
	 * @see #getEcuType()
	 * @generated
	 */
	void setEcuType(ECUType value);

	/**
	 * Returns the value of the '<em><b>Microcontrollers</b></em>' containment reference list.
	 * The list contents are of type {@link AMALTHEA.Microcontroller}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microcontrollers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontrollers</em>' containment reference list.
	 * @see AMALTHEA.AMALTHEAPackage#getECU_Microcontrollers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Microcontroller> getMicrocontrollers();

} // ECU
