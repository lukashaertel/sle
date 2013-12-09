package sle.fsml.input.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInputLexer extends Lexer {
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

    public InternalInputLexer() {;} 
    public InternalInputLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalInputLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:11:6: ( '[' )
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:11:8: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:12:6: ( ']' )
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:12:8: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:13:6: ( '.' )
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:13:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:14:7: ( ':' )
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:15:7: ( ',' )
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:560:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:560:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:560:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_CM"
    public final void mRULE_CM() throws RecognitionException {
        try {
            int _type = RULE_CM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:562:9: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:562:11: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:562:15: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:562:15: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:562:31: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:562:32: ( '\\r' )? '\\n'
                    {
                    // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:562:32: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:562:32: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CM"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:564:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:564:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:564:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | RULE_ID | RULE_CM | RULE_WS )
        int alt6=8;
        switch ( input.LA(1) ) {
        case '[':
            {
            alt6=1;
            }
            break;
        case ']':
            {
            alt6=2;
            }
            break;
        case '.':
            {
            alt6=3;
            }
            break;
        case ':':
            {
            alt6=4;
            }
            break;
        case ',':
            {
            alt6=5;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=6;
            }
            break;
        case '%':
            {
            alt6=7;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;
        }

        switch (alt6) {
            case 1 :
                // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:1:37: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 7 :
                // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:1:45: RULE_CM
                {
                mRULE_CM(); 

                }
                break;
            case 8 :
                // ../sle.fsml.input.ui/src-gen/sle/fsml/input/ui/contentassist/antlr/internal/InternalInput.g:1:53: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


 

}