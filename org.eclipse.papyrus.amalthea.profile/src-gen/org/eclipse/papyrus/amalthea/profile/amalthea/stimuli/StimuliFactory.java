/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.stimuli;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage
 * @generated
 */
public interface StimuliFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StimuliFactory eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Single</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single</em>'.
	 * @generated
	 */
	Single createSingle();

	/**
	 * Returns a new object of class '<em>Periodic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic</em>'.
	 * @generated
	 */
	Periodic createPeriodic();

	/**
	 * Returns a new object of class '<em>Interprocess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interprocess</em>'.
	 * @generated
	 */
	Interprocess createInterprocess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StimuliPackage getStimuliPackage();

} //StimuliFactory
