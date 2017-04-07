/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.stimuli;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StimuliModel'"
 * @generated
 */
public interface StimuliPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stimuli";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/2017/Amalthea/Stimuli";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Stimuli";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StimuliPackage eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimulusImpl <em>Stimulus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimulusImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl#getStimulus()
	 * @generated
	 */
	int STIMULUS = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Stimulus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STIMULUS_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.SingleImpl <em>Single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.SingleImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl#getSingle()
	 * @generated
	 */
	int SINGLE = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__BASE_CLASS = STIMULUS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__IS_ENCAPSULATED = STIMULUS__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE__ACTIVATION = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE___GET_REFERENCES = STIMULUS___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE___GET_PARTS = STIMULUS___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE___GET_FLOW_PROPERTIES = STIMULUS___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.PeriodicImpl <em>Periodic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.PeriodicImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl#getPeriodic()
	 * @generated
	 */
	int PERIODIC = 1;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__BASE_CLASS = STIMULUS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__IS_ENCAPSULATED = STIMULUS__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Recurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__RECURRENCE = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC__OFFSET = STIMULUS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC___GET_REFERENCES = STIMULUS___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC___GET_PARTS = STIMULUS___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC___GET_FLOW_PROPERTIES = STIMULUS___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.InterprocessImpl <em>Interprocess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.InterprocessImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl#getInterprocess()
	 * @generated
	 */
	int INTERPROCESS = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCESS__BASE_CLASS = STIMULUS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCESS__IS_ENCAPSULATED = STIMULUS__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCESS__COUNTER = STIMULUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCESS_FEATURE_COUNT = STIMULUS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCESS___GET_REFERENCES = STIMULUS___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCESS___GET_PARTS = STIMULUS___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCESS___GET_FLOW_PROPERTIES = STIMULUS___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Interprocess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPROCESS_OPERATION_COUNT = STIMULUS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Single <em>Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Single
	 * @generated
	 */
	EClass getSingle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Single#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activation</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Single#getActivation()
	 * @see #getSingle()
	 * @generated
	 */
	EReference getSingle_Activation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Stimulus <em>Stimulus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stimulus</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Stimulus
	 * @generated
	 */
	EClass getStimulus();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic <em>Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic
	 * @generated
	 */
	EClass getPeriodic();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic#getRecurrence <em>Recurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recurrence</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic#getRecurrence()
	 * @see #getPeriodic()
	 * @generated
	 */
	EReference getPeriodic_Recurrence();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Offset</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic#getOffset()
	 * @see #getPeriodic()
	 * @generated
	 */
	EReference getPeriodic_Offset();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Interprocess <em>Interprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interprocess</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Interprocess
	 * @generated
	 */
	EClass getInterprocess();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Interprocess#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Counter</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Interprocess#getCounter()
	 * @see #getInterprocess()
	 * @generated
	 */
	EReference getInterprocess_Counter();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StimuliFactory getStimuliFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.SingleImpl <em>Single</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.SingleImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl#getSingle()
		 * @generated
		 */
		EClass SINGLE = eINSTANCE.getSingle();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE__ACTIVATION = eINSTANCE.getSingle_Activation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimulusImpl <em>Stimulus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimulusImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl#getStimulus()
		 * @generated
		 */
		EClass STIMULUS = eINSTANCE.getStimulus();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.PeriodicImpl <em>Periodic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.PeriodicImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl#getPeriodic()
		 * @generated
		 */
		EClass PERIODIC = eINSTANCE.getPeriodic();

		/**
		 * The meta object literal for the '<em><b>Recurrence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC__RECURRENCE = eINSTANCE.getPeriodic_Recurrence();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIODIC__OFFSET = eINSTANCE.getPeriodic_Offset();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.InterprocessImpl <em>Interprocess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.InterprocessImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl#getInterprocess()
		 * @generated
		 */
		EClass INTERPROCESS = eINSTANCE.getInterprocess();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPROCESS__COUNTER = eINSTANCE.getInterprocess_Counter();

	}

} //StimuliPackage
