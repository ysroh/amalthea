/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microcontroller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller#getCores <em>Cores</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller#getMicrocontrollertype <em>Microcontrollertype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getMicrocontroller()
 * @model
 * @generated
 */
public interface Microcontroller extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Cores</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getMicrocontroller_Cores()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Core> getCores();

	/**
	 * Returns the value of the '<em><b>Microcontrollertype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Microcontrollertype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microcontrollertype</em>' reference.
	 * @see #setMicrocontrollertype(MicrocontrollerType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getMicrocontroller_Microcontrollertype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MicrocontrollerType getMicrocontrollertype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller#getMicrocontrollertype <em>Microcontrollertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microcontrollertype</em>' reference.
	 * @see #getMicrocontrollertype()
	 * @generated
	 */
	void setMicrocontrollertype(MicrocontrollerType value);

} // Microcontroller
