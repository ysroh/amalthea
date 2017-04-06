package org.eclipse.papyrus.amalthea.generator.transform

import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.util.Collections
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.RunnableItem
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Property
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.ISR
import org.eclipse.app4mc.amalthea.model.CoreType
import org.eclipse.app4mc.amalthea.model.MicrocontrollerType
import org.eclipse.app4mc.amalthea.model.NetworkType
import org.eclipse.app4mc.amalthea.model.HwSystem
import org.eclipse.app4mc.amalthea.model.OperatingSystem
import org.eclipse.app4mc.amalthea.model.Component

class MainTransform {

	val ResourceSet rset = new ResourceSetImpl
	
	var Model root = null

	// main transform
	def void generate(Model model) {
		root = model
		val transformed = model.transform
		val uri = model.eResource.URI.trimFileExtension.appendFileExtension("amxmi")
		val resource = rset.createResource(uri)
		resource.contents.add(transformed)
		resource.save(Collections.EMPTY_MAP)
	}

	def private dispatch transform(Object o) {
		
	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createAmalthea transform(Model model) {
		val transformed = model.packagedElements.map(p|p.transform)

		// SWModel elements
		val swModel = model.softwareModel
		swModel.runnables.addAll(transformed.filter(typeof(Runnable)))
		swModel.labels.addAll(transformed.filter(typeof(Label)))
		swModel.tasks.addAll(transformed.filter(typeof(Task)))
		swModel.isrs.addAll(transformed.filter(typeof(ISR)))
		
		// HWModel elements
		val hwModel = model.hardwareModel
		hwModel.coreTypes.addAll(transformed.filter(typeof(CoreType)))
		hwModel.mcTypes.addAll(transformed.filter(typeof(MicrocontrollerType)))
		hwModel.networkTypes.addAll(transformed.filter(typeof(NetworkType)))
		val system = transformed.filter(typeof(HwSystem))
		if(!system.empty){
			hwModel.system = system.get(0)
		}
		
		// OSModel
		val osModel = model.OSModel
		osModel.operatingSystems.addAll(transformed.filter(typeof(OperatingSystem)))
		
		// Component
		val component = model.componentsModel
		component.components.addAll(transformed.filter(typeof(Component)))
		component.
		
	}
	
	def private create AmaltheaFactory.eINSTANCE.createSWModel getSoftwareModel(Model model){
		// Software model
	}
	
	def private create AmaltheaFactory.eINSTANCE.createCommonElements getCommonModel(Model model){
		// Software model
	}
	
	def private create AmaltheaFactory.eINSTANCE.createHWModel getHardwareModel(Model model){
		// Software model
	}
	
	def private create AmaltheaFactory.eINSTANCE.createOSModel getOSModel(Model model){
		// Software model
	}

	def private create AmaltheaFactory.eINSTANCE.createComponentsModel getComponentsModel(Model model){
		// Software model
	}	

	def private dispatch create AmaltheaFactory.eINSTANCE.createSWModel transform(Package pkg) {
		val transformed = pkg.packagedElements.map(p|p.transform)
		it.runnables.addAll(transformed.filter(typeof(Runnable)))
		it.labels.addAll(transformed.filter(typeof(Label)))

	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createRunnable transform(Class capsule) {
		it.name = capsule.name
		val transformed = capsule.ownedAttributes.map(p | p.transform).filter(typeof(RunnableItem))
		it.runnableItems.addAll(transformed)
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createLabelAccess transform(Property label){
		it.access = LabelAccessEnum.READ
		it.data = label.type.transform as Label
	}
	
	def private dispatch create AmaltheaFactory.eINSTANCE.createLabel transform(DataType label){
		it.name = label.name
	}
	
	def private dispatch String getReferableName(Object eo){
	}
	
	def private dispatch String getReferableName(NamedElement eo){
		val result = eo.name
		if(result === null || result == ""){
			return "no-name"
		}
		val transformed = eo.transform
		URLEncoder.encode(result, StandardCharsets.UTF_8.toString) + "?type=" + transformed.eClass.name
	}
}
