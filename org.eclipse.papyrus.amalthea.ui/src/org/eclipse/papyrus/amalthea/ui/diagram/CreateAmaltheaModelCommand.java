package org.eclipse.papyrus.amalthea.ui.diagram;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.papyrus.uml.diagram.common.commands.ModelCreationCommandBase;
import org.eclipse.papyrus.uml.tools.utils.PackageUtil;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLFactory;

public class CreateAmaltheaModelCommand extends ModelCreationCommandBase{

	public static final String PROFILE_PATH = "pathmap://AMALTHEA_PROFILE/amalthea.profile.uml";
	@Override
	protected EObject createRootElement() {
		return UMLFactory.eINSTANCE.createModel();
	}

	/**
	 * @see org.eclipse.papyrus.infra.core.extension.commands.ModelCreationCommandBase#initializeModel(org.eclipse.emf.ecore.EObject)
	 *
	 * @param owner
	 */

	@Override
	protected void initializeModel(EObject owner) {
		super.initializeModel(owner);
		((org.eclipse.uml2.uml.Package) owner).setName(getModelName());

		// Retrieve UMLRT profile and apply with Sub-profile
		Profile profile = (Profile) PackageUtil.loadPackage(URI.createURI(PROFILE_PATH), owner.eResource().getResourceSet());
		if (profile != null) {
			PackageUtil.applyProfile(((org.eclipse.uml2.uml.Package) owner), profile, true);
		}
	}

	/**
	 * Gets the model name.
	 *
	 * @return the model name
	 */
	protected String getModelName() {
		return "AMALTHEA";
	}
}
