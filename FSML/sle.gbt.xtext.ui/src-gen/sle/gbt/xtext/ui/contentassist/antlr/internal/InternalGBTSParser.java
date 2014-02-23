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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGBTSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'test'", "'start'", "'{'", "'}'", "'substitute'", "'with'", "';'", "'|'", "'?'", "'*'", "'+'", "'->'", "'!'", "'..'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalGBTSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGBTSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGBTSParser.tokenNames; }
    public String getGrammarFileName() { return "../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:61:1: ( ruleModel EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:69:1: ruleModel : ( ( ( rule__Model__TestsAssignment ) ) ( ( rule__Model__TestsAssignment )* ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:73:2: ( ( ( ( rule__Model__TestsAssignment ) ) ( ( rule__Model__TestsAssignment )* ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:74:1: ( ( ( rule__Model__TestsAssignment ) ) ( ( rule__Model__TestsAssignment )* ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:74:1: ( ( ( rule__Model__TestsAssignment ) ) ( ( rule__Model__TestsAssignment )* ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:75:1: ( ( rule__Model__TestsAssignment ) ) ( ( rule__Model__TestsAssignment )* )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:75:1: ( ( rule__Model__TestsAssignment ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:76:1: ( rule__Model__TestsAssignment )
            {
             before(grammarAccess.getModelAccess().getTestsAssignment()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:77:1: ( rule__Model__TestsAssignment )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:77:2: rule__Model__TestsAssignment
            {
            pushFollow(FOLLOW_rule__Model__TestsAssignment_in_ruleModel96);
            rule__Model__TestsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTestsAssignment()); 

            }

            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:80:1: ( ( rule__Model__TestsAssignment )* )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:81:1: ( rule__Model__TestsAssignment )*
            {
             before(grammarAccess.getModelAccess().getTestsAssignment()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:82:1: ( rule__Model__TestsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:82:2: rule__Model__TestsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__TestsAssignment_in_ruleModel108);
            	    rule__Model__TestsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTestsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGrammarID"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:95:1: entryRuleGrammarID : ruleGrammarID EOF ;
    public final void entryRuleGrammarID() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:96:1: ( ruleGrammarID EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:97:1: ruleGrammarID EOF
            {
             before(grammarAccess.getGrammarIDRule()); 
            pushFollow(FOLLOW_ruleGrammarID_in_entryRuleGrammarID138);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrammarID145); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:104:1: ruleGrammarID : ( ( rule__GrammarID__Group__0 ) ) ;
    public final void ruleGrammarID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:108:2: ( ( ( rule__GrammarID__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:109:1: ( ( rule__GrammarID__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:109:1: ( ( rule__GrammarID__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:110:1: ( rule__GrammarID__Group__0 )
            {
             before(grammarAccess.getGrammarIDAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:111:1: ( rule__GrammarID__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:111:2: rule__GrammarID__Group__0
            {
            pushFollow(FOLLOW_rule__GrammarID__Group__0_in_ruleGrammarID171);
            rule__GrammarID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammarID"


    // $ANTLR start "entryRuleTest"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:123:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:124:1: ( ruleTest EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:125:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest198);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:132:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:136:2: ( ( ( rule__Test__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:137:1: ( ( rule__Test__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:137:1: ( ( rule__Test__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:138:1: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:139:1: ( rule__Test__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:139:2: rule__Test__Group__0
            {
            pushFollow(FOLLOW_rule__Test__Group__0_in_ruleTest231);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleSubstitution"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:151:1: entryRuleSubstitution : ruleSubstitution EOF ;
    public final void entryRuleSubstitution() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:152:1: ( ruleSubstitution EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:153:1: ruleSubstitution EOF
            {
             before(grammarAccess.getSubstitutionRule()); 
            pushFollow(FOLLOW_ruleSubstitution_in_entryRuleSubstitution258);
            ruleSubstitution();

            state._fsp--;

             after(grammarAccess.getSubstitutionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstitution265); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubstitution"


    // $ANTLR start "ruleSubstitution"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:160:1: ruleSubstitution : ( ( rule__Substitution__Group__0 ) ) ;
    public final void ruleSubstitution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:164:2: ( ( ( rule__Substitution__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:165:1: ( ( rule__Substitution__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:165:1: ( ( rule__Substitution__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:166:1: ( rule__Substitution__Group__0 )
            {
             before(grammarAccess.getSubstitutionAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:167:1: ( rule__Substitution__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:167:2: rule__Substitution__Group__0
            {
            pushFollow(FOLLOW_rule__Substitution__Group__0_in_ruleSubstitution291);
            rule__Substitution__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubstitutionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstitution"


    // $ANTLR start "entryRuleSG"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:179:1: entryRuleSG : ruleSG EOF ;
    public final void entryRuleSG() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:180:1: ( ruleSG EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:181:1: ruleSG EOF
            {
             before(grammarAccess.getSGRule()); 
            pushFollow(FOLLOW_ruleSG_in_entryRuleSG318);
            ruleSG();

            state._fsp--;

             after(grammarAccess.getSGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSG325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSG"


    // $ANTLR start "ruleSG"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:188:1: ruleSG : ( ruleAlternative ) ;
    public final void ruleSG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:192:2: ( ( ruleAlternative ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:193:1: ( ruleAlternative )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:193:1: ( ruleAlternative )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:194:1: ruleAlternative
            {
             before(grammarAccess.getSGAccess().getAlternativeParserRuleCall()); 
            pushFollow(FOLLOW_ruleAlternative_in_ruleSG351);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getSGAccess().getAlternativeParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSG"


    // $ANTLR start "entryRuleAlternative"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:207:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:208:1: ( ruleAlternative EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:209:1: ruleAlternative EOF
            {
             before(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative377);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getAlternativeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative384); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:216:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:220:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:221:1: ( ( rule__Alternative__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:221:1: ( ( rule__Alternative__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:222:1: ( rule__Alternative__Group__0 )
            {
             before(grammarAccess.getAlternativeAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:223:1: ( rule__Alternative__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:223:2: rule__Alternative__Group__0
            {
            pushFollow(FOLLOW_rule__Alternative__Group__0_in_ruleAlternative410);
            rule__Alternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleSequence"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:235:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:236:1: ( ruleSequence EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:237:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence437);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence444); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:244:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:248:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:249:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:249:1: ( ( rule__Sequence__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:250:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:251:1: ( rule__Sequence__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:251:2: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0_in_ruleSequence470);
            rule__Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleCardinality"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:263:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:264:1: ( ruleCardinality EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:265:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality497);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality504); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:272:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:276:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:277:1: ( ( rule__Cardinality__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:277:1: ( ( rule__Cardinality__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:278:1: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:279:1: ( rule__Cardinality__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:279:2: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality530);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleOperated"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:291:1: entryRuleOperated : ruleOperated EOF ;
    public final void entryRuleOperated() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:292:1: ( ruleOperated EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:293:1: ruleOperated EOF
            {
             before(grammarAccess.getOperatedRule()); 
            pushFollow(FOLLOW_ruleOperated_in_entryRuleOperated557);
            ruleOperated();

            state._fsp--;

             after(grammarAccess.getOperatedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperated564); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperated"


    // $ANTLR start "ruleOperated"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:300:1: ruleOperated : ( ( rule__Operated__Alternatives ) ) ;
    public final void ruleOperated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:304:2: ( ( ( rule__Operated__Alternatives ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:305:1: ( ( rule__Operated__Alternatives ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:305:1: ( ( rule__Operated__Alternatives ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:306:1: ( rule__Operated__Alternatives )
            {
             before(grammarAccess.getOperatedAccess().getAlternatives()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:307:1: ( rule__Operated__Alternatives )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:307:2: rule__Operated__Alternatives
            {
            pushFollow(FOLLOW_rule__Operated__Alternatives_in_ruleOperated590);
            rule__Operated__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatedAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperated"


    // $ANTLR start "entryRuleTerminal"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:319:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:320:1: ( ruleTerminal EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:321:1: ruleTerminal EOF
            {
             before(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_ruleTerminal_in_entryRuleTerminal617);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal624); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:328:1: ruleTerminal : ( ( rule__Terminal__Alternatives ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:332:2: ( ( ( rule__Terminal__Alternatives ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:333:1: ( ( rule__Terminal__Alternatives ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:333:1: ( ( rule__Terminal__Alternatives ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:334:1: ( rule__Terminal__Alternatives )
            {
             before(grammarAccess.getTerminalAccess().getAlternatives()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:335:1: ( rule__Terminal__Alternatives )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:335:2: rule__Terminal__Alternatives
            {
            pushFollow(FOLLOW_rule__Terminal__Alternatives_in_ruleTerminal650);
            rule__Terminal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleParenthesizedElement"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:347:1: entryRuleParenthesizedElement : ruleParenthesizedElement EOF ;
    public final void entryRuleParenthesizedElement() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:348:1: ( ruleParenthesizedElement EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:349:1: ruleParenthesizedElement EOF
            {
             before(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement677);
            ruleParenthesizedElement();

            state._fsp--;

             after(grammarAccess.getParenthesizedElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedElement684); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:356:1: ruleParenthesizedElement : ( ( rule__ParenthesizedElement__Group__0 ) ) ;
    public final void ruleParenthesizedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:360:2: ( ( ( rule__ParenthesizedElement__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:361:1: ( ( rule__ParenthesizedElement__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:361:1: ( ( rule__ParenthesizedElement__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:362:1: ( rule__ParenthesizedElement__Group__0 )
            {
             before(grammarAccess.getParenthesizedElementAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:363:1: ( rule__ParenthesizedElement__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:363:2: rule__ParenthesizedElement__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__0_in_ruleParenthesizedElement710);
            rule__ParenthesizedElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesizedElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "rule__Cardinality__Alternatives_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:375:1: rule__Cardinality__Alternatives_1 : ( ( ( rule__Cardinality__Group_1_0__0 ) ) | ( ( rule__Cardinality__Group_1_1__0 ) ) | ( ( rule__Cardinality__Group_1_2__0 ) ) );
    public final void rule__Cardinality__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:379:1: ( ( ( rule__Cardinality__Group_1_0__0 ) ) | ( ( rule__Cardinality__Group_1_1__0 ) ) | ( ( rule__Cardinality__Group_1_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:380:1: ( ( rule__Cardinality__Group_1_0__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:380:1: ( ( rule__Cardinality__Group_1_0__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:381:1: ( rule__Cardinality__Group_1_0__0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getGroup_1_0()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:382:1: ( rule__Cardinality__Group_1_0__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:382:2: rule__Cardinality__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Group_1_0__0_in_rule__Cardinality__Alternatives_1746);
                    rule__Cardinality__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:386:6: ( ( rule__Cardinality__Group_1_1__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:386:6: ( ( rule__Cardinality__Group_1_1__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:387:1: ( rule__Cardinality__Group_1_1__0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getGroup_1_1()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:388:1: ( rule__Cardinality__Group_1_1__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:388:2: rule__Cardinality__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Group_1_1__0_in_rule__Cardinality__Alternatives_1764);
                    rule__Cardinality__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:392:6: ( ( rule__Cardinality__Group_1_2__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:392:6: ( ( rule__Cardinality__Group_1_2__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:393:1: ( rule__Cardinality__Group_1_2__0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getGroup_1_2()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:394:1: ( rule__Cardinality__Group_1_2__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:394:2: rule__Cardinality__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Group_1_2__0_in_rule__Cardinality__Alternatives_1782);
                    rule__Cardinality__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getGroup_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Alternatives_1"


    // $ANTLR start "rule__Operated__Alternatives"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:403:1: rule__Operated__Alternatives : ( ( ( rule__Operated__Group_0__0 ) ) | ( ( rule__Operated__Group_1__0 ) ) | ( ruleTerminal ) );
    public final void rule__Operated__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:407:1: ( ( ( rule__Operated__Group_0__0 ) ) | ( ( rule__Operated__Group_1__0 ) ) | ( ruleTerminal ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                alt3=2;
                }
                break;
            case RULE_STRING:
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:408:1: ( ( rule__Operated__Group_0__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:408:1: ( ( rule__Operated__Group_0__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:409:1: ( rule__Operated__Group_0__0 )
                    {
                     before(grammarAccess.getOperatedAccess().getGroup_0()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:410:1: ( rule__Operated__Group_0__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:410:2: rule__Operated__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Operated__Group_0__0_in_rule__Operated__Alternatives815);
                    rule__Operated__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatedAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:414:6: ( ( rule__Operated__Group_1__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:414:6: ( ( rule__Operated__Group_1__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:415:1: ( rule__Operated__Group_1__0 )
                    {
                     before(grammarAccess.getOperatedAccess().getGroup_1()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:416:1: ( rule__Operated__Group_1__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:416:2: rule__Operated__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Operated__Group_1__0_in_rule__Operated__Alternatives833);
                    rule__Operated__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatedAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:420:6: ( ruleTerminal )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:420:6: ( ruleTerminal )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:421:1: ruleTerminal
                    {
                     before(grammarAccess.getOperatedAccess().getTerminalParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTerminal_in_rule__Operated__Alternatives851);
                    ruleTerminal();

                    state._fsp--;

                     after(grammarAccess.getOperatedAccess().getTerminalParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Alternatives"


    // $ANTLR start "rule__Terminal__Alternatives"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:431:1: rule__Terminal__Alternatives : ( ( ( rule__Terminal__Group_0__0 ) ) | ( ( rule__Terminal__Group_1__0 ) ) | ( ruleParenthesizedElement ) );
    public final void rule__Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:435:1: ( ( ( rule__Terminal__Group_0__0 ) ) | ( ( rule__Terminal__Group_1__0 ) ) | ( ruleParenthesizedElement ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||LA4_1==RULE_STRING||(LA4_1>=18 && LA4_1<=24)||(LA4_1>=26 && LA4_1<=27)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==26) ) {
                alt4=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:436:1: ( ( rule__Terminal__Group_0__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:436:1: ( ( rule__Terminal__Group_0__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:437:1: ( rule__Terminal__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalAccess().getGroup_0()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:438:1: ( rule__Terminal__Group_0__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:438:2: rule__Terminal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Terminal__Group_0__0_in_rule__Terminal__Alternatives883);
                    rule__Terminal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:442:6: ( ( rule__Terminal__Group_1__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:442:6: ( ( rule__Terminal__Group_1__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:443:1: ( rule__Terminal__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalAccess().getGroup_1()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:444:1: ( rule__Terminal__Group_1__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:444:2: rule__Terminal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Terminal__Group_1__0_in_rule__Terminal__Alternatives901);
                    rule__Terminal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:448:6: ( ruleParenthesizedElement )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:448:6: ( ruleParenthesizedElement )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:449:1: ruleParenthesizedElement
                    {
                     before(grammarAccess.getTerminalAccess().getParenthesizedElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleParenthesizedElement_in_rule__Terminal__Alternatives919);
                    ruleParenthesizedElement();

                    state._fsp--;

                     after(grammarAccess.getTerminalAccess().getParenthesizedElementParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Alternatives"


    // $ANTLR start "rule__GrammarID__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:461:1: rule__GrammarID__Group__0 : rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1 ;
    public final void rule__GrammarID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:465:1: ( rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:466:2: rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1
            {
            pushFollow(FOLLOW_rule__GrammarID__Group__0__Impl_in_rule__GrammarID__Group__0949);
            rule__GrammarID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrammarID__Group__1_in_rule__GrammarID__Group__0952);
            rule__GrammarID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__0"


    // $ANTLR start "rule__GrammarID__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:473:1: rule__GrammarID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__GrammarID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:477:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:478:1: ( RULE_ID )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:478:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:479:1: RULE_ID
            {
             before(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrammarID__Group__0__Impl979); 
             after(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__0__Impl"


    // $ANTLR start "rule__GrammarID__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:490:1: rule__GrammarID__Group__1 : rule__GrammarID__Group__1__Impl ;
    public final void rule__GrammarID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:494:1: ( rule__GrammarID__Group__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:495:2: rule__GrammarID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GrammarID__Group__1__Impl_in_rule__GrammarID__Group__11008);
            rule__GrammarID__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__1"


    // $ANTLR start "rule__GrammarID__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:501:1: rule__GrammarID__Group__1__Impl : ( ( rule__GrammarID__Group_1__0 )* ) ;
    public final void rule__GrammarID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:505:1: ( ( ( rule__GrammarID__Group_1__0 )* ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:506:1: ( ( rule__GrammarID__Group_1__0 )* )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:506:1: ( ( rule__GrammarID__Group_1__0 )* )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:507:1: ( rule__GrammarID__Group_1__0 )*
            {
             before(grammarAccess.getGrammarIDAccess().getGroup_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:508:1: ( rule__GrammarID__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:508:2: rule__GrammarID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GrammarID__Group_1__0_in_rule__GrammarID__Group__1__Impl1035);
            	    rule__GrammarID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGrammarIDAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group__1__Impl"


    // $ANTLR start "rule__GrammarID__Group_1__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:522:1: rule__GrammarID__Group_1__0 : rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1 ;
    public final void rule__GrammarID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:526:1: ( rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:527:2: rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1
            {
            pushFollow(FOLLOW_rule__GrammarID__Group_1__0__Impl_in_rule__GrammarID__Group_1__01070);
            rule__GrammarID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrammarID__Group_1__1_in_rule__GrammarID__Group_1__01073);
            rule__GrammarID__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__0"


    // $ANTLR start "rule__GrammarID__Group_1__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:534:1: rule__GrammarID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__GrammarID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:538:1: ( ( '.' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:539:1: ( '.' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:539:1: ( '.' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:540:1: '.'
            {
             before(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__GrammarID__Group_1__0__Impl1101); 
             after(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__0__Impl"


    // $ANTLR start "rule__GrammarID__Group_1__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:553:1: rule__GrammarID__Group_1__1 : rule__GrammarID__Group_1__1__Impl ;
    public final void rule__GrammarID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:557:1: ( rule__GrammarID__Group_1__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:558:2: rule__GrammarID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GrammarID__Group_1__1__Impl_in_rule__GrammarID__Group_1__11132);
            rule__GrammarID__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__1"


    // $ANTLR start "rule__GrammarID__Group_1__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:564:1: rule__GrammarID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__GrammarID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:568:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:569:1: ( RULE_ID )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:569:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:570:1: RULE_ID
            {
             before(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrammarID__Group_1__1__Impl1159); 
             after(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrammarID__Group_1__1__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:585:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:589:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:590:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__01192);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__1_in_rule__Test__Group__01195);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:597:1: rule__Test__Group__0__Impl : ( 'test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:601:1: ( ( 'test' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:602:1: ( 'test' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:602:1: ( 'test' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:603:1: 'test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Test__Group__0__Impl1223); 
             after(grammarAccess.getTestAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:616:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:620:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:621:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__11254);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__2_in_rule__Test__Group__11257);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:628:1: rule__Test__Group__1__Impl : ( ( rule__Test__RefAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:632:1: ( ( ( rule__Test__RefAssignment_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:633:1: ( ( rule__Test__RefAssignment_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:633:1: ( ( rule__Test__RefAssignment_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:634:1: ( rule__Test__RefAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getRefAssignment_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:635:1: ( rule__Test__RefAssignment_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:635:2: rule__Test__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Test__RefAssignment_1_in_rule__Test__Group__1__Impl1284);
            rule__Test__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:645:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:649:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:650:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__21314);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__3_in_rule__Test__Group__21317);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:657:1: rule__Test__Group__2__Impl : ( ( rule__Test__Group_2__0 )? ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:661:1: ( ( ( rule__Test__Group_2__0 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:662:1: ( ( rule__Test__Group_2__0 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:662:1: ( ( rule__Test__Group_2__0 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:663:1: ( rule__Test__Group_2__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_2()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:664:1: ( rule__Test__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:664:2: rule__Test__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Test__Group_2__0_in_rule__Test__Group__2__Impl1344);
                    rule__Test__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:674:1: rule__Test__Group__3 : rule__Test__Group__3__Impl ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:678:1: ( rule__Test__Group__3__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:679:2: rule__Test__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__31375);
            rule__Test__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:685:1: rule__Test__Group__3__Impl : ( ( rule__Test__Group_3__0 )? ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:689:1: ( ( ( rule__Test__Group_3__0 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:690:1: ( ( rule__Test__Group_3__0 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:690:1: ( ( rule__Test__Group_3__0 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:691:1: ( rule__Test__Group_3__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_3()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:692:1: ( rule__Test__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:692:2: rule__Test__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Test__Group_3__0_in_rule__Test__Group__3__Impl1402);
                    rule__Test__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group_2__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:710:1: rule__Test__Group_2__0 : rule__Test__Group_2__0__Impl rule__Test__Group_2__1 ;
    public final void rule__Test__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:714:1: ( rule__Test__Group_2__0__Impl rule__Test__Group_2__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:715:2: rule__Test__Group_2__0__Impl rule__Test__Group_2__1
            {
            pushFollow(FOLLOW_rule__Test__Group_2__0__Impl_in_rule__Test__Group_2__01441);
            rule__Test__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group_2__1_in_rule__Test__Group_2__01444);
            rule__Test__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_2__0"


    // $ANTLR start "rule__Test__Group_2__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:722:1: rule__Test__Group_2__0__Impl : ( 'start' ) ;
    public final void rule__Test__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:726:1: ( ( 'start' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:727:1: ( 'start' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:727:1: ( 'start' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:728:1: 'start'
            {
             before(grammarAccess.getTestAccess().getStartKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__Test__Group_2__0__Impl1472); 
             after(grammarAccess.getTestAccess().getStartKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_2__0__Impl"


    // $ANTLR start "rule__Test__Group_2__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:741:1: rule__Test__Group_2__1 : rule__Test__Group_2__1__Impl ;
    public final void rule__Test__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:745:1: ( rule__Test__Group_2__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:746:2: rule__Test__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group_2__1__Impl_in_rule__Test__Group_2__11503);
            rule__Test__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_2__1"


    // $ANTLR start "rule__Test__Group_2__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:752:1: rule__Test__Group_2__1__Impl : ( ( rule__Test__RuleAssignment_2_1 ) ) ;
    public final void rule__Test__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:756:1: ( ( ( rule__Test__RuleAssignment_2_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:757:1: ( ( rule__Test__RuleAssignment_2_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:757:1: ( ( rule__Test__RuleAssignment_2_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:758:1: ( rule__Test__RuleAssignment_2_1 )
            {
             before(grammarAccess.getTestAccess().getRuleAssignment_2_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:759:1: ( rule__Test__RuleAssignment_2_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:759:2: rule__Test__RuleAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Test__RuleAssignment_2_1_in_rule__Test__Group_2__1__Impl1530);
            rule__Test__RuleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getRuleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_2__1__Impl"


    // $ANTLR start "rule__Test__Group_3__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:773:1: rule__Test__Group_3__0 : rule__Test__Group_3__0__Impl rule__Test__Group_3__1 ;
    public final void rule__Test__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:777:1: ( rule__Test__Group_3__0__Impl rule__Test__Group_3__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:778:2: rule__Test__Group_3__0__Impl rule__Test__Group_3__1
            {
            pushFollow(FOLLOW_rule__Test__Group_3__0__Impl_in_rule__Test__Group_3__01564);
            rule__Test__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group_3__1_in_rule__Test__Group_3__01567);
            rule__Test__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__0"


    // $ANTLR start "rule__Test__Group_3__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:785:1: rule__Test__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Test__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:789:1: ( ( '{' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:790:1: ( '{' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:790:1: ( '{' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:791:1: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__Test__Group_3__0__Impl1595); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__0__Impl"


    // $ANTLR start "rule__Test__Group_3__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:804:1: rule__Test__Group_3__1 : rule__Test__Group_3__1__Impl rule__Test__Group_3__2 ;
    public final void rule__Test__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:808:1: ( rule__Test__Group_3__1__Impl rule__Test__Group_3__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:809:2: rule__Test__Group_3__1__Impl rule__Test__Group_3__2
            {
            pushFollow(FOLLOW_rule__Test__Group_3__1__Impl_in_rule__Test__Group_3__11626);
            rule__Test__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group_3__2_in_rule__Test__Group_3__11629);
            rule__Test__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__1"


    // $ANTLR start "rule__Test__Group_3__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:816:1: rule__Test__Group_3__1__Impl : ( ( rule__Test__SubstitutionsAssignment_3_1 ) ) ;
    public final void rule__Test__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:820:1: ( ( ( rule__Test__SubstitutionsAssignment_3_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:821:1: ( ( rule__Test__SubstitutionsAssignment_3_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:821:1: ( ( rule__Test__SubstitutionsAssignment_3_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:822:1: ( rule__Test__SubstitutionsAssignment_3_1 )
            {
             before(grammarAccess.getTestAccess().getSubstitutionsAssignment_3_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:823:1: ( rule__Test__SubstitutionsAssignment_3_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:823:2: rule__Test__SubstitutionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Test__SubstitutionsAssignment_3_1_in_rule__Test__Group_3__1__Impl1656);
            rule__Test__SubstitutionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getSubstitutionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__1__Impl"


    // $ANTLR start "rule__Test__Group_3__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:833:1: rule__Test__Group_3__2 : rule__Test__Group_3__2__Impl ;
    public final void rule__Test__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:837:1: ( rule__Test__Group_3__2__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:838:2: rule__Test__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group_3__2__Impl_in_rule__Test__Group_3__21686);
            rule__Test__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__2"


    // $ANTLR start "rule__Test__Group_3__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:844:1: rule__Test__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Test__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:848:1: ( ( '}' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:849:1: ( '}' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:849:1: ( '}' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:850:1: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,15,FOLLOW_15_in_rule__Test__Group_3__2__Impl1714); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_3__2__Impl"


    // $ANTLR start "rule__Substitution__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:869:1: rule__Substitution__Group__0 : rule__Substitution__Group__0__Impl rule__Substitution__Group__1 ;
    public final void rule__Substitution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:873:1: ( rule__Substitution__Group__0__Impl rule__Substitution__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:874:2: rule__Substitution__Group__0__Impl rule__Substitution__Group__1
            {
            pushFollow(FOLLOW_rule__Substitution__Group__0__Impl_in_rule__Substitution__Group__01751);
            rule__Substitution__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Substitution__Group__1_in_rule__Substitution__Group__01754);
            rule__Substitution__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__0"


    // $ANTLR start "rule__Substitution__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:881:1: rule__Substitution__Group__0__Impl : ( 'substitute' ) ;
    public final void rule__Substitution__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:885:1: ( ( 'substitute' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:886:1: ( 'substitute' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:886:1: ( 'substitute' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:887:1: 'substitute'
            {
             before(grammarAccess.getSubstitutionAccess().getSubstituteKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Substitution__Group__0__Impl1782); 
             after(grammarAccess.getSubstitutionAccess().getSubstituteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__0__Impl"


    // $ANTLR start "rule__Substitution__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:900:1: rule__Substitution__Group__1 : rule__Substitution__Group__1__Impl rule__Substitution__Group__2 ;
    public final void rule__Substitution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:904:1: ( rule__Substitution__Group__1__Impl rule__Substitution__Group__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:905:2: rule__Substitution__Group__1__Impl rule__Substitution__Group__2
            {
            pushFollow(FOLLOW_rule__Substitution__Group__1__Impl_in_rule__Substitution__Group__11813);
            rule__Substitution__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Substitution__Group__2_in_rule__Substitution__Group__11816);
            rule__Substitution__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__1"


    // $ANTLR start "rule__Substitution__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:912:1: rule__Substitution__Group__1__Impl : ( ( rule__Substitution__RuleAssignment_1 ) ) ;
    public final void rule__Substitution__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:916:1: ( ( ( rule__Substitution__RuleAssignment_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:917:1: ( ( rule__Substitution__RuleAssignment_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:917:1: ( ( rule__Substitution__RuleAssignment_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:918:1: ( rule__Substitution__RuleAssignment_1 )
            {
             before(grammarAccess.getSubstitutionAccess().getRuleAssignment_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:919:1: ( rule__Substitution__RuleAssignment_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:919:2: rule__Substitution__RuleAssignment_1
            {
            pushFollow(FOLLOW_rule__Substitution__RuleAssignment_1_in_rule__Substitution__Group__1__Impl1843);
            rule__Substitution__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubstitutionAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__1__Impl"


    // $ANTLR start "rule__Substitution__Group__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:929:1: rule__Substitution__Group__2 : rule__Substitution__Group__2__Impl rule__Substitution__Group__3 ;
    public final void rule__Substitution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:933:1: ( rule__Substitution__Group__2__Impl rule__Substitution__Group__3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:934:2: rule__Substitution__Group__2__Impl rule__Substitution__Group__3
            {
            pushFollow(FOLLOW_rule__Substitution__Group__2__Impl_in_rule__Substitution__Group__21873);
            rule__Substitution__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Substitution__Group__3_in_rule__Substitution__Group__21876);
            rule__Substitution__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__2"


    // $ANTLR start "rule__Substitution__Group__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:941:1: rule__Substitution__Group__2__Impl : ( 'with' ) ;
    public final void rule__Substitution__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:945:1: ( ( 'with' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:946:1: ( 'with' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:946:1: ( 'with' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:947:1: 'with'
            {
             before(grammarAccess.getSubstitutionAccess().getWithKeyword_2()); 
            match(input,17,FOLLOW_17_in_rule__Substitution__Group__2__Impl1904); 
             after(grammarAccess.getSubstitutionAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__2__Impl"


    // $ANTLR start "rule__Substitution__Group__3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:960:1: rule__Substitution__Group__3 : rule__Substitution__Group__3__Impl rule__Substitution__Group__4 ;
    public final void rule__Substitution__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:964:1: ( rule__Substitution__Group__3__Impl rule__Substitution__Group__4 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:965:2: rule__Substitution__Group__3__Impl rule__Substitution__Group__4
            {
            pushFollow(FOLLOW_rule__Substitution__Group__3__Impl_in_rule__Substitution__Group__31935);
            rule__Substitution__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Substitution__Group__4_in_rule__Substitution__Group__31938);
            rule__Substitution__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__3"


    // $ANTLR start "rule__Substitution__Group__3__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:972:1: rule__Substitution__Group__3__Impl : ( ( rule__Substitution__SubstitutionAssignment_3 ) ) ;
    public final void rule__Substitution__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:976:1: ( ( ( rule__Substitution__SubstitutionAssignment_3 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:977:1: ( ( rule__Substitution__SubstitutionAssignment_3 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:977:1: ( ( rule__Substitution__SubstitutionAssignment_3 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:978:1: ( rule__Substitution__SubstitutionAssignment_3 )
            {
             before(grammarAccess.getSubstitutionAccess().getSubstitutionAssignment_3()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:979:1: ( rule__Substitution__SubstitutionAssignment_3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:979:2: rule__Substitution__SubstitutionAssignment_3
            {
            pushFollow(FOLLOW_rule__Substitution__SubstitutionAssignment_3_in_rule__Substitution__Group__3__Impl1965);
            rule__Substitution__SubstitutionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubstitutionAccess().getSubstitutionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__3__Impl"


    // $ANTLR start "rule__Substitution__Group__4"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:989:1: rule__Substitution__Group__4 : rule__Substitution__Group__4__Impl ;
    public final void rule__Substitution__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:993:1: ( rule__Substitution__Group__4__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:994:2: rule__Substitution__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Substitution__Group__4__Impl_in_rule__Substitution__Group__41995);
            rule__Substitution__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__4"


    // $ANTLR start "rule__Substitution__Group__4__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1000:1: rule__Substitution__Group__4__Impl : ( ';' ) ;
    public final void rule__Substitution__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1004:1: ( ( ';' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1005:1: ( ';' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1005:1: ( ';' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1006:1: ';'
            {
             before(grammarAccess.getSubstitutionAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Substitution__Group__4__Impl2023); 
             after(grammarAccess.getSubstitutionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__Group__4__Impl"


    // $ANTLR start "rule__Alternative__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1029:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1033:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1034:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_rule__Alternative__Group__0__Impl_in_rule__Alternative__Group__02064);
            rule__Alternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group__1_in_rule__Alternative__Group__02067);
            rule__Alternative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__0"


    // $ANTLR start "rule__Alternative__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1041:1: rule__Alternative__Group__0__Impl : ( ruleSequence ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1045:1: ( ( ruleSequence ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1046:1: ( ruleSequence )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1046:1: ( ruleSequence )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1047:1: ruleSequence
            {
             before(grammarAccess.getAlternativeAccess().getSequenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Alternative__Group__0__Impl2094);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getSequenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__0__Impl"


    // $ANTLR start "rule__Alternative__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1058:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1062:1: ( rule__Alternative__Group__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1063:2: rule__Alternative__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Alternative__Group__1__Impl_in_rule__Alternative__Group__12123);
            rule__Alternative__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__1"


    // $ANTLR start "rule__Alternative__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1069:1: rule__Alternative__Group__1__Impl : ( ( rule__Alternative__Group_1__0 )? ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1073:1: ( ( ( rule__Alternative__Group_1__0 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1074:1: ( ( rule__Alternative__Group_1__0 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1074:1: ( ( rule__Alternative__Group_1__0 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1075:1: ( rule__Alternative__Group_1__0 )?
            {
             before(grammarAccess.getAlternativeAccess().getGroup_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1076:1: ( rule__Alternative__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1076:2: rule__Alternative__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Alternative__Group_1__0_in_rule__Alternative__Group__1__Impl2150);
                    rule__Alternative__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlternativeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group__1__Impl"


    // $ANTLR start "rule__Alternative__Group_1__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1090:1: rule__Alternative__Group_1__0 : rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1 ;
    public final void rule__Alternative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1094:1: ( rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1095:2: rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1
            {
            pushFollow(FOLLOW_rule__Alternative__Group_1__0__Impl_in_rule__Alternative__Group_1__02185);
            rule__Alternative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group_1__1_in_rule__Alternative__Group_1__02188);
            rule__Alternative__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group_1__0"


    // $ANTLR start "rule__Alternative__Group_1__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1102:1: rule__Alternative__Group_1__0__Impl : ( () ) ;
    public final void rule__Alternative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1106:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1107:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1107:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1108:1: ()
            {
             before(grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1109:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1111:1: 
            {
            }

             after(grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group_1__0__Impl"


    // $ANTLR start "rule__Alternative__Group_1__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1121:1: rule__Alternative__Group_1__1 : rule__Alternative__Group_1__1__Impl rule__Alternative__Group_1__2 ;
    public final void rule__Alternative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1125:1: ( rule__Alternative__Group_1__1__Impl rule__Alternative__Group_1__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1126:2: rule__Alternative__Group_1__1__Impl rule__Alternative__Group_1__2
            {
            pushFollow(FOLLOW_rule__Alternative__Group_1__1__Impl_in_rule__Alternative__Group_1__12246);
            rule__Alternative__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group_1__2_in_rule__Alternative__Group_1__12249);
            rule__Alternative__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group_1__1"


    // $ANTLR start "rule__Alternative__Group_1__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1133:1: rule__Alternative__Group_1__1__Impl : ( '|' ) ;
    public final void rule__Alternative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1137:1: ( ( '|' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1138:1: ( '|' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1138:1: ( '|' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1139:1: '|'
            {
             before(grammarAccess.getAlternativeAccess().getVerticalLineKeyword_1_1()); 
            match(input,19,FOLLOW_19_in_rule__Alternative__Group_1__1__Impl2277); 
             after(grammarAccess.getAlternativeAccess().getVerticalLineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group_1__1__Impl"


    // $ANTLR start "rule__Alternative__Group_1__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1152:1: rule__Alternative__Group_1__2 : rule__Alternative__Group_1__2__Impl ;
    public final void rule__Alternative__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1156:1: ( rule__Alternative__Group_1__2__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1157:2: rule__Alternative__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Alternative__Group_1__2__Impl_in_rule__Alternative__Group_1__22308);
            rule__Alternative__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group_1__2"


    // $ANTLR start "rule__Alternative__Group_1__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1163:1: rule__Alternative__Group_1__2__Impl : ( ( rule__Alternative__RightAssignment_1_2 ) ) ;
    public final void rule__Alternative__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1167:1: ( ( ( rule__Alternative__RightAssignment_1_2 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1168:1: ( ( rule__Alternative__RightAssignment_1_2 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1168:1: ( ( rule__Alternative__RightAssignment_1_2 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1169:1: ( rule__Alternative__RightAssignment_1_2 )
            {
             before(grammarAccess.getAlternativeAccess().getRightAssignment_1_2()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1170:1: ( rule__Alternative__RightAssignment_1_2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1170:2: rule__Alternative__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Alternative__RightAssignment_1_2_in_rule__Alternative__Group_1__2__Impl2335);
            rule__Alternative__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__Group_1__2__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1186:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1190:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1191:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02371);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02374);
            rule__Sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1198:1: rule__Sequence__Group__0__Impl : ( ruleCardinality ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1202:1: ( ( ruleCardinality ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1203:1: ( ruleCardinality )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1203:1: ( ruleCardinality )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1204:1: ruleCardinality
            {
             before(grammarAccess.getSequenceAccess().getCardinalityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Sequence__Group__0__Impl2401);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getCardinalityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1215:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1219:1: ( rule__Sequence__Group__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1220:2: rule__Sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12430);
            rule__Sequence__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1226:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__Group_1__0 )? ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1230:1: ( ( ( rule__Sequence__Group_1__0 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1231:1: ( ( rule__Sequence__Group_1__0 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1231:1: ( ( rule__Sequence__Group_1__0 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1232:1: ( rule__Sequence__Group_1__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1233:1: ( rule__Sequence__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||(LA9_0>=23 && LA9_0<=24)||LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1233:2: rule__Sequence__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_1__0_in_rule__Sequence__Group__1__Impl2457);
                    rule__Sequence__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group_1__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1247:1: rule__Sequence__Group_1__0 : rule__Sequence__Group_1__0__Impl rule__Sequence__Group_1__1 ;
    public final void rule__Sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1251:1: ( rule__Sequence__Group_1__0__Impl rule__Sequence__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1252:2: rule__Sequence__Group_1__0__Impl rule__Sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_1__0__Impl_in_rule__Sequence__Group_1__02492);
            rule__Sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_1__1_in_rule__Sequence__Group_1__02495);
            rule__Sequence__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_1__0"


    // $ANTLR start "rule__Sequence__Group_1__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1259:1: rule__Sequence__Group_1__0__Impl : ( () ) ;
    public final void rule__Sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1263:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1264:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1264:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1265:1: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1266:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1268:1: 
            {
            }

             after(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Sequence__Group_1__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1278:1: rule__Sequence__Group_1__1 : rule__Sequence__Group_1__1__Impl ;
    public final void rule__Sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1282:1: ( rule__Sequence__Group_1__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1283:2: rule__Sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_1__1__Impl_in_rule__Sequence__Group_1__12553);
            rule__Sequence__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_1__1"


    // $ANTLR start "rule__Sequence__Group_1__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1289:1: rule__Sequence__Group_1__1__Impl : ( ( rule__Sequence__RightAssignment_1_1 ) ) ;
    public final void rule__Sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1293:1: ( ( ( rule__Sequence__RightAssignment_1_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1294:1: ( ( rule__Sequence__RightAssignment_1_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1294:1: ( ( rule__Sequence__RightAssignment_1_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1295:1: ( rule__Sequence__RightAssignment_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getRightAssignment_1_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1296:1: ( rule__Sequence__RightAssignment_1_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1296:2: rule__Sequence__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__RightAssignment_1_1_in_rule__Sequence__Group_1__1__Impl2580);
            rule__Sequence__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1310:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1314:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1315:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__02614);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__02617);
            rule__Cardinality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1322:1: rule__Cardinality__Group__0__Impl : ( ruleOperated ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1326:1: ( ( ruleOperated ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1327:1: ( ruleOperated )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1327:1: ( ruleOperated )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1328:1: ruleOperated
            {
             before(grammarAccess.getCardinalityAccess().getOperatedParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOperated_in_rule__Cardinality__Group__0__Impl2644);
            ruleOperated();

            state._fsp--;

             after(grammarAccess.getCardinalityAccess().getOperatedParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1339:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1343:1: ( rule__Cardinality__Group__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1344:2: rule__Cardinality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__12673);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1350:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Alternatives_1 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1354:1: ( ( ( rule__Cardinality__Alternatives_1 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1355:1: ( ( rule__Cardinality__Alternatives_1 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1355:1: ( ( rule__Cardinality__Alternatives_1 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1356:1: ( rule__Cardinality__Alternatives_1 )?
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1357:1: ( rule__Cardinality__Alternatives_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=20 && LA10_0<=22)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1357:2: rule__Cardinality__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Alternatives_1_in_rule__Cardinality__Group__1__Impl2700);
                    rule__Cardinality__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCardinalityAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group_1_0__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1371:1: rule__Cardinality__Group_1_0__0 : rule__Cardinality__Group_1_0__0__Impl rule__Cardinality__Group_1_0__1 ;
    public final void rule__Cardinality__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1375:1: ( rule__Cardinality__Group_1_0__0__Impl rule__Cardinality__Group_1_0__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1376:2: rule__Cardinality__Group_1_0__0__Impl rule__Cardinality__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_0__0__Impl_in_rule__Cardinality__Group_1_0__02735);
            rule__Cardinality__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1_0__1_in_rule__Cardinality__Group_1_0__02738);
            rule__Cardinality__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_0__0"


    // $ANTLR start "rule__Cardinality__Group_1_0__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1383:1: rule__Cardinality__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Cardinality__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1387:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1388:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1388:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1389:1: ()
            {
             before(grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1390:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1392:1: 
            {
            }

             after(grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_0__0__Impl"


    // $ANTLR start "rule__Cardinality__Group_1_0__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1402:1: rule__Cardinality__Group_1_0__1 : rule__Cardinality__Group_1_0__1__Impl ;
    public final void rule__Cardinality__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1406:1: ( rule__Cardinality__Group_1_0__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1407:2: rule__Cardinality__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_0__1__Impl_in_rule__Cardinality__Group_1_0__12796);
            rule__Cardinality__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_0__1"


    // $ANTLR start "rule__Cardinality__Group_1_0__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1413:1: rule__Cardinality__Group_1_0__1__Impl : ( '?' ) ;
    public final void rule__Cardinality__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1417:1: ( ( '?' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1418:1: ( '?' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1418:1: ( '?' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1419:1: '?'
            {
             before(grammarAccess.getCardinalityAccess().getQuestionMarkKeyword_1_0_1()); 
            match(input,20,FOLLOW_20_in_rule__Cardinality__Group_1_0__1__Impl2824); 
             after(grammarAccess.getCardinalityAccess().getQuestionMarkKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_0__1__Impl"


    // $ANTLR start "rule__Cardinality__Group_1_1__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1436:1: rule__Cardinality__Group_1_1__0 : rule__Cardinality__Group_1_1__0__Impl rule__Cardinality__Group_1_1__1 ;
    public final void rule__Cardinality__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1440:1: ( rule__Cardinality__Group_1_1__0__Impl rule__Cardinality__Group_1_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1441:2: rule__Cardinality__Group_1_1__0__Impl rule__Cardinality__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_1__0__Impl_in_rule__Cardinality__Group_1_1__02859);
            rule__Cardinality__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1_1__1_in_rule__Cardinality__Group_1_1__02862);
            rule__Cardinality__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_1__0"


    // $ANTLR start "rule__Cardinality__Group_1_1__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1448:1: rule__Cardinality__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Cardinality__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1452:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1453:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1453:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1454:1: ()
            {
             before(grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1455:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1457:1: 
            {
            }

             after(grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_1__0__Impl"


    // $ANTLR start "rule__Cardinality__Group_1_1__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1467:1: rule__Cardinality__Group_1_1__1 : rule__Cardinality__Group_1_1__1__Impl ;
    public final void rule__Cardinality__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1471:1: ( rule__Cardinality__Group_1_1__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1472:2: rule__Cardinality__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_1__1__Impl_in_rule__Cardinality__Group_1_1__12920);
            rule__Cardinality__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_1__1"


    // $ANTLR start "rule__Cardinality__Group_1_1__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1478:1: rule__Cardinality__Group_1_1__1__Impl : ( '*' ) ;
    public final void rule__Cardinality__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1482:1: ( ( '*' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1483:1: ( '*' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1483:1: ( '*' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1484:1: '*'
            {
             before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_1_1()); 
            match(input,21,FOLLOW_21_in_rule__Cardinality__Group_1_1__1__Impl2948); 
             after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_1__1__Impl"


    // $ANTLR start "rule__Cardinality__Group_1_2__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1501:1: rule__Cardinality__Group_1_2__0 : rule__Cardinality__Group_1_2__0__Impl rule__Cardinality__Group_1_2__1 ;
    public final void rule__Cardinality__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1505:1: ( rule__Cardinality__Group_1_2__0__Impl rule__Cardinality__Group_1_2__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1506:2: rule__Cardinality__Group_1_2__0__Impl rule__Cardinality__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_2__0__Impl_in_rule__Cardinality__Group_1_2__02983);
            rule__Cardinality__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1_2__1_in_rule__Cardinality__Group_1_2__02986);
            rule__Cardinality__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_2__0"


    // $ANTLR start "rule__Cardinality__Group_1_2__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1513:1: rule__Cardinality__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Cardinality__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1517:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1518:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1518:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1519:1: ()
            {
             before(grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1520:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1522:1: 
            {
            }

             after(grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_2__0__Impl"


    // $ANTLR start "rule__Cardinality__Group_1_2__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1532:1: rule__Cardinality__Group_1_2__1 : rule__Cardinality__Group_1_2__1__Impl ;
    public final void rule__Cardinality__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1536:1: ( rule__Cardinality__Group_1_2__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1537:2: rule__Cardinality__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_2__1__Impl_in_rule__Cardinality__Group_1_2__13044);
            rule__Cardinality__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_2__1"


    // $ANTLR start "rule__Cardinality__Group_1_2__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1543:1: rule__Cardinality__Group_1_2__1__Impl : ( '+' ) ;
    public final void rule__Cardinality__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1547:1: ( ( '+' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1548:1: ( '+' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1548:1: ( '+' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1549:1: '+'
            {
             before(grammarAccess.getCardinalityAccess().getPlusSignKeyword_1_2_1()); 
            match(input,22,FOLLOW_22_in_rule__Cardinality__Group_1_2__1__Impl3072); 
             after(grammarAccess.getCardinalityAccess().getPlusSignKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group_1_2__1__Impl"


    // $ANTLR start "rule__Operated__Group_0__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1566:1: rule__Operated__Group_0__0 : rule__Operated__Group_0__0__Impl rule__Operated__Group_0__1 ;
    public final void rule__Operated__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1570:1: ( rule__Operated__Group_0__0__Impl rule__Operated__Group_0__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1571:2: rule__Operated__Group_0__0__Impl rule__Operated__Group_0__1
            {
            pushFollow(FOLLOW_rule__Operated__Group_0__0__Impl_in_rule__Operated__Group_0__03107);
            rule__Operated__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operated__Group_0__1_in_rule__Operated__Group_0__03110);
            rule__Operated__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_0__0"


    // $ANTLR start "rule__Operated__Group_0__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1578:1: rule__Operated__Group_0__0__Impl : ( '->' ) ;
    public final void rule__Operated__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1582:1: ( ( '->' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1583:1: ( '->' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1583:1: ( '->' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1584:1: '->'
            {
             before(grammarAccess.getOperatedAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__Operated__Group_0__0__Impl3138); 
             after(grammarAccess.getOperatedAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_0__0__Impl"


    // $ANTLR start "rule__Operated__Group_0__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1597:1: rule__Operated__Group_0__1 : rule__Operated__Group_0__1__Impl rule__Operated__Group_0__2 ;
    public final void rule__Operated__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1601:1: ( rule__Operated__Group_0__1__Impl rule__Operated__Group_0__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1602:2: rule__Operated__Group_0__1__Impl rule__Operated__Group_0__2
            {
            pushFollow(FOLLOW_rule__Operated__Group_0__1__Impl_in_rule__Operated__Group_0__13169);
            rule__Operated__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operated__Group_0__2_in_rule__Operated__Group_0__13172);
            rule__Operated__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_0__1"


    // $ANTLR start "rule__Operated__Group_0__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1609:1: rule__Operated__Group_0__1__Impl : ( () ) ;
    public final void rule__Operated__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1613:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1614:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1614:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1615:1: ()
            {
             before(grammarAccess.getOperatedAccess().getUntilAction_0_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1616:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1618:1: 
            {
            }

             after(grammarAccess.getOperatedAccess().getUntilAction_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_0__1__Impl"


    // $ANTLR start "rule__Operated__Group_0__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1628:1: rule__Operated__Group_0__2 : rule__Operated__Group_0__2__Impl ;
    public final void rule__Operated__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1632:1: ( rule__Operated__Group_0__2__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1633:2: rule__Operated__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Operated__Group_0__2__Impl_in_rule__Operated__Group_0__23230);
            rule__Operated__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_0__2"


    // $ANTLR start "rule__Operated__Group_0__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1639:1: rule__Operated__Group_0__2__Impl : ( ( rule__Operated__OfAssignment_0_2 ) ) ;
    public final void rule__Operated__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1643:1: ( ( ( rule__Operated__OfAssignment_0_2 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1644:1: ( ( rule__Operated__OfAssignment_0_2 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1644:1: ( ( rule__Operated__OfAssignment_0_2 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1645:1: ( rule__Operated__OfAssignment_0_2 )
            {
             before(grammarAccess.getOperatedAccess().getOfAssignment_0_2()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1646:1: ( rule__Operated__OfAssignment_0_2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1646:2: rule__Operated__OfAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Operated__OfAssignment_0_2_in_rule__Operated__Group_0__2__Impl3257);
            rule__Operated__OfAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getOperatedAccess().getOfAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_0__2__Impl"


    // $ANTLR start "rule__Operated__Group_1__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1662:1: rule__Operated__Group_1__0 : rule__Operated__Group_1__0__Impl rule__Operated__Group_1__1 ;
    public final void rule__Operated__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1666:1: ( rule__Operated__Group_1__0__Impl rule__Operated__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1667:2: rule__Operated__Group_1__0__Impl rule__Operated__Group_1__1
            {
            pushFollow(FOLLOW_rule__Operated__Group_1__0__Impl_in_rule__Operated__Group_1__03293);
            rule__Operated__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operated__Group_1__1_in_rule__Operated__Group_1__03296);
            rule__Operated__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_1__0"


    // $ANTLR start "rule__Operated__Group_1__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1674:1: rule__Operated__Group_1__0__Impl : ( '!' ) ;
    public final void rule__Operated__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1678:1: ( ( '!' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1679:1: ( '!' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1679:1: ( '!' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1680:1: '!'
            {
             before(grammarAccess.getOperatedAccess().getExclamationMarkKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Operated__Group_1__0__Impl3324); 
             after(grammarAccess.getOperatedAccess().getExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_1__0__Impl"


    // $ANTLR start "rule__Operated__Group_1__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1693:1: rule__Operated__Group_1__1 : rule__Operated__Group_1__1__Impl rule__Operated__Group_1__2 ;
    public final void rule__Operated__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1697:1: ( rule__Operated__Group_1__1__Impl rule__Operated__Group_1__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1698:2: rule__Operated__Group_1__1__Impl rule__Operated__Group_1__2
            {
            pushFollow(FOLLOW_rule__Operated__Group_1__1__Impl_in_rule__Operated__Group_1__13355);
            rule__Operated__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operated__Group_1__2_in_rule__Operated__Group_1__13358);
            rule__Operated__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_1__1"


    // $ANTLR start "rule__Operated__Group_1__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1705:1: rule__Operated__Group_1__1__Impl : ( () ) ;
    public final void rule__Operated__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1709:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1710:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1710:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1711:1: ()
            {
             before(grammarAccess.getOperatedAccess().getNegationAction_1_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1712:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1714:1: 
            {
            }

             after(grammarAccess.getOperatedAccess().getNegationAction_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_1__1__Impl"


    // $ANTLR start "rule__Operated__Group_1__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1724:1: rule__Operated__Group_1__2 : rule__Operated__Group_1__2__Impl ;
    public final void rule__Operated__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1728:1: ( rule__Operated__Group_1__2__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1729:2: rule__Operated__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Operated__Group_1__2__Impl_in_rule__Operated__Group_1__23416);
            rule__Operated__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_1__2"


    // $ANTLR start "rule__Operated__Group_1__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1735:1: rule__Operated__Group_1__2__Impl : ( ( rule__Operated__OfAssignment_1_2 ) ) ;
    public final void rule__Operated__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1739:1: ( ( ( rule__Operated__OfAssignment_1_2 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1740:1: ( ( rule__Operated__OfAssignment_1_2 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1740:1: ( ( rule__Operated__OfAssignment_1_2 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1741:1: ( rule__Operated__OfAssignment_1_2 )
            {
             before(grammarAccess.getOperatedAccess().getOfAssignment_1_2()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1742:1: ( rule__Operated__OfAssignment_1_2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1742:2: rule__Operated__OfAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Operated__OfAssignment_1_2_in_rule__Operated__Group_1__2__Impl3443);
            rule__Operated__OfAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOperatedAccess().getOfAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__Group_1__2__Impl"


    // $ANTLR start "rule__Terminal__Group_0__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1758:1: rule__Terminal__Group_0__0 : rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1 ;
    public final void rule__Terminal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1762:1: ( rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1763:2: rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Terminal__Group_0__0__Impl_in_rule__Terminal__Group_0__03479);
            rule__Terminal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal__Group_0__1_in_rule__Terminal__Group_0__03482);
            rule__Terminal__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__0"


    // $ANTLR start "rule__Terminal__Group_0__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1770:1: rule__Terminal__Group_0__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1774:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1775:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1775:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1776:1: ()
            {
             before(grammarAccess.getTerminalAccess().getRangeAction_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1777:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1779:1: 
            {
            }

             after(grammarAccess.getTerminalAccess().getRangeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__0__Impl"


    // $ANTLR start "rule__Terminal__Group_0__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1789:1: rule__Terminal__Group_0__1 : rule__Terminal__Group_0__1__Impl rule__Terminal__Group_0__2 ;
    public final void rule__Terminal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1793:1: ( rule__Terminal__Group_0__1__Impl rule__Terminal__Group_0__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1794:2: rule__Terminal__Group_0__1__Impl rule__Terminal__Group_0__2
            {
            pushFollow(FOLLOW_rule__Terminal__Group_0__1__Impl_in_rule__Terminal__Group_0__13540);
            rule__Terminal__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal__Group_0__2_in_rule__Terminal__Group_0__13543);
            rule__Terminal__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__1"


    // $ANTLR start "rule__Terminal__Group_0__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1801:1: rule__Terminal__Group_0__1__Impl : ( ( rule__Terminal__MinAssignment_0_1 ) ) ;
    public final void rule__Terminal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1805:1: ( ( ( rule__Terminal__MinAssignment_0_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1806:1: ( ( rule__Terminal__MinAssignment_0_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1806:1: ( ( rule__Terminal__MinAssignment_0_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1807:1: ( rule__Terminal__MinAssignment_0_1 )
            {
             before(grammarAccess.getTerminalAccess().getMinAssignment_0_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1808:1: ( rule__Terminal__MinAssignment_0_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1808:2: rule__Terminal__MinAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Terminal__MinAssignment_0_1_in_rule__Terminal__Group_0__1__Impl3570);
            rule__Terminal__MinAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getMinAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__1__Impl"


    // $ANTLR start "rule__Terminal__Group_0__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1818:1: rule__Terminal__Group_0__2 : rule__Terminal__Group_0__2__Impl rule__Terminal__Group_0__3 ;
    public final void rule__Terminal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1822:1: ( rule__Terminal__Group_0__2__Impl rule__Terminal__Group_0__3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1823:2: rule__Terminal__Group_0__2__Impl rule__Terminal__Group_0__3
            {
            pushFollow(FOLLOW_rule__Terminal__Group_0__2__Impl_in_rule__Terminal__Group_0__23600);
            rule__Terminal__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal__Group_0__3_in_rule__Terminal__Group_0__23603);
            rule__Terminal__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__2"


    // $ANTLR start "rule__Terminal__Group_0__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1830:1: rule__Terminal__Group_0__2__Impl : ( '..' ) ;
    public final void rule__Terminal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1834:1: ( ( '..' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1835:1: ( '..' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1835:1: ( '..' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1836:1: '..'
            {
             before(grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_0_2()); 
            match(input,25,FOLLOW_25_in_rule__Terminal__Group_0__2__Impl3631); 
             after(grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__2__Impl"


    // $ANTLR start "rule__Terminal__Group_0__3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1849:1: rule__Terminal__Group_0__3 : rule__Terminal__Group_0__3__Impl ;
    public final void rule__Terminal__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1853:1: ( rule__Terminal__Group_0__3__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1854:2: rule__Terminal__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Terminal__Group_0__3__Impl_in_rule__Terminal__Group_0__33662);
            rule__Terminal__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__3"


    // $ANTLR start "rule__Terminal__Group_0__3__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1860:1: rule__Terminal__Group_0__3__Impl : ( ( rule__Terminal__MaxAssignment_0_3 ) ) ;
    public final void rule__Terminal__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1864:1: ( ( ( rule__Terminal__MaxAssignment_0_3 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1865:1: ( ( rule__Terminal__MaxAssignment_0_3 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1865:1: ( ( rule__Terminal__MaxAssignment_0_3 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1866:1: ( rule__Terminal__MaxAssignment_0_3 )
            {
             before(grammarAccess.getTerminalAccess().getMaxAssignment_0_3()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1867:1: ( rule__Terminal__MaxAssignment_0_3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1867:2: rule__Terminal__MaxAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Terminal__MaxAssignment_0_3_in_rule__Terminal__Group_0__3__Impl3689);
            rule__Terminal__MaxAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getMaxAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__3__Impl"


    // $ANTLR start "rule__Terminal__Group_1__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1885:1: rule__Terminal__Group_1__0 : rule__Terminal__Group_1__0__Impl rule__Terminal__Group_1__1 ;
    public final void rule__Terminal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1889:1: ( rule__Terminal__Group_1__0__Impl rule__Terminal__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1890:2: rule__Terminal__Group_1__0__Impl rule__Terminal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Terminal__Group_1__0__Impl_in_rule__Terminal__Group_1__03727);
            rule__Terminal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal__Group_1__1_in_rule__Terminal__Group_1__03730);
            rule__Terminal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_1__0"


    // $ANTLR start "rule__Terminal__Group_1__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1897:1: rule__Terminal__Group_1__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1901:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1902:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1902:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1903:1: ()
            {
             before(grammarAccess.getTerminalAccess().getSingleAction_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1904:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1906:1: 
            {
            }

             after(grammarAccess.getTerminalAccess().getSingleAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_1__0__Impl"


    // $ANTLR start "rule__Terminal__Group_1__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1916:1: rule__Terminal__Group_1__1 : rule__Terminal__Group_1__1__Impl ;
    public final void rule__Terminal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1920:1: ( rule__Terminal__Group_1__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1921:2: rule__Terminal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Terminal__Group_1__1__Impl_in_rule__Terminal__Group_1__13788);
            rule__Terminal__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_1__1"


    // $ANTLR start "rule__Terminal__Group_1__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1927:1: rule__Terminal__Group_1__1__Impl : ( ( rule__Terminal__TokenAssignment_1_1 ) ) ;
    public final void rule__Terminal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1931:1: ( ( ( rule__Terminal__TokenAssignment_1_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1932:1: ( ( rule__Terminal__TokenAssignment_1_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1932:1: ( ( rule__Terminal__TokenAssignment_1_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1933:1: ( rule__Terminal__TokenAssignment_1_1 )
            {
             before(grammarAccess.getTerminalAccess().getTokenAssignment_1_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1934:1: ( rule__Terminal__TokenAssignment_1_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1934:2: rule__Terminal__TokenAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Terminal__TokenAssignment_1_1_in_rule__Terminal__Group_1__1__Impl3815);
            rule__Terminal__TokenAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getTokenAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_1__1__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1948:1: rule__ParenthesizedElement__Group__0 : rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1 ;
    public final void rule__ParenthesizedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1952:1: ( rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1953:2: rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__0__Impl_in_rule__ParenthesizedElement__Group__03849);
            rule__ParenthesizedElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__1_in_rule__ParenthesizedElement__Group__03852);
            rule__ParenthesizedElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__0"


    // $ANTLR start "rule__ParenthesizedElement__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1960:1: rule__ParenthesizedElement__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1964:1: ( ( '(' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1965:1: ( '(' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1965:1: ( '(' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1966:1: '('
            {
             before(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ParenthesizedElement__Group__0__Impl3880); 
             after(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__0__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1979:1: rule__ParenthesizedElement__Group__1 : rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2 ;
    public final void rule__ParenthesizedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1983:1: ( rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1984:2: rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__1__Impl_in_rule__ParenthesizedElement__Group__13911);
            rule__ParenthesizedElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__2_in_rule__ParenthesizedElement__Group__13914);
            rule__ParenthesizedElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__1"


    // $ANTLR start "rule__ParenthesizedElement__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1991:1: rule__ParenthesizedElement__Group__1__Impl : ( ruleAlternative ) ;
    public final void rule__ParenthesizedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1995:1: ( ( ruleAlternative ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1996:1: ( ruleAlternative )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1996:1: ( ruleAlternative )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1997:1: ruleAlternative
            {
             before(grammarAccess.getParenthesizedElementAccess().getAlternativeParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleAlternative_in_rule__ParenthesizedElement__Group__1__Impl3941);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getParenthesizedElementAccess().getAlternativeParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__1__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2008:1: rule__ParenthesizedElement__Group__2 : rule__ParenthesizedElement__Group__2__Impl ;
    public final void rule__ParenthesizedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2012:1: ( rule__ParenthesizedElement__Group__2__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2013:2: rule__ParenthesizedElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__2__Impl_in_rule__ParenthesizedElement__Group__23970);
            rule__ParenthesizedElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__2"


    // $ANTLR start "rule__ParenthesizedElement__Group__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2019:1: rule__ParenthesizedElement__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2023:1: ( ( ')' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2024:1: ( ')' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2024:1: ( ')' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2025:1: ')'
            {
             before(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ParenthesizedElement__Group__2__Impl3998); 
             after(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParenthesizedElement__Group__2__Impl"


    // $ANTLR start "rule__Model__TestsAssignment"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2045:1: rule__Model__TestsAssignment : ( ruleTest ) ;
    public final void rule__Model__TestsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2049:1: ( ( ruleTest ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2050:1: ( ruleTest )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2050:1: ( ruleTest )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2051:1: ruleTest
            {
             before(grammarAccess.getModelAccess().getTestsTestParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTest_in_rule__Model__TestsAssignment4040);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTestsTestParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TestsAssignment"


    // $ANTLR start "rule__Test__RefAssignment_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2060:1: rule__Test__RefAssignment_1 : ( ( ruleGrammarID ) ) ;
    public final void rule__Test__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2064:1: ( ( ( ruleGrammarID ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2065:1: ( ( ruleGrammarID ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2065:1: ( ( ruleGrammarID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2066:1: ( ruleGrammarID )
            {
             before(grammarAccess.getTestAccess().getRefGrammarCrossReference_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2067:1: ( ruleGrammarID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2068:1: ruleGrammarID
            {
             before(grammarAccess.getTestAccess().getRefGrammarGrammarIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleGrammarID_in_rule__Test__RefAssignment_14075);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getTestAccess().getRefGrammarGrammarIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTestAccess().getRefGrammarCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__RefAssignment_1"


    // $ANTLR start "rule__Test__RuleAssignment_2_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2079:1: rule__Test__RuleAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Test__RuleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2083:1: ( ( ( RULE_ID ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2084:1: ( ( RULE_ID ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2084:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2085:1: ( RULE_ID )
            {
             before(grammarAccess.getTestAccess().getRuleAbstractRuleCrossReference_2_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2086:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2087:1: RULE_ID
            {
             before(grammarAccess.getTestAccess().getRuleAbstractRuleIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Test__RuleAssignment_2_14114); 
             after(grammarAccess.getTestAccess().getRuleAbstractRuleIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getTestAccess().getRuleAbstractRuleCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__RuleAssignment_2_1"


    // $ANTLR start "rule__Test__SubstitutionsAssignment_3_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2098:1: rule__Test__SubstitutionsAssignment_3_1 : ( ruleSubstitution ) ;
    public final void rule__Test__SubstitutionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2102:1: ( ( ruleSubstitution ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2103:1: ( ruleSubstitution )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2103:1: ( ruleSubstitution )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2104:1: ruleSubstitution
            {
             before(grammarAccess.getTestAccess().getSubstitutionsSubstitutionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleSubstitution_in_rule__Test__SubstitutionsAssignment_3_14149);
            ruleSubstitution();

            state._fsp--;

             after(grammarAccess.getTestAccess().getSubstitutionsSubstitutionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__SubstitutionsAssignment_3_1"


    // $ANTLR start "rule__Substitution__RuleAssignment_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2113:1: rule__Substitution__RuleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Substitution__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2117:1: ( ( ( RULE_ID ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2118:1: ( ( RULE_ID ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2118:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2119:1: ( RULE_ID )
            {
             before(grammarAccess.getSubstitutionAccess().getRuleAbstractRuleCrossReference_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2120:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2121:1: RULE_ID
            {
             before(grammarAccess.getSubstitutionAccess().getRuleAbstractRuleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Substitution__RuleAssignment_14184); 
             after(grammarAccess.getSubstitutionAccess().getRuleAbstractRuleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSubstitutionAccess().getRuleAbstractRuleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__RuleAssignment_1"


    // $ANTLR start "rule__Substitution__SubstitutionAssignment_3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2132:1: rule__Substitution__SubstitutionAssignment_3 : ( ruleSG ) ;
    public final void rule__Substitution__SubstitutionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2136:1: ( ( ruleSG ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2137:1: ( ruleSG )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2137:1: ( ruleSG )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2138:1: ruleSG
            {
             before(grammarAccess.getSubstitutionAccess().getSubstitutionSGParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSG_in_rule__Substitution__SubstitutionAssignment_34219);
            ruleSG();

            state._fsp--;

             after(grammarAccess.getSubstitutionAccess().getSubstitutionSGParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substitution__SubstitutionAssignment_3"


    // $ANTLR start "rule__Alternative__RightAssignment_1_2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2147:1: rule__Alternative__RightAssignment_1_2 : ( ruleSequence ) ;
    public final void rule__Alternative__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2151:1: ( ( ruleSequence ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2152:1: ( ruleSequence )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2152:1: ( ruleSequence )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2153:1: ruleSequence
            {
             before(grammarAccess.getAlternativeAccess().getRightSequenceParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Alternative__RightAssignment_1_24250);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getRightSequenceParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__RightAssignment_1_2"


    // $ANTLR start "rule__Sequence__RightAssignment_1_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2162:1: rule__Sequence__RightAssignment_1_1 : ( ruleCardinality ) ;
    public final void rule__Sequence__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2166:1: ( ( ruleCardinality ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2167:1: ( ruleCardinality )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2167:1: ( ruleCardinality )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2168:1: ruleCardinality
            {
             before(grammarAccess.getSequenceAccess().getRightCardinalityParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Sequence__RightAssignment_1_14281);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getRightCardinalityParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__RightAssignment_1_1"


    // $ANTLR start "rule__Operated__OfAssignment_0_2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2177:1: rule__Operated__OfAssignment_0_2 : ( ruleOperated ) ;
    public final void rule__Operated__OfAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2181:1: ( ( ruleOperated ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2182:1: ( ruleOperated )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2182:1: ( ruleOperated )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2183:1: ruleOperated
            {
             before(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleOperated_in_rule__Operated__OfAssignment_0_24312);
            ruleOperated();

            state._fsp--;

             after(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__OfAssignment_0_2"


    // $ANTLR start "rule__Operated__OfAssignment_1_2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2192:1: rule__Operated__OfAssignment_1_2 : ( ruleOperated ) ;
    public final void rule__Operated__OfAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2196:1: ( ( ruleOperated ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2197:1: ( ruleOperated )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2197:1: ( ruleOperated )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2198:1: ruleOperated
            {
             before(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperated_in_rule__Operated__OfAssignment_1_24343);
            ruleOperated();

            state._fsp--;

             after(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operated__OfAssignment_1_2"


    // $ANTLR start "rule__Terminal__MinAssignment_0_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2207:1: rule__Terminal__MinAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Terminal__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2211:1: ( ( RULE_STRING ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2212:1: ( RULE_STRING )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2212:1: ( RULE_STRING )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2213:1: RULE_STRING
            {
             before(grammarAccess.getTerminalAccess().getMinSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Terminal__MinAssignment_0_14374); 
             after(grammarAccess.getTerminalAccess().getMinSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__MinAssignment_0_1"


    // $ANTLR start "rule__Terminal__MaxAssignment_0_3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2222:1: rule__Terminal__MaxAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__Terminal__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2226:1: ( ( RULE_STRING ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2227:1: ( RULE_STRING )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2227:1: ( RULE_STRING )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2228:1: RULE_STRING
            {
             before(grammarAccess.getTerminalAccess().getMaxSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Terminal__MaxAssignment_0_34405); 
             after(grammarAccess.getTerminalAccess().getMaxSTRINGTerminalRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__MaxAssignment_0_3"


    // $ANTLR start "rule__Terminal__TokenAssignment_1_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2237:1: rule__Terminal__TokenAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Terminal__TokenAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2241:1: ( ( RULE_STRING ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2242:1: ( RULE_STRING )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2242:1: ( RULE_STRING )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2243:1: RULE_STRING
            {
             before(grammarAccess.getTerminalAccess().getTokenSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Terminal__TokenAssignment_1_14436); 
             after(grammarAccess.getTerminalAccess().getTokenSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__TokenAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TestsAssignment_in_ruleModel96 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Model__TestsAssignment_in_ruleModel108 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleGrammarID_in_entryRuleGrammarID138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrammarID145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group__0_in_ruleGrammarID171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__0_in_ruleTest231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstitution_in_entryRuleSubstitution258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstitution265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Substitution__Group__0_in_ruleSubstitution291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSG_in_entryRuleSG318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSG325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleSG351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__0_in_ruleAlternative410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_entryRuleOperated557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperated564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Alternatives_in_ruleOperated590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_entryRuleTerminal617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Alternatives_in_ruleTerminal650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedElement684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__0_in_ruleParenthesizedElement710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_0__0_in_rule__Cardinality__Alternatives_1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_1__0_in_rule__Cardinality__Alternatives_1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_2__0_in_rule__Cardinality__Alternatives_1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__0_in_rule__Operated__Alternatives815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__0_in_rule__Operated__Alternatives833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_rule__Operated__Alternatives851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__0_in_rule__Terminal__Alternatives883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_1__0_in_rule__Terminal__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedElement_in_rule__Terminal__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group__0__Impl_in_rule__GrammarID__Group__0949 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__GrammarID__Group__1_in_rule__GrammarID__Group__0952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrammarID__Group__0__Impl979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group__1__Impl_in_rule__GrammarID__Group__11008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group_1__0_in_rule__GrammarID__Group__1__Impl1035 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__GrammarID__Group_1__0__Impl_in_rule__GrammarID__Group_1__01070 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrammarID__Group_1__1_in_rule__GrammarID__Group_1__01073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__GrammarID__Group_1__0__Impl1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group_1__1__Impl_in_rule__GrammarID__Group_1__11132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrammarID__Group_1__1__Impl1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__01192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Test__Group__1_in_rule__Test__Group__01195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Test__Group__0__Impl1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__11254 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Test__Group__2_in_rule__Test__Group__11257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__RefAssignment_1_in_rule__Test__Group__1__Impl1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__21314 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Test__Group__3_in_rule__Test__Group__21317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_2__0_in_rule__Test__Group__2__Impl1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__31375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_3__0_in_rule__Test__Group__3__Impl1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_2__0__Impl_in_rule__Test__Group_2__01441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Test__Group_2__1_in_rule__Test__Group_2__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Test__Group_2__0__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_2__1__Impl_in_rule__Test__Group_2__11503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__RuleAssignment_2_1_in_rule__Test__Group_2__1__Impl1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_3__0__Impl_in_rule__Test__Group_3__01564 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Test__Group_3__1_in_rule__Test__Group_3__01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Test__Group_3__0__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_3__1__Impl_in_rule__Test__Group_3__11626 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Test__Group_3__2_in_rule__Test__Group_3__11629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__SubstitutionsAssignment_3_1_in_rule__Test__Group_3__1__Impl1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_3__2__Impl_in_rule__Test__Group_3__21686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Test__Group_3__2__Impl1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Substitution__Group__0__Impl_in_rule__Substitution__Group__01751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Substitution__Group__1_in_rule__Substitution__Group__01754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Substitution__Group__0__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Substitution__Group__1__Impl_in_rule__Substitution__Group__11813 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Substitution__Group__2_in_rule__Substitution__Group__11816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Substitution__RuleAssignment_1_in_rule__Substitution__Group__1__Impl1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Substitution__Group__2__Impl_in_rule__Substitution__Group__21873 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__Substitution__Group__3_in_rule__Substitution__Group__21876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Substitution__Group__2__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Substitution__Group__3__Impl_in_rule__Substitution__Group__31935 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Substitution__Group__4_in_rule__Substitution__Group__31938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Substitution__SubstitutionAssignment_3_in_rule__Substitution__Group__3__Impl1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Substitution__Group__4__Impl_in_rule__Substitution__Group__41995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Substitution__Group__4__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__0__Impl_in_rule__Alternative__Group__02064 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Alternative__Group__1_in_rule__Alternative__Group__02067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Alternative__Group__0__Impl2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__1__Impl_in_rule__Alternative__Group__12123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__0_in_rule__Alternative__Group__1__Impl2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__0__Impl_in_rule__Alternative__Group_1__02185 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__1_in_rule__Alternative__Group_1__02188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__1__Impl_in_rule__Alternative__Group_1__12246 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__2_in_rule__Alternative__Group_1__12249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Alternative__Group_1__1__Impl2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__2__Impl_in_rule__Alternative__Group_1__22308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__RightAssignment_1_2_in_rule__Alternative__Group_1__2__Impl2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02371 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Sequence__Group__0__Impl2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_1__0_in_rule__Sequence__Group__1__Impl2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_1__0__Impl_in_rule__Sequence__Group_1__02492 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__Sequence__Group_1__1_in_rule__Sequence__Group_1__02495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_1__1__Impl_in_rule__Sequence__Group_1__12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__RightAssignment_1_1_in_rule__Sequence__Group_1__1__Impl2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__02614 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__02617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_rule__Cardinality__Group__0__Impl2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__12673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_1_in_rule__Cardinality__Group__1__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_0__0__Impl_in_rule__Cardinality__Group_1_0__02735 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_0__1_in_rule__Cardinality__Group_1_0__02738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_0__1__Impl_in_rule__Cardinality__Group_1_0__12796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Cardinality__Group_1_0__1__Impl2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_1__0__Impl_in_rule__Cardinality__Group_1_1__02859 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_1__1_in_rule__Cardinality__Group_1_1__02862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_1__1__Impl_in_rule__Cardinality__Group_1_1__12920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Cardinality__Group_1_1__1__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_2__0__Impl_in_rule__Cardinality__Group_1_2__02983 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_2__1_in_rule__Cardinality__Group_1_2__02986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_2__1__Impl_in_rule__Cardinality__Group_1_2__13044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Cardinality__Group_1_2__1__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__0__Impl_in_rule__Operated__Group_0__03107 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__1_in_rule__Operated__Group_0__03110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operated__Group_0__0__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__1__Impl_in_rule__Operated__Group_0__13169 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__2_in_rule__Operated__Group_0__13172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__2__Impl_in_rule__Operated__Group_0__23230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__OfAssignment_0_2_in_rule__Operated__Group_0__2__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__0__Impl_in_rule__Operated__Group_1__03293 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__1_in_rule__Operated__Group_1__03296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operated__Group_1__0__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__1__Impl_in_rule__Operated__Group_1__13355 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__2_in_rule__Operated__Group_1__13358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__2__Impl_in_rule__Operated__Group_1__23416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__OfAssignment_1_2_in_rule__Operated__Group_1__2__Impl3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__0__Impl_in_rule__Terminal__Group_0__03479 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__1_in_rule__Terminal__Group_0__03482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__1__Impl_in_rule__Terminal__Group_0__13540 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__2_in_rule__Terminal__Group_0__13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__MinAssignment_0_1_in_rule__Terminal__Group_0__1__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__2__Impl_in_rule__Terminal__Group_0__23600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__3_in_rule__Terminal__Group_0__23603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Terminal__Group_0__2__Impl3631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__3__Impl_in_rule__Terminal__Group_0__33662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__MaxAssignment_0_3_in_rule__Terminal__Group_0__3__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_1__0__Impl_in_rule__Terminal__Group_1__03727 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Terminal__Group_1__1_in_rule__Terminal__Group_1__03730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_1__1__Impl_in_rule__Terminal__Group_1__13788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__TokenAssignment_1_1_in_rule__Terminal__Group_1__1__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__0__Impl_in_rule__ParenthesizedElement__Group__03849 = new BitSet(new long[]{0x0000000005800020L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__1_in_rule__ParenthesizedElement__Group__03852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ParenthesizedElement__Group__0__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__1__Impl_in_rule__ParenthesizedElement__Group__13911 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__2_in_rule__ParenthesizedElement__Group__13914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_rule__ParenthesizedElement__Group__1__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__2__Impl_in_rule__ParenthesizedElement__Group__23970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ParenthesizedElement__Group__2__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_rule__Model__TestsAssignment4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrammarID_in_rule__Test__RefAssignment_14075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Test__RuleAssignment_2_14114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstitution_in_rule__Test__SubstitutionsAssignment_3_14149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Substitution__RuleAssignment_14184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSG_in_rule__Substitution__SubstitutionAssignment_34219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Alternative__RightAssignment_1_24250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Sequence__RightAssignment_1_14281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_rule__Operated__OfAssignment_0_24312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_rule__Operated__OfAssignment_1_24343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Terminal__MinAssignment_0_14374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Terminal__MaxAssignment_0_34405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Terminal__TokenAssignment_1_14436 = new BitSet(new long[]{0x0000000000000002L});

}