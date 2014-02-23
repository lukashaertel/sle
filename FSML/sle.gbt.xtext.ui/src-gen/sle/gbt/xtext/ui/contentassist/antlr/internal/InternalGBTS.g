/*
* generated by Xtext
*/
grammar InternalGBTS;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package sle.gbt.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package sle.gbt.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import sle.gbt.xtext.services.GBTSGrammarAccess;

}

@parser::members {
 
 	private GBTSGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(GBTSGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModel
entryRuleModel 
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
(
{ before(grammarAccess.getModelAccess().getTestsAssignment()); }
(rule__Model__TestsAssignment)
{ after(grammarAccess.getModelAccess().getTestsAssignment()); }
)
(
{ before(grammarAccess.getModelAccess().getTestsAssignment()); }
(rule__Model__TestsAssignment)*
{ after(grammarAccess.getModelAccess().getTestsAssignment()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleGrammarID
entryRuleGrammarID 
:
{ before(grammarAccess.getGrammarIDRule()); }
	 ruleGrammarID
{ after(grammarAccess.getGrammarIDRule()); } 
	 EOF 
;

// Rule GrammarID
ruleGrammarID
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getGrammarIDAccess().getGroup()); }
(rule__GrammarID__Group__0)
{ after(grammarAccess.getGrammarIDAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTest
entryRuleTest 
:
{ before(grammarAccess.getTestRule()); }
	 ruleTest
{ after(grammarAccess.getTestRule()); } 
	 EOF 
;

// Rule Test
ruleTest
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTestAccess().getGroup()); }
(rule__Test__Group__0)
{ after(grammarAccess.getTestAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSubstitution
entryRuleSubstitution 
:
{ before(grammarAccess.getSubstitutionRule()); }
	 ruleSubstitution
{ after(grammarAccess.getSubstitutionRule()); } 
	 EOF 
;

// Rule Substitution
ruleSubstitution
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSubstitutionAccess().getGroup()); }
(rule__Substitution__Group__0)
{ after(grammarAccess.getSubstitutionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSG
entryRuleSG 
:
{ before(grammarAccess.getSGRule()); }
	 ruleSG
{ after(grammarAccess.getSGRule()); } 
	 EOF 
;

// Rule SG
ruleSG
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSGAccess().getAlternativeParserRuleCall()); }
	ruleAlternative
{ after(grammarAccess.getSGAccess().getAlternativeParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAlternative
entryRuleAlternative 
:
{ before(grammarAccess.getAlternativeRule()); }
	 ruleAlternative
{ after(grammarAccess.getAlternativeRule()); } 
	 EOF 
;

// Rule Alternative
ruleAlternative
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAlternativeAccess().getGroup()); }
(rule__Alternative__Group__0)
{ after(grammarAccess.getAlternativeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSequence
entryRuleSequence 
:
{ before(grammarAccess.getSequenceRule()); }
	 ruleSequence
{ after(grammarAccess.getSequenceRule()); } 
	 EOF 
;

// Rule Sequence
ruleSequence
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSequenceAccess().getGroup()); }
(rule__Sequence__Group__0)
{ after(grammarAccess.getSequenceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCardinality
entryRuleCardinality 
:
{ before(grammarAccess.getCardinalityRule()); }
	 ruleCardinality
{ after(grammarAccess.getCardinalityRule()); } 
	 EOF 
;

// Rule Cardinality
ruleCardinality
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCardinalityAccess().getGroup()); }
(rule__Cardinality__Group__0)
{ after(grammarAccess.getCardinalityAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOperated
entryRuleOperated 
:
{ before(grammarAccess.getOperatedRule()); }
	 ruleOperated
{ after(grammarAccess.getOperatedRule()); } 
	 EOF 
;

// Rule Operated
ruleOperated
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOperatedAccess().getAlternatives()); }
(rule__Operated__Alternatives)
{ after(grammarAccess.getOperatedAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTerminal
entryRuleTerminal 
:
{ before(grammarAccess.getTerminalRule()); }
	 ruleTerminal
{ after(grammarAccess.getTerminalRule()); } 
	 EOF 
;

// Rule Terminal
ruleTerminal
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTerminalAccess().getAlternatives()); }
(rule__Terminal__Alternatives)
{ after(grammarAccess.getTerminalAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParenthesizedElement
entryRuleParenthesizedElement 
:
{ before(grammarAccess.getParenthesizedElementRule()); }
	 ruleParenthesizedElement
{ after(grammarAccess.getParenthesizedElementRule()); } 
	 EOF 
;

// Rule ParenthesizedElement
ruleParenthesizedElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParenthesizedElementAccess().getGroup()); }
(rule__ParenthesizedElement__Group__0)
{ after(grammarAccess.getParenthesizedElementAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Cardinality__Alternatives_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalityAccess().getGroup_1_0()); }
(rule__Cardinality__Group_1_0__0)
{ after(grammarAccess.getCardinalityAccess().getGroup_1_0()); }
)

    |(
{ before(grammarAccess.getCardinalityAccess().getGroup_1_1()); }
(rule__Cardinality__Group_1_1__0)
{ after(grammarAccess.getCardinalityAccess().getGroup_1_1()); }
)

    |(
{ before(grammarAccess.getCardinalityAccess().getGroup_1_2()); }
(rule__Cardinality__Group_1_2__0)
{ after(grammarAccess.getCardinalityAccess().getGroup_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operated__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatedAccess().getGroup_0()); }
(rule__Operated__Group_0__0)
{ after(grammarAccess.getOperatedAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getOperatedAccess().getGroup_1()); }
(rule__Operated__Group_1__0)
{ after(grammarAccess.getOperatedAccess().getGroup_1()); }
)

    |(
{ before(grammarAccess.getOperatedAccess().getTerminalParserRuleCall_2()); }
	ruleTerminal
{ after(grammarAccess.getOperatedAccess().getTerminalParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getGroup_0()); }
(rule__Terminal__Group_0__0)
{ after(grammarAccess.getTerminalAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getTerminalAccess().getGroup_1()); }
(rule__Terminal__Group_1__0)
{ after(grammarAccess.getTerminalAccess().getGroup_1()); }
)

    |(
{ before(grammarAccess.getTerminalAccess().getParenthesizedElementParserRuleCall_2()); }
	ruleParenthesizedElement
{ after(grammarAccess.getTerminalAccess().getParenthesizedElementParserRuleCall_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__GrammarID__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GrammarID__Group__0__Impl
	rule__GrammarID__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GrammarID__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GrammarID__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGrammarIDAccess().getGroup_1()); }
(rule__GrammarID__Group_1__0)*
{ after(grammarAccess.getGrammarIDAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__GrammarID__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GrammarID__Group_1__0__Impl
	rule__GrammarID__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__GrammarID__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__GrammarID__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__GrammarID__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Test__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Test__Group__0__Impl
	rule__Test__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Test__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getTestKeyword_0()); }

	'test' 

{ after(grammarAccess.getTestAccess().getTestKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Test__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Test__Group__1__Impl
	rule__Test__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Test__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getRefAssignment_1()); }
(rule__Test__RefAssignment_1)
{ after(grammarAccess.getTestAccess().getRefAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Test__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Test__Group__2__Impl
	rule__Test__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Test__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getGroup_2()); }
(rule__Test__Group_2__0)?
{ after(grammarAccess.getTestAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Test__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Test__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Test__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getGroup_3()); }
(rule__Test__Group_3__0)?
{ after(grammarAccess.getTestAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Test__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Test__Group_2__0__Impl
	rule__Test__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Test__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getStartKeyword_2_0()); }

	'start' 

{ after(grammarAccess.getTestAccess().getStartKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Test__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Test__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Test__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getRuleAssignment_2_1()); }
(rule__Test__RuleAssignment_2_1)
{ after(grammarAccess.getTestAccess().getRuleAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Test__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Test__Group_3__0__Impl
	rule__Test__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Test__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3_0()); }

	'{' 

{ after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Test__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Test__Group_3__1__Impl
	rule__Test__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Test__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getSubstitutionsAssignment_3_1()); }
(rule__Test__SubstitutionsAssignment_3_1)
{ after(grammarAccess.getTestAccess().getSubstitutionsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Test__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Test__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Test__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_3_2()); }

	'}' 

{ after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Substitution__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Substitution__Group__0__Impl
	rule__Substitution__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Substitution__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubstitutionAccess().getSubstituteKeyword_0()); }

	'substitute' 

{ after(grammarAccess.getSubstitutionAccess().getSubstituteKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Substitution__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Substitution__Group__1__Impl
	rule__Substitution__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Substitution__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubstitutionAccess().getRuleAssignment_1()); }
(rule__Substitution__RuleAssignment_1)
{ after(grammarAccess.getSubstitutionAccess().getRuleAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Substitution__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Substitution__Group__2__Impl
	rule__Substitution__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Substitution__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubstitutionAccess().getWithKeyword_2()); }

	'with' 

{ after(grammarAccess.getSubstitutionAccess().getWithKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Substitution__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Substitution__Group__3__Impl
	rule__Substitution__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Substitution__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubstitutionAccess().getSubstitutionAssignment_3()); }
(rule__Substitution__SubstitutionAssignment_3)
{ after(grammarAccess.getSubstitutionAccess().getSubstitutionAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Substitution__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Substitution__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Substitution__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubstitutionAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getSubstitutionAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Alternative__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Alternative__Group__0__Impl
	rule__Alternative__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternative__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeAccess().getSequenceParserRuleCall_0()); }
	ruleSequence
{ after(grammarAccess.getAlternativeAccess().getSequenceParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Alternative__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Alternative__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternative__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeAccess().getGroup_1()); }
(rule__Alternative__Group_1__0)?
{ after(grammarAccess.getAlternativeAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Alternative__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Alternative__Group_1__0__Impl
	rule__Alternative__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternative__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0()); }
(

)
{ after(grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Alternative__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Alternative__Group_1__1__Impl
	rule__Alternative__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternative__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeAccess().getVerticalLineKeyword_1_1()); }

	'|' 

{ after(grammarAccess.getAlternativeAccess().getVerticalLineKeyword_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Alternative__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Alternative__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Alternative__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeAccess().getRightAssignment_1_2()); }
(rule__Alternative__RightAssignment_1_2)
{ after(grammarAccess.getAlternativeAccess().getRightAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Sequence__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group__0__Impl
	rule__Sequence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getCardinalityParserRuleCall_0()); }
	ruleCardinality
{ after(grammarAccess.getSequenceAccess().getCardinalityParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getGroup_1()); }
(rule__Sequence__Group_1__0)?
{ after(grammarAccess.getSequenceAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Sequence__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group_1__0__Impl
	rule__Sequence__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0()); }
(

)
{ after(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Sequence__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Sequence__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getRightAssignment_1_1()); }
(rule__Sequence__RightAssignment_1_1)
{ after(grammarAccess.getSequenceAccess().getRightAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Cardinality__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cardinality__Group__0__Impl
	rule__Cardinality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalityAccess().getOperatedParserRuleCall_0()); }
	ruleOperated
{ after(grammarAccess.getCardinalityAccess().getOperatedParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cardinality__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cardinality__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalityAccess().getAlternatives_1()); }
(rule__Cardinality__Alternatives_1)?
{ after(grammarAccess.getCardinalityAccess().getAlternatives_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Cardinality__Group_1_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cardinality__Group_1_0__0__Impl
	rule__Cardinality__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group_1_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0()); }
(

)
{ after(grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cardinality__Group_1_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cardinality__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group_1_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalityAccess().getQuestionMarkKeyword_1_0_1()); }

	'?' 

{ after(grammarAccess.getCardinalityAccess().getQuestionMarkKeyword_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Cardinality__Group_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cardinality__Group_1_1__0__Impl
	rule__Cardinality__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0()); }
(

)
{ after(grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cardinality__Group_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cardinality__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_1_1()); }

	'*' 

{ after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Cardinality__Group_1_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cardinality__Group_1_2__0__Impl
	rule__Cardinality__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group_1_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0()); }
