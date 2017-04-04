/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.AmaltheaPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.common.impl.CommonPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl.ConstraintsPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.impl.AmaltheaPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.mapping.MappingPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.mapping.impl.MappingPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractElementMemoryInformation;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Label;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableItem;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwareFactory;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Task;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl;

import org.eclipse.papyrus.sysml14.blocks.BlocksPackage;

import org.eclipse.papyrus.sysml14.sysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwarePackageImpl extends EPackageImpl implements SoftwarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callSequenceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractElementMemoryInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interProcessActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRunnableCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnableInstructionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preemptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelAccessEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoftwarePackageImpl() {
		super(eNS_URI, SoftwareFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SoftwarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoftwarePackage init() {
		if (isInited) return (SoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI);

		// Obtain or create and register package
		SoftwarePackageImpl theSoftwarePackage = (SoftwarePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SoftwarePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SoftwarePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		sysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AmaltheaPackageImpl theAmaltheaPackage = (AmaltheaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmaltheaPackage.eNS_URI) instanceof AmaltheaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmaltheaPackage.eNS_URI) : AmaltheaPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) instanceof ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) : ComponentsPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		OsPackageImpl theOsPackage = (OsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OsPackage.eNS_URI) instanceof OsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OsPackage.eNS_URI) : OsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);
		StimuliPackageImpl theStimuliPackage = (StimuliPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI) instanceof StimuliPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI) : StimuliPackage.eINSTANCE);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) : ConstraintsPackage.eINSTANCE);

		// Create package meta-data objects
		theSoftwarePackage.createPackageContents();
		theAmaltheaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theOsPackage.createPackageContents();
		theMappingPackage.createPackageContents();
		theStimuliPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();

		// Initialize created meta-data
		theSoftwarePackage.initializePackageContents();
		theAmaltheaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theOsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();
		theStimuliPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSoftwarePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoftwarePackage.eNS_URI, theSoftwarePackage);
		return theSoftwarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableItem() {
		return runnableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableItem_Base_Operation() {
		return (EReference)runnableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallSequenceItem() {
		return callSequenceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSequenceItem_Base_Operation() {
		return (EReference)callSequenceItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallSequenceItem_Counter() {
		return (EReference)callSequenceItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractElementMemoryInformation() {
		return abstractElementMemoryInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractProcess() {
		return abstractProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractProcess_Priority() {
		return (EAttribute)abstractProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcess_Callgraph() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallGraph() {
		return callGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallGraph_Graphentries() {
		return (EReference)callGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallGraph_Base_Class() {
		return (EReference)callGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphEntry() {
		return graphEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEntry_Base_Class() {
		return (EReference)graphEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Preemption() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_MultipleTaskActivationLimit() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISR() {
		return isrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Constant() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_BVolatile() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_Buffered() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabel_NumberBits() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnable() {
		return runnableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnable_Callback() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRunnable_Service() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallSequence() {
		return callSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterProcessActivation() {
		return interProcessActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskRunnableCall() {
		return taskRunnableCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskRunnableCall_Runnable() {
		return (EReference)taskRunnableCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelAccess() {
		return labelAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelAccess_IsBuffered() {
		return (EAttribute)labelAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelAccess_Access() {
		return (EAttribute)labelAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunnableInstructions() {
		return runnableInstructionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRunnableInstructions_Default() {
		return (EReference)runnableInstructionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPreemption() {
		return preemptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLabelAccessEnum() {
		return labelAccessEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFactory getSoftwareFactory() {
		return (SoftwareFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		runnableItemEClass = createEClass(RUNNABLE_ITEM);
		createEReference(runnableItemEClass, RUNNABLE_ITEM__BASE_OPERATION);

		callSequenceItemEClass = createEClass(CALL_SEQUENCE_ITEM);
		createEReference(callSequenceItemEClass, CALL_SEQUENCE_ITEM__BASE_OPERATION);
		createEReference(callSequenceItemEClass, CALL_SEQUENCE_ITEM__COUNTER);

		abstractElementMemoryInformationEClass = createEClass(ABSTRACT_ELEMENT_MEMORY_INFORMATION);

		abstractProcessEClass = createEClass(ABSTRACT_PROCESS);
		createEAttribute(abstractProcessEClass, ABSTRACT_PROCESS__PRIORITY);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__CALLGRAPH);

		callGraphEClass = createEClass(CALL_GRAPH);
		createEReference(callGraphEClass, CALL_GRAPH__BASE_CLASS);
		createEReference(callGraphEClass, CALL_GRAPH__GRAPHENTRIES);

		graphEntryEClass = createEClass(GRAPH_ENTRY);
		createEReference(graphEntryEClass, GRAPH_ENTRY__BASE_CLASS);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__PREEMPTION);
		createEAttribute(taskEClass, TASK__MULTIPLE_TASK_ACTIVATION_LIMIT);

		isrEClass = createEClass(ISR);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__CONSTANT);
		createEAttribute(labelEClass, LABEL__BVOLATILE);
		createEAttribute(labelEClass, LABEL__BUFFERED);
		createEAttribute(labelEClass, LABEL__NUMBER_BITS);

		runnableEClass = createEClass(RUNNABLE);
		createEAttribute(runnableEClass, RUNNABLE__CALLBACK);
		createEAttribute(runnableEClass, RUNNABLE__SERVICE);

		callSequenceEClass = createEClass(CALL_SEQUENCE);

		interProcessActivationEClass = createEClass(INTER_PROCESS_ACTIVATION);

		taskRunnableCallEClass = createEClass(TASK_RUNNABLE_CALL);
		createEReference(taskRunnableCallEClass, TASK_RUNNABLE_CALL__RUNNABLE);

		labelAccessEClass = createEClass(LABEL_ACCESS);
		createEAttribute(labelAccessEClass, LABEL_ACCESS__IS_BUFFERED);
		createEAttribute(labelAccessEClass, LABEL_ACCESS__ACCESS);

		runnableInstructionsEClass = createEClass(RUNNABLE_INSTRUCTIONS);
		createEReference(runnableInstructionsEClass, RUNNABLE_INSTRUCTIONS__DEFAULT);

		// Create enums
		preemptionEEnum = createEEnum(PREEMPTION);
		labelAccessEnumEEnum = createEEnum(LABEL_ACCESS_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractElementMemoryInformationEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		abstractProcessEClass.getESuperTypes().add(this.getAbstractElementMemoryInformation());
		processEClass.getESuperTypes().add(this.getAbstractProcess());
		taskEClass.getESuperTypes().add(this.getProcess());
		isrEClass.getESuperTypes().add(this.getProcess());
		labelEClass.getESuperTypes().add(this.getAbstractElementMemoryInformation());
		runnableEClass.getESuperTypes().add(this.getAbstractElementMemoryInformation());
		callSequenceEClass.getESuperTypes().add(this.getGraphEntry());
		interProcessActivationEClass.getESuperTypes().add(this.getCallSequenceItem());
		taskRunnableCallEClass.getESuperTypes().add(this.getCallSequenceItem());
		labelAccessEClass.getESuperTypes().add(this.getRunnableItem());
		runnableInstructionsEClass.getESuperTypes().add(this.getRunnableItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(runnableItemEClass, RunnableItem.class, "RunnableItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableItem_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 1, 1, RunnableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callSequenceItemEClass, CallSequenceItem.class, "CallSequenceItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallSequenceItem_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 1, 1, CallSequenceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCallSequenceItem_Counter(), theCommonPackage.getCounter(), null, "counter", null, 0, 1, CallSequenceItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(abstractElementMemoryInformationEClass, AbstractElementMemoryInformation.class, "AbstractElementMemoryInformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractProcessEClass, AbstractProcess.class, "AbstractProcess", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractProcess_Priority(), theTypesPackage.getInteger(), "priority", null, 1, 1, AbstractProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processEClass, org.eclipse.papyrus.amalthea.profile.amalthea.software.Process.class, "Process", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_Callgraph(), this.getCallGraph(), null, "callgraph", null, 0, 1, org.eclipse.papyrus.amalthea.profile.amalthea.software.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callGraphEClass, CallGraph.class, "CallGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallGraph_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, CallGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCallGraph_Graphentries(), this.getGraphEntry(), null, "graphentries", null, 1, -1, CallGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(graphEntryEClass, GraphEntry.class, "GraphEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphEntry_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, GraphEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Preemption(), this.getPreemption(), "preemption", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTask_MultipleTaskActivationLimit(), theTypesPackage.getInteger(), "multipleTaskActivationLimit", null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(isrEClass, org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR.class, "ISR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Constant(), theTypesPackage.getBoolean(), "constant", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabel_BVolatile(), theTypesPackage.getBoolean(), "bVolatile", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabel_Buffered(), theTypesPackage.getBoolean(), "buffered", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabel_NumberBits(), theTypesPackage.getInteger(), "numberBits", null, 1, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(runnableEClass, org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable.class, "Runnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunnable_Callback(), theTypesPackage.getBoolean(), "callback", null, 1, 1, org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRunnable_Service(), theTypesPackage.getBoolean(), "service", null, 1, 1, org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callSequenceEClass, CallSequence.class, "CallSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interProcessActivationEClass, InterProcessActivation.class, "InterProcessActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskRunnableCallEClass, TaskRunnableCall.class, "TaskRunnableCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRunnableCall_Runnable(), this.getRunnable(), null, "runnable", null, 1, 1, TaskRunnableCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(labelAccessEClass, LabelAccess.class, "LabelAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelAccess_IsBuffered(), theTypesPackage.getBoolean(), "isBuffered", null, 1, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLabelAccess_Access(), this.getLabelAccessEnum(), "access", null, 1, 1, LabelAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(runnableInstructionsEClass, RunnableInstructions.class, "RunnableInstructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunnableInstructions_Default(), theCommonPackage.getInstructions(), null, "default", null, 1, 1, RunnableInstructions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(preemptionEEnum, Preemption.class, "Preemption");
		addEEnumLiteral(preemptionEEnum, Preemption._UNDEFINED_);
		addEEnumLiteral(preemptionEEnum, Preemption.PREEMPTIVE);
		addEEnumLiteral(preemptionEEnum, Preemption.COOPERATIVE);
		addEEnumLiteral(preemptionEEnum, Preemption.NON_PREEMPTIVE);

		initEEnum(labelAccessEnumEEnum, LabelAccessEnum.class, "LabelAccessEnum");
		addEEnumLiteral(labelAccessEnumEEnum, LabelAccessEnum._UNDEFINED_);
		addEEnumLiteral(labelAccessEnumEEnum, LabelAccessEnum.READ);
		addEEnumLiteral(labelAccessEnumEEnum, LabelAccessEnum.WRITE);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "SWModel"
		   });
	}

} //SoftwarePackageImpl
