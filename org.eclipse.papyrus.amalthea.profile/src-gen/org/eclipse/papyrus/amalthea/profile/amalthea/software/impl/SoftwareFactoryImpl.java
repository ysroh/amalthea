/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Label;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccessEnum;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Preemption;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwareFactory;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Task;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareFactoryImpl extends EFactoryImpl implements SoftwareFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoftwareFactory init() {
		try {
			SoftwareFactory theSoftwareFactory = (SoftwareFactory)EPackage.Registry.INSTANCE.getEFactory(SoftwarePackage.eNS_URI);
			if (theSoftwareFactory != null) {
				return theSoftwareFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoftwareFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SoftwarePackage.CALL_GRAPH: return createCallGraph();
			case SoftwarePackage.TASK: return createTask();
			case SoftwarePackage.ISR: return createISR();
			case SoftwarePackage.LABEL: return createLabel();
			case SoftwarePackage.CALL_SEQUENCE: return createCallSequence();
			case SoftwarePackage.INTER_PROCESS_ACTIVATION: return createInterProcessActivation();
			case SoftwarePackage.TASK_RUNNABLE_CALL: return createTaskRunnableCall();
			case SoftwarePackage.LABEL_ACCESS: return createLabelAccess();
			case SoftwarePackage.RUNNABLE_INSTRUCTIONS: return createRunnableInstructions();
			case SoftwarePackage.RUNNABLE: return createRunnable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SoftwarePackage.PREEMPTION:
				return createPreemptionFromString(eDataType, initialValue);
			case SoftwarePackage.LABEL_ACCESS_ENUM:
				return createLabelAccessEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SoftwarePackage.PREEMPTION:
				return convertPreemptionToString(eDataType, instanceValue);
			case SoftwarePackage.LABEL_ACCESS_ENUM:
				return convertLabelAccessEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallGraph createCallGraph() {
		CallGraphImpl callGraph = new CallGraphImpl();
		return callGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISR createISR() {
		ISRImpl isr = new ISRImpl();
		return isr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallSequence createCallSequence() {
		CallSequenceImpl callSequence = new CallSequenceImpl();
		return callSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterProcessActivation createInterProcessActivation() {
		InterProcessActivationImpl interProcessActivation = new InterProcessActivationImpl();
		return interProcessActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRunnableCall createTaskRunnableCall() {
		TaskRunnableCallImpl taskRunnableCall = new TaskRunnableCallImpl();
		return taskRunnableCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccess createLabelAccess() {
		LabelAccessImpl labelAccess = new LabelAccessImpl();
		return labelAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RunnableInstructions createRunnableInstructions() {
		RunnableInstructionsImpl runnableInstructions = new RunnableInstructionsImpl();
		return runnableInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable createRunnable() {
		RunnableImpl runnable = new RunnableImpl();
		return runnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preemption createPreemptionFromString(EDataType eDataType, String initialValue) {
		Preemption result = Preemption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreemptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessEnum createLabelAccessEnumFromString(EDataType eDataType, String initialValue) {
		LabelAccessEnum result = LabelAccessEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelAccessEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwarePackage getSoftwarePackage() {
		return (SoftwarePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoftwarePackage getPackage() {
		return SoftwarePackage.eINSTANCE;
	}

} //SoftwareFactoryImpl
