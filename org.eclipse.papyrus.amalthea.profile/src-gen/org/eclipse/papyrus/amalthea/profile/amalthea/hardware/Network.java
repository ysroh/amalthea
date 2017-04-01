/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network#getNetworktype <em>Networktype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Networktype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networktype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networktype</em>' reference.
	 * @see #setNetworktype(NetworkType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getNetwork_Networktype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NetworkType getNetworktype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network#getNetworktype <em>Networktype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networktype</em>' reference.
	 * @see #getNetworktype()
	 * @generated
	 */
	void setNetworktype(NetworkType value);

} // Network
