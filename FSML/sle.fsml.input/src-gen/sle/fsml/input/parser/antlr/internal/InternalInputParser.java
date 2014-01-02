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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CM", "RULE_WS", "':'", "'['", "','", "']'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_CM=5;
    public static final int T__11=11;
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
    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:76:1: ruleInput returns [EObject current=null] : ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )? otherlv_3= '[' ( ( (lv_inputs_4_0= ruleInputEntry ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleInputEntry ) ) )* )? otherlv_7= ']' otherlv_8= '.' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_inputs_4_0 = null;

        EObject lv_inputs_6_0 = null;


         enterRule(); 
            
        try {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:79:28: ( ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )? otherlv_3= '[' ( ( (lv_inputs_4_0= ruleInputEntry ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleInputEntry ) ) )* )? otherlv_7= ']' otherlv_8= '.' ) )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:80:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )? otherlv_3= '[' ( ( (lv_inputs_4_0= ruleInputEntry ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleInputEntry ) ) )* )? otherlv_7= ']' otherlv_8= '.' )
            {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:80:1: ( () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )? otherlv_3= '[' ( ( (lv_inputs_4_0= ruleInputEntry ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleInputEntry ) ) )* )? otherlv_7= ']' otherlv_8= '.' )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:80:2: () ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )? otherlv_3= '[' ( ( (lv_inputs_4_0= ruleInputEntry ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleInputEntry ) ) )* )? otherlv_7= ']' otherlv_8= '.'
            {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:80:2: ()
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getInputAccess().getInputAction_0(),
                        current);
                

            }

            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:86:2: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:86:3: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':'
                    {
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:86:3: ( (lv_name_1_0= RULE_ID ) )
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:87:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:87:1: (lv_name_1_0= RULE_ID )
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:88:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInput137); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getInputAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInputRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,7,FOLLOW_7_in_ruleInput154); 

                        	newLeafNode(otherlv_2, grammarAccess.getInputAccess().getColonKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,8,FOLLOW_8_in_ruleInput168); 

                	newLeafNode(otherlv_3, grammarAccess.getInputAccess().getLeftSquareBracketKeyword_2());
                
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:112:1: ( ( (lv_inputs_4_0= ruleInputEntry ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleInputEntry ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:112:2: ( (lv_inputs_4_0= ruleInputEntry ) ) (otherlv_5= ',' ( (lv_inputs_6_0= ruleInputEntry ) ) )*
                    {
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:112:2: ( (lv_inputs_4_0= ruleInputEntry ) )
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:113:1: (lv_inputs_4_0= ruleInputEntry )
                    {
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:113:1: (lv_inputs_4_0= ruleInputEntry )
                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:114:3: lv_inputs_4_0= ruleInputEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getInputAccess().getInputsInputEntryParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInputEntry_in_ruleInput190);
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

                    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:130:2: (otherlv_5= ',' ( (lv_inputs_6_0= ruleInputEntry ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==9) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:130:4: otherlv_5= ',' ( (lv_inputs_6_0= ruleInputEntry ) )
                    	    {
                    	    otherlv_5=(Token)match(input,9,FOLLOW_9_in_ruleInput203); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getInputAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:134:1: ( (lv_inputs_6_0= ruleInputEntry ) )
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:135:1: (lv_inputs_6_0= ruleInputEntry )
                    	    {
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:135:1: (lv_inputs_6_0= ruleInputEntry )
                    	    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:136:3: lv_inputs_6_0= ruleInputEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInputAccess().getInputsInputEntryParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInputEntry_in_ruleInput224);
                    	    lv_inputs_6_0=ruleInputEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInputRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"inputs",
                    	            		lv_inputs_6_0, 
                    	            		"InputEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,10,FOLLOW_10_in_ruleInput240); 

                	newLeafNode(otherlv_7, grammarAccess.getInputAccess().getRightSquareBracketKeyword_4());
                
            otherlv_8=(Token)match(input,11,FOLLOW_11_in_ruleInput252); 

                	newLeafNode(otherlv_8, grammarAccess.getInputAccess().getFullStopKeyword_5());
                

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
    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:168:1: entryRuleInputEntry returns [EObject current=null] : iv_ruleInputEntry= ruleInputEntry EOF ;
    public final EObject entryRuleInputEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputEntry = null;


        try {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:169:2: (iv_ruleInputEntry= ruleInputEntry EOF )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:170:2: iv_ruleInputEntry= ruleInputEntry EOF
            {
             newCompositeNode(grammarAccess.getInputEntryRule()); 
            pushFollow(FOLLOW_ruleInputEntry_in_entryRuleInputEntry288);
            iv_ruleInputEntry=ruleInputEntry();

            state._fsp--;

             current =iv_ruleInputEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInputEntry298); 

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
    // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:177:1: ruleInputEntry returns [EObject current=null] : ( (lv_value_0_0= RULE_ID ) ) ;
    public final EObject ruleInputEntry() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:180:28: ( ( (lv_value_0_0= RULE_ID ) ) )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:181:1: ( (lv_value_0_0= RULE_ID ) )
            {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:181:1: ( (lv_value_0_0= RULE_ID ) )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:182:1: (lv_value_0_0= RULE_ID )
            {
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:182:1: (lv_value_0_0= RULE_ID )
            // ../sle.fsml.input/src-gen/sle/fsml/input/parser/antlr/internal/InternalInput.g:183:3: lv_value_0_0= RULE_ID
            {
            lv_value_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInputEntry339); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleInput137 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_ruleInput154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_ruleInput168 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_ruleInputEntry_in_ruleInput190 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_ruleInput203 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleInputEntry_in_ruleInput224 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_10_in_ruleInput240 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleInput252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInputEntry_in_entryRuleInputEntry288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInputEntry298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInputEntry339 = new BitSet(new long[]{0x0000000000000002L});

}