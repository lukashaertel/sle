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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'def'", "':'", "'start'", "'{'", "'}'", "'apply'", "'..'", "'space'", "'substitute'", "'with'", "';'", "'|'", "'?'", "'*'", "'+'", "'->'", "'!'", "'('", "')'", "'.'"
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
    public static final int RULE_STRING=6;
    public static final int T__16=16;
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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:76:1: ruleModel returns [EObject current=null] : ( (lv_items_0_0= ruleItem ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_items_0_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:79:28: ( ( (lv_items_0_0= ruleItem ) )+ )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:80:1: ( (lv_items_0_0= ruleItem ) )+
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:80:1: ( (lv_items_0_0= ruleItem ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:81:1: (lv_items_0_0= ruleItem )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:81:1: (lv_items_0_0= ruleItem )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:82:3: lv_items_0_0= ruleItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getItemsItemParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItem_in_ruleModel130);
            	    lv_items_0_0=ruleItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_0_0, 
            	            		"Item");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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


    // $ANTLR start "entryRuleItem"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:106:1: entryRuleItem returns [EObject current=null] : iv_ruleItem= ruleItem EOF ;
    public final EObject entryRuleItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItem = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:107:2: (iv_ruleItem= ruleItem EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:108:2: iv_ruleItem= ruleItem EOF
            {
             newCompositeNode(grammarAccess.getItemRule()); 
            pushFollow(FOLLOW_ruleItem_in_entryRuleItem166);
            iv_ruleItem=ruleItem();

            state._fsp--;

             current =iv_ruleItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItem176); 

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
    // $ANTLR end "entryRuleItem"


    // $ANTLR start "ruleItem"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:115:1: ruleItem returns [EObject current=null] : (this_Def_0= ruleDef | this_Apply_1= ruleApply ) ;
    public final EObject ruleItem() throws RecognitionException {
        EObject current = null;

        EObject this_Def_0 = null;

        EObject this_Apply_1 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:118:28: ( (this_Def_0= ruleDef | this_Apply_1= ruleApply ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:119:1: (this_Def_0= ruleDef | this_Apply_1= ruleApply )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:119:1: (this_Def_0= ruleDef | this_Apply_1= ruleApply )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:120:5: this_Def_0= ruleDef
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getDefParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDef_in_ruleItem223);
                    this_Def_0=ruleDef();

                    state._fsp--;

                     
                            current = this_Def_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:130:5: this_Apply_1= ruleApply
                    {
                     
                            newCompositeNode(grammarAccess.getItemAccess().getApplyParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleApply_in_ruleItem250);
                    this_Apply_1=ruleApply();

                    state._fsp--;

                     
                            current = this_Apply_1; 
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
    // $ANTLR end "ruleItem"


    // $ANTLR start "entryRuleDef"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:146:1: entryRuleDef returns [EObject current=null] : iv_ruleDef= ruleDef EOF ;
    public final EObject entryRuleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDef = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:147:2: (iv_ruleDef= ruleDef EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:148:2: iv_ruleDef= ruleDef EOF
            {
             newCompositeNode(grammarAccess.getDefRule()); 
            pushFollow(FOLLOW_ruleDef_in_entryRuleDef285);
            iv_ruleDef=ruleDef();

            state._fsp--;

             current =iv_ruleDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDef295); 

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
    // $ANTLR end "entryRuleDef"


    // $ANTLR start "ruleDef"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:155:1: ruleDef returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleGrammarID ) ) ( ( (lv_hasStartrule_4_0= 'start' ) ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '{' ( (lv_substitutions_7_0= ruleSubstitution ) ) otherlv_8= '}' )? ) ;
    public final EObject ruleDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_hasStartrule_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_substitutions_7_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:158:28: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleGrammarID ) ) ( ( (lv_hasStartrule_4_0= 'start' ) ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '{' ( (lv_substitutions_7_0= ruleSubstitution ) ) otherlv_8= '}' )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:159:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleGrammarID ) ) ( ( (lv_hasStartrule_4_0= 'start' ) ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '{' ( (lv_substitutions_7_0= ruleSubstitution ) ) otherlv_8= '}' )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:159:1: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleGrammarID ) ) ( ( (lv_hasStartrule_4_0= 'start' ) ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '{' ( (lv_substitutions_7_0= ruleSubstitution ) ) otherlv_8= '}' )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:159:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleGrammarID ) ) ( ( (lv_hasStartrule_4_0= 'start' ) ) ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= '{' ( (lv_substitutions_7_0= ruleSubstitution ) ) otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDef332); 

                	newLeafNode(otherlv_0, grammarAccess.getDefAccess().getDefKeyword_0());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:163:1: ( (lv_name_1_0= RULE_ID ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:164:1: (lv_name_1_0= RULE_ID )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:164:1: (lv_name_1_0= RULE_ID )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDef349); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDef366); 

                	newLeafNode(otherlv_2, grammarAccess.getDefAccess().getColonKeyword_2());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:185:1: ( ( ruleGrammarID ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:186:1: ( ruleGrammarID )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:186:1: ( ruleGrammarID )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:187:3: ruleGrammarID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDefRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDefAccess().getRefGrammarCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleGrammarID_in_ruleDef389);
            ruleGrammarID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:200:2: ( ( (lv_hasStartrule_4_0= 'start' ) ) ( (otherlv_5= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:200:3: ( (lv_hasStartrule_4_0= 'start' ) ) ( (otherlv_5= RULE_ID ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:200:3: ( (lv_hasStartrule_4_0= 'start' ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:201:1: (lv_hasStartrule_4_0= 'start' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:201:1: (lv_hasStartrule_4_0= 'start' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:202:3: lv_hasStartrule_4_0= 'start'
                    {
                    lv_hasStartrule_4_0=(Token)match(input,13,FOLLOW_13_in_ruleDef408); 

                            newLeafNode(lv_hasStartrule_4_0, grammarAccess.getDefAccess().getHasStartruleStartKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefRule());
                    	        }
                           		setWithLastConsumed(current, "hasStartrule", true, "start");
                    	    

                    }


                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:215:2: ( (otherlv_5= RULE_ID ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:216:1: (otherlv_5= RULE_ID )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:216:1: (otherlv_5= RULE_ID )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:217:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDef441); 

                    		newLeafNode(otherlv_5, grammarAccess.getDefAccess().getStartruleAbstractRuleCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:228:4: (otherlv_6= '{' ( (lv_substitutions_7_0= ruleSubstitution ) ) otherlv_8= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:228:6: otherlv_6= '{' ( (lv_substitutions_7_0= ruleSubstitution ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleDef456); 

                        	newLeafNode(otherlv_6, grammarAccess.getDefAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:232:1: ( (lv_substitutions_7_0= ruleSubstitution ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:233:1: (lv_substitutions_7_0= ruleSubstitution )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:233:1: (lv_substitutions_7_0= ruleSubstitution )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:234:3: lv_substitutions_7_0= ruleSubstitution
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefAccess().getSubstitutionsSubstitutionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSubstitution_in_ruleDef477);
                    lv_substitutions_7_0=ruleSubstitution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDefRule());
                    	        }
                           		add(
                           			current, 
                           			"substitutions",
                            		lv_substitutions_7_0, 
                            		"Substitution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDef489); 

                        	newLeafNode(otherlv_8, grammarAccess.getDefAccess().getRightCurlyBracketKeyword_5_2());
                        

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
    // $ANTLR end "ruleDef"


    // $ANTLR start "entryRuleApply"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:262:1: entryRuleApply returns [EObject current=null] : iv_ruleApply= ruleApply EOF ;
    public final EObject entryRuleApply() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:263:2: (iv_ruleApply= ruleApply EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:264:2: iv_ruleApply= ruleApply EOF
            {
             newCompositeNode(grammarAccess.getApplyRule()); 
            pushFollow(FOLLOW_ruleApply_in_entryRuleApply527);
            iv_ruleApply=ruleApply();

            state._fsp--;

             current =iv_ruleApply; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleApply537); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:271:1: ruleApply returns [EObject current=null] : (otherlv_0= 'apply' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_minOrIt_3_0= RULE_INT ) ) ( ( (lv_hasMax_4_0= '..' ) ) ( (lv_max_5_0= RULE_INT ) ) ( ( (lv_hasSpace_6_0= 'space' ) ) ( (lv_space_7_0= RULE_INT ) ) ) )? ) ;
    public final EObject ruleApply() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_minOrIt_3_0=null;
        Token lv_hasMax_4_0=null;
        Token lv_max_5_0=null;
        Token lv_hasSpace_6_0=null;
        Token lv_space_7_0=null;

         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:274:28: ( (otherlv_0= 'apply' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_minOrIt_3_0= RULE_INT ) ) ( ( (lv_hasMax_4_0= '..' ) ) ( (lv_max_5_0= RULE_INT ) ) ( ( (lv_hasSpace_6_0= 'space' ) ) ( (lv_space_7_0= RULE_INT ) ) ) )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:275:1: (otherlv_0= 'apply' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_minOrIt_3_0= RULE_INT ) ) ( ( (lv_hasMax_4_0= '..' ) ) ( (lv_max_5_0= RULE_INT ) ) ( ( (lv_hasSpace_6_0= 'space' ) ) ( (lv_space_7_0= RULE_INT ) ) ) )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:275:1: (otherlv_0= 'apply' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_minOrIt_3_0= RULE_INT ) ) ( ( (lv_hasMax_4_0= '..' ) ) ( (lv_max_5_0= RULE_INT ) ) ( ( (lv_hasSpace_6_0= 'space' ) ) ( (lv_space_7_0= RULE_INT ) ) ) )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:275:3: otherlv_0= 'apply' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':' ( (lv_minOrIt_3_0= RULE_INT ) ) ( ( (lv_hasMax_4_0= '..' ) ) ( (lv_max_5_0= RULE_INT ) ) ( ( (lv_hasSpace_6_0= 'space' ) ) ( (lv_space_7_0= RULE_INT ) ) ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleApply574); 

                	newLeafNode(otherlv_0, grammarAccess.getApplyAccess().getApplyKeyword_0());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:279:1: ( (otherlv_1= RULE_ID ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:280:1: (otherlv_1= RULE_ID )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:280:1: (otherlv_1= RULE_ID )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:281:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getApplyRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleApply594); 

            		newLeafNode(otherlv_1, grammarAccess.getApplyAccess().getDefDefCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleApply606); 

                	newLeafNode(otherlv_2, grammarAccess.getApplyAccess().getColonKeyword_2());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:296:1: ( (lv_minOrIt_3_0= RULE_INT ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:297:1: (lv_minOrIt_3_0= RULE_INT )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:297:1: (lv_minOrIt_3_0= RULE_INT )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:298:3: lv_minOrIt_3_0= RULE_INT
            {
            lv_minOrIt_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApply623); 

            			newLeafNode(lv_minOrIt_3_0, grammarAccess.getApplyAccess().getMinOrItINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getApplyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"minOrIt",
                    		lv_minOrIt_3_0, 
                    		"INT");
            	    

            }


            }

            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:314:2: ( ( (lv_hasMax_4_0= '..' ) ) ( (lv_max_5_0= RULE_INT ) ) ( ( (lv_hasSpace_6_0= 'space' ) ) ( (lv_space_7_0= RULE_INT ) ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:314:3: ( (lv_hasMax_4_0= '..' ) ) ( (lv_max_5_0= RULE_INT ) ) ( ( (lv_hasSpace_6_0= 'space' ) ) ( (lv_space_7_0= RULE_INT ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:314:3: ( (lv_hasMax_4_0= '..' ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:315:1: (lv_hasMax_4_0= '..' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:315:1: (lv_hasMax_4_0= '..' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:316:3: lv_hasMax_4_0= '..'
                    {
                    lv_hasMax_4_0=(Token)match(input,17,FOLLOW_17_in_ruleApply647); 

                            newLeafNode(lv_hasMax_4_0, grammarAccess.getApplyAccess().getHasMaxFullStopFullStopKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplyRule());
                    	        }
                           		setWithLastConsumed(current, "hasMax", true, "..");
                    	    

                    }


                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:329:2: ( (lv_max_5_0= RULE_INT ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:330:1: (lv_max_5_0= RULE_INT )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:330:1: (lv_max_5_0= RULE_INT )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:331:3: lv_max_5_0= RULE_INT
                    {
                    lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApply677); 

                    			newLeafNode(lv_max_5_0, grammarAccess.getApplyAccess().getMaxINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"max",
                            		lv_max_5_0, 
                            		"INT");
                    	    

                    }


                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:347:2: ( ( (lv_hasSpace_6_0= 'space' ) ) ( (lv_space_7_0= RULE_INT ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:347:3: ( (lv_hasSpace_6_0= 'space' ) ) ( (lv_space_7_0= RULE_INT ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:347:3: ( (lv_hasSpace_6_0= 'space' ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:348:1: (lv_hasSpace_6_0= 'space' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:348:1: (lv_hasSpace_6_0= 'space' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:349:3: lv_hasSpace_6_0= 'space'
                    {
                    lv_hasSpace_6_0=(Token)match(input,18,FOLLOW_18_in_ruleApply701); 

                            newLeafNode(lv_hasSpace_6_0, grammarAccess.getApplyAccess().getHasSpaceSpaceKeyword_4_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplyRule());
                    	        }
                           		setWithLastConsumed(current, "hasSpace", true, "space");
                    	    

                    }


                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:362:2: ( (lv_space_7_0= RULE_INT ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:363:1: (lv_space_7_0= RULE_INT )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:363:1: (lv_space_7_0= RULE_INT )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:364:3: lv_space_7_0= RULE_INT
                    {
                    lv_space_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleApply731); 

                    			newLeafNode(lv_space_7_0, grammarAccess.getApplyAccess().getSpaceINTTerminalRuleCall_4_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getApplyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"space",
                            		lv_space_7_0, 
                            		"INT");
                    	    

                    }


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
    // $ANTLR end "ruleApply"


    // $ANTLR start "entryRuleSubstitution"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:388:1: entryRuleSubstitution returns [EObject current=null] : iv_ruleSubstitution= ruleSubstitution EOF ;
    public final EObject entryRuleSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitution = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:389:2: (iv_ruleSubstitution= ruleSubstitution EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:390:2: iv_ruleSubstitution= ruleSubstitution EOF
            {
             newCompositeNode(grammarAccess.getSubstitutionRule()); 
            pushFollow(FOLLOW_ruleSubstitution_in_entryRuleSubstitution775);
            iv_ruleSubstitution=ruleSubstitution();

            state._fsp--;

             current =iv_ruleSubstitution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstitution785); 

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
    // $ANTLR end "entryRuleSubstitution"


    // $ANTLR start "ruleSubstitution"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:397:1: ruleSubstitution returns [EObject current=null] : (otherlv_0= 'substitute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';' ) ;
    public final EObject ruleSubstitution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_substitution_3_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:400:28: ( (otherlv_0= 'substitute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';' ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:401:1: (otherlv_0= 'substitute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';' )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:401:1: (otherlv_0= 'substitute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';' )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:401:3: otherlv_0= 'substitute' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'with' ( (lv_substitution_3_0= ruleSG ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSubstitution822); 

                	newLeafNode(otherlv_0, grammarAccess.getSubstitutionAccess().getSubstituteKeyword_0());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:405:1: ( (otherlv_1= RULE_ID ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:406:1: (otherlv_1= RULE_ID )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:406:1: (otherlv_1= RULE_ID )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:407:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSubstitutionRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubstitution842); 

            		newLeafNode(otherlv_1, grammarAccess.getSubstitutionAccess().getRuleAbstractRuleCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleSubstitution854); 

                	newLeafNode(otherlv_2, grammarAccess.getSubstitutionAccess().getWithKeyword_2());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:422:1: ( (lv_substitution_3_0= ruleSG ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:423:1: (lv_substitution_3_0= ruleSG )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:423:1: (lv_substitution_3_0= ruleSG )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:424:3: lv_substitution_3_0= ruleSG
            {
             
            	        newCompositeNode(grammarAccess.getSubstitutionAccess().getSubstitutionSGParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSG_in_ruleSubstitution875);
            lv_substitution_3_0=ruleSG();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubstitutionRule());
            	        }
                   		set(
                   			current, 
                   			"substitution",
                    		lv_substitution_3_0, 
                    		"SG");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleSubstitution887); 

                	newLeafNode(otherlv_4, grammarAccess.getSubstitutionAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSubstitution"


    // $ANTLR start "entryRuleSG"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:452:1: entryRuleSG returns [EObject current=null] : iv_ruleSG= ruleSG EOF ;
    public final EObject entryRuleSG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSG = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:453:2: (iv_ruleSG= ruleSG EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:454:2: iv_ruleSG= ruleSG EOF
            {
             newCompositeNode(grammarAccess.getSGRule()); 
            pushFollow(FOLLOW_ruleSG_in_entryRuleSG923);
            iv_ruleSG=ruleSG();

            state._fsp--;

             current =iv_ruleSG; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSG933); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:461:1: ruleSG returns [EObject current=null] : this_Alternative_0= ruleAlternative ;
    public final EObject ruleSG() throws RecognitionException {
        EObject current = null;

        EObject this_Alternative_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:464:28: (this_Alternative_0= ruleAlternative )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:466:5: this_Alternative_0= ruleAlternative
            {
             
                    newCompositeNode(grammarAccess.getSGAccess().getAlternativeParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleAlternative_in_ruleSG979);
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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:482:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:483:2: (iv_ruleAlternative= ruleAlternative EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:484:2: iv_ruleAlternative= ruleAlternative EOF
            {
             newCompositeNode(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_ruleAlternative_in_entryRuleAlternative1013);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;

             current =iv_ruleAlternative; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternative1023); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:491:1: ruleAlternative returns [EObject current=null] : (this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )? ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Sequence_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:494:28: ( (this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:495:1: (this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:495:1: (this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:496:5: this_Sequence_0= ruleSequence ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getAlternativeAccess().getSequenceParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleSequence_in_ruleAlternative1070);
            this_Sequence_0=ruleSequence();

            state._fsp--;

             
                    current = this_Sequence_0; 
                    afterParserOrEnumRuleCall();
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:504:1: ( () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:504:2: () otherlv_2= '|' ( (lv_right_3_0= ruleAlternative ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:504:2: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:505:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAlternativeAccess().getAlternativeLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAlternative1091); 

                        	newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getVerticalLineKeyword_1_1());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:514:1: ( (lv_right_3_0= ruleAlternative ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:515:1: (lv_right_3_0= ruleAlternative )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:515:1: (lv_right_3_0= ruleAlternative )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:516:3: lv_right_3_0= ruleAlternative
                    {
                     
                    	        newCompositeNode(grammarAccess.getAlternativeAccess().getRightAlternativeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAlternative_in_ruleAlternative1112);
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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:540:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:541:2: (iv_ruleSequence= ruleSequence EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:542:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence1150);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence1160); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:549:1: ruleSequence returns [EObject current=null] : (this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )? ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        EObject this_Cardinality_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:552:28: ( (this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:553:1: (this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:553:1: (this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:554:5: this_Cardinality_0= ruleCardinality ( () ( (lv_right_2_0= ruleSequence ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getSequenceAccess().getCardinalityParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCardinality_in_ruleSequence1207);
            this_Cardinality_0=ruleCardinality();

            state._fsp--;

             
                    current = this_Cardinality_0; 
                    afterParserOrEnumRuleCall();
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:562:1: ( () ( (lv_right_2_0= ruleSequence ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING||(LA7_0>=26 && LA7_0<=28)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:562:2: () ( (lv_right_2_0= ruleSequence ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:562:2: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:563:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getSequenceAccess().getSequenceLeftAction_1_0(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:568:2: ( (lv_right_2_0= ruleSequence ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:569:1: (lv_right_2_0= ruleSequence )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:569:1: (lv_right_2_0= ruleSequence )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:570:3: lv_right_2_0= ruleSequence
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceAccess().getRightSequenceParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequence_in_ruleSequence1237);
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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:594:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:595:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:596:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1275);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1285); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:603:1: ruleCardinality returns [EObject current=null] : (this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Operated_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:606:28: ( (this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:607:1: (this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:607:1: (this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:608:5: this_Operated_0= ruleOperated ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )?
            {
             
                    newCompositeNode(grammarAccess.getCardinalityAccess().getOperatedParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleOperated_in_ruleCardinality1332);
            this_Operated_0=ruleOperated();

            state._fsp--;

             
                    current = this_Operated_0; 
                    afterParserOrEnumRuleCall();
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:616:1: ( ( () otherlv_2= '?' ) | ( () otherlv_4= '*' ) | ( () otherlv_6= '+' ) )?
            int alt8=4;
            switch ( input.LA(1) ) {
                case 23:
                    {
                    alt8=1;
                    }
                    break;
                case 24:
                    {
                    alt8=2;
                    }
                    break;
                case 25:
                    {
                    alt8=3;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:616:2: ( () otherlv_2= '?' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:616:2: ( () otherlv_2= '?' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:616:3: () otherlv_2= '?'
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:616:3: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:617:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCardinalityAccess().getOptionalOfAction_1_0_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleCardinality1354); 

                        	newLeafNode(otherlv_2, grammarAccess.getCardinalityAccess().getQuestionMarkKeyword_1_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:627:6: ( () otherlv_4= '*' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:627:6: ( () otherlv_4= '*' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:627:7: () otherlv_4= '*'
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:627:7: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:628:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCardinalityAccess().getStarOfAction_1_1_0(),
                                current);
                        

                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleCardinality1383); 

                        	newLeafNode(otherlv_4, grammarAccess.getCardinalityAccess().getAsteriskKeyword_1_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:638:6: ( () otherlv_6= '+' )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:638:6: ( () otherlv_6= '+' )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:638:7: () otherlv_6= '+'
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:638:7: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:639:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCardinalityAccess().getPlusOfAction_1_2_0(),
                                current);
                        

                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleCardinality1412); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:656:1: entryRuleOperated returns [EObject current=null] : iv_ruleOperated= ruleOperated EOF ;
    public final EObject entryRuleOperated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperated = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:657:2: (iv_ruleOperated= ruleOperated EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:658:2: iv_ruleOperated= ruleOperated EOF
            {
             newCompositeNode(grammarAccess.getOperatedRule()); 
            pushFollow(FOLLOW_ruleOperated_in_entryRuleOperated1451);
            iv_ruleOperated=ruleOperated();

            state._fsp--;

             current =iv_ruleOperated; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperated1461); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:665:1: ruleOperated returns [EObject current=null] : ( (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) ) | (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) ) | this_Terminal_6= ruleTerminal ) ;
    public final EObject ruleOperated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_of_2_0 = null;

        EObject lv_of_5_0 = null;

        EObject this_Terminal_6 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:668:28: ( ( (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) ) | (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) ) | this_Terminal_6= ruleTerminal ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:669:1: ( (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) ) | (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) ) | this_Terminal_6= ruleTerminal )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:669:1: ( (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) ) | (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) ) | this_Terminal_6= ruleTerminal )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case RULE_STRING:
            case 28:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:669:2: (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:669:2: (otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:669:4: otherlv_0= '->' () ( (lv_of_2_0= ruleOperated ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleOperated1499); 

                        	newLeafNode(otherlv_0, grammarAccess.getOperatedAccess().getHyphenMinusGreaterThanSignKeyword_0_0());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:673:1: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:674:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOperatedAccess().getUntilAction_0_1(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:679:2: ( (lv_of_2_0= ruleOperated ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:680:1: (lv_of_2_0= ruleOperated )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:680:1: (lv_of_2_0= ruleOperated )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:681:3: lv_of_2_0= ruleOperated
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperated_in_ruleOperated1529);
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
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:698:6: (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:698:6: (otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:698:8: otherlv_3= '!' () ( (lv_of_5_0= ruleOperated ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleOperated1549); 

                        	newLeafNode(otherlv_3, grammarAccess.getOperatedAccess().getExclamationMarkKeyword_1_0());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:702:1: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:703:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getOperatedAccess().getNegationAction_1_1(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:708:2: ( (lv_of_5_0= ruleOperated ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:709:1: (lv_of_5_0= ruleOperated )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:709:1: (lv_of_5_0= ruleOperated )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:710:3: lv_of_5_0= ruleOperated
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperatedAccess().getOfOperatedParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOperated_in_ruleOperated1579);
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
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:728:5: this_Terminal_6= ruleTerminal
                    {
                     
                            newCompositeNode(grammarAccess.getOperatedAccess().getTerminalParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTerminal_in_ruleOperated1608);
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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:744:1: entryRuleTerminal returns [EObject current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final EObject entryRuleTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:745:2: (iv_ruleTerminal= ruleTerminal EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:746:2: iv_ruleTerminal= ruleTerminal EOF
            {
             newCompositeNode(grammarAccess.getTerminalRule()); 
            pushFollow(FOLLOW_ruleTerminal_in_entryRuleTerminal1643);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;

             current =iv_ruleTerminal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminal1653); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:753:1: ruleTerminal returns [EObject current=null] : ( ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) ) | ( () ( (lv_token_5_0= RULE_STRING ) ) ) | this_ParenthesizedElement_6= ruleParenthesizedElement ) ;
    public final EObject ruleTerminal() throws RecognitionException {
        EObject current = null;

        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token lv_max_3_0=null;
        Token lv_token_5_0=null;
        EObject this_ParenthesizedElement_6 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:756:28: ( ( ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) ) | ( () ( (lv_token_5_0= RULE_STRING ) ) ) | this_ParenthesizedElement_6= ruleParenthesizedElement ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:757:1: ( ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) ) | ( () ( (lv_token_5_0= RULE_STRING ) ) ) | this_ParenthesizedElement_6= ruleParenthesizedElement )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:757:1: ( ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) ) | ( () ( (lv_token_5_0= RULE_STRING ) ) ) | this_ParenthesizedElement_6= ruleParenthesizedElement )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==RULE_STRING||(LA10_1>=21 && LA10_1<=29)) ) {
                    alt10=2;
                }
                else if ( (LA10_1==17) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==28) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:757:2: ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:757:2: ( () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:757:3: () ( (lv_min_1_0= RULE_STRING ) ) otherlv_2= '..' ( (lv_max_3_0= RULE_STRING ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:757:3: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:758:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalAccess().getRangeAction_0_0(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:763:2: ( (lv_min_1_0= RULE_STRING ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:764:1: (lv_min_1_0= RULE_STRING )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:764:1: (lv_min_1_0= RULE_STRING )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:765:3: lv_min_1_0= RULE_STRING
                    {
                    lv_min_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminal1705); 

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

                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTerminal1722); 

                        	newLeafNode(otherlv_2, grammarAccess.getTerminalAccess().getFullStopFullStopKeyword_0_2());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:785:1: ( (lv_max_3_0= RULE_STRING ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:786:1: (lv_max_3_0= RULE_STRING )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:786:1: (lv_max_3_0= RULE_STRING )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:787:3: lv_max_3_0= RULE_STRING
                    {
                    lv_max_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminal1739); 

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
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:804:6: ( () ( (lv_token_5_0= RULE_STRING ) ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:804:6: ( () ( (lv_token_5_0= RULE_STRING ) ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:804:7: () ( (lv_token_5_0= RULE_STRING ) )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:804:7: ()
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:805:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getTerminalAccess().getSingleAction_1_0(),
                                current);
                        

                    }

                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:810:2: ( (lv_token_5_0= RULE_STRING ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:811:1: (lv_token_5_0= RULE_STRING )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:811:1: (lv_token_5_0= RULE_STRING )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:812:3: lv_token_5_0= RULE_STRING
                    {
                    lv_token_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerminal1778); 

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
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:830:5: this_ParenthesizedElement_6= ruleParenthesizedElement
                    {
                     
                            newCompositeNode(grammarAccess.getTerminalAccess().getParenthesizedElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleParenthesizedElement_in_ruleTerminal1812);
                    this_ParenthesizedElement_6=ruleParenthesizedElement();

                    state._fsp--;

                     
                            current = this_ParenthesizedElement_6; 
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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:846:1: entryRuleParenthesizedElement returns [EObject current=null] : iv_ruleParenthesizedElement= ruleParenthesizedElement EOF ;
    public final EObject entryRuleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedElement = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:847:2: (iv_ruleParenthesizedElement= ruleParenthesizedElement EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:848:2: iv_ruleParenthesizedElement= ruleParenthesizedElement EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedElementRule()); 
            pushFollow(FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement1847);
            iv_ruleParenthesizedElement=ruleParenthesizedElement();

            state._fsp--;

             current =iv_ruleParenthesizedElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedElement1857); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:855:1: ruleParenthesizedElement returns [EObject current=null] : (otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')' ) ;
    public final EObject ruleParenthesizedElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Alternative_1 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:858:28: ( (otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')' ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:859:1: (otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')' )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:859:1: (otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')' )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:859:3: otherlv_0= '(' this_Alternative_1= ruleAlternative otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleParenthesizedElement1894); 

                	newLeafNode(otherlv_0, grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getParenthesizedElementAccess().getAlternativeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleAlternative_in_ruleParenthesizedElement1916);
            this_Alternative_1=ruleAlternative();

            state._fsp--;

             
                    current = this_Alternative_1; 
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleParenthesizedElement1927); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:884:1: entryRuleGrammarID returns [String current=null] : iv_ruleGrammarID= ruleGrammarID EOF ;
    public final String entryRuleGrammarID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGrammarID = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:885:2: (iv_ruleGrammarID= ruleGrammarID EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:886:2: iv_ruleGrammarID= ruleGrammarID EOF
            {
             newCompositeNode(grammarAccess.getGrammarIDRule()); 
            pushFollow(FOLLOW_ruleGrammarID_in_entryRuleGrammarID1964);
            iv_ruleGrammarID=ruleGrammarID();

            state._fsp--;

             current =iv_ruleGrammarID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrammarID1975); 

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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:893:1: ruleGrammarID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleGrammarID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:896:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:897:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:897:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:897:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrammarID2015); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:904:1: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:905:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleGrammarID2034); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrammarID2049); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop11;
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
    public static final BitSet FOLLOW_ruleItem_in_ruleModel130 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_ruleItem_in_entryRuleItem166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItem176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDef_in_ruleItem223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_ruleItem250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDef_in_entryRuleDef285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDef295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDef332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDef349 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleDef366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleGrammarID_in_ruleDef389 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_ruleDef408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDef441 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDef456 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleSubstitution_in_ruleDef477 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDef489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApply_in_entryRuleApply527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApply537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleApply574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleApply594 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleApply606 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApply623 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleApply647 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApply677 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleApply701 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleApply731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstitution_in_entryRuleSubstitution775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstitution785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSubstitution822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubstitution842 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSubstitution854 = new BitSet(new long[]{0x000000001C000040L});
    public static final BitSet FOLLOW_ruleSG_in_ruleSubstitution875 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSubstitution887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSG_in_entryRuleSG923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSG933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleSG979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternative_in_entryRuleAlternative1013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternative1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleAlternative1070 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAlternative1091 = new BitSet(new long[]{0x000000001C000040L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleAlternative1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleSequence1207 = new BitSet(new long[]{0x000000001C000042L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleSequence1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_ruleCardinality1332 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_23_in_ruleCardinality1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCardinality1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCardinality1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperated_in_entryRuleOperated1451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperated1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOperated1499 = new BitSet(new long[]{0x000000001C000040L});
    public static final BitSet FOLLOW_ruleOperated_in_ruleOperated1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOperated1549 = new BitSet(new long[]{0x000000001C000040L});
    public static final BitSet FOLLOW_ruleOperated_in_ruleOperated1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_ruleOperated1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminal_in_entryRuleTerminal1643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminal1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminal1705 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTerminal1722 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminal1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerminal1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedElement_in_ruleTerminal1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedElement_in_entryRuleParenthesizedElement1847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedElement1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleParenthesizedElement1894 = new BitSet(new long[]{0x000000001C000040L});
    public static final BitSet FOLLOW_ruleAlternative_in_ruleParenthesizedElement1916 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleParenthesizedElement1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrammarID_in_entryRuleGrammarID1964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrammarID1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID2015 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleGrammarID2034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrammarID2049 = new BitSet(new long[]{0x0000000040000002L});

}