/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.BaseObject;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentsModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Composite;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ConstraintsModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.HWModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.MappingModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ReferableBaseObject;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SoftwareModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.StimuliModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType;

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
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage
 * @generated
 */
public class AMALTHEASwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AMALTHEAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMALTHEASwitch() {
		if (modelPackage == null) {
			modelPackage = AMALTHEAPackage.eINSTANCE;
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
			case AMALTHEAPackage.RUNNABLE: {
				org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable runnable = (org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable)theEObject;
				T result = caseRunnable(runnable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.COMPONENTS_MODEL: {
				ComponentsModel componentsModel = (ComponentsModel)theEObject;
				T result = caseComponentsModel(componentsModel);
				if (result == null) result = caseBaseObject(componentsModel);
				if (result == null) result = caseIAnnotatable(componentsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.BASE_OBJECT: {
				BaseObject baseObject = (BaseObject)theEObject;
				T result = caseBaseObject(baseObject);
				if (result == null) result = caseIAnnotatable(baseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.IANNOTATABLE: {
				IAnnotatable iAnnotatable = (IAnnotatable)theEObject;
				T result = caseIAnnotatable(iAnnotatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.CUSTOM_PROPERTY: {
				CustomProperty customProperty = (CustomProperty)theEObject;
				T result = caseCustomProperty(customProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.HW_MODEL: {
				HWModel hwModel = (HWModel)theEObject;
				T result = caseHWModel(hwModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.OS_MODEL: {
				OSModel osModel = (OSModel)theEObject;
				T result = caseOSModel(osModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.MAPPING_MODEL: {
				MappingModel mappingModel = (MappingModel)theEObject;
				T result = caseMappingModel(mappingModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.STIMULI_MODEL: {
				StimuliModel stimuliModel = (StimuliModel)theEObject;
				T result = caseStimuliModel(stimuliModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.SOFTWARE_MODEL: {
				SoftwareModel softwareModel = (SoftwareModel)theEObject;
				T result = caseSoftwareModel(softwareModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.CONSTRAINTS_MODEL: {
				ConstraintsModel constraintsModel = (ConstraintsModel)theEObject;
				T result = caseConstraintsModel(constraintsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseReferableBaseObject(component);
				if (result == null) result = caseBlock(component);
				if (result == null) result = caseIReferable(component);
				if (result == null) result = caseIAnnotatable(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.REFERABLE_BASE_OBJECT: {
				ReferableBaseObject referableBaseObject = (ReferableBaseObject)theEObject;
				T result = caseReferableBaseObject(referableBaseObject);
				if (result == null) result = caseIReferable(referableBaseObject);
				if (result == null) result = caseIAnnotatable(referableBaseObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.IREFERABLE: {
				IReferable iReferable = (IReferable)theEObject;
				T result = caseIReferable(iReferable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseComponent(composite);
				if (result == null) result = caseISystem(composite);
				if (result == null) result = caseReferableBaseObject(composite);
				if (result == null) result = caseBlock(composite);
				if (result == null) result = caseIReferable(composite);
				if (result == null) result = caseIAnnotatable(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.ISYSTEM: {
				ISystem iSystem = (ISystem)theEObject;
				T result = caseISystem(iSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = caseBaseObject(connector);
				if (result == null) result = caseIAnnotatable(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.QUALIFIED_PORT: {
				QualifiedPort qualifiedPort = (QualifiedPort)theEObject;
				T result = caseQualifiedPort(qualifiedPort);
				if (result == null) result = caseBaseObject(qualifiedPort);
				if (result == null) result = caseIAnnotatable(qualifiedPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.COMPONENT_INSTANCE: {
				ComponentInstance componentInstance = (ComponentInstance)theEObject;
				T result = caseComponentInstance(componentInstance);
				if (result == null) result = caseReferableBaseObject(componentInstance);
				if (result == null) result = caseIReferable(componentInstance);
				if (result == null) result = caseIAnnotatable(componentInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseReferableBaseObject(port);
				if (result == null) result = caseIReferable(port);
				if (result == null) result = caseIAnnotatable(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.FINTERFACE_PORT: {
				FInterfacePort fInterfacePort = (FInterfacePort)theEObject;
				T result = caseFInterfacePort(fInterfacePort);
				if (result == null) result = casePort(fInterfacePort);
				if (result == null) result = caseReferableBaseObject(fInterfacePort);
				if (result == null) result = caseIReferable(fInterfacePort);
				if (result == null) result = caseIAnnotatable(fInterfacePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.CORE_TYPE: {
				CoreType coreType = (CoreType)theEObject;
				T result = caseCoreType(coreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.CORE: {
				Core core = (Core)theEObject;
				T result = caseCore(core);
				if (result == null) result = caseComplexNode(core);
				if (result == null) result = caseBlock(core);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.COMPLEX_NODE: {
				ComplexNode complexNode = (ComplexNode)theEObject;
				T result = caseComplexNode(complexNode);
				if (result == null) result = caseBlock(complexNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.QUARTZ: {
				Quartz quartz = (Quartz)theEObject;
				T result = caseQuartz(quartz);
				if (result == null) result = caseComplexNode(quartz);
				if (result == null) result = caseBlock(quartz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.FREQUENCY: {
				Frequency frequency = (Frequency)theEObject;
				T result = caseFrequency(frequency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.PRESCALER: {
				Prescaler prescaler = (Prescaler)theEObject;
				T result = casePrescaler(prescaler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.NETWORK: {
				Network network = (Network)theEObject;
				T result = caseNetwork(network);
				if (result == null) result = caseComplexNode(network);
				if (result == null) result = caseBlock(network);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.NETWORK_TYPE: {
				NetworkType networkType = (NetworkType)theEObject;
				T result = caseNetworkType(networkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.BUS: {
				Bus bus = (Bus)theEObject;
				T result = caseBus(bus);
				if (result == null) result = caseNetworkType(bus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.SYSTEM_TYPE: {
				SystemType systemType = (SystemType)theEObject;
				T result = caseSystemType(systemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.ECU_TYPE: {
				ECUType ecuType = (ECUType)theEObject;
				T result = caseECUType(ecuType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.MICROCONTROLLER_TYPE: {
				MicrocontrollerType microcontrollerType = (MicrocontrollerType)theEObject;
				T result = caseMicrocontrollerType(microcontrollerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.HW_SYSTEM: {
				HwSystem hwSystem = (HwSystem)theEObject;
				T result = caseHwSystem(hwSystem);
				if (result == null) result = caseComplexNode(hwSystem);
				if (result == null) result = caseBlock(hwSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.ECU: {
				ECU ecu = (ECU)theEObject;
				T result = caseECU(ecu);
				if (result == null) result = caseComplexNode(ecu);
				if (result == null) result = caseBlock(ecu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AMALTHEAPackage.MICROCONTROLLER: {
				Microcontroller microcontroller = (Microcontroller)theEObject;
				T result = caseMicrocontroller(microcontroller);
				if (result == null) result = caseComplexNode(microcontroller);
				if (result == null) result = caseBlock(microcontroller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseRunnable(org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentsModel(ComponentsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseObject(BaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAnnotatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAnnotatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAnnotatable(IAnnotatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomProperty(CustomProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HW Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HW Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHWModel(HWModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSModel(OSModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingModel(MappingModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stimuli Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stimuli Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStimuliModel(StimuliModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareModel(SoftwareModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsModel(ConstraintsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referable Base Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referable Base Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferableBaseObject(ReferableBaseObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IReferable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IReferable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIReferable(IReferable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISystem(ISystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualified Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualified Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualifiedPort(QualifiedPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentInstance(ComponentInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FInterface Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FInterface Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFInterfacePort(FInterfacePort object) {
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

} //AMALTHEASwitch
