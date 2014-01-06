package sle.fsml.input.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import sle.fsml.input.InputInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import sle.fsml.input.input.Input
import org.eclipse.xtext.junit4.util.ParseHelper
import com.google.inject.Inject
import sle.fsml.input.input.InputFactory
import org.junit.Before
import org.junit.Test
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(InputInjectorProvider)
class Tests
{

	/**
	 * Parse helper to be injected
	 */
	@Inject extension ParseHelper<Input> parseHelper;

	/**
	 * Factory for Input objects
	 */
	extension InputFactory inputFactory = InputFactory.eINSTANCE;

	var Input input;

	/**
	 * Setup creates the reference input
	 */
	@Before
	def void setup()
	{
		input = createInput => [
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
	}

	/**
	 * This method tests the input-parser against the reference
	 */
	@Test
	def void testParse()
	{

		// Obtain the finite state machine by parsing it from text
		val inputParsed = parse(
			'''[
  ticket, % Regular insertion of a ticket
  pass, % Regular passage of turnstile
  ticket, % Regular insertion of a ticket
  pass, % Regular passage of turnstile
  ticket, % Regular insertion of a ticket
  ticket, % Tickets are ejected in unlocked state
  pass, % Regular passage of turnstile
  pass, % Attempt leads to exceptional state
  ticket, % Tickets are ejected in exceptional state
  pass, % Passage attempt keeps us in exceptional state
  mute, % Mute indeed
  release, % Return to normal
  ticket, % Regular insertion of a ticket
  pass % Regular passage of turnstile
].''');

		// Assert EObject equality
		assertEEquals(input, inputParsed);
	}

	/**
	 * Helper because JUnit does not know how to structurally compare EObjects
	 */
	def static assertEEquals(EObject expected, EObject actual)
	{
		assertTrue('''Expected: «expected» but was: «actual»''', EcoreUtil::equals(expected, actual));
	}
}
