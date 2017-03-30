/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime#getBase_Element <em>Base Element</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getAbstractTime()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Element</em>' reference.
	 * @see #setBase_Element(Element)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getAbstractTime_Base_Element()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Element getBase_Element();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime#getBase_Element <em>Base Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Element</em>' reference.
	 * @see #getBase_Element()
	 * @generated
	 */
	void setBase_Element(Element value);

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
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getAbstractTime_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getAbstractTime_Unit()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.AbstractTime#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

} // AbstractTime
