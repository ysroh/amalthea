package org.eclipse.papyrus.amalthea.generator.transform

import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.util.Collections
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.uml2.uml.Class
import org.eclipse.uml2.uml.DataType
import org.eclipse.uml2.uml.Model
import org.eclipse.uml2.uml.NamedElement
import org.eclipse.uml2.uml.Package
import org.eclipse.uml2.uml.Property
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.SWModel
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.RunnableItem
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum

class MainTransform {

	val ResourceSet rset = new ResourceSetImpl

	// main transform
	def void generate(Model model) {
		val transformed = model.transform
		val uri = model.eResource.URI.trimFileExtension.appendFileExtension("amxmi")
		val resource = rset.createResource(uri)
		resource.contents.add(transformed)
		resource.save(Collections.EMPTY_MAP)
	}

	def private dispatch transform(Object o) {
		
	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createAmalthea transform(Model model) {
		val transformed = model.packagedElements.map(p|p.transform).filter(typeof(SWModel))
		it.swModel = transformed.get(0)
	}

	def private dispatch create AmaltheaFactory.eINSTANCE.createSWModel transform(Package pkg) {
		val transformed = pkg.packagedElements.map(p|p.transform)
		it.runnables.addAll(transformed.filter(typeof(org.eclipse.app4mc.amalthea.model.Runnable)))
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
