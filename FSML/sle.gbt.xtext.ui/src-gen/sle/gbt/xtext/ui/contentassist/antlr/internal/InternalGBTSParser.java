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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'test'", "':='", "'{'", "'}'", "'-'", "'initial'", "'apply'", "';'", "'sub'", "'new'", "'|'", "'?'", "'*'", "'+'", "'->'", "'!'", "'..'", "'('", "')'", "'.'", "'lbr'", "'start'", "':'", "'terminal'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:69:1: ruleModel : ( ( rule__Model__TstsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:73:2: ( ( ( rule__Model__TstsAssignment )* ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:74:1: ( ( rule__Model__TstsAssignment )* )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:74:1: ( ( rule__Model__TstsAssignment )* )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:75:1: ( rule__Model__TstsAssignment )*
            {
             before(grammarAccess.getModelAccess().getTstsAssignment()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:76:1: ( rule__Model__TstsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:76:2: rule__Model__TstsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__TstsAssignment_in_ruleModel94);
            	    rule__Model__TstsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTstsAssignment()); 

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


    // $ANTLR start "entryRuleTest"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:88:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:89:1: ( ruleTest EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:90:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest122);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest129); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:97:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:101:2: ( ( ( rule__Test__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:102:1: ( ( rule__Test__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:102:1: ( ( rule__Test__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:103:1: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:104:1: ( rule__Test__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:104:2: rule__Test__Group__0
            {
            pushFollow(FOLLOW_rule__Test__Group__0_in_ruleTest155);
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


    // $ANTLR start "entryRuleMember"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:116:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:117:1: ( ruleMember EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:118:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember182);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember189); 

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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:125:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:129:2: ( ( ( rule__Member__Alternatives ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:130:1: ( ( rule__Member__Alternatives ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:130:1: ( ( rule__Member__Alternatives ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:131:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:132:1: ( rule__Member__Alternatives )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:132:2: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_rule__Member__Alternatives_in_ruleMember215);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleApply"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:144:1: entryRuleApply : ruleApply EOF ;
    public final void entryRuleApply() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:145:1: ( ruleApply EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:146:1: ruleApply EOF
            {
             before(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply242);
            ruleApply();

            state._fsp--;

             after(grammarAccess.getApplyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply249); 

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
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:153:1: ruleApply : ( ( rule__Apply__Group__0 ) ) ;
    public final void ruleApply() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:157:2: ( ( ( rule__Apply__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:158:1: ( ( rule__Apply__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:158:1: ( ( rule__Apply__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:159:1: ( rule__Apply__Group__0 )
            {
             before(grammarAccess.getApplyAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:160:1: ( rule__Apply__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:160:2: rule__Apply__Group__0
            {
            pushFollow(FOLLOW_rule__Apply__Group__0_in_ruleApply275);
            rule__Apply__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getGroup()); 

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
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleSub"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:172:1: entryRuleSub : ruleSub EOF ;
    public final void entryRuleSub() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:173:1: ( ruleSub EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:174:1: ruleSub EOF
            {
             before(grammarAccess.getSubRule()); 
            pushFollow(FOLLOW_ruleSub_in_entryRuleSub302);
            ruleSub();

            state._fsp--;

             after(grammarAccess.getSubRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSub309); 

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
    // $ANTLR end "entryRuleSub"


    // $ANTLR start "ruleSub"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:181:1: ruleSub : ( ( rule__Sub__Group__0 ) ) ;
    public final void ruleSub() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:185:2: ( ( ( rule__Sub__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:186:1: ( ( rule__Sub__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:186:1: ( ( rule__Sub__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:187:1: ( rule__Sub__Group__0 )
            {
             before(grammarAccess.getSubAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:188:1: ( rule__Sub__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:188:2: rule__Sub__Group__0
            {
            pushFollow(FOLLOW_rule__Sub__Group__0_in_ruleSub335);
            rule__Sub__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubAccess().getGroup()); 

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
    // $ANTLR end "ruleSub"


    // $ANTLR start "entryRuleNew"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:200:1: entryRuleNew : ruleNew EOF ;
    public final void entryRuleNew() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:201:1: ( ruleNew EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:202:1: ruleNew EOF
            {
             before(grammarAccess.getNewRule()); 
            pushFollow(FOLLOW_ruleNew_in_entryRuleNew362);
            ruleNew();

            state._fsp--;

             after(grammarAccess.getNewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNew369); 

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
    // $ANTLR end "entryRuleNew"


    // $ANTLR start "ruleNew"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:209:1: ruleNew : ( ( rule__New__Group__0 ) ) ;
    public final void ruleNew() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:213:2: ( ( ( rule__New__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:214:1: ( ( rule__New__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:214:1: ( ( rule__New__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:215:1: ( rule__New__Group__0 )
            {
             before(grammarAccess.getNewAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:216:1: ( rule__New__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:216:2: rule__New__Group__0
            {
            pushFollow(FOLLOW_rule__New__Group__0_in_ruleNew395);
            rule__New__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewAccess().getGroup()); 

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
    // $ANTLR end "ruleNew"


    // $ANTLR start "entryRuleSG"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:228:1: entryRuleSG : ruleSG EOF ;
    public final void entryRuleSG() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:229:1: ( ruleSG EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:230:1: ruleSG EOF
            {
             before(grammarAccess.getSGRule()); 
            pushFollow(FOLLOW_ruleSG_in_entryRuleSG422);
            ruleSG();

            state._fsp--;

             after(grammarAccess.getSGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSG429); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:237:1: ruleSG : ( ruleAlternative ) ;
    public final void ruleSG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:241:2: ( ( ruleAlternative ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:242:1: ( ruleAlternative )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:242:1: ( ruleAlternative )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:243:1: ruleAlternative
            {
             before(grammarAccess.getSGAccess().getAlternativeParserRuleCall()); 
            pushFollow(FOLLOW_ruleAlternative_in_ruleSG455);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:256:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:257:1: ( ruleAlternative EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:258:1: ruleAlternative EOF
            {
             before(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative481);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getAlternativeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative488); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:265:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:269:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:270:1: ( ( rule__Alternative__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:270:1: ( ( rule__Alternative__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:271:1: ( rule__Alternative__Group__0 )
            {
             before(grammarAccess.getAlternativeAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:272:1: ( rule__Alternative__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:272:2: rule__Alternative__Group__0
            {
            pushFollow(FOLLOW_rule__Alternative__Group__0_in_ruleAlternative514);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:284:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:285:1: ( ruleSequence EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:286:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence541);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence548); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:293:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:297:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:298:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:298:1: ( ( rule__Sequence__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:299:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:300:1: ( rule__Sequence__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:300:2: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0_in_ruleSequence574);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:312:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:313:1: ( ruleCardinality EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:314:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality601);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality608); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:321:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:325:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:326:1: ( ( rule__Cardinality__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:326:1: ( ( rule__Cardinality__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:327:1: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:328:1: ( rule__Cardinality__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:328:2: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality634);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:340:1: entryRuleOperated : ruleOperated EOF ;
    public final void entryRuleOperated() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:341:1: ( ruleOperated EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:342:1: ruleOperated EOF
            {
             before(grammarAccess.getOperatedRule()); 
            pushFollow(FOLLOW_ruleOperated_in_entryRuleOperated661);
            ruleOperated();

            state._fsp--;

             after(grammarAccess.getOperatedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperated668); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:349:1: ruleOperated : ( ( rule__Operated__Alternatives ) ) ;
    public final void ruleOperated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:353:2: ( ( ( rule__Operated__Alternatives ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:354:1: ( ( rule__Operated__Alternatives ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:354:1: ( ( rule__Operated__Alternatives ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:355:1: ( rule__Operated__Alternatives )
            {
             before(grammarAccess.getOperatedAccess().getAlternatives()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:356:1: ( rule__Operated__Alternatives )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:356:2: rule__Operated__Alternatives
            {
            pushFollow(FOLLOW_rule__Operated__Alternatives_in_ruleOperated694);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:368:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:369:1: ( ruleTerminal EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:370:1: ruleTerminal EOF
            {
             before(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_ruleTerminal_in_entryRuleTerminal721);
            ruleTerminal();

            state._fsp--;

             after(grammarAccess.getTerminalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal728); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:377:1: ruleTerminal : ( ( rule__Terminal__Alternatives ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:381:2: ( ( ( rule__Terminal__Alternatives ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:382:1: ( ( rule__Terminal__Alternatives ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:382:1: ( ( rule__Terminal__Alternatives ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:383:1: ( rule__Terminal__Alternatives )
            {
             before(grammarAccess.getTerminalAccess().getAlternatives()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:384:1: ( rule__Terminal__Alternatives )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:384:2: rule__Terminal__Alternatives
            {
            pushFollow(FOLLOW_rule__Terminal__Alternatives_in_ruleTerminal754);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:396:1: entryRuleParenthesizedElement : ruleParenthesizedElement EOF ;
    public final void entryRuleParenthesizedElement() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:397:1: ( ruleParenthesizedElement EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:398:1: ruleParenthesizedElement EOF
            {
             before(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement781);
            ruleParenthesizedElement();

            state._fsp--;

             after(grammarAccess.getParenthesizedElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedElement788); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:405:1: ruleParenthesizedElement : ( ( rule__ParenthesizedElement__Group__0 ) ) ;
    public final void ruleParenthesizedElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:409:2: ( ( ( rule__ParenthesizedElement__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:410:1: ( ( rule__ParenthesizedElement__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:410:1: ( ( rule__ParenthesizedElement__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:411:1: ( rule__ParenthesizedElement__Group__0 )
            {
             before(grammarAccess.getParenthesizedElementAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:412:1: ( rule__ParenthesizedElement__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:412:2: rule__ParenthesizedElement__Group__0
            {
            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__0_in_ruleParenthesizedElement814);
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


    // $ANTLR start "entryRuleGrammarID"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:424:1: entryRuleGrammarID : ruleGrammarID EOF ;
    public final void entryRuleGrammarID() throws RecognitionException {
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:425:1: ( ruleGrammarID EOF )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:426:1: ruleGrammarID EOF
            {
             before(grammarAccess.getGrammarIDRule()); 
            pushFollow(FOLLOW_ruleGrammarID_in_entryRuleGrammarID841);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getGrammarIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrammarID848); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:433:1: ruleGrammarID : ( ( rule__GrammarID__Group__0 ) ) ;
    public final void ruleGrammarID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:437:2: ( ( ( rule__GrammarID__Group__0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:438:1: ( ( rule__GrammarID__Group__0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:438:1: ( ( rule__GrammarID__Group__0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:439:1: ( rule__GrammarID__Group__0 )
            {
             before(grammarAccess.getGrammarIDAccess().getGroup()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:440:1: ( rule__GrammarID__Group__0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:440:2: rule__GrammarID__Group__0
            {
            pushFollow(FOLLOW_rule__GrammarID__Group__0_in_ruleGrammarID874);
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


    // $ANTLR start "rule__Member__Alternatives"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:452:1: rule__Member__Alternatives : ( ( ruleApply ) | ( ruleSub ) | ( ruleNew ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:456:1: ( ( ruleApply ) | ( ruleSub ) | ( ruleNew ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
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
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:457:1: ( ruleApply )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:457:1: ( ruleApply )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:458:1: ruleApply
                    {
                     before(grammarAccess.getMemberAccess().getApplyParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleApply_in_rule__Member__Alternatives910);
                    ruleApply();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getApplyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:463:6: ( ruleSub )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:463:6: ( ruleSub )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:464:1: ruleSub
                    {
                     before(grammarAccess.getMemberAccess().getSubParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSub_in_rule__Member__Alternatives927);
                    ruleSub();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getSubParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:469:6: ( ruleNew )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:469:6: ( ruleNew )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:470:1: ruleNew
                    {
                     before(grammarAccess.getMemberAccess().getNewParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleNew_in_rule__Member__Alternatives944);
                    ruleNew();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getNewParserRuleCall_2()); 

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
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:480:1: rule__Cardinality__Alternatives_1 : ( ( ( rule__Cardinality__Group_1_0__0 ) ) | ( ( rule__Cardinality__Group_1_1__0 ) ) | ( ( rule__Cardinality__Group_1_2__0 ) ) );
    public final void rule__Cardinality__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:484:1: ( ( ( rule__Cardinality__Group_1_0__0 ) ) | ( ( rule__Cardinality__Group_1_1__0 ) ) | ( ( rule__Cardinality__Group_1_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 24:
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
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:485:1: ( ( rule__Cardinality__Group_1_0__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:485:1: ( ( rule__Cardinality__Group_1_0__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:486:1: ( rule__Cardinality__Group_1_0__0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getGroup_1_0()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:487:1: ( rule__Cardinality__Group_1_0__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:487:2: rule__Cardinality__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Group_1_0__0_in_rule__Cardinality__Alternatives_1976);
                    rule__Cardinality__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:491:6: ( ( rule__Cardinality__Group_1_1__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:491:6: ( ( rule__Cardinality__Group_1_1__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:492:1: ( rule__Cardinality__Group_1_1__0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getGroup_1_1()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:493:1: ( rule__Cardinality__Group_1_1__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:493:2: rule__Cardinality__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Group_1_1__0_in_rule__Cardinality__Alternatives_1994);
                    rule__Cardinality__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:497:6: ( ( rule__Cardinality__Group_1_2__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:497:6: ( ( rule__Cardinality__Group_1_2__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:498:1: ( rule__Cardinality__Group_1_2__0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getGroup_1_2()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:499:1: ( rule__Cardinality__Group_1_2__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:499:2: rule__Cardinality__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Group_1_2__0_in_rule__Cardinality__Alternatives_11012);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:508:1: rule__Operated__Alternatives : ( ( ( rule__Operated__Group_0__0 ) ) | ( ( rule__Operated__Group_1__0 ) ) | ( ruleTerminal ) );
    public final void rule__Operated__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:512:1: ( ( ( rule__Operated__Group_0__0 ) ) | ( ( rule__Operated__Group_1__0 ) ) | ( ruleTerminal ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case 28:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:513:1: ( ( rule__Operated__Group_0__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:513:1: ( ( rule__Operated__Group_0__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:514:1: ( rule__Operated__Group_0__0 )
                    {
                     before(grammarAccess.getOperatedAccess().getGroup_0()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:515:1: ( rule__Operated__Group_0__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:515:2: rule__Operated__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Operated__Group_0__0_in_rule__Operated__Alternatives1045);
                    rule__Operated__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatedAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:519:6: ( ( rule__Operated__Group_1__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:519:6: ( ( rule__Operated__Group_1__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:520:1: ( rule__Operated__Group_1__0 )
                    {
                     before(grammarAccess.getOperatedAccess().getGroup_1()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:521:1: ( rule__Operated__Group_1__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:521:2: rule__Operated__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Operated__Group_1__0_in_rule__Operated__Alternatives1063);
                    rule__Operated__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatedAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:525:6: ( ruleTerminal )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:525:6: ( ruleTerminal )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:526:1: ruleTerminal
                    {
                     before(grammarAccess.getOperatedAccess().getTerminalParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTerminal_in_rule__Operated__Alternatives1081);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:536:1: rule__Terminal__Alternatives : ( ( ( rule__Terminal__Group_0__0 ) ) | ( ( rule__Terminal__Group_1__0 ) ) | ( ( rule__Terminal__Group_2__0 ) ) | ( ruleParenthesizedElement ) );
    public final void rule__Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:540:1: ( ( ( rule__Terminal__Group_0__0 ) ) | ( ( rule__Terminal__Group_1__0 ) ) | ( ( rule__Terminal__Group_2__0 ) ) | ( ruleParenthesizedElement ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==27) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||LA5_1==RULE_ID||LA5_1==RULE_STRING||LA5_1==18||(LA5_1>=21 && LA5_1<=26)||(LA5_1>=28 && LA5_1<=29)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:541:1: ( ( rule__Terminal__Group_0__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:541:1: ( ( rule__Terminal__Group_0__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:542:1: ( rule__Terminal__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalAccess().getGroup_0()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:543:1: ( rule__Terminal__Group_0__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:543:2: rule__Terminal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Terminal__Group_0__0_in_rule__Terminal__Alternatives1113);
                    rule__Terminal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:547:6: ( ( rule__Terminal__Group_1__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:547:6: ( ( rule__Terminal__Group_1__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:548:1: ( rule__Terminal__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalAccess().getGroup_1()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:549:1: ( rule__Terminal__Group_1__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:549:2: rule__Terminal__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Terminal__Group_1__0_in_rule__Terminal__Alternatives1131);
                    rule__Terminal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:553:6: ( ( rule__Terminal__Group_2__0 ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:553:6: ( ( rule__Terminal__Group_2__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:554:1: ( rule__Terminal__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalAccess().getGroup_2()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:555:1: ( rule__Terminal__Group_2__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:555:2: rule__Terminal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Terminal__Group_2__0_in_rule__Terminal__Alternatives1149);
                    rule__Terminal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:559:6: ( ruleParenthesizedElement )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:559:6: ( ruleParenthesizedElement )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:560:1: ruleParenthesizedElement
                    {
                     before(grammarAccess.getTerminalAccess().getParenthesizedElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleParenthesizedElement_in_rule__Terminal__Alternatives1167);
                    ruleParenthesizedElement();

                    state._fsp--;

                     after(grammarAccess.getTerminalAccess().getParenthesizedElementParserRuleCall_3()); 

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


    // $ANTLR start "rule__Test__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:572:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:576:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:577:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__01197);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__1_in_rule__Test__Group__01200);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:584:1: rule__Test__Group__0__Impl : ( 'test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:588:1: ( ( 'test' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:589:1: ( 'test' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:589:1: ( 'test' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:590:1: 'test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Test__Group__0__Impl1228); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:603:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:607:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:608:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__11259);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__2_in_rule__Test__Group__11262);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:615:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:619:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:620:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:620:1: ( ( rule__Test__NameAssignment_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:621:1: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:622:1: ( rule__Test__NameAssignment_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:622:2: rule__Test__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Test__NameAssignment_1_in_rule__Test__Group__1__Impl1289);
            rule__Test__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNameAssignment_1()); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:632:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:636:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:637:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__21319);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__3_in_rule__Test__Group__21322);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:644:1: rule__Test__Group__2__Impl : ( ':=' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:648:1: ( ( ':=' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:649:1: ( ':=' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:649:1: ( ':=' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:650:1: ':='
            {
             before(grammarAccess.getTestAccess().getColonEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Test__Group__2__Impl1350); 
             after(grammarAccess.getTestAccess().getColonEqualsSignKeyword_2()); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:663:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:667:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:668:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__31381);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__4_in_rule__Test__Group__31384);
            rule__Test__Group__4();

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:675:1: rule__Test__Group__3__Impl : ( ( rule__Test__RefAssignment_3 ) ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:679:1: ( ( ( rule__Test__RefAssignment_3 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:680:1: ( ( rule__Test__RefAssignment_3 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:680:1: ( ( rule__Test__RefAssignment_3 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:681:1: ( rule__Test__RefAssignment_3 )
            {
             before(grammarAccess.getTestAccess().getRefAssignment_3()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:682:1: ( rule__Test__RefAssignment_3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:682:2: rule__Test__RefAssignment_3
            {
            pushFollow(FOLLOW_rule__Test__RefAssignment_3_in_rule__Test__Group__3__Impl1411);
            rule__Test__RefAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getRefAssignment_3()); 

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


    // $ANTLR start "rule__Test__Group__4"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:692:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:696:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:697:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_rule__Test__Group__4__Impl_in_rule__Test__Group__41441);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__5_in_rule__Test__Group__41444);
            rule__Test__Group__5();

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
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:704:1: rule__Test__Group__4__Impl : ( ( rule__Test__UnorderedGroup_4 ) ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:708:1: ( ( ( rule__Test__UnorderedGroup_4 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:709:1: ( ( rule__Test__UnorderedGroup_4 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:709:1: ( ( rule__Test__UnorderedGroup_4 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:710:1: ( rule__Test__UnorderedGroup_4 )
            {
             before(grammarAccess.getTestAccess().getUnorderedGroup_4()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:711:1: ( rule__Test__UnorderedGroup_4 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:711:2: rule__Test__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__Test__UnorderedGroup_4_in_rule__Test__Group__4__Impl1471);
            rule__Test__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getUnorderedGroup_4()); 

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
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:721:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:725:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:726:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_rule__Test__Group__5__Impl_in_rule__Test__Group__51501);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__6_in_rule__Test__Group__51504);
            rule__Test__Group__6();

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
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:733:1: rule__Test__Group__5__Impl : ( '{' ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:737:1: ( ( '{' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:738:1: ( '{' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:738:1: ( '{' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:739:1: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Test__Group__5__Impl1532); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:752:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:756:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:757:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_rule__Test__Group__6__Impl_in_rule__Test__Group__61563);
            rule__Test__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group__7_in_rule__Test__Group__61566);
            rule__Test__Group__7();

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
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:764:1: rule__Test__Group__6__Impl : ( ( rule__Test__MembersAssignment_6 )* ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:768:1: ( ( ( rule__Test__MembersAssignment_6 )* ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:769:1: ( ( rule__Test__MembersAssignment_6 )* )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:769:1: ( ( rule__Test__MembersAssignment_6 )* )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:770:1: ( rule__Test__MembersAssignment_6 )*
            {
             before(grammarAccess.getTestAccess().getMembersAssignment_6()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:771:1: ( rule__Test__MembersAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17||(LA6_0>=19 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:771:2: rule__Test__MembersAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Test__MembersAssignment_6_in_rule__Test__Group__6__Impl1593);
            	    rule__Test__MembersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getMembersAssignment_6()); 

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
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Test__Group__7"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:781:1: rule__Test__Group__7 : rule__Test__Group__7__Impl ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:785:1: ( rule__Test__Group__7__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:786:2: rule__Test__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group__7__Impl_in_rule__Test__Group__71624);
            rule__Test__Group__7__Impl();

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
    // $ANTLR end "rule__Test__Group__7"


    // $ANTLR start "rule__Test__Group__7__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:792:1: rule__Test__Group__7__Impl : ( '}' ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:796:1: ( ( '}' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:797:1: ( '}' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:797:1: ( '}' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:798:1: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_14_in_rule__Test__Group__7__Impl1652); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Test__Group__7__Impl"


    // $ANTLR start "rule__Test__Group_4_0__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:827:1: rule__Test__Group_4_0__0 : rule__Test__Group_4_0__0__Impl rule__Test__Group_4_0__1 ;
    public final void rule__Test__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:831:1: ( rule__Test__Group_4_0__0__Impl rule__Test__Group_4_0__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:832:2: rule__Test__Group_4_0__0__Impl rule__Test__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__Test__Group_4_0__0__Impl_in_rule__Test__Group_4_0__01699);
            rule__Test__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group_4_0__1_in_rule__Test__Group_4_0__01702);
            rule__Test__Group_4_0__1();

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
    // $ANTLR end "rule__Test__Group_4_0__0"


    // $ANTLR start "rule__Test__Group_4_0__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:839:1: rule__Test__Group_4_0__0__Impl : ( ( rule__Test__HasLbrAssignment_4_0_0 ) ) ;
    public final void rule__Test__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:843:1: ( ( ( rule__Test__HasLbrAssignment_4_0_0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:844:1: ( ( rule__Test__HasLbrAssignment_4_0_0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:844:1: ( ( rule__Test__HasLbrAssignment_4_0_0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:845:1: ( rule__Test__HasLbrAssignment_4_0_0 )
            {
             before(grammarAccess.getTestAccess().getHasLbrAssignment_4_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:846:1: ( rule__Test__HasLbrAssignment_4_0_0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:846:2: rule__Test__HasLbrAssignment_4_0_0
            {
            pushFollow(FOLLOW_rule__Test__HasLbrAssignment_4_0_0_in_rule__Test__Group_4_0__0__Impl1729);
            rule__Test__HasLbrAssignment_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getHasLbrAssignment_4_0_0()); 

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
    // $ANTLR end "rule__Test__Group_4_0__0__Impl"


    // $ANTLR start "rule__Test__Group_4_0__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:856:1: rule__Test__Group_4_0__1 : rule__Test__Group_4_0__1__Impl ;
    public final void rule__Test__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:860:1: ( rule__Test__Group_4_0__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:861:2: rule__Test__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group_4_0__1__Impl_in_rule__Test__Group_4_0__11759);
            rule__Test__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__Test__Group_4_0__1"


    // $ANTLR start "rule__Test__Group_4_0__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:867:1: rule__Test__Group_4_0__1__Impl : ( ( rule__Test__LbrAssignment_4_0_1 ) ) ;
    public final void rule__Test__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:871:1: ( ( ( rule__Test__LbrAssignment_4_0_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:872:1: ( ( rule__Test__LbrAssignment_4_0_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:872:1: ( ( rule__Test__LbrAssignment_4_0_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:873:1: ( rule__Test__LbrAssignment_4_0_1 )
            {
             before(grammarAccess.getTestAccess().getLbrAssignment_4_0_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:874:1: ( rule__Test__LbrAssignment_4_0_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:874:2: rule__Test__LbrAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__Test__LbrAssignment_4_0_1_in_rule__Test__Group_4_0__1__Impl1786);
            rule__Test__LbrAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getLbrAssignment_4_0_1()); 

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
    // $ANTLR end "rule__Test__Group_4_0__1__Impl"


    // $ANTLR start "rule__Test__Group_4_1__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:888:1: rule__Test__Group_4_1__0 : rule__Test__Group_4_1__0__Impl rule__Test__Group_4_1__1 ;
    public final void rule__Test__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:892:1: ( rule__Test__Group_4_1__0__Impl rule__Test__Group_4_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:893:2: rule__Test__Group_4_1__0__Impl rule__Test__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Test__Group_4_1__0__Impl_in_rule__Test__Group_4_1__01820);
            rule__Test__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group_4_1__1_in_rule__Test__Group_4_1__01823);
            rule__Test__Group_4_1__1();

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
    // $ANTLR end "rule__Test__Group_4_1__0"


    // $ANTLR start "rule__Test__Group_4_1__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:900:1: rule__Test__Group_4_1__0__Impl : ( ( rule__Test__HasLbrInitialAssignment_4_1_0 ) ) ;
    public final void rule__Test__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:904:1: ( ( ( rule__Test__HasLbrInitialAssignment_4_1_0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:905:1: ( ( rule__Test__HasLbrInitialAssignment_4_1_0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:905:1: ( ( rule__Test__HasLbrInitialAssignment_4_1_0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:906:1: ( rule__Test__HasLbrInitialAssignment_4_1_0 )
            {
             before(grammarAccess.getTestAccess().getHasLbrInitialAssignment_4_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:907:1: ( rule__Test__HasLbrInitialAssignment_4_1_0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:907:2: rule__Test__HasLbrInitialAssignment_4_1_0
            {
            pushFollow(FOLLOW_rule__Test__HasLbrInitialAssignment_4_1_0_in_rule__Test__Group_4_1__0__Impl1850);
            rule__Test__HasLbrInitialAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getHasLbrInitialAssignment_4_1_0()); 

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
    // $ANTLR end "rule__Test__Group_4_1__0__Impl"


    // $ANTLR start "rule__Test__Group_4_1__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:917:1: rule__Test__Group_4_1__1 : rule__Test__Group_4_1__1__Impl rule__Test__Group_4_1__2 ;
    public final void rule__Test__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:921:1: ( rule__Test__Group_4_1__1__Impl rule__Test__Group_4_1__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:922:2: rule__Test__Group_4_1__1__Impl rule__Test__Group_4_1__2
            {
            pushFollow(FOLLOW_rule__Test__Group_4_1__1__Impl_in_rule__Test__Group_4_1__11880);
            rule__Test__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group_4_1__2_in_rule__Test__Group_4_1__11883);
            rule__Test__Group_4_1__2();

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
    // $ANTLR end "rule__Test__Group_4_1__1"


    // $ANTLR start "rule__Test__Group_4_1__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:929:1: rule__Test__Group_4_1__1__Impl : ( '-' ) ;
    public final void rule__Test__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:933:1: ( ( '-' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:934:1: ( '-' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:934:1: ( '-' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:935:1: '-'
            {
             before(grammarAccess.getTestAccess().getHyphenMinusKeyword_4_1_1()); 
            match(input,15,FOLLOW_15_in_rule__Test__Group_4_1__1__Impl1911); 
             after(grammarAccess.getTestAccess().getHyphenMinusKeyword_4_1_1()); 

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
    // $ANTLR end "rule__Test__Group_4_1__1__Impl"


    // $ANTLR start "rule__Test__Group_4_1__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:948:1: rule__Test__Group_4_1__2 : rule__Test__Group_4_1__2__Impl rule__Test__Group_4_1__3 ;
    public final void rule__Test__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:952:1: ( rule__Test__Group_4_1__2__Impl rule__Test__Group_4_1__3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:953:2: rule__Test__Group_4_1__2__Impl rule__Test__Group_4_1__3
            {
            pushFollow(FOLLOW_rule__Test__Group_4_1__2__Impl_in_rule__Test__Group_4_1__21942);
            rule__Test__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group_4_1__3_in_rule__Test__Group_4_1__21945);
            rule__Test__Group_4_1__3();

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
    // $ANTLR end "rule__Test__Group_4_1__2"


    // $ANTLR start "rule__Test__Group_4_1__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:960:1: rule__Test__Group_4_1__2__Impl : ( 'initial' ) ;
    public final void rule__Test__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:964:1: ( ( 'initial' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:965:1: ( 'initial' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:965:1: ( 'initial' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:966:1: 'initial'
            {
             before(grammarAccess.getTestAccess().getInitialKeyword_4_1_2()); 
            match(input,16,FOLLOW_16_in_rule__Test__Group_4_1__2__Impl1973); 
             after(grammarAccess.getTestAccess().getInitialKeyword_4_1_2()); 

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
    // $ANTLR end "rule__Test__Group_4_1__2__Impl"


    // $ANTLR start "rule__Test__Group_4_1__3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:979:1: rule__Test__Group_4_1__3 : rule__Test__Group_4_1__3__Impl ;
    public final void rule__Test__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:983:1: ( rule__Test__Group_4_1__3__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:984:2: rule__Test__Group_4_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group_4_1__3__Impl_in_rule__Test__Group_4_1__32004);
            rule__Test__Group_4_1__3__Impl();

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
    // $ANTLR end "rule__Test__Group_4_1__3"


    // $ANTLR start "rule__Test__Group_4_1__3__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:990:1: rule__Test__Group_4_1__3__Impl : ( ( rule__Test__LbrInitialAssignment_4_1_3 ) ) ;
    public final void rule__Test__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:994:1: ( ( ( rule__Test__LbrInitialAssignment_4_1_3 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:995:1: ( ( rule__Test__LbrInitialAssignment_4_1_3 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:995:1: ( ( rule__Test__LbrInitialAssignment_4_1_3 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:996:1: ( rule__Test__LbrInitialAssignment_4_1_3 )
            {
             before(grammarAccess.getTestAccess().getLbrInitialAssignment_4_1_3()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:997:1: ( rule__Test__LbrInitialAssignment_4_1_3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:997:2: rule__Test__LbrInitialAssignment_4_1_3
            {
            pushFollow(FOLLOW_rule__Test__LbrInitialAssignment_4_1_3_in_rule__Test__Group_4_1__3__Impl2031);
            rule__Test__LbrInitialAssignment_4_1_3();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getLbrInitialAssignment_4_1_3()); 

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
    // $ANTLR end "rule__Test__Group_4_1__3__Impl"


    // $ANTLR start "rule__Test__Group_4_2__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1015:1: rule__Test__Group_4_2__0 : rule__Test__Group_4_2__0__Impl rule__Test__Group_4_2__1 ;
    public final void rule__Test__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1019:1: ( rule__Test__Group_4_2__0__Impl rule__Test__Group_4_2__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1020:2: rule__Test__Group_4_2__0__Impl rule__Test__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Test__Group_4_2__0__Impl_in_rule__Test__Group_4_2__02069);
            rule__Test__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Test__Group_4_2__1_in_rule__Test__Group_4_2__02072);
            rule__Test__Group_4_2__1();

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
    // $ANTLR end "rule__Test__Group_4_2__0"


    // $ANTLR start "rule__Test__Group_4_2__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1027:1: rule__Test__Group_4_2__0__Impl : ( ( rule__Test__HasStartruleAssignment_4_2_0 ) ) ;
    public final void rule__Test__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1031:1: ( ( ( rule__Test__HasStartruleAssignment_4_2_0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1032:1: ( ( rule__Test__HasStartruleAssignment_4_2_0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1032:1: ( ( rule__Test__HasStartruleAssignment_4_2_0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1033:1: ( rule__Test__HasStartruleAssignment_4_2_0 )
            {
             before(grammarAccess.getTestAccess().getHasStartruleAssignment_4_2_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1034:1: ( rule__Test__HasStartruleAssignment_4_2_0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1034:2: rule__Test__HasStartruleAssignment_4_2_0
            {
            pushFollow(FOLLOW_rule__Test__HasStartruleAssignment_4_2_0_in_rule__Test__Group_4_2__0__Impl2099);
            rule__Test__HasStartruleAssignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getHasStartruleAssignment_4_2_0()); 

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
    // $ANTLR end "rule__Test__Group_4_2__0__Impl"


    // $ANTLR start "rule__Test__Group_4_2__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1044:1: rule__Test__Group_4_2__1 : rule__Test__Group_4_2__1__Impl ;
    public final void rule__Test__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1048:1: ( rule__Test__Group_4_2__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1049:2: rule__Test__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Test__Group_4_2__1__Impl_in_rule__Test__Group_4_2__12129);
            rule__Test__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__Test__Group_4_2__1"


    // $ANTLR start "rule__Test__Group_4_2__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1055:1: rule__Test__Group_4_2__1__Impl : ( ( rule__Test__StartruleAssignment_4_2_1 ) ) ;
    public final void rule__Test__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1059:1: ( ( ( rule__Test__StartruleAssignment_4_2_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1060:1: ( ( rule__Test__StartruleAssignment_4_2_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1060:1: ( ( rule__Test__StartruleAssignment_4_2_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1061:1: ( rule__Test__StartruleAssignment_4_2_1 )
            {
             before(grammarAccess.getTestAccess().getStartruleAssignment_4_2_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1062:1: ( rule__Test__StartruleAssignment_4_2_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1062:2: rule__Test__StartruleAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Test__StartruleAssignment_4_2_1_in_rule__Test__Group_4_2__1__Impl2156);
            rule__Test__StartruleAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getStartruleAssignment_4_2_1()); 

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
    // $ANTLR end "rule__Test__Group_4_2__1__Impl"


    // $ANTLR start "rule__Apply__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1076:1: rule__Apply__Group__0 : rule__Apply__Group__0__Impl rule__Apply__Group__1 ;
    public final void rule__Apply__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1080:1: ( rule__Apply__Group__0__Impl rule__Apply__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1081:2: rule__Apply__Group__0__Impl rule__Apply__Group__1
            {
            pushFollow(FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__02190);
            rule__Apply__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__02193);
            rule__Apply__Group__1();

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
    // $ANTLR end "rule__Apply__Group__0"


    // $ANTLR start "rule__Apply__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1088:1: rule__Apply__Group__0__Impl : ( 'apply' ) ;
    public final void rule__Apply__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1092:1: ( ( 'apply' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1093:1: ( 'apply' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1093:1: ( 'apply' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1094:1: 'apply'
            {
             before(grammarAccess.getApplyAccess().getApplyKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Apply__Group__0__Impl2221); 
             after(grammarAccess.getApplyAccess().getApplyKeyword_0()); 

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
    // $ANTLR end "rule__Apply__Group__0__Impl"


    // $ANTLR start "rule__Apply__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1107:1: rule__Apply__Group__1 : rule__Apply__Group__1__Impl rule__Apply__Group__2 ;
    public final void rule__Apply__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1111:1: ( rule__Apply__Group__1__Impl rule__Apply__Group__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1112:2: rule__Apply__Group__1__Impl rule__Apply__Group__2
            {
            pushFollow(FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__12252);
            rule__Apply__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__2_in_rule__Apply__Group__12255);
            rule__Apply__Group__2();

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
    // $ANTLR end "rule__Apply__Group__1"


    // $ANTLR start "rule__Apply__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1119:1: rule__Apply__Group__1__Impl : ( ( rule__Apply__MinOrItAssignment_1 ) ) ;
    public final void rule__Apply__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1123:1: ( ( ( rule__Apply__MinOrItAssignment_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1124:1: ( ( rule__Apply__MinOrItAssignment_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1124:1: ( ( rule__Apply__MinOrItAssignment_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1125:1: ( rule__Apply__MinOrItAssignment_1 )
            {
             before(grammarAccess.getApplyAccess().getMinOrItAssignment_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1126:1: ( rule__Apply__MinOrItAssignment_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1126:2: rule__Apply__MinOrItAssignment_1
            {
            pushFollow(FOLLOW_rule__Apply__MinOrItAssignment_1_in_rule__Apply__Group__1__Impl2282);
            rule__Apply__MinOrItAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getMinOrItAssignment_1()); 

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
    // $ANTLR end "rule__Apply__Group__1__Impl"


    // $ANTLR start "rule__Apply__Group__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1136:1: rule__Apply__Group__2 : rule__Apply__Group__2__Impl rule__Apply__Group__3 ;
    public final void rule__Apply__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1140:1: ( rule__Apply__Group__2__Impl rule__Apply__Group__3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1141:2: rule__Apply__Group__2__Impl rule__Apply__Group__3
            {
            pushFollow(FOLLOW_rule__Apply__Group__2__Impl_in_rule__Apply__Group__22312);
            rule__Apply__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__3_in_rule__Apply__Group__22315);
            rule__Apply__Group__3();

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
    // $ANTLR end "rule__Apply__Group__2"


    // $ANTLR start "rule__Apply__Group__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1148:1: rule__Apply__Group__2__Impl : ( ( rule__Apply__Group_2__0 )? ) ;
    public final void rule__Apply__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1152:1: ( ( ( rule__Apply__Group_2__0 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1153:1: ( ( rule__Apply__Group_2__0 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1153:1: ( ( rule__Apply__Group_2__0 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1154:1: ( rule__Apply__Group_2__0 )?
            {
             before(grammarAccess.getApplyAccess().getGroup_2()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1155:1: ( rule__Apply__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1155:2: rule__Apply__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Apply__Group_2__0_in_rule__Apply__Group__2__Impl2342);
                    rule__Apply__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplyAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Apply__Group__2__Impl"


    // $ANTLR start "rule__Apply__Group__3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1165:1: rule__Apply__Group__3 : rule__Apply__Group__3__Impl rule__Apply__Group__4 ;
    public final void rule__Apply__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1169:1: ( rule__Apply__Group__3__Impl rule__Apply__Group__4 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1170:2: rule__Apply__Group__3__Impl rule__Apply__Group__4
            {
            pushFollow(FOLLOW_rule__Apply__Group__3__Impl_in_rule__Apply__Group__32373);
            rule__Apply__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group__4_in_rule__Apply__Group__32376);
            rule__Apply__Group__4();

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
    // $ANTLR end "rule__Apply__Group__3"


    // $ANTLR start "rule__Apply__Group__3__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1177:1: rule__Apply__Group__3__Impl : ( ( rule__Apply__Group_3__0 )? ) ;
    public final void rule__Apply__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1181:1: ( ( ( rule__Apply__Group_3__0 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1182:1: ( ( rule__Apply__Group_3__0 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1182:1: ( ( rule__Apply__Group_3__0 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1183:1: ( rule__Apply__Group_3__0 )?
            {
             before(grammarAccess.getApplyAccess().getGroup_3()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1184:1: ( rule__Apply__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1184:2: rule__Apply__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Apply__Group_3__0_in_rule__Apply__Group__3__Impl2403);
                    rule__Apply__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplyAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Apply__Group__3__Impl"


    // $ANTLR start "rule__Apply__Group__4"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1194:1: rule__Apply__Group__4 : rule__Apply__Group__4__Impl ;
    public final void rule__Apply__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1198:1: ( rule__Apply__Group__4__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1199:2: rule__Apply__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group__4__Impl_in_rule__Apply__Group__42434);
            rule__Apply__Group__4__Impl();

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
    // $ANTLR end "rule__Apply__Group__4"


    // $ANTLR start "rule__Apply__Group__4__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1205:1: rule__Apply__Group__4__Impl : ( ';' ) ;
    public final void rule__Apply__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1209:1: ( ( ';' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1210:1: ( ';' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1210:1: ( ';' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1211:1: ';'
            {
             before(grammarAccess.getApplyAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Apply__Group__4__Impl2462); 
             after(grammarAccess.getApplyAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Apply__Group__4__Impl"


    // $ANTLR start "rule__Apply__Group_2__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1234:1: rule__Apply__Group_2__0 : rule__Apply__Group_2__0__Impl rule__Apply__Group_2__1 ;
    public final void rule__Apply__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1238:1: ( rule__Apply__Group_2__0__Impl rule__Apply__Group_2__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1239:2: rule__Apply__Group_2__0__Impl rule__Apply__Group_2__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_2__0__Impl_in_rule__Apply__Group_2__02503);
            rule__Apply__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_2__1_in_rule__Apply__Group_2__02506);
            rule__Apply__Group_2__1();

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
    // $ANTLR end "rule__Apply__Group_2__0"


    // $ANTLR start "rule__Apply__Group_2__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1246:1: rule__Apply__Group_2__0__Impl : ( ( rule__Apply__HasMaxAssignment_2_0 ) ) ;
    public final void rule__Apply__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1250:1: ( ( ( rule__Apply__HasMaxAssignment_2_0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1251:1: ( ( rule__Apply__HasMaxAssignment_2_0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1251:1: ( ( rule__Apply__HasMaxAssignment_2_0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1252:1: ( rule__Apply__HasMaxAssignment_2_0 )
            {
             before(grammarAccess.getApplyAccess().getHasMaxAssignment_2_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1253:1: ( rule__Apply__HasMaxAssignment_2_0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1253:2: rule__Apply__HasMaxAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Apply__HasMaxAssignment_2_0_in_rule__Apply__Group_2__0__Impl2533);
            rule__Apply__HasMaxAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getHasMaxAssignment_2_0()); 

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
    // $ANTLR end "rule__Apply__Group_2__0__Impl"


    // $ANTLR start "rule__Apply__Group_2__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1263:1: rule__Apply__Group_2__1 : rule__Apply__Group_2__1__Impl ;
    public final void rule__Apply__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1267:1: ( rule__Apply__Group_2__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1268:2: rule__Apply__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_2__1__Impl_in_rule__Apply__Group_2__12563);
            rule__Apply__Group_2__1__Impl();

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
    // $ANTLR end "rule__Apply__Group_2__1"


    // $ANTLR start "rule__Apply__Group_2__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1274:1: rule__Apply__Group_2__1__Impl : ( ( rule__Apply__MaxAssignment_2_1 ) ) ;
    public final void rule__Apply__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1278:1: ( ( ( rule__Apply__MaxAssignment_2_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1279:1: ( ( rule__Apply__MaxAssignment_2_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1279:1: ( ( rule__Apply__MaxAssignment_2_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1280:1: ( rule__Apply__MaxAssignment_2_1 )
            {
             before(grammarAccess.getApplyAccess().getMaxAssignment_2_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1281:1: ( rule__Apply__MaxAssignment_2_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1281:2: rule__Apply__MaxAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Apply__MaxAssignment_2_1_in_rule__Apply__Group_2__1__Impl2590);
            rule__Apply__MaxAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getMaxAssignment_2_1()); 

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
    // $ANTLR end "rule__Apply__Group_2__1__Impl"


    // $ANTLR start "rule__Apply__Group_3__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1295:1: rule__Apply__Group_3__0 : rule__Apply__Group_3__0__Impl rule__Apply__Group_3__1 ;
    public final void rule__Apply__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1299:1: ( rule__Apply__Group_3__0__Impl rule__Apply__Group_3__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1300:2: rule__Apply__Group_3__0__Impl rule__Apply__Group_3__1
            {
            pushFollow(FOLLOW_rule__Apply__Group_3__0__Impl_in_rule__Apply__Group_3__02624);
            rule__Apply__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Apply__Group_3__1_in_rule__Apply__Group_3__02627);
            rule__Apply__Group_3__1();

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
    // $ANTLR end "rule__Apply__Group_3__0"


    // $ANTLR start "rule__Apply__Group_3__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1307:1: rule__Apply__Group_3__0__Impl : ( ( rule__Apply__HasNumAssignment_3_0 ) ) ;
    public final void rule__Apply__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1311:1: ( ( ( rule__Apply__HasNumAssignment_3_0 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1312:1: ( ( rule__Apply__HasNumAssignment_3_0 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1312:1: ( ( rule__Apply__HasNumAssignment_3_0 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1313:1: ( rule__Apply__HasNumAssignment_3_0 )
            {
             before(grammarAccess.getApplyAccess().getHasNumAssignment_3_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1314:1: ( rule__Apply__HasNumAssignment_3_0 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1314:2: rule__Apply__HasNumAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Apply__HasNumAssignment_3_0_in_rule__Apply__Group_3__0__Impl2654);
            rule__Apply__HasNumAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getHasNumAssignment_3_0()); 

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
    // $ANTLR end "rule__Apply__Group_3__0__Impl"


    // $ANTLR start "rule__Apply__Group_3__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1324:1: rule__Apply__Group_3__1 : rule__Apply__Group_3__1__Impl ;
    public final void rule__Apply__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1328:1: ( rule__Apply__Group_3__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1329:2: rule__Apply__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Apply__Group_3__1__Impl_in_rule__Apply__Group_3__12684);
            rule__Apply__Group_3__1__Impl();

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
    // $ANTLR end "rule__Apply__Group_3__1"


    // $ANTLR start "rule__Apply__Group_3__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1335:1: rule__Apply__Group_3__1__Impl : ( ( rule__Apply__NumAssignment_3_1 ) ) ;
    public final void rule__Apply__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1339:1: ( ( ( rule__Apply__NumAssignment_3_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1340:1: ( ( rule__Apply__NumAssignment_3_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1340:1: ( ( rule__Apply__NumAssignment_3_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1341:1: ( rule__Apply__NumAssignment_3_1 )
            {
             before(grammarAccess.getApplyAccess().getNumAssignment_3_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1342:1: ( rule__Apply__NumAssignment_3_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1342:2: rule__Apply__NumAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Apply__NumAssignment_3_1_in_rule__Apply__Group_3__1__Impl2711);
            rule__Apply__NumAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getApplyAccess().getNumAssignment_3_1()); 

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
    // $ANTLR end "rule__Apply__Group_3__1__Impl"


    // $ANTLR start "rule__Sub__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1356:1: rule__Sub__Group__0 : rule__Sub__Group__0__Impl rule__Sub__Group__1 ;
    public final void rule__Sub__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1360:1: ( rule__Sub__Group__0__Impl rule__Sub__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1361:2: rule__Sub__Group__0__Impl rule__Sub__Group__1
            {
            pushFollow(FOLLOW_rule__Sub__Group__0__Impl_in_rule__Sub__Group__02745);
            rule__Sub__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sub__Group__1_in_rule__Sub__Group__02748);
            rule__Sub__Group__1();

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
    // $ANTLR end "rule__Sub__Group__0"


    // $ANTLR start "rule__Sub__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1368:1: rule__Sub__Group__0__Impl : ( 'sub' ) ;
    public final void rule__Sub__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1372:1: ( ( 'sub' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1373:1: ( 'sub' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1373:1: ( 'sub' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1374:1: 'sub'
            {
             before(grammarAccess.getSubAccess().getSubKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Sub__Group__0__Impl2776); 
             after(grammarAccess.getSubAccess().getSubKeyword_0()); 

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
    // $ANTLR end "rule__Sub__Group__0__Impl"


    // $ANTLR start "rule__Sub__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1387:1: rule__Sub__Group__1 : rule__Sub__Group__1__Impl rule__Sub__Group__2 ;
    public final void rule__Sub__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1391:1: ( rule__Sub__Group__1__Impl rule__Sub__Group__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1392:2: rule__Sub__Group__1__Impl rule__Sub__Group__2
            {
            pushFollow(FOLLOW_rule__Sub__Group__1__Impl_in_rule__Sub__Group__12807);
            rule__Sub__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sub__Group__2_in_rule__Sub__Group__12810);
            rule__Sub__Group__2();

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
    // $ANTLR end "rule__Sub__Group__1"


    // $ANTLR start "rule__Sub__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1399:1: rule__Sub__Group__1__Impl : ( ( rule__Sub__RuleAssignment_1 ) ) ;
    public final void rule__Sub__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1403:1: ( ( ( rule__Sub__RuleAssignment_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1404:1: ( ( rule__Sub__RuleAssignment_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1404:1: ( ( rule__Sub__RuleAssignment_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1405:1: ( rule__Sub__RuleAssignment_1 )
            {
             before(grammarAccess.getSubAccess().getRuleAssignment_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1406:1: ( rule__Sub__RuleAssignment_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1406:2: rule__Sub__RuleAssignment_1
            {
            pushFollow(FOLLOW_rule__Sub__RuleAssignment_1_in_rule__Sub__Group__1__Impl2837);
            rule__Sub__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubAccess().getRuleAssignment_1()); 

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
    // $ANTLR end "rule__Sub__Group__1__Impl"


    // $ANTLR start "rule__Sub__Group__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1416:1: rule__Sub__Group__2 : rule__Sub__Group__2__Impl rule__Sub__Group__3 ;
    public final void rule__Sub__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1420:1: ( rule__Sub__Group__2__Impl rule__Sub__Group__3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1421:2: rule__Sub__Group__2__Impl rule__Sub__Group__3
            {
            pushFollow(FOLLOW_rule__Sub__Group__2__Impl_in_rule__Sub__Group__22867);
            rule__Sub__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sub__Group__3_in_rule__Sub__Group__22870);
            rule__Sub__Group__3();

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
    // $ANTLR end "rule__Sub__Group__2"


    // $ANTLR start "rule__Sub__Group__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1428:1: rule__Sub__Group__2__Impl : ( ':=' ) ;
    public final void rule__Sub__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1432:1: ( ( ':=' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1433:1: ( ':=' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1433:1: ( ':=' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1434:1: ':='
            {
             before(grammarAccess.getSubAccess().getColonEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Sub__Group__2__Impl2898); 
             after(grammarAccess.getSubAccess().getColonEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Sub__Group__2__Impl"


    // $ANTLR start "rule__Sub__Group__3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1447:1: rule__Sub__Group__3 : rule__Sub__Group__3__Impl rule__Sub__Group__4 ;
    public final void rule__Sub__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1451:1: ( rule__Sub__Group__3__Impl rule__Sub__Group__4 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1452:2: rule__Sub__Group__3__Impl rule__Sub__Group__4
            {
            pushFollow(FOLLOW_rule__Sub__Group__3__Impl_in_rule__Sub__Group__32929);
            rule__Sub__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sub__Group__4_in_rule__Sub__Group__32932);
            rule__Sub__Group__4();

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
    // $ANTLR end "rule__Sub__Group__3"


    // $ANTLR start "rule__Sub__Group__3__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1459:1: rule__Sub__Group__3__Impl : ( ( rule__Sub__SubstitutionAssignment_3 ) ) ;
    public final void rule__Sub__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1463:1: ( ( ( rule__Sub__SubstitutionAssignment_3 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1464:1: ( ( rule__Sub__SubstitutionAssignment_3 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1464:1: ( ( rule__Sub__SubstitutionAssignment_3 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1465:1: ( rule__Sub__SubstitutionAssignment_3 )
            {
             before(grammarAccess.getSubAccess().getSubstitutionAssignment_3()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1466:1: ( rule__Sub__SubstitutionAssignment_3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1466:2: rule__Sub__SubstitutionAssignment_3
            {
            pushFollow(FOLLOW_rule__Sub__SubstitutionAssignment_3_in_rule__Sub__Group__3__Impl2959);
            rule__Sub__SubstitutionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubAccess().getSubstitutionAssignment_3()); 

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
    // $ANTLR end "rule__Sub__Group__3__Impl"


    // $ANTLR start "rule__Sub__Group__4"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1476:1: rule__Sub__Group__4 : rule__Sub__Group__4__Impl ;
    public final void rule__Sub__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1480:1: ( rule__Sub__Group__4__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1481:2: rule__Sub__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sub__Group__4__Impl_in_rule__Sub__Group__42989);
            rule__Sub__Group__4__Impl();

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
    // $ANTLR end "rule__Sub__Group__4"


    // $ANTLR start "rule__Sub__Group__4__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1487:1: rule__Sub__Group__4__Impl : ( ';' ) ;
    public final void rule__Sub__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1491:1: ( ( ';' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1492:1: ( ';' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1492:1: ( ';' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1493:1: ';'
            {
             before(grammarAccess.getSubAccess().getSemicolonKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Sub__Group__4__Impl3017); 
             after(grammarAccess.getSubAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__Sub__Group__4__Impl"


    // $ANTLR start "rule__New__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1516:1: rule__New__Group__0 : rule__New__Group__0__Impl rule__New__Group__1 ;
    public final void rule__New__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1520:1: ( rule__New__Group__0__Impl rule__New__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1521:2: rule__New__Group__0__Impl rule__New__Group__1
            {
            pushFollow(FOLLOW_rule__New__Group__0__Impl_in_rule__New__Group__03058);
            rule__New__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__New__Group__1_in_rule__New__Group__03061);
            rule__New__Group__1();

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
    // $ANTLR end "rule__New__Group__0"


    // $ANTLR start "rule__New__Group__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1528:1: rule__New__Group__0__Impl : ( 'new' ) ;
    public final void rule__New__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1532:1: ( ( 'new' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1533:1: ( 'new' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1533:1: ( 'new' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1534:1: 'new'
            {
             before(grammarAccess.getNewAccess().getNewKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__New__Group__0__Impl3089); 
             after(grammarAccess.getNewAccess().getNewKeyword_0()); 

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
    // $ANTLR end "rule__New__Group__0__Impl"


    // $ANTLR start "rule__New__Group__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1547:1: rule__New__Group__1 : rule__New__Group__1__Impl rule__New__Group__2 ;
    public final void rule__New__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1551:1: ( rule__New__Group__1__Impl rule__New__Group__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1552:2: rule__New__Group__1__Impl rule__New__Group__2
            {
            pushFollow(FOLLOW_rule__New__Group__1__Impl_in_rule__New__Group__13120);
            rule__New__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__New__Group__2_in_rule__New__Group__13123);
            rule__New__Group__2();

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
    // $ANTLR end "rule__New__Group__1"


    // $ANTLR start "rule__New__Group__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1559:1: rule__New__Group__1__Impl : ( ( rule__New__TermAssignment_1 )? ) ;
    public final void rule__New__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1563:1: ( ( ( rule__New__TermAssignment_1 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1564:1: ( ( rule__New__TermAssignment_1 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1564:1: ( ( rule__New__TermAssignment_1 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1565:1: ( rule__New__TermAssignment_1 )?
            {
             before(grammarAccess.getNewAccess().getTermAssignment_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1566:1: ( rule__New__TermAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1566:2: rule__New__TermAssignment_1
                    {
                    pushFollow(FOLLOW_rule__New__TermAssignment_1_in_rule__New__Group__1__Impl3150);
                    rule__New__TermAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNewAccess().getTermAssignment_1()); 

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
    // $ANTLR end "rule__New__Group__1__Impl"


    // $ANTLR start "rule__New__Group__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1576:1: rule__New__Group__2 : rule__New__Group__2__Impl rule__New__Group__3 ;
    public final void rule__New__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1580:1: ( rule__New__Group__2__Impl rule__New__Group__3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1581:2: rule__New__Group__2__Impl rule__New__Group__3
            {
            pushFollow(FOLLOW_rule__New__Group__2__Impl_in_rule__New__Group__23181);
            rule__New__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__New__Group__3_in_rule__New__Group__23184);
            rule__New__Group__3();

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
    // $ANTLR end "rule__New__Group__2"


    // $ANTLR start "rule__New__Group__2__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1588:1: rule__New__Group__2__Impl : ( ( rule__New__RuleAssignment_2 ) ) ;
    public final void rule__New__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1592:1: ( ( ( rule__New__RuleAssignment_2 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1593:1: ( ( rule__New__RuleAssignment_2 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1593:1: ( ( rule__New__RuleAssignment_2 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1594:1: ( rule__New__RuleAssignment_2 )
            {
             before(grammarAccess.getNewAccess().getRuleAssignment_2()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1595:1: ( rule__New__RuleAssignment_2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1595:2: rule__New__RuleAssignment_2
            {
            pushFollow(FOLLOW_rule__New__RuleAssignment_2_in_rule__New__Group__2__Impl3211);
            rule__New__RuleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNewAccess().getRuleAssignment_2()); 

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
    // $ANTLR end "rule__New__Group__2__Impl"


    // $ANTLR start "rule__New__Group__3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1605:1: rule__New__Group__3 : rule__New__Group__3__Impl rule__New__Group__4 ;
    public final void rule__New__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1609:1: ( rule__New__Group__3__Impl rule__New__Group__4 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1610:2: rule__New__Group__3__Impl rule__New__Group__4
            {
            pushFollow(FOLLOW_rule__New__Group__3__Impl_in_rule__New__Group__33241);
            rule__New__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__New__Group__4_in_rule__New__Group__33244);
            rule__New__Group__4();

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
    // $ANTLR end "rule__New__Group__3"


    // $ANTLR start "rule__New__Group__3__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1617:1: rule__New__Group__3__Impl : ( ':=' ) ;
    public final void rule__New__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1621:1: ( ( ':=' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1622:1: ( ':=' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1622:1: ( ':=' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1623:1: ':='
            {
             before(grammarAccess.getNewAccess().getColonEqualsSignKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__New__Group__3__Impl3272); 
             after(grammarAccess.getNewAccess().getColonEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__New__Group__3__Impl"


    // $ANTLR start "rule__New__Group__4"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1636:1: rule__New__Group__4 : rule__New__Group__4__Impl rule__New__Group__5 ;
    public final void rule__New__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1640:1: ( rule__New__Group__4__Impl rule__New__Group__5 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1641:2: rule__New__Group__4__Impl rule__New__Group__5
            {
            pushFollow(FOLLOW_rule__New__Group__4__Impl_in_rule__New__Group__43303);
            rule__New__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__New__Group__5_in_rule__New__Group__43306);
            rule__New__Group__5();

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
    // $ANTLR end "rule__New__Group__4"


    // $ANTLR start "rule__New__Group__4__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1648:1: rule__New__Group__4__Impl : ( ( rule__New__DefinitionAssignment_4 ) ) ;
    public final void rule__New__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1652:1: ( ( ( rule__New__DefinitionAssignment_4 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1653:1: ( ( rule__New__DefinitionAssignment_4 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1653:1: ( ( rule__New__DefinitionAssignment_4 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1654:1: ( rule__New__DefinitionAssignment_4 )
            {
             before(grammarAccess.getNewAccess().getDefinitionAssignment_4()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1655:1: ( rule__New__DefinitionAssignment_4 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1655:2: rule__New__DefinitionAssignment_4
            {
            pushFollow(FOLLOW_rule__New__DefinitionAssignment_4_in_rule__New__Group__4__Impl3333);
            rule__New__DefinitionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNewAccess().getDefinitionAssignment_4()); 

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
    // $ANTLR end "rule__New__Group__4__Impl"


    // $ANTLR start "rule__New__Group__5"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1665:1: rule__New__Group__5 : rule__New__Group__5__Impl ;
    public final void rule__New__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1669:1: ( rule__New__Group__5__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1670:2: rule__New__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__New__Group__5__Impl_in_rule__New__Group__53363);
            rule__New__Group__5__Impl();

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
    // $ANTLR end "rule__New__Group__5"


    // $ANTLR start "rule__New__Group__5__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1676:1: rule__New__Group__5__Impl : ( ';' ) ;
    public final void rule__New__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1680:1: ( ( ';' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1681:1: ( ';' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1681:1: ( ';' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1682:1: ';'
            {
             before(grammarAccess.getNewAccess().getSemicolonKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__New__Group__5__Impl3391); 
             after(grammarAccess.getNewAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__New__Group__5__Impl"


    // $ANTLR start "rule__Alternative__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1707:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1711:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1712:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_rule__Alternative__Group__0__Impl_in_rule__Alternative__Group__03434);
            rule__Alternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group__1_in_rule__Alternative__Group__03437);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1719:1: rule__Alternative__Group__0__Impl : ( ruleSequence ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1723:1: ( ( ruleSequence ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1724:1: ( ruleSequence )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1724:1: ( ruleSequence )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1725:1: ruleSequence
            {
             before(grammarAccess.getAlternativeAccess().getSequenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Alternative__Group__0__Impl3464);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1736:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1740:1: ( rule__Alternative__Group__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1741:2: rule__Alternative__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Alternative__Group__1__Impl_in_rule__Alternative__Group__13493);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1747:1: rule__Alternative__Group__1__Impl : ( ( rule__Alternative__Group_1__0 )? ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1751:1: ( ( ( rule__Alternative__Group_1__0 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1752:1: ( ( rule__Alternative__Group_1__0 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1752:1: ( ( rule__Alternative__Group_1__0 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1753:1: ( rule__Alternative__Group_1__0 )?
            {
             before(grammarAccess.getAlternativeAccess().getGroup_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1754:1: ( rule__Alternative__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1754:2: rule__Alternative__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Alternative__Group_1__0_in_rule__Alternative__Group__1__Impl3520);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1768:1: rule__Alternative__Group_1__0 : rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1 ;
    public final void rule__Alternative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1772:1: ( rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1773:2: rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1
            {
            pushFollow(FOLLOW_rule__Alternative__Group_1__0__Impl_in_rule__Alternative__Group_1__03555);
            rule__Alternative__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group_1__1_in_rule__Alternative__Group_1__03558);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1780:1: rule__Alternative__Group_1__0__Impl : ( () ) ;
    public final void rule__Alternative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1784:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1785:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1785:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1786:1: ()
            {
             before(grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1787:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1789:1: 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1799:1: rule__Alternative__Group_1__1 : rule__Alternative__Group_1__1__Impl rule__Alternative__Group_1__2 ;
    public final void rule__Alternative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1803:1: ( rule__Alternative__Group_1__1__Impl rule__Alternative__Group_1__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1804:2: rule__Alternative__Group_1__1__Impl rule__Alternative__Group_1__2
            {
            pushFollow(FOLLOW_rule__Alternative__Group_1__1__Impl_in_rule__Alternative__Group_1__13616);
            rule__Alternative__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternative__Group_1__2_in_rule__Alternative__Group_1__13619);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1811:1: rule__Alternative__Group_1__1__Impl : ( '|' ) ;
    public final void rule__Alternative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1815:1: ( ( '|' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1816:1: ( '|' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1816:1: ( '|' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1817:1: '|'
            {
             before(grammarAccess.getAlternativeAccess().getVerticalLineKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__Alternative__Group_1__1__Impl3647); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1830:1: rule__Alternative__Group_1__2 : rule__Alternative__Group_1__2__Impl ;
    public final void rule__Alternative__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1834:1: ( rule__Alternative__Group_1__2__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1835:2: rule__Alternative__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Alternative__Group_1__2__Impl_in_rule__Alternative__Group_1__23678);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1841:1: rule__Alternative__Group_1__2__Impl : ( ( rule__Alternative__RightAssignment_1_2 ) ) ;
    public final void rule__Alternative__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1845:1: ( ( ( rule__Alternative__RightAssignment_1_2 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1846:1: ( ( rule__Alternative__RightAssignment_1_2 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1846:1: ( ( rule__Alternative__RightAssignment_1_2 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1847:1: ( rule__Alternative__RightAssignment_1_2 )
            {
             before(grammarAccess.getAlternativeAccess().getRightAssignment_1_2()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1848:1: ( rule__Alternative__RightAssignment_1_2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1848:2: rule__Alternative__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Alternative__RightAssignment_1_2_in_rule__Alternative__Group_1__2__Impl3705);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1864:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1868:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1869:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__03741);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__03744);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1876:1: rule__Sequence__Group__0__Impl : ( ruleCardinality ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1880:1: ( ( ruleCardinality ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1881:1: ( ruleCardinality )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1881:1: ( ruleCardinality )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1882:1: ruleCardinality
            {
             before(grammarAccess.getSequenceAccess().getCardinalityParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Sequence__Group__0__Impl3771);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1893:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1897:1: ( rule__Sequence__Group__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1898:2: rule__Sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__13800);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1904:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__Group_1__0 )? ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1908:1: ( ( ( rule__Sequence__Group_1__0 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1909:1: ( ( rule__Sequence__Group_1__0 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1909:1: ( ( rule__Sequence__Group_1__0 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1910:1: ( rule__Sequence__Group_1__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1911:1: ( rule__Sequence__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==RULE_STRING||(LA11_0>=25 && LA11_0<=26)||LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1911:2: rule__Sequence__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_1__0_in_rule__Sequence__Group__1__Impl3827);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1925:1: rule__Sequence__Group_1__0 : rule__Sequence__Group_1__0__Impl rule__Sequence__Group_1__1 ;
    public final void rule__Sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1929:1: ( rule__Sequence__Group_1__0__Impl rule__Sequence__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1930:2: rule__Sequence__Group_1__0__Impl rule__Sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_1__0__Impl_in_rule__Sequence__Group_1__03862);
            rule__Sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_1__1_in_rule__Sequence__Group_1__03865);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1937:1: rule__Sequence__Group_1__0__Impl : ( () ) ;
    public final void rule__Sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1941:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1942:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1942:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1943:1: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1944:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1946:1: 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1956:1: rule__Sequence__Group_1__1 : rule__Sequence__Group_1__1__Impl ;
    public final void rule__Sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1960:1: ( rule__Sequence__Group_1__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1961:2: rule__Sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_1__1__Impl_in_rule__Sequence__Group_1__13923);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1967:1: rule__Sequence__Group_1__1__Impl : ( ( rule__Sequence__RightAssignment_1_1 ) ) ;
    public final void rule__Sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1971:1: ( ( ( rule__Sequence__RightAssignment_1_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1972:1: ( ( rule__Sequence__RightAssignment_1_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1972:1: ( ( rule__Sequence__RightAssignment_1_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1973:1: ( rule__Sequence__RightAssignment_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getRightAssignment_1_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1974:1: ( rule__Sequence__RightAssignment_1_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1974:2: rule__Sequence__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__RightAssignment_1_1_in_rule__Sequence__Group_1__1__Impl3950);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1988:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1992:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:1993:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__03984);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__03987);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2000:1: rule__Cardinality__Group__0__Impl : ( ruleOperated ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2004:1: ( ( ruleOperated ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2005:1: ( ruleOperated )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2005:1: ( ruleOperated )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2006:1: ruleOperated
            {
             before(grammarAccess.getCardinalityAccess().getOperatedParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOperated_in_rule__Cardinality__Group__0__Impl4014);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2017:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2021:1: ( rule__Cardinality__Group__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2022:2: rule__Cardinality__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__14043);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2028:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Alternatives_1 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2032:1: ( ( ( rule__Cardinality__Alternatives_1 )? ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2033:1: ( ( rule__Cardinality__Alternatives_1 )? )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2033:1: ( ( rule__Cardinality__Alternatives_1 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2034:1: ( rule__Cardinality__Alternatives_1 )?
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2035:1: ( rule__Cardinality__Alternatives_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=22 && LA12_0<=24)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2035:2: rule__Cardinality__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Cardinality__Alternatives_1_in_rule__Cardinality__Group__1__Impl4070);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2049:1: rule__Cardinality__Group_1_0__0 : rule__Cardinality__Group_1_0__0__Impl rule__Cardinality__Group_1_0__1 ;
    public final void rule__Cardinality__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2053:1: ( rule__Cardinality__Group_1_0__0__Impl rule__Cardinality__Group_1_0__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2054:2: rule__Cardinality__Group_1_0__0__Impl rule__Cardinality__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_0__0__Impl_in_rule__Cardinality__Group_1_0__04105);
            rule__Cardinality__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1_0__1_in_rule__Cardinality__Group_1_0__04108);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2061:1: rule__Cardinality__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Cardinality__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2065:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2066:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2066:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2067:1: ()
            {
             before(grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2068:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2070:1: 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2080:1: rule__Cardinality__Group_1_0__1 : rule__Cardinality__Group_1_0__1__Impl ;
    public final void rule__Cardinality__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2084:1: ( rule__Cardinality__Group_1_0__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2085:2: rule__Cardinality__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_0__1__Impl_in_rule__Cardinality__Group_1_0__14166);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2091:1: rule__Cardinality__Group_1_0__1__Impl : ( '?' ) ;
    public final void rule__Cardinality__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2095:1: ( ( '?' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2096:1: ( '?' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2096:1: ( '?' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2097:1: '?'
            {
             before(grammarAccess.getCardinalityAccess().getQuestionMarkKeyword_1_0_1()); 
            match(input,22,FOLLOW_22_in_rule__Cardinality__Group_1_0__1__Impl4194); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2114:1: rule__Cardinality__Group_1_1__0 : rule__Cardinality__Group_1_1__0__Impl rule__Cardinality__Group_1_1__1 ;
    public final void rule__Cardinality__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2118:1: ( rule__Cardinality__Group_1_1__0__Impl rule__Cardinality__Group_1_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2119:2: rule__Cardinality__Group_1_1__0__Impl rule__Cardinality__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_1__0__Impl_in_rule__Cardinality__Group_1_1__04229);
            rule__Cardinality__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1_1__1_in_rule__Cardinality__Group_1_1__04232);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2126:1: rule__Cardinality__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Cardinality__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2130:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2131:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2131:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2132:1: ()
            {
             before(grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2133:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2135:1: 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2145:1: rule__Cardinality__Group_1_1__1 : rule__Cardinality__Group_1_1__1__Impl ;
    public final void rule__Cardinality__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2149:1: ( rule__Cardinality__Group_1_1__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2150:2: rule__Cardinality__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_1__1__Impl_in_rule__Cardinality__Group_1_1__14290);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2156:1: rule__Cardinality__Group_1_1__1__Impl : ( '*' ) ;
    public final void rule__Cardinality__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2160:1: ( ( '*' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2161:1: ( '*' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2161:1: ( '*' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2162:1: '*'
            {
             before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_1_1()); 
            match(input,23,FOLLOW_23_in_rule__Cardinality__Group_1_1__1__Impl4318); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2179:1: rule__Cardinality__Group_1_2__0 : rule__Cardinality__Group_1_2__0__Impl rule__Cardinality__Group_1_2__1 ;
    public final void rule__Cardinality__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2183:1: ( rule__Cardinality__Group_1_2__0__Impl rule__Cardinality__Group_1_2__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2184:2: rule__Cardinality__Group_1_2__0__Impl rule__Cardinality__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_2__0__Impl_in_rule__Cardinality__Group_1_2__04353);
            rule__Cardinality__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cardinality__Group_1_2__1_in_rule__Cardinality__Group_1_2__04356);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2191:1: rule__Cardinality__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Cardinality__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2195:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2196:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2196:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2197:1: ()
            {
             before(grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2198:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2200:1: 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2210:1: rule__Cardinality__Group_1_2__1 : rule__Cardinality__Group_1_2__1__Impl ;
    public final void rule__Cardinality__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2214:1: ( rule__Cardinality__Group_1_2__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2215:2: rule__Cardinality__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Cardinality__Group_1_2__1__Impl_in_rule__Cardinality__Group_1_2__14414);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2221:1: rule__Cardinality__Group_1_2__1__Impl : ( '+' ) ;
    public final void rule__Cardinality__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2225:1: ( ( '+' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2226:1: ( '+' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2226:1: ( '+' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2227:1: '+'
            {
             before(grammarAccess.getCardinalityAccess().getPlusSignKeyword_1_2_1()); 
            match(input,24,FOLLOW_24_in_rule__Cardinality__Group_1_2__1__Impl4442); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2244:1: rule__Operated__Group_0__0 : rule__Operated__Group_0__0__Impl rule__Operated__Group_0__1 ;
    public final void rule__Operated__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2248:1: ( rule__Operated__Group_0__0__Impl rule__Operated__Group_0__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2249:2: rule__Operated__Group_0__0__Impl rule__Operated__Group_0__1
            {
            pushFollow(FOLLOW_rule__Operated__Group_0__0__Impl_in_rule__Operated__Group_0__04477);
            rule__Operated__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operated__Group_0__1_in_rule__Operated__Group_0__04480);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2256:1: rule__Operated__Group_0__0__Impl : ( '->' ) ;
    public final void rule__Operated__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2260:1: ( ( '->' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2261:1: ( '->' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2261:1: ( '->' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2262:1: '->'
            {
             before(grammarAccess.getOperatedAccess().getHyphenMinusGreaterThanSignKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__Operated__Group_0__0__Impl4508); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2275:1: rule__Operated__Group_0__1 : rule__Operated__Group_0__1__Impl rule__Operated__Group_0__2 ;
    public final void rule__Operated__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2279:1: ( rule__Operated__Group_0__1__Impl rule__Operated__Group_0__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2280:2: rule__Operated__Group_0__1__Impl rule__Operated__Group_0__2
            {
            pushFollow(FOLLOW_rule__Operated__Group_0__1__Impl_in_rule__Operated__Group_0__14539);
            rule__Operated__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operated__Group_0__2_in_rule__Operated__Group_0__14542);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2287:1: rule__Operated__Group_0__1__Impl : ( () ) ;
    public final void rule__Operated__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2291:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2292:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2292:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2293:1: ()
            {
             before(grammarAccess.getOperatedAccess().getUntilAction_0_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2294:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2296:1: 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2306:1: rule__Operated__Group_0__2 : rule__Operated__Group_0__2__Impl ;
    public final void rule__Operated__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2310:1: ( rule__Operated__Group_0__2__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2311:2: rule__Operated__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Operated__Group_0__2__Impl_in_rule__Operated__Group_0__24600);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2317:1: rule__Operated__Group_0__2__Impl : ( ( rule__Operated__OfAssignment_0_2 ) ) ;
    public final void rule__Operated__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2321:1: ( ( ( rule__Operated__OfAssignment_0_2 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2322:1: ( ( rule__Operated__OfAssignment_0_2 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2322:1: ( ( rule__Operated__OfAssignment_0_2 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2323:1: ( rule__Operated__OfAssignment_0_2 )
            {
             before(grammarAccess.getOperatedAccess().getOfAssignment_0_2()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2324:1: ( rule__Operated__OfAssignment_0_2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2324:2: rule__Operated__OfAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Operated__OfAssignment_0_2_in_rule__Operated__Group_0__2__Impl4627);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2340:1: rule__Operated__Group_1__0 : rule__Operated__Group_1__0__Impl rule__Operated__Group_1__1 ;
    public final void rule__Operated__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2344:1: ( rule__Operated__Group_1__0__Impl rule__Operated__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2345:2: rule__Operated__Group_1__0__Impl rule__Operated__Group_1__1
            {
            pushFollow(FOLLOW_rule__Operated__Group_1__0__Impl_in_rule__Operated__Group_1__04663);
            rule__Operated__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operated__Group_1__1_in_rule__Operated__Group_1__04666);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2352:1: rule__Operated__Group_1__0__Impl : ( '!' ) ;
    public final void rule__Operated__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2356:1: ( ( '!' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2357:1: ( '!' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2357:1: ( '!' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2358:1: '!'
            {
             before(grammarAccess.getOperatedAccess().getExclamationMarkKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Operated__Group_1__0__Impl4694); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2371:1: rule__Operated__Group_1__1 : rule__Operated__Group_1__1__Impl rule__Operated__Group_1__2 ;
    public final void rule__Operated__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2375:1: ( rule__Operated__Group_1__1__Impl rule__Operated__Group_1__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2376:2: rule__Operated__Group_1__1__Impl rule__Operated__Group_1__2
            {
            pushFollow(FOLLOW_rule__Operated__Group_1__1__Impl_in_rule__Operated__Group_1__14725);
            rule__Operated__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Operated__Group_1__2_in_rule__Operated__Group_1__14728);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2383:1: rule__Operated__Group_1__1__Impl : ( () ) ;
    public final void rule__Operated__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2387:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2388:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2388:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2389:1: ()
            {
             before(grammarAccess.getOperatedAccess().getNegationAction_1_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2390:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2392:1: 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2402:1: rule__Operated__Group_1__2 : rule__Operated__Group_1__2__Impl ;
    public final void rule__Operated__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2406:1: ( rule__Operated__Group_1__2__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2407:2: rule__Operated__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Operated__Group_1__2__Impl_in_rule__Operated__Group_1__24786);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2413:1: rule__Operated__Group_1__2__Impl : ( ( rule__Operated__OfAssignment_1_2 ) ) ;
    public final void rule__Operated__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2417:1: ( ( ( rule__Operated__OfAssignment_1_2 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2418:1: ( ( rule__Operated__OfAssignment_1_2 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2418:1: ( ( rule__Operated__OfAssignment_1_2 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2419:1: ( rule__Operated__OfAssignment_1_2 )
            {
             before(grammarAccess.getOperatedAccess().getOfAssignment_1_2()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2420:1: ( rule__Operated__OfAssignment_1_2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2420:2: rule__Operated__OfAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Operated__OfAssignment_1_2_in_rule__Operated__Group_1__2__Impl4813);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2436:1: rule__Terminal__Group_0__0 : rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1 ;
    public final void rule__Terminal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2440:1: ( rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2441:2: rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Terminal__Group_0__0__Impl_in_rule__Terminal__Group_0__04849);
            rule__Terminal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal__Group_0__1_in_rule__Terminal__Group_0__04852);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2448:1: rule__Terminal__Group_0__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2452:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2453:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2453:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2454:1: ()
            {
             before(grammarAccess.getTerminalAccess().getRangeAction_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2455:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2457:1: 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2467:1: rule__Terminal__Group_0__1 : rule__Terminal__Group_0__1__Impl rule__Terminal__Group_0__2 ;
    public final void rule__Terminal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2471:1: ( rule__Terminal__Group_0__1__Impl rule__Terminal__Group_0__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2472:2: rule__Terminal__Group_0__1__Impl rule__Terminal__Group_0__2
            {
            pushFollow(FOLLOW_rule__Terminal__Group_0__1__Impl_in_rule__Terminal__Group_0__14910);
            rule__Terminal__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal__Group_0__2_in_rule__Terminal__Group_0__14913);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2479:1: rule__Terminal__Group_0__1__Impl : ( ( rule__Terminal__MinAssignment_0_1 ) ) ;
    public final void rule__Terminal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2483:1: ( ( ( rule__Terminal__MinAssignment_0_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2484:1: ( ( rule__Terminal__MinAssignment_0_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2484:1: ( ( rule__Terminal__MinAssignment_0_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2485:1: ( rule__Terminal__MinAssignment_0_1 )
            {
             before(grammarAccess.getTerminalAccess().getMinAssignment_0_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2486:1: ( rule__Terminal__MinAssignment_0_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2486:2: rule__Terminal__MinAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Terminal__MinAssignment_0_1_in_rule__Terminal__Group_0__1__Impl4940);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2496:1: rule__Terminal__Group_0__2 : rule__Terminal__Group_0__2__Impl rule__Terminal__Group_0__3 ;
    public final void rule__Terminal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2500:1: ( rule__Terminal__Group_0__2__Impl rule__Terminal__Group_0__3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2501:2: rule__Terminal__Group_0__2__Impl rule__Terminal__Group_0__3
            {
            pushFollow(FOLLOW_rule__Terminal__Group_0__2__Impl_in_rule__Terminal__Group_0__24970);
            rule__Terminal__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal__Group_0__3_in_rule__Terminal__Group_0__24973);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2508:1: rule__Terminal__Group_0__2__Impl : ( '..' ) ;
    public final void rule__Terminal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2512:1: ( ( '..' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2513:1: ( '..' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2513:1: ( '..' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2514:1: '..'
            {
             before(grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__Terminal__Group_0__2__Impl5001); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2527:1: rule__Terminal__Group_0__3 : rule__Terminal__Group_0__3__Impl ;
    public final void rule__Terminal__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2531:1: ( rule__Terminal__Group_0__3__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2532:2: rule__Terminal__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Terminal__Group_0__3__Impl_in_rule__Terminal__Group_0__35032);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2538:1: rule__Terminal__Group_0__3__Impl : ( ( rule__Terminal__MaxAssignment_0_3 ) ) ;
    public final void rule__Terminal__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2542:1: ( ( ( rule__Terminal__MaxAssignment_0_3 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2543:1: ( ( rule__Terminal__MaxAssignment_0_3 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2543:1: ( ( rule__Terminal__MaxAssignment_0_3 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2544:1: ( rule__Terminal__MaxAssignment_0_3 )
            {
             before(grammarAccess.getTerminalAccess().getMaxAssignment_0_3()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2545:1: ( rule__Terminal__MaxAssignment_0_3 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2545:2: rule__Terminal__MaxAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Terminal__MaxAssignment_0_3_in_rule__Terminal__Group_0__3__Impl5059);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2563:1: rule__Terminal__Group_1__0 : rule__Terminal__Group_1__0__Impl rule__Terminal__Group_1__1 ;
    public final void rule__Terminal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2567:1: ( rule__Terminal__Group_1__0__Impl rule__Terminal__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2568:2: rule__Terminal__Group_1__0__Impl rule__Terminal__Group_1__1
            {
            pushFollow(FOLLOW_rule__Terminal__Group_1__0__Impl_in_rule__Terminal__Group_1__05097);
            rule__Terminal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal__Group_1__1_in_rule__Terminal__Group_1__05100);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2575:1: rule__Terminal__Group_1__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2579:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2580:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2580:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2581:1: ()
            {
             before(grammarAccess.getTerminalAccess().getSingleAction_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2582:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2584:1: 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2594:1: rule__Terminal__Group_1__1 : rule__Terminal__Group_1__1__Impl ;
    public final void rule__Terminal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2598:1: ( rule__Terminal__Group_1__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2599:2: rule__Terminal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Terminal__Group_1__1__Impl_in_rule__Terminal__Group_1__15158);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2605:1: rule__Terminal__Group_1__1__Impl : ( ( rule__Terminal__TokenAssignment_1_1 ) ) ;
    public final void rule__Terminal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2609:1: ( ( ( rule__Terminal__TokenAssignment_1_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2610:1: ( ( rule__Terminal__TokenAssignment_1_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2610:1: ( ( rule__Terminal__TokenAssignment_1_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2611:1: ( rule__Terminal__TokenAssignment_1_1 )
            {
             before(grammarAccess.getTerminalAccess().getTokenAssignment_1_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2612:1: ( rule__Terminal__TokenAssignment_1_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2612:2: rule__Terminal__TokenAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Terminal__TokenAssignment_1_1_in_rule__Terminal__Group_1__1__Impl5185);
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


    // $ANTLR start "rule__Terminal__Group_2__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2626:1: rule__Terminal__Group_2__0 : rule__Terminal__Group_2__0__Impl rule__Terminal__Group_2__1 ;
    public final void rule__Terminal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2630:1: ( rule__Terminal__Group_2__0__Impl rule__Terminal__Group_2__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2631:2: rule__Terminal__Group_2__0__Impl rule__Terminal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Terminal__Group_2__0__Impl_in_rule__Terminal__Group_2__05219);
            rule__Terminal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Terminal__Group_2__1_in_rule__Terminal__Group_2__05222);
            rule__Terminal__Group_2__1();

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
    // $ANTLR end "rule__Terminal__Group_2__0"


    // $ANTLR start "rule__Terminal__Group_2__0__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2638:1: rule__Terminal__Group_2__0__Impl : ( () ) ;
    public final void rule__Terminal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2642:1: ( ( () ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2643:1: ( () )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2643:1: ( () )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2644:1: ()
            {
             before(grammarAccess.getTerminalAccess().getReferenceAction_2_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2645:1: ()
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2647:1: 
            {
            }

             after(grammarAccess.getTerminalAccess().getReferenceAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_2__0__Impl"


    // $ANTLR start "rule__Terminal__Group_2__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2657:1: rule__Terminal__Group_2__1 : rule__Terminal__Group_2__1__Impl ;
    public final void rule__Terminal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2661:1: ( rule__Terminal__Group_2__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2662:2: rule__Terminal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Terminal__Group_2__1__Impl_in_rule__Terminal__Group_2__15280);
            rule__Terminal__Group_2__1__Impl();

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
    // $ANTLR end "rule__Terminal__Group_2__1"


    // $ANTLR start "rule__Terminal__Group_2__1__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2668:1: rule__Terminal__Group_2__1__Impl : ( ( rule__Terminal__ToAssignment_2_1 ) ) ;
    public final void rule__Terminal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2672:1: ( ( ( rule__Terminal__ToAssignment_2_1 ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2673:1: ( ( rule__Terminal__ToAssignment_2_1 ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2673:1: ( ( rule__Terminal__ToAssignment_2_1 ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2674:1: ( rule__Terminal__ToAssignment_2_1 )
            {
             before(grammarAccess.getTerminalAccess().getToAssignment_2_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2675:1: ( rule__Terminal__ToAssignment_2_1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2675:2: rule__Terminal__ToAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Terminal__ToAssignment_2_1_in_rule__Terminal__Group_2__1__Impl5307);
            rule__Terminal__ToAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTerminalAccess().getToAssignment_2_1()); 

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
    // $ANTLR end "rule__Terminal__Group_2__1__Impl"


    // $ANTLR start "rule__ParenthesizedElement__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2689:1: rule__ParenthesizedElement__Group__0 : rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1 ;
    public final void rule__ParenthesizedElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2693:1: ( rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2694:2: rule__ParenthesizedElement__Group__0__Impl rule__ParenthesizedElement__Group__1
            {
            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__0__Impl_in_rule__ParenthesizedElement__Group__05341);
            rule__ParenthesizedElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__1_in_rule__ParenthesizedElement__Group__05344);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2701:1: rule__ParenthesizedElement__Group__0__Impl : ( '(' ) ;
    public final void rule__ParenthesizedElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2705:1: ( ( '(' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2706:1: ( '(' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2706:1: ( '(' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2707:1: '('
            {
             before(grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ParenthesizedElement__Group__0__Impl5372); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2720:1: rule__ParenthesizedElement__Group__1 : rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2 ;
    public final void rule__ParenthesizedElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2724:1: ( rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2725:2: rule__ParenthesizedElement__Group__1__Impl rule__ParenthesizedElement__Group__2
            {
            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__1__Impl_in_rule__ParenthesizedElement__Group__15403);
            rule__ParenthesizedElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__2_in_rule__ParenthesizedElement__Group__15406);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2732:1: rule__ParenthesizedElement__Group__1__Impl : ( ruleAlternative ) ;
    public final void rule__ParenthesizedElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2736:1: ( ( ruleAlternative ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2737:1: ( ruleAlternative )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2737:1: ( ruleAlternative )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2738:1: ruleAlternative
            {
             before(grammarAccess.getParenthesizedElementAccess().getAlternativeParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleAlternative_in_rule__ParenthesizedElement__Group__1__Impl5433);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2749:1: rule__ParenthesizedElement__Group__2 : rule__ParenthesizedElement__Group__2__Impl ;
    public final void rule__ParenthesizedElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2753:1: ( rule__ParenthesizedElement__Group__2__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2754:2: rule__ParenthesizedElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParenthesizedElement__Group__2__Impl_in_rule__ParenthesizedElement__Group__25462);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2760:1: rule__ParenthesizedElement__Group__2__Impl : ( ')' ) ;
    public final void rule__ParenthesizedElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2764:1: ( ( ')' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2765:1: ( ')' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2765:1: ( ')' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2766:1: ')'
            {
             before(grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__ParenthesizedElement__Group__2__Impl5490); 
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


    // $ANTLR start "rule__GrammarID__Group__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2785:1: rule__GrammarID__Group__0 : rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1 ;
    public final void rule__GrammarID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2789:1: ( rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2790:2: rule__GrammarID__Group__0__Impl rule__GrammarID__Group__1
            {
            pushFollow(FOLLOW_rule__GrammarID__Group__0__Impl_in_rule__GrammarID__Group__05527);
            rule__GrammarID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrammarID__Group__1_in_rule__GrammarID__Group__05530);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2797:1: rule__GrammarID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__GrammarID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2801:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2802:1: ( RULE_ID )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2802:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2803:1: RULE_ID
            {
             before(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrammarID__Group__0__Impl5557); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2814:1: rule__GrammarID__Group__1 : rule__GrammarID__Group__1__Impl ;
    public final void rule__GrammarID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2818:1: ( rule__GrammarID__Group__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2819:2: rule__GrammarID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GrammarID__Group__1__Impl_in_rule__GrammarID__Group__15586);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2825:1: rule__GrammarID__Group__1__Impl : ( ( rule__GrammarID__Group_1__0 )* ) ;
    public final void rule__GrammarID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2829:1: ( ( ( rule__GrammarID__Group_1__0 )* ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2830:1: ( ( rule__GrammarID__Group_1__0 )* )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2830:1: ( ( rule__GrammarID__Group_1__0 )* )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2831:1: ( rule__GrammarID__Group_1__0 )*
            {
             before(grammarAccess.getGrammarIDAccess().getGroup_1()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2832:1: ( rule__GrammarID__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2832:2: rule__GrammarID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GrammarID__Group_1__0_in_rule__GrammarID__Group__1__Impl5613);
            	    rule__GrammarID__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2846:1: rule__GrammarID__Group_1__0 : rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1 ;
    public final void rule__GrammarID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2850:1: ( rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1 )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2851:2: rule__GrammarID__Group_1__0__Impl rule__GrammarID__Group_1__1
            {
            pushFollow(FOLLOW_rule__GrammarID__Group_1__0__Impl_in_rule__GrammarID__Group_1__05648);
            rule__GrammarID__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrammarID__Group_1__1_in_rule__GrammarID__Group_1__05651);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2858:1: rule__GrammarID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__GrammarID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2862:1: ( ( '.' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2863:1: ( '.' )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2863:1: ( '.' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2864:1: '.'
            {
             before(grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__GrammarID__Group_1__0__Impl5679); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2877:1: rule__GrammarID__Group_1__1 : rule__GrammarID__Group_1__1__Impl ;
    public final void rule__GrammarID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2881:1: ( rule__GrammarID__Group_1__1__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2882:2: rule__GrammarID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GrammarID__Group_1__1__Impl_in_rule__GrammarID__Group_1__15710);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2888:1: rule__GrammarID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__GrammarID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2892:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2893:1: ( RULE_ID )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2893:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2894:1: RULE_ID
            {
             before(grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrammarID__Group_1__1__Impl5737); 
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


    // $ANTLR start "rule__Test__UnorderedGroup_4"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2910:1: rule__Test__UnorderedGroup_4 : ( rule__Test__UnorderedGroup_4__0 )? ;
    public final void rule__Test__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTestAccess().getUnorderedGroup_4());
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2915:1: ( ( rule__Test__UnorderedGroup_4__0 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2916:2: ( rule__Test__UnorderedGroup_4__0 )?
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2916:2: ( rule__Test__UnorderedGroup_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 ==31 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1) ) ) {
                alt14=1;
            }
            else if ( LA14_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2916:2: rule__Test__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_rule__Test__UnorderedGroup_4__0_in_rule__Test__UnorderedGroup_45771);
                    rule__Test__UnorderedGroup_4__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTestAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__UnorderedGroup_4"


    // $ANTLR start "rule__Test__UnorderedGroup_4__Impl"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2926:1: rule__Test__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Test__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Test__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Test__Group_4_2__0 ) ) ) ) ) ;
    public final void rule__Test__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2931:1: ( ( ({...}? => ( ( ( rule__Test__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Test__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Test__Group_4_2__0 ) ) ) ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2932:3: ( ({...}? => ( ( ( rule__Test__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Test__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Test__Group_4_2__0 ) ) ) ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2932:3: ( ({...}? => ( ( ( rule__Test__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Test__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Test__Group_4_2__0 ) ) ) ) )
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( LA15_0 ==31 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1) ) ) {
                int LA15_1 = input.LA(2);

                if ( LA15_1 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_1 ==RULE_INT && getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( LA15_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2) ) {
                alt15=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2934:4: ({...}? => ( ( ( rule__Test__Group_4_0__0 ) ) ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2934:4: ({...}? => ( ( ( rule__Test__Group_4_0__0 ) ) ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2935:5: {...}? => ( ( ( rule__Test__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Test__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2935:101: ( ( ( rule__Test__Group_4_0__0 ) ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2936:6: ( ( rule__Test__Group_4_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2942:6: ( ( rule__Test__Group_4_0__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2944:7: ( rule__Test__Group_4_0__0 )
                    {
                     before(grammarAccess.getTestAccess().getGroup_4_0()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2945:7: ( rule__Test__Group_4_0__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2945:8: rule__Test__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Test__Group_4_0__0_in_rule__Test__UnorderedGroup_4__Impl5858);
                    rule__Test__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTestAccess().getGroup_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2951:4: ({...}? => ( ( ( rule__Test__Group_4_1__0 ) ) ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2951:4: ({...}? => ( ( ( rule__Test__Group_4_1__0 ) ) ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2952:5: {...}? => ( ( ( rule__Test__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Test__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2952:101: ( ( ( rule__Test__Group_4_1__0 ) ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2953:6: ( ( rule__Test__Group_4_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2959:6: ( ( rule__Test__Group_4_1__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2961:7: ( rule__Test__Group_4_1__0 )
                    {
                     before(grammarAccess.getTestAccess().getGroup_4_1()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2962:7: ( rule__Test__Group_4_1__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2962:8: rule__Test__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Test__Group_4_1__0_in_rule__Test__UnorderedGroup_4__Impl5949);
                    rule__Test__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTestAccess().getGroup_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2968:4: ({...}? => ( ( ( rule__Test__Group_4_2__0 ) ) ) )
                    {
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2968:4: ({...}? => ( ( ( rule__Test__Group_4_2__0 ) ) ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2969:5: {...}? => ( ( ( rule__Test__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Test__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2969:101: ( ( ( rule__Test__Group_4_2__0 ) ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2970:6: ( ( rule__Test__Group_4_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2976:6: ( ( rule__Test__Group_4_2__0 ) )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2978:7: ( rule__Test__Group_4_2__0 )
                    {
                     before(grammarAccess.getTestAccess().getGroup_4_2()); 
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2979:7: ( rule__Test__Group_4_2__0 )
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2979:8: rule__Test__Group_4_2__0
                    {
                    pushFollow(FOLLOW_rule__Test__Group_4_2__0_in_rule__Test__UnorderedGroup_4__Impl6040);
                    rule__Test__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTestAccess().getGroup_4_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Test__UnorderedGroup_4__0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2994:1: rule__Test__UnorderedGroup_4__0 : rule__Test__UnorderedGroup_4__Impl ( rule__Test__UnorderedGroup_4__1 )? ;
    public final void rule__Test__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2998:1: ( rule__Test__UnorderedGroup_4__Impl ( rule__Test__UnorderedGroup_4__1 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:2999:2: rule__Test__UnorderedGroup_4__Impl ( rule__Test__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__Test__UnorderedGroup_4__Impl_in_rule__Test__UnorderedGroup_4__06099);
            rule__Test__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3000:2: ( rule__Test__UnorderedGroup_4__1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 ==31 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1) ) ) {
                alt16=1;
            }
            else if ( LA16_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3000:2: rule__Test__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__Test__UnorderedGroup_4__1_in_rule__Test__UnorderedGroup_4__06102);
                    rule__Test__UnorderedGroup_4__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Test__UnorderedGroup_4__0"


    // $ANTLR start "rule__Test__UnorderedGroup_4__1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3007:1: rule__Test__UnorderedGroup_4__1 : rule__Test__UnorderedGroup_4__Impl ( rule__Test__UnorderedGroup_4__2 )? ;
    public final void rule__Test__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3011:1: ( rule__Test__UnorderedGroup_4__Impl ( rule__Test__UnorderedGroup_4__2 )? )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3012:2: rule__Test__UnorderedGroup_4__Impl ( rule__Test__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__Test__UnorderedGroup_4__Impl_in_rule__Test__UnorderedGroup_4__16127);
            rule__Test__UnorderedGroup_4__Impl();

            state._fsp--;

            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3013:2: ( rule__Test__UnorderedGroup_4__2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 ==31 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1) ) ) {
                alt17=1;
            }
            else if ( LA17_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3013:2: rule__Test__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__Test__UnorderedGroup_4__2_in_rule__Test__UnorderedGroup_4__16130);
                    rule__Test__UnorderedGroup_4__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Test__UnorderedGroup_4__1"


    // $ANTLR start "rule__Test__UnorderedGroup_4__2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3020:1: rule__Test__UnorderedGroup_4__2 : rule__Test__UnorderedGroup_4__Impl ;
    public final void rule__Test__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3024:1: ( rule__Test__UnorderedGroup_4__Impl )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3025:2: rule__Test__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__Test__UnorderedGroup_4__Impl_in_rule__Test__UnorderedGroup_4__26155);
            rule__Test__UnorderedGroup_4__Impl();

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
    // $ANTLR end "rule__Test__UnorderedGroup_4__2"


    // $ANTLR start "rule__Model__TstsAssignment"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3038:1: rule__Model__TstsAssignment : ( ruleTest ) ;
    public final void rule__Model__TstsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3042:1: ( ( ruleTest ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3043:1: ( ruleTest )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3043:1: ( ruleTest )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3044:1: ruleTest
            {
             before(grammarAccess.getModelAccess().getTstsTestParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTest_in_rule__Model__TstsAssignment6189);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTstsTestParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__TstsAssignment"


    // $ANTLR start "rule__Test__NameAssignment_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3053:1: rule__Test__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3057:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3058:1: ( RULE_ID )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3058:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3059:1: RULE_ID
            {
             before(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Test__NameAssignment_16220); 
             after(grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Test__NameAssignment_1"


    // $ANTLR start "rule__Test__RefAssignment_3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3068:1: rule__Test__RefAssignment_3 : ( ( ruleGrammarID ) ) ;
    public final void rule__Test__RefAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3072:1: ( ( ( ruleGrammarID ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3073:1: ( ( ruleGrammarID ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3073:1: ( ( ruleGrammarID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3074:1: ( ruleGrammarID )
            {
             before(grammarAccess.getTestAccess().getRefGrammarCrossReference_3_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3075:1: ( ruleGrammarID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3076:1: ruleGrammarID
            {
             before(grammarAccess.getTestAccess().getRefGrammarGrammarIDParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleGrammarID_in_rule__Test__RefAssignment_36255);
            ruleGrammarID();

            state._fsp--;

             after(grammarAccess.getTestAccess().getRefGrammarGrammarIDParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTestAccess().getRefGrammarCrossReference_3_0()); 

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
    // $ANTLR end "rule__Test__RefAssignment_3"


    // $ANTLR start "rule__Test__HasLbrAssignment_4_0_0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3087:1: rule__Test__HasLbrAssignment_4_0_0 : ( ( 'lbr' ) ) ;
    public final void rule__Test__HasLbrAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3091:1: ( ( ( 'lbr' ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3092:1: ( ( 'lbr' ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3092:1: ( ( 'lbr' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3093:1: ( 'lbr' )
            {
             before(grammarAccess.getTestAccess().getHasLbrLbrKeyword_4_0_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3094:1: ( 'lbr' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3095:1: 'lbr'
            {
             before(grammarAccess.getTestAccess().getHasLbrLbrKeyword_4_0_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Test__HasLbrAssignment_4_0_06295); 
             after(grammarAccess.getTestAccess().getHasLbrLbrKeyword_4_0_0_0()); 

            }

             after(grammarAccess.getTestAccess().getHasLbrLbrKeyword_4_0_0_0()); 

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
    // $ANTLR end "rule__Test__HasLbrAssignment_4_0_0"


    // $ANTLR start "rule__Test__LbrAssignment_4_0_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3110:1: rule__Test__LbrAssignment_4_0_1 : ( RULE_INT ) ;
    public final void rule__Test__LbrAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3114:1: ( ( RULE_INT ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3115:1: ( RULE_INT )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3115:1: ( RULE_INT )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3116:1: RULE_INT
            {
             before(grammarAccess.getTestAccess().getLbrINTTerminalRuleCall_4_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Test__LbrAssignment_4_0_16334); 
             after(grammarAccess.getTestAccess().getLbrINTTerminalRuleCall_4_0_1_0()); 

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
    // $ANTLR end "rule__Test__LbrAssignment_4_0_1"


    // $ANTLR start "rule__Test__HasLbrInitialAssignment_4_1_0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3125:1: rule__Test__HasLbrInitialAssignment_4_1_0 : ( ( 'lbr' ) ) ;
    public final void rule__Test__HasLbrInitialAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3129:1: ( ( ( 'lbr' ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3130:1: ( ( 'lbr' ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3130:1: ( ( 'lbr' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3131:1: ( 'lbr' )
            {
             before(grammarAccess.getTestAccess().getHasLbrInitialLbrKeyword_4_1_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3132:1: ( 'lbr' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3133:1: 'lbr'
            {
             before(grammarAccess.getTestAccess().getHasLbrInitialLbrKeyword_4_1_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Test__HasLbrInitialAssignment_4_1_06370); 
             after(grammarAccess.getTestAccess().getHasLbrInitialLbrKeyword_4_1_0_0()); 

            }

             after(grammarAccess.getTestAccess().getHasLbrInitialLbrKeyword_4_1_0_0()); 

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
    // $ANTLR end "rule__Test__HasLbrInitialAssignment_4_1_0"


    // $ANTLR start "rule__Test__LbrInitialAssignment_4_1_3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3148:1: rule__Test__LbrInitialAssignment_4_1_3 : ( RULE_INT ) ;
    public final void rule__Test__LbrInitialAssignment_4_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3152:1: ( ( RULE_INT ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3153:1: ( RULE_INT )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3153:1: ( RULE_INT )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3154:1: RULE_INT
            {
             before(grammarAccess.getTestAccess().getLbrInitialINTTerminalRuleCall_4_1_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Test__LbrInitialAssignment_4_1_36409); 
             after(grammarAccess.getTestAccess().getLbrInitialINTTerminalRuleCall_4_1_3_0()); 

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
    // $ANTLR end "rule__Test__LbrInitialAssignment_4_1_3"


    // $ANTLR start "rule__Test__HasStartruleAssignment_4_2_0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3163:1: rule__Test__HasStartruleAssignment_4_2_0 : ( ( 'start' ) ) ;
    public final void rule__Test__HasStartruleAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3167:1: ( ( ( 'start' ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3168:1: ( ( 'start' ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3168:1: ( ( 'start' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3169:1: ( 'start' )
            {
             before(grammarAccess.getTestAccess().getHasStartruleStartKeyword_4_2_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3170:1: ( 'start' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3171:1: 'start'
            {
             before(grammarAccess.getTestAccess().getHasStartruleStartKeyword_4_2_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Test__HasStartruleAssignment_4_2_06445); 
             after(grammarAccess.getTestAccess().getHasStartruleStartKeyword_4_2_0_0()); 

            }

             after(grammarAccess.getTestAccess().getHasStartruleStartKeyword_4_2_0_0()); 

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
    // $ANTLR end "rule__Test__HasStartruleAssignment_4_2_0"


    // $ANTLR start "rule__Test__StartruleAssignment_4_2_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3186:1: rule__Test__StartruleAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Test__StartruleAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3190:1: ( ( ( RULE_ID ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3191:1: ( ( RULE_ID ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3191:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3192:1: ( RULE_ID )
            {
             before(grammarAccess.getTestAccess().getStartruleAbstractRuleCrossReference_4_2_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3193:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3194:1: RULE_ID
            {
             before(grammarAccess.getTestAccess().getStartruleAbstractRuleIDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Test__StartruleAssignment_4_2_16488); 
             after(grammarAccess.getTestAccess().getStartruleAbstractRuleIDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getTestAccess().getStartruleAbstractRuleCrossReference_4_2_1_0()); 

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
    // $ANTLR end "rule__Test__StartruleAssignment_4_2_1"


    // $ANTLR start "rule__Test__MembersAssignment_6"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3205:1: rule__Test__MembersAssignment_6 : ( ruleMember ) ;
    public final void rule__Test__MembersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3209:1: ( ( ruleMember ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3210:1: ( ruleMember )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3210:1: ( ruleMember )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3211:1: ruleMember
            {
             before(grammarAccess.getTestAccess().getMembersMemberParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Test__MembersAssignment_66523);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getTestAccess().getMembersMemberParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Test__MembersAssignment_6"


    // $ANTLR start "rule__Apply__MinOrItAssignment_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3220:1: rule__Apply__MinOrItAssignment_1 : ( RULE_INT ) ;
    public final void rule__Apply__MinOrItAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3224:1: ( ( RULE_INT ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3225:1: ( RULE_INT )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3225:1: ( RULE_INT )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3226:1: RULE_INT
            {
             before(grammarAccess.getApplyAccess().getMinOrItINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Apply__MinOrItAssignment_16554); 
             after(grammarAccess.getApplyAccess().getMinOrItINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Apply__MinOrItAssignment_1"


    // $ANTLR start "rule__Apply__HasMaxAssignment_2_0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3235:1: rule__Apply__HasMaxAssignment_2_0 : ( ( '..' ) ) ;
    public final void rule__Apply__HasMaxAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3239:1: ( ( ( '..' ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3240:1: ( ( '..' ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3240:1: ( ( '..' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3241:1: ( '..' )
            {
             before(grammarAccess.getApplyAccess().getHasMaxFullStopFullStopKeyword_2_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3242:1: ( '..' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3243:1: '..'
            {
             before(grammarAccess.getApplyAccess().getHasMaxFullStopFullStopKeyword_2_0_0()); 
            match(input,27,FOLLOW_27_in_rule__Apply__HasMaxAssignment_2_06590); 
             after(grammarAccess.getApplyAccess().getHasMaxFullStopFullStopKeyword_2_0_0()); 

            }

             after(grammarAccess.getApplyAccess().getHasMaxFullStopFullStopKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Apply__HasMaxAssignment_2_0"


    // $ANTLR start "rule__Apply__MaxAssignment_2_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3258:1: rule__Apply__MaxAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Apply__MaxAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3262:1: ( ( RULE_INT ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3263:1: ( RULE_INT )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3263:1: ( RULE_INT )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3264:1: RULE_INT
            {
             before(grammarAccess.getApplyAccess().getMaxINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Apply__MaxAssignment_2_16629); 
             after(grammarAccess.getApplyAccess().getMaxINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Apply__MaxAssignment_2_1"


    // $ANTLR start "rule__Apply__HasNumAssignment_3_0"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3273:1: rule__Apply__HasNumAssignment_3_0 : ( ( ':' ) ) ;
    public final void rule__Apply__HasNumAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3277:1: ( ( ( ':' ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3278:1: ( ( ':' ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3278:1: ( ( ':' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3279:1: ( ':' )
            {
             before(grammarAccess.getApplyAccess().getHasNumColonKeyword_3_0_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3280:1: ( ':' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3281:1: ':'
            {
             before(grammarAccess.getApplyAccess().getHasNumColonKeyword_3_0_0()); 
            match(input,33,FOLLOW_33_in_rule__Apply__HasNumAssignment_3_06665); 
             after(grammarAccess.getApplyAccess().getHasNumColonKeyword_3_0_0()); 

            }

             after(grammarAccess.getApplyAccess().getHasNumColonKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Apply__HasNumAssignment_3_0"


    // $ANTLR start "rule__Apply__NumAssignment_3_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3296:1: rule__Apply__NumAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Apply__NumAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3300:1: ( ( RULE_INT ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3301:1: ( RULE_INT )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3301:1: ( RULE_INT )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3302:1: RULE_INT
            {
             before(grammarAccess.getApplyAccess().getNumINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Apply__NumAssignment_3_16704); 
             after(grammarAccess.getApplyAccess().getNumINTTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Apply__NumAssignment_3_1"


    // $ANTLR start "rule__Sub__RuleAssignment_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3311:1: rule__Sub__RuleAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Sub__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3315:1: ( ( ( RULE_ID ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3316:1: ( ( RULE_ID ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3316:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3317:1: ( RULE_ID )
            {
             before(grammarAccess.getSubAccess().getRuleAbstractRuleCrossReference_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3318:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3319:1: RULE_ID
            {
             before(grammarAccess.getSubAccess().getRuleAbstractRuleIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sub__RuleAssignment_16739); 
             after(grammarAccess.getSubAccess().getRuleAbstractRuleIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSubAccess().getRuleAbstractRuleCrossReference_1_0()); 

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
    // $ANTLR end "rule__Sub__RuleAssignment_1"


    // $ANTLR start "rule__Sub__SubstitutionAssignment_3"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3330:1: rule__Sub__SubstitutionAssignment_3 : ( ruleSG ) ;
    public final void rule__Sub__SubstitutionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3334:1: ( ( ruleSG ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3335:1: ( ruleSG )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3335:1: ( ruleSG )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3336:1: ruleSG
            {
             before(grammarAccess.getSubAccess().getSubstitutionSGParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSG_in_rule__Sub__SubstitutionAssignment_36774);
            ruleSG();

            state._fsp--;

             after(grammarAccess.getSubAccess().getSubstitutionSGParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Sub__SubstitutionAssignment_3"


    // $ANTLR start "rule__New__TermAssignment_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3345:1: rule__New__TermAssignment_1 : ( ( 'terminal' ) ) ;
    public final void rule__New__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3349:1: ( ( ( 'terminal' ) ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3350:1: ( ( 'terminal' ) )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3350:1: ( ( 'terminal' ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3351:1: ( 'terminal' )
            {
             before(grammarAccess.getNewAccess().getTermTerminalKeyword_1_0()); 
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3352:1: ( 'terminal' )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3353:1: 'terminal'
            {
             before(grammarAccess.getNewAccess().getTermTerminalKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__New__TermAssignment_16810); 
             after(grammarAccess.getNewAccess().getTermTerminalKeyword_1_0()); 

            }

             after(grammarAccess.getNewAccess().getTermTerminalKeyword_1_0()); 

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
    // $ANTLR end "rule__New__TermAssignment_1"


    // $ANTLR start "rule__New__RuleAssignment_2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3368:1: rule__New__RuleAssignment_2 : ( RULE_ID ) ;
    public final void rule__New__RuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3372:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3373:1: ( RULE_ID )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3373:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3374:1: RULE_ID
            {
             before(grammarAccess.getNewAccess().getRuleIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__New__RuleAssignment_26849); 
             after(grammarAccess.getNewAccess().getRuleIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__New__RuleAssignment_2"


    // $ANTLR start "rule__New__DefinitionAssignment_4"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3383:1: rule__New__DefinitionAssignment_4 : ( ruleSG ) ;
    public final void rule__New__DefinitionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3387:1: ( ( ruleSG ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3388:1: ( ruleSG )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3388:1: ( ruleSG )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3389:1: ruleSG
            {
             before(grammarAccess.getNewAccess().getDefinitionSGParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSG_in_rule__New__DefinitionAssignment_46880);
            ruleSG();

            state._fsp--;

             after(grammarAccess.getNewAccess().getDefinitionSGParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__New__DefinitionAssignment_4"


    // $ANTLR start "rule__Alternative__RightAssignment_1_2"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3398:1: rule__Alternative__RightAssignment_1_2 : ( ruleAlternative ) ;
    public final void rule__Alternative__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3402:1: ( ( ruleAlternative ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3403:1: ( ruleAlternative )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3403:1: ( ruleAlternative )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3404:1: ruleAlternative
            {
             before(grammarAccess.getAlternativeAccess().getRightAlternativeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAlternative_in_rule__Alternative__RightAssignment_1_26911);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getRightAlternativeParserRuleCall_1_2_0()); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3413:1: rule__Sequence__RightAssignment_1_1 : ( ruleSequence ) ;
    public final void rule__Sequence__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3417:1: ( ( ruleSequence ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3418:1: ( ruleSequence )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3418:1: ( ruleSequence )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3419:1: ruleSequence
            {
             before(grammarAccess.getSequenceAccess().getRightSequenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Sequence__RightAssignment_1_16942);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getRightSequenceParserRuleCall_1_1_0()); 

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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3428:1: rule__Operated__OfAssignment_0_2 : ( ruleOperated ) ;
    public final void rule__Operated__OfAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3432:1: ( ( ruleOperated ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3433:1: ( ruleOperated )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3433:1: ( ruleOperated )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3434:1: ruleOperated
            {
             before(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleOperated_in_rule__Operated__OfAssignment_0_26973);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3443:1: rule__Operated__OfAssignment_1_2 : ( ruleOperated ) ;
    public final void rule__Operated__OfAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3447:1: ( ( ruleOperated ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3448:1: ( ruleOperated )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3448:1: ( ruleOperated )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3449:1: ruleOperated
            {
             before(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOperated_in_rule__Operated__OfAssignment_1_27004);
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3458:1: rule__Terminal__MinAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Terminal__MinAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3462:1: ( ( RULE_STRING ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3463:1: ( RULE_STRING )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3463:1: ( RULE_STRING )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3464:1: RULE_STRING
            {
             before(grammarAccess.getTerminalAccess().getMinSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Terminal__MinAssignment_0_17035); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3473:1: rule__Terminal__MaxAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__Terminal__MaxAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3477:1: ( ( RULE_STRING ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3478:1: ( RULE_STRING )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3478:1: ( RULE_STRING )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3479:1: RULE_STRING
            {
             before(grammarAccess.getTerminalAccess().getMaxSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Terminal__MaxAssignment_0_37066); 
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
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3488:1: rule__Terminal__TokenAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Terminal__TokenAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3492:1: ( ( RULE_STRING ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3493:1: ( RULE_STRING )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3493:1: ( RULE_STRING )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3494:1: RULE_STRING
            {
             before(grammarAccess.getTerminalAccess().getTokenSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Terminal__TokenAssignment_1_17097); 
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


    // $ANTLR start "rule__Terminal__ToAssignment_2_1"
    // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3503:1: rule__Terminal__ToAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__Terminal__ToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3507:1: ( ( RULE_ID ) )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3508:1: ( RULE_ID )
            {
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3508:1: ( RULE_ID )
            // ../sle.gbt.xtext.ui/src-gen/sle/gbt/xtext/ui/contentassist/antlr/internal/InternalGBTS.g:3509:1: RULE_ID
            {
             before(grammarAccess.getTerminalAccess().getToIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminal__ToAssignment_2_17128); 
             after(grammarAccess.getTerminalAccess().getToIDTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Terminal__ToAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TstsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__0_in_ruleTest155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Alternatives_in_ruleMember215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0_in_ruleApply275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSub_in_entryRuleSub302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSub309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub__Group__0_in_ruleSub335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_entryRuleNew362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNew369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__0_in_ruleNew395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSG_in_entryRuleSG422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSG429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleSG455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__0_in_ruleAlternative514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0_in_ruleCardinality634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_entryRuleOperated661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperated668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Alternatives_in_ruleOperated694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_entryRuleTerminal721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Alternatives_in_ruleTerminal754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedElement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__0_in_ruleParenthesizedElement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrammarID_in_entryRuleGrammarID841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrammarID848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group__0_in_ruleGrammarID874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_rule__Member__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSub_in_rule__Member__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_rule__Member__Alternatives944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_0__0_in_rule__Cardinality__Alternatives_1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_1__0_in_rule__Cardinality__Alternatives_1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_2__0_in_rule__Cardinality__Alternatives_11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__0_in_rule__Operated__Alternatives1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__0_in_rule__Operated__Alternatives1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_rule__Operated__Alternatives1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__0_in_rule__Terminal__Alternatives1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_1__0_in_rule__Terminal__Alternatives1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_2__0_in_rule__Terminal__Alternatives1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedElement_in_rule__Terminal__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__0__Impl_in_rule__Test__Group__01197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Test__Group__1_in_rule__Test__Group__01200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Test__Group__0__Impl1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__1__Impl_in_rule__Test__Group__11259 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Test__Group__2_in_rule__Test__Group__11262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__NameAssignment_1_in_rule__Test__Group__1__Impl1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__2__Impl_in_rule__Test__Group__21319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Test__Group__3_in_rule__Test__Group__21322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Test__Group__2__Impl1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__3__Impl_in_rule__Test__Group__31381 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Test__Group__4_in_rule__Test__Group__31384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__RefAssignment_3_in_rule__Test__Group__3__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__4__Impl_in_rule__Test__Group__41441 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Test__Group__5_in_rule__Test__Group__41444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__UnorderedGroup_4_in_rule__Test__Group__4__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__5__Impl_in_rule__Test__Group__51501 = new BitSet(new long[]{0x00000000001A4000L});
    public static final BitSet FOLLOW_rule__Test__Group__6_in_rule__Test__Group__51504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Test__Group__5__Impl1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group__6__Impl_in_rule__Test__Group__61563 = new BitSet(new long[]{0x00000000001A4000L});
    public static final BitSet FOLLOW_rule__Test__Group__7_in_rule__Test__Group__61566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__MembersAssignment_6_in_rule__Test__Group__6__Impl1593 = new BitSet(new long[]{0x00000000001A0002L});
    public static final BitSet FOLLOW_rule__Test__Group__7__Impl_in_rule__Test__Group__71624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Test__Group__7__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_0__0__Impl_in_rule__Test__Group_4_0__01699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Test__Group_4_0__1_in_rule__Test__Group_4_0__01702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__HasLbrAssignment_4_0_0_in_rule__Test__Group_4_0__0__Impl1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_0__1__Impl_in_rule__Test__Group_4_0__11759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__LbrAssignment_4_0_1_in_rule__Test__Group_4_0__1__Impl1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_1__0__Impl_in_rule__Test__Group_4_1__01820 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Test__Group_4_1__1_in_rule__Test__Group_4_1__01823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__HasLbrInitialAssignment_4_1_0_in_rule__Test__Group_4_1__0__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_1__1__Impl_in_rule__Test__Group_4_1__11880 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Test__Group_4_1__2_in_rule__Test__Group_4_1__11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Test__Group_4_1__1__Impl1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_1__2__Impl_in_rule__Test__Group_4_1__21942 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Test__Group_4_1__3_in_rule__Test__Group_4_1__21945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Test__Group_4_1__2__Impl1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_1__3__Impl_in_rule__Test__Group_4_1__32004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__LbrInitialAssignment_4_1_3_in_rule__Test__Group_4_1__3__Impl2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_2__0__Impl_in_rule__Test__Group_4_2__02069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Test__Group_4_2__1_in_rule__Test__Group_4_2__02072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__HasStartruleAssignment_4_2_0_in_rule__Test__Group_4_2__0__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_2__1__Impl_in_rule__Test__Group_4_2__12129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__StartruleAssignment_4_2_1_in_rule__Test__Group_4_2__1__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__0__Impl_in_rule__Apply__Group__02190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Apply__Group__1_in_rule__Apply__Group__02193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Apply__Group__0__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__1__Impl_in_rule__Apply__Group__12252 = new BitSet(new long[]{0x0000000208040000L});
    public static final BitSet FOLLOW_rule__Apply__Group__2_in_rule__Apply__Group__12255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__MinOrItAssignment_1_in_rule__Apply__Group__1__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__2__Impl_in_rule__Apply__Group__22312 = new BitSet(new long[]{0x0000000208040000L});
    public static final BitSet FOLLOW_rule__Apply__Group__3_in_rule__Apply__Group__22315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_2__0_in_rule__Apply__Group__2__Impl2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__3__Impl_in_rule__Apply__Group__32373 = new BitSet(new long[]{0x0000000208040000L});
    public static final BitSet FOLLOW_rule__Apply__Group__4_in_rule__Apply__Group__32376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_3__0_in_rule__Apply__Group__3__Impl2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group__4__Impl_in_rule__Apply__Group__42434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Apply__Group__4__Impl2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_2__0__Impl_in_rule__Apply__Group_2__02503 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Apply__Group_2__1_in_rule__Apply__Group_2__02506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__HasMaxAssignment_2_0_in_rule__Apply__Group_2__0__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_2__1__Impl_in_rule__Apply__Group_2__12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__MaxAssignment_2_1_in_rule__Apply__Group_2__1__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_3__0__Impl_in_rule__Apply__Group_3__02624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Apply__Group_3__1_in_rule__Apply__Group_3__02627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__HasNumAssignment_3_0_in_rule__Apply__Group_3__0__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__Group_3__1__Impl_in_rule__Apply__Group_3__12684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Apply__NumAssignment_3_1_in_rule__Apply__Group_3__1__Impl2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub__Group__0__Impl_in_rule__Sub__Group__02745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sub__Group__1_in_rule__Sub__Group__02748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sub__Group__0__Impl2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub__Group__1__Impl_in_rule__Sub__Group__12807 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Sub__Group__2_in_rule__Sub__Group__12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub__RuleAssignment_1_in_rule__Sub__Group__1__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub__Group__2__Impl_in_rule__Sub__Group__22867 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__Sub__Group__3_in_rule__Sub__Group__22870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Sub__Group__2__Impl2898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub__Group__3__Impl_in_rule__Sub__Group__32929 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Sub__Group__4_in_rule__Sub__Group__32932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub__SubstitutionAssignment_3_in_rule__Sub__Group__3__Impl2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sub__Group__4__Impl_in_rule__Sub__Group__42989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sub__Group__4__Impl3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__0__Impl_in_rule__New__Group__03058 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__New__Group__1_in_rule__New__Group__03061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__New__Group__0__Impl3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__1__Impl_in_rule__New__Group__13120 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__New__Group__2_in_rule__New__Group__13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__TermAssignment_1_in_rule__New__Group__1__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__2__Impl_in_rule__New__Group__23181 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__New__Group__3_in_rule__New__Group__23184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__RuleAssignment_2_in_rule__New__Group__2__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__3__Impl_in_rule__New__Group__33241 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__New__Group__4_in_rule__New__Group__33244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__New__Group__3__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__4__Impl_in_rule__New__Group__43303 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__New__Group__5_in_rule__New__Group__43306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__DefinitionAssignment_4_in_rule__New__Group__4__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__New__Group__5__Impl_in_rule__New__Group__53363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__New__Group__5__Impl3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__0__Impl_in_rule__Alternative__Group__03434 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Alternative__Group__1_in_rule__Alternative__Group__03437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Alternative__Group__0__Impl3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group__1__Impl_in_rule__Alternative__Group__13493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__0_in_rule__Alternative__Group__1__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__0__Impl_in_rule__Alternative__Group_1__03555 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__1_in_rule__Alternative__Group_1__03558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__1__Impl_in_rule__Alternative__Group_1__13616 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__2_in_rule__Alternative__Group_1__13619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Alternative__Group_1__1__Impl3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__Group_1__2__Impl_in_rule__Alternative__Group_1__23678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternative__RightAssignment_1_2_in_rule__Alternative__Group_1__2__Impl3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__03741 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__03744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Sequence__Group__0__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__13800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_1__0_in_rule__Sequence__Group__1__Impl3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_1__0__Impl_in_rule__Sequence__Group_1__03862 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__Sequence__Group_1__1_in_rule__Sequence__Group_1__03865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_1__1__Impl_in_rule__Sequence__Group_1__13923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__RightAssignment_1_1_in_rule__Sequence__Group_1__1__Impl3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__0__Impl_in_rule__Cardinality__Group__03984 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1_in_rule__Cardinality__Group__03987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_rule__Cardinality__Group__0__Impl4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group__1__Impl_in_rule__Cardinality__Group__14043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_1_in_rule__Cardinality__Group__1__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_0__0__Impl_in_rule__Cardinality__Group_1_0__04105 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_0__1_in_rule__Cardinality__Group_1_0__04108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_0__1__Impl_in_rule__Cardinality__Group_1_0__14166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Cardinality__Group_1_0__1__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_1__0__Impl_in_rule__Cardinality__Group_1_1__04229 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_1__1_in_rule__Cardinality__Group_1_1__04232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_1__1__Impl_in_rule__Cardinality__Group_1_1__14290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Cardinality__Group_1_1__1__Impl4318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_2__0__Impl_in_rule__Cardinality__Group_1_2__04353 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_2__1_in_rule__Cardinality__Group_1_2__04356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Group_1_2__1__Impl_in_rule__Cardinality__Group_1_2__14414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Cardinality__Group_1_2__1__Impl4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__0__Impl_in_rule__Operated__Group_0__04477 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__1_in_rule__Operated__Group_0__04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operated__Group_0__0__Impl4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__1__Impl_in_rule__Operated__Group_0__14539 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__2_in_rule__Operated__Group_0__14542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_0__2__Impl_in_rule__Operated__Group_0__24600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__OfAssignment_0_2_in_rule__Operated__Group_0__2__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__0__Impl_in_rule__Operated__Group_1__04663 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__1_in_rule__Operated__Group_1__04666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Operated__Group_1__0__Impl4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__1__Impl_in_rule__Operated__Group_1__14725 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__2_in_rule__Operated__Group_1__14728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__Group_1__2__Impl_in_rule__Operated__Group_1__24786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operated__OfAssignment_1_2_in_rule__Operated__Group_1__2__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__0__Impl_in_rule__Terminal__Group_0__04849 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__1_in_rule__Terminal__Group_0__04852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__1__Impl_in_rule__Terminal__Group_0__14910 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__2_in_rule__Terminal__Group_0__14913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__MinAssignment_0_1_in_rule__Terminal__Group_0__1__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__2__Impl_in_rule__Terminal__Group_0__24970 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__3_in_rule__Terminal__Group_0__24973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Terminal__Group_0__2__Impl5001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_0__3__Impl_in_rule__Terminal__Group_0__35032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__MaxAssignment_0_3_in_rule__Terminal__Group_0__3__Impl5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_1__0__Impl_in_rule__Terminal__Group_1__05097 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Terminal__Group_1__1_in_rule__Terminal__Group_1__05100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_1__1__Impl_in_rule__Terminal__Group_1__15158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__TokenAssignment_1_1_in_rule__Terminal__Group_1__1__Impl5185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_2__0__Impl_in_rule__Terminal__Group_2__05219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminal__Group_2__1_in_rule__Terminal__Group_2__05222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__Group_2__1__Impl_in_rule__Terminal__Group_2__15280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminal__ToAssignment_2_1_in_rule__Terminal__Group_2__1__Impl5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__0__Impl_in_rule__ParenthesizedElement__Group__05341 = new BitSet(new long[]{0x0000000016000050L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__1_in_rule__ParenthesizedElement__Group__05344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ParenthesizedElement__Group__0__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__1__Impl_in_rule__ParenthesizedElement__Group__15403 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__2_in_rule__ParenthesizedElement__Group__15406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_rule__ParenthesizedElement__Group__1__Impl5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParenthesizedElement__Group__2__Impl_in_rule__ParenthesizedElement__Group__25462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ParenthesizedElement__Group__2__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group__0__Impl_in_rule__GrammarID__Group__05527 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__GrammarID__Group__1_in_rule__GrammarID__Group__05530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrammarID__Group__0__Impl5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group__1__Impl_in_rule__GrammarID__Group__15586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group_1__0_in_rule__GrammarID__Group__1__Impl5613 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group_1__0__Impl_in_rule__GrammarID__Group_1__05648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrammarID__Group_1__1_in_rule__GrammarID__Group_1__05651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__GrammarID__Group_1__0__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrammarID__Group_1__1__Impl_in_rule__GrammarID__Group_1__15710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrammarID__Group_1__1__Impl5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__UnorderedGroup_4__0_in_rule__Test__UnorderedGroup_45771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_0__0_in_rule__Test__UnorderedGroup_4__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_1__0_in_rule__Test__UnorderedGroup_4__Impl5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__Group_4_2__0_in_rule__Test__UnorderedGroup_4__Impl6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__UnorderedGroup_4__Impl_in_rule__Test__UnorderedGroup_4__06099 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_rule__Test__UnorderedGroup_4__1_in_rule__Test__UnorderedGroup_4__06102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__UnorderedGroup_4__Impl_in_rule__Test__UnorderedGroup_4__16127 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_rule__Test__UnorderedGroup_4__2_in_rule__Test__UnorderedGroup_4__16130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__UnorderedGroup_4__Impl_in_rule__Test__UnorderedGroup_4__26155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_rule__Model__TstsAssignment6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Test__NameAssignment_16220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrammarID_in_rule__Test__RefAssignment_36255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Test__HasLbrAssignment_4_0_06295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Test__LbrAssignment_4_0_16334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Test__HasLbrInitialAssignment_4_1_06370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Test__LbrInitialAssignment_4_1_36409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Test__HasStartruleAssignment_4_2_06445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Test__StartruleAssignment_4_2_16488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Test__MembersAssignment_66523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Apply__MinOrItAssignment_16554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Apply__HasMaxAssignment_2_06590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Apply__MaxAssignment_2_16629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Apply__HasNumAssignment_3_06665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Apply__NumAssignment_3_16704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sub__RuleAssignment_16739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSG_in_rule__Sub__SubstitutionAssignment_36774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__New__TermAssignment_16810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__New__RuleAssignment_26849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSG_in_rule__New__DefinitionAssignment_46880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_rule__Alternative__RightAssignment_1_26911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Sequence__RightAssignment_1_16942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_rule__Operated__OfAssignment_0_26973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_rule__Operated__OfAssignment_1_27004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Terminal__MinAssignment_0_17035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Terminal__MaxAssignment_0_37066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Terminal__TokenAssignment_1_17097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminal__ToAssignment_2_17128 = new BitSet(new long[]{0x0000000000000002L});

}
