/**
 */
package AMALTHEA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.Microcontroller#getMicrocontrollerType <em>Microcontroller Type</em>}</li>
 *   <li>{@link AMALTHEA.Microcontroller#getCores <em>Cores</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getMicrocontroller()
 * @model
 * @generated
 */
public interface Microcontroller extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Microcontroller Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microcontroller Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontroller Type</em>' reference.
	 * @see #setMicrocontrollerType(MicrocontrollerType)
	 * @see AMALTHEA.AMALTHEAPackage#getMicrocontroller_MicrocontrollerType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MicrocontrollerType getMicrocontrollerType();

	/**
	 * Sets the value of the '{@link AMALTHEA.Microcontroller#getMicrocontrollerType <em>Microcontroller Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microcontroller Type</em>' reference.
	 * @see #getMicrocontrollerType()
	 * @generated
	 */
	void setMicrocontrollerType(MicrocontrollerType value);

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' containment reference.
	 * @see #setCores(Core)
	 * @see AMALTHEA.AMALTHEAPackage#getMicrocontroller_Cores()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Core getCores();

	/**
	 * Sets the value of the '{@link AMALTHEA.Microcontroller#getCores <em>Cores</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' containment reference.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(Core value);

} // Microcontroller
