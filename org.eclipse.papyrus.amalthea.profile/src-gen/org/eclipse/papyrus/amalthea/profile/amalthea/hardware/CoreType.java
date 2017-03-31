/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getInstructionsPerCycle <em>Instructions Per Cycle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getCoreType()
 * @model
 * @generated
 */
public interface CoreType extends EObject {
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
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getCoreType_BitWidth()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBitWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getBitWidth <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' attribute.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(int value);

	/**
	 * Returns the value of the '<em><b>Instructions Per Cycle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions Per Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions Per Cycle</em>' attribute.
	 * @see #setInstructionsPerCycle(int)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getCoreType_InstructionsPerCycle()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getInstructionsPerCycle();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType#getInstructionsPerCycle <em>Instructions Per Cycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions Per Cycle</em>' attribute.
	 * @see #getInstructionsPerCycle()
	 * @generated
	 */
	void setInstructionsPerCycle(int value);

} // CoreType
