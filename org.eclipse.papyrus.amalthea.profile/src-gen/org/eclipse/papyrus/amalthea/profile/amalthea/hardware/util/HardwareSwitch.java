/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.*;

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
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage
 * @generated
 */
public class HardwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HardwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareSwitch() {
		if (modelPackage == null) {
			modelPackage = HardwarePackage.eINSTANCE;
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
			case HardwarePackage.HW_SYSTEM: {
				HwSystem hwSystem = (HwSystem)theEObject;
				T result = caseHwSystem(hwSystem);
				if (result == null) result = caseComplexNode(hwSystem);
				if (result == null) result = caseBlock(hwSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.COMPLEX_NODE: {
				ComplexNode complexNode = (ComplexNode)theEObject;
				T result = caseComplexNode(complexNode);
				if (result == null) result = caseBlock(complexNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.QUARTZ: {
				Quartz quartz = (Quartz)theEObject;
				T result = caseQuartz(quartz);
				if (result == null) result = caseComplexNode(quartz);
				if (result == null) result = caseBlock(quartz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.FREQUENCY: {
				Frequency frequency = (Frequency)theEObject;
				T result = caseFrequency(frequency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.PRESCALER: {
				Prescaler prescaler = (Prescaler)theEObject;
				T result = casePrescaler(prescaler);
				if (result == null) result = caseBlock(prescaler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseComplexNode(network);
				if (result == null) result = caseBlock(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.NETWORK_TYPE: {
				NetworkType networkType = (NetworkType)theEObject;
				T result = caseNetworkType(networkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.ECU: {
				ECU ecu = (ECU)theEObject;
				T result = caseECU(ecu);
				if (result == null) result = caseComplexNode(ecu);
				if (result == null) result = caseBlock(ecu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.MICROCONTROLLER: {
				Microcontroller microcontroller = (Microcontroller)theEObject;
				T result = caseMicrocontroller(microcontroller);
				if (result == null) result = caseComplexNode(microcontroller);
				if (result == null) result = caseBlock(microcontroller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.CORE: {
				Core core = (Core)theEObject;
				T result = caseCore(core);
				if (result == null) result = caseComplexNode(core);
				if (result == null) result = caseBlock(core);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.CORE_TYPE: {
				CoreType coreType = (CoreType)theEObject;
				T result = caseCoreType(coreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.MICROCONTROLLER_TYPE: {
				MicrocontrollerType microcontrollerType = (MicrocontrollerType)theEObject;
				T result = caseMicrocontrollerType(microcontrollerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.ECU_TYPE: {
				ECUType ecuType = (ECUType)theEObject;
				T result = caseECUType(ecuType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.SYSTEM_TYPE: {
				SystemType systemType = (SystemType)theEObject;
				T result = caseSystemType(systemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HardwarePackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = caseNetworkType(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hw System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hw System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHwSystem(HwSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexNode(ComplexNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quartz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quartz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuartz(Quartz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequency(Frequency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescaler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescaler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescaler(Prescaler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkType(NetworkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECU(ECU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microcontroller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrocontroller(Microcontroller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCore(Core object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreType(CoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Microcontroller Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Microcontroller Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMicrocontrollerType(MicrocontrollerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ECU Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ECU Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseECUType(ECUType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemType(SystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBus(Bus object) {
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

} //HardwareSwitch
