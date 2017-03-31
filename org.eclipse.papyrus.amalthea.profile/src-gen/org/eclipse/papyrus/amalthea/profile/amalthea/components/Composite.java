/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.components;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.Composite#getComponentinstances <em>Componentinstances</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends Component {
	/**
	 * Returns the value of the '<em><b>Componentinstances</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componentinstances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentinstances</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage#getComposite_Componentinstances()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ComponentInstance> getComponentinstances();

} // Composite
