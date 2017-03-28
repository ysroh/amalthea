/**
 */
package AMALTHEA;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescaler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.Prescaler#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link AMALTHEA.Prescaler#getClockRatio <em>Clock Ratio</em>}</li>
 *   <li>{@link AMALTHEA.Prescaler#getQuartz <em>Quartz</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getPrescaler()
 * @model
 * @generated
 */
public interface Prescaler extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see AMALTHEA.AMALTHEAPackage#getPrescaler_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link AMALTHEA.Prescaler#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Clock Ratio</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Ratio</em>' attribute.
	 * @see #setClockRatio(double)
	 * @see AMALTHEA.AMALTHEAPackage#getPrescaler_ClockRatio()
	 * @model default="0.0" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getClockRatio();

	/**
	 * Sets the value of the '{@link AMALTHEA.Prescaler#getClockRatio <em>Clock Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Ratio</em>' attribute.
	 * @see #getClockRatio()
	 * @generated
	 */
	void setClockRatio(double value);

	/**
	 * Returns the value of the '<em><b>Quartz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quartz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quartz</em>' reference.
	 * @see #setQuartz(Quartz)
	 * @see AMALTHEA.AMALTHEAPackage#getPrescaler_Quartz()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Quartz getQuartz();

	/**
	 * Sets the value of the '{@link AMALTHEA.Prescaler#getQuartz <em>Quartz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quartz</em>' reference.
	 * @see #getQuartz()
	 * @generated
	 */
	void setQuartz(Quartz value);

} // Prescaler
