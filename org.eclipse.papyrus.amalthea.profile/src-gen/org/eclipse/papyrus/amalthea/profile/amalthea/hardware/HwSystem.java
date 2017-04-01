/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hw System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem#getEcus <em>Ecus</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem#getSystemtype <em>Systemtype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getHwSystem()
 * @model
 * @generated
 */
public interface HwSystem extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Ecus</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecus</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getHwSystem_Ecus()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ECU> getEcus();

	/**
	 * Returns the value of the '<em><b>Systemtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systemtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systemtype</em>' reference.
	 * @see #setSystemtype(SystemType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getHwSystem_Systemtype()
	 * @model ordered="false"
	 * @generated
	 */
	SystemType getSystemtype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem#getSystemtype <em>Systemtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemtype</em>' reference.
	 * @see #getSystemtype()
	 * @generated
	 */
	void setSystemtype(SystemType value);

} // HwSystem
