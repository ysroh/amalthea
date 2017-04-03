/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter#getCounterOffset <em>Counter Offset</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter#getCounterPrescaler <em>Counter Prescaler</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getCounter()
 * @model
 * @generated
 */
public interface Counter extends EObject {
	/**
	 * Returns the value of the '<em><b>Counter Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Offset</em>' attribute.
	 * @see #setCounterOffset(int)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getCounter_CounterOffset()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCounterOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter#getCounterOffset <em>Counter Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Offset</em>' attribute.
	 * @see #getCounterOffset()
	 * @generated
	 */
	void setCounterOffset(int value);

	/**
	 * Returns the value of the '<em><b>Counter Prescaler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Prescaler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Prescaler</em>' attribute.
	 * @see #setCounterPrescaler(int)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getCounter_CounterPrescaler()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCounterPrescaler();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter#getCounterPrescaler <em>Counter Prescaler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Prescaler</em>' attribute.
	 * @see #getCounterPrescaler()
	 * @generated
	 */
	void setCounterPrescaler(int value);

} // Counter
