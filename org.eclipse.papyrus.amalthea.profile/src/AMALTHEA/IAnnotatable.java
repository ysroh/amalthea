/**
 */
package AMALTHEA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAnnotatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.IAnnotatable#getCustomProperties <em>Custom Properties</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getIAnnotatable()
 * @model abstract="true"
 * @generated
 */
public interface IAnnotatable extends EObject {
	/**
	 * Returns the value of the '<em><b>Custom Properties</b></em>' containment reference list.
	 * The list contents are of type {@link AMALTHEA.CustomProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Properties</em>' containment reference list.
	 * @see AMALTHEA.AMALTHEAPackage#getIAnnotatable_CustomProperties()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CustomProperty> getCustomProperties();

} // IAnnotatable
