/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwareFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SWModel'"
 * @generated
 */
public interface SoftwarePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "software";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/2017/Amalthea/Software";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Software";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoftwarePackage eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableItemImpl <em>Runnable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableItemImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getRunnableItem()
	 * @generated
	 */
	int RUNNABLE_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ITEM__BASE_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Runnable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Runnable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceItemImpl <em>Call Sequence Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceItemImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getCallSequenceItem()
	 * @generated
	 */
	int CALL_SEQUENCE_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_ITEM__BASE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_ITEM__COUNTER = 1;

	/**
	 * The number of structural features of the '<em>Call Sequence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Call Sequence Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.AbstractElementMemoryInformationImpl <em>Abstract Element Memory Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.AbstractElementMemoryInformationImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getAbstractElementMemoryInformation()
	 * @generated
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION__BASE_CLASS = BlocksPackage.BLOCK__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION__IS_ENCAPSULATED = BlocksPackage.BLOCK__IS_ENCAPSULATED;

	/**
	 * The number of structural features of the '<em>Abstract Element Memory Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT = BlocksPackage.BLOCK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_REFERENCES = BlocksPackage.BLOCK___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_PARTS = BlocksPackage.BLOCK___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_FLOW_PROPERTIES = BlocksPackage.BLOCK___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Abstract Element Memory Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT = BlocksPackage.BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.AbstractProcessImpl <em>Abstract Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.AbstractProcessImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getAbstractProcess()
	 * @generated
	 */
	int ABSTRACT_PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__BASE_CLASS = ABSTRACT_ELEMENT_MEMORY_INFORMATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__IS_ENCAPSULATED = ABSTRACT_ELEMENT_MEMORY_INFORMATION__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS__PRIORITY = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_FEATURE_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS___GET_REFERENCES = ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS___GET_PARTS = ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS___GET_FLOW_PROPERTIES = ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Abstract Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROCESS_OPERATION_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.ProcessImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BASE_CLASS = ABSTRACT_PROCESS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IS_ENCAPSULATED = ABSTRACT_PROCESS__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PRIORITY = ABSTRACT_PROCESS__PRIORITY;

	/**
	 * The feature id for the '<em><b>Callgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CALLGRAPH = ABSTRACT_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = ABSTRACT_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_REFERENCES = ABSTRACT_PROCESS___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_PARTS = ABSTRACT_PROCESS___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_FLOW_PROPERTIES = ABSTRACT_PROCESS___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = ABSTRACT_PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallGraphImpl <em>Call Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallGraphImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getCallGraph()
	 * @generated
	 */
	int CALL_GRAPH = 5;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAPH__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Graphentries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAPH__GRAPHENTRIES = 1;

	/**
	 * The number of structural features of the '<em>Call Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Call Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.GraphEntryImpl <em>Graph Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.GraphEntryImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getGraphEntry()
	 * @generated
	 */
	int GRAPH_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ENTRY__BASE_CLASS = 0;

	/**
	 * The number of structural features of the '<em>Graph Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Graph Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 7;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BASE_CLASS = PROCESS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_ENCAPSULATED = PROCESS__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRIORITY = PROCESS__PRIORITY;

	/**
	 * The feature id for the '<em><b>Callgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__CALLGRAPH = PROCESS__CALLGRAPH;

	/**
	 * The feature id for the '<em><b>Preemption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREEMPTION = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiple Task Activation Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MULTIPLE_TASK_ACTIVATION_LIMIT = PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_REFERENCES = PROCESS___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_PARTS = PROCESS___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_FLOW_PROPERTIES = PROCESS___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.ISRImpl <em>ISR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.ISRImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getISR()
	 * @generated
	 */
	int ISR = 8;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__BASE_CLASS = PROCESS__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__IS_ENCAPSULATED = PROCESS__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__PRIORITY = PROCESS__PRIORITY;

	/**
	 * The feature id for the '<em><b>Callgraph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR__CALLGRAPH = PROCESS__CALLGRAPH;

	/**
	 * The number of structural features of the '<em>ISR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_FEATURE_COUNT = PROCESS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR___GET_REFERENCES = PROCESS___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR___GET_PARTS = PROCESS___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR___GET_FLOW_PROPERTIES = PROCESS___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>ISR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISR_OPERATION_COUNT = PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 9;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BASE_CLASS = ABSTRACT_ELEMENT_MEMORY_INFORMATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__IS_ENCAPSULATED = ABSTRACT_ELEMENT_MEMORY_INFORMATION__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CONSTANT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BVolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BVOLATILE = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BUFFERED = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NUMBER_BITS = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL___GET_REFERENCES = ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL___GET_PARTS = ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL___GET_FLOW_PROPERTIES = ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableImpl <em>Runnable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getRunnable()
	 * @generated
	 */
	int RUNNABLE = 10;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__BASE_CLASS = ABSTRACT_ELEMENT_MEMORY_INFORMATION__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Is Encapsulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__IS_ENCAPSULATED = ABSTRACT_ELEMENT_MEMORY_INFORMATION__IS_ENCAPSULATED;

	/**
	 * The feature id for the '<em><b>Callback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__CALLBACK = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE__SERVICE = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_FEATURE_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get References</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE___GET_REFERENCES = ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_REFERENCES;

	/**
	 * The operation id for the '<em>Get Parts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE___GET_PARTS = ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_PARTS;

	/**
	 * The operation id for the '<em>Get Flow Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE___GET_FLOW_PROPERTIES = ABSTRACT_ELEMENT_MEMORY_INFORMATION___GET_FLOW_PROPERTIES;

	/**
	 * The number of operations of the '<em>Runnable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_OPERATION_COUNT = ABSTRACT_ELEMENT_MEMORY_INFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceImpl <em>Call Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getCallSequence()
	 * @generated
	 */
	int CALL_SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE__BASE_CLASS = GRAPH_ENTRY__BASE_CLASS;

	/**
	 * The number of structural features of the '<em>Call Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_FEATURE_COUNT = GRAPH_ENTRY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Call Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_SEQUENCE_OPERATION_COUNT = GRAPH_ENTRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.InterProcessActivationImpl <em>Inter Process Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.InterProcessActivationImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getInterProcessActivation()
	 * @generated
	 */
	int INTER_PROCESS_ACTIVATION = 12;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_ACTIVATION__BASE_OPERATION = CALL_SEQUENCE_ITEM__BASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_ACTIVATION__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The number of structural features of the '<em>Inter Process Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_ACTIVATION_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inter Process Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTER_PROCESS_ACTIVATION_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskRunnableCallImpl <em>Task Runnable Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskRunnableCallImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getTaskRunnableCall()
	 * @generated
	 */
	int TASK_RUNNABLE_CALL = 13;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL__BASE_OPERATION = CALL_SEQUENCE_ITEM__BASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL__COUNTER = CALL_SEQUENCE_ITEM__COUNTER;

	/**
	 * The feature id for the '<em><b>Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL__RUNNABLE = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Runnable Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL_FEATURE_COUNT = CALL_SEQUENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Runnable Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RUNNABLE_CALL_OPERATION_COUNT = CALL_SEQUENCE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelAccessImpl <em>Label Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelAccessImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getLabelAccess()
	 * @generated
	 */
	int LABEL_ACCESS = 14;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__BASE_OPERATION = RUNNABLE_ITEM__BASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Is Buffered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__IS_BUFFERED = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS__ACCESS = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Label Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_ACCESS_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableInstructionsImpl <em>Runnable Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableInstructionsImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getRunnableInstructions()
	 * @generated
	 */
	int RUNNABLE_INSTRUCTIONS = 15;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_INSTRUCTIONS__BASE_OPERATION = RUNNABLE_ITEM__BASE_OPERATION;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_INSTRUCTIONS__DEFAULT = RUNNABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runnable Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_INSTRUCTIONS_FEATURE_COUNT = RUNNABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runnable Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNABLE_INSTRUCTIONS_OPERATION_COUNT = RUNNABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption <em>Preemption</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getPreemption()
	 * @generated
	 */
	int PREEMPTION = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum <em>Label Access Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getLabelAccessEnum()
	 * @generated
	 */
	int LABEL_ACCESS_ENUM = 17;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableItem <em>Runnable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Item</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableItem
	 * @generated
	 */
	EClass getRunnableItem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableItem#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableItem#getBase_Operation()
	 * @see #getRunnableItem()
	 * @generated
	 */
	EReference getRunnableItem_Base_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem <em>Call Sequence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Sequence Item</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem
	 * @generated
	 */
	EClass getCallSequenceItem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem#getBase_Operation()
	 * @see #getCallSequenceItem()
	 * @generated
	 */
	EReference getCallSequenceItem_Base_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Counter</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem#getCounter()
	 * @see #getCallSequenceItem()
	 * @generated
	 */
	EReference getCallSequenceItem_Counter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractElementMemoryInformation <em>Abstract Element Memory Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element Memory Information</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractElementMemoryInformation
	 * @generated
	 */
	EClass getAbstractElementMemoryInformation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess <em>Abstract Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Process</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess
	 * @generated
	 */
	EClass getAbstractProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess#getPriority()
	 * @see #getAbstractProcess()
	 * @generated
	 */
	EAttribute getAbstractProcess_Priority();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Process#getCallgraph <em>Callgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Callgraph</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Process#getCallgraph()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Callgraph();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph <em>Call Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Graph</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph
	 * @generated
	 */
	EClass getCallGraph();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph#getGraphentries <em>Graphentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Graphentries</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph#getGraphentries()
	 * @see #getCallGraph()
	 * @generated
	 */
	EReference getCallGraph_Graphentries();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph#getBase_Class()
	 * @see #getCallGraph()
	 * @generated
	 */
	EReference getCallGraph_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry <em>Graph Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Entry</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry
	 * @generated
	 */
	EClass getGraphEntry();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry#getBase_Class()
	 * @see #getGraphEntry()
	 * @generated
	 */
	EReference getGraphEntry_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Task#getPreemption <em>Preemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Task#getPreemption()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Preemption();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Task#getMultipleTaskActivationLimit <em>Multiple Task Activation Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple Task Activation Limit</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Task#getMultipleTaskActivationLimit()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MultipleTaskActivationLimit();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR <em>ISR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISR</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR
	 * @generated
	 */
	EClass getISR();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isConstant()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Constant();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isBVolatile <em>BVolatile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BVolatile</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isBVolatile()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_BVolatile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isBuffered <em>Buffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Buffered</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#isBuffered()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Buffered();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#getNumberBits <em>Number Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Bits</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Label#getNumberBits()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_NumberBits();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable
	 * @generated
	 */
	EClass getRunnable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable#isCallback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callback</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable#isCallback()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Callback();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable#isService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable#isService()
	 * @see #getRunnable()
	 * @generated
	 */
	EAttribute getRunnable_Service();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence <em>Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Sequence</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence
	 * @generated
	 */
	EClass getCallSequence();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation <em>Inter Process Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inter Process Activation</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation
	 * @generated
	 */
	EClass getInterProcessActivation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall <em>Task Runnable Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Runnable Call</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall
	 * @generated
	 */
	EClass getTaskRunnableCall();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall#getRunnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Runnable</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall#getRunnable()
	 * @see #getTaskRunnableCall()
	 * @generated
	 */
	EReference getTaskRunnableCall_Runnable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess <em>Label Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Access</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess
	 * @generated
	 */
	EClass getLabelAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess#isBuffered <em>Is Buffered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Buffered</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess#isBuffered()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EAttribute getLabelAccess_IsBuffered();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess#getAccess()
	 * @see #getLabelAccess()
	 * @generated
	 */
	EAttribute getLabelAccess_Access();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions <em>Runnable Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runnable Instructions</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions
	 * @generated
	 */
	EClass getRunnableInstructions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions#getDefault()
	 * @see #getRunnableInstructions()
	 * @generated
	 */
	EReference getRunnableInstructions_Default();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption <em>Preemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Preemption</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption
	 * @generated
	 */
	EEnum getPreemption();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum <em>Label Access Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Access Enum</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum
	 * @generated
	 */
	EEnum getLabelAccessEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoftwareFactory getSoftwareFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableItemImpl <em>Runnable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableItemImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getRunnableItem()
		 * @generated
		 */
		EClass RUNNABLE_ITEM = eINSTANCE.getRunnableItem();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_ITEM__BASE_OPERATION = eINSTANCE.getRunnableItem_Base_Operation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceItemImpl <em>Call Sequence Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceItemImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getCallSequenceItem()
		 * @generated
		 */
		EClass CALL_SEQUENCE_ITEM = eINSTANCE.getCallSequenceItem();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_SEQUENCE_ITEM__BASE_OPERATION = eINSTANCE.getCallSequenceItem_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_SEQUENCE_ITEM__COUNTER = eINSTANCE.getCallSequenceItem_Counter();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.AbstractElementMemoryInformationImpl <em>Abstract Element Memory Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.AbstractElementMemoryInformationImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getAbstractElementMemoryInformation()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT_MEMORY_INFORMATION = eINSTANCE.getAbstractElementMemoryInformation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.AbstractProcessImpl <em>Abstract Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.AbstractProcessImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getAbstractProcess()
		 * @generated
		 */
		EClass ABSTRACT_PROCESS = eINSTANCE.getAbstractProcess();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROCESS__PRIORITY = eINSTANCE.getAbstractProcess_Priority();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.ProcessImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Callgraph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__CALLGRAPH = eINSTANCE.getProcess_Callgraph();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallGraphImpl <em>Call Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallGraphImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getCallGraph()
		 * @generated
		 */
		EClass CALL_GRAPH = eINSTANCE.getCallGraph();

		/**
		 * The meta object literal for the '<em><b>Graphentries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_GRAPH__GRAPHENTRIES = eINSTANCE.getCallGraph_Graphentries();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_GRAPH__BASE_CLASS = eINSTANCE.getCallGraph_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.GraphEntryImpl <em>Graph Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.GraphEntryImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getGraphEntry()
		 * @generated
		 */
		EClass GRAPH_ENTRY = eINSTANCE.getGraphEntry();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ENTRY__BASE_CLASS = eINSTANCE.getGraphEntry_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Preemption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PREEMPTION = eINSTANCE.getTask_Preemption();

		/**
		 * The meta object literal for the '<em><b>Multiple Task Activation Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MULTIPLE_TASK_ACTIVATION_LIMIT = eINSTANCE.getTask_MultipleTaskActivationLimit();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.ISRImpl <em>ISR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.ISRImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getISR()
		 * @generated
		 */
		EClass ISR = eINSTANCE.getISR();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__CONSTANT = eINSTANCE.getLabel_Constant();

		/**
		 * The meta object literal for the '<em><b>BVolatile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__BVOLATILE = eINSTANCE.getLabel_BVolatile();

		/**
		 * The meta object literal for the '<em><b>Buffered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__BUFFERED = eINSTANCE.getLabel_Buffered();

		/**
		 * The meta object literal for the '<em><b>Number Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NUMBER_BITS = eINSTANCE.getLabel_NumberBits();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableImpl <em>Runnable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getRunnable()
		 * @generated
		 */
		EClass RUNNABLE = eINSTANCE.getRunnable();

		/**
		 * The meta object literal for the '<em><b>Callback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__CALLBACK = eINSTANCE.getRunnable_Callback();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUNNABLE__SERVICE = eINSTANCE.getRunnable_Service();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceImpl <em>Call Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.CallSequenceImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getCallSequence()
		 * @generated
		 */
		EClass CALL_SEQUENCE = eINSTANCE.getCallSequence();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.InterProcessActivationImpl <em>Inter Process Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.InterProcessActivationImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getInterProcessActivation()
		 * @generated
		 */
		EClass INTER_PROCESS_ACTIVATION = eINSTANCE.getInterProcessActivation();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskRunnableCallImpl <em>Task Runnable Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.TaskRunnableCallImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getTaskRunnableCall()
		 * @generated
		 */
		EClass TASK_RUNNABLE_CALL = eINSTANCE.getTaskRunnableCall();

		/**
		 * The meta object literal for the '<em><b>Runnable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_RUNNABLE_CALL__RUNNABLE = eINSTANCE.getTaskRunnableCall_Runnable();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelAccessImpl <em>Label Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.LabelAccessImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getLabelAccess()
		 * @generated
		 */
		EClass LABEL_ACCESS = eINSTANCE.getLabelAccess();

		/**
		 * The meta object literal for the '<em><b>Is Buffered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_ACCESS__IS_BUFFERED = eINSTANCE.getLabelAccess_IsBuffered();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_ACCESS__ACCESS = eINSTANCE.getLabelAccess_Access();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableInstructionsImpl <em>Runnable Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.RunnableInstructionsImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getRunnableInstructions()
		 * @generated
		 */
		EClass RUNNABLE_INSTRUCTIONS = eINSTANCE.getRunnableInstructions();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNNABLE_INSTRUCTIONS__DEFAULT = eINSTANCE.getRunnableInstructions_Default();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption <em>Preemption</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getPreemption()
		 * @generated
		 */
		EEnum PREEMPTION = eINSTANCE.getPreemption();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum <em>Label Access Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl#getLabelAccessEnum()
		 * @generated
		 */
		EEnum LABEL_ACCESS_ENUM = eINSTANCE.getLabelAccessEnum();

	}

} //SoftwarePackage
