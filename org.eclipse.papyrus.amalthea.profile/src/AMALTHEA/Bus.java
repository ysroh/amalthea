/**
 */
package AMALTHEA;

import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.Bus#getBusType <em>Bus Type</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends NetworkType, Block {
	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' attribute.
	 * The default value is <code>"_undefined_"</code>.
	 * The literals are from the enumeration {@link AMALTHEA.BusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Type</em>' attribute.
	 * @see AMALTHEA.BusType
	 * @see #setBusType(BusType)
	 * @see AMALTHEA.AMALTHEAPackage#getBus_BusType()
	 * @model default="_undefined_" required="true" ordered="false"
	 * @generated
	 */
	BusType getBusType();

	/**
	 * Sets the value of the '{@link AMALTHEA.Bus#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' attribute.
	 * @see AMALTHEA.BusType
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(BusType value);

} // Bus
