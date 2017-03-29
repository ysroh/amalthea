/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

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
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getQuartzes <em>Quartzes</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getPrescaler <em>Prescaler</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getNetworks <em>Networks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getComplexNode()
 * @model abstract="true"
 * @generated
 */
public interface ComplexNode extends Block {
	/**
	 * Returns the value of the '<em><b>Quartzes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quartzes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quartzes</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getComplexNode_Quartzes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Quartz> getQuartzes();

	/**
	 * Returns the value of the '<em><b>Prescaler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescaler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescaler</em>' reference.
	 * @see #setPrescaler(Prescaler)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getComplexNode_Prescaler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Prescaler getPrescaler();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode#getPrescaler <em>Prescaler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescaler</em>' reference.
	 * @see #getPrescaler()
	 * @generated
	 */
	void setPrescaler(Prescaler value);

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getComplexNode_Networks()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Network> getNetworks();

} // ComplexNode
