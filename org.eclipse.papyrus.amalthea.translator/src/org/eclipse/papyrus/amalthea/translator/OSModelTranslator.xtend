package org.eclipse.papyrus.amalthea.translator

import static extension org.eclipse.papyrus.amalthea.util.OSModelUtils.*
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.OperatingSystem
import org.eclipse.app4mc.amalthea.model.TaskScheduler
import org.eclipse.app4mc.amalthea.model.InterruptController
import org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm
import org.eclipse.app4mc.amalthea.model.SchedulingUnit
import org.eclipse.app4mc.amalthea.model.SchedulingHWUnit
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm

/**
 * @author epp
 */
class OSModelTranslator {

	val commonTranslator = new CommonModelTranslator

	dispatch def create {
		switch element {
			case element.isOperatingSystem:	AmaltheaFactory.eINSTANCE.createOperatingSystem
		}
	}
	translate(org.eclipse.uml2.uml.Class element) {
		name = element.name
		switch element {
			case element.isOperatingSystem: {
				val newElement = it as OperatingSystem
				newElement.taskSchedulers.addAll(
					element.getOperatingSystem.taskSchedulers
					.map[it as org.eclipse.uml2.uml.NamedElement]
					.map[translate]
					.map[it as TaskScheduler]
				)
				newElement.interruptControllers.addAll(
					element.getOperatingSystem.interruptControllers
					.map[it as org.eclipse.uml2.uml.NamedElement]
					.map[translate]
					.map[it as InterruptController]
				)
			}
		}
	}
	
	dispatch def create {
		switch element {
			case element.isTaskScheduler:		AmaltheaFactory.eINSTANCE.createTargetScheduler
			case element.isInterruptController:	AmaltheaFactory.eINSTANCE.createInterruptController
		}
	}
	translate(org.eclipse.uml2.uml.NamedElement element) {
		switch element {
			case element.isTaskScheduler: {
				val newElement = it as TaskScheduler
				newElement.name = element.name
				newElement.scheduleUnitPriority = element.getTaskScheduler.scheduleUnitPriority
				newElement.schedulingUnit = translate(element.getTaskScheduler.schedulingUnit as org.eclipse.uml2.uml.Element) as SchedulingUnit
				newElement.schedulingAlgorithm = translate(element.getTaskScheduler.taskSchedulingAlgorithm as org.eclipse.uml2.uml.Element) as TaskSchedulingAlgorithm
			}
			case element.isInterruptController: {
				val newElement = it as InterruptController
				newElement.name = element.name
				newElement.scheduleUnitPriority = element.getInterruptController.scheduleUnitPriority
				newElement.schedulingUnit = translate(element.getInterruptController.schedulingUnit as org.eclipse.uml2.uml.Element) as SchedulingUnit
				newElement.schedulingAlgorithm = translate(element.getInterruptController.interruptSchedulingAlgorithm as org.eclipse.uml2.uml.Element) as InterruptSchedulingAlgorithm
			}
		}
	}
	
	dispatch def create {
		switch element {
			case element.isSchedulingHWUnit:	AmaltheaFactory.eINSTANCE.createSchedulingHWUnit
			case element.isOSEK:				AmaltheaFactory.eINSTANCE.createOSEK
			case element.isPriorityBased:		AmaltheaFactory.eINSTANCE.createPriorityBased
		}
	}
	translate(org.eclipse.uml2.uml.Element element) {
		switch element {
			case element.isSchedulingHWUnit: {
				val newElement = it as SchedulingHWUnit
				newElement.delay = commonTranslator.translate(element.getSchedulingHWUnit.delay as org.eclipse.uml2.uml.Element) as Time
			}
			case element.isOSEK: {}
			case element.isPriorityBased: {}
		}
	}

}