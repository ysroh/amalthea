/**
 */
package AMALTHEA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.Runnable#isService <em>Service</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getRunnable()
 * @model
 * @generated
 */
public interface Runnable extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(boolean)
	 * @see AMALTHEA.AMALTHEAPackage#getRunnable_Service()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isService();

	/**
	 * Sets the value of the '{@link AMALTHEA.Runnable#isService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #isService()
	 * @generated
	 */
	void setService(boolean value);

} // Runnable
