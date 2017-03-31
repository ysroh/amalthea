/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getFrequency()
 * @model
 * @generated
 */
public interface Frequency extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getFrequency_Value()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"_undefined_"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit
	 * @see #setUnit(FrequencyUnit)
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage#getFrequency_Unit()
	 * @model default="_undefined_" required="true" ordered="false"
	 * @generated
	 */
	FrequencyUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.FrequencyUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(FrequencyUnit value);

} // Frequency
