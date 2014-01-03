package sle.fsml.runconfig;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class FSMLMainTab extends AbstractLaunchConfigurationTab {
	/**
	 * End-point for changed fields
	 */
	private final IPropertyChangeListener editorChanged = new IPropertyChangeListener() {

		@Override
		public void propertyChange(PropertyChangeEvent event) {
			setDirty(true);

			scheduleUpdateJob();
		}
	};

	/**
	 * File field editor for the machine location
	 */
	private FileFieldEditor machineLocation;

	/**
	 * File field editor for the input location
	 */
	private FileFieldEditor inputLocation;

	/**
	 * File field editor for the output location
	 */
	private FileFieldEditor outputLocation;

	@Override
	public void createControl(Composite parent) {
		final Composite panel = new Composite(parent, SWT.NONE);

		// Find root file for dialogs
		final File rootFile = ResourcesPlugin.getWorkspace().getRoot()
				.getFullPath().toFile();

		// Create editor for machine location
		machineLocation = new FileFieldEditor(
				FSMLLaunchConstants.MACHINE_FILE_ATTR, "Machine", panel);
		machineLocation.setPropertyChangeListener(editorChanged);
		machineLocation.setFilterPath(rootFile);
		machineLocation.setFileExtensions(new String[] { "fsml" });
		machineLocation
				.setValidateStrategy(StringFieldEditor.VALIDATE_ON_KEY_STROKE);

		// Create editor for input location
		inputLocation = new FileFieldEditor(
				FSMLLaunchConstants.INPUT_FILE_ATTR, "Input", panel);
		inputLocation.setPropertyChangeListener(editorChanged);
		inputLocation.setFilterPath(rootFile);
		inputLocation.setFileExtensions(new String[] { "input" });
		inputLocation
				.setValidateStrategy(StringFieldEditor.VALIDATE_ON_KEY_STROKE);

		// Create editor for output location
		outputLocation = new FileFieldEditor(
				FSMLLaunchConstants.OUTPUT_FILE_ATTR, "Output", panel);
		outputLocation.setPropertyChangeListener(editorChanged);
		outputLocation.setFilterPath(rootFile);
		outputLocation.setFileExtensions(new String[] { "output" });
		outputLocation
				.setValidateStrategy(StringFieldEditor.VALIDATE_ON_KEY_STROKE);

		// Assign main control
		setControl(panel);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// Remove all attributes for defaults
		configuration.removeAttribute(FSMLLaunchConstants.MACHINE_FILE_ATTR);
		configuration.removeAttribute(FSMLLaunchConstants.INPUT_FILE_ATTR);
		configuration.removeAttribute(FSMLLaunchConstants.OUTPUT_FILE_ATTR);
	}

	@Override
	public void initializeFrom(final ILaunchConfiguration configuration) {
		// Load machine location
		try {
			machineLocation.setStringValue(configuration.getAttribute(
					FSMLLaunchConstants.MACHINE_FILE_ATTR, ""));
		} catch (CoreException e) {
			machineLocation.setStringValue("");
		}

		// Load input location
		try {
			inputLocation.setStringValue(configuration.getAttribute(
					FSMLLaunchConstants.INPUT_FILE_ATTR, ""));
		} catch (CoreException e) {
			inputLocation.setStringValue("");
		}

		// Load output location
		try {
			outputLocation.setStringValue(configuration.getAttribute(
					FSMLLaunchConstants.OUTPUT_FILE_ATTR, ""));
		} catch (CoreException e) {
			outputLocation.setStringValue("");
		}

		// Initialize validation and update job
		scheduleUpdateJob();
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		// Validate machine file existence
		try {
			if (!new File(launchConfig.getAttribute(
					FSMLLaunchConstants.MACHINE_FILE_ATTR, "")).exists()) {
				setErrorMessage("Machine file does not exist");
				return false;
			}
		} catch (CoreException e) {
			setErrorMessage("Exception on validating machine file");
			return false;
		}

		// Validate input file existence
		try {
			if (!new File(launchConfig.getAttribute(
					FSMLLaunchConstants.INPUT_FILE_ATTR, "")).exists()) {
				setErrorMessage("Input file does not exist");
				return false;
			}
		} catch (CoreException e) {
			setErrorMessage("Exception on validating input file");
			return false;
		}

		setErrorMessage(null);
		return true;
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// Write all attributes
		configuration.setAttribute(FSMLLaunchConstants.MACHINE_FILE_ATTR,
				machineLocation.getStringValue());
		configuration.setAttribute(FSMLLaunchConstants.INPUT_FILE_ATTR,
				inputLocation.getStringValue());
		configuration.setAttribute(FSMLLaunchConstants.OUTPUT_FILE_ATTR,
				outputLocation.getStringValue());
	}

	@Override
	public String getName() {
		return "Simulation";
	}

}
