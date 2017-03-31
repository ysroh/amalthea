/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.software.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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

import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwareFactory;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwareModel;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl.StimuliPackageImpl;

import org.eclipse.papyrus.sysml14.sysmlPackage;

import org.eclipse.uml2.types.TypesPackage;

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
	private EClass runnableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareModelEClass = null;

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
	public EClass getSoftwareModel() {
		return softwareModelEClass;
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
		runnableEClass = createEClass(RUNNABLE);
		createEAttribute(runnableEClass, RUNNABLE__SERVICE);

		softwareModelEClass = createEClass(SOFTWARE_MODEL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(runnableEClass, org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable.class, "Runnable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunnable_Service(), theTypesPackage.getBoolean(), "service", null, 1, 1, org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(softwareModelEClass, SoftwareModel.class, "SoftwareModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
