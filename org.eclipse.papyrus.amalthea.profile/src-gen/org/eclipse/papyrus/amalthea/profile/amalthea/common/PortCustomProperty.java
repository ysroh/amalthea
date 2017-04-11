/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common;

import org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Custom Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.PortCustomProperty#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getPortCustomProperty()
 * @model
 * @generated
 */
public interface PortCustomProperty extends CustomProperty {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(FInterfacePort)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getPortCustomProperty_Port()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FInterfacePort getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.PortCustomProperty#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(FInterfacePort value);

} // PortCustomProperty
