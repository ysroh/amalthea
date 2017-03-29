/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quartz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getQuartz()
 * @model
 * @generated
 */
public interface Quartz extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"_undefined_"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType
	 * @see #setType(QType)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getQuartz_Type()
	 * @model default="_undefined_" required="true" ordered="false"
	 * @generated
	 */
	QType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType
	 * @see #getType()
	 * @generated
	 */
	void setType(QType value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' reference.
	 * @see #setFrequency(Frequency)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getQuartz_Frequency()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Frequency getFrequency();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz#getFrequency <em>Frequency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Frequency value);

} // Quartz
