/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage
 * @generated
 */
public interface SoftwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwareFactory eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Call Graph</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Graph</em>'.
	 * @generated
	 */
	CallGraph createCallGraph();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>ISR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISR</em>'.
	 * @generated
	 */
	ISR createISR();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns a new object of class '<em>Call Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Sequence</em>'.
	 * @generated
	 */
	CallSequence createCallSequence();

	/**
	 * Returns a new object of class '<em>Inter Process Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inter Process Activation</em>'.
	 * @generated
	 */
	InterProcessActivation createInterProcessActivation();

	/**
	 * Returns a new object of class '<em>Task Runnable Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Runnable Call</em>'.
	 * @generated
	 */
	TaskRunnableCall createTaskRunnableCall();

	/**
	 * Returns a new object of class '<em>Label Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Access</em>'.
	 * @generated
	 */
	LabelAccess createLabelAccess();

	/**
	 * Returns a new object of class '<em>Runnable Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runnable Instructions</em>'.
	 * @generated
	 */
	RunnableInstructions createRunnableInstructions();

	/**
	 * Returns a new object of class '<em>Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runnable</em>'.
	 * @generated
	 */
	Runnable createRunnable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SoftwarePackage getSoftwarePackage();

} //SoftwareFactory
