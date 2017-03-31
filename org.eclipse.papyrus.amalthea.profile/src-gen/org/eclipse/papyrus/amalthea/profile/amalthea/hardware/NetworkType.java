/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getSchedPolicy <em>Sched Policy</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getBitWidth <em>Bit Width</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getNetworkType()
 * @model
 * @generated
 */
public interface NetworkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sched Policy</b></em>' attribute.
	 * The default value is <code>"_undefined_"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Policy</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType
	 * @see #setSchedPolicy(SchedType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getNetworkType_SchedPolicy()
	 * @model default="_undefined_" required="true" ordered="false"
	 * @generated
	 */
	SchedType getSchedPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getSchedPolicy <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Policy</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SchedType
	 * @see #getSchedPolicy()
	 * @generated
	 */
	void setSchedPolicy(SchedType value);

	/**
	 * Returns the value of the '<em><b>Bit Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Width</em>' attribute.
	 * @see #setBitWidth(int)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getNetworkType_BitWidth()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getBitWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType#getBitWidth <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' attribute.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(int value);

} // NetworkType
