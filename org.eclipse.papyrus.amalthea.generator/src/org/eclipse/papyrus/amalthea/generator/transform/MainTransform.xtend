package org.eclipse.papyrus.amalthea.generator.transform

import java.util.Collections
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.CallGraph
import org.eclipse.app4mc.amalthea.model.CallSequenceItem
import org.eclipse.app4mc.amalthea.model.Component
import org.eclipse.app4mc.amalthea.model.CoreAllocation
import org.eclipse.app4mc.amalthea.model.CoreType
import org.eclipse.app4mc.amalthea.model.Counter
import org.eclipse.app4mc.amalthea.model.Distribution
import org.eclipse.app4mc.amalthea.model.GraphEntryBase
import org.eclipse.app4mc.amalthea.model.HwSystem
import org.eclipse.app4mc.amalthea.model.ISR
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum
import org.eclipse.app4mc.amalthea.model.MicrocontrollerType
import org.eclipse.app4mc.amalthea.model.NetworkType
import org.eclipse.app4mc.amalthea.model.OperatingSystem
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.RunnableItem
import org.eclipse.app4mc.amalthea.model.Stimulus
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TaskAllocation
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation
import org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation
import org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence
import org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess
import org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions
import org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package

import static extension org.eclipse.papyrus.amalthea.generator.transform.TransformUtil.*
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Time
import org.eclipse.app4mc.amalthea.model.TimeUnit
import org.eclipse.uml2.uml.EnumerationLiteral
import org.eclipse.app4mc.amalthea.model.ECU
import org.eclipse.app4mc.amalthea.model.Quartz
import org.eclipse.app4mc.amalthea.model.Prescaler
import org.eclipse.app4mc.amalthea.model.Network
import org.eclipse.app4mc.amalthea.model.Microcontroller
import org.eclipse.app4mc.amalthea.model.Core
import org.eclipse.app4mc.amalthea.model.Frequency
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.SchedType
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType
import org.eclipse.app4mc.amalthea.model.ECUType

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
	
	// common elements	
	def private dispatch create AmaltheaFactory.eINSTANCE.createCounter transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter counter, Object owner){
		it.offset = counter.counterOffset
		it.prescaler = counter.counterPrescaler
	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createTime transformHelper(Time time, Object owner){
		it.value = time.value
		it.unit = TimeUnit.get(time.unit.literal)
	}
	
	/************* Software ***************/
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
		val callGraph = task.callgraph?.transform as CallGraph
		it.callGraph = callGraph
	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createCallGraph transform(org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph callGraph){
		val graphEntries = callGraph.graphentries.map[e | e.transform].filter(typeof(GraphEntryBase))
		it.graphEntries.addAll(graphEntries)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createCallSequence transform(CallSequence callSequence){
		val base = callSequence.base_Class
		it.name = base.name
		val items = base.ownedOperations.amaltheaList.map[e | e.transform].filter(typeof(CallSequenceItem))
		it.calls.addAll(items)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createTaskRunnableCall transform(TaskRunnableCall call){
		it.runnable = call.runnable.transform as Runnable
		it.counter = call.counter?.transformHelper(call) as Counter
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createInterProcessActivation transform(InterProcessActivation call){
		it.counter = call.counter?.transformHelper(call) as Counter
	}

	/************* Hardware ***************/
	def private dispatch create AmaltheaFactory.eINSTANCE.createHwSystem transform(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HwSystem system){
		it.name = system.base_Class.name
		val ecus = system.ecus.map[e | e.transform].filter(typeof(ECU))
		val quartz = system.quartzes.map[e | e.transform].filter(typeof(Quartz))
		val prescaler = system.prescaler?.transform as Prescaler
		val networks = system.networks.map[e | e.transform].filter(typeof(Network))

		it.ecus.addAll(ecus)
		it.quartzes.addAll(quartz)
		it.prescaler = prescaler
		it.networks.addAll(networks)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createECU transform(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU ecu){
		it.name = ecu.base_Class.name
		val processors = ecu.microcontrollers.map[e | e.transform].filter(typeof(Microcontroller))
		val quartz = ecu.quartzes.map[e | e.transform].filter(typeof(Quartz))
		val prescaler = ecu.prescaler?.transform as Prescaler
		val networks = ecu.networks.map[e | e.transform].filter(typeof(Network))

		it.microcontrollers.addAll(processors)
		it.quartzes.addAll(quartz)
		it.prescaler = prescaler
		it.networks.addAll(networks)		
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createMicrocontroller transform(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller processor){
		it.name = processor.base_Class.name
		val cores = processor.cores.map[e | e.transform].filter(typeof(Core))
		val quartz = processor.quartzes.map[e | e.transform].filter(typeof(Quartz))
		val prescaler = processor.prescaler?.transform as Prescaler
		val networks = processor.networks.map[e | e.transform].filter(typeof(Network))

		it.cores.addAll(cores)
		it.quartzes.addAll(quartz)
		it.prescaler = prescaler
		it.networks.addAll(networks)		
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createCore transform(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core core){
		it.name = core.base_Class.name
		it.coreType = core.coretype?.transformHelper(core) as CoreType
		val quartz = core.quartzes.map[e | e.transform].filter(typeof(Quartz))
		val prescaler = core.prescaler?.transform as Prescaler
		val networks = core.networks.map[e | e.transform].filter(typeof(Network))

		it.quartzes.addAll(quartz)
		it.prescaler = prescaler
		it.networks.addAll(networks)		
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createNetwork transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network network, Object owner){
		it.name = network.base_Class.name
		it.type = network.networktype?.transform as NetworkType
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createNetworkType transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.NetworkType type, Object owner){
		it.name = type.base_DataType.name
		it.bitWidth = type.bitWidth
		it.schedPolicy = SchedType.get(type.schedPolicy.literal)
	}	
		
	def private dispatch create AmaltheaFactory.eINSTANCE.createQuartz transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz quartz, Object owner){
		it.name = quartz.base_Class.name
		it.frequency = quartz.frequency?.transformHelper(quartz) as Frequency
	}
			
	def private dispatch create AmaltheaFactory.eINSTANCE.createFrequency transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency frequency, Object owner){
		it.value = frequency.value
		it.unit = FrequencyUnit.get(frequency.unit.literal)
	}
		
	def private dispatch create AmaltheaFactory.eINSTANCE.createPrescaler transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler prescaler, Object owner){
		it.name = prescaler.base_Class.name
		it.clockRatio = prescaler.clockRatio
	}		
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createCoreType transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType type, Object owner){
		it.name = type.base_DataType.name
		it.bitWidth = type.bitWidth
		it.instructionsPerCycle = type.instructionsPerCycle
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createSystemType transformHelper(SystemType type, Object owner){
		it.name = type.base_DataType.name
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createECUType transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType type, Object owner){
		it.name = type.base_DataType.name
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createMicrocontrollerType transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType type, Object owner){
		it.name = type.base_DataType.name
	}	
	
	/************* OS ***************/
	
}
