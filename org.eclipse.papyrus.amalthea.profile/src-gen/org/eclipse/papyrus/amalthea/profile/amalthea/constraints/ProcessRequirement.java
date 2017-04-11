/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#getProcessRequirement()
 * @model
 * @generated
 */
public interface ProcessRequirement extends Requirement {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(AbstractProcess)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#getProcessRequirement_Process()
	 * @model ordered="false"
	 * @generated
	 */
	AbstractProcess getProcess();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(AbstractProcess value);

} // ProcessRequirement
