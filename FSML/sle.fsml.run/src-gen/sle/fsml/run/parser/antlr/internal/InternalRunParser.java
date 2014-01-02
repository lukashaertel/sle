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
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:121:1: ruleRun returns [EObject current=null] : (otherlv_0= 'run' ( (lv_machine_1_0= ruleMachine ) ) otherlv_2= 'on' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_target_5_0=null;
        EObject lv_machine_1_0 = null;

        EObject lv_input_3_0 = null;


         enterRule(); 
            
        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:124:28: ( (otherlv_0= 'run' ( (lv_machine_1_0= ruleMachine ) ) otherlv_2= 'on' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) ) ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:125:1: (otherlv_0= 'run' ( (lv_machine_1_0= ruleMachine ) ) otherlv_2= 'on' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) ) )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:125:1: (otherlv_0= 'run' ( (lv_machine_1_0= ruleMachine ) ) otherlv_2= 'on' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:125:3: otherlv_0= 'run' ( (lv_machine_1_0= ruleMachine ) ) otherlv_2= 'on' ( (lv_input_3_0= ruleInput ) ) otherlv_4= 'to' ( (lv_target_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRun224); 

                	newLeafNode(otherlv_0, grammarAccess.getRunAccess().getRunKeyword_0());
                
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:129:1: ( (lv_machine_1_0= ruleMachine ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:130:1: (lv_machine_1_0= ruleMachine )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:130:1: (lv_machine_1_0= ruleMachine )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:131:3: lv_machine_1_0= ruleMachine
            {
             
            	        newCompositeNode(grammarAccess.getRunAccess().getMachineMachineParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMachine_in_ruleRun245);
            lv_machine_1_0=ruleMachine();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRunRule());
            	        }
                   		set(
                   			current, 
                   			"machine",
                    		lv_machine_1_0, 
                    		"Machine");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRun257); 

                	newLeafNode(otherlv_2, grammarAccess.getRunAccess().getOnKeyword_2());
                
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:151:1: ( (lv_input_3_0= ruleInput ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:152:1: (lv_input_3_0= ruleInput )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:152:1: (lv_input_3_0= ruleInput )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:153:3: lv_input_3_0= ruleInput
            {
             
            	        newCompositeNode(grammarAccess.getRunAccess().getInputInputParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInput_in_ruleRun278);
            lv_input_3_0=ruleInput();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRunRule());
            	        }
                   		set(
                   			current, 
                   			"input",
                    		lv_input_3_0, 
                    		"Input");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleRun290); 

                	newLeafNode(otherlv_4, grammarAccess.getRunAccess().getToKeyword_4());
                
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:173:1: ( (lv_target_5_0= RULE_STRING ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:174:1: (lv_target_5_0= RULE_STRING )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:174:1: (lv_target_5_0= RULE_STRING )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:175:3: lv_target_5_0= RULE_STRING
            {
            lv_target_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRun307); 

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


    // $ANTLR start "entryRuleMachine"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:199:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:200:2: (iv_ruleMachine= ruleMachine EOF )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:201:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_ruleMachine_in_entryRuleMachine348);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMachine358); 

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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:208:1: ruleMachine returns [EObject current=null] : (this_MachineReference_0= ruleMachineReference | this_MachineLocation_1= ruleMachineLocation ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        EObject this_MachineReference_0 = null;

        EObject this_MachineLocation_1 = null;


         enterRule(); 
            
        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:211:28: ( (this_MachineReference_0= ruleMachineReference | this_MachineLocation_1= ruleMachineLocation ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:212:1: (this_MachineReference_0= ruleMachineReference | this_MachineLocation_1= ruleMachineLocation )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:212:1: (this_MachineReference_0= ruleMachineReference | this_MachineLocation_1= ruleMachineLocation )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:213:5: this_MachineReference_0= ruleMachineReference
                    {
                     
                            newCompositeNode(grammarAccess.getMachineAccess().getMachineReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMachineReference_in_ruleMachine405);
                    this_MachineReference_0=ruleMachineReference();

                    state._fsp--;

                     
                            current = this_MachineReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:223:5: this_MachineLocation_1= ruleMachineLocation
                    {
                     
                            newCompositeNode(grammarAccess.getMachineAccess().getMachineLocationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMachineLocation_in_ruleMachine432);
                    this_MachineLocation_1=ruleMachineLocation();

                    state._fsp--;

                     
                            current = this_MachineLocation_1; 
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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleMachineReference"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:239:1: entryRuleMachineReference returns [EObject current=null] : iv_ruleMachineReference= ruleMachineReference EOF ;
    public final EObject entryRuleMachineReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachineReference = null;


        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:240:2: (iv_ruleMachineReference= ruleMachineReference EOF )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:241:2: iv_ruleMachineReference= ruleMachineReference EOF
            {
             newCompositeNode(grammarAccess.getMachineReferenceRule()); 
            pushFollow(FOLLOW_ruleMachineReference_in_entryRuleMachineReference467);
            iv_ruleMachineReference=ruleMachineReference();

            state._fsp--;

             current =iv_ruleMachineReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMachineReference477); 

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
    // $ANTLR end "entryRuleMachineReference"


    // $ANTLR start "ruleMachineReference"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:248:1: ruleMachineReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleMachineReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:251:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:252:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:252:1: ( (otherlv_0= RULE_ID ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:253:1: (otherlv_0= RULE_ID )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:253:1: (otherlv_0= RULE_ID )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:254:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMachineReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMachineReference521); 

            		newLeafNode(otherlv_0, grammarAccess.getMachineReferenceAccess().getFsmFSMCrossReference_0()); 
            	

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
    // $ANTLR end "ruleMachineReference"


    // $ANTLR start "entryRuleMachineLocation"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:273:1: entryRuleMachineLocation returns [EObject current=null] : iv_ruleMachineLocation= ruleMachineLocation EOF ;
    public final EObject entryRuleMachineLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachineLocation = null;


        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:274:2: (iv_ruleMachineLocation= ruleMachineLocation EOF )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:275:2: iv_ruleMachineLocation= ruleMachineLocation EOF
            {
             newCompositeNode(grammarAccess.getMachineLocationRule()); 
            pushFollow(FOLLOW_ruleMachineLocation_in_entryRuleMachineLocation556);
            iv_ruleMachineLocation=ruleMachineLocation();

            state._fsp--;

             current =iv_ruleMachineLocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMachineLocation566); 

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
    // $ANTLR end "entryRuleMachineLocation"


    // $ANTLR start "ruleMachineLocation"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:282:1: ruleMachineLocation returns [EObject current=null] : ( (lv_location_0_0= RULE_STRING ) ) ;
    public final EObject ruleMachineLocation() throws RecognitionException {
        EObject current = null;

        Token lv_location_0_0=null;

         enterRule(); 
            
        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:285:28: ( ( (lv_location_0_0= RULE_STRING ) ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:286:1: ( (lv_location_0_0= RULE_STRING ) )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:286:1: ( (lv_location_0_0= RULE_STRING ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:287:1: (lv_location_0_0= RULE_STRING )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:287:1: (lv_location_0_0= RULE_STRING )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:288:3: lv_location_0_0= RULE_STRING
            {
            lv_location_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMachineLocation607); 

            			newLeafNode(lv_location_0_0, grammarAccess.getMachineLocationAccess().getLocationSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMachineLocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location",
                    		lv_location_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleMachineLocation"


    // $ANTLR start "entryRuleInput"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:312:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:313:2: (iv_ruleInput= ruleInput EOF )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:314:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput647);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput657); 

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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:321:1: ruleInput returns [EObject current=null] : (this_InputReference_0= ruleInputReference | this_InputLocation_1= ruleInputLocation ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        EObject this_InputReference_0 = null;

        EObject this_InputLocation_1 = null;


         enterRule(); 
            
        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:324:28: ( (this_InputReference_0= ruleInputReference | this_InputLocation_1= ruleInputLocation ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:325:1: (this_InputReference_0= ruleInputReference | this_InputLocation_1= ruleInputLocation )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:325:1: (this_InputReference_0= ruleInputReference | this_InputLocation_1= ruleInputLocation )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:326:5: this_InputReference_0= ruleInputReference
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInputReference_in_ruleInput704);
                    this_InputReference_0=ruleInputReference();

                    state._fsp--;

                     
                            current = this_InputReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:336:5: this_InputLocation_1= ruleInputLocation
                    {
                     
                            newCompositeNode(grammarAccess.getInputAccess().getInputLocationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInputLocation_in_ruleInput731);
                    this_InputLocation_1=ruleInputLocation();

                    state._fsp--;

                     
                            current = this_InputLocation_1; 
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleInputReference"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:352:1: entryRuleInputReference returns [EObject current=null] : iv_ruleInputReference= ruleInputReference EOF ;
    public final EObject entryRuleInputReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputReference = null;


        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:353:2: (iv_ruleInputReference= ruleInputReference EOF )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:354:2: iv_ruleInputReference= ruleInputReference EOF
            {
             newCompositeNode(grammarAccess.getInputReferenceRule()); 
            pushFollow(FOLLOW_ruleInputReference_in_entryRuleInputReference766);
            iv_ruleInputReference=ruleInputReference();

            state._fsp--;

             current =iv_ruleInputReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputReference776); 

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
    // $ANTLR end "entryRuleInputReference"


    // $ANTLR start "ruleInputReference"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:361:1: ruleInputReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleInputReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:364:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:365:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:365:1: ( (otherlv_0= RULE_ID ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:366:1: (otherlv_0= RULE_ID )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:366:1: (otherlv_0= RULE_ID )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:367:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInputReferenceRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputReference820); 

            		newLeafNode(otherlv_0, grammarAccess.getInputReferenceAccess().getInputInputCrossReference_0()); 
            	

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
    // $ANTLR end "ruleInputReference"


    // $ANTLR start "entryRuleInputLocation"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:386:1: entryRuleInputLocation returns [EObject current=null] : iv_ruleInputLocation= ruleInputLocation EOF ;
    public final EObject entryRuleInputLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputLocation = null;


        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:387:2: (iv_ruleInputLocation= ruleInputLocation EOF )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:388:2: iv_ruleInputLocation= ruleInputLocation EOF
            {
             newCompositeNode(grammarAccess.getInputLocationRule()); 
            pushFollow(FOLLOW_ruleInputLocation_in_entryRuleInputLocation855);
            iv_ruleInputLocation=ruleInputLocation();

            state._fsp--;

             current =iv_ruleInputLocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputLocation865); 

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
    // $ANTLR end "entryRuleInputLocation"


    // $ANTLR start "ruleInputLocation"
    // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:395:1: ruleInputLocation returns [EObject current=null] : ( (lv_location_0_0= RULE_STRING ) ) ;
    public final EObject ruleInputLocation() throws RecognitionException {
        EObject current = null;

        Token lv_location_0_0=null;

         enterRule(); 
            
        try {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:398:28: ( ( (lv_location_0_0= RULE_STRING ) ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:399:1: ( (lv_location_0_0= RULE_STRING ) )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:399:1: ( (lv_location_0_0= RULE_STRING ) )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:400:1: (lv_location_0_0= RULE_STRING )
            {
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:400:1: (lv_location_0_0= RULE_STRING )
            // ../sle.fsml.run/src-gen/sle/fsml/run/parser/antlr/internal/InternalRun.g:401:3: lv_location_0_0= RULE_STRING
            {
            lv_location_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInputLocation906); 

            			newLeafNode(lv_location_0_0, grammarAccess.getInputLocationAccess().getLocationSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputLocationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"location",
                    		lv_location_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleInputLocation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRunfile_in_entryRuleRunfile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRunfile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRun_in_ruleRunfile140 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleRun_in_entryRuleRun177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRun187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRun224 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMachine_in_ruleRun245 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRun257 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleInput_in_ruleRun278 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRun290 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRun307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMachine_in_entryRuleMachine348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMachine358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMachineReference_in_ruleMachine405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMachineLocation_in_ruleMachine432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMachineReference_in_entryRuleMachineReference467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMachineReference477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMachineReference521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMachineLocation_in_entryRuleMachineLocation556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMachineLocation566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMachineLocation607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputReference_in_ruleInput704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputLocation_in_ruleInput731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputReference_in_entryRuleInputReference766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputReference776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputReference820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputLocation_in_entryRuleInputLocation855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputLocation865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInputLocation906 = new BitSet(new long[]{0x0000000000000002L});

}