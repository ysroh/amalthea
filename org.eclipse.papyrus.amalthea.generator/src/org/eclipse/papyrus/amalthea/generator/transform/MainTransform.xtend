package org.eclipse.papyrus.amalthea.generator.transform

import java.util.Collections
import org.eclipse.app4mc.amalthea.model.AbstractProcess
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.CallGraph
import org.eclipse.app4mc.amalthea.model.CallSequenceItem
import org.eclipse.app4mc.amalthea.model.Component
import org.eclipse.app4mc.amalthea.model.ComponentInstance
import org.eclipse.app4mc.amalthea.model.Connector
import org.eclipse.app4mc.amalthea.model.Core
import org.eclipse.app4mc.amalthea.model.CoreAllocation
import org.eclipse.app4mc.amalthea.model.CoreType
import org.eclipse.app4mc.amalthea.model.Counter
import org.eclipse.app4mc.amalthea.model.Distribution
import org.eclipse.app4mc.amalthea.model.ECU
import org.eclipse.app4mc.amalthea.model.Frequency
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.GraphEntryBase
import org.eclipse.app4mc.amalthea.model.HwSystem
import org.eclipse.app4mc.amalthea.model.ISR
import org.eclipse.app4mc.amalthea.model.InterfaceKind
import org.eclipse.app4mc.amalthea.model.InterruptController
import org.eclipse.app4mc.amalthea.model.InterruptSchedulingAlgorithm
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum
import org.eclipse.app4mc.amalthea.model.LimitType
import org.eclipse.app4mc.amalthea.model.Microcontroller
import org.eclipse.app4mc.amalthea.model.MicrocontrollerType
import org.eclipse.app4mc.amalthea.model.Network
import org.eclipse.app4mc.amalthea.model.NetworkType
import org.eclipse.app4mc.amalthea.model.OperatingSystem
import org.eclipse.app4mc.amalthea.model.Port
import org.eclipse.app4mc.amalthea.model.Preemption
import org.eclipse.app4mc.amalthea.model.Prescaler
import org.eclipse.app4mc.amalthea.model.ProcessRequirement
import org.eclipse.app4mc.amalthea.model.Quartz
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.RunnableItem
import org.eclipse.app4mc.amalthea.model.SchedType
import org.eclipse.app4mc.amalthea.model.SchedulingUnit
import org.eclipse.app4mc.amalthea.model.Severity
import org.eclipse.app4mc.amalthea.model.SignedTime
import org.eclipse.app4mc.amalthea.model.Stimulus
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TaskAllocation
import org.eclipse.app4mc.amalthea.model.TaskScheduler
import org.eclipse.app4mc.amalthea.model.TaskSchedulingAlgorithm
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.TimeMetric
import org.eclipse.app4mc.amalthea.model.TimeUnit
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.papyrus.amalthea.profile.amalthea.common.Deviation
import org.eclipse.papyrus.amalthea.profile.amalthea.common.InstructionsDeviation
import org.eclipse.papyrus.amalthea.profile.amalthea.common.WeibullEstimators
import org.eclipse.papyrus.amalthea.profile.amalthea.components.Composite
import org.eclipse.papyrus.amalthea.profile.amalthea.components.FInterfacePort
import org.eclipse.papyrus.amalthea.profile.amalthea.constraints.TimeRequirementLimit
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Bus
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECUType
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.SystemType
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OSEK
import org.eclipse.papyrus.amalthea.profile.amalthea.os.PriorityBased
import org.eclipse.papyrus.amalthea.profile.amalthea.os.SchedulingHWUnit
import org.eclipse.papyrus.amalthea.profile.amalthea.software.CallSequence
import org.eclipse.papyrus.amalthea.profile.amalthea.software.InterProcessActivation
import org.eclipse.papyrus.amalthea.profile.amalthea.software.LabelAccess
import org.eclipse.papyrus.amalthea.profile.amalthea.software.Process
import org.eclipse.papyrus.amalthea.profile.amalthea.software.RunnableInstructions
import org.eclipse.papyrus.amalthea.profile.amalthea.software.TaskRunnableCall
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Interprocess
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Periodic
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.Single
import org.eclipse.uml2.uml.Abstraction
import org.eclipse.uml2.uml.ConnectorEnd
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.PackageImport
import org.eclipse.uml2.uml.Property

import static extension org.eclipse.papyrus.amalthea.generator.transform.TransformUtil.*
import org.eclipse.papyrus.amalthea.profile.amalthea.common.CustomProperty
import org.eclipse.emf.common.util.EMap
import org.eclipse.app4mc.amalthea.model.Value
import org.eclipse.emf.ecore.EDataType
import org.eclipse.uml2.uml.LiteralString
import org.eclipse.uml2.uml.LiteralInteger
import org.eclipse.papyrus.amalthea.profile.amalthea.common.PortCustomProperty

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
		it.constraintsModel = model.constraintsModel
    }
    
    
	def private dispatch transform(Object o) {
		
	}
    
	def private void transformPackage(Package pkg) {
		val list = pkg.packagedElements.amaltheaList
		val transformed = list.map(p|p.transform).filter(e | e != null)
		for(pi : pkg.packageImports){
			pi.transform
		}

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
	
	def private dispatch transform(PackageImport pkg) {
		pkg.importedPackage?.transformPackage
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
	
	def private create AmaltheaFactory.eINSTANCE.createConstraintsModel getConstraintsModel(Model model){
	}		
	
	// common elements	
	def private dispatch create AmaltheaFactory.eINSTANCE.createCounter transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.common.Counter counter, Object owner){
		it.offset = counter.offset
		it.prescaler = counter.prescaler
	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createTime transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.common.Time time, Object owner){
		it.value = time.value
		it.unit = TimeUnit.get(time.unit.literal)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createSignedTime transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.common.SignedTime time, Object owner){
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
		val mappedElements = base.ownedElements.amaltheaList.map[o | o.transform]
		it.runnableItems.addAll(mappedElements.filter(typeof(RunnableItem)))
	}
			
	def private dispatch create AmaltheaFactory.eINSTANCE.createLabelAccess transform(LabelAccess label){
		it.access = LabelAccessEnum.READ
		it.data = label.data?.transform as Label
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createRunnableInstructions transform(RunnableInstructions instruction){
		val dist = instruction.^default?.transformHelper(new Object) as org.eclipse.app4mc.amalthea.model.InstructionsDeviation
		it.^default = dist
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createInstructionsDeviation transformHelper(InstructionsDeviation instructionsDeviation, Object owner){
		it.deviation = instructionsDeviation.deviation?.transformHelper(new Object) as org.eclipse.app4mc.amalthea.model.Deviation
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createDeviation transformHelper(Deviation instruction, Object owner){
		it.distribution = instruction.distribution?.transformHelper(new Object) as Distribution
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createWeibullEstimators transformHelper(WeibullEstimators distribution, Object owner){
		it.PRemainPromille = distribution.PRemainPromille
	}

	// Labels
	def private dispatch create AmaltheaFactory.eINSTANCE.createLabel transform(org.eclipse.papyrus.amalthea.profile.amalthea.software.Label label){
		it.name = label.base_Class.name
	}
	
	// Tasks
	def private dispatch create AmaltheaFactory.eINSTANCE.createTask transform(org.eclipse.papyrus.amalthea.profile.amalthea.software.Task task){
		it.name = task.base_Class.name
		it.multipleTaskActivationLimit = task.multipleTaskActivationLimit
		it.preemption = Preemption.get(task.preemption.literal)
		task.transformProcessHelper(it)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createISR transform(org.eclipse.papyrus.amalthea.profile.amalthea.software.ISR isr){
		it.name = isr.base_Class.name
		isr.transformProcessHelper(it)
	}	
	
	def private transformProcessHelper(Process source, org.eclipse.app4mc.amalthea.model.Process target){
		target.priority = source.priority
		val callGraph = source.callgraph?.transformHelper(new Object) as CallGraph
		target.callGraph = callGraph
		root.constraintsModel.requirements.addAll(source.base_Class.ownedRules.amaltheaFilteredList.map[e | e.transform].filter(typeof(ProcessRequirement)))
	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createCallGraph transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.software.CallGraph callGraph, Object owner){
		val graphEntries = callGraph.graphentries.map[e | e.transformHelper(new Object)].filter(typeof(GraphEntryBase))
		it.graphEntries.addAll(graphEntries)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createCallSequence transformHelper(CallSequence callSequence, Object owner){
		val base = callSequence.base_Class
		it.name = base.name
		val items = base.ownedOperations.amaltheaFilteredList.map[e | e.transform].filter(typeof(CallSequenceItem))
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
		val quartz = system.quartzes.map[e | e.transformHelper(system)].filter(typeof(Quartz))
		val prescaler = system.prescaler?.transformHelper(system) as Prescaler
		val networks = system.networks.map[e | e.transformHelper(system)].filter(typeof(Network))

		it.ecus.addAll(ecus)
		it.quartzes.addAll(quartz)
		it.prescaler = prescaler
		it.networks.addAll(networks)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createECU transform(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.ECU ecu){
		it.name = ecu.base_Class.name
		val processors = ecu.microcontrollers.map[e | e.transform].filter(typeof(Microcontroller))
		val quartz = ecu.quartzes.map[e | e.transformHelper(new Object)].filter(typeof(Quartz))
		val prescaler = ecu.prescaler?.transformHelper(new Object) as Prescaler
		val networks = ecu.networks.map[e | e.transformHelper(new Object)].filter(typeof(Network))

		it.microcontrollers.addAll(processors)
		it.quartzes.addAll(quartz)
		it.prescaler = prescaler
		it.networks.addAll(networks)		
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createMicrocontroller transform(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Microcontroller processor){
		it.name = processor.base_Class.name
		val cores = processor.cores.map[e | e.transform].filter(typeof(Core))
		val quartz = processor.quartzes.map[e | e.transformHelper(new Object)].filter(typeof(Quartz))
		val prescaler = processor.prescaler?.transformHelper(new Object) as Prescaler
		val networks = processor.networks.map[e | e.transformHelper(new Object)].filter(typeof(Network))

		it.cores.addAll(cores)
		it.quartzes.addAll(quartz)
		it.prescaler = prescaler
		it.networks.addAll(networks)		
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createCore transform(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Core core){
		it.name = core.base_Class.name
		it.coreType = core.coretype?.transform as CoreType
		val quartz = core.quartzes.map[e | e.transformHelper(new Object)].filter(typeof(Quartz))
		val prescaler = core.prescaler?.transformHelper(new Object) as Prescaler
		val networks = core.networks.map[e | e.transformHelper(new Object)].filter(typeof(Network))

		it.quartzes.addAll(quartz)
		it.prescaler = prescaler
		it.networks.addAll(networks)		
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createNetwork transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Network network, Object owner){
		it.name = network.base_Class.name
		it.type = network.networktype?.transform as NetworkType
		it.prescaler = network.prescaler?.transformHelper(new Object) as Prescaler
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createSystemType transform(SystemType type){
		it.name = type.base_DataType.name
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createECUType transform(ECUType type){
		it.name = type.base_DataType.name
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createMicrocontrollerType transform(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.MicrocontrollerType type){
		it.name = type.base_DataType.name
	}	
		
	def private dispatch create AmaltheaFactory.eINSTANCE.createBus transform(Bus type){
		it.name = type.base_DataType.name
		it.bitWidth = type.bitWidth
		it.schedPolicy = SchedType.get(type.schedPolicy.literal)
	}	
		
	def private dispatch create AmaltheaFactory.eINSTANCE.createQuartz transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Quartz quartz, Object owner){
		it.name = quartz.base_Class.name
		it.frequency = quartz.frequency?.transformHelper(new Object) as Frequency
	}
			
	def private dispatch create AmaltheaFactory.eINSTANCE.createFrequency transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Frequency frequency, Object owner){
		it.value = frequency.value
		it.unit = FrequencyUnit.get(frequency.unit.literal)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createPrescaler transformHelper(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.Prescaler prescaler, Object owner){
		it.name = prescaler.base_Class.name
		it.clockRatio = prescaler.clockRatio
	}		
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createCoreType transform(org.eclipse.papyrus.amalthea.profile.amalthea.hardware.CoreType type){
		it.name = type.base_DataType.name
		it.bitWidth = type.bitWidth
		it.instructionsPerCycle = type.instructionsPerCycle
	}
	
	/************* OS ***************/
	def private dispatch create AmaltheaFactory.eINSTANCE.createOperatingSystem transform(org.eclipse.papyrus.amalthea.profile.amalthea.os.OperatingSystem os){
		it.name = os.base_Class.name
		val schedulers = os.taskscheduler.map[e | e.transform].filter(typeof(TaskScheduler))
		val controllers = os.interruptcontroller.map[e | e.transform].filter(typeof(InterruptController))
		it.taskSchedulers.addAll(schedulers)
		it.interruptControllers.addAll(controllers)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createTaskScheduler transform(org.eclipse.papyrus.amalthea.profile.amalthea.os.TaskScheduler scheduler){
		it.name = scheduler.base_Class.name
		it.scheduleUnitPriority = scheduler.scheduleUnitPriority
		it.schedulingUnit = scheduler.schedulingunit?.transformHelper(new Object) as SchedulingUnit
		it.schedulingAlgorithm = scheduler.schedulingalgorithm?.transformHelper(new Object) as TaskSchedulingAlgorithm
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createInterruptController transform(org.eclipse.papyrus.amalthea.profile.amalthea.os.InterruptController ic){
		it.name = ic.base_Class.name
		it.scheduleUnitPriority = ic.scheduleUnitPriority
		it.schedulingUnit = ic.schedulingunit?.transformHelper(new Object) as SchedulingUnit
		it.schedulingAlgorithm = ic.schedulingalgorithm?.transformHelper(new Object) as InterruptSchedulingAlgorithm
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createSchedulingHWUnit transformHelper(SchedulingHWUnit schedUnit, Object owner){
		it.delay = schedUnit.delay?.transformHelper(new Object) as Time
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createOSEK transformHelper(OSEK osek, Object owner){
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createPriorityBased transformHelper(PriorityBased osek, Object owner){
	}	
	
	/************* Stimuli ***************/
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createPeriodic transform(Periodic stimulus){
		it.name = stimulus.base_Class.name
		it.offset = stimulus.offset?.transformHelper(new Object) as Time
		it.recurrence = stimulus.recurrence?.transformHelper(new Object) as Time
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createSingle transform(Single stimulus){
		it.name = stimulus.base_Class.name
		it.activation = stimulus.activation?.transformHelper(new Object) as Time
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createInterProcess transform(Interprocess stimulus){
		it.name = stimulus.base_Class.name
		it.counter = stimulus.counter?.transformHelper(new Object) as Counter
	}
	
	/************* Constraints ***************/
	def private dispatch create AmaltheaFactory.eINSTANCE.createProcessRequirement transform(org.eclipse.papyrus.amalthea.profile.amalthea.constraints.ProcessRequirement pr){
		it.name = pr.base_Constraint.name
		it.severity = Severity.get(pr.severity.literal)
		it.process = pr.process?.transform as AbstractProcess
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createTimeRequirementLimit transform(TimeRequirementLimit limit){
		it.limitType = LimitType.get(limit.limitType.literal)
		it.metric = TimeMetric.get(limit.metric.literal)
		it.limitValue = limit.limitValue?.transformHelper(new Object) as SignedTime
	}	
	
	/************* Mapping ***************/
	def private dispatch transform(Abstraction ab){
		ab.transformAllocation
	}
	
	def private void transformAllocation(Abstraction ab){
		val sourceList = ab.clients.amaltheaFilteredList
		val targetList = ab.suppliers.amaltheaFilteredList
		if(!sourceList.isEmpty && !targetList.isEmpty){
			val source = sourceList.get(0).transform
			val target = targetList.get(0).transform
			transformAllocation(source, target)
		}
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createTaskAllocation transformAllocation(Task task, TaskScheduler scheduler){
		it.task = task
		it.scheduler = scheduler
		root.mappingModel.taskAllocation.add(it)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createISRAllocation transformAllocation(ISR isr, InterruptController controller){
		it.isr = isr
		it.controller = controller
		root.mappingModel.isrAllocation.add(it)
	}	
	
	def private dispatch create scheduler.createCoreAllocation transformAllocation(TaskScheduler scheduler, Core core){
		it.scheduler = scheduler
		it.core.add(core)
	}
	
	def private create AmaltheaFactory.eINSTANCE.createCoreAllocation createCoreAllocation(TaskScheduler scheduler){
		it.scheduler = scheduler
		root.mappingModel.coreAllocation.add(it)
	}		
	
	def private dispatch transformAllocation(Object task, Object scheduler){
		
	}	
	
	/************* Components ***************/
	def private dispatch create AmaltheaFactory.eINSTANCE.createComponent transform(org.eclipse.papyrus.amalthea.profile.amalthea.components.Component component){
		it.name = component.base_Class.name
		component.transformComponentHelper(it)
		val customProperties = component.base_Class.ownedAttributes.amaltheaFilteredList.filter(typeof(CustomProperty))
		for(custom : customProperties){
			custom.transformCustomProperty(it.customProperties)
		}
	}
	
	def private dispatch transformCustomProperty(CustomProperty custom, EMap<String, Value> map){
		val value = custom.base_Property.defaultValue?.transformValue as Value
		map.put(custom.key, value)
	}
	
	def private dispatch transformCustomProperty(PortCustomProperty custom, EMap<String, Value> map){
		val port = custom.port.transform as org.eclipse.app4mc.amalthea.model.FInterfacePort
		val value = custom.base_Property.defaultValue?.transformValue as Value
		port.customProperties.put(custom.key, value)
	}	
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createStringObject transformValue(LiteralString value){
		it.value = value.value
	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createIntegerObject transformValue(LiteralInteger value){
		it.value = value.value
	}
	
	def private dispatch transformValue(Object value){
		
	}
		
	def private transformComponentHelper(org.eclipse.papyrus.amalthea.profile.amalthea.components.Component source, Component target){
		target.runnables.addAll(source.runnables.map[c | c.transform].filter(typeof(Runnable)))
		val portList = source.base_Class.ownedPorts.amaltheaFilteredList
		target.ports.addAll(portList.map[p | p.transform].filter(typeof(Port)))
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createFInterfacePort transform(FInterfacePort port){
		it.name = port.base_Port.name
		it.interfaceName = port.interfaceName
		var kind = "provides" 
		if(port.base_Port.isConjugated){
			kind = "requires"
		}
		it.kind = InterfaceKind.get(kind)
	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createComposite transform(Composite composite){
		val base = composite.base_Class
		it.name = base.name
		composite.transformComponentHelper(it)
		it.componentInstances.addAll( base.ownedAttributes.map[e | e.transform].filter(typeof(ComponentInstance)))
		val mappedConnectors = base.ownedConnectors.map[c | c.transform].filter(typeof(Connector))
		it.connectors.addAll(mappedConnectors)
		
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createComponentInstance transform(Property instance){
		it.name = instance.name
		it.type = instance.type?.amaltheaStereotypeApplication?.transform as Component
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createConnector transform(org.eclipse.uml2.uml.Connector connector){
		it.name = connector.name
		it.sourcePort = connector.ends.get(0).transformQaulifiedPort
		it.targetPort = connector.ends.get(1).transformQaulifiedPort		
	}
	
	def private create AmaltheaFactory.eINSTANCE.createQualifiedPort transformQaulifiedPort(ConnectorEnd end){
		it.port = end.role.amaltheaStereotypeApplication?.transform as Port
		it.instance = end.partWithPort?.transform as ComponentInstance
	}
	
}
