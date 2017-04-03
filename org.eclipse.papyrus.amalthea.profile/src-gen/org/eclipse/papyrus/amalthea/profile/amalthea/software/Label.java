/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isBVolatile <em>BVolatile</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isBuffered <em>Buffered</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#getNumberBits <em>Number Bits</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends AbstractElementMemoryInformation {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getLabel_Constant()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>BVolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BVolatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BVolatile</em>' attribute.
	 * @see #setBVolatile(boolean)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getLabel_BVolatile()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBVolatile();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isBVolatile <em>BVolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BVolatile</em>' attribute.
	 * @see #isBVolatile()
	 * @generated
	 */
	void setBVolatile(boolean value);

	/**
	 * Returns the value of the '<em><b>Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffered</em>' attribute.
	 * @see #setBuffered(boolean)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getLabel_Buffered()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBuffered();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isBuffered <em>Buffered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffered</em>' attribute.
	 * @see #isBuffered()
	 * @generated
	 */
	void setBuffered(boolean value);

	/**
	 * Returns the value of the '<em><b>Number Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Bits</em>' attribute.
	 * @see #setNumberBits(int)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#getLabel_NumberBits()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberBits();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#getNumberBits <em>Number Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Bits</em>' attribute.
	 * @see #getNumberBits()
	 * @generated
	 */
	void setNumberBits(int value);

} // Label
