package sle.fsml;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;
import sle.fsml.input.input.Input;
import sle.fsml.input.input.InputEntry;

public class Simulation {
	/**
	 * Finds the first object of class in the resource by iterating the tree
	 */
	private static <T> T firstIn(Class<T> c, Resource r) {
		TreeIterator<EObject> it = r.getAllContents();
		while (it.hasNext()) {
			EObject o = it.next();

			if (c.isInstance(o)) {
				return c.cast(o);
			}
		}

		return null;
	}

	/**
	 * Find initial state via iteration over each state given
	 */
	private static FSMState initial(Iterable<FSMState> ss) {
		for (FSMState s : ss) {
			if (s.isInitial())
				return s;
		}

		return null;
	}

	/**
	 * Find transition for input via iteration over each transition given
	 */
	private static FSMTransition transitionFor(Iterable<FSMTransition> ts,
			String input) {
		for (FSMTransition t : ts) {
			if (t.getInput().equals(input)) {
				return t;
			}
		}

		return null;
	}

	/**
	 * Work amount of the given simulation stage
	 */
	private static final int RESOURCE_WORK = 1, PARSE_WORK = 5,
			SIMULATION_WORK = 5;

	/**
	 * Total amount of work
	 */
	private static final int TOTAL_WORK = RESOURCE_WORK + PARSE_WORK
			+ SIMULATION_WORK;

	/**
	 * Run the finite state machine simulation on the given files writing to the
	 * specified output
	 * 
	 * @param machine
	 *            The machine file
	 * @param input
	 *            The input file
	 * @param output
	 *            The destination file
	 * @param monitor
	 *            An optional progress monitor
	 * @throws FileNotFoundException
	 *             Thrown by the destination writer
	 */
	public static void simulate(String machine, String input, String output,
			IProgressMonitor monitor) throws FileNotFoundException {

		// Work with progress framework
		if (monitor == null)
			monitor = new NullProgressMonitor();
		monitor.beginTask("Simulating finite state machine", TOTAL_WORK);

		// Resource segment
		monitor.subTask("Loading resources");
		final XtextResourceSet xrs = new XtextResourceSet();
		final Resource machineResource = xrs.getResource(
				URI.createFileURI(machine), true);
		final Resource inputResource = xrs.getResource(
				URI.createFileURI(input), true);

		// Step done
		monitor.worked(RESOURCE_WORK);

		// XText parsing segment
		monitor.subTask("Parsing resources");
		final FSM machineValue = firstIn(FSM.class, machineResource);
		final Input inputValue = firstIn(Input.class, inputResource);

		// Step done
		monitor.worked(PARSE_WORK);

		// Create a new sub-progress monitor to satisfy varying input sizes
		final SubProgressMonitor simulationMonitor = new SubProgressMonitor(
				monitor, SIMULATION_WORK);
		simulationMonitor.beginTask("Simulating input sequence on FSM",
				inputValue.getInputs().size());

		// Simulation segment
		try (PrintStream printStream = new PrintStream(output)) {
			// Initialize "file header"
			printStream.println("[");

			// Store the intersperse flag
			boolean separate = false;

			// Find the initial state via iteration
			FSMState state = initial(machineValue.getStates());

			// Handle each input entry
			for (InputEntry entry : inputValue.getInputs()) {
				// Find a matching transition via iteration
				final FSMTransition transition = transitionFor(
						state.getTransitions(), entry.getValue());

				// If transition has a target, jump there
				if (transition.getTarget() != null) {
					state = transition.getTarget();
				}

				// Optionally separate from the last written result
				if (separate) {
					printStream.println(',');
				}

				// Set the flag
				separate = true;

				// Write a result
				printStream.print("  ([");
				if (transition.getAction() != null) {
					printStream.print(transition.getAction());
				}
				printStream.print("], " + state.getName() + ")");

				// Sub-step done
				simulationMonitor.worked(1);
			}

			// Write "file footer"
			printStream.println();
			printStream.print("].");

			simulationMonitor.done();

		}

		monitor.done();
	}
}
