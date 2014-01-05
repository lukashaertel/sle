package sle.fsml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sle.fsml.services.FSMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFSMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'initial'", "'state'", "'{'", "'}'", "'/'", "'->'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalFSMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFSMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFSMLParser.tokenNames; }
    public String getGrammarFileName() { return "../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g"; }



     	private FSMLGrammarAccess grammarAccess;
     	
        public InternalFSMLParser(TokenStream input, FSMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "FSM";	
       	}
       	
       	@Override
       	protected FSMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFSM"
    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:67:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:68:2: (iv_ruleFSM= ruleFSM EOF )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:69:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_ruleFSM_in_entryRuleFSM75);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFSM85); 

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
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:76:1: ruleFSM returns [EObject current=null] : ( (lv_states_0_0= ruleFSMState ) )* ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        EObject lv_states_0_0 = null;


         enterRule(); 
            
        try {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:79:28: ( ( (lv_states_0_0= ruleFSMState ) )* )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:80:1: ( (lv_states_0_0= ruleFSMState ) )*
            {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:80:1: ( (lv_states_0_0= ruleFSMState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:81:1: (lv_states_0_0= ruleFSMState )
            	    {
            	    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:81:1: (lv_states_0_0= ruleFSMState )
            	    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:82:3: lv_states_0_0= ruleFSMState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFSMAccess().getStatesFSMStateParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFSMState_in_ruleFSM130);
            	    lv_states_0_0=ruleFSMState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFSMRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_0_0, 
            	            		"FSMState");
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
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleFSMState"
    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:106:1: entryRuleFSMState returns [EObject current=null] : iv_ruleFSMState= ruleFSMState EOF ;
    public final EObject entryRuleFSMState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSMState = null;


        try {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:107:2: (iv_ruleFSMState= ruleFSMState EOF )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:108:2: iv_ruleFSMState= ruleFSMState EOF
            {
             newCompositeNode(grammarAccess.getFSMStateRule()); 
            pushFollow(FOLLOW_ruleFSMState_in_entryRuleFSMState166);
            iv_ruleFSMState=ruleFSMState();

            state._fsp--;

             current =iv_ruleFSMState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFSMState176); 

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
    // $ANTLR end "entryRuleFSMState"


    // $ANTLR start "ruleFSMState"
    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:115:1: ruleFSMState returns [EObject current=null] : ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleFSMTransition ) )* otherlv_5= '}' ) ;
    public final EObject ruleFSMState() throws RecognitionException {
        EObject current = null;

        Token lv_initial_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_transitions_4_0 = null;


         enterRule(); 
            
        try {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:118:28: ( ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleFSMTransition ) )* otherlv_5= '}' ) )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:119:1: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleFSMTransition ) )* otherlv_5= '}' )
            {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:119:1: ( ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleFSMTransition ) )* otherlv_5= '}' )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:119:2: ( (lv_initial_0_0= 'initial' ) )? otherlv_1= 'state' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_transitions_4_0= ruleFSMTransition ) )* otherlv_5= '}'
            {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:119:2: ( (lv_initial_0_0= 'initial' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:120:1: (lv_initial_0_0= 'initial' )
                    {
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:120:1: (lv_initial_0_0= 'initial' )
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:121:3: lv_initial_0_0= 'initial'
                    {
                    lv_initial_0_0=(Token)match(input,11,FOLLOW_11_in_ruleFSMState219); 

                            newLeafNode(lv_initial_0_0, grammarAccess.getFSMStateAccess().getInitialInitialKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFSMStateRule());
                    	        }
                           		setWithLastConsumed(current, "initial", true, "initial");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleFSMState245); 

                	newLeafNode(otherlv_1, grammarAccess.getFSMStateAccess().getStateKeyword_1());
                
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:138:1: ( (lv_name_2_0= RULE_ID ) )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:139:1: (lv_name_2_0= RULE_ID )
            {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:139:1: (lv_name_2_0= RULE_ID )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:140:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFSMState262); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFSMStateAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFSMStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleFSMState279); 

                	newLeafNode(otherlv_3, grammarAccess.getFSMStateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:160:1: ( (lv_transitions_4_0= ruleFSMTransition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:161:1: (lv_transitions_4_0= ruleFSMTransition )
            	    {
            	    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:161:1: (lv_transitions_4_0= ruleFSMTransition )
            	    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:162:3: lv_transitions_4_0= ruleFSMTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFSMStateAccess().getTransitionsFSMTransitionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFSMTransition_in_ruleFSMState300);
            	    lv_transitions_4_0=ruleFSMTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFSMStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_4_0, 
            	            		"FSMTransition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleFSMState313); 

                	newLeafNode(otherlv_5, grammarAccess.getFSMStateAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleFSMState"


    // $ANTLR start "entryRuleFSMTransition"
    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:190:1: entryRuleFSMTransition returns [EObject current=null] : iv_ruleFSMTransition= ruleFSMTransition EOF ;
    public final EObject entryRuleFSMTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSMTransition = null;


        try {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:191:2: (iv_ruleFSMTransition= ruleFSMTransition EOF )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:192:2: iv_ruleFSMTransition= ruleFSMTransition EOF
            {
             newCompositeNode(grammarAccess.getFSMTransitionRule()); 
            pushFollow(FOLLOW_ruleFSMTransition_in_entryRuleFSMTransition349);
            iv_ruleFSMTransition=ruleFSMTransition();

            state._fsp--;

             current =iv_ruleFSMTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFSMTransition359); 

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
    // $ANTLR end "entryRuleFSMTransition"


    // $ANTLR start "ruleFSMTransition"
    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:199:1: ruleFSMTransition returns [EObject current=null] : ( ( (lv_input_0_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_action_2_0= RULE_ID ) ) )? (otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleFSMTransition() throws RecognitionException {
        EObject current = null;

        Token lv_input_0_0=null;
        Token otherlv_1=null;
        Token lv_action_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:202:28: ( ( ( (lv_input_0_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_action_2_0= RULE_ID ) ) )? (otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' ) )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:203:1: ( ( (lv_input_0_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_action_2_0= RULE_ID ) ) )? (otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:203:1: ( ( (lv_input_0_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_action_2_0= RULE_ID ) ) )? (otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';' )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:203:2: ( (lv_input_0_0= RULE_ID ) ) (otherlv_1= '/' ( (lv_action_2_0= RULE_ID ) ) )? (otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )? otherlv_5= ';'
            {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:203:2: ( (lv_input_0_0= RULE_ID ) )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:204:1: (lv_input_0_0= RULE_ID )
            {
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:204:1: (lv_input_0_0= RULE_ID )
            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:205:3: lv_input_0_0= RULE_ID
            {
            lv_input_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFSMTransition401); 

            			newLeafNode(lv_input_0_0, grammarAccess.getFSMTransitionAccess().getInputIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFSMTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"input",
                    		lv_input_0_0, 
                    		"ID");
            	    

            }


            }

            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:221:2: (otherlv_1= '/' ( (lv_action_2_0= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:221:4: otherlv_1= '/' ( (lv_action_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleFSMTransition419); 

                        	newLeafNode(otherlv_1, grammarAccess.getFSMTransitionAccess().getSolidusKeyword_1_0());
                        
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:225:1: ( (lv_action_2_0= RULE_ID ) )
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:226:1: (lv_action_2_0= RULE_ID )
                    {
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:226:1: (lv_action_2_0= RULE_ID )
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:227:3: lv_action_2_0= RULE_ID
                    {
                    lv_action_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFSMTransition436); 

                    			newLeafNode(lv_action_2_0, grammarAccess.getFSMTransitionAccess().getActionIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFSMTransitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"action",
                            		lv_action_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:243:4: (otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:243:6: otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleFSMTransition456); 

                        	newLeafNode(otherlv_3, grammarAccess.getFSMTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                        
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:247:1: ( (otherlv_4= RULE_ID ) )
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:248:1: (otherlv_4= RULE_ID )
                    {
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:248:1: (otherlv_4= RULE_ID )
                    // ../sle.fsml/src-gen/sle/fsml/parser/antlr/internal/InternalFSML.g:249:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFSMTransitionRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFSMTransition476); 

                    		newLeafNode(otherlv_4, grammarAccess.getFSMTransitionAccess().getTargetFSMStateCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleFSMTransition490); 

                	newLeafNode(otherlv_5, grammarAccess.getFSMTransitionAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFSMTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleFSM_in_entryRuleFSM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFSM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFSMState_in_ruleFSM130 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleFSMState_in_entryRuleFSMState166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFSMState176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFSMState219 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFSMState245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFSMState262 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFSMState279 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFSMTransition_in_ruleFSMState300 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleFSMState313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFSMTransition_in_entryRuleFSMTransition349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFSMTransition359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFSMTransition401 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_15_in_ruleFSMTransition419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFSMTransition436 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleFSMTransition456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFSMTransition476 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFSMTransition490 = new BitSet(new long[]{0x0000000000000002L});

}