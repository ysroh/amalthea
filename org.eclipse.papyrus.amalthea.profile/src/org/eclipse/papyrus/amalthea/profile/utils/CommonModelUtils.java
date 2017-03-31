package org.eclipse.papyrus.amalthea.profile.utils;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency;
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Time;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * 
 * @author epp
 *
 */
public class CommonModelUtils {

	private static final String FREQUENCY = "AMALTHEA::Frequency";
	private static final String TIME = "AMALTHEA::Time";

	public static boolean isFrequency(Element el) {
		Stereotype s = el.getAppliedStereotype(FREQUENCY);
		return s != null;
	}

	public static Frequency getFrequency(Element el) {
		Stereotype s = el.getAppliedStereotype(FREQUENCY);
		return s == null ? null : (Frequency) el.getStereotypeApplication(s);
	}

	public static boolean isTime(Element el) {
		Stereotype s = el.getAppliedStereotype(TIME);
		return s != null;
	}

	public static Time getTime(Element el) {
		Stereotype s = el.getAppliedStereotype(TIME);
		return s == null ? null : (Time) el.getStereotypeApplication(s);
	}

}
