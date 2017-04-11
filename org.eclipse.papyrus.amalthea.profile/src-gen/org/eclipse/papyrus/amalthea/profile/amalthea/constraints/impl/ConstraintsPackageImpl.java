/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.constraints.impl;

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

import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsFactory;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsModel;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.LimitType;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Requirement;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.RequirementLimit;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.Severity;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeMetric;
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.impl.HardwarePackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.impl.AmaltheaPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.mapping.MappingPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.mapping.impl.MappingPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.os.impl.OsPackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.software.impl.SoftwarePackageImpl;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl;

import org.eclipse.papyrus.sysml14.sysmlPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsPackageImpl extends EPackageImpl implements ConstraintsPackage {
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
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRequirementLimitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum limitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeMetricEEnum = null;

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
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ConstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintsPackageImpl() {
		super(eNS_URI, ConstraintsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintsPackage init() {
		if (isInited) return (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Obtain or create and register package
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstraintsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		sysmlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AmaltheaPackageImpl theAmaltheaPackage = (AmaltheaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmaltheaPackage.eNS_URI) instanceof AmaltheaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmaltheaPackage.eNS_URI) : AmaltheaPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		ComponentsPackageImpl theComponentsPackage = (ComponentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) instanceof ComponentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ComponentsPackage.eNS_URI) : ComponentsPackage.eINSTANCE);
		SoftwarePackageImpl theSoftwarePackage = (SoftwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) instanceof SoftwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI) : SoftwarePackage.eINSTANCE);
		StimuliPackageImpl theStimuliPackage = (StimuliPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI) instanceof StimuliPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StimuliPackage.eNS_URI) : StimuliPackage.eINSTANCE);
		HardwarePackageImpl theHardwarePackage = (HardwarePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) instanceof HardwarePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HardwarePackage.eNS_URI) : HardwarePackage.eINSTANCE);
		OsPackageImpl theOsPackage = (OsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OsPackage.eNS_URI) instanceof OsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OsPackage.eNS_URI) : OsPackage.eINSTANCE);
		MappingPackageImpl theMappingPackage = (MappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) instanceof MappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MappingPackage.eNS_URI) : MappingPackage.eINSTANCE);

		// Create package meta-data objects
		theConstraintsPackage.createPackageContents();
		theAmaltheaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theComponentsPackage.createPackageContents();
		theSoftwarePackage.createPackageContents();
		theStimuliPackage.createPackageContents();
		theHardwarePackage.createPackageContents();
		theOsPackage.createPackageContents();
		theMappingPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintsPackage.initializePackageContents();
		theAmaltheaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theComponentsPackage.initializePackageContents();
		theSoftwarePackage.initializePackageContents();
		theStimuliPackage.initializePackageContents();
		theHardwarePackage.initializePackageContents();
		theOsPackage.initializePackageContents();
		theMappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintsPackage.eNS_URI, theConstraintsPackage);
		return theConstraintsPackage;
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
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Severity() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Limit() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Base_Constraint() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementLimit() {
		return requirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementLimit_LimitType() {
		return (EAttribute)requirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementLimit_Base_DataType() {
		return (EReference)requirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequirement() {
		return processRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequirement_Process() {
		return (EReference)processRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeRequirementLimit() {
		return timeRequirementLimitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRequirementLimit_Metric() {
		return (EAttribute)timeRequirementLimitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeRequirementLimit_LimitValue() {
		return (EReference)timeRequirementLimitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLimitType() {
		return limitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeMetric() {
		return timeMetricEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsFactory getConstraintsFactory() {
		return (ConstraintsFactory)getEFactoryInstance();
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
		constraintsModelEClass = createEClass(CONSTRAINTS_MODEL);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__SEVERITY);
		createEReference(requirementEClass, REQUIREMENT__LIMIT);
		createEReference(requirementEClass, REQUIREMENT__BASE_CONSTRAINT);

		requirementLimitEClass = createEClass(REQUIREMENT_LIMIT);
		createEAttribute(requirementLimitEClass, REQUIREMENT_LIMIT__LIMIT_TYPE);
		createEReference(requirementLimitEClass, REQUIREMENT_LIMIT__BASE_DATA_TYPE);

		processRequirementEClass = createEClass(PROCESS_REQUIREMENT);
		createEReference(processRequirementEClass, PROCESS_REQUIREMENT__PROCESS);

		timeRequirementLimitEClass = createEClass(TIME_REQUIREMENT_LIMIT);
		createEAttribute(timeRequirementLimitEClass, TIME_REQUIREMENT_LIMIT__METRIC);
		createEReference(timeRequirementLimitEClass, TIME_REQUIREMENT_LIMIT__LIMIT_VALUE);

		// Create enums
		severityEEnum = createEEnum(SEVERITY);
		limitTypeEEnum = createEEnum(LIMIT_TYPE);
		timeMetricEEnum = createEEnum(TIME_METRIC);
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
		SoftwarePackage theSoftwarePackage = (SoftwarePackage)EPackage.Registry.INSTANCE.getEPackage(SoftwarePackage.eNS_URI);
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		processRequirementEClass.getESuperTypes().add(this.getRequirement());
		timeRequirementLimitEClass.getESuperTypes().add(this.getRequirementLimit());

		// Initialize classes, features, and operations; add parameters
		initEClass(constraintsModelEClass, ConstraintsModel.class, "ConstraintsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Severity(), this.getSeverity(), "severity", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirement_Limit(), this.getRequirementLimit(), null, "limit", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirement_Base_Constraint(), theUMLPackage.getConstraint(), null, "base_Constraint", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requirementLimitEClass, RequirementLimit.class, "RequirementLimit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementLimit_LimitType(), this.getLimitType(), "limitType", null, 1, 1, RequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRequirementLimit_Base_DataType(), theUMLPackage.getDataType(), null, "base_DataType", null, 1, 1, RequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processRequirementEClass, ProcessRequirement.class, "ProcessRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessRequirement_Process(), theSoftwarePackage.getAbstractProcess(), null, "process", null, 0, 1, ProcessRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeRequirementLimitEClass, TimeRequirementLimit.class, "TimeRequirementLimit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeRequirementLimit_Metric(), this.getTimeMetric(), "metric", null, 1, 1, TimeRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeRequirementLimit_LimitValue(), theCommonPackage.getSignedTime(), null, "limitValue", null, 0, 1, TimeRequirementLimit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity._UNDEFINED_);
		addEEnumLiteral(severityEEnum, Severity.COSMETIC);
		addEEnumLiteral(severityEEnum, Severity.MINOR);
		addEEnumLiteral(severityEEnum, Severity.MAJOR);
		addEEnumLiteral(severityEEnum, Severity.CRITICAL);

		initEEnum(limitTypeEEnum, LimitType.class, "LimitType");
		addEEnumLiteral(limitTypeEEnum, LimitType._UNDEFINED_);
		addEEnumLiteral(limitTypeEEnum, LimitType.UPPER_LIMIT);
		addEEnumLiteral(limitTypeEEnum, LimitType.LOWER_LIMIT);

		initEEnum(timeMetricEEnum, TimeMetric.class, "TimeMetric");
		addEEnumLiteral(timeMetricEEnum, TimeMetric._UNDEFINED_);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.ACTIVATE_TO_ACTIVATE);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.CORE_EXECUTION_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.END_TO_END);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.GROSS_EXECUTION_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.LATENESS);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.MEMORY_ACCESS_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.NET_EXECUTION_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.OS_OVERHEAD);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.PARKING_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.POLLING_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.READY_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.RESPONSE_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.RUNNING_TIME);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.START_DELAY);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.START_TO_START);
		addEEnumLiteral(timeMetricEEnum, TimeMetric.WAITING_TIME);

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
			 "originalName", "ConstraintsModel"
		   });
	}

} //ConstraintsPackageImpl
