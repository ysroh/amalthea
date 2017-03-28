/**
 */
package AMALTHEA;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ConnectorEnd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.QualifiedPort#getBase_ConnectorEnd <em>Base Connector End</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getQualifiedPort()
 * @model
 * @generated
 */
public interface QualifiedPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Connector End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector End</em>' reference.
	 * @see #setBase_ConnectorEnd(ConnectorEnd)
	 * @see AMALTHEA.AMALTHEAPackage#getQualifiedPort_Base_ConnectorEnd()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConnectorEnd getBase_ConnectorEnd();

	/**
	 * Sets the value of the '{@link AMALTHEA.QualifiedPort#getBase_ConnectorEnd <em>Base Connector End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector End</em>' reference.
	 * @see #getBase_ConnectorEnd()
	 * @generated
	 */
	void setBase_ConnectorEnd(ConnectorEnd value);

} // QualifiedPort
