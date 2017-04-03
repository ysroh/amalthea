/**
 */
package org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StimuliFactoryImpl extends EFactoryImpl implements StimuliFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StimuliFactory init() {
		try {
			StimuliFactory theStimuliFactory = (StimuliFactory)EPackage.Registry.INSTANCE.getEFactory(StimuliPackage.eNS_URI);
			if (theStimuliFactory != null) {
				return theStimuliFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StimuliFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimuliFactoryImpl() {
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
			case StimuliPackage.SINGLE: return createSingle();
			case StimuliPackage.PERIODIC: return createPeriodic();
			case StimuliPackage.INTERPROCESS: return createInterprocess();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Single createSingle() {
		SingleImpl single = new SingleImpl();
		return single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Periodic createPeriodic() {
		PeriodicImpl periodic = new PeriodicImpl();
		return periodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interprocess createInterprocess() {
		InterprocessImpl interprocess = new InterprocessImpl();
		return interprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StimuliPackage getStimuliPackage() {
		return (StimuliPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StimuliPackage getPackage() {
		return StimuliPackage.eINSTANCE;
	}

} //StimuliFactoryImpl
