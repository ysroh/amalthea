/**
 */
package AMALTHEA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.ComplexNode#getQuartzes <em>Quartzes</em>}</li>
 *   <li>{@link AMALTHEA.ComplexNode#getPrescaler <em>Prescaler</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getComplexNode()
 * @model abstract="true"
 * @generated
 */
public interface ComplexNode extends Block {
	/**
	 * Returns the value of the '<em><b>Quartzes</b></em>' containment reference list.
	 * The list contents are of type {@link AMALTHEA.Quartz}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quartzes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quartzes</em>' containment reference list.
	 * @see AMALTHEA.AMALTHEAPackage#getComplexNode_Quartzes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Quartz> getQuartzes();

	/**
	 * Returns the value of the '<em><b>Prescaler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescaler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescaler</em>' containment reference.
	 * @see #setPrescaler(Prescaler)
	 * @see AMALTHEA.AMALTHEAPackage#getComplexNode_Prescaler()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Prescaler getPrescaler();

	/**
	 * Sets the value of the '{@link AMALTHEA.ComplexNode#getPrescaler <em>Prescaler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescaler</em>' containment reference.
	 * @see #getPrescaler()
	 * @generated
	 */
	void setPrescaler(Prescaler value);

} // ComplexNode