(

)
{ after(grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Cardinality__Group_1_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Cardinality__Group_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group_1_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCardinalityAccess().getPlusSignKeyword_1_2_1()); }

	'+' 

{ after(grammarAccess.getCardinalityAccess().getPlusSignKeyword_1_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Operated__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operated__Group_0__0__Impl
	rule__Operated__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Operated__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatedAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); }

	'->' 

{ after(grammarAccess.getOperatedAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operated__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operated__Group_0__1__Impl
	rule__Operated__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Operated__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatedAccess().getUntilAction_0_1()); }
(

)
{ after(grammarAccess.getOperatedAccess().getUntilAction_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operated__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operated__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Operated__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatedAccess().getOfAssignment_0_2()); }
(rule__Operated__OfAssignment_0_2)
{ after(grammarAccess.getOperatedAccess().getOfAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Operated__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operated__Group_1__0__Impl
	rule__Operated__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Operated__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatedAccess().getExclamationMarkKeyword_1_0()); }

	'!' 

{ after(grammarAccess.getOperatedAccess().getExclamationMarkKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operated__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operated__Group_1__1__Impl
	rule__Operated__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Operated__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatedAccess().getNegationAction_1_1()); }
(

)
{ after(grammarAccess.getOperatedAccess().getNegationAction_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Operated__Group_1__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Operated__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Operated__Group_1__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatedAccess().getOfAssignment_1_2()); }
(rule__Operated__OfAssignment_1_2)
{ after(grammarAccess.getOperatedAccess().getOfAssignment_1_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Terminal__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Terminal__Group_0__0__Impl
	rule__Terminal__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getRangeAction_0_0()); }
