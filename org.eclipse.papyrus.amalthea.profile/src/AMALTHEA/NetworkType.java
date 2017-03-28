/**
 */
package AMALTHEA;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.NetworkType#getSchedPolicy <em>Sched Policy</em>}</li>
 *   <li>{@link AMALTHEA.NetworkType#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link AMALTHEA.NetworkType#getBase_DataType <em>Base Data Type</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getNetworkType()
 * @model
 * @generated
 */
public interface NetworkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sched Policy</b></em>' attribute.
	 * The default value is <code>"_undefined_"</code>.
	 * The literals are from the enumeration {@link AMALTHEA.SchedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Policy</em>' attribute.
	 * @see AMALTHEA.SchedType
	 * @see #setSchedPolicy(SchedType)
	 * @see AMALTHEA.AMALTHEAPackage#getNetworkType_SchedPolicy()
	 * @model default="_undefined_" required="true" ordered="false"
	 * @generated
	 */
	SchedType getSchedPolicy();

	/**
	 * Sets the value of the '{@link AMALTHEA.NetworkType#getSchedPolicy <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Policy</em>' attribute.
	 * @see AMALTHEA.SchedType
	 * @see #getSchedPolicy()
	 * @generated
	 */
	void setSchedPolicy(SchedType value);

	/**
	 * Returns the value of the '<em><b>Bit Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Width</em>' attribute.
	 * @see #setBitWidth(int)
	 * @see AMALTHEA.AMALTHEAPackage#getNetworkType_BitWidth()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBitWidth();

	/**
	 * Sets the value of the '{@link AMALTHEA.NetworkType#getBitWidth <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' attribute.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(int value);

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
	 * @see AMALTHEA.AMALTHEAPackage#getNetworkType_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link AMALTHEA.NetworkType#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

} // NetworkType
