package org.eclipse.papyrus.amalthea.util;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Bus;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ComplexNode;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Core;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.CoreType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.HwSystem;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Microcontroller;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.MicrocontrollerType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Network;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.NetworkType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Prescaler;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Quartz;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECU;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.ECUType;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.SystemType;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * 
 * @author epp
 *
 */
public class HWModelUtils {

	private static final String COMPLEX_NODE = "AMALTHEA::ComplexNode";
	private static final String HWSYSTEM = "AMALTHEA::HwSystem";
	private static final String ECU = "AMALTHEA::ECU";
	private static final String MICROCONTROLLER = "AMALTHEA::Microcontroller";
	private static final String CORE = "AMALTHEA::Core";
	private static final String NETWORK = "AMALTHEA::Network";
	private static final String BUS = "AMALTHEA::Bus";
	private static final String PRESCALER = "AMALTHEA::Prescaler";
	private static final String QUARTZ = "AMALTHEA::Quartz";
	private static final String SYSTEM_TYPE = "AMALTHEA::SystemType";
	private static final String ECU_TYPE = "AMALTHEA::ECUType";
	private static final String MICROCONTROLLER_TYPE = "AMALTHEA::MicrocontrollerType";
	private static final String CORE_TYPE = "AMALTHEA::CoreType";
	private static final String NETWORK_TYPE = "AMALTHEA::NetworkType";

	public static boolean isComplexNode(Element el) {
		Stereotype s = el.getAppliedStereotype(COMPLEX_NODE);
		return s != null;
	}

	public static ComplexNode getComplexNode(Element el) {
		Stereotype s = el.getAppliedStereotype(COMPLEX_NODE);
		return s == null ? null : (ComplexNode) el.getStereotypeApplication(s);
	}

	public static boolean isHwSystem(Element el) {
		Stereotype s = el.getAppliedStereotype(HWSYSTEM);
		return s != null;
	}

	public static HwSystem getHwSystem(Element el) {
		Stereotype s = el.getAppliedStereotype(HWSYSTEM);
		return s == null ? null : (HwSystem) el.getStereotypeApplication(s);
	}

	public static boolean isECU(Element el) {
		Stereotype s = el.getAppliedStereotype(ECU);
		return s != null;
	}

	public static ECU getECU(Element el) {
		Stereotype s = el.getAppliedStereotype(ECU);
		return s == null ? null : (ECU) el.getStereotypeApplication(s);
	}

	public static boolean isMicrocontroller(Element el) {
		Stereotype s = el.getAppliedStereotype(MICROCONTROLLER);
		return s != null;
	}

	public static Microcontroller getMicrocontroller(Element el) {
		Stereotype s = el.getAppliedStereotype(MICROCONTROLLER);
		return s == null ? null : (Microcontroller) el.getStereotypeApplication(s);
	}

	public static boolean isCore(Element el) {
		Stereotype s = el.getAppliedStereotype(CORE);
		return s != null;
	}

	public static Core getCore(Element el) {
		Stereotype s = el.getAppliedStereotype(CORE);
		return s == null ? null : (Core) el.getStereotypeApplication(s);
	}

	public static boolean isNetwork(Element el) {
		Stereotype s = el.getAppliedStereotype(NETWORK);
		return s != null;
	}

	public static Network getNetwork(Element el) {
		Stereotype s = el.getAppliedStereotype(NETWORK);
		return s == null ? null : (Network) el.getStereotypeApplication(s);
	}

	public static boolean isBus(Element el) {
		Stereotype s = el.getAppliedStereotype(BUS);
		return s != null;
	}

	public static Bus getBus(Element el) {
		Stereotype s = el.getAppliedStereotype(BUS);
		return s == null ? null : (Bus) el.getStereotypeApplication(s);
	}

	public static boolean isPrescaler(Element el) {
		Stereotype s = el.getAppliedStereotype(PRESCALER);
		return s != null;
	}

	public static Prescaler getPrescaler(Element el) {
		Stereotype s = el.getAppliedStereotype(PRESCALER);
		return s == null ? null : (Prescaler) el.getStereotypeApplication(s);
	}

	public static boolean isQuartz(Element el) {
		Stereotype s = el.getAppliedStereotype(QUARTZ);
		return s != null;
	}

	public static Quartz getQuartz(Element el) {
		Stereotype s = el.getAppliedStereotype(QUARTZ);
		return s == null ? null : (Quartz) el.getStereotypeApplication(s);
	}

	public static boolean isSystemType(Element el) {
		Stereotype s = el.getAppliedStereotype(SYSTEM_TYPE);
		return s != null;
	}

	public static SystemType getSystemType(Element el) {
		Stereotype s = el.getAppliedStereotype(SYSTEM_TYPE);
		return s == null ? null : (SystemType) el.getStereotypeApplication(s);
	}

	public static boolean isECUType(Element el) {
		Stereotype s = el.getAppliedStereotype(ECU_TYPE);
		return s != null;
	}

	public static ECUType getECUType(Element el) {
		Stereotype s = el.getAppliedStereotype(ECU_TYPE);
		return s == null ? null : (ECUType) el.getStereotypeApplication(s);
	}

	public static boolean isMicrocontrollerType(Element el) {
		Stereotype s = el.getAppliedStereotype(MICROCONTROLLER_TYPE);
		return s != null;
	}

	public static MicrocontrollerType getMicrocontrollerType(Element el) {
		Stereotype s = el.getAppliedStereotype(MICROCONTROLLER_TYPE);
		return s == null ? null : (MicrocontrollerType) el.getStereotypeApplication(s);
	}

	public static boolean isCoreType(Element el) {
		Stereotype s = el.getAppliedStereotype(CORE_TYPE);
		return s != null;
	}

	public static CoreType getCoreType(Element el) {
		Stereotype s = el.getAppliedStereotype(CORE_TYPE);
		return s == null ? null : (CoreType) el.getStereotypeApplication(s);
	}

	public static boolean isNetworkType(Element el) {
		Stereotype s = el.getAppliedStereotype(NETWORK_TYPE);
		return s != null;
	}

	public static NetworkType getNetworkType(Element el) {
		Stereotype s = el.getAppliedStereotype(NETWORK_TYPE);
		return s == null ? null : (NetworkType) el.getStereotypeApplication(s);
	}

}