(

)
{ after(grammarAccess.getTerminalAccess().getRangeAction_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Terminal__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Terminal__Group_0__1__Impl
	rule__Terminal__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getMinAssignment_0_1()); }
(rule__Terminal__MinAssignment_0_1)
{ after(grammarAccess.getTerminalAccess().getMinAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Terminal__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Terminal__Group_0__2__Impl
	rule__Terminal__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_0_2()); }

	'..' 

{ after(grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Terminal__Group_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Terminal__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getMaxAssignment_0_3()); }
(rule__Terminal__MaxAssignment_0_3)
{ after(grammarAccess.getTerminalAccess().getMaxAssignment_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Terminal__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Terminal__Group_1__0__Impl
	rule__Terminal__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getSingleAction_1_0()); }
(

)
{ after(grammarAccess.getTerminalAccess().getSingleAction_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Terminal__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Terminal__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getTokenAssignment_1_1()); }
(rule__Terminal__TokenAssignment_1_1)
{ after(grammarAccess.getTerminalAccess().getTokenAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ParenthesizedElement__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParenthesizedElement__Group__0__Impl
	rule__ParenthesizedElement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedElement__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); }

	'(' 

{ after(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParenthesizedElement__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParenthesizedElement__Group__1__Impl
	rule__ParenthesizedElement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedElement__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParenthesizedElementAccess().getAlternativeParserRuleCall_1()); }
	ruleAlternative
{ after(grammarAccess.getParenthesizedElementAccess().getAlternativeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ParenthesizedElement__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ParenthesizedElement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParenthesizedElement__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); }

	')' 

