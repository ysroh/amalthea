package org.eclipse.papyrus.amalthea.generator.transform;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.common.CommonPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.components.ComponentsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.hardware.HardwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.os.OsPackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.software.SoftwarePackage;
import org.eclipse.papyrus.amalthea.profile.amalthea.stimuli.StimuliPackage;
import org.eclipse.uml2.uml.Element;

public class TransformUtil {

	/**
	 * Map object in the list to Amalthea stereotype application if exist.
	 * 
	 * @param list
	 * @return
	 */
	public static List<EObject> getAmaltheaList(EList<? extends EObject> list) {
		List<EObject> result = new ArrayList<>();
		for (EObject source : list) {
			EObject mapped = source;
			if (source instanceof Element) {
				Element element = (Element) source;
				for (EObject s : element.getStereotypeApplications()) {
					EPackage ePkg = s.eClass().getEPackage();
					if (ePkg == CommonPackage.eINSTANCE || ePkg == SoftwarePackage.eINSTANCE
							|| ePkg == HardwarePackage.eINSTANCE || ePkg == OsPackage.eINSTANCE
							|| ePkg == StimuliPackage.eINSTANCE || ePkg == ComponentsPackage.eINSTANCE) {
						mapped = s;
						break;
					}
				}
			}
			result.add(mapped);
		}
		return result;
	}
}
