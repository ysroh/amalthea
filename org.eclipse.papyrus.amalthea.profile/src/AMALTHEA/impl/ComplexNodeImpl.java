/**
 */
package AMALTHEA.impl;

import AMALTHEA.AMALTHEAPackage;
import AMALTHEA.ComplexNode;
import AMALTHEA.Prescaler;
import AMALTHEA.Quartz;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.sysml14.blocks.internal.impl.BlockImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AMALTHEA.impl.ComplexNodeImpl#getQuartzes <em>Quartzes</em>}</li>
 *   <li>{@link AMALTHEA.impl.ComplexNodeImpl#getPrescaler <em>Prescaler</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComplexNodeImpl extends BlockImpl implements ComplexNode {
	/**
	 * The cached value of the '{@link #getQuartzes() <em>Quartzes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuartzes()
	 * @generated
	 * @ordered
	 */
	protected EList<Quartz> quartzes;

	/**
	 * The cached value of the '{@link #getPrescaler() <em>Prescaler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescaler()
	 * @generated
	 * @ordered
	 */
	protected Prescaler prescaler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AMALTHEAPackage.Literals.COMPLEX_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Quartz> getQuartzes() {
		if (quartzes == null) {
			quartzes = new EObjectContainmentEList<Quartz>(Quartz.class, this, AMALTHEAPackage.COMPLEX_NODE__QUARTZES);
		}
		return quartzes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescaler getPrescaler() {
		return prescaler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescaler(Prescaler newPrescaler, NotificationChain msgs) {
		Prescaler oldPrescaler = prescaler;
		prescaler = newPrescaler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.COMPLEX_NODE__PRESCALER, oldPrescaler, newPrescaler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescaler(Prescaler newPrescaler) {
		if (newPrescaler != prescaler) {
			NotificationChain msgs = null;
			if (prescaler != null)
				msgs = ((InternalEObject)prescaler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AMALTHEAPackage.COMPLEX_NODE__PRESCALER, null, msgs);
			if (newPrescaler != null)
				msgs = ((InternalEObject)newPrescaler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AMALTHEAPackage.COMPLEX_NODE__PRESCALER, null, msgs);
			msgs = basicSetPrescaler(newPrescaler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AMALTHEAPackage.COMPLEX_NODE__PRESCALER, newPrescaler, newPrescaler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AMALTHEAPackage.COMPLEX_NODE__QUARTZES:
				return ((InternalEList<?>)getQuartzes()).basicRemove(otherEnd, msgs);
			case AMALTHEAPackage.COMPLEX_NODE__PRESCALER:
				return basicSetPrescaler(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AMALTHEAPackage.COMPLEX_NODE__QUARTZES:
				return getQuartzes();
			case AMALTHEAPackage.COMPLEX_NODE__PRESCALER:
				return getPrescaler();
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
			case AMALTHEAPackage.COMPLEX_NODE__QUARTZES:
				getQuartzes().clear();
				getQuartzes().addAll((Collection<? extends Quartz>)newValue);
				return;
			case AMALTHEAPackage.COMPLEX_NODE__PRESCALER:
				setPrescaler((Prescaler)newValue);
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
			case AMALTHEAPackage.COMPLEX_NODE__QUARTZES:
				getQuartzes().clear();
				return;
			case AMALTHEAPackage.COMPLEX_NODE__PRESCALER:
				setPrescaler((Prescaler)null);
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
			case AMALTHEAPackage.COMPLEX_NODE__QUARTZES:
				return quartzes != null && !quartzes.isEmpty();
			case AMALTHEAPackage.COMPLEX_NODE__PRESCALER:
				return prescaler != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexNodeImpl
