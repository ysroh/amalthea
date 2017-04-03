/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess#isBuffered <em>Is Buffered</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess#getAccess <em>Access</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getLabelAccess()
 * @model
 * @generated
 */
public interface LabelAccess extends RunnableItem {
	/**
	 * Returns the value of the '<em><b>Is Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Buffered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Buffered</em>' attribute.
	 * @see #setIsBuffered(boolean)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getLabelAccess_IsBuffered()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBuffered();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess#isBuffered <em>Is Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Buffered</em>' attribute.
	 * @see #isBuffered()
	 * @generated
	 */
	void setIsBuffered(boolean value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum
	 * @see #setAccess(LabelAccessEnum)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getLabelAccess_Access()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LabelAccessEnum getAccess();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(LabelAccessEnum value);

} // LabelAccess
