package org.eclipse.papyrus.amalthea.profile.utils;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Component;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComponentInstance;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Composite;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Connector;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.FInterfacePort;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Port;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.QualifiedPort;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * 
 * @author epp
 *
 */
public class ComponentModelUtils {

	private static final String COMPONENT = "AMALTHEA::Component";
	private static final String COMPOSITE = "AMALTHEA::Composite";
	private static final String COMPONENT_INSTANCE = "AMALTHEA::ComponentInstance";
	private static final String CONNECTOR = "AMALTHEA::Connector";
	private static final String QUALIFIED_PORT = "AMALTHEA::QualifiedPort";
	private static final String PORT = "AMALTHEA::Port";
	private static final String FINTERFACE_PORT = "AMALTHEA::FInterfacePort";

	public static boolean isComponent(Element el) {
		Stereotype s = el.getAppliedStereotype(COMPONENT);
		return s != null;
	}

	public static Component getComponent(Element el) {
		Stereotype s = el.getAppliedStereotype(COMPONENT);
		return s == null ? null : (Component) el.getStereotypeApplication(s);
	}

	public static boolean isComposite(Element el) {
		Stereotype s = el.getAppliedStereotype(COMPOSITE);
		return s != null;
	}

	public static Composite getComposite(Element el) {
		Stereotype s = el.getAppliedStereotype(COMPOSITE);
		return s == null ? null : (Composite) el.getStereotypeApplication(s);
	}

	public static boolean isComponentInstance(Element el) {
		Stereotype s = el.getAppliedStereotype(COMPONENT_INSTANCE);
		return s != null;
	}

	public static ComponentInstance getComponentInstance(Element el) {
		Stereotype s = el.getAppliedStereotype(COMPONENT_INSTANCE);
		return s == null ? null : (ComponentInstance) el.getStereotypeApplication(s);
	}

	public static boolean isConnector(Element el) {
		Stereotype s = el.getAppliedStereotype(CONNECTOR);
		return s != null;
	}

	public static Connector getConnector(Element el) {
		Stereotype s = el.getAppliedStereotype(CONNECTOR);
		return s == null ? null : (Connector) el.getStereotypeApplication(s);
	}

	public static boolean isQualifiedPort(Element el) {
		Stereotype s = el.getAppliedStereotype(QUALIFIED_PORT);
		return s != null;
	}

	public static QualifiedPort getQualifiedPort(Element el) {
		Stereotype s = el.getAppliedStereotype(QUALIFIED_PORT);
		return s == null ? null : (QualifiedPort) el.getStereotypeApplication(s);
	}

	public static boolean isPort(Element el) {
		Stereotype s = el.getAppliedStereotype(PORT);
		return s != null;
	}

	public static Port getPort(Element el) {
		Stereotype s = el.getAppliedStereotype(PORT);
		return s == null ? null : (Port) el.getStereotypeApplication(s);
	}

	public static boolean isFInterfacePort(Element el) {
		Stereotype s = el.getAppliedStereotype(FINTERFACE_PORT);
		return s != null;
	}

	public static FInterfacePort getFInterfacePort(Element el) {
		Stereotype s = el.getAppliedStereotype(FINTERFACE_PORT);
		return s == null ? null : (FInterfacePort) el.getStereotypeApplication(s);
	}

}
