package org.xtext.example.adaptdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdaptDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_BOOL=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalAdaptDslLexer() {;} 
    public InternalAdaptDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAdaptDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalAdaptDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:11:7: ( 'ContextModel{' )
            // InternalAdaptDsl.g:11:9: 'ContextModel{'
            {
            match("ContextModel{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:12:7: ( '{' )
            // InternalAdaptDsl.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:13:7: ( '};' )
            // InternalAdaptDsl.g:13:9: '};'
            {
            match("};"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:14:7: ( 'Services{' )
            // InternalAdaptDsl.g:14:9: 'Services{'
            {
            match("Services{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:15:7: ( ';' )
            // InternalAdaptDsl.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:16:7: ( 'Types{' )
            // InternalAdaptDsl.g:16:9: 'Types{'
            {
            match("Types{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:17:7: ( 'AdaptationModel{' )
            // InternalAdaptDsl.g:17:9: 'AdaptationModel{'
            {
            match("AdaptationModel{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:18:7: ( 'flow' )
            // InternalAdaptDsl.g:18:9: 'flow'
            {
            match("flow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:19:7: ( 'service' )
            // InternalAdaptDsl.g:19:9: 'service'
            {
            match("service"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:20:7: ( 'from' )
            // InternalAdaptDsl.g:20:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:21:7: ( 'as' )
            // InternalAdaptDsl.g:21:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:22:7: ( 'function' )
            // InternalAdaptDsl.g:22:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:23:7: ( 'rule' )
            // InternalAdaptDsl.g:23:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:24:7: ( 'LEVEL' )
            // InternalAdaptDsl.g:24:9: 'LEVEL'
            {
            match("LEVEL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:25:7: ( 'FACT' )
            // InternalAdaptDsl.g:25:9: 'FACT'
            {
            match("FACT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:26:7: ( 'IF' )
            // InternalAdaptDsl.g:26:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:27:7: ( '(' )
            // InternalAdaptDsl.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:28:7: ( ')' )
            // InternalAdaptDsl.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:29:7: ( 'THEN' )
            // InternalAdaptDsl.g:29:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:30:7: ( '}' )
            // InternalAdaptDsl.g:30:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:31:7: ( '||' )
            // InternalAdaptDsl.g:31:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:32:7: ( '&&' )
            // InternalAdaptDsl.g:32:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:33:7: ( 'm' )
            // InternalAdaptDsl.g:33:9: 'm'
            {
            match('m'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:34:7: ( '.get' )
            // InternalAdaptDsl.g:34:9: '.get'
            {
            match(".get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:35:7: ( '()' )
            // InternalAdaptDsl.g:35:9: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:36:7: ( '.' )
            // InternalAdaptDsl.g:36:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:37:7: ( '>' )
            // InternalAdaptDsl.g:37:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:38:7: ( '<' )
            // InternalAdaptDsl.g:38:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:39:7: ( '==' )
            // InternalAdaptDsl.g:39:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:40:7: ( '!=' )
            // InternalAdaptDsl.g:40:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:41:7: ( '>=' )
            // InternalAdaptDsl.g:41:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:42:7: ( '<=' )
            // InternalAdaptDsl.g:42:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:43:7: ( '===' )
            // InternalAdaptDsl.g:43:9: '==='
            {
            match("==="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:44:7: ( 'functionCall' )
            // InternalAdaptDsl.g:44:9: 'functionCall'
            {
            match("functionCall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:45:7: ( ',' )
            // InternalAdaptDsl.g:45:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:46:7: ( 'editFact' )
            // InternalAdaptDsl.g:46:9: 'editFact'
            {
            match("editFact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:47:7: ( 'setDisplayProperty' )
            // InternalAdaptDsl.g:47:9: 'setDisplayProperty'
            {
            match("setDisplayProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:48:7: ( 'addViewComponent' )
            // InternalAdaptDsl.g:48:9: 'addViewComponent'
            {
            match("addViewComponent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:49:7: ( 'deleteViewComponent' )
            // InternalAdaptDsl.g:49:9: 'deleteViewComponent'
            {
            match("deleteViewComponent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:50:7: ( 'addViewComponentButton' )
            // InternalAdaptDsl.g:50:9: 'addViewComponentButton'
            {
            match("addViewComponentButton"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:51:7: ( 'deleteViewComponentButton' )
            // InternalAdaptDsl.g:51:9: 'deleteViewComponentButton'
            {
            match("deleteViewComponentButton"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:52:7: ( 'addNavLink' )
            // InternalAdaptDsl.g:52:9: 'addNavLink'
            {
            match("addNavLink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:53:7: ( 'deleteNavLink' )
            // InternalAdaptDsl.g:53:9: 'deleteNavLink'
            {
            match("deleteNavLink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:54:7: ( 'redirectNavLink' )
            // InternalAdaptDsl.g:54:9: 'redirectNavLink'
            {
            match("redirectNavLink"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:55:7: ( 'clearNavigation' )
            // InternalAdaptDsl.g:55:9: 'clearNavigation'
            {
            match("clearNavigation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:56:7: ( 'changeFontSize' )
            // InternalAdaptDsl.g:56:9: 'changeFontSize'
            {
            match("changeFontSize"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:57:7: ( 'changeColorScheme' )
            // InternalAdaptDsl.g:57:9: 'changeColorScheme'
            {
            match("changeColorScheme"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:58:7: ( 'changeFont' )
            // InternalAdaptDsl.g:58:9: 'changeFont'
            {
            match("changeFont"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:59:7: ( 'changeTableCss' )
            // InternalAdaptDsl.g:59:9: 'changeTableCss'
            {
            match("changeTableCss"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:60:7: ( 'adaptCssClass' )
            // InternalAdaptDsl.g:60:9: 'adaptCssClass'
            {
            match("adaptCssClass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:61:7: ( 'Entity' )
            // InternalAdaptDsl.g:61:9: 'Entity'
            {
            match("Entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:62:7: ( 'provider' )
            // InternalAdaptDsl.g:62:9: 'provider'
            {
            match("provider"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:63:7: ( 'update' )
            // InternalAdaptDsl.g:63:9: 'update'
            {
            match("update"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:64:7: ( ':' )
            // InternalAdaptDsl.g:64:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:65:7: ( 'string' )
            // InternalAdaptDsl.g:65:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:66:7: ( 'number' )
            // InternalAdaptDsl.g:66:9: 'number'
            {
            match("number"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:67:7: ( 'bool' )
            // InternalAdaptDsl.g:67:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:68:7: ( 'eventTriggered' )
            // InternalAdaptDsl.g:68:9: 'eventTriggered'
            {
            match("eventTriggered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:69:7: ( 'slow' )
            // InternalAdaptDsl.g:69:9: 'slow'
            {
            match("slow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:70:7: ( 'fast' )
            // InternalAdaptDsl.g:70:9: 'fast'
            {
            match("fast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:4192:11: ( ( 'true' | 'false' ) )
            // InternalAdaptDsl.g:4192:13: ( 'true' | 'false' )
            {
            // InternalAdaptDsl.g:4192:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAdaptDsl.g:4192:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:4192:21: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:4194:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalAdaptDsl.g:4194:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalAdaptDsl.g:4194:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAdaptDsl.g:4194:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalAdaptDsl.g:4194:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAdaptDsl.g:
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
            	    break loop3;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:4196:10: ( ( '0' .. '9' )+ )
            // InternalAdaptDsl.g:4196:12: ( '0' .. '9' )+
            {
            // InternalAdaptDsl.g:4196:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAdaptDsl.g:4196:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:4198:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalAdaptDsl.g:4198:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalAdaptDsl.g:4198:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAdaptDsl.g:4198:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalAdaptDsl.g:4198:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalAdaptDsl.g:4198:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAdaptDsl.g:4198:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:4198:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalAdaptDsl.g:4198:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAdaptDsl.g:4198:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalAdaptDsl.g:4198:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:4200:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalAdaptDsl.g:4200:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalAdaptDsl.g:4200:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAdaptDsl.g:4200:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:4202:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalAdaptDsl.g:4202:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalAdaptDsl.g:4202:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAdaptDsl.g:4202:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalAdaptDsl.g:4202:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAdaptDsl.g:4202:41: ( '\\r' )? '\\n'
                    {
                    // InternalAdaptDsl.g:4202:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAdaptDsl.g:4202:41: '\\r'
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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:4204:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalAdaptDsl.g:4204:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalAdaptDsl.g:4204:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAdaptDsl.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalAdaptDsl.g:4206:16: ( . )
            // InternalAdaptDsl.g:4206:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalAdaptDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=68;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalAdaptDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalAdaptDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalAdaptDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalAdaptDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalAdaptDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalAdaptDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalAdaptDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalAdaptDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalAdaptDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalAdaptDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalAdaptDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalAdaptDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalAdaptDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalAdaptDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalAdaptDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalAdaptDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalAdaptDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalAdaptDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalAdaptDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalAdaptDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalAdaptDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalAdaptDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalAdaptDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalAdaptDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalAdaptDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalAdaptDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalAdaptDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalAdaptDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalAdaptDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalAdaptDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalAdaptDsl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalAdaptDsl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalAdaptDsl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalAdaptDsl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalAdaptDsl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalAdaptDsl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalAdaptDsl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalAdaptDsl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalAdaptDsl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalAdaptDsl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalAdaptDsl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalAdaptDsl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalAdaptDsl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalAdaptDsl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalAdaptDsl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalAdaptDsl.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalAdaptDsl.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalAdaptDsl.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalAdaptDsl.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalAdaptDsl.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalAdaptDsl.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalAdaptDsl.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalAdaptDsl.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalAdaptDsl.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalAdaptDsl.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalAdaptDsl.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalAdaptDsl.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalAdaptDsl.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalAdaptDsl.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalAdaptDsl.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalAdaptDsl.g:1:370: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 62 :
                // InternalAdaptDsl.g:1:380: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 63 :
                // InternalAdaptDsl.g:1:388: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 64 :
                // InternalAdaptDsl.g:1:397: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 65 :
                // InternalAdaptDsl.g:1:409: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 66 :
                // InternalAdaptDsl.g:1:425: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 67 :
                // InternalAdaptDsl.g:1:441: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 68 :
                // InternalAdaptDsl.g:1:449: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\55\1\uffff\1\60\1\55\1\uffff\11\55\1\105\1\uffff\2\53\1\111\1\113\1\115\1\117\2\53\1\uffff\6\55\1\uffff\3\55\1\53\2\uffff\3\53\2\uffff\1\55\4\uffff\1\55\1\uffff\12\55\1\162\5\55\1\171\14\uffff\1\173\2\uffff\10\55\1\uffff\3\55\5\uffff\16\55\1\uffff\6\55\3\uffff\16\55\1\u00aa\1\55\1\u00ac\1\u00ad\1\55\1\u00af\4\55\1\u00b4\3\55\1\u00b8\2\55\1\u00bb\11\55\1\u00c5\1\u00c6\3\55\1\uffff\1\55\2\uffff\1\55\1\uffff\1\u00c6\3\55\1\uffff\3\55\1\uffff\1\55\1\u00d3\1\uffff\11\55\2\uffff\2\55\1\uffff\4\55\1\u00e3\4\55\1\uffff\5\55\1\u00f0\1\55\1\u00f2\1\u00f3\4\55\1\u00f8\1\55\1\uffff\14\55\1\uffff\1\55\2\uffff\3\55\1\u010b\1\uffff\5\55\1\u0111\7\55\1\u0119\1\55\1\uffff\2\55\1\uffff\5\55\1\uffff\7\55\1\uffff\5\55\1\u012e\6\55\1\u0136\7\55\1\uffff\7\55\1\uffff\4\55\1\u0149\13\55\1\uffff\1\55\1\uffff\2\55\1\u0158\3\55\1\u015c\7\55\1\uffff\1\55\1\u0165\1\55\1\uffff\1\55\1\u0168\1\55\1\u016a\3\55\1\u016e\1\uffff\1\55\1\u0170\1\uffff\1\55\2\uffff\1\55\1\u0174\1\uffff\1\55\1\uffff\3\55\1\uffff\1\55\1\u017a\1\u017b\2\55\2\uffff\1\55\1\u0180\2\55\1\uffff\2\55\1\u0185\1\55\1\uffff\2\55\1\u0189\1\uffff";
    static final String DFA13_eofS =
        "\u018a\uffff";
    static final String DFA13_minS =
        "\1\0\1\157\1\uffff\1\73\1\145\1\uffff\1\110\1\144\1\141\1\145\1\144\1\145\1\105\1\101\1\106\1\51\1\uffff\1\174\1\46\1\60\1\147\4\75\1\uffff\1\144\1\145\1\150\1\156\1\162\1\160\1\uffff\1\165\1\157\1\162\1\101\2\uffff\2\0\1\52\2\uffff\1\156\4\uffff\1\162\1\uffff\1\160\1\105\1\141\2\157\1\156\1\154\2\162\1\157\1\60\1\141\1\154\1\144\1\126\1\103\1\60\14\uffff\1\75\2\uffff\1\151\1\145\1\154\1\145\1\141\1\164\1\157\1\144\1\uffff\1\155\1\157\1\165\5\uffff\1\164\1\166\1\145\1\116\1\160\1\167\1\155\1\143\1\164\1\163\1\166\1\104\1\151\1\167\1\uffff\1\116\1\160\1\145\1\151\1\105\1\124\3\uffff\1\164\1\156\1\145\1\141\1\156\1\151\1\166\1\141\1\142\1\154\2\145\1\151\1\163\1\60\1\164\2\60\1\164\1\60\1\145\2\151\1\156\1\60\1\151\1\141\1\164\1\60\1\162\1\114\1\60\1\106\2\164\1\162\1\147\1\164\1\151\1\164\1\145\2\60\1\170\1\143\1\173\1\uffff\1\141\2\uffff\1\151\1\uffff\1\60\1\143\1\163\1\147\1\uffff\1\145\1\166\1\103\1\uffff\1\145\1\60\1\uffff\1\141\1\124\1\145\1\116\1\145\1\171\1\144\1\145\1\162\2\uffff\1\164\1\145\1\uffff\1\164\1\157\1\145\1\160\1\60\1\167\1\114\1\163\1\143\1\uffff\1\143\1\162\1\116\1\141\1\103\1\60\1\145\2\60\1\115\1\163\1\151\1\156\1\60\1\154\1\uffff\1\103\1\151\1\163\2\164\2\151\1\141\1\166\2\157\1\141\1\uffff\1\162\2\uffff\1\157\1\173\1\157\1\60\1\uffff\1\141\1\157\1\156\1\103\1\116\1\60\1\147\1\145\1\166\1\151\1\156\1\154\1\142\1\60\1\144\1\uffff\1\156\1\141\1\uffff\1\171\1\155\1\153\1\154\1\141\1\uffff\1\147\1\167\1\114\1\147\1\164\1\157\1\154\1\uffff\1\145\1\115\1\154\1\120\1\160\1\60\1\141\1\166\1\145\1\103\1\151\1\141\1\60\1\162\1\145\1\154\1\157\1\154\1\162\1\157\1\uffff\1\163\1\114\1\162\1\157\1\156\1\164\1\151\1\uffff\1\123\1\103\1\173\1\144\1\60\1\157\1\156\1\163\1\151\1\145\1\155\1\153\1\151\1\172\1\143\1\163\1\uffff\1\145\1\uffff\1\160\1\145\1\60\1\156\1\144\1\160\1\60\1\157\1\145\1\150\1\163\1\154\1\145\1\156\1\uffff\1\153\1\60\1\157\1\uffff\1\156\1\60\1\145\1\60\1\173\1\162\1\164\1\60\1\uffff\1\156\1\60\1\uffff\1\155\2\uffff\1\164\1\60\1\uffff\1\145\1\uffff\1\145\1\171\1\165\1\uffff\1\156\2\60\2\164\2\uffff\1\164\1\60\1\157\1\165\1\uffff\1\156\1\164\1\60\1\164\1\uffff\1\157\1\156\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\157\1\uffff\1\73\1\145\1\uffff\1\171\1\144\1\165\1\164\1\163\1\165\1\105\1\101\1\106\1\51\1\uffff\1\174\1\46\1\172\1\147\4\75\1\uffff\1\166\1\145\1\154\1\156\1\162\1\160\1\uffff\1\165\1\157\1\162\1\172\2\uffff\2\uffff\1\57\2\uffff\1\156\4\uffff\1\162\1\uffff\1\160\1\105\1\141\2\157\1\156\1\163\1\164\1\162\1\157\1\172\1\144\1\154\1\144\1\126\1\103\1\172\14\uffff\1\75\2\uffff\1\151\1\145\1\154\1\145\1\141\1\164\1\157\1\144\1\uffff\1\155\1\157\1\165\5\uffff\1\164\1\166\1\145\1\116\1\160\1\167\1\155\1\143\1\164\1\163\1\166\1\104\1\151\1\167\1\uffff\1\126\1\160\1\145\1\151\1\105\1\124\3\uffff\1\164\1\156\1\145\1\141\1\156\1\151\1\166\1\141\1\142\1\154\2\145\1\151\1\163\1\172\1\164\2\172\1\164\1\172\1\145\2\151\1\156\1\172\1\151\1\141\1\164\1\172\1\162\1\114\1\172\1\106\2\164\1\162\1\147\1\164\1\151\1\164\1\145\2\172\1\170\1\143\1\173\1\uffff\1\141\2\uffff\1\151\1\uffff\1\172\1\143\1\163\1\147\1\uffff\1\145\1\166\1\103\1\uffff\1\145\1\172\1\uffff\1\141\1\124\1\145\1\116\1\145\1\171\1\144\1\145\1\162\2\uffff\1\164\1\145\1\uffff\1\164\1\157\1\145\1\160\1\172\1\167\1\114\1\163\1\143\1\uffff\1\143\1\162\1\126\1\141\1\124\1\172\1\145\2\172\1\115\1\163\1\151\1\156\1\172\1\154\1\uffff\1\103\1\151\1\163\2\164\2\151\1\141\1\166\2\157\1\141\1\uffff\1\162\2\uffff\1\157\1\173\1\157\1\172\1\uffff\1\141\1\157\1\156\1\103\1\116\1\172\1\147\1\145\1\166\1\151\1\156\1\154\1\142\1\172\1\144\1\uffff\1\156\1\141\1\uffff\1\171\1\155\1\153\1\154\1\141\1\uffff\1\147\1\167\1\114\1\147\1\164\1\157\1\154\1\uffff\1\145\1\115\1\154\1\120\1\160\1\172\1\141\1\166\1\145\1\103\1\151\1\141\1\172\1\162\1\145\1\154\1\157\1\154\1\162\1\157\1\uffff\1\163\1\114\1\162\1\157\1\156\1\164\1\151\1\uffff\1\123\1\103\1\173\1\144\1\172\1\157\1\156\1\163\1\151\1\145\1\155\1\153\1\151\1\172\1\143\1\163\1\uffff\1\145\1\uffff\1\160\1\145\1\172\1\156\1\144\1\160\1\172\1\157\1\145\1\150\1\163\1\154\1\145\1\156\1\uffff\1\153\1\172\1\157\1\uffff\1\156\1\172\1\145\1\172\1\173\1\162\1\164\1\172\1\uffff\1\156\1\172\1\uffff\1\155\2\uffff\1\164\1\172\1\uffff\1\145\1\uffff\1\145\1\171\1\165\1\uffff\1\156\2\172\2\164\2\uffff\1\164\1\172\1\157\1\165\1\uffff\1\156\1\164\1\172\1\164\1\uffff\1\157\1\156\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\2\uffff\1\5\12\uffff\1\22\10\uffff\1\43\6\uffff\1\66\4\uffff\1\76\1\77\3\uffff\1\103\1\104\1\uffff\1\76\1\2\1\3\1\24\1\uffff\1\5\21\uffff\1\31\1\21\1\22\1\25\1\26\1\27\1\30\1\32\1\37\1\33\1\40\1\34\1\uffff\1\36\1\43\10\uffff\1\66\3\uffff\1\77\1\100\1\101\1\102\1\103\16\uffff\1\13\6\uffff\1\20\1\41\1\35\56\uffff\1\23\1\uffff\1\10\1\12\1\uffff\1\74\4\uffff\1\73\3\uffff\1\15\2\uffff\1\17\11\uffff\1\71\1\75\2\uffff\1\6\11\uffff\1\16\17\uffff\1\67\14\uffff\1\63\1\uffff\1\65\1\70\4\uffff\1\11\17\uffff\1\4\2\uffff\1\14\5\uffff\1\44\7\uffff\1\64\24\uffff\1\52\7\uffff\1\60\20\uffff\1\1\1\uffff\1\42\16\uffff\1\62\3\uffff\1\53\10\uffff\1\72\2\uffff\1\56\1\uffff\1\61\1\7\2\uffff\1\54\1\uffff\1\55\3\uffff\1\46\5\uffff\1\57\1\45\4\uffff\1\47\4\uffff\1\50\3\uffff\1\51";
    static final String DFA13_specialS =
        "\1\2\46\uffff\1\0\1\1\u0161\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\30\1\47\3\53\1\22\1\50\1\17\1\20\2\53\1\31\1\53\1\24\1\51\12\46\1\40\1\5\1\26\1\27\1\25\2\53\1\7\1\45\1\1\1\45\1\35\1\15\2\45\1\16\2\45\1\14\6\45\1\4\1\6\6\45\3\53\1\44\1\45\1\53\1\12\1\42\1\34\1\33\1\32\1\10\6\45\1\23\1\41\1\45\1\36\1\45\1\13\1\11\1\43\1\37\5\45\1\2\1\21\1\3\uff82\53",
            "\1\54",
            "",
            "\1\57",
            "\1\61",
            "",
            "\1\64\60\uffff\1\63",
            "\1\65",
            "\1\71\12\uffff\1\66\5\uffff\1\67\2\uffff\1\70",
            "\1\72\6\uffff\1\74\7\uffff\1\73",
            "\1\76\16\uffff\1\75",
            "\1\100\17\uffff\1\77",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "\1\107",
            "\1\110",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\112",
            "\1\114",
            "\1\116",
            "\1\120",
            "\1\121",
            "",
            "\1\123\21\uffff\1\124",
            "\1\125",
            "\1\127\3\uffff\1\126",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "\0\140",
            "\0\140",
            "\1\141\4\uffff\1\142",
            "",
            "",
            "\1\144",
            "",
            "",
            "",
            "",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\155\6\uffff\1\154",
            "\1\156\1\uffff\1\157",
            "\1\160",
            "\1\161",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\164\2\uffff\1\163",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\172",
            "",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0096\7\uffff\1\u0095",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ab",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ae",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b9",
            "\1\u00ba",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "",
            "",
            "\1\u00cb",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00eb\7\uffff\1\u00ea",
            "\1\u00ec",
            "\1\u00ee\2\uffff\1\u00ed\15\uffff\1\u00ef",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f1",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\12\55\7\uffff\2\55\1\u010a\27\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\55\7\uffff\22\55\1\u0135\7\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "",
            "\1\u0164",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0166",
            "",
            "\1\u0167",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0169",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u016f",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0171",
            "",
            "",
            "\1\u0172",
            "\12\55\7\uffff\1\55\1\u0173\30\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u0175",
            "",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "",
            "\1\u0179",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u017c",
            "\1\u017d",
            "",
            "",
            "\1\u017e",
            "\12\55\7\uffff\1\55\1\u017f\30\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0181",
            "\1\u0182",
            "",
            "\1\u0183",
            "\1\u0184",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0186",
            "",
            "\1\u0187",
            "\1\u0188",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_BOOL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 96;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_40 = input.LA(1);

                        s = -1;
                        if ( ((LA13_40>='\u0000' && LA13_40<='\uFFFF')) ) {s = 96;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='C') ) {s = 1;}

                        else if ( (LA13_0=='{') ) {s = 2;}

                        else if ( (LA13_0=='}') ) {s = 3;}

                        else if ( (LA13_0=='S') ) {s = 4;}

                        else if ( (LA13_0==';') ) {s = 5;}

                        else if ( (LA13_0=='T') ) {s = 6;}

                        else if ( (LA13_0=='A') ) {s = 7;}

                        else if ( (LA13_0=='f') ) {s = 8;}

                        else if ( (LA13_0=='s') ) {s = 9;}

                        else if ( (LA13_0=='a') ) {s = 10;}

                        else if ( (LA13_0=='r') ) {s = 11;}

                        else if ( (LA13_0=='L') ) {s = 12;}

                        else if ( (LA13_0=='F') ) {s = 13;}

                        else if ( (LA13_0=='I') ) {s = 14;}

                        else if ( (LA13_0=='(') ) {s = 15;}

                        else if ( (LA13_0==')') ) {s = 16;}

                        else if ( (LA13_0=='|') ) {s = 17;}

                        else if ( (LA13_0=='&') ) {s = 18;}

                        else if ( (LA13_0=='m') ) {s = 19;}

                        else if ( (LA13_0=='.') ) {s = 20;}

                        else if ( (LA13_0=='>') ) {s = 21;}

                        else if ( (LA13_0=='<') ) {s = 22;}

                        else if ( (LA13_0=='=') ) {s = 23;}

                        else if ( (LA13_0=='!') ) {s = 24;}

                        else if ( (LA13_0==',') ) {s = 25;}

                        else if ( (LA13_0=='e') ) {s = 26;}

                        else if ( (LA13_0=='d') ) {s = 27;}

                        else if ( (LA13_0=='c') ) {s = 28;}

                        else if ( (LA13_0=='E') ) {s = 29;}

                        else if ( (LA13_0=='p') ) {s = 30;}

                        else if ( (LA13_0=='u') ) {s = 31;}

                        else if ( (LA13_0==':') ) {s = 32;}

                        else if ( (LA13_0=='n') ) {s = 33;}

                        else if ( (LA13_0=='b') ) {s = 34;}

                        else if ( (LA13_0=='t') ) {s = 35;}

                        else if ( (LA13_0=='^') ) {s = 36;}

                        else if ( (LA13_0=='B'||LA13_0=='D'||(LA13_0>='G' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='K')||(LA13_0>='M' && LA13_0<='R')||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='g' && LA13_0<='l')||LA13_0=='o'||LA13_0=='q'||(LA13_0>='v' && LA13_0<='z')) ) {s = 37;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 38;}

                        else if ( (LA13_0=='\"') ) {s = 39;}

                        else if ( (LA13_0=='\'') ) {s = 40;}

                        else if ( (LA13_0=='/') ) {s = 41;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 42;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='%')||(LA13_0>='*' && LA13_0<='+')||LA13_0=='-'||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}