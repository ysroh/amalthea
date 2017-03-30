/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.BaseObject;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.CustomProperty;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.IAnnotatable;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.InterruptController;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.OperatingSystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TaskScheduler;

import org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.OperatingSystemImpl#getCustomProperties <em>Custom Properties</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.OperatingSystemImpl#getTaskSchedulers <em>Task Schedulers</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.impl.OperatingSystemImpl#getInterruptControllers <em>Interrupt Controllers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingSystemImpl extends BlockImpl implements OperatingSystem {
	/**
	 * The cached value of the '{@link #getCustomProperties() <em>Custom Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomProperty> customProperties;

	/**
	 * The cached value of the '{@link #getTaskSchedulers() <em>Task Schedulers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskSchedulers()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskScheduler> taskSchedulers;

	/**
	 * The cached value of the '{@link #getInterruptControllers() <em>Interrupt Controllers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<InterruptController> interruptControllers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.OPERATING_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomProperty> getCustomProperties() {
		if (customProperties == null) {
			customProperties = new EObjectResolvingEList<CustomProperty>(CustomProperty.class, this, AMALTHEAPackage.OPERATING_SYSTEM__CUSTOM_PROPERTIES);
		}
		return customProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskScheduler> getTaskSchedulers() {
		if (taskSchedulers == null) {
			taskSchedulers = new EObjectResolvingEList<TaskScheduler>(TaskScheduler.class, this, AMALTHEAPackage.OPERATING_SYSTEM__TASK_SCHEDULERS);
		}
		return taskSchedulers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterruptController> getInterruptControllers() {
		if (interruptControllers == null) {
			interruptControllers = new EObjectResolvingEList<InterruptController>(InterruptController.class, this, AMALTHEAPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS);
		}
		return interruptControllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.OPERATING_SYSTEM__CUSTOM_PROPERTIES:
				return getCustomProperties();
			case AMALTHEAPackage.OPERATING_SYSTEM__TASK_SCHEDULERS:
				return getTaskSchedulers();
			case AMALTHEAPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS:
				return getInterruptControllers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AMALTHEAPackage.OPERATING_SYSTEM__CUSTOM_PROPERTIES:
				getCustomProperties().clear();
				getCustomProperties().addAll((Collection<? extends CustomProperty>)newValue);
				return;
			case AMALTHEAPackage.OPERATING_SYSTEM__TASK_SCHEDULERS:
				getTaskSchedulers().clear();
				getTaskSchedulers().addAll((Collection<? extends TaskScheduler>)newValue);
				return;
			case AMALTHEAPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS:
				getInterruptControllers().clear();
				getInterruptControllers().addAll((Collection<? extends InterruptController>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AMALTHEAPackage.OPERATING_SYSTEM__CUSTOM_PROPERTIES:
				getCustomProperties().clear();
				return;
			case AMALTHEAPackage.OPERATING_SYSTEM__TASK_SCHEDULERS:
				getTaskSchedulers().clear();
				return;
			case AMALTHEAPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS:
				getInterruptControllers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AMALTHEAPackage.OPERATING_SYSTEM__CUSTOM_PROPERTIES:
				return customProperties != null && !customProperties.isEmpty();
			case AMALTHEAPackage.OPERATING_SYSTEM__TASK_SCHEDULERS:
				return taskSchedulers != null && !taskSchedulers.isEmpty();
			case AMALTHEAPackage.OPERATING_SYSTEM__INTERRUPT_CONTROLLERS:
				return interruptControllers != null && !interruptControllers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IAnnotatable.class) {
			switch (derivedFeatureID) {
				case AMALTHEAPackage.OPERATING_SYSTEM__CUSTOM_PROPERTIES: return AMALTHEAPackage.IANNOTATABLE__CUSTOM_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == BaseObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IAnnotatable.class) {
			switch (baseFeatureID) {
				case AMALTHEAPackage.IANNOTATABLE__CUSTOM_PROPERTIES: return AMALTHEAPackage.OPERATING_SYSTEM__CUSTOM_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == BaseObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OperatingSystemImpl
