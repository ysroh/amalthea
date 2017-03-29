/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAFactory;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.BaseObject;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.BusType;
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
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.HWModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.IReferable;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterfaceKind;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.MappingModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.OSModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ReferableBaseObject;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SchedType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SoftwareModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.StimuliModel;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType;

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
public class AMALTHEAPackageImpl extends EPackageImpl implements AMALTHEAPackage {
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
	private EClass componentsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAnnotatableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stimuliModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referableBaseObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iReferableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fInterfacePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quartzEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescalerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecuTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microcontrollerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hwSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microcontrollerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum qTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum busTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frequencyUnitEEnum = null;

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
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AMALTHEAPackageImpl() {
		super(eNS_URI, AMALTHEAFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AMALTHEAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AMALTHEAPackage init() {
		if (isInited) return (AMALTHEAPackage)EPackage.Registry.INSTANCE.getEPackage(AMALTHEAPackage.eNS_URI);

		// Obtain or create and register package
		AMALTHEAPackageImpl theAMALTHEAPackage = (AMALTHEAPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AMALTHEAPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AMALTHEAPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		sysmlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAMALTHEAPackage.createPackageContents();

		// Initialize created meta-data
		theAMALTHEAPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAMALTHEAPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AMALTHEAPackage.eNS_URI, theAMALTHEAPackage);
		return theAMALTHEAPackage;
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
	public EAttribute getRunnable_Service() {
		return (EAttribute)runnableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentsModel() {
		return componentsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentsModel_Base_Package() {
		return (EReference)componentsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseObject() {
		return baseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAnnotatable() {
		return iAnnotatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIAnnotatable_CustomProperties() {
		return (EReference)iAnnotatableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomProperty() {
		return customPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomProperty_Key() {
		return (EAttribute)customPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomProperty_Base_Property() {
		return (EReference)customPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHWModel() {
		return hwModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHWModel_Base_Model() {
		return (EReference)hwModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSModel() {
		return osModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSModel_Base_Model() {
		return (EReference)osModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingModel() {
		return mappingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingModel_Base_Model() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStimuliModel() {
		return stimuliModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStimuliModel_Base_Model() {
		return (EReference)stimuliModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareModel() {
		return softwareModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareModel_Base_Model() {
		return (EReference)softwareModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsModel() {
		return constraintsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsModel_Base_Model() {
		return (EReference)constraintsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Base_Component() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferableBaseObject() {
		return referableBaseObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIReferable() {
		return iReferableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIReferable_Base_NamedElement() {
		return (EReference)iReferableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIReferable_UniqueName() {
		return (EAttribute)iReferableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIReferable__ComputeUniqueName() {
		return iReferableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposite() {
		return compositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISystem() {
		return iSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISystem_Connectors() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISystem_GroundedPorts() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISystem_ComponentInstances() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getISystem_InnerPorts() {
		return (EReference)iSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Base_Connector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_SourcePort() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_TargetPort() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedPort() {
		return qualifiedPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedPort_Base_ConnectorEnd() {
		return (EReference)qualifiedPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedPort_Instance() {
		return (EReference)qualifiedPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifiedPort_Port() {
		return (EReference)qualifiedPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Base_Property() {
		return (EReference)componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Base_Port() {
		return (EReference)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFInterfacePort() {
		return fInterfacePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFInterfacePort_Kind() {
		return (EAttribute)fInterfacePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoreType() {
		return coreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoreType_Base_DataType() {
		return (EReference)coreTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreType_BitWidth() {
		return (EAttribute)coreTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoreType_InstructionsPerCycle() {
		return (EAttribute)coreTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCore() {
		return coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCore_CoreType() {
		return (EReference)coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCore_LockstepGroup() {
		return (EAttribute)coreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexNode() {
		return complexNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexNode_Quartzes() {
		return (EReference)complexNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexNode_Prescaler() {
		return (EReference)complexNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexNode_Networks() {
		return (EReference)complexNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuartz() {
		return quartzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuartz_Type() {
		return (EAttribute)quartzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuartz_Frequency() {
		return (EReference)quartzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequency() {
		return frequencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequency_Value() {
		return (EAttribute)frequencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequency_Base_DataType() {
		return (EReference)frequencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFrequency__ToString() {
		return frequencyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescaler() {
		return prescalerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescaler_Base_DataType() {
		return (EReference)prescalerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescaler_ClockRatio() {
		return (EAttribute)prescalerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescaler_Quartz() {
		return (EReference)prescalerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetwork() {
		return networkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetwork_Type() {
		return (EReference)networkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkType() {
		return networkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkType_SchedPolicy() {
		return (EAttribute)networkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkType_BitWidth() {
		return (EAttribute)networkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkType_Base_DataType() {
		return (EReference)networkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBus_BusType() {
		return (EAttribute)busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemType() {
		return systemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemType_Base_DataType() {
		return (EReference)systemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECUType() {
		return ecuTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECUType_Base_DataType() {
		return (EReference)ecuTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrocontrollerType() {
		return microcontrollerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontrollerType_Base_DataType() {
		return (EReference)microcontrollerTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHwSystem() {
		return hwSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwSystem_SystemType() {
		return (EReference)hwSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHwSystem_Ecus() {
		return (EReference)hwSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECU() {
		return ecuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_EcuType() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getECU_Microcontrollers() {
		return (EReference)ecuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicrocontroller() {
		return microcontrollerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_MicrocontrollerType() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicrocontroller_Cores() {
		return (EReference)microcontrollerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceKind() {
		return interfaceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQType() {
		return qTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedType() {
		return schedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBusType() {
		return busTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrequencyUnit() {
		return frequencyUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMALTHEAFactory getAMALTHEAFactory() {
		return (AMALTHEAFactory)getEFactoryInstance();
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
		runnableEClass = createEClass(RUNNABLE);
		createEAttribute(runnableEClass, RUNNABLE__SERVICE);

		componentsModelEClass = createEClass(COMPONENTS_MODEL);
		createEReference(componentsModelEClass, COMPONENTS_MODEL__BASE_PACKAGE);

		baseObjectEClass = createEClass(BASE_OBJECT);

		iAnnotatableEClass = createEClass(IANNOTATABLE);
		createEReference(iAnnotatableEClass, IANNOTATABLE__CUSTOM_PROPERTIES);

		customPropertyEClass = createEClass(CUSTOM_PROPERTY);
		createEAttribute(customPropertyEClass, CUSTOM_PROPERTY__KEY);
		createEReference(customPropertyEClass, CUSTOM_PROPERTY__BASE_PROPERTY);

		hwModelEClass = createEClass(HW_MODEL);
		createEReference(hwModelEClass, HW_MODEL__BASE_MODEL);

		osModelEClass = createEClass(OS_MODEL);
		createEReference(osModelEClass, OS_MODEL__BASE_MODEL);

		mappingModelEClass = createEClass(MAPPING_MODEL);
		createEReference(mappingModelEClass, MAPPING_MODEL__BASE_MODEL);

		stimuliModelEClass = createEClass(STIMULI_MODEL);
		createEReference(stimuliModelEClass, STIMULI_MODEL__BASE_MODEL);

		softwareModelEClass = createEClass(SOFTWARE_MODEL);
		createEReference(softwareModelEClass, SOFTWARE_MODEL__BASE_MODEL);

		constraintsModelEClass = createEClass(CONSTRAINTS_MODEL);
		createEReference(constraintsModelEClass, CONSTRAINTS_MODEL__BASE_MODEL);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__BASE_COMPONENT);

		referableBaseObjectEClass = createEClass(REFERABLE_BASE_OBJECT);

		iReferableEClass = createEClass(IREFERABLE);
		createEReference(iReferableEClass, IREFERABLE__BASE_NAMED_ELEMENT);
		createEAttribute(iReferableEClass, IREFERABLE__UNIQUE_NAME);
		createEOperation(iReferableEClass, IREFERABLE___COMPUTE_UNIQUE_NAME);

		compositeEClass = createEClass(COMPOSITE);

		iSystemEClass = createEClass(ISYSTEM);
		createEReference(iSystemEClass, ISYSTEM__CONNECTORS);
		createEReference(iSystemEClass, ISYSTEM__GROUNDED_PORTS);
		createEReference(iSystemEClass, ISYSTEM__COMPONENT_INSTANCES);
		createEReference(iSystemEClass, ISYSTEM__INNER_PORTS);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__BASE_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__SOURCE_PORT);
		createEReference(connectorEClass, CONNECTOR__TARGET_PORT);

		qualifiedPortEClass = createEClass(QUALIFIED_PORT);
		createEReference(qualifiedPortEClass, QUALIFIED_PORT__BASE_CONNECTOR_END);
		createEReference(qualifiedPortEClass, QUALIFIED_PORT__INSTANCE);
		createEReference(qualifiedPortEClass, QUALIFIED_PORT__PORT);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__BASE_PROPERTY);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__BASE_PORT);

		fInterfacePortEClass = createEClass(FINTERFACE_PORT);
		createEAttribute(fInterfacePortEClass, FINTERFACE_PORT__KIND);

		coreTypeEClass = createEClass(CORE_TYPE);
		createEReference(coreTypeEClass, CORE_TYPE__BASE_DATA_TYPE);
		createEAttribute(coreTypeEClass, CORE_TYPE__BIT_WIDTH);
		createEAttribute(coreTypeEClass, CORE_TYPE__INSTRUCTIONS_PER_CYCLE);

		coreEClass = createEClass(CORE);
		createEReference(coreEClass, CORE__CORE_TYPE);
		createEAttribute(coreEClass, CORE__LOCKSTEP_GROUP);

		complexNodeEClass = createEClass(COMPLEX_NODE);
		createEReference(complexNodeEClass, COMPLEX_NODE__QUARTZES);
		createEReference(complexNodeEClass, COMPLEX_NODE__PRESCALER);
		createEReference(complexNodeEClass, COMPLEX_NODE__NETWORKS);

		quartzEClass = createEClass(QUARTZ);
		createEAttribute(quartzEClass, QUARTZ__TYPE);
		createEReference(quartzEClass, QUARTZ__FREQUENCY);

		frequencyEClass = createEClass(FREQUENCY);
		createEAttribute(frequencyEClass, FREQUENCY__VALUE);
		createEReference(frequencyEClass, FREQUENCY__BASE_DATA_TYPE);
		createEOperation(frequencyEClass, FREQUENCY___TO_STRING);

		prescalerEClass = createEClass(PRESCALER);
		createEReference(prescalerEClass, PRESCALER__BASE_DATA_TYPE);
		createEAttribute(prescalerEClass, PRESCALER__CLOCK_RATIO);
		createEReference(prescalerEClass, PRESCALER__QUARTZ);

		networkEClass = createEClass(NETWORK);
		createEReference(networkEClass, NETWORK__TYPE);

		networkTypeEClass = createEClass(NETWORK_TYPE);
		createEAttribute(networkTypeEClass, NETWORK_TYPE__SCHED_POLICY);
		createEAttribute(networkTypeEClass, NETWORK_TYPE__BIT_WIDTH);
		createEReference(networkTypeEClass, NETWORK_TYPE__BASE_DATA_TYPE);

		busEClass = createEClass(BUS);
		createEAttribute(busEClass, BUS__BUS_TYPE);

		systemTypeEClass = createEClass(SYSTEM_TYPE);
		createEReference(systemTypeEClass, SYSTEM_TYPE__BASE_DATA_TYPE);

		ecuTypeEClass = createEClass(ECU_TYPE);
		createEReference(ecuTypeEClass, ECU_TYPE__BASE_DATA_TYPE);

		microcontrollerTypeEClass = createEClass(MICROCONTROLLER_TYPE);
		createEReference(microcontrollerTypeEClass, MICROCONTROLLER_TYPE__BASE_DATA_TYPE);

		hwSystemEClass = createEClass(HW_SYSTEM);
		createEReference(hwSystemEClass, HW_SYSTEM__SYSTEM_TYPE);
		createEReference(hwSystemEClass, HW_SYSTEM__ECUS);

		ecuEClass = createEClass(ECU);
		createEReference(ecuEClass, ECU__ECU_TYPE);
		createEReference(ecuEClass, ECU__MICROCONTROLLERS);

		microcontrollerEClass = createEClass(MICROCONTROLLER);
		createEReference(microcontrollerEClass, MICROCONTROLLER__MICROCONTROLLER_TYPE);
		createEReference(microcontrollerEClass, MICROCONTROLLER__CORES);

		// Create enums
		interfaceKindEEnum = createEEnum(INTERFACE_KIND);
		qTypeEEnum = createEEnum(QTYPE);
		schedTypeEEnum = createEEnum(SCHED_TYPE);
		busTypeEEnum = createEEnum(BUS_TYPE);
		frequencyUnitEEnum = createEEnum(FREQUENCY_UNIT);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		BlocksPackage theBlocksPackage = (BlocksPackage)EPackage.Registry.INSTANCE.getEPackage(BlocksPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentsModelEClass.getESuperTypes().add(this.getBaseObject());
		baseObjectEClass.getESuperTypes().add(this.getIAnnotatable());
		componentEClass.getESuperTypes().add(this.getReferableBaseObject());
		componentEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		referableBaseObjectEClass.getESuperTypes().add(this.getIReferable());
		referableBaseObjectEClass.getESuperTypes().add(this.getIAnnotatable());
		compositeEClass.getESuperTypes().add(this.getComponent());
		compositeEClass.getESuperTypes().add(this.getISystem());
		connectorEClass.getESuperTypes().add(this.getBaseObject());
		qualifiedPortEClass.getESuperTypes().add(this.getBaseObject());
		componentInstanceEClass.getESuperTypes().add(this.getReferableBaseObject());
		portEClass.getESuperTypes().add(this.getReferableBaseObject());
		portEClass.getESuperTypes().add(this.getIAnnotatable());
		fInterfacePortEClass.getESuperTypes().add(this.getPort());
		coreEClass.getESuperTypes().add(this.getComplexNode());
		complexNodeEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		quartzEClass.getESuperTypes().add(this.getComplexNode());
		networkEClass.getESuperTypes().add(this.getComplexNode());
		busEClass.getESuperTypes().add(this.getNetworkType());
		busEClass.getESuperTypes().add(theBlocksPackage.getBlock());
		hwSystemEClass.getESuperTypes().add(this.getComplexNode());
		ecuEClass.getESuperTypes().add(this.getComplexNode());
		microcontrollerEClass.getESuperTypes().add(this.getComplexNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(runnableEClass, org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable.class, "Runnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunnable_Service(), theTypesPackage.getBoolean(), "service", null, 1, 1, org.eclipse.papyrus.amalthea.profile.AMALTHEA.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(componentsModelEClass, ComponentsModel.class, "ComponentsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentsModel_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, ComponentsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(baseObjectEClass, BaseObject.class, "BaseObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iAnnotatableEClass, IAnnotatable.class, "IAnnotatable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIAnnotatable_CustomProperties(), this.getCustomProperty(), null, "customProperties", null, 0, -1, IAnnotatable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(customPropertyEClass, CustomProperty.class, "CustomProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomProperty_Key(), ecorePackage.getEString(), "key", null, 1, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomProperty_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, CustomProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwModelEClass, HWModel.class, "HWModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHWModel_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 1, 1, HWModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(osModelEClass, OSModel.class, "OSModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOSModel_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 1, 1, OSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mappingModelEClass, MappingModel.class, "MappingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingModel_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 1, 1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stimuliModelEClass, StimuliModel.class, "StimuliModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStimuliModel_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 1, 1, StimuliModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(softwareModelEClass, SoftwareModel.class, "SoftwareModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareModel_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 1, 1, SoftwareModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(constraintsModelEClass, ConstraintsModel.class, "ConstraintsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintsModel_Base_Model(), theUMLPackage.getModel(), null, "base_Model", null, 1, 1, ConstraintsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(referableBaseObjectEClass, ReferableBaseObject.class, "ReferableBaseObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iReferableEClass, IReferable.class, "IReferable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIReferable_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 1, 1, IReferable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIReferable_UniqueName(), ecorePackage.getEString(), "uniqueName", null, 1, 1, IReferable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getIReferable__ComputeUniqueName(), ecorePackage.getEString(), "computeUniqueName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(compositeEClass, Composite.class, "Composite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSystemEClass, ISystem.class, "ISystem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISystem_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, ISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getISystem_GroundedPorts(), this.getQualifiedPort(), null, "groundedPorts", null, 0, -1, ISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getISystem_ComponentInstances(), this.getComponentInstance(), null, "componentInstances", null, 0, -1, ISystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getISystem_InnerPorts(), this.getQualifiedPort(), null, "innerPorts", null, 1, 1, ISystem.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Base_Connector(), theUMLPackage.getConnector(), null, "base_Connector", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_SourcePort(), this.getQualifiedPort(), null, "sourcePort", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_TargetPort(), this.getQualifiedPort(), null, "targetPort", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qualifiedPortEClass, QualifiedPort.class, "QualifiedPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifiedPort_Base_ConnectorEnd(), theUMLPackage.getConnectorEnd(), null, "base_ConnectorEnd", null, 1, 1, QualifiedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQualifiedPort_Instance(), this.getComponentInstance(), null, "instance", null, 1, 1, QualifiedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQualifiedPort_Port(), this.getPort(), null, "port", null, 1, 1, QualifiedPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fInterfacePortEClass, FInterfacePort.class, "FInterfacePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFInterfacePort_Kind(), this.getInterfaceKind(), "kind", "_undefined_", 1, 1, FInterfacePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(coreTypeEClass, CoreType.class, "CoreType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoreType_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, CoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoreType_BitWidth(), theTypesPackage.getInteger(), "bitWidth", "0", 1, 1, CoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCoreType_InstructionsPerCycle(), theTypesPackage.getInteger(), "instructionsPerCycle", "0", 1, 1, CoreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(coreEClass, Core.class, "Core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCore_CoreType(), this.getCoreType(), null, "coreType", null, 1, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCore_LockstepGroup(), theTypesPackage.getInteger(), "lockstepGroup", "0", 1, 1, Core.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(complexNodeEClass, ComplexNode.class, "ComplexNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexNode_Quartzes(), this.getQuartz(), null, "quartzes", null, 0, -1, ComplexNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComplexNode_Prescaler(), this.getPrescaler(), null, "prescaler", null, 1, 1, ComplexNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComplexNode_Networks(), this.getNetwork(), null, "networks", null, 0, -1, ComplexNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(quartzEClass, Quartz.class, "Quartz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuartz_Type(), this.getQType(), "type", "_undefined_", 1, 1, Quartz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQuartz_Frequency(), this.getFrequency(), null, "frequency", null, 1, 1, Quartz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(frequencyEClass, Frequency.class, "Frequency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequency_Value(), theTypesPackage.getReal(), "value", null, 1, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFrequency_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getFrequency__ToString(), theTypesPackage.getString(), "toString", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(prescalerEClass, Prescaler.class, "Prescaler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrescaler_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, Prescaler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPrescaler_ClockRatio(), theTypesPackage.getReal(), "clockRatio", "0.0", 1, 1, Prescaler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescaler_Quartz(), this.getQuartz(), null, "quartz", null, 1, 1, Prescaler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkEClass, Network.class, "Network", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetwork_Type(), this.getNetworkType(), null, "type", null, 1, 1, Network.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(networkTypeEClass, NetworkType.class, "NetworkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkType_SchedPolicy(), this.getSchedType(), "schedPolicy", "_undefined_", 1, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNetworkType_BitWidth(), theTypesPackage.getInteger(), "bitWidth", "0", 1, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNetworkType_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, NetworkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBus_BusType(), this.getBusType(), "busType", "_undefined_", 1, 1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemTypeEClass, SystemType.class, "SystemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemType_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, SystemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ecuTypeEClass, ECUType.class, "ECUType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECUType_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, ECUType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(microcontrollerTypeEClass, MicrocontrollerType.class, "MicrocontrollerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicrocontrollerType_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, MicrocontrollerType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hwSystemEClass, HwSystem.class, "HwSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHwSystem_SystemType(), this.getSystemType(), null, "systemType", null, 1, 1, HwSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHwSystem_Ecus(), this.getECU(), null, "ecus", null, 0, -1, HwSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ecuEClass, org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU.class, "ECU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getECU_EcuType(), this.getECUType(), null, "ecuType", null, 1, 1, org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getECU_Microcontrollers(), this.getMicrocontroller(), null, "microcontrollers", null, 0, -1, org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(microcontrollerEClass, Microcontroller.class, "Microcontroller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMicrocontroller_MicrocontrollerType(), this.getMicrocontrollerType(), null, "microcontrollerType", null, 1, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMicrocontroller_Cores(), this.getCore(), null, "cores", null, 1, 1, Microcontroller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(interfaceKindEEnum, InterfaceKind.class, "InterfaceKind");
		addEEnumLiteral(interfaceKindEEnum, InterfaceKind._UNDEFINED_);
		addEEnumLiteral(interfaceKindEEnum, InterfaceKind.PROVIDES);
		addEEnumLiteral(interfaceKindEEnum, InterfaceKind.REQUIRES);

		initEEnum(qTypeEEnum, QType.class, "QType");
		addEEnumLiteral(qTypeEEnum, QType._UNDEFINED_);
		addEEnumLiteral(qTypeEEnum, QType.DYNAMIC);
		addEEnumLiteral(qTypeEEnum, QType.STATIC);

		initEEnum(schedTypeEEnum, SchedType.class, "SchedType");
		addEEnumLiteral(schedTypeEEnum, SchedType._UNDEFINED_);
		addEEnumLiteral(schedTypeEEnum, SchedType.RROBIN);
		addEEnumLiteral(schedTypeEEnum, SchedType.PRIORITY);

		initEEnum(busTypeEEnum, BusType.class, "BusType");
		addEEnumLiteral(busTypeEEnum, BusType._UNDEFINED_);
		addEEnumLiteral(busTypeEEnum, BusType.CAN);
		addEEnumLiteral(busTypeEEnum, BusType.TTCAN);
		addEEnumLiteral(busTypeEEnum, BusType.LIN);
		addEEnumLiteral(busTypeEEnum, BusType.FLEXRAY);
		addEEnumLiteral(busTypeEEnum, BusType.ETHERNET);
		addEEnumLiteral(busTypeEEnum, BusType.SPI);
		addEEnumLiteral(busTypeEEnum, BusType.NA);

		initEEnum(frequencyUnitEEnum, FrequencyUnit.class, "FrequencyUnit");
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit._UNDEFINED_);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.HZ);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.KHZ);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.MHZ);
		addEEnumLiteral(frequencyUnitEEnum, FrequencyUnit.GHZ);

		// Create resource
		createResource(eNS_URI);
	}

} //AMALTHEAPackageImpl
