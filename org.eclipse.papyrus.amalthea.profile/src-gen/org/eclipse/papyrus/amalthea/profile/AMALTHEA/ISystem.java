/**
 */
package org.eclipse.papyrus.amalthea.profile.AMALTHEA;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getGroundedPorts <em>Grounded Ports</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getComponentInstances <em>Component Instances</em>}</li>
 *   <li>{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getInnerPorts <em>Inner Ports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getISystem()
 * @model abstract="true"
 * @generated
 */
public interface ISystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getISystem_Connectors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Grounded Ports</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grounded Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grounded Ports</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getISystem_GroundedPorts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<QualifiedPort> getGroundedPorts();

	/**
	 * Returns the value of the '<em><b>Component Instances</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instances</em>' reference list.
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getISystem_ComponentInstances()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ComponentInstance> getComponentInstances();

	/**
	 * Returns the value of the '<em><b>Inner Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Ports</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Ports</em>' reference.
	 * @see #setInnerPorts(QualifiedPort)
	 * @see org.eclipse.papyrus.amalthea.profile.AMALTHEA.AMALTHEAPackage#getISystem_InnerPorts()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	QualifiedPort getInnerPorts();

	/**
	 * Sets the value of the '{@link org.eclipse.papyrus.amalthea.profile.AMALTHEA.ISystem#getInnerPorts <em>Inner Ports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Ports</em>' reference.
	 * @see #getInnerPorts()
	 * @generated
	 */
	void setInnerPorts(QualifiedPort value);

} // ISystem
