/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.os;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage
 * @generated
 */
public interface OsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsFactory eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Operating System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operating System</em>'.
	 * @generated
	 */
	OperatingSystem createOperatingSystem();

	/**
	 * Returns a new object of class '<em>Task Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Scheduler</em>'.
	 * @generated
	 */
	TaskScheduler createTaskScheduler();

	/**
	 * Returns a new object of class '<em>Interrupt Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interrupt Controller</em>'.
	 * @generated
	 */
	InterruptController createInterruptController();

	/**
	 * Returns a new object of class '<em>Scheduling HW Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduling HW Unit</em>'.
	 * @generated
	 */
	SchedulingHWUnit createSchedulingHWUnit();

	/**
	 * Returns a new object of class '<em>OSEK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OSEK</em>'.
	 * @generated
	 */
	OSEK createOSEK();

	/**
	 * Returns a new object of class '<em>Priority Based</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Priority Based</em>'.
	 * @generated
	 */
	PriorityBased createPriorityBased();

	/**
	 * Returns a new object of class '<em>OS Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OS Model</em>'.
	 * @generated
	 */
	OSModel createOSModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OsPackage getOsPackage();

} //OsFactory
