/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage
 * @generated
 */
public class SoftwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SoftwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSwitch() {
		if (modelPackage == null) {
			modelPackage = SoftwarePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SoftwarePackage.RUNNABLE_ITEM: {
				RunnableItem runnableItem = (RunnableItem)theEObject;
				T result = caseRunnableItem(runnableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.CALL_SEQUENCE_ITEM: {
				CallSequenceItem callSequenceItem = (CallSequenceItem)theEObject;
				T result = caseCallSequenceItem(callSequenceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.ABSTRACT_ELEMENT_MEMORY_INFORMATION: {
				AbstractElementMemoryInformation abstractElementMemoryInformation = (AbstractElementMemoryInformation)theEObject;
				T result = caseAbstractElementMemoryInformation(abstractElementMemoryInformation);
				if (result == null) result = caseBlock(abstractElementMemoryInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.ABSTRACT_PROCESS: {
				AbstractProcess abstractProcess = (AbstractProcess)theEObject;
				T result = caseAbstractProcess(abstractProcess);
				if (result == null) result = caseAbstractElementMemoryInformation(abstractProcess);
				if (result == null) result = caseBlock(abstractProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.PROCESS: {
				org.eclipse.papyrus.amalthea.profile.amalthea.software.Process process = (org.eclipse.papyrus.amalthea.profile.amalthea.software.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseAbstractProcess(process);
				if (result == null) result = caseAbstractElementMemoryInformation(process);
				if (result == null) result = caseBlock(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.CALL_GRAPH: {
				CallGraph callGraph = (CallGraph)theEObject;
				T result = caseCallGraph(callGraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.GRAPH_ENTRY: {
				GraphEntry graphEntry = (GraphEntry)theEObject;
				T result = caseGraphEntry(graphEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseProcess(task);
				if (result == null) result = caseAbstractProcess(task);
				if (result == null) result = caseAbstractElementMemoryInformation(task);
				if (result == null) result = caseBlock(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.ISR: {
				ISR isr = (ISR)theEObject;
				T result = caseISR(isr);
				if (result == null) result = caseProcess(isr);
				if (result == null) result = caseAbstractProcess(isr);
				if (result == null) result = caseAbstractElementMemoryInformation(isr);
				if (result == null) result = caseBlock(isr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.LABEL: {
				Label label = (Label)theEObject;
				T result = caseLabel(label);
				if (result == null) result = caseAbstractElementMemoryInformation(label);
				if (result == null) result = caseBlock(label);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.CALL_SEQUENCE: {
				CallSequence callSequence = (CallSequence)theEObject;
				T result = caseCallSequence(callSequence);
				if (result == null) result = caseGraphEntry(callSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.INTER_PROCESS_ACTIVATION: {
				InterProcessActivation interProcessActivation = (InterProcessActivation)theEObject;
				T result = caseInterProcessActivation(interProcessActivation);
				if (result == null) result = caseCallSequenceItem(interProcessActivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.TASK_RUNNABLE_CALL: {
				TaskRunnableCall taskRunnableCall = (TaskRunnableCall)theEObject;
				T result = caseTaskRunnableCall(taskRunnableCall);
				if (result == null) result = caseCallSequenceItem(taskRunnableCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.LABEL_ACCESS: {
				LabelAccess labelAccess = (LabelAccess)theEObject;
				T result = caseLabelAccess(labelAccess);
				if (result == null) result = caseRunnableItem(labelAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.RUNNABLE_INSTRUCTIONS: {
				RunnableInstructions runnableInstructions = (RunnableInstructions)theEObject;
				T result = caseRunnableInstructions(runnableInstructions);
				if (result == null) result = caseRunnableItem(runnableInstructions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SoftwarePackage.RUNNABLE: {
				org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable runnable = (org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable)theEObject;
				T result = caseRunnable(runnable);
				if (result == null) result = caseAbstractElementMemoryInformation(runnable);
				if (result == null) result = caseBlock(runnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnableItem(RunnableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Sequence Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Sequence Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallSequenceItem(CallSequenceItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Element Memory Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Element Memory Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractElementMemoryInformation(AbstractElementMemoryInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractProcess(AbstractProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(org.eclipse.papyrus.amalthea.profile.amalthea.software.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallGraph(CallGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphEntry(GraphEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISR(ISR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnable(org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallSequence(CallSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inter Process Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inter Process Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterProcessActivation(InterProcessActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Runnable Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Runnable Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRunnableCall(TaskRunnableCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelAccess(LabelAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runnable Instructions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runnable Instructions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRunnableInstructions(RunnableInstructions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SoftwareSwitch
