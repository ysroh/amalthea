/**
 */
package AMALTHEA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quartz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.Quartz#getType <em>Type</em>}</li>
 *   <li>{@link AMALTHEA.Quartz#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getQuartz()
 * @model
 * @generated
 */
public interface Quartz extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"_undefined_"</code>.
	 * The literals are from the enumeration {@link AMALTHEA.QType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see AMALTHEA.QType
	 * @see #setType(QType)
	 * @see AMALTHEA.AMALTHEAPackage#getQuartz_Type()
	 * @model default="_undefined_" required="true" ordered="false"
	 * @generated
	 */
	QType getType();

	/**
	 * Sets the value of the '{@link AMALTHEA.Quartz#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see AMALTHEA.QType
	 * @see #getType()
	 * @generated
	 */
	void setType(QType value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(Frequency)
	 * @see AMALTHEA.AMALTHEAPackage#getQuartz_Frequency()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Frequency getFrequency();

	/**
	 * Sets the value of the '{@link AMALTHEA.Quartz#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Frequency value);

} // Quartz
