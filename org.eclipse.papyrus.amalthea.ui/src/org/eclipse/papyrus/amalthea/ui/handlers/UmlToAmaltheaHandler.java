package org.eclipse.papyrus.amalthea.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.amalthea.generator.UmlToAmaltheaGenerator;
import org.eclipse.papyrus.infra.emf.utils.EMFHelper;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.Model;

public class UmlToAmaltheaHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof IStructuredSelection) {

			IStructuredSelection selection = (IStructuredSelection) sel;
			Object obj = selection.getFirstElement();
			final EObject eobj = EMFHelper.getEObject(obj);
			if (eobj == null) {
				throw new IllegalArgumentException(obj.getClass().getCanonicalName() + " is not an EObject");
			}

			UmlToAmaltheaGenerator generator = new UmlToAmaltheaGenerator();
			final IStatus status = generator.generate((Model)eobj);
			Display.getDefault().syncExec(new Runnable() {
				@Override
				public void run() {
					ErrorDialog.openError(Display.getCurrent().getActiveShell(), "UML to AMALTHEA Generator", null,
							status);
				}
			});
		}
		return null;

	}

}
