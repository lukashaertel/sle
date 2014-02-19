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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'test'", "'start'", "'at'", "'with'", "'depth'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:76:1: ruleModel returns [EObject current=null] : ( (lv_tests_0_0= ruleTest ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tests_0_0 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:79:28: ( ( (lv_tests_0_0= ruleTest ) )+ )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:80:1: ( (lv_tests_0_0= ruleTest ) )+
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:80:1: ( (lv_tests_0_0= ruleTest ) )+
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
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:81:1: (lv_tests_0_0= ruleTest )
            	    {
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:81:1: (lv_tests_0_0= ruleTest )
            	    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:82:3: lv_tests_0_0= ruleTest
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getTestsTestParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTest_in_ruleModel130);
            	    lv_tests_0_0=ruleTest();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tests",
            	            		lv_tests_0_0, 
            	            		"Test");
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
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:115:1: ruleTest returns [EObject current=null] : (otherlv_0= 'test' ( ( ruleQID ) ) (otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'with' otherlv_6= 'depth' ( (lv_depth_7_0= RULE_INT ) ) )? ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_depth_7_0=null;

         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:118:28: ( (otherlv_0= 'test' ( ( ruleQID ) ) (otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'with' otherlv_6= 'depth' ( (lv_depth_7_0= RULE_INT ) ) )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:119:1: (otherlv_0= 'test' ( ( ruleQID ) ) (otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'with' otherlv_6= 'depth' ( (lv_depth_7_0= RULE_INT ) ) )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:119:1: (otherlv_0= 'test' ( ( ruleQID ) ) (otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'with' otherlv_6= 'depth' ( (lv_depth_7_0= RULE_INT ) ) )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:119:3: otherlv_0= 'test' ( ( ruleQID ) ) (otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'with' otherlv_6= 'depth' ( (lv_depth_7_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleTest213); 

                	newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:123:1: ( ( ruleQID ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:124:1: ( ruleQID )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:124:1: ( ruleQID )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:125:3: ruleQID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTestRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTestAccess().getRefGrammarCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQID_in_ruleTest236);
            ruleQID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:138:2: (otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:138:4: otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTest249); 

                        	newLeafNode(otherlv_2, grammarAccess.getTestAccess().getStartKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTest261); 

                        	newLeafNode(otherlv_3, grammarAccess.getTestAccess().getAtKeyword_2_1());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:146:1: ( (otherlv_4= RULE_ID ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:147:1: (otherlv_4= RULE_ID )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:147:1: (otherlv_4= RULE_ID )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:148:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTestRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTest281); 

                    		newLeafNode(otherlv_4, grammarAccess.getTestAccess().getRuleAbstractRuleCrossReference_2_2_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:159:4: (otherlv_5= 'with' otherlv_6= 'depth' ( (lv_depth_7_0= RULE_INT ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:159:6: otherlv_5= 'with' otherlv_6= 'depth' ( (lv_depth_7_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleTest296); 

                        	newLeafNode(otherlv_5, grammarAccess.getTestAccess().getWithKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleTest308); 

                        	newLeafNode(otherlv_6, grammarAccess.getTestAccess().getDepthKeyword_3_1());
                        
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:167:1: ( (lv_depth_7_0= RULE_INT ) )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:168:1: (lv_depth_7_0= RULE_INT )
                    {
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:168:1: (lv_depth_7_0= RULE_INT )
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:169:3: lv_depth_7_0= RULE_INT
                    {
                    lv_depth_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTest325); 

                    			newLeafNode(lv_depth_7_0, grammarAccess.getTestAccess().getDepthINTTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTestRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"depth",
                            		lv_depth_7_0, 
                            		"INT");
                    	    

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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleQID"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:193:1: entryRuleQID returns [String current=null] : iv_ruleQID= ruleQID EOF ;
    public final String entryRuleQID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQID = null;


        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:194:2: (iv_ruleQID= ruleQID EOF )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:195:2: iv_ruleQID= ruleQID EOF
            {
             newCompositeNode(grammarAccess.getQIDRule()); 
            pushFollow(FOLLOW_ruleQID_in_entryRuleQID369);
            iv_ruleQID=ruleQID();

            state._fsp--;

             current =iv_ruleQID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQID380); 

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
    // $ANTLR end "entryRuleQID"


    // $ANTLR start "ruleQID"
    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:202:1: ruleQID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_QID_2= ruleQID )? ) ;
    public final AntlrDatatypeRuleToken ruleQID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_QID_2 = null;


         enterRule(); 
            
        try {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:205:28: ( (this_ID_0= RULE_ID (kw= '.' this_QID_2= ruleQID )? ) )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:206:1: (this_ID_0= RULE_ID (kw= '.' this_QID_2= ruleQID )? )
            {
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:206:1: (this_ID_0= RULE_ID (kw= '.' this_QID_2= ruleQID )? )
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:206:6: this_ID_0= RULE_ID (kw= '.' this_QID_2= ruleQID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQID420); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQIDAccess().getIDTerminalRuleCall_0()); 
                
            // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:213:1: (kw= '.' this_QID_2= ruleQID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../sle.gbt.xtext/src-gen/sle/gbt/xtext/parser/antlr/internal/InternalGBTS.g:214:2: kw= '.' this_QID_2= ruleQID
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleQID439); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQIDAccess().getFullStopKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getQIDAccess().getQIDParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleQID_in_ruleQID461);
                    this_QID_2=ruleQID();

                    state._fsp--;


                    		current.merge(this_QID_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleQID"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTest_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleTest213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQID_in_ruleTest236 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_12_in_ruleTest249 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTest261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTest281 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTest296 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTest308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTest325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQID_in_entryRuleQID369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQID380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQID420 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleQID439 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQID_in_ruleQID461 = new BitSet(new long[]{0x0000000000000002L});

}