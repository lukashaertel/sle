package sle.fsml.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import sle.fsml.fSML.FSM;
import sle.fsml.fSML.FSMLPackage;
import sle.fsml.fSML.FSMState;
import sle.fsml.fSML.FSMTransition;
import sle.fsml.services.FSMLGrammarAccess;

@SuppressWarnings("all")
public class FSMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FSMLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FSMLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FSMLPackage.FSM:
				if(context == grammarAccess.getFSMRule()) {
					sequence_FSM(context, (FSM) semanticObject); 
					return; 
				}
				else break;
			case FSMLPackage.FSM_STATE:
				if(context == grammarAccess.getFSMStateRule()) {
					sequence_FSMState(context, (FSMState) semanticObject); 
					return; 
				}
				else break;
			case FSMLPackage.FSM_TRANSITION:
				if(context == grammarAccess.getFSMTransitionRule()) {
					sequence_FSMTransition(context, (FSMTransition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (initial?='initial'? name=ID transitions+=FSMTransition*)
	 */
	protected void sequence_FSMState(EObject context, FSMState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (input=ID action=ID? target=[FSMState|ID]?)
	 */
	protected void sequence_FSMTransition(EObject context, FSMTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     states+=FSMState*
	 */
	protected void sequence_FSM(EObject context, FSM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
