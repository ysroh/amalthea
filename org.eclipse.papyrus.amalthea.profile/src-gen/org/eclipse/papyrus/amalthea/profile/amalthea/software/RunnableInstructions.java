/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.Instructions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runnable Instructions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getRunnableInstructions()
 * @model
 * @generated
 */
public interface RunnableInstructions extends RunnableItem {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(Instructions)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getRunnableInstructions_Default()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Instructions getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Instructions value);

} // RunnableInstructions
