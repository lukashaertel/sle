package sle.fsml.runconfig;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.LinkedList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.xtext.xbase.lib.Pair;

import sle.fsml.fSML.FSMState;
import sle.fsml.simulation.InfeasibleInputException;
import sle.fsml.simulation.InvalidInputException;
import sle.fsml.simulation.Simulation;

/**
 * This delegate handles a launch from the editor, it uses the static simulation
 * methods; consult the manifest for extension point
 * 
 * @author lukashaertel
 * 
 */
public class FSMLSimulationDelegate implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		// Get attributes from launch configuration
		final String machine = configuration.getAttribute(
				FSMLLaunchConstants.MACHINE_FILE_ATTR, "");
		final String input = configuration.getAttribute(
				FSMLLaunchConstants.INPUT_FILE_ATTR, "");
		final boolean write = configuration.getAttribute(
				FSMLLaunchConstants.WRITE_ATTR, false);
		final String output = configuration.getAttribute(
				FSMLLaunchConstants.OUTPUT_FILE_ATTR, "");
		final boolean print = configuration.getAttribute(
				FSMLLaunchConstants.PRINT_ATTR, true);

		// Skip if no output requested
		if (!write && !print) {
			return;
		}

		// Start a task ...
		monitor.beginTask("Simulating", 2);

		final LinkedList<Pair<EList<String>, FSMState>> simulation;

		// ... while simulating ...
		try {
			simulation = Simulation.simulate(machine, input);
			monitor.worked(1);
		} catch (InvalidInputException | InfeasibleInputException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					"sle.fsml.simulation",
					"Exception during finite state machine simulation", e));
		}

		// ... and toStringing ...
		final CharSequence result = Simulation.toText(simulation);

		// ... to show a bit of response to the UI
		monitor.worked(1);
		monitor.done();

		// If file-write is requested, write to file
		if (write) {
			try (PrintStream printStream = new PrintStream(output)) {
				printStream.print(result);
			} catch (FileNotFoundException e) {
				throw new CoreException(
						new Status(
								IStatus.ERROR,
								"sle.fsml.simulation",
								"Exception while writing finite state machine simulation result",
								e));
			}
		}

		// If print is requested, write to console
		if (print) {
			// Get manager
			final IConsoleManager cm = ConsolePlugin.getDefault()
					.getConsoleManager();

			// Find a console
			MessageConsole simulationOutput = null;
			for (IConsole console : cm.getConsoles()) {
				if (!(console instanceof MessageConsole)) {
					continue;
				}

				if ("Simulation output".equals(console.getName())) {
					simulationOutput = (MessageConsole) console;
					break;
				}
			}

			// Or create it
			if (simulationOutput == null) {
				simulationOutput = new MessageConsole("Simulation output",
						getImageDescriptor());
			}

			// Add and show it
			cm.addConsoles(new IConsole[] { simulationOutput });
			cm.showConsoleView(simulationOutput);

			// Print to it
			try (MessageConsoleStream simulationOutputStream = new MessageConsoleStream(
					simulationOutput)) {
				simulationOutputStream.println("Running FSM simulation:");
				simulationOutputStream.println("Start time: " + new Date());
				simulationOutputStream.println("Machine: " + machine);
				simulationOutputStream.println("Input: " + input);
				simulationOutputStream.println("Result: ");
				simulationOutputStream.println(result.toString());
			} catch (IOException e) {
				throw new CoreException(new Status(IStatus.ERROR,
						"sle.fsml.simulation",
						"Exception writing eclipse console", e));
			}
		}
	}

	private ImageDescriptor getImageDescriptor() {
		// Usually reuse image; we initialize this every time we get the image
		// for this tab
		try {
			final Image image = new Image(null, Platform
					.getBundle("sle.fsml.simulation").getEntry("icons/fsm.gif")
					.openStream());

			return new ImageDescriptor() {

				@Override
				public ImageData getImageData() {
					return image.getImageData();
				}
			};
		} catch (IOException e) {
			return null;
		}
	}
}
