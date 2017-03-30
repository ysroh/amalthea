package org.eclipse.papyrus.amalthea.translator

import static extension org.eclipse.papyrus.amalthea.util.ComponentModelUtils.*
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.Port
import org.eclipse.app4mc.amalthea.model.Composite

class ComponentModelTranslator {

	def create {
		if (element.isComposite) {
			AmaltheaFactory.eINSTANCE.createComposite
		}
		else if (element.isComponent) {
			AmaltheaFactory.eINSTANCE.createComponent
		}
	} 
	translate(org.eclipse.uml2.uml.Component element) {
		name = element.name
		ports.addAll(element.ownedPorts.map[translate])
		if (element.isComposite) {
			val composite = it as Composite
			composite.componentInstances.addAll(element.ownedAttributes.filter[isComponentInstance].map[translate])
			composite.connectors.addAll(element.ownedConnectors.map[translate])
			composite.groundedPorts.addAll(element.getComposite.groundedPorts.map[base_ConnectorEnd].map[translate])
		}
	}
	
	def create {
		if (element.isFInterfacePort) {
			AmaltheaFactory.eINSTANCE.createFInterfacePort
		}
	}
	translate(org.eclipse.uml2.uml.Port element) {
		name = element.name
	}

	def create {
		if (element.isComponentInstance) {
			AmaltheaFactory.eINSTANCE.createComponentInstance
		}
	}
	translate(org.eclipse.uml2.uml.Property element) {
		name = element.name
		type = translate(element.type as org.eclipse.uml2.uml.Component)
	}

	def create {
		AmaltheaFactory.eINSTANCE.createConnector
	}
	translate(org.eclipse.uml2.uml.Connector element) {
		var source = element.ends.get(0)
		var target = element.ends.get(1)
		if (element.isConnector) {
			source = element.getConnector.sourcePort.base_ConnectorEnd
			target = element.getConnector.targetPort.base_ConnectorEnd
		}
		sourcePort = translate(source)
		targetPort = translate(target)
	}
	
	def create {
		AmaltheaFactory.eINSTANCE.createQualifiedPort
	}
	translate(org.eclipse.uml2.uml.ConnectorEnd element) {
		instance = translate(element.partWithPort)
		port = translate(element.role as org.eclipse.uml2.uml.Port)
	}

}
