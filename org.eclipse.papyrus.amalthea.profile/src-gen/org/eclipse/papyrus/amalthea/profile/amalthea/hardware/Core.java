/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core#getLockstepGroup <em>Lockstep Group</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core#getCoretype <em>Coretype</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getCore()
 * @model
 * @generated
 */
public interface Core extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Lockstep Group</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lockstep Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lockstep Group</em>' attribute.
	 * @see #setLockstepGroup(int)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getCore_LockstepGroup()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getLockstepGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core#getLockstepGroup <em>Lockstep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lockstep Group</em>' attribute.
	 * @see #getLockstepGroup()
	 * @generated
	 */
	void setLockstepGroup(int value);

	/**
	 * Returns the value of the '<em><b>Coretype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coretype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coretype</em>' reference.
	 * @see #setCoretype(CoreType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getCore_Coretype()
	 * @model ordered="false"
	 * @generated
	 */
	CoreType getCoretype();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core#getCoretype <em>Coretype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coretype</em>' reference.
	 * @see #getCoretype()
	 * @generated
	 */
	void setCoretype(CoreType value);

} // Core