{ after(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__Model__TestsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelAccess().getTestsTestParserRuleCall_0()); }
	ruleTest{ after(grammarAccess.getModelAccess().getTestsTestParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Test__RefAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getRefGrammarCrossReference_1_0()); }
(
{ before(grammarAccess.getTestAccess().getRefGrammarGrammarIDParserRuleCall_1_0_1()); }
	ruleGrammarID{ after(grammarAccess.getTestAccess().getRefGrammarGrammarIDParserRuleCall_1_0_1()); }
)
{ after(grammarAccess.getTestAccess().getRefGrammarCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Test__RuleAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getRuleAbstractRuleCrossReference_2_1_0()); }
(
{ before(grammarAccess.getTestAccess().getRuleAbstractRuleIDTerminalRuleCall_2_1_0_1()); }
	RULE_ID{ after(grammarAccess.getTestAccess().getRuleAbstractRuleIDTerminalRuleCall_2_1_0_1()); }
)
{ after(grammarAccess.getTestAccess().getRuleAbstractRuleCrossReference_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Test__SubstitutionsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTestAccess().getSubstitutionsSubstitutionParserRuleCall_3_1_0()); }
	ruleSubstitution{ after(grammarAccess.getTestAccess().getSubstitutionsSubstitutionParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Substitution__RuleAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubstitutionAccess().getRuleAbstractRuleCrossReference_1_0()); }
(
{ before(grammarAccess.getSubstitutionAccess().getRuleAbstractRuleIDTerminalRuleCall_1_0_1()); }
	RULE_ID{ after(grammarAccess.getSubstitutionAccess().getRuleAbstractRuleIDTerminalRuleCall_1_0_1()); }
)
{ after(grammarAccess.getSubstitutionAccess().getRuleAbstractRuleCrossReference_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Substitution__SubstitutionAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSubstitutionAccess().getSubstitutionSGParserRuleCall_3_0()); }
	ruleSG{ after(grammarAccess.getSubstitutionAccess().getSubstitutionSGParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Alternative__RightAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAlternativeAccess().getRightSequenceParserRuleCall_1_2_0()); }
	ruleSequence{ after(grammarAccess.getAlternativeAccess().getRightSequenceParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Sequence__RightAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequenceAccess().getRightCardinalityParserRuleCall_1_1_0()); }
	ruleCardinality{ after(grammarAccess.getSequenceAccess().getRightCardinalityParserRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operated__OfAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_0_2_0()); }
	ruleOperated{ after(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Operated__OfAssignment_1_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_1_2_0()); }
	ruleOperated{ after(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_1_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__MinAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getMinSTRINGTerminalRuleCall_0_1_0()); }
	RULE_STRING{ after(grammarAccess.getTerminalAccess().getMinSTRINGTerminalRuleCall_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__MaxAssignment_0_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getMaxSTRINGTerminalRuleCall_0_3_0()); }
	RULE_STRING{ after(grammarAccess.getTerminalAccess().getMaxSTRINGTerminalRuleCall_0_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Terminal__TokenAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTerminalAccess().getTokenSTRINGTerminalRuleCall_1_1_0()); }
	RULE_STRING{ after(grammarAccess.getTerminalAccess().getTokenSTRINGTerminalRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


