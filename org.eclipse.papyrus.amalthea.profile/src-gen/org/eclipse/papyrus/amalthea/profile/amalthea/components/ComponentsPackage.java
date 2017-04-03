/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.components;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ComponentsModel'"
 * @generated
 */
public interface ComponentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "components";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/papyrus/2017/Amalthea/Components";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Components";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentsPackage eINSTANCE = org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.FInterfacePortImpl <em>FInterface Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.FInterfacePortImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl#getFInterfacePort()
	 * @generated
	 */
	int FINTERFACE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>FInterface Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FInterface Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINTERFACE_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.CompositeImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 2;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__BASE_COMPONENT = COMPONENT__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Componentinstances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COMPONENTINSTANCES = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentInstanceImpl
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort <em>FInterface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FInterface Port</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort
	 * @generated
	 */
	EClass getFInterfacePort();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort#getBase_Port()
	 * @see #getFInterfacePort()
	 * @generated
	 */
	EReference getFInterfacePort_Base_Port();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.Component#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.Component#getBase_Component()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Base_Component();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.Composite#getComponentinstances <em>Componentinstances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Componentinstances</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.Composite#getComponentinstances()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Componentinstances();

	/**
	 * Returns the meta object for class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentInstance#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentInstance#getBase_Property()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Base_Property();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentsFactory getComponentsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.FInterfacePortImpl <em>FInterface Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.FInterfacePortImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl#getFInterfacePort()
		 * @generated
		 */
		EClass FINTERFACE_PORT = eINSTANCE.getFInterfacePort();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINTERFACE_PORT__BASE_PORT = eINSTANCE.getFInterfacePort_Base_Port();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BASE_COMPONENT = eINSTANCE.getComponent_Base_Component();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.CompositeImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Componentinstances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__COMPONENTINSTANCES = eINSTANCE.getComposite_Componentinstances();

		/**
		 * The meta object literal for the '{@link org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentInstanceImpl
		 * @see org.eclipse.papyrus.amalthea.profile.amalthea.components.impl.ComponentsPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__BASE_PROPERTY = eINSTANCE.getComponentInstance_Base_Property();

	}

} //ComponentsPackage
