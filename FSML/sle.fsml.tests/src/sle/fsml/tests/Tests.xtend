package sle.fsml.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import sle.fsml.fSML.FSMLFactory

import static org.junit.Assert.*
import org.eclipse.xtext.junit4.InjectWith
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import sle.fsml.fSML.FSM
import sle.fsml.FSMLInjectorProvider
import sle.fsml.input.input.InputFactory
import sle.fsml.simulation.Simulation
import org.junit.Before
import sle.fsml.fSML.FSMState
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EObject

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(FSMLInjectorProvider))
class Tests
{

	/**
	 * Parse helper to be injected
	 */
	@Inject extension ParseHelper<FSM> parseHelper;

	/**
	 * Factory for FSML object
	 */
	extension FSMLFactory fsmlFactory = FSMLFactory.eINSTANCE;

	/**
	 * Factory for Input objects
	 */
	extension InputFactory inputFactory = InputFactory.eINSTANCE;

	/**
	 * The turnstile finite state machine
	 */
	var FSM fsm;

	/**
	 * The turnstiles locked state
	 */
	var FSMState locked;

	/**
	 * The turnstiles unlocked state
	 */
	var FSMState unlocked;

	/**
	 * The turnstiles exception state
	 */
	var FSMState exception;

	/**
	 * Setup creates the reference finite state machine
	 */
	@Before
	def void setup()
	{

		// Create states ahead to make them referencable
		locked = createFSMState => [initial = true; name = 'locked'];
		unlocked = createFSMState => [name = 'unlocked'];
		exception = createFSMState => [name = 'exception'];

		// Initialize locked state
		locked => [
			transitions += createFSMTransition => [
				input = 'ticket';
				action = 'collect';
				target = unlocked;
			];
			transitions += createFSMTransition => [
				input = 'pass';
				action = 'alarm';
				target = exception;
			];
		];

		// Initialize unlocked state
		unlocked => [
			transitions += createFSMTransition => [
				input = 'ticket';
				action = 'eject';
			];
			transitions += createFSMTransition => [
				input = 'pass';
				target = locked;
			];
		];

		// Initialize exception state
		exception => [
			transitions += createFSMTransition => [
				input = 'ticket';
				action = 'eject';
			];
			transitions += createFSMTransition => [
				input = 'pass';
			];
			transitions += createFSMTransition => [
				input = 'mute';
			];
			transitions += createFSMTransition => [
				input = 'release';
				target = locked;
			];
		];

		// Initialize states
		fsm = createFSM => [
			states += locked;
			states += unlocked;
			states += exception;
		];
	}

	/**
	 * testParse tests the parser against the reference
	 */
	@Test
	def void testParse()
	{

		// Obtain the finite state machine by parsing it from text
		val fsmParsed = parse(
			'''initial state locked {
  ticket/collect -> unlocked;
  pass/alarm -> exception;
}
state unlocked {
  ticket/eject;
  pass -> locked;
}
state exception {
  ticket/eject;
  pass;
  mute;
  release -> locked;
}''')

		// Assert EObject equality
		assertEEquals(fsm, fsmParsed);
	}

	/**
	 * testSimulation tests the simulator against a reference result
	 */
	@Test
	def testSimulation()
	{
		// Create the input model
		val input = createInput => [
			inputs += createInputEntry => [value = 'ticket'];
			inputs += createInputEntry => [value = 'pass'];
			inputs += createInputEntry => [value = 'ticket'];
			inputs += createInputEntry => [value = 'pass'];
			inputs += createInputEntry => [value = 'ticket'];
			inputs += createInputEntry => [value = 'ticket'];
			inputs += createInputEntry => [value = 'pass'];
			inputs += createInputEntry => [value = 'pass'];
			inputs += createInputEntry => [value = 'ticket'];
			inputs += createInputEntry => [value = 'pass'];
			inputs += createInputEntry => [value = 'mute'];
			inputs += createInputEntry => [value = 'release'];
			inputs += createInputEntry => [value = 'ticket'];
			inputs += createInputEntry => [value = 'pass'];
		];

		// Create the expected result value
		val expectedResult = #[
			"collect" -> unlocked,
			null -> locked,
			"collect" -> unlocked,
			null -> locked,
			"collect" -> unlocked,
			"eject" -> unlocked,
			null -> locked,
			"alarm" -> exception,
			"eject" -> exception,
			null -> exception,
			null -> exception,
			null -> locked,
			"collect" -> unlocked,
			null -> locked
		];

		// Simulate and store the actual result value
		val result = Simulation::simulate(fsm, input);

		// Assert equality
		assertEquals(expectedResult, result);
	}

	/**
	 * Helper because JUnit does not know how to structurally compare EObjects
	 */
	def static assertEEquals(EObject expected, EObject actual)
	{
		assertTrue('''Expected: «expected» but was: «actual»''', EcoreUtil::equals(expected, actual));
	}
}
