package org.eclipse.papyrus.amalthea.util;

import org.eclipse.papyrus.amalthea.profile.AMALTHEA.Frequency;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Stereotype;

/**
 * 
 * @author epp
 *
 */
public class CommonModelUtils {

	private static final String FREQUENCY = "AMALTHEA::Frequency";

	public static boolean isFrequency(Element el) {
		Stereotype s = el.getAppliedStereotype(FREQUENCY);
		return s != null;
	}

	public static Frequency getFrequency(Element el) {
		Stereotype s = el.getAppliedStereotype(FREQUENCY);
		return s == null ? null : (Frequency) el.getStereotypeApplication(s);
	}

}
