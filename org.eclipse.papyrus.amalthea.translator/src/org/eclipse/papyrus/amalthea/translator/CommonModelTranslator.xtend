package org.eclipse.papyrus.amalthea.translator

import static extension org.eclipse.papyrus.amalthea.profile.utils.CommonModelUtils.*
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.FrequencyUnit
import org.eclipse.papyrus.amalthea.profile.AMALTHEA.TimeUnit
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.Frequency
import org.eclipse.app4mc.amalthea.model.Time

/**
 * 
 * @author epp
 *
 */
class CommonModelTranslator {
	
	dispatch def create {
		switch element {
			case element.isFrequency:	AmaltheaFactory.eINSTANCE.createFrequency
			case element.isTime:		AmaltheaFactory.eINSTANCE.createTime
		}
	}
	translate(org.eclipse.uml2.uml.Element element) {
		switch element {
			case element.isFrequency: {
				val newElement = it as Frequency
				newElement.unit = switch element.getFrequency.unit {
					case FrequencyUnit.HZ: org.eclipse.app4mc.amalthea.model.FrequencyUnit.HZ
					case FrequencyUnit.KHZ: org.eclipse.app4mc.amalthea.model.FrequencyUnit.KHZ
					case FrequencyUnit.MHZ: org.eclipse.app4mc.amalthea.model.FrequencyUnit.MHZ
					case FrequencyUnit.GHZ: org.eclipse.app4mc.amalthea.model.FrequencyUnit.GHZ
					default: org.eclipse.app4mc.amalthea.model.FrequencyUnit._UNDEFINED_
				}
				newElement.value = element.getFrequency.value
			}
			case element.isTime: {
				val newElement = it as Time
				newElement.value = element.getTime.value
				newElement.unit = switch element.getTime.unit {
					case TimeUnit.S:	org.eclipse.app4mc.amalthea.model.TimeUnit.S
					case TimeUnit.MS:	org.eclipse.app4mc.amalthea.model.TimeUnit.MS
					case TimeUnit.US:	org.eclipse.app4mc.amalthea.model.TimeUnit.US
					case TimeUnit.NS:	org.eclipse.app4mc.amalthea.model.TimeUnit.NS
					case TimeUnit.PS:	org.eclipse.app4mc.amalthea.model.TimeUnit.PS
					default:			org.eclipse.app4mc.amalthea.model.TimeUnit._UNDEFINED_
				}
			}
		}
	}
	
}