/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

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
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable#getCustomProperties <em>Custom Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getIAnnotatable()
 * @model abstract="true"
 * @generated
 */
public interface IAnnotatable extends EObject {
	/**
	 * Returns the value of the '<em><b>Custom Properties</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Properties</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getIAnnotatable_CustomProperties()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CustomProperty> getCustomProperties();

} // IAnnotatable
