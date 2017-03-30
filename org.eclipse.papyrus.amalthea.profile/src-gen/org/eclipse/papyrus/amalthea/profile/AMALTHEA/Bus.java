/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus#getBusType <em>Bus Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getBus()
 * @model
 * @generated
 */
public interface Bus extends NetworkType {
	/**
	 * Returns the value of the '<em><b>Bus Type</b></em>' attribute.
	 * The default value is <code>"_undefined_"</code>.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus Type</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType
	 * @see #setBusType(BusType)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getBus_BusType()
	 * @model default="_undefined_" required="true" ordered="false"
	 * @generated
	 */
	BusType getBusType();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus#getBusType <em>Bus Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Type</em>' attribute.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType
	 * @see #getBusType()
	 * @generated
	 */
	void setBusType(BusType value);

} // Bus
