/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FInterface Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getFInterfacePort()
 * @model
 * @generated
 */
public interface FInterfacePort extends Port {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"_undefined_"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind
	 * @see #setKind(InterfaceKind)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getFInterfacePort_Kind()
	 * @model default="_undefined_" required="true" ordered="false"
	 * @generated
	 */
	InterfaceKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(InterfaceKind value);

} // FInterfacePort
