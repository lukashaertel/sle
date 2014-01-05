package sle.fsml.runconfig;

import java.io.FileNotFoundException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import sle.fsml.simulation.Simulation;

public class FSMLSimulationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		// Get attributes from launch configuration
		final String machine = configuration.getAttribute(
				FSMLLaunchConstants.MACHINE_FILE_ATTR, "");
		final String input = configuration.getAttribute(
				FSMLLaunchConstants.INPUT_FILE_ATTR, "");
		final String output = configuration.getAttribute(
				FSMLLaunchConstants.OUTPUT_FILE_ATTR, "");

		try {
			// Simulate and catch the exception of the printstream
			Simulation.simulate(machine, input, output);
		} catch (FileNotFoundException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					"sle.fsml.simulation",
					"Exception during finite state machine simulation", e));
		}
	}

}
