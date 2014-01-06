package sle.fsml.runconfig;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.preference.StringButtonFieldEditor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredResourcesSelectionDialog;

/**
 * Mainly boilerplate copy of the FileFieldEditor
 * 
 * @author lukashaertel
 * 
 */
public class ResourceFieldEditor extends StringButtonFieldEditor {

	private String initialFilter = null;

	protected ResourceFieldEditor() {
	}

	public ResourceFieldEditor(String name, String labelText, Composite parent) {
		this(name, labelText, VALIDATE_ON_FOCUS_LOST, parent);
	}

	public ResourceFieldEditor(String name, String labelText,
			int validationStrategy, Composite parent) {
		init(name, labelText);
		setErrorMessage(JFaceResources
				.getString("FileFieldEditor.errorMessage"));//$NON-NLS-1$
		setChangeButtonText(JFaceResources.getString("openBrowse"));//$NON-NLS-1$
		setValidateStrategy(validationStrategy);
		createControl(parent);
	}

	protected String changePressed() {
		IFile d = getFile();

		if (d == null) {
			return null;
		}

		return d.getLocation().toOSString();
	}

	protected boolean checkState() {

		String msg = null;

		String path = getTextControl().getText();
		if (path != null) {
			path = path.trim();
		} else {
			path = "";//$NON-NLS-1$
		}
		if (path.length() == 0) {
			if (!isEmptyStringAllowed()) {
				msg = getErrorMessage();
			}
		}

		if (msg != null) { // error
			showErrorMessage(msg);
			return false;
		}

		if (doCheckState()) { // OK!
			clearErrorMessage();
			return true;
		}
		msg = getErrorMessage();

		if (msg != null) {
			showErrorMessage(msg);
		}
		return false;
	}

	private IFile getFile() {
		// This is where the field editor differs from the FileFieldEditor, we
		// select resources in the workspace rather than files on the filesystem
		FilteredResourcesSelectionDialog frsd = new FilteredResourcesSelectionDialog(
				getShell(), false, ResourcesPlugin.getWorkspace().getRoot(),
				IResource.FILE);

		frsd.setInitialPattern(initialFilter);

		if (frsd.open() == Window.OK) {
			final Object result = frsd.getFirstResult();

			if (result instanceof IFile) {
				return (IFile) result;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public void setInitialFilter(String initialFilter) {
		this.initialFilter = initialFilter;
	}
}
