/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.common;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getBase_DataType <em>Base Data Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getAbstractTime()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getAbstractTime_Value()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.amalthea.common.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getAbstractTime_Unit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage#getAbstractTime_Base_DataType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.common.AbstractTime#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

} // AbstractTime
