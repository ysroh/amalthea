package org.eclipse.papyrus.amalthea.generator;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.papyrus.amalthea.generator.transform.MainTransform;
import org.eclipse.uml2.uml.Model;

public class UmlToAmaltheaGenerator {
	
	public IStatus generate(Model model){
		
		MainTransform generator = new MainTransform();
		generator.generate(model);
		
		return Status.OK_STATUS;
	}

}
