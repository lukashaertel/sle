package sle.fsml.input.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import sle.fsml.input.input.Input;
import sle.fsml.input.input.InputEntry;
import sle.fsml.input.input.InputPackage;
import sle.fsml.input.services.InputGrammarAccess;

@SuppressWarnings("all")
public class InputSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private InputGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == InputPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case InputPackage.INPUT:
				if(context == grammarAccess.getInputRule()) {
					sequence_Input(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case InputPackage.INPUT_ENTRY:
				if(context == grammarAccess.getInputEntryRule()) {
					sequence_InputEntry(context, (InputEntry) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_InputEntry(EObject context, InputEntry semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, InputPackage.Literals.INPUT_ENTRY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, InputPackage.Literals.INPUT_ENTRY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputEntryAccess().getValueIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((inputs+=InputEntry inputs+=InputEntry*)?)
	 */
	protected void sequence_Input(EObject context, Input semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
