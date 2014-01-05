package sle.fsml.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import sle.fsml.FSMLInjectorProvider
import com.google.inject.Inject
import org.eclipse.xtext.junit4.util.ParseHelper
import sle.fsml.fSML.FSM
import org.junit.Test
import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(FSMLInjectorProvider))
class FSMLTests
{
	@Inject extension ParseHelper<FSM> parseHelper;

	@Test
	def testA()
	{
		val fsm = '''initial state a {}'''.parse
		
		assertEquals(fsm.states.size, 1);
		assertEquals(fsm.states.get(0).name, 'a');
		assertEquals(fsm.states.get(0).transitions.size, 0);
	}
}
