/**
 */
package AMALTHEA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.Core#getCoreType <em>Core Type</em>}</li>
 *   <li>{@link AMALTHEA.Core#getLockstepGroup <em>Lockstep Group</em>}</li>
 * </ul>
 *
 * @see AMALTHEA.AMALTHEAPackage#getCore()
 * @model
 * @generated
 */
public interface Core extends ComplexNode {
	/**
	 * Returns the value of the '<em><b>Core Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Type</em>' reference.
	 * @see #setCoreType(CoreType)
	 * @see AMALTHEA.AMALTHEAPackage#getCore_CoreType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CoreType getCoreType();

	/**
	 * Sets the value of the '{@link AMALTHEA.Core#getCoreType <em>Core Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Type</em>' reference.
	 * @see #getCoreType()
	 * @generated
	 */
	void setCoreType(CoreType value);

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
	 * @see AMALTHEA.AMALTHEAPackage#getCore_LockstepGroup()
	 * @model default="0" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getLockstepGroup();

	/**
	 * Sets the value of the '{@link AMALTHEA.Core#getLockstepGroup <em>Lockstep Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lockstep Group</em>' attribute.
	 * @see #getLockstepGroup()
	 * @generated
	 */
	void setLockstepGroup(int value);

} // Core
