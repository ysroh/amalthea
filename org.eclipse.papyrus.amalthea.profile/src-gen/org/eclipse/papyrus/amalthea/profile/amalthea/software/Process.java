/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Process#getCallgraph <em>Callgraph</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getProcess()
 * @model abstract="true"
 * @generated
 */
public interface Process extends AbstractProcess {
	/**
	 * Returns the value of the '<em><b>Callgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callgraph</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callgraph</em>' reference.
	 * @see #setCallgraph(CallGraph)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getProcess_Callgraph()
	 * @model ordered="false"
	 * @generated
	 */
	CallGraph getCallgraph();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Process#getCallgraph <em>Callgraph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callgraph</em>' reference.
	 * @see #getCallgraph()
	 * @generated
	 */
	void setCallgraph(CallGraph value);

} // Process
