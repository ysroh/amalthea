/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

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
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem#getSystemType <em>System Type</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem#getEcus <em>Ecus</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getHwSystem()
 * @model
 * @generated
 */
public interface HwSystem extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>System Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Type</em>' reference.
	 * @see #setSystemType(SystemType)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getHwSystem_SystemType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SystemType getSystemType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem#getSystemType <em>System Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Type</em>' reference.
	 * @see #getSystemType()
	 * @generated
	 */
	void setSystemType(SystemType value);

	/**
	 * Returns the value of the '<em><b>Ecus</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecus</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecus</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getHwSystem_Ecus()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ECU> getEcus();

} // HwSystem
