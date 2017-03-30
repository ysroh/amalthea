package org.eclipse.papyrus.amalthea.translator

import static extension org.eclipse.papyrus.amalthea.util.ComponentModelUtils.*
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.Port
import org.eclipse.app4mc.amalthea.model.Composite
import org.eclipse.app4mc.amalthea.model.ComponentInstance
import org.eclipse.app4mc.amalthea.model.QualifiedPort
import org.eclipse.app4mc.amalthea.model.Component
import org.eclipse.app4mc.amalthea.model.Connector

/**
 * @author epp
 */
class ComponentModelTranslator {

	dispatch def create {
		switch element {
			case element.isComposite:	AmaltheaFactory.eINSTANCE.createComposite
			case element.isComponent:	AmaltheaFactory.eINSTANCE.createComponent
		}
	} 
	translate(org.eclipse.uml2.uml.Component element) {
		name = element.name
		ports.addAll(element.ownedPorts.map[translate].map[it as Port])
		if (element.isComposite) {
			val composite = it as Composite
			composite.componentInstances.addAll(element.ownedAttributes.filter[isComponentInstance].map[translate].map[it as ComponentInstance])
			composite.connectors.addAll(element.ownedConnectors.map[translate].map[it as Connector])
			composite.groundedPorts.addAll(element.getComposite.groundedPorts.map[base_ConnectorEnd].map[translate].map[it as QualifiedPort])
		}
	}
	
	dispatch def create {
		if (element.isFInterfacePort) {
			AmaltheaFactory.eINSTANCE.createFInterfacePort
		}
	}
	translate(org.eclipse.uml2.uml.Port element) {
		name = element.name
	}

	dispatch def create {
		if (element.isComponentInstance) {
			AmaltheaFactory.eINSTANCE.createComponentInstance
		}
	}
	translate(org.eclipse.uml2.uml.Property element) {
		name = element.name
		type = translate(element.type as org.eclipse.uml2.uml.Component) as Component
	}

	dispatch def create {
		AmaltheaFactory.eINSTANCE.createConnector
	}
	translate(org.eclipse.uml2.uml.Connector element) {
		var source = element.ends.get(0)
		var target = element.ends.get(1)
		if (element.isConnector) {
			source = element.getConnector.sourcePort.base_ConnectorEnd
			target = element.getConnector.targetPort.base_ConnectorEnd
		}
		sourcePort = translate(source) as QualifiedPort
		targetPort = translate(target) as QualifiedPort
	}
	
	dispatch def create {
		AmaltheaFactory.eINSTANCE.createQualifiedPort
	}
	translate(org.eclipse.uml2.uml.ConnectorEnd element) {
		instance = translate(element.partWithPort) as ComponentInstance
		port = translate(element.role as org.eclipse.uml2.uml.Port) as Port
	}

}
