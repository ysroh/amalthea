/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quartz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getQuartz()
 * @model
 * @generated
 */
public interface Quartz extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"_undefined_"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType
	 * @see #setType(QType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getQuartz_Type()
	 * @model default="_undefined_" required="true" ordered="false"
	 * @generated
	 */
	QType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.QType
	 * @see #getType()
	 * @generated
	 */
	void setType(QType value);

} // Quartz
