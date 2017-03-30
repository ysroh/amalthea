package org.eclipse.papyrus.amalthea.translator

import static extension org.eclipse.papyrus.amalthea.util.HWModelUtils.*
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.HwSystem
import org.eclipse.app4mc.amalthea.model.SystemType
import org.eclipse.app4mc.amalthea.model.Prescaler
import org.eclipse.app4mc.amalthea.model.ECU
import org.eclipse.app4mc.amalthea.model.ECUType
import org.eclipse.app4mc.amalthea.model.Microcontroller
import org.eclipse.app4mc.amalthea.model.MicrocontrollerType
import org.eclipse.app4mc.amalthea.model.CoreType
import org.eclipse.app4mc.amalthea.model.Core
import org.eclipse.app4mc.amalthea.model.Network
import org.eclipse.app4mc.amalthea.model.NetworkType
import org.eclipse.app4mc.amalthea.model.Quartz
import org.eclipse.app4mc.amalthea.model.Bus
import org.eclipse.app4mc.amalthea.model.Frequency

/**
 * @author epp
 */
class HWModelTranslator {
	
	val commonTranslator = new CommonModelTranslator

	dispatch def create {
		switch element {
			case element.isHwSystem: 		AmaltheaFactory.eINSTANCE.createHwSystem
			case element.isECU:		 		AmaltheaFactory.eINSTANCE.createECU
			case element.isMicrocontroller:	AmaltheaFactory.eINSTANCE.createMicrocontroller
			case element.isCore:			AmaltheaFactory.eINSTANCE.createCore
			case element.isNetwork:			AmaltheaFactory.eINSTANCE.createNetwork
			case element.isQuartz:			AmaltheaFactory.eINSTANCE.createQuartz
		}
	}
	translate(org.eclipse.uml2.uml.Class element) {
		name = element.name
		// Translate ComplexNode
		val node = element.getComplexNode
		prescaler = translate(node.prescaler as org.eclipse.uml2.uml.Element) as Prescaler
		quartzes.addAll(node.quartzes.map[base_Class].map[translate].map[it as Quartz])
		networks.addAll(node.networks.map[base_Class].map[translate].map[it as Network])
		switch element {
			case element.isHwSystem: {
				val newElement = it as HwSystem
				newElement.systemType = translate(element.getHwSystem.systemType as org.eclipse.uml2.uml.DataType) as SystemType
			}
			case element.isECU: {
				val newElement = it as ECU
				newElement.ecuType = translate(element.getECU.ecuType as org.eclipse.uml2.uml.DataType) as ECUType				
			}
			case element.isMicrocontroller: {
				val newElement = it as Microcontroller
				newElement.microcontrollerType = translate(element.getMicrocontroller.microcontrollerType as org.eclipse.uml2.uml.DataType) as MicrocontrollerType				
			}
			case element.isCore: {
				val newElement = it as Core
				newElement.coreType = translate(element.getCore.coreType as org.eclipse.uml2.uml.DataType) as CoreType				
				
			}
			case element.isNetwork: {
				val newElement = it as Network
				newElement.type = translate(element.getNetwork.type as org.eclipse.uml2.uml.DataType) as NetworkType				
			}
			case element.isQuartz: {
				val newElement = it as Quartz
				newElement.type = switch element.getQuartz.type {
					case DYNAMIC:	org.eclipse.app4mc.amalthea.model.QType.DYNAMIC
					case STATIC:	org.eclipse.app4mc.amalthea.model.QType.STATIC
					default:		org.eclipse.app4mc.amalthea.model.QType._UNDEFINED_
				}
				newElement.frequency = commonTranslator.translate(element.getQuartz.frequency as org.eclipse.uml2.uml.Element) as Frequency
			}
		}
		
	}

	dispatch def create {
		switch element {
			case element.isSystemType:			AmaltheaFactory.eINSTANCE.createSystemType
			case element.isECUType:				AmaltheaFactory.eINSTANCE.createECUType
			case element.isMicrocontrollerType:	AmaltheaFactory.eINSTANCE.createMicrocontrollerType
			case element.isCoreType:			AmaltheaFactory.eINSTANCE.createCoreType
			case element.isNetworkType:			AmaltheaFactory.eINSTANCE.createNetworkType
			case element.isBus:					AmaltheaFactory.eINSTANCE.createBus
		}	
	}
	translate(org.eclipse.uml2.uml.DataType element) {
		name = element.name
		switch element {
			case element.isCoreType: {
				val newElement = it as CoreType
				newElement.bitWidth = element.getCoreType.bitWidth
				newElement.instructionsPerCycle = element.getCoreType.instructionsPerCycle
			}
			case element.isNetworkType: {
				val newElement = it as NetworkType
				newElement.bitWidth = element.getNetworkType.bitWidth
				newElement.schedPolicy = switch element.getNetworkType.schedPolicy {
					case RROBIN: 	org.eclipse.app4mc.amalthea.model.SchedType.RROBIN
					case PRIORITY:	org.eclipse.app4mc.amalthea.model.SchedType.PRIORITY
					default:		org.eclipse.app4mc.amalthea.model.SchedType._UNDEFINED_
				}
			}
			case element.isBus: {
				val newElement = it as Bus
				newElement.bitWidth = element.getBus.bitWidth
				newElement.schedPolicy = switch element.getBus.schedPolicy {
					case RROBIN: 	org.eclipse.app4mc.amalthea.model.SchedType.RROBIN
					case PRIORITY:	org.eclipse.app4mc.amalthea.model.SchedType.PRIORITY
					default:		org.eclipse.app4mc.amalthea.model.SchedType._UNDEFINED_
				}
				newElement.busType = switch element.getBus.busType {
					case CAN:		org.eclipse.app4mc.amalthea.model.BusType.CAN
					case TTCAN:		org.eclipse.app4mc.amalthea.model.BusType.TTCAN
					case LIN:		org.eclipse.app4mc.amalthea.model.BusType.LIN
					case FLEXRAY:	org.eclipse.app4mc.amalthea.model.BusType.FLEXRAY
					case ETHERNET:	org.eclipse.app4mc.amalthea.model.BusType.ETHERNET
					case SPI:		org.eclipse.app4mc.amalthea.model.BusType.SPI
					case NA:		org.eclipse.app4mc.amalthea.model.BusType.NA
					default:		org.eclipse.app4mc.amalthea.model.BusType._UNDEFINED_
				}
			}
		}
	}

	dispatch def create {
		switch element {
			case element.isPrescaler:	AmaltheaFactory.eINSTANCE.createPrescaler
		}
	}
	translate(org.eclipse.uml2.uml.Element element) {
		switch element {
			case element.isPrescaler: {
				val prescaler = element.getPrescaler
				name = prescaler.name
				clockRatio = prescaler.clockRatio
				quartz = translate(prescaler.quartz as org.eclipse.uml2.uml.Class) as Quartz
			}
		}
	}

}