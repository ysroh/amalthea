/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractElementMemoryInformation;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Label;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableItem;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Task;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall;

import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage
 * @generated
 */
public class SoftwareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareSwitch<Adapter> modelSwitch =
		new SoftwareSwitch<Adapter>() {
			@Override
			public Adapter caseRunnableItem(RunnableItem object) {
				return createRunnableItemAdapter();
			}
			@Override
			public Adapter caseCallSequenceItem(CallSequenceItem object) {
				return createCallSequenceItemAdapter();
			}
			@Override
			public Adapter caseAbstractElementMemoryInformation(AbstractElementMemoryInformation object) {
				return createAbstractElementMemoryInformationAdapter();
			}
			@Override
			public Adapter caseAbstractProcess(AbstractProcess object) {
				return createAbstractProcessAdapter();
			}
			@Override
			public Adapter caseProcess(org.eclipse.papyrus.amalthea.profile.amalthea.software.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseCallGraph(CallGraph object) {
				return createCallGraphAdapter();
			}
			@Override
			public Adapter caseGraphEntry(GraphEntry object) {
				return createGraphEntryAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseISR(ISR object) {
				return createISRAdapter();
			}
			@Override
			public Adapter caseLabel(Label object) {
				return createLabelAdapter();
			}
			@Override
			public Adapter caseCallSequence(CallSequence object) {
				return createCallSequenceAdapter();
			}
			@Override
			public Adapter caseInterProcessActivation(InterProcessActivation object) {
				return createInterProcessActivationAdapter();
			}
			@Override
			public Adapter caseTaskRunnableCall(TaskRunnableCall object) {
				return createTaskRunnableCallAdapter();
			}
			@Override
			public Adapter caseLabelAccess(LabelAccess object) {
				return createLabelAccessAdapter();
			}
			@Override
			public Adapter caseRunnableInstructions(RunnableInstructions object) {
				return createRunnableInstructionsAdapter();
			}
			@Override
			public Adapter caseRunnable(org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable object) {
				return createRunnableAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableItem <em>Runnable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableItem
	 * @generated
	 */
	public Adapter createRunnableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem <em>Call Sequence Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequenceItem
	 * @generated
	 */
	public Adapter createCallSequenceItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractElementMemoryInformation <em>Abstract Element Memory Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractElementMemoryInformation
	 * @generated
	 */
	public Adapter createAbstractElementMemoryInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess <em>Abstract Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.AbstractProcess
	 * @generated
	 */
	public Adapter createAbstractProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph <em>Call Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph
	 * @generated
	 */
	public Adapter createCallGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry <em>Graph Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.GraphEntry
	 * @generated
	 */
	public Adapter createGraphEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR <em>ISR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR
	 * @generated
	 */
	public Adapter createISRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence <em>Call Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence
	 * @generated
	 */
	public Adapter createCallSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation <em>Inter Process Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation
	 * @generated
	 */
	public Adapter createInterProcessActivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall <em>Task Runnable Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall
	 * @generated
	 */
	public Adapter createTaskRunnableCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess <em>Label Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess
	 * @generated
	 */
	public Adapter createLabelAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions <em>Runnable Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions
	 * @generated
	 */
	public Adapter createRunnableInstructionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable <em>Runnable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable
	 * @generated
	 */
	public Adapter createRunnableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.sysml14.blocks.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.sysml14.blocks.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SoftwareAdapterFactory
