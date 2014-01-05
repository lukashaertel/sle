package sle.fsml.runconfig;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import sle.fsml.Simulation;
import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;
import sle.fsml.input.input.Input;
import sle.fsml.input.input.InputEntry;

public class FSMLSimulationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		// Attribute getter segment
		final String machine = configuration.getAttribute(
				FSMLLaunchConstants.MACHINE_FILE_ATTR, "");
		final String input = configuration.getAttribute(
				FSMLLaunchConstants.INPUT_FILE_ATTR, "");
		final String output = configuration.getAttribute(
				FSMLLaunchConstants.OUTPUT_FILE_ATTR, "");

		try {
			Simulation.simulate(machine, input, output, monitor);
		} catch (FileNotFoundException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					"sle.fsml.runconfig",
					"Exception during finite state machine simulation", e));
		}
	}

}
