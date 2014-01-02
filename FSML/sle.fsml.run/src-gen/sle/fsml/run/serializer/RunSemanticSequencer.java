package sle.fsml.run.serializer;

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
import sle.fsml.run.run.InputLocation;
import sle.fsml.run.run.InputReference;
import sle.fsml.run.run.MachineLocation;
import sle.fsml.run.run.MachineReference;
import sle.fsml.run.run.Run;
import sle.fsml.run.run.RunPackage;
import sle.fsml.run.run.Runfile;
import sle.fsml.run.services.RunGrammarAccess;

@SuppressWarnings("all")
public class RunSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RunGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RunPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RunPackage.INPUT_LOCATION:
				if(context == grammarAccess.getInputRule() ||
				   context == grammarAccess.getInputLocationRule()) {
					sequence_InputLocation(context, (InputLocation) semanticObject); 
					return; 
				}
				else break;
			case RunPackage.INPUT_REFERENCE:
				if(context == grammarAccess.getInputRule() ||
				   context == grammarAccess.getInputReferenceRule()) {
					sequence_InputReference(context, (InputReference) semanticObject); 
					return; 
				}
				else break;
			case RunPackage.MACHINE_LOCATION:
				if(context == grammarAccess.getMachineRule() ||
				   context == grammarAccess.getMachineLocationRule()) {
					sequence_MachineLocation(context, (MachineLocation) semanticObject); 
					return; 
				}
				else break;
			case RunPackage.MACHINE_REFERENCE:
				if(context == grammarAccess.getMachineRule() ||
				   context == grammarAccess.getMachineReferenceRule()) {
					sequence_MachineReference(context, (MachineReference) semanticObject); 
					return; 
				}
				else break;
			case RunPackage.RUN:
				if(context == grammarAccess.getRunRule()) {
					sequence_Run(context, (Run) semanticObject); 
					return; 
				}
				else break;
			case RunPackage.RUNFILE:
				if(context == grammarAccess.getRunfileRule()) {
					sequence_Runfile(context, (Runfile) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     location=STRING
	 */
	protected void sequence_InputLocation(EObject context, InputLocation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RunPackage.Literals.INPUT_LOCATION__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RunPackage.Literals.INPUT_LOCATION__LOCATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputLocationAccess().getLocationSTRINGTerminalRuleCall_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     input=[Input|ID]
	 */
	protected void sequence_InputReference(EObject context, InputReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RunPackage.Literals.INPUT_REFERENCE__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RunPackage.Literals.INPUT_REFERENCE__INPUT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInputReferenceAccess().getInputInputIDTerminalRuleCall_0_1(), semanticObject.getInput());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     location=STRING
	 */
	protected void sequence_MachineLocation(EObject context, MachineLocation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RunPackage.Literals.MACHINE_LOCATION__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RunPackage.Literals.MACHINE_LOCATION__LOCATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMachineLocationAccess().getLocationSTRINGTerminalRuleCall_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     fsm=[FSM|ID]
	 */
	protected void sequence_MachineReference(EObject context, MachineReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RunPackage.Literals.MACHINE_REFERENCE__FSM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RunPackage.Literals.MACHINE_REFERENCE__FSM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMachineReferenceAccess().getFsmFSMIDTerminalRuleCall_0_1(), semanticObject.getFsm());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (machine=Machine input=Input target=STRING)
	 */
	protected void sequence_Run(EObject context, Run semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RunPackage.Literals.RUN__MACHINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RunPackage.Literals.RUN__MACHINE));
			if(transientValues.isValueTransient(semanticObject, RunPackage.Literals.RUN__INPUT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RunPackage.Literals.RUN__INPUT));
			if(transientValues.isValueTransient(semanticObject, RunPackage.Literals.RUN__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RunPackage.Literals.RUN__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRunAccess().getMachineMachineParserRuleCall_1_0(), semanticObject.getMachine());
		feeder.accept(grammarAccess.getRunAccess().getInputInputParserRuleCall_3_0(), semanticObject.getInput());
		feeder.accept(grammarAccess.getRunAccess().getTargetSTRINGTerminalRuleCall_5_0(), semanticObject.getTarget());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     runs+=Run+
	 */
	protected void sequence_Runfile(EObject context, Runfile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
