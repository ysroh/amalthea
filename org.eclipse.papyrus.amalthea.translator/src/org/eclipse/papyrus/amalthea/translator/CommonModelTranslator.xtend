package org.eclipse.papyrus.amalthea.translator

import static extension org.eclipse.papyrus.amalthea.util.CommonModelUtils.*
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory

/**
 * 
 * @author epp
 *
 */
class CommonModelTranslator {
	
	dispatch def create {
		AmaltheaFactory.eINSTANCE.createFrequency
	}
	translate(org.eclipse.uml2.uml.Element element) {
		unit = switch element.getFrequency.unit {
			case FrequencyUnit.HZ: org.eclipse.app4mc.amalthea.model.FrequencyUnit.HZ
			case FrequencyUnit.KHZ: org.eclipse.app4mc.amalthea.model.FrequencyUnit.KHZ
			case FrequencyUnit.MHZ: org.eclipse.app4mc.amalthea.model.FrequencyUnit.MHZ
			case FrequencyUnit.GHZ: org.eclipse.app4mc.amalthea.model.FrequencyUnit.GHZ
			default: org.eclipse.app4mc.amalthea.model.FrequencyUnit._UNDEFINED_
		}
		value = element.getFrequency.value
	}
	
}