/**
 */
package AMALTHEA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.Network#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(NetworkType)
	 * @see AMALTHEA.AMALTHEAPackage#getNetwork_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NetworkType getType();

	/**
	 * Sets the value of the '{@link AMALTHEA.Network#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(NetworkType value);

} // Network
