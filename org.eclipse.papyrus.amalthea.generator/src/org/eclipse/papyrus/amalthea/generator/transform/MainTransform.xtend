package org.eclipse.papyrus.amalthea.generator.transform

import java.util.Collections
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.Component
import org.eclipse.app4mc.amalthea.model.CoreAllocation
import org.eclipse.app4mc.amalthea.model.CoreType
import org.eclipse.app4mc.amalthea.model.HwSystem
import org.eclipse.app4mc.amalthea.model.ISR
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum
import org.eclipse.app4mc.amalthea.model.MicrocontrollerType
import org.eclipse.app4mc.amalthea.model.NetworkType
import org.eclipse.app4mc.amalthea.model.OperatingSystem
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.Stimulus
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TaskAllocation
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package

import static extension org.eclipse.papyrus.amalthea.generator.transform.TransformUtil.*
import org.eclipse.app4mc.amalthea.model.RunnableItem
import org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions
import org.eclipse.app4mc.amalthea.model.Instructions
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation
import org.eclipse.app4mc.amalthea.model.Distribution
import org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators
import org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation
import java.util.Objects

class MainTransform {

	val ResourceSet rset = new ResourceSetImpl
	
	var Model root = null

	// main transform
	def void generate(Model model) {
		root = model
		val transformed = model.transformModel
		val uri = model.eResource.URI.trimFileExtension.appendFileExtension("amxmi")
		val resource = rset.createResource(uri)
		resource.contents.add(transformed)
		resource.save(Collections.EMPTY_MAP)
		resource.unload
	}

	def private create AmaltheaFactory.eINSTANCE.createAmalthea transformModel(Model model) {
		model.transformPackage
		it.componentsModel = model.componentsModel
		it.swModel = model.softwareModel
		it.hwModel = model.hardwareModel
		it.osModel = model.OSModel
		it.stimuliModel = model.stimuliModel
		it.mappingModel = model.mappingModel
    }
    
    
	def private dispatch transform(Object o) {
		
	}
    
	def private void transformPackage(Package pkg) {
		val transformed = pkg.packagedElements.amaltheaList.map(p|p.transform).filter(e | e != null)

		// SWModel elements
		val swModel = root.softwareModel
		swModel.runnables.addAll(transformed.filter(typeof(Runnable)))
		swModel.labels.addAll(transformed.filter(typeof(Label)))
		swModel.tasks.addAll(transformed.filter(typeof(Task)))
		swModel.isrs.addAll(transformed.filter(typeof(ISR)))
		
		// HWModel elements
		val hwModel = root.hardwareModel
		hwModel.coreTypes.addAll(transformed.filter(typeof(CoreType)))
		hwModel.mcTypes.addAll(transformed.filter(typeof(MicrocontrollerType)))
		hwModel.networkTypes.addAll(transformed.filter(typeof(NetworkType)))
		val system = transformed.filter(typeof(HwSystem))
		if(!system.empty){
			hwModel.system = system.get(0)
		}
		
		// OSModel
		val osModel = root.OSModel
		osModel.operatingSystems.addAll(transformed.filter(typeof(OperatingSystem)))
		
		// Component
		val component = root.componentsModel
		component.components.addAll(transformed.filter(typeof(Component)))
		
		// Stimuli
		val stimuli = root.stimuliModel
		stimuli.stimuli.addAll(transformed.filter(typeof(Stimulus)))
		
		val mapping = root.mappingModel
		mapping.coreAllocation.addAll(transformed.filter(typeof(CoreAllocation)))
		mapping.taskAllocation.addAll(transformed.filter(typeof(TaskAllocation)))
	}
	
	def private dispatch transform(Package pkg) {
		pkg.transformPackage
	}
	
	def private create AmaltheaFactory.eINSTANCE.createSWModel getSoftwareModel(Model model){
	}
	
	def private create AmaltheaFactory.eINSTANCE.createMappingModel getMappingModel(Model model){
	}
	
	def private create AmaltheaFactory.eINSTANCE.createHWModel getHardwareModel(Model model){
	}
	
	def private create AmaltheaFactory.eINSTANCE.createOSModel getOSModel(Model model){
	}
	
	def private create AmaltheaFactory.eINSTANCE.createStimuliModel getStimuliModel(Model model){
	}

	def private create AmaltheaFactory.eINSTANCE.createComponentsModel getComponentsModel(Model model){
	}	
	
	// Runnables
	def private dispatch create AmaltheaFactory.eINSTANCE.createRunnable transform(org.eclipse.papyrus.amalthea.profile.amalthea.software.Runnable runnable) {
		val base = runnable.base_Class
		it.name = base.name
		it.callback = runnable.callback
		it.service = runnable.service
		it.runnableItems.addAll(base.ownedOperations.amaltheaList.map[o | o.transform].filter(typeof(RunnableItem)))
	}
			
	def private dispatch create AmaltheaFactory.eINSTANCE.createLabelAccess transform(LabelAccess label){
		it.access = LabelAccessEnum.READ
		it.data = label.data?.transform as Label
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createRunnableInstructions transform(RunnableInstructions instruction){
		val dist = instruction.^default?.transform as org.eclipse.app4mc.amalthea.model.InstructionsDeviation
		it.^default = dist
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createInstructionsDeviation transform(InstructionsDeviation instructionsDeviation){
		it.deviation = instructionsDeviation.deviation?.transform as org.eclipse.app4mc.amalthea.model.Deviation
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createDeviation transform(Deviation instruction){
		it.distribution = instruction.distribution?.transform as Distribution
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createWeibullEstimators transform(WeibullEstimators distribution){
		it.PRemainPromille = distribution.PRemainPromille
	}


	// Labels
	def private dispatch create AmaltheaFactory.eINSTANCE.createLabel transform(org.eclipse.papyrus.amalthea.profile.amalthea.software.Label label){
		it.name = label.base_Class.name
	}
	
	// Tasks
	def private dispatch create AmaltheaFactory.eINSTANCE.createTask transform(org.eclipse.papyrus.amalthea.profile.amalthea.software.Task task){
		it.name = task.base_Class.name
		val callGraph = 
	}

}
