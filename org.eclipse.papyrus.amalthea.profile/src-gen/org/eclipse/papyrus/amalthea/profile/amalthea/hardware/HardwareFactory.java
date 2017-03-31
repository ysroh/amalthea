/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage
 * @generated
 */
public interface HardwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HardwareFactory eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Type</em>'.
	 * @generated
	 */
	SystemType createSystemType();

	/**
	 * Returns a new object of class '<em>ECU Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECU Type</em>'.
	 * @generated
	 */
	ECUType createECUType();

	/**
	 * Returns a new object of class '<em>Microcontroller Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microcontroller Type</em>'.
	 * @generated
	 */
	MicrocontrollerType createMicrocontrollerType();

	/**
	 * Returns a new object of class '<em>Hw System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hw System</em>'.
	 * @generated
	 */
	HwSystem createHwSystem();

	/**
	 * Returns a new object of class '<em>ECU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECU</em>'.
	 * @generated
	 */
	ECU createECU();

	/**
	 * Returns a new object of class '<em>Microcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Microcontroller</em>'.
	 * @generated
	 */
	Microcontroller createMicrocontroller();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Type</em>'.
	 * @generated
	 */
	NetworkType createNetworkType();

	/**
	 * Returns a new object of class '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core</em>'.
	 * @generated
	 */
	Core createCore();

	/**
	 * Returns a new object of class '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bus</em>'.
	 * @generated
	 */
	Bus createBus();

	/**
	 * Returns a new object of class '<em>Quartz</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quartz</em>'.
	 * @generated
	 */
	Quartz createQuartz();

	/**
	 * Returns a new object of class '<em>Prescaler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prescaler</em>'.
	 * @generated
	 */
	Prescaler createPrescaler();

	/**
	 * Returns a new object of class '<em>Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frequency</em>'.
	 * @generated
	 */
	Frequency createFrequency();

	/**
	 * Returns a new object of class '<em>HW Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HW Model</em>'.
	 * @generated
	 */
	HWModel createHWModel();

	/**
	 * Returns a new object of class '<em>Core Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Type</em>'.
	 * @generated
	 */
	CoreType createCoreType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HardwarePackage getHardwarePackage();

} //HardwareFactory
