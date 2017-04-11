/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.hardware.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.*;

import org.eclipse.papyrus.sysml14.blocks.Block;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage
 * @generated
 */
public class HardwareAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HardwarePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HardwarePackage.eINSTANCE;
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
	protected HardwareSwitch<Adapter> modelSwitch =
		new HardwareSwitch<Adapter>() {
			@Override
			public Adapter caseHwSystem(HwSystem object) {
				return createHwSystemAdapter();
			}
			@Override
			public Adapter caseComplexNode(ComplexNode object) {
				return createComplexNodeAdapter();
			}
			@Override
			public Adapter caseQuartz(Quartz object) {
				return createQuartzAdapter();
			}
			@Override
			public Adapter caseFrequency(Frequency object) {
				return createFrequencyAdapter();
			}
			@Override
			public Adapter casePrescaler(Prescaler object) {
				return createPrescalerAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseNetworkType(NetworkType object) {
				return createNetworkTypeAdapter();
			}
			@Override
			public Adapter caseECU(ECU object) {
				return createECUAdapter();
			}
			@Override
			public Adapter caseMicrocontroller(Microcontroller object) {
				return createMicrocontrollerAdapter();
			}
			@Override
			public Adapter caseCore(Core object) {
				return createCoreAdapter();
			}
			@Override
			public Adapter caseCoreType(CoreType object) {
				return createCoreTypeAdapter();
			}
			@Override
			public Adapter caseMicrocontrollerType(MicrocontrollerType object) {
				return createMicrocontrollerTypeAdapter();
			}
			@Override
			public Adapter caseECUType(ECUType object) {
				return createECUTypeAdapter();
			}
			@Override
			public Adapter caseSystemType(SystemType object) {
				return createSystemTypeAdapter();
			}
			@Override
			public Adapter caseBus(Bus object) {
				return createBusAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem <em>Hw System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem
	 * @generated
	 */
	public Adapter createHwSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode <em>Complex Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ComplexNode
	 * @generated
	 */
	public Adapter createComplexNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz <em>Quartz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz
	 * @generated
	 */
	public Adapter createQuartzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency
	 * @generated
	 */
	public Adapter createFrequencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler <em>Prescaler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler
	 * @generated
	 */
	public Adapter createPrescalerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType
	 * @generated
	 */
	public Adapter createNetworkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU <em>ECU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU
	 * @generated
	 */
	public Adapter createECUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller <em>Microcontroller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller
	 * @generated
	 */
	public Adapter createMicrocontrollerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType <em>Core Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType
	 * @generated
	 */
	public Adapter createCoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType <em>Microcontroller Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType
	 * @generated
	 */
	public Adapter createMicrocontrollerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType <em>ECU Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType
	 * @generated
	 */
	public Adapter createECUTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType
	 * @generated
	 */
	public Adapter createSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Bus
	 * @generated
	 */
	public Adapter createBusAdapter() {
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

} //HardwareAdapterFactory
