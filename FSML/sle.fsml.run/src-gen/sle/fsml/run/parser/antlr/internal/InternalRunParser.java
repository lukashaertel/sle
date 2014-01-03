package sle.fsml.run.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sle.fsml.run.services.RunGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRunParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'run'", "'on'", "'to'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalRunParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRunParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRunParser.tokenNames; }
    public String getGrammarFileName() { return "../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g"; }



     	private RunGrammarAccess grammarAccess;
     	
        public InternalRunParser(TokenStream input, RunGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Runfile";	
       	}
       	
       	@Override
       	protected RunGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRunfile"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:67:1: entryRuleRunfile returns [EObject current=null] : iv_ruleRunfile= ruleRunfile EOF ;
    public final EObject entryRuleRunfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunfile = null;


        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:68:2: (iv_ruleRunfile= ruleRunfile EOF )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:69:2: iv_ruleRunfile= ruleRunfile EOF
            {
             newCompositeNode(grammarAccess.getRunfileRule()); 
            pushFollow(FOLLOW_ruleRunfile_in_entryRuleRunfile75);
            iv_ruleRunfile=ruleRunfile();

            state._fsp--;

             current =iv_ruleRunfile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRunfile85); 

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
    // $ANTLR end "entryRuleRunfile"


    // $ANTLR start "ruleRunfile"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:76:1: ruleRunfile returns [EObject current=null] : ( () ( (lv_runs_1_0= ruleRun ) )+ ) ;
    public final EObject ruleRunfile() throws RecognitionException {
        EObject current = null;

        EObject lv_runs_1_0 = null;


         enterRule(); 
            
        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:79:28: ( ( () ( (lv_runs_1_0= ruleRun ) )+ ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:80:1: ( () ( (lv_runs_1_0= ruleRun ) )+ )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:80:1: ( () ( (lv_runs_1_0= ruleRun ) )+ )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:80:2: () ( (lv_runs_1_0= ruleRun ) )+
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:80:2: ()
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRunfileAccess().getRunfileAction_0(),
                        current);
                

            }

            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:86:2: ( (lv_runs_1_0= ruleRun ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:87:1: (lv_runs_1_0= ruleRun )
            	    {
            	    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:87:1: (lv_runs_1_0= ruleRun )
            	    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:88:3: lv_runs_1_0= ruleRun
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRunfileAccess().getRunsRunParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRun_in_ruleRunfile140);
            	    lv_runs_1_0=ruleRun();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRunfileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"runs",
            	            		lv_runs_1_0, 
            	            		"Run");
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
    // $ANTLR end "ruleRunfile"


    // $ANTLR start "entryRuleRun"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:112:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:113:2: (iv_ruleRun= ruleRun EOF )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:114:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_ruleRun_in_entryRuleRun177);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRun187); 

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
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:121:1: ruleRun returns [EObject current=null] : (otherlv_0= 'run' ( (lv_machine_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_input_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_machine_1_0=null;
        Token otherlv_2=null;
        Token lv_input_3_0=null;
        Token otherlv_4=null;
        Token lv_target_5_0=null;

         enterRule(); 
            
        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:124:28: ( (otherlv_0= 'run' ( (lv_machine_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_input_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) ) ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:125:1: (otherlv_0= 'run' ( (lv_machine_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_input_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) ) )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:125:1: (otherlv_0= 'run' ( (lv_machine_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_input_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:125:3: otherlv_0= 'run' ( (lv_machine_1_0= RULE_STRING ) ) otherlv_2= 'on' ( (lv_input_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRun224); 

                	newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRunKeyword_0());
                
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:129:1: ( (lv_machine_1_0= RULE_STRING ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:130:1: (lv_machine_1_0= RULE_STRING )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:130:1: (lv_machine_1_0= RULE_STRING )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:131:3: lv_machine_1_0= RULE_STRING
            {
            lv_machine_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRun241); 

            			newLeafNode(lv_machine_1_0, grammarAccess.getRunAccess().getMachineSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRunRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"machine",
                    		lv_machine_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRun258); 

                	newLeafNode(otherlv_2, grammarAccess.getRunAccess().getOnKeyword_2());
                
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:151:1: ( (lv_input_3_0= RULE_STRING ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:152:1: (lv_input_3_0= RULE_STRING )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:152:1: (lv_input_3_0= RULE_STRING )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:153:3: lv_input_3_0= RULE_STRING
            {
            lv_input_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRun275); 

            			newLeafNode(lv_input_3_0, grammarAccess.getRunAccess().getInputSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRunRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"input",
                    		lv_input_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRun292); 

                	newLeafNode(otherlv_4, grammarAccess.getRunAccess().getToKeyword_4());
                
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:173:1: ( (lv_target_5_0= RULE_STRING ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:174:1: (lv_target_5_0= RULE_STRING )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:174:1: (lv_target_5_0= RULE_STRING )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:175:3: lv_target_5_0= RULE_STRING
            {
            lv_target_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRun309); 

            			newLeafNode(lv_target_5_0, grammarAccess.getRunAccess().getTargetSTRINGTerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRunRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"target",
                    		lv_target_5_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleRun"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRunfile_in_entryRuleRunfile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRunfile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_ruleRunfile140 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleRun_in_entryRuleRun177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRun187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRun224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRun241 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRun258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRun275 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRun292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRun309 = new BitSet(new long[]{0x0000000000000002L});

}