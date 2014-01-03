package sle.fsml.input.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sle.fsml.input.services.InputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInputParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CM", "RULE_WS", "'['", "','", "']'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_CM=5;
    public static final int T__10=10;
    public static final int RULE_WS=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;

    // delegates
    // delegators


        public InternalInputParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInputParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInputParser.tokenNames; }
    public String getGrammarFileName() { return "../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g"; }



     	private InputGrammarAccess grammarAccess;
     	
        public InternalInputParser(TokenStream input, InputGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Input";	
       	}
       	
       	@Override
       	protected InputGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleInput"
    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:67:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:68:2: (iv_ruleInput= ruleInput EOF )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:69:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput75);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput85); 

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
    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:76:1: ruleInput returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_inputs_2_0= ruleInputEntry ) ) (otherlv_3= ',' ( (lv_inputs_4_0= ruleInputEntry ) ) )* )? otherlv_5= ']' otherlv_6= '.' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_inputs_2_0 = null;

        EObject lv_inputs_4_0 = null;


         enterRule(); 
            
        try {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:79:28: ( ( () otherlv_1= '[' ( ( (lv_inputs_2_0= ruleInputEntry ) ) (otherlv_3= ',' ( (lv_inputs_4_0= ruleInputEntry ) ) )* )? otherlv_5= ']' otherlv_6= '.' ) )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:80:1: ( () otherlv_1= '[' ( ( (lv_inputs_2_0= ruleInputEntry ) ) (otherlv_3= ',' ( (lv_inputs_4_0= ruleInputEntry ) ) )* )? otherlv_5= ']' otherlv_6= '.' )
            {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:80:1: ( () otherlv_1= '[' ( ( (lv_inputs_2_0= ruleInputEntry ) ) (otherlv_3= ',' ( (lv_inputs_4_0= ruleInputEntry ) ) )* )? otherlv_5= ']' otherlv_6= '.' )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:80:2: () otherlv_1= '[' ( ( (lv_inputs_2_0= ruleInputEntry ) ) (otherlv_3= ',' ( (lv_inputs_4_0= ruleInputEntry ) ) )* )? otherlv_5= ']' otherlv_6= '.'
            {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:80:2: ()
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputAccess().getInputAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,7,FOLLOW_7_in_ruleInput131); 

                	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getLeftSquareBracketKeyword_1());
                
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:90:1: ( ( (lv_inputs_2_0= ruleInputEntry ) ) (otherlv_3= ',' ( (lv_inputs_4_0= ruleInputEntry ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:90:2: ( (lv_inputs_2_0= ruleInputEntry ) ) (otherlv_3= ',' ( (lv_inputs_4_0= ruleInputEntry ) ) )*
                    {
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:90:2: ( (lv_inputs_2_0= ruleInputEntry ) )
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:91:1: (lv_inputs_2_0= ruleInputEntry )
                    {
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:91:1: (lv_inputs_2_0= ruleInputEntry )
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:92:3: lv_inputs_2_0= ruleInputEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getInputsInputEntryParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInputEntry_in_ruleInput153);
                    lv_inputs_2_0=ruleInputEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	        }
                           		add(
                           			current, 
                           			"inputs",
                            		lv_inputs_2_0, 
                            		"InputEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:108:2: (otherlv_3= ',' ( (lv_inputs_4_0= ruleInputEntry ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==8) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:108:4: otherlv_3= ',' ( (lv_inputs_4_0= ruleInputEntry ) )
                    	    {
                    	    otherlv_3=(Token)match(input,8,FOLLOW_8_in_ruleInput166); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getInputAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:112:1: ( (lv_inputs_4_0= ruleInputEntry ) )
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:113:1: (lv_inputs_4_0= ruleInputEntry )
                    	    {
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:113:1: (lv_inputs_4_0= ruleInputEntry )
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:114:3: lv_inputs_4_0= ruleInputEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputAccess().getInputsInputEntryParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInputEntry_in_ruleInput187);
                    	    lv_inputs_4_0=ruleInputEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inputs",
                    	            		lv_inputs_4_0, 
                    	            		"InputEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,9,FOLLOW_9_in_ruleInput203); 

                	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getRightSquareBracketKeyword_3());
                
            otherlv_6=(Token)match(input,10,FOLLOW_10_in_ruleInput215); 

                	newLeafNode(otherlv_6, grammarAccess.getInputAccess().getFullStopKeyword_4());
                

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


    // $ANTLR start "entryRuleInputEntry"
    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:146:1: entryRuleInputEntry returns [EObject current=null] : iv_ruleInputEntry= ruleInputEntry EOF ;
    public final EObject entryRuleInputEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputEntry = null;


        try {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:147:2: (iv_ruleInputEntry= ruleInputEntry EOF )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:148:2: iv_ruleInputEntry= ruleInputEntry EOF
            {
             newCompositeNode(grammarAccess.getInputEntryRule()); 
            pushFollow(FOLLOW_ruleInputEntry_in_entryRuleInputEntry251);
            iv_ruleInputEntry=ruleInputEntry();

            state._fsp--;

             current =iv_ruleInputEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputEntry261); 

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
    // $ANTLR end "entryRuleInputEntry"


    // $ANTLR start "ruleInputEntry"
    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:155:1: ruleInputEntry returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleInputEntry() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:158:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:159:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:159:1: ( (lv_value_0_0= RULE_ID ) )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:160:1: (lv_value_0_0= RULE_ID )
            {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:160:1: (lv_value_0_0= RULE_ID )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:161:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputEntry302); 

            			newLeafNode(lv_value_0_0, grammarAccess.getInputEntryAccess().getValueIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInputEntryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleInputEntry"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_ruleInput131 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleInputEntry_in_ruleInput153 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_8_in_ruleInput166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInputEntry_in_ruleInput187 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_9_in_ruleInput203 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleInput215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputEntry_in_entryRuleInputEntry251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputEntry261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputEntry302 = new BitSet(new long[]{0x0000000000000002L});

}