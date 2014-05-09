package sle.gbt.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sle.gbt.xtext.services.GBTSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGBTSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'test'", "':='", "'lbr'", "'-'", "'initial'", "'start'", "'{'", "'}'", "'apply'", "'..'", "':'", "';'", "'sub'", "'new'", "'terminal'", "'|'", "'?'", "'*'", "'+'", "'->'", "'!'", "'('", "')'", "'.'"
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
    public String getGrammarFileName() { return "../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g"; }



     	private GBTSGrammarAccess grammarAccess;
     	
        public InternalGBTSParser(TokenStream input, GBTSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected GBTSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:76:1: ruleModel returns [EObject current=null] : ( (lv_tsts_0_0= ruleTest ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tsts_0_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:79:28: ( ( (lv_tsts_0_0= ruleTest ) )* )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:80:1: ( (lv_tsts_0_0= ruleTest ) )*
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:80:1: ( (lv_tsts_0_0= ruleTest ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:81:1: (lv_tsts_0_0= ruleTest )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:81:1: (lv_tsts_0_0= ruleTest )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:82:3: lv_tsts_0_0= ruleTest
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTstsTestParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_in_ruleModel130);
            	    lv_tsts_0_0=ruleTest();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tsts",
            	            		lv_tsts_0_0, 
            	            		"Test");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTest"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:106:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:107:2: (iv_ruleTest= ruleTest EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:108:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest166);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:115:1: ruleTest returns [EObject current=null] : (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( ruleGrammarID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_13= '{' ( (lv_members_14_0= ruleMember ) )* otherlv_15= '}' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_hasLbr_5_0=null;
        Token lv_lbr_6_0=null;
        Token lv_hasLbrInitial_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_lbrInitial_10_0=null;
        Token lv_hasStartrule_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_members_14_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:118:28: ( (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( ruleGrammarID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_13= '{' ( (lv_members_14_0= ruleMember ) )* otherlv_15= '}' ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:119:1: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( ruleGrammarID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_13= '{' ( (lv_members_14_0= ruleMember ) )* otherlv_15= '}' )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:119:1: (otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( ruleGrammarID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_13= '{' ( (lv_members_14_0= ruleMember ) )* otherlv_15= '}' )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:119:3: otherlv_0= 'test' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':=' ( ( ruleGrammarID ) ) ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_13= '{' ( (lv_members_14_0= ruleMember ) )* otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleTest213); 

                	newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:124:1: (lv_name_1_0= RULE_ID )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTest230); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTestAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTestRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTest247); 

                	newLeafNode(otherlv_2, grammarAccess.getTestAccess().getColonEqualsSignKeyword_2());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:145:1: ( ( ruleGrammarID ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:146:1: ( ruleGrammarID )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:146:1: ( ruleGrammarID )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:147:3: ruleGrammarID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTestRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTestAccess().getRefGrammarCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGrammarID_in_ruleTest270);
            ruleGrammarID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:160:2: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* ) ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:162:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:162:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:163:2: ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTestAccess().getUnorderedGroup_4());
            	
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:166:2: ( ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )* )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:167:3: ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )*
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:167:3: ( ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) ) )*
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( LA2_0 ==13 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1) ) ) {
                    int LA2_2 = input.LA(2);

                    if ( LA2_2 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1) ) {
                        alt2=2;
                    }
                    else if ( LA2_2 ==RULE_INT && getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0) ) {
                        alt2=1;
                    }


                }
                else if ( LA2_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2) ) {
                    alt2=3;
                }


                switch (alt2) {
            	case 1 :
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:169:4: ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:169:4: ({...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:170:5: {...}? => ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTest", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:170:101: ( ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:171:6: ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTestAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:174:6: ({...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:174:7: {...}? => ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTest", "true");
            	    }
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:174:16: ( ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:174:17: ( (lv_hasLbr_5_0= 'lbr' ) ) ( (lv_lbr_6_0= RULE_INT ) )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:174:17: ( (lv_hasLbr_5_0= 'lbr' ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:175:1: (lv_hasLbr_5_0= 'lbr' )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:175:1: (lv_hasLbr_5_0= 'lbr' )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:176:3: lv_hasLbr_5_0= 'lbr'
            	    {
            	    lv_hasLbr_5_0=(Token)match(input,13,FOLLOW_13_in_ruleTest334); 

            	            newLeafNode(lv_hasLbr_5_0, grammarAccess.getTestAccess().getHasLbrLbrKeyword_4_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTestRule());
            	    	        }
            	           		setWithLastConsumed(current, "hasLbr", true, "lbr");
            	    	    

            	    }


            	    }

            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:189:2: ( (lv_lbr_6_0= RULE_INT ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:190:1: (lv_lbr_6_0= RULE_INT )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:190:1: (lv_lbr_6_0= RULE_INT )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:191:3: lv_lbr_6_0= RULE_INT
            	    {
            	    lv_lbr_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTest364); 

            	    			newLeafNode(lv_lbr_6_0, grammarAccess.getTestAccess().getLbrINTTerminalRuleCall_4_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTestRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"lbr",
            	            		lv_lbr_6_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:214:4: ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:214:4: ({...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:215:5: {...}? => ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTest", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:215:101: ( ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:216:6: ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTestAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:219:6: ({...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:219:7: {...}? => ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTest", "true");
            	    }
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:219:16: ( ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:219:17: ( (lv_hasLbrInitial_7_0= 'lbr' ) ) otherlv_8= '-' otherlv_9= 'initial' ( (lv_lbrInitial_10_0= RULE_INT ) )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:219:17: ( (lv_hasLbrInitial_7_0= 'lbr' ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:220:1: (lv_hasLbrInitial_7_0= 'lbr' )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:220:1: (lv_hasLbrInitial_7_0= 'lbr' )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:221:3: lv_hasLbrInitial_7_0= 'lbr'
            	    {
            	    lv_hasLbrInitial_7_0=(Token)match(input,13,FOLLOW_13_in_ruleTest443); 

            	            newLeafNode(lv_hasLbrInitial_7_0, grammarAccess.getTestAccess().getHasLbrInitialLbrKeyword_4_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTestRule());
            	    	        }
            	           		setWithLastConsumed(current, "hasLbrInitial", true, "lbr");
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleTest468); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTestAccess().getHyphenMinusKeyword_4_1_1());
            	        
            	    otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleTest480); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTestAccess().getInitialKeyword_4_1_2());
            	        
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:242:1: ( (lv_lbrInitial_10_0= RULE_INT ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:243:1: (lv_lbrInitial_10_0= RULE_INT )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:243:1: (lv_lbrInitial_10_0= RULE_INT )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:244:3: lv_lbrInitial_10_0= RULE_INT
            	    {
            	    lv_lbrInitial_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTest497); 

            	    			newLeafNode(lv_lbrInitial_10_0, grammarAccess.getTestAccess().getLbrInitialINTTerminalRuleCall_4_1_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTestRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"lbrInitial",
            	            		lv_lbrInitial_10_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:267:4: ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:267:4: ({...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:268:5: {...}? => ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTest", "getUnorderedGroupHelper().canSelect(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:268:101: ( ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:269:6: ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTestAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:272:6: ({...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:272:7: {...}? => ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTest", "true");
            	    }
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:272:16: ( ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:272:17: ( (lv_hasStartrule_11_0= 'start' ) ) ( (otherlv_12= RULE_ID ) )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:272:17: ( (lv_hasStartrule_11_0= 'start' ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:273:1: (lv_hasStartrule_11_0= 'start' )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:273:1: (lv_hasStartrule_11_0= 'start' )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:274:3: lv_hasStartrule_11_0= 'start'
            	    {
            	    lv_hasStartrule_11_0=(Token)match(input,16,FOLLOW_16_in_ruleTest576); 

            	            newLeafNode(lv_hasStartrule_11_0, grammarAccess.getTestAccess().getHasStartruleStartKeyword_4_2_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTestRule());
            	    	        }
            	           		setWithLastConsumed(current, "hasStartrule", true, "start");
            	    	    

            	    }


            	    }

            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:287:2: ( (otherlv_12= RULE_ID ) )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:288:1: (otherlv_12= RULE_ID )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:288:1: (otherlv_12= RULE_ID )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:289:3: otherlv_12= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTestRule());
            	    	        }
            	            
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTest609); 

            	    		newLeafNode(otherlv_12, grammarAccess.getTestAccess().getStartruleAbstractRuleCrossReference_4_2_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTestAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTestAccess().getUnorderedGroup_4());
            	

            }

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleTest662); 

                	newLeafNode(otherlv_13, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_5());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:318:1: ( (lv_members_14_0= ruleMember ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||(LA3_0>=23 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:319:1: (lv_members_14_0= ruleMember )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:319:1: (lv_members_14_0= ruleMember )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:320:3: lv_members_14_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTestAccess().getMembersMemberParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleTest683);
            	    lv_members_14_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTestRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_14_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,18,FOLLOW_18_in_ruleTest696); 

                	newLeafNode(otherlv_15, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleMember"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:348:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:349:2: (iv_ruleMember= ruleMember EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:350:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember732);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember742); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:357:1: ruleMember returns [EObject current=null] : (this_Apply_0= ruleApply | this_Sub_1= ruleSub | this_New_2= ruleNew ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Apply_0 = null;

        EObject this_Sub_1 = null;

        EObject this_New_2 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:360:28: ( (this_Apply_0= ruleApply | this_Sub_1= ruleSub | this_New_2= ruleNew ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:361:1: (this_Apply_0= ruleApply | this_Sub_1= ruleSub | this_New_2= ruleNew )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:361:1: (this_Apply_0= ruleApply | this_Sub_1= ruleSub | this_New_2= ruleNew )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
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
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:362:5: this_Apply_0= ruleApply
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getApplyParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleApply_in_ruleMember789);
                    this_Apply_0=ruleApply();

                    state._fsp--;

                     
                            current = this_Apply_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:372:5: this_Sub_1= ruleSub
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getSubParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSub_in_ruleMember816);
                    this_Sub_1=ruleSub();

                    state._fsp--;

                     
                            current = this_Sub_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:382:5: this_New_2= ruleNew
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getNewParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNew_in_ruleMember843);
                    this_New_2=ruleNew();

                    state._fsp--;

                     
                            current = this_New_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleApply"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:398:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:399:2: (iv_ruleApply= ruleApply EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:400:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply878);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply888); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApply"


    // $ANTLR start "ruleApply"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:407:1: ruleApply returns [EObject current=null] : (otherlv_0= 'apply' ( (lv_minOrIt_1_0= RULE_INT ) ) ( ( (lv_hasMax_2_0= '..' ) ) ( (lv_max_3_0= RULE_INT ) ) )? ( ( (lv_hasNum_4_0= ':' ) ) ( (lv_num_5_0= RULE_INT ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleApply() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_minOrIt_1_0=null;
        Token lv_hasMax_2_0=null;
        Token lv_max_3_0=null;
        Token lv_hasNum_4_0=null;
        Token lv_num_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:410:28: ( (otherlv_0= 'apply' ( (lv_minOrIt_1_0= RULE_INT ) ) ( ( (lv_hasMax_2_0= '..' ) ) ( (lv_max_3_0= RULE_INT ) ) )? ( ( (lv_hasNum_4_0= ':' ) ) ( (lv_num_5_0= RULE_INT ) ) )? otherlv_6= ';' ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:411:1: (otherlv_0= 'apply' ( (lv_minOrIt_1_0= RULE_INT ) ) ( ( (lv_hasMax_2_0= '..' ) ) ( (lv_max_3_0= RULE_INT ) ) )? ( ( (lv_hasNum_4_0= ':' ) ) ( (lv_num_5_0= RULE_INT ) ) )? otherlv_6= ';' )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:411:1: (otherlv_0= 'apply' ( (lv_minOrIt_1_0= RULE_INT ) ) ( ( (lv_hasMax_2_0= '..' ) ) ( (lv_max_3_0= RULE_INT ) ) )? ( ( (lv_hasNum_4_0= ':' ) ) ( (lv_num_5_0= RULE_INT ) ) )? otherlv_6= ';' )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:411:3: otherlv_0= 'apply' ( (lv_minOrIt_1_0= RULE_INT ) ) ( ( (lv_hasMax_2_0= '..' ) ) ( (lv_max_3_0= RULE_INT ) ) )? ( ( (lv_hasNum_4_0= ':' ) ) ( (lv_num_5_0= RULE_INT ) ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleApply925); 

                	newLeafNode(otherlv_0, grammarAccess.getApplyAccess().getApplyKeyword_0());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:415:1: ( (lv_minOrIt_1_0= RULE_INT ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:416:1: (lv_minOrIt_1_0= RULE_INT )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:416:1: (lv_minOrIt_1_0= RULE_INT )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:417:3: lv_minOrIt_1_0= RULE_INT
            {
            lv_minOrIt_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApply942); 

            			newLeafNode(lv_minOrIt_1_0, grammarAccess.getApplyAccess().getMinOrItINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minOrIt",
                    		lv_minOrIt_1_0, 
                    		"INT");
            	    

            }


            }

            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:433:2: ( ( (lv_hasMax_2_0= '..' ) ) ( (lv_max_3_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:433:3: ( (lv_hasMax_2_0= '..' ) ) ( (lv_max_3_0= RULE_INT ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:433:3: ( (lv_hasMax_2_0= '..' ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:434:1: (lv_hasMax_2_0= '..' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:434:1: (lv_hasMax_2_0= '..' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:435:3: lv_hasMax_2_0= '..'
                    {
                    lv_hasMax_2_0=(Token)match(input,20,FOLLOW_20_in_ruleApply966); 

                            newLeafNode(lv_hasMax_2_0, grammarAccess.getApplyAccess().getHasMaxFullStopFullStopKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplyRule());
                    	        }
                           		setWithLastConsumed(current, "hasMax", true, "..");
                    	    

                    }


                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:448:2: ( (lv_max_3_0= RULE_INT ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:449:1: (lv_max_3_0= RULE_INT )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:449:1: (lv_max_3_0= RULE_INT )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:450:3: lv_max_3_0= RULE_INT
                    {
                    lv_max_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApply996); 

                    			newLeafNode(lv_max_3_0, grammarAccess.getApplyAccess().getMaxINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"max",
                            		lv_max_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:466:4: ( ( (lv_hasNum_4_0= ':' ) ) ( (lv_num_5_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:466:5: ( (lv_hasNum_4_0= ':' ) ) ( (lv_num_5_0= RULE_INT ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:466:5: ( (lv_hasNum_4_0= ':' ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:467:1: (lv_hasNum_4_0= ':' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:467:1: (lv_hasNum_4_0= ':' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:468:3: lv_hasNum_4_0= ':'
                    {
                    lv_hasNum_4_0=(Token)match(input,21,FOLLOW_21_in_ruleApply1022); 

                            newLeafNode(lv_hasNum_4_0, grammarAccess.getApplyAccess().getHasNumColonKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplyRule());
                    	        }
                           		setWithLastConsumed(current, "hasNum", true, ":");
                    	    

                    }


                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:481:2: ( (lv_num_5_0= RULE_INT ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:482:1: (lv_num_5_0= RULE_INT )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:482:1: (lv_num_5_0= RULE_INT )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:483:3: lv_num_5_0= RULE_INT
                    {
                    lv_num_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApply1052); 

                    			newLeafNode(lv_num_5_0, grammarAccess.getApplyAccess().getNumINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"num",
                            		lv_num_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleApply1071); 

                	newLeafNode(otherlv_6, grammarAccess.getApplyAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleSub"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:511:1: entryRuleSub returns [EObject current=null] : iv_ruleSub= ruleSub EOF ;
    public final EObject entryRuleSub() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSub = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:512:2: (iv_ruleSub= ruleSub EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:513:2: iv_ruleSub= ruleSub EOF
            {
             newCompositeNode(grammarAccess.getSubRule()); 
            pushFollow(FOLLOW_ruleSub_in_entryRuleSub1107);
            iv_ruleSub=ruleSub();

            state._fsp--;

             current =iv_ruleSub; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSub1117); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSub"


    // $ANTLR start "ruleSub"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:520:1: ruleSub returns [EObject current=null] : (otherlv_0= 'sub' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';' ) ;
    public final EObject ruleSub() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_substitution_3_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:523:28: ( (otherlv_0= 'sub' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';' ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:524:1: (otherlv_0= 'sub' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';' )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:524:1: (otherlv_0= 'sub' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';' )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:524:3: otherlv_0= 'sub' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSub1154); 

                	newLeafNode(otherlv_0, grammarAccess.getSubAccess().getSubKeyword_0());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:528:1: ( (otherlv_1= RULE_ID ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:529:1: (otherlv_1= RULE_ID )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:529:1: (otherlv_1= RULE_ID )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:530:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSub1174); 

            		newLeafNode(otherlv_1, grammarAccess.getSubAccess().getRuleAbstractRuleCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSub1186); 

                	newLeafNode(otherlv_2, grammarAccess.getSubAccess().getColonEqualsSignKeyword_2());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:545:1: ( (lv_substitution_3_0= ruleSG ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:546:1: (lv_substitution_3_0= ruleSG )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:546:1: (lv_substitution_3_0= ruleSG )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:547:3: lv_substitution_3_0= ruleSG
            {
             
            	        newCompositeNode(grammarAccess.getSubAccess().getSubstitutionSGParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSG_in_ruleSub1207);
            lv_substitution_3_0=ruleSG();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubRule());
            	        }
                   		set(
                   			current, 
                   			"substitution",
                    		lv_substitution_3_0, 
                    		"SG");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSub1219); 

                	newLeafNode(otherlv_4, grammarAccess.getSubAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSub"


    // $ANTLR start "entryRuleNew"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:575:1: entryRuleNew returns [EObject current=null] : iv_ruleNew= ruleNew EOF ;
    public final EObject entryRuleNew() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNew = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:576:2: (iv_ruleNew= ruleNew EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:577:2: iv_ruleNew= ruleNew EOF
            {
             newCompositeNode(grammarAccess.getNewRule()); 
            pushFollow(FOLLOW_ruleNew_in_entryRuleNew1255);
            iv_ruleNew=ruleNew();

            state._fsp--;

             current =iv_ruleNew; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNew1265); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNew"


    // $ANTLR start "ruleNew"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:584:1: ruleNew returns [EObject current=null] : (otherlv_0= 'new' ( (lv_term_1_0= 'terminal' ) )? ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_definition_4_0= ruleSG ) ) otherlv_5= ';' ) ;
    public final EObject ruleNew() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_term_1_0=null;
        Token lv_rule_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_definition_4_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:587:28: ( (otherlv_0= 'new' ( (lv_term_1_0= 'terminal' ) )? ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_definition_4_0= ruleSG ) ) otherlv_5= ';' ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:588:1: (otherlv_0= 'new' ( (lv_term_1_0= 'terminal' ) )? ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_definition_4_0= ruleSG ) ) otherlv_5= ';' )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:588:1: (otherlv_0= 'new' ( (lv_term_1_0= 'terminal' ) )? ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_definition_4_0= ruleSG ) ) otherlv_5= ';' )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:588:3: otherlv_0= 'new' ( (lv_term_1_0= 'terminal' ) )? ( (lv_rule_2_0= RULE_ID ) ) otherlv_3= ':=' ( (lv_definition_4_0= ruleSG ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleNew1302); 

                	newLeafNode(otherlv_0, grammarAccess.getNewAccess().getNewKeyword_0());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:592:1: ( (lv_term_1_0= 'terminal' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:593:1: (lv_term_1_0= 'terminal' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:593:1: (lv_term_1_0= 'terminal' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:594:3: lv_term_1_0= 'terminal'
                    {
                    lv_term_1_0=(Token)match(input,25,FOLLOW_25_in_ruleNew1320); 

                            newLeafNode(lv_term_1_0, grammarAccess.getNewAccess().getTermTerminalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNewRule());
                    	        }
                           		setWithLastConsumed(current, "term", true, "terminal");
                    	    

                    }


                    }
                    break;

            }

            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:607:3: ( (lv_rule_2_0= RULE_ID ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:608:1: (lv_rule_2_0= RULE_ID )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:608:1: (lv_rule_2_0= RULE_ID )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:609:3: lv_rule_2_0= RULE_ID
            {
            lv_rule_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNew1351); 

            			newLeafNode(lv_rule_2_0, grammarAccess.getNewAccess().getRuleIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rule",
                    		lv_rule_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleNew1368); 

                	newLeafNode(otherlv_3, grammarAccess.getNewAccess().getColonEqualsSignKeyword_3());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:629:1: ( (lv_definition_4_0= ruleSG ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:630:1: (lv_definition_4_0= ruleSG )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:630:1: (lv_definition_4_0= ruleSG )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:631:3: lv_definition_4_0= ruleSG
            {
             
            	        newCompositeNode(grammarAccess.getNewAccess().getDefinitionSGParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleSG_in_ruleNew1389);
            lv_definition_4_0=ruleSG();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNewRule());
            	        }
                   		set(
                   			current, 
                   			"definition",
                    		lv_definition_4_0, 
                    		"SG");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleNew1401); 

                	newLeafNode(otherlv_5, grammarAccess.getNewAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNew"


    // $ANTLR start "entryRuleSG"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:659:1: entryRuleSG returns [EObject current=null] : iv_ruleSG= ruleSG EOF ;
    public final EObject entryRuleSG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSG = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:660:2: (iv_ruleSG= ruleSG EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:661:2: iv_ruleSG= ruleSG EOF
            {
             newCompositeNode(grammarAccess.getSGRule()); 
            pushFollow(FOLLOW_ruleSG_in_entryRuleSG1437);
            iv_ruleSG=ruleSG();

            state._fsp--;

             current =iv_ruleSG; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSG1447); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSG"


    // $ANTLR start "ruleSG"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:668:1: ruleSG returns [EObject current=null] : this_Alternative_0= ruleAlternative ;
    public final EObject ruleSG() throws RecognitionException {
        EObject current = null;

        EObject this_Alternative_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:671:28: (this_Alternative_0= ruleAlternative )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:673:5: this_Alternative_0= ruleAlternative
            {
             
                    newCompositeNode(grammarAccess.getSGAccess().getAlternativeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAlternative_in_ruleSG1493);
            this_Alternative_0=ruleAlternative();

            state._fsp--;

             
                    current = this_Alternative_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSG"


    // $ANTLR start "entryRuleAlternative"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:689:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:690:2: (iv_ruleAlternative= ruleAlternative EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:691:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative1527);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative1537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:698:1: ruleAlternative returns [EObject current=null] : (this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )? ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Sequence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:701:28: ( (this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:702:1: (this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:702:1: (this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:703:5: this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAlternativeAccess().getSequenceParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSequence_in_ruleAlternative1584);
            this_Sequence_0=ruleSequence();

            state._fsp--;

             
                    current = this_Sequence_0; 
                    afterParserOrEnumRuleCall();
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:711:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:711:2: () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:711:2: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:712:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleAlternative1605); 

                        	newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getVerticalLineKeyword_1_1());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:721:1: ( (lv_right_3_0= ruleAlternative ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:722:1: (lv_right_3_0= ruleAlternative )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:722:1: (lv_right_3_0= ruleAlternative )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:723:3: lv_right_3_0= ruleAlternative
                    {
                     
                    	        newCompositeNode(grammarAccess.getAlternativeAccess().getRightAlternativeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAlternative_in_ruleAlternative1626);
                    lv_right_3_0=ruleAlternative();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"Alternative");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleSequence"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:747:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:748:2: (iv_ruleSequence= ruleSequence EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:749:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence1664);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence1674); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:756:1: ruleSequence returns [EObject current=null] : (this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )? ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        EObject this_Cardinality_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:759:28: ( (this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:760:1: (this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:760:1: (this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:761:5: this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getSequenceAccess().getCardinalityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCardinality_in_ruleSequence1721);
            this_Cardinality_0=ruleCardinality();

            state._fsp--;

             
                    current = this_Cardinality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:769:1: ( () ( (lv_right_2_0= ruleSequence ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==RULE_STRING||(LA9_0>=30 && LA9_0<=32)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:769:2: () ( (lv_right_2_0= ruleSequence ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:769:2: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:770:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:775:2: ( (lv_right_2_0= ruleSequence ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:776:1: (lv_right_2_0= ruleSequence )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:776:1: (lv_right_2_0= ruleSequence )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:777:3: lv_right_2_0= ruleSequence
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getRightSequenceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequence_in_ruleSequence1751);
                    lv_right_2_0=ruleSequence();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_2_0, 
                            		"Sequence");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleCardinality"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:801:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:802:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:803:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1789);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1799); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:810:1: ruleCardinality returns [EObject current=null] : (this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Operated_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:813:28: ( (this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:814:1: (this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:814:1: (this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:815:5: this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )?
            {
             
                    newCompositeNode(grammarAccess.getCardinalityAccess().getOperatedParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleOperated_in_ruleCardinality1846);
            this_Operated_0=ruleOperated();

            state._fsp--;

             
                    current = this_Operated_0; 
                    afterParserOrEnumRuleCall();
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:823:1: ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )?
            int alt10=4;
            switch ( input.LA(1) ) {
                case 27:
                    {
                    alt10=1;
                    }
                    break;
                case 28:
                    {
                    alt10=2;
                    }
                    break;
                case 29:
                    {
                    alt10=3;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:823:2: ( () otherlv_2= '?' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:823:2: ( () otherlv_2= '?' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:823:3: () otherlv_2= '?'
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:823:3: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:824:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleCardinality1868); 

                        	newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getQuestionMarkKeyword_1_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:834:6: ( () otherlv_4= '*' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:834:6: ( () otherlv_4= '*' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:834:7: () otherlv_4= '*'
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:834:7: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:835:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleCardinality1897); 

                        	newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:845:6: ( () otherlv_6= '+' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:845:6: ( () otherlv_6= '+' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:845:7: () otherlv_6= '+'
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:845:7: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:846:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleCardinality1926); 

                        	newLeafNode(otherlv_6, grammarAccess.getCardinalityAccess().getPlusSignKeyword_1_2_1());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleOperated"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:863:1: entryRuleOperated returns [EObject current=null] : iv_ruleOperated= ruleOperated EOF ;
    public final EObject entryRuleOperated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperated = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:864:2: (iv_ruleOperated= ruleOperated EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:865:2: iv_ruleOperated= ruleOperated EOF
            {
             newCompositeNode(grammarAccess.getOperatedRule()); 
            pushFollow(FOLLOW_ruleOperated_in_entryRuleOperated1965);
            iv_ruleOperated=ruleOperated();

            state._fsp--;

             current =iv_ruleOperated; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperated1975); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperated"


    // $ANTLR start "ruleOperated"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:872:1: ruleOperated returns [EObject current=null] : ( (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) ) | (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) ) | this_Terminal_6= ruleTerminal ) ;
    public final EObject ruleOperated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_of_2_0 = null;

        EObject lv_of_5_0 = null;

        EObject this_Terminal_6 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:875:28: ( ( (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) ) | (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) ) | this_Terminal_6= ruleTerminal ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:876:1: ( (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) ) | (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) ) | this_Terminal_6= ruleTerminal )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:876:1: ( (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) ) | (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) ) | this_Terminal_6= ruleTerminal )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case 32:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:876:2: (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:876:2: (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:876:4: otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleOperated2013); 

                        	newLeafNode(otherlv_0, grammarAccess.getOperatedAccess().getHyphenMinusGreaterThanSignKeyword_0_0());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:880:1: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:881:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOperatedAccess().getUntilAction_0_1(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:886:2: ( (lv_of_2_0= ruleOperated ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:887:1: (lv_of_2_0= ruleOperated )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:887:1: (lv_of_2_0= ruleOperated )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:888:3: lv_of_2_0= ruleOperated
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperated_in_ruleOperated2043);
                    lv_of_2_0=ruleOperated();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperatedRule());
                    	        }
                           		set(
                           			current, 
                           			"of",
                            		lv_of_2_0, 
                            		"Operated");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:905:6: (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:905:6: (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:905:8: otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleOperated2063); 

                        	newLeafNode(otherlv_3, grammarAccess.getOperatedAccess().getExclamationMarkKeyword_1_0());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:909:1: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:910:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOperatedAccess().getNegationAction_1_1(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:915:2: ( (lv_of_5_0= ruleOperated ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:916:1: (lv_of_5_0= ruleOperated )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:916:1: (lv_of_5_0= ruleOperated )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:917:3: lv_of_5_0= ruleOperated
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperated_in_ruleOperated2093);
                    lv_of_5_0=ruleOperated();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperatedRule());
                    	        }
                           		set(
                           			current, 
                           			"of",
                            		lv_of_5_0, 
                            		"Operated");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:935:5: this_Terminal_6= ruleTerminal
                    {
                     
                            newCompositeNode(grammarAccess.getOperatedAccess().getTerminalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTerminal_in_ruleOperated2122);
                    this_Terminal_6=ruleTerminal();

                    state._fsp--;

                     
                            current = this_Terminal_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperated"


    // $ANTLR start "entryRuleTerminal"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:951:1: entryRuleTerminal returns [EObject current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final EObject entryRuleTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:952:2: (iv_ruleTerminal= ruleTerminal EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:953:2: iv_ruleTerminal= ruleTerminal EOF
            {
             newCompositeNode(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_ruleTerminal_in_entryRuleTerminal2157);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;

             current =iv_ruleTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal2167); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:960:1: ruleTerminal returns [EObject current=null] : ( ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) ) | ( () ( (lv_token_5_0= RULE_STRING ) ) ) | ( () ( (lv_to_7_0= RULE_ID ) ) ) | this_ParenthesizedElement_8= ruleParenthesizedElement ) ;
    public final EObject ruleTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token lv_token_5_0=null;
        Token lv_to_7_0=null;
        EObject this_ParenthesizedElement_8 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:963:28: ( ( ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) ) | ( () ( (lv_token_5_0= RULE_STRING ) ) ) | ( () ( (lv_to_7_0= RULE_ID ) ) ) | this_ParenthesizedElement_8= ruleParenthesizedElement ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:964:1: ( ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) ) | ( () ( (lv_token_5_0= RULE_STRING ) ) ) | ( () ( (lv_to_7_0= RULE_ID ) ) ) | this_ParenthesizedElement_8= ruleParenthesizedElement )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:964:1: ( ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) ) | ( () ( (lv_token_5_0= RULE_STRING ) ) ) | ( () ( (lv_to_7_0= RULE_ID ) ) ) | this_ParenthesizedElement_8= ruleParenthesizedElement )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==20) ) {
                    alt12=1;
                }
                else if ( (LA12_1==EOF||LA12_1==RULE_ID||LA12_1==RULE_STRING||LA12_1==22||(LA12_1>=26 && LA12_1<=33)) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:964:2: ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:964:2: ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:964:3: () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:964:3: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:965:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalAccess().getRangeAction_0_0(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:970:2: ( (lv_min_1_0= RULE_STRING ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:971:1: (lv_min_1_0= RULE_STRING )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:971:1: (lv_min_1_0= RULE_STRING )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:972:3: lv_min_1_0= RULE_STRING
                    {
                    lv_min_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminal2219); 

                    			newLeafNode(lv_min_1_0, grammarAccess.getTerminalAccess().getMinSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"min",
                            		lv_min_1_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTerminal2236); 

                        	newLeafNode(otherlv_2, grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_0_2());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:992:1: ( (lv_max_3_0= RULE_STRING ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:993:1: (lv_max_3_0= RULE_STRING )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:993:1: (lv_max_3_0= RULE_STRING )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:994:3: lv_max_3_0= RULE_STRING
                    {
                    lv_max_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminal2253); 

                    			newLeafNode(lv_max_3_0, grammarAccess.getTerminalAccess().getMaxSTRINGTerminalRuleCall_0_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"max",
                            		lv_max_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1011:6: ( () ( (lv_token_5_0= RULE_STRING ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1011:6: ( () ( (lv_token_5_0= RULE_STRING ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1011:7: () ( (lv_token_5_0= RULE_STRING ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1011:7: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1012:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalAccess().getSingleAction_1_0(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1017:2: ( (lv_token_5_0= RULE_STRING ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1018:1: (lv_token_5_0= RULE_STRING )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1018:1: (lv_token_5_0= RULE_STRING )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1019:3: lv_token_5_0= RULE_STRING
                    {
                    lv_token_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminal2292); 

                    			newLeafNode(lv_token_5_0, grammarAccess.getTerminalAccess().getTokenSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"token",
                            		lv_token_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1036:6: ( () ( (lv_to_7_0= RULE_ID ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1036:6: ( () ( (lv_to_7_0= RULE_ID ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1036:7: () ( (lv_to_7_0= RULE_ID ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1036:7: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1037:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalAccess().getReferenceAction_2_0(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1042:2: ( (lv_to_7_0= RULE_ID ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1043:1: (lv_to_7_0= RULE_ID )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1043:1: (lv_to_7_0= RULE_ID )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1044:3: lv_to_7_0= RULE_ID
                    {
                    lv_to_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTerminal2331); 

                    			newLeafNode(lv_to_7_0, grammarAccess.getTerminalAccess().getToIDTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTerminalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"to",
                            		lv_to_7_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1062:5: this_ParenthesizedElement_8= ruleParenthesizedElement
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalAccess().getParenthesizedElementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleParenthesizedElement_in_ruleTerminal2365);
                    this_ParenthesizedElement_8=ruleParenthesizedElement();

                    state._fsp--;

                     
                            current = this_ParenthesizedElement_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleParenthesizedElement"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1078:1: entryRuleParenthesizedElement returns [EObject current=null] : iv_ruleParenthesizedElement= ruleParenthesizedElement EOF ;
    public final EObject entryRuleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedElement = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1079:2: (iv_ruleParenthesizedElement= ruleParenthesizedElement EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1080:2: iv_ruleParenthesizedElement= ruleParenthesizedElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement2400);
            iv_ruleParenthesizedElement=ruleParenthesizedElement();

            state._fsp--;

             current =iv_ruleParenthesizedElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedElement2410); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedElement"


    // $ANTLR start "ruleParenthesizedElement"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1087:1: ruleParenthesizedElement returns [EObject current=null] : (otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Alternative_1 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1090:28: ( (otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')' ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1091:1: (otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')' )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1091:1: (otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')' )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1091:3: otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleParenthesizedElement2447); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesizedElementAccess().getAlternativeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAlternative_in_ruleParenthesizedElement2469);
            this_Alternative_1=ruleAlternative();

            state._fsp--;

             
                    current = this_Alternative_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleParenthesizedElement2480); 

                	newLeafNode(otherlv_2, grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedElement"


    // $ANTLR start "entryRuleGrammarID"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1116:1: entryRuleGrammarID returns [String current=null] : iv_ruleGrammarID= ruleGrammarID EOF ;
    public final String entryRuleGrammarID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGrammarID = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1117:2: (iv_ruleGrammarID= ruleGrammarID EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1118:2: iv_ruleGrammarID= ruleGrammarID EOF
            {
             newCompositeNode(grammarAccess.getGrammarIDRule()); 
            pushFollow(FOLLOW_ruleGrammarID_in_entryRuleGrammarID2517);
            iv_ruleGrammarID=ruleGrammarID();

            state._fsp--;

             current =iv_ruleGrammarID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrammarID2528); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrammarID"


    // $ANTLR start "ruleGrammarID"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1125:1: ruleGrammarID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleGrammarID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1128:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1129:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1129:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1129:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrammarID2568); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1136:1: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:1137:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleGrammarID2587); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrammarID2602); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammarID"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTest213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTest230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTest247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGrammarID_in_ruleTest270 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_13_in_ruleTest334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTest364 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_13_in_ruleTest443 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTest468 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTest480 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTest497 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_16_in_ruleTest576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTest609 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_17_in_ruleTest662 = new BitSet(new long[]{0x00000000018C0000L});
    public static final BitSet FOLLOW_ruleMember_in_ruleTest683 = new BitSet(new long[]{0x00000000018C0000L});
    public static final BitSet FOLLOW_18_in_ruleTest696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_ruleMember789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSub_in_ruleMember816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_ruleMember843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleApply925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApply942 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_ruleApply966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApply996 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleApply1022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApply1052 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleApply1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSub_in_entryRuleSub1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSub1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSub1154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSub1174 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSub1186 = new BitSet(new long[]{0x00000001C0000050L});
    public static final BitSet FOLLOW_ruleSG_in_ruleSub1207 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSub1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNew_in_entryRuleNew1255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNew1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleNew1302 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_25_in_ruleNew1320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNew1351 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleNew1368 = new BitSet(new long[]{0x00000001C0000050L});
    public static final BitSet FOLLOW_ruleSG_in_ruleNew1389 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNew1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSG_in_entryRuleSG1437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSG1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleSG1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative1527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleAlternative1584 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleAlternative1605 = new BitSet(new long[]{0x00000001C0000050L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleAlternative1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence1664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleSequence1721 = new BitSet(new long[]{0x00000001C0000052L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleSequence1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_ruleCardinality1846 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_27_in_ruleCardinality1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCardinality1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCardinality1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_entryRuleOperated1965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperated1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOperated2013 = new BitSet(new long[]{0x00000001C0000050L});
    public static final BitSet FOLLOW_ruleOperated_in_ruleOperated2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOperated2063 = new BitSet(new long[]{0x00000001C0000050L});
    public static final BitSet FOLLOW_ruleOperated_in_ruleOperated2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_ruleOperated2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_entryRuleTerminal2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminal2219 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTerminal2236 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminal2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminal2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTerminal2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedElement_in_ruleTerminal2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement2400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedElement2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleParenthesizedElement2447 = new BitSet(new long[]{0x00000001C0000050L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleParenthesizedElement2469 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleParenthesizedElement2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrammarID_in_entryRuleGrammarID2517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrammarID2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID2568 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleGrammarID2587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID2602 = new BitSet(new long[]{0x0000000400000002L});

}
