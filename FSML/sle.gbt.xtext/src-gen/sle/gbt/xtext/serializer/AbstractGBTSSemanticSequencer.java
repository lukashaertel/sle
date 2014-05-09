package sle.gbt.xtext.serializer;

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
import sle.gbt.sg.Alternative;
import sle.gbt.sg.Negation;
import sle.gbt.sg.Optional;
import sle.gbt.sg.Plus;
import sle.gbt.sg.Range;
import sle.gbt.sg.Reference;
import sle.gbt.sg.Sequence;
import sle.gbt.sg.SgPackage;
import sle.gbt.sg.Single;
import sle.gbt.sg.Star;
import sle.gbt.sg.Until;
import sle.gbt.xtext.gBTS.Apply;
import sle.gbt.xtext.gBTS.GBTSPackage;
import sle.gbt.xtext.gBTS.Model;
import sle.gbt.xtext.gBTS.New;
import sle.gbt.xtext.gBTS.Sub;
import sle.gbt.xtext.gBTS.Test;
import sle.gbt.xtext.services.GBTSGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractGBTSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private GBTSGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == GBTSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case GBTSPackage.APPLY:
				if(context == grammarAccess.getApplyRule() ||
				   context == grammarAccess.getMemberRule()) {
					sequence_Apply(context, (Apply) semanticObject); 
					return; 
				}
				else break;
			case GBTSPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case GBTSPackage.NEW:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getNewRule()) {
					sequence_New(context, (New) semanticObject); 
					return; 
				}
				else break;
			case GBTSPackage.SUB:
				if(context == grammarAccess.getMemberRule() ||
				   context == grammarAccess.getSubRule()) {
					sequence_Sub(context, (Sub) semanticObject); 
					return; 
				}
				else break;
			case GBTSPackage.TEST:
				if(context == grammarAccess.getTestRule()) {
					sequence_Test(context, (Test) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SgPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SgPackage.ALTERNATIVE:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Alternative(context, (Alternative) semanticObject); 
					return; 
				}
				else break;
			case SgPackage.NEGATION:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Operated(context, (Negation) semanticObject); 
					return; 
				}
				else break;
			case SgPackage.OPTIONAL:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Cardinality(context, (Optional) semanticObject); 
					return; 
				}
				else break;
			case SgPackage.PLUS:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Cardinality(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case SgPackage.RANGE:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Terminal(context, (Range) semanticObject); 
					return; 
				}
				else break;
			case SgPackage.REFERENCE:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Terminal(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case SgPackage.SEQUENCE:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Sequence(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			case SgPackage.SINGLE:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Terminal(context, (Single) semanticObject); 
					return; 
				}
				else break;
			case SgPackage.STAR:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Cardinality(context, (Star) semanticObject); 
					return; 
				}
				else break;
			case SgPackage.UNTIL:
				if(context == grammarAccess.getAlternativeRule() ||
				   context == grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0() ||
				   context == grammarAccess.getCardinalityRule() ||
				   context == grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0() ||
				   context == grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0() ||
				   context == grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0() ||
				   context == grammarAccess.getOperatedRule() ||
				   context == grammarAccess.getParenthesizedElementRule() ||
				   context == grammarAccess.getSGRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0() ||
				   context == grammarAccess.getTerminalRule()) {
					sequence_Operated(context, (Until) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Alternative_Alternative_1_0 right=Alternative)
	 */
	protected void sequence_Alternative(EObject context, Alternative semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.BINARY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.BINARY__LEFT));
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.BINARY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.BINARY__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAlternativeAccess().getRightAlternativeParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (minOrIt=INT (hasMax?='..' max=INT)? (hasNum?=':' num=INT)?)
	 */
	protected void sequence_Apply(EObject context, Apply semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     of=Cardinality_Optional_1_0_0
	 */
	protected void sequence_Cardinality(EObject context, Optional semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.UNARY__OF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.UNARY__OF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0(), semanticObject.getOf());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     of=Cardinality_Plus_1_2_0
	 */
	protected void sequence_Cardinality(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.UNARY__OF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.UNARY__OF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0(), semanticObject.getOf());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     of=Cardinality_Star_1_1_0
	 */
	protected void sequence_Cardinality(EObject context, Star semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.UNARY__OF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.UNARY__OF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0(), semanticObject.getOf());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     tsts+=Test*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (term?='terminal'? rule=ID definition=SG)
	 */
	protected void sequence_New(EObject context, New semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     of=Operated
	 */
	protected void sequence_Operated(EObject context, Negation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.UNARY__OF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.UNARY__OF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_1_2_0(), semanticObject.getOf());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     of=Operated
	 */
	protected void sequence_Operated(EObject context, Until semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.UNARY__OF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.UNARY__OF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_0_2_0(), semanticObject.getOf());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Sequence_Sequence_1_0 right=Sequence)
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.BINARY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.BINARY__LEFT));
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.BINARY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.BINARY__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSequenceAccess().getRightSequenceParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (rule=[AbstractRule|ID] substitution=SG)
	 */
	protected void sequence_Sub(EObject context, Sub semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, GBTSPackage.Literals.SUB__RULE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GBTSPackage.Literals.SUB__RULE));
			if(transientValues.isValueTransient(semanticObject, GBTSPackage.Literals.SUB__SUBSTITUTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, GBTSPackage.Literals.SUB__SUBSTITUTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSubAccess().getRuleAbstractRuleIDTerminalRuleCall_1_0_1(), semanticObject.getRule());
		feeder.accept(grammarAccess.getSubAccess().getSubstitutionSGParserRuleCall_3_0(), semanticObject.getSubstitution());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (min=STRING max=STRING)
	 */
	protected void sequence_Terminal(EObject context, Range semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.RANGE__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.RANGE__MIN));
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.RANGE__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.RANGE__MAX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalAccess().getMinSTRINGTerminalRuleCall_0_1_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getTerminalAccess().getMaxSTRINGTerminalRuleCall_0_3_0(), semanticObject.getMax());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     to=ID
	 */
	protected void sequence_Terminal(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.REFERENCE__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.REFERENCE__TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalAccess().getToIDTerminalRuleCall_2_1_0(), semanticObject.getTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     token=STRING
	 */
	protected void sequence_Terminal(EObject context, Single semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SgPackage.Literals.SINGLE__TOKEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SgPackage.Literals.SINGLE__TOKEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTerminalAccess().getTokenSTRINGTerminalRuleCall_1_1_0(), semanticObject.getToken());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         ref=[Grammar|GrammarID] 
	 *         (hasLbr?='lbr' lbr=INT)? 
	 *         (hasLbrInitial?='lbr' lbrInitial=INT)? 
	 *         (hasStartrule?='start' startrule=[AbstractRule|ID])? 
	 *         members+=Member*
	 *     )
	 */
	protected void sequence_Test(EObject context, Test semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
