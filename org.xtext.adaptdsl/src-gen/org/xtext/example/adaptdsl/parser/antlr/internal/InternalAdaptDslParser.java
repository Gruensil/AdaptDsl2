package org.xtext.example.adaptdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.adaptdsl.services.AdaptDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAdaptDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'flow'", "'{'", "'};'", "'service'", "'from'", "'as'", "'function'", "';'", "'rule'", "'LEVEL'", "'FACT'", "'IF'", "'('", "')'", "'THEN'", "'}'", "'||'", "'&&'", "'()'", "'.'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='", "'==='", "'functionCall'", "','", "'editFact'", "'setDisplayProperty'", "'addViewComponent'", "'deleteViewComponent'", "'addNavLink'", "'deleteNavLink'", "'redirectNavLink'", "'clearNavigation'", "'changeFontSize'", "'changeColorScheme'", "'changeFont'", "'changeTableCss'", "'adaptCssClass'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
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


        public InternalAdaptDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAdaptDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAdaptDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAdaptDsl.g"; }



     	private AdaptDslGrammarAccess grammarAccess;

        public InternalAdaptDslParser(TokenStream input, AdaptDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AdaptDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAdaptDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAdaptDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAdaptDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalAdaptDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_flowName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_services_0_0 = null;

        EObject lv_adaptationRules_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:77:2: ( ( ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};' ) )
            // InternalAdaptDsl.g:78:2: ( ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};' )
            {
            // InternalAdaptDsl.g:78:2: ( ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};' )
            // InternalAdaptDsl.g:79:3: ( (lv_services_0_0= ruleServices ) )? otherlv_1= 'flow' ( (lv_flowName_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+ otherlv_5= '};'
            {
            // InternalAdaptDsl.g:79:3: ( (lv_services_0_0= ruleServices ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAdaptDsl.g:80:4: (lv_services_0_0= ruleServices )
                    {
                    // InternalAdaptDsl.g:80:4: (lv_services_0_0= ruleServices )
                    // InternalAdaptDsl.g:81:5: lv_services_0_0= ruleServices
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getServicesServicesParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_services_0_0=ruleServices();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"services",
                    						lv_services_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Services");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getFlowKeyword_1());
            		
            // InternalAdaptDsl.g:102:3: ( (lv_flowName_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:103:4: (lv_flowName_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:103:4: (lv_flowName_2_0= RULE_STRING )
            // InternalAdaptDsl.g:104:5: lv_flowName_2_0= RULE_STRING
            {
            lv_flowName_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_flowName_2_0, grammarAccess.getModelAccess().getFlowNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"flowName",
            						lv_flowName_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAdaptDsl.g:124:3: ( (lv_adaptationRules_4_0= ruleAdaptationRule ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAdaptDsl.g:125:4: (lv_adaptationRules_4_0= ruleAdaptationRule )
            	    {
            	    // InternalAdaptDsl.g:125:4: (lv_adaptationRules_4_0= ruleAdaptationRule )
            	    // InternalAdaptDsl.g:126:5: lv_adaptationRules_4_0= ruleAdaptationRule
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getAdaptationRulesAdaptationRuleParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_adaptationRules_4_0=ruleAdaptationRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"adaptationRules",
            	    						lv_adaptationRules_4_0,
            	    						"org.xtext.example.adaptdsl.AdaptDsl.AdaptationRule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleServices"
    // InternalAdaptDsl.g:151:1: entryRuleServices returns [EObject current=null] : iv_ruleServices= ruleServices EOF ;
    public final EObject entryRuleServices() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServices = null;


        try {
            // InternalAdaptDsl.g:151:49: (iv_ruleServices= ruleServices EOF )
            // InternalAdaptDsl.g:152:2: iv_ruleServices= ruleServices EOF
            {
             newCompositeNode(grammarAccess.getServicesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServices=ruleServices();

            state._fsp--;

             current =iv_ruleServices; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServices"


    // $ANTLR start "ruleServices"
    // InternalAdaptDsl.g:158:1: ruleServices returns [EObject current=null] : ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? ) ;
    public final EObject ruleServices() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:164:2: ( ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? ) )
            // InternalAdaptDsl.g:165:2: ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? )
            {
            // InternalAdaptDsl.g:165:2: ( ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )? )
            // InternalAdaptDsl.g:166:3: ( (lv_this_0_0= ruleService ) ) ( (lv_next_1_0= ruleServices ) )?
            {
            // InternalAdaptDsl.g:166:3: ( (lv_this_0_0= ruleService ) )
            // InternalAdaptDsl.g:167:4: (lv_this_0_0= ruleService )
            {
            // InternalAdaptDsl.g:167:4: (lv_this_0_0= ruleService )
            // InternalAdaptDsl.g:168:5: lv_this_0_0= ruleService
            {

            					newCompositeNode(grammarAccess.getServicesAccess().getThisServiceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_this_0_0=ruleService();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServicesRule());
            					}
            					set(
            						current,
            						"this",
            						lv_this_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Service");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:185:3: ( (lv_next_1_0= ruleServices ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAdaptDsl.g:186:4: (lv_next_1_0= ruleServices )
                    {
                    // InternalAdaptDsl.g:186:4: (lv_next_1_0= ruleServices )
                    // InternalAdaptDsl.g:187:5: lv_next_1_0= ruleServices
                    {

                    					newCompositeNode(grammarAccess.getServicesAccess().getNextServicesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_1_0=ruleServices();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServicesRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Services");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleServices"


    // $ANTLR start "entryRuleService"
    // InternalAdaptDsl.g:208:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalAdaptDsl.g:208:48: (iv_ruleService= ruleService EOF )
            // InternalAdaptDsl.g:209:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalAdaptDsl.g:215:1: ruleService returns [EObject current=null] : (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_loc_3_0=null;
        Token otherlv_4=null;
        Token lv_id_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_functions_7_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:221:2: ( (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' ) )
            // InternalAdaptDsl.g:222:2: (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' )
            {
            // InternalAdaptDsl.g:222:2: (otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};' )
            // InternalAdaptDsl.g:223:3: otherlv_0= 'service' ( (lv_type_1_0= RULE_ID ) ) otherlv_2= 'from' ( (lv_loc_3_0= RULE_STRING ) ) otherlv_4= 'as' ( (lv_id_5_0= RULE_STRING ) ) otherlv_6= '{' ( (lv_functions_7_0= ruleFunctions ) ) otherlv_8= '};'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
            		
            // InternalAdaptDsl.g:227:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalAdaptDsl.g:228:4: (lv_type_1_0= RULE_ID )
            {
            // InternalAdaptDsl.g:228:4: (lv_type_1_0= RULE_ID )
            // InternalAdaptDsl.g:229:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_type_1_0, grammarAccess.getServiceAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getFromKeyword_2());
            		
            // InternalAdaptDsl.g:249:3: ( (lv_loc_3_0= RULE_STRING ) )
            // InternalAdaptDsl.g:250:4: (lv_loc_3_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:250:4: (lv_loc_3_0= RULE_STRING )
            // InternalAdaptDsl.g:251:5: lv_loc_3_0= RULE_STRING
            {
            lv_loc_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_loc_3_0, grammarAccess.getServiceAccess().getLocSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"loc",
            						lv_loc_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getAsKeyword_4());
            		
            // InternalAdaptDsl.g:271:3: ( (lv_id_5_0= RULE_STRING ) )
            // InternalAdaptDsl.g:272:4: (lv_id_5_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:272:4: (lv_id_5_0= RULE_STRING )
            // InternalAdaptDsl.g:273:5: lv_id_5_0= RULE_STRING
            {
            lv_id_5_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_id_5_0, grammarAccess.getServiceAccess().getIdSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalAdaptDsl.g:293:3: ( (lv_functions_7_0= ruleFunctions ) )
            // InternalAdaptDsl.g:294:4: (lv_functions_7_0= ruleFunctions )
            {
            // InternalAdaptDsl.g:294:4: (lv_functions_7_0= ruleFunctions )
            // InternalAdaptDsl.g:295:5: lv_functions_7_0= ruleFunctions
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getFunctionsFunctionsParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_13);
            lv_functions_7_0=ruleFunctions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"functions",
            						lv_functions_7_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Functions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getRightCurlyBracketSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleFunctions"
    // InternalAdaptDsl.g:320:1: entryRuleFunctions returns [EObject current=null] : iv_ruleFunctions= ruleFunctions EOF ;
    public final EObject entryRuleFunctions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctions = null;


        try {
            // InternalAdaptDsl.g:320:50: (iv_ruleFunctions= ruleFunctions EOF )
            // InternalAdaptDsl.g:321:2: iv_ruleFunctions= ruleFunctions EOF
            {
             newCompositeNode(grammarAccess.getFunctionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctions=ruleFunctions();

            state._fsp--;

             current =iv_ruleFunctions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctions"


    // $ANTLR start "ruleFunctions"
    // InternalAdaptDsl.g:327:1: ruleFunctions returns [EObject current=null] : ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? ) ;
    public final EObject ruleFunctions() throws RecognitionException {
        EObject current = null;

        EObject lv_this_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:333:2: ( ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? ) )
            // InternalAdaptDsl.g:334:2: ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? )
            {
            // InternalAdaptDsl.g:334:2: ( ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )? )
            // InternalAdaptDsl.g:335:3: ( (lv_this_0_0= ruleFunction ) ) ( (lv_next_1_0= ruleFunctions ) )?
            {
            // InternalAdaptDsl.g:335:3: ( (lv_this_0_0= ruleFunction ) )
            // InternalAdaptDsl.g:336:4: (lv_this_0_0= ruleFunction )
            {
            // InternalAdaptDsl.g:336:4: (lv_this_0_0= ruleFunction )
            // InternalAdaptDsl.g:337:5: lv_this_0_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getFunctionsAccess().getThisFunctionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_this_0_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionsRule());
            					}
            					set(
            						current,
            						"this",
            						lv_this_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:354:3: ( (lv_next_1_0= ruleFunctions ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAdaptDsl.g:355:4: (lv_next_1_0= ruleFunctions )
                    {
                    // InternalAdaptDsl.g:355:4: (lv_next_1_0= ruleFunctions )
                    // InternalAdaptDsl.g:356:5: lv_next_1_0= ruleFunctions
                    {

                    					newCompositeNode(grammarAccess.getFunctionsAccess().getNextFunctionsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_1_0=ruleFunctions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionsRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Functions");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleFunctions"


    // $ANTLR start "entryRuleFunction"
    // InternalAdaptDsl.g:377:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalAdaptDsl.g:377:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalAdaptDsl.g:378:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalAdaptDsl.g:384:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_id_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:390:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // InternalAdaptDsl.g:391:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:391:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // InternalAdaptDsl.g:392:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_id_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalAdaptDsl.g:396:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAdaptDsl.g:397:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAdaptDsl.g:397:4: (lv_name_1_0= RULE_ID )
            // InternalAdaptDsl.g:398:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getAsKeyword_2());
            		
            // InternalAdaptDsl.g:418:3: ( (lv_id_3_0= RULE_STRING ) )
            // InternalAdaptDsl.g:419:4: (lv_id_3_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:419:4: (lv_id_3_0= RULE_STRING )
            // InternalAdaptDsl.g:420:5: lv_id_3_0= RULE_STRING
            {
            lv_id_3_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_id_3_0, grammarAccess.getFunctionAccess().getIdSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleAdaptationRule"
    // InternalAdaptDsl.g:444:1: entryRuleAdaptationRule returns [EObject current=null] : iv_ruleAdaptationRule= ruleAdaptationRule EOF ;
    public final EObject entryRuleAdaptationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptationRule = null;


        try {
            // InternalAdaptDsl.g:444:55: (iv_ruleAdaptationRule= ruleAdaptationRule EOF )
            // InternalAdaptDsl.g:445:2: iv_ruleAdaptationRule= ruleAdaptationRule EOF
            {
             newCompositeNode(grammarAccess.getAdaptationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdaptationRule=ruleAdaptationRule();

            state._fsp--;

             current =iv_ruleAdaptationRule; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdaptationRule"


    // $ANTLR start "ruleAdaptationRule"
    // InternalAdaptDsl.g:451:1: ruleAdaptationRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' ) ;
    public final EObject ruleAdaptationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_level_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_factType_7_0=null;
        Token lv_factName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_expr_12_0 = null;

        EObject lv_actionCollection_16_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:457:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' ) )
            // InternalAdaptDsl.g:458:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' )
            {
            // InternalAdaptDsl.g:458:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}' )
            // InternalAdaptDsl.g:459:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' otherlv_3= 'LEVEL' ( (lv_level_4_0= RULE_INT ) ) otherlv_5= ';' otherlv_6= 'FACT' ( (lv_factType_7_0= RULE_ID ) ) ( (lv_factName_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'IF' otherlv_11= '(' ( (lv_expr_12_0= ruleConditionalOR ) ) otherlv_13= ')' otherlv_14= 'THEN' otherlv_15= '(' ( (lv_actionCollection_16_0= ruleActions ) ) otherlv_17= ')' otherlv_18= ';' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptationRuleAccess().getRuleKeyword_0());
            		
            // InternalAdaptDsl.g:463:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAdaptDsl.g:464:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:464:4: (lv_name_1_0= RULE_STRING )
            // InternalAdaptDsl.g:465:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAdaptationRuleAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAdaptationRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getAdaptationRuleAccess().getLEVELKeyword_3());
            		
            // InternalAdaptDsl.g:489:3: ( (lv_level_4_0= RULE_INT ) )
            // InternalAdaptDsl.g:490:4: (lv_level_4_0= RULE_INT )
            {
            // InternalAdaptDsl.g:490:4: (lv_level_4_0= RULE_INT )
            // InternalAdaptDsl.g:491:5: lv_level_4_0= RULE_INT
            {
            lv_level_4_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_level_4_0, grammarAccess.getAdaptationRuleAccess().getLevelINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"level",
            						lv_level_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getAdaptationRuleAccess().getFACTKeyword_6());
            		
            // InternalAdaptDsl.g:515:3: ( (lv_factType_7_0= RULE_ID ) )
            // InternalAdaptDsl.g:516:4: (lv_factType_7_0= RULE_ID )
            {
            // InternalAdaptDsl.g:516:4: (lv_factType_7_0= RULE_ID )
            // InternalAdaptDsl.g:517:5: lv_factType_7_0= RULE_ID
            {
            lv_factType_7_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_factType_7_0, grammarAccess.getAdaptationRuleAccess().getFactTypeIDTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"factType",
            						lv_factType_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAdaptDsl.g:533:3: ( (lv_factName_8_0= RULE_ID ) )
            // InternalAdaptDsl.g:534:4: (lv_factName_8_0= RULE_ID )
            {
            // InternalAdaptDsl.g:534:4: (lv_factName_8_0= RULE_ID )
            // InternalAdaptDsl.g:535:5: lv_factName_8_0= RULE_ID
            {
            lv_factName_8_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_factName_8_0, grammarAccess.getAdaptationRuleAccess().getFactNameIDTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"factName",
            						lv_factName_8_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getAdaptationRuleAccess().getIFKeyword_10());
            		
            otherlv_11=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_11());
            		
            // InternalAdaptDsl.g:563:3: ( (lv_expr_12_0= ruleConditionalOR ) )
            // InternalAdaptDsl.g:564:4: (lv_expr_12_0= ruleConditionalOR )
            {
            // InternalAdaptDsl.g:564:4: (lv_expr_12_0= ruleConditionalOR )
            // InternalAdaptDsl.g:565:5: lv_expr_12_0= ruleConditionalOR
            {

            					newCompositeNode(grammarAccess.getAdaptationRuleAccess().getExprConditionalORParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_21);
            lv_expr_12_0=ruleConditionalOR();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptationRuleRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_12_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ConditionalOR");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_13());
            		
            otherlv_14=(Token)match(input,26,FOLLOW_20); 

            			newLeafNode(otherlv_14, grammarAccess.getAdaptationRuleAccess().getTHENKeyword_14());
            		
            otherlv_15=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_15, grammarAccess.getAdaptationRuleAccess().getLeftParenthesisKeyword_15());
            		
            // InternalAdaptDsl.g:594:3: ( (lv_actionCollection_16_0= ruleActions ) )
            // InternalAdaptDsl.g:595:4: (lv_actionCollection_16_0= ruleActions )
            {
            // InternalAdaptDsl.g:595:4: (lv_actionCollection_16_0= ruleActions )
            // InternalAdaptDsl.g:596:5: lv_actionCollection_16_0= ruleActions
            {

            					newCompositeNode(grammarAccess.getAdaptationRuleAccess().getActionCollectionActionsParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_21);
            lv_actionCollection_16_0=ruleActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptationRuleRule());
            					}
            					set(
            						current,
            						"actionCollection",
            						lv_actionCollection_16_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Actions");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getAdaptationRuleAccess().getRightParenthesisKeyword_17());
            		
            otherlv_18=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_18, grammarAccess.getAdaptationRuleAccess().getSemicolonKeyword_18());
            		
            otherlv_19=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAdaptationRuleAccess().getRightCurlyBracketKeyword_19());
            		

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
    // $ANTLR end "ruleAdaptationRule"


    // $ANTLR start "entryRuleConditionalOR"
    // InternalAdaptDsl.g:629:1: entryRuleConditionalOR returns [EObject current=null] : iv_ruleConditionalOR= ruleConditionalOR EOF ;
    public final EObject entryRuleConditionalOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalOR = null;


        try {
            // InternalAdaptDsl.g:629:54: (iv_ruleConditionalOR= ruleConditionalOR EOF )
            // InternalAdaptDsl.g:630:2: iv_ruleConditionalOR= ruleConditionalOR EOF
            {
             newCompositeNode(grammarAccess.getConditionalORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalOR=ruleConditionalOR();

            state._fsp--;

             current =iv_ruleConditionalOR; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalOR"


    // $ANTLR start "ruleConditionalOR"
    // InternalAdaptDsl.g:636:1: ruleConditionalOR returns [EObject current=null] : ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? ) ;
    public final EObject ruleConditionalOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:642:2: ( ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? ) )
            // InternalAdaptDsl.g:643:2: ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? )
            {
            // InternalAdaptDsl.g:643:2: ( ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )? )
            // InternalAdaptDsl.g:644:3: ( (lv_left_0_0= ruleConditionalAND ) ) (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )?
            {
            // InternalAdaptDsl.g:644:3: ( (lv_left_0_0= ruleConditionalAND ) )
            // InternalAdaptDsl.g:645:4: (lv_left_0_0= ruleConditionalAND )
            {
            // InternalAdaptDsl.g:645:4: (lv_left_0_0= ruleConditionalAND )
            // InternalAdaptDsl.g:646:5: lv_left_0_0= ruleConditionalAND
            {

            					newCompositeNode(grammarAccess.getConditionalORAccess().getLeftConditionalANDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_left_0_0=ruleConditionalAND();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalORRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ConditionalAND");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:663:3: (otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAdaptDsl.g:664:4: otherlv_1= '||' ( (lv_right_2_0= ruleConditionalOR ) )
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionalORAccess().getVerticalLineVerticalLineKeyword_1_0());
                    			
                    // InternalAdaptDsl.g:668:4: ( (lv_right_2_0= ruleConditionalOR ) )
                    // InternalAdaptDsl.g:669:5: (lv_right_2_0= ruleConditionalOR )
                    {
                    // InternalAdaptDsl.g:669:5: (lv_right_2_0= ruleConditionalOR )
                    // InternalAdaptDsl.g:670:6: lv_right_2_0= ruleConditionalOR
                    {

                    						newCompositeNode(grammarAccess.getConditionalORAccess().getRightConditionalORParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleConditionalOR();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalORRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.ConditionalOR");
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
    // $ANTLR end "ruleConditionalOR"


    // $ANTLR start "entryRuleConditionalAND"
    // InternalAdaptDsl.g:692:1: entryRuleConditionalAND returns [EObject current=null] : iv_ruleConditionalAND= ruleConditionalAND EOF ;
    public final EObject entryRuleConditionalAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAND = null;


        try {
            // InternalAdaptDsl.g:692:55: (iv_ruleConditionalAND= ruleConditionalAND EOF )
            // InternalAdaptDsl.g:693:2: iv_ruleConditionalAND= ruleConditionalAND EOF
            {
             newCompositeNode(grammarAccess.getConditionalANDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalAND=ruleConditionalAND();

            state._fsp--;

             current =iv_ruleConditionalAND; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalAND"


    // $ANTLR start "ruleConditionalAND"
    // InternalAdaptDsl.g:699:1: ruleConditionalAND returns [EObject current=null] : ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? ) ;
    public final EObject ruleConditionalAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:705:2: ( ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? ) )
            // InternalAdaptDsl.g:706:2: ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? )
            {
            // InternalAdaptDsl.g:706:2: ( ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )? )
            // InternalAdaptDsl.g:707:3: ( (lv_left_0_0= ruleConditionalPrimary ) ) (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )?
            {
            // InternalAdaptDsl.g:707:3: ( (lv_left_0_0= ruleConditionalPrimary ) )
            // InternalAdaptDsl.g:708:4: (lv_left_0_0= ruleConditionalPrimary )
            {
            // InternalAdaptDsl.g:708:4: (lv_left_0_0= ruleConditionalPrimary )
            // InternalAdaptDsl.g:709:5: lv_left_0_0= ruleConditionalPrimary
            {

            					newCompositeNode(grammarAccess.getConditionalANDAccess().getLeftConditionalPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_left_0_0=ruleConditionalPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalANDRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ConditionalPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:726:3: (otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAdaptDsl.g:727:4: otherlv_1= '&&' ( (lv_right_2_0= ruleConditionalAND ) )
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionalANDAccess().getAmpersandAmpersandKeyword_1_0());
                    			
                    // InternalAdaptDsl.g:731:4: ( (lv_right_2_0= ruleConditionalAND ) )
                    // InternalAdaptDsl.g:732:5: (lv_right_2_0= ruleConditionalAND )
                    {
                    // InternalAdaptDsl.g:732:5: (lv_right_2_0= ruleConditionalAND )
                    // InternalAdaptDsl.g:733:6: lv_right_2_0= ruleConditionalAND
                    {

                    						newCompositeNode(grammarAccess.getConditionalANDAccess().getRightConditionalANDParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleConditionalAND();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionalANDRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.ConditionalAND");
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
    // $ANTLR end "ruleConditionalAND"


    // $ANTLR start "entryRuleConditionalPrimary"
    // InternalAdaptDsl.g:755:1: entryRuleConditionalPrimary returns [EObject current=null] : iv_ruleConditionalPrimary= ruleConditionalPrimary EOF ;
    public final EObject entryRuleConditionalPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalPrimary = null;


        try {
            // InternalAdaptDsl.g:755:59: (iv_ruleConditionalPrimary= ruleConditionalPrimary EOF )
            // InternalAdaptDsl.g:756:2: iv_ruleConditionalPrimary= ruleConditionalPrimary EOF
            {
             newCompositeNode(grammarAccess.getConditionalPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalPrimary=ruleConditionalPrimary();

            state._fsp--;

             current =iv_ruleConditionalPrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionalPrimary"


    // $ANTLR start "ruleConditionalPrimary"
    // InternalAdaptDsl.g:762:1: ruleConditionalPrimary returns [EObject current=null] : ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) ) ;
    public final EObject ruleConditionalPrimary() throws RecognitionException {
        EObject current = null;

        EObject lv_cond_0_0 = null;

        EObject lv_cond_1_0 = null;

        EObject lv_cond_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:768:2: ( ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) ) )
            // InternalAdaptDsl.g:769:2: ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) )
            {
            // InternalAdaptDsl.g:769:2: ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalAdaptDsl.g:770:3: ( (lv_cond_0_0= ruleStringCondition ) )
                    {
                    // InternalAdaptDsl.g:770:3: ( (lv_cond_0_0= ruleStringCondition ) )
                    // InternalAdaptDsl.g:771:4: (lv_cond_0_0= ruleStringCondition )
                    {
                    // InternalAdaptDsl.g:771:4: (lv_cond_0_0= ruleStringCondition )
                    // InternalAdaptDsl.g:772:5: lv_cond_0_0= ruleStringCondition
                    {

                    					newCompositeNode(grammarAccess.getConditionalPrimaryAccess().getCondStringConditionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cond_0_0=ruleStringCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.StringCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:790:3: ( (lv_cond_1_0= ruleNumberCondition ) )
                    {
                    // InternalAdaptDsl.g:790:3: ( (lv_cond_1_0= ruleNumberCondition ) )
                    // InternalAdaptDsl.g:791:4: (lv_cond_1_0= ruleNumberCondition )
                    {
                    // InternalAdaptDsl.g:791:4: (lv_cond_1_0= ruleNumberCondition )
                    // InternalAdaptDsl.g:792:5: lv_cond_1_0= ruleNumberCondition
                    {

                    					newCompositeNode(grammarAccess.getConditionalPrimaryAccess().getCondNumberConditionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cond_1_0=ruleNumberCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.NumberCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:810:3: ( (lv_cond_2_0= ruleBooleanCondition ) )
                    {
                    // InternalAdaptDsl.g:810:3: ( (lv_cond_2_0= ruleBooleanCondition ) )
                    // InternalAdaptDsl.g:811:4: (lv_cond_2_0= ruleBooleanCondition )
                    {
                    // InternalAdaptDsl.g:811:4: (lv_cond_2_0= ruleBooleanCondition )
                    // InternalAdaptDsl.g:812:5: lv_cond_2_0= ruleBooleanCondition
                    {

                    					newCompositeNode(grammarAccess.getConditionalPrimaryAccess().getCondBooleanConditionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cond_2_0=ruleBooleanCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalPrimaryRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.BooleanCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleConditionalPrimary"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalAdaptDsl.g:833:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // InternalAdaptDsl.g:833:57: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // InternalAdaptDsl.g:834:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
            {
             newCompositeNode(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanCondition=ruleBooleanCondition();

            state._fsp--;

             current =iv_ruleBooleanCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // InternalAdaptDsl.g:840:1: ruleBooleanCondition returns [EObject current=null] : ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        AntlrDatatypeRuleToken lv_fact_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_fact_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:846:2: ( ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) ) )
            // InternalAdaptDsl.g:847:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) )
            {
            // InternalAdaptDsl.g:847:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalAdaptDsl.g:848:3: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) )
                    {
                    // InternalAdaptDsl.g:848:3: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) )
                    // InternalAdaptDsl.g:849:4: ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) )
                    {
                    // InternalAdaptDsl.g:849:4: ( (lv_fact_0_0= ruleFact ) )
                    // InternalAdaptDsl.g:850:5: (lv_fact_0_0= ruleFact )
                    {
                    // InternalAdaptDsl.g:850:5: (lv_fact_0_0= ruleFact )
                    // InternalAdaptDsl.g:851:6: lv_fact_0_0= ruleFact
                    {

                    						newCompositeNode(grammarAccess.getBooleanConditionAccess().getFactFactParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_fact_0_0=ruleFact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
                    						}
                    						set(
                    							current,
                    							"fact",
                    							lv_fact_0_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.Fact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAdaptDsl.g:868:4: ( (lv_op_1_0= ruleBoolOperators ) )
                    // InternalAdaptDsl.g:869:5: (lv_op_1_0= ruleBoolOperators )
                    {
                    // InternalAdaptDsl.g:869:5: (lv_op_1_0= ruleBoolOperators )
                    // InternalAdaptDsl.g:870:6: lv_op_1_0= ruleBoolOperators
                    {

                    						newCompositeNode(grammarAccess.getBooleanConditionAccess().getOpBoolOperatorsParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_op_1_0=ruleBoolOperators();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_1_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.BoolOperators");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAdaptDsl.g:887:4: ( (lv_val_2_0= RULE_BOOL ) )
                    // InternalAdaptDsl.g:888:5: (lv_val_2_0= RULE_BOOL )
                    {
                    // InternalAdaptDsl.g:888:5: (lv_val_2_0= RULE_BOOL )
                    // InternalAdaptDsl.g:889:6: lv_val_2_0= RULE_BOOL
                    {
                    lv_val_2_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    						newLeafNode(lv_val_2_0, grammarAccess.getBooleanConditionAccess().getValBOOLTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanConditionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_2_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.BOOL");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:907:3: ( (lv_fact_3_0= ruleFact ) )
                    {
                    // InternalAdaptDsl.g:907:3: ( (lv_fact_3_0= ruleFact ) )
                    // InternalAdaptDsl.g:908:4: (lv_fact_3_0= ruleFact )
                    {
                    // InternalAdaptDsl.g:908:4: (lv_fact_3_0= ruleFact )
                    // InternalAdaptDsl.g:909:5: lv_fact_3_0= ruleFact
                    {

                    					newCompositeNode(grammarAccess.getBooleanConditionAccess().getFactFactParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_fact_3_0=ruleFact();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBooleanConditionRule());
                    					}
                    					set(
                    						current,
                    						"fact",
                    						lv_fact_3_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Fact");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleNumberCondition"
    // InternalAdaptDsl.g:930:1: entryRuleNumberCondition returns [EObject current=null] : iv_ruleNumberCondition= ruleNumberCondition EOF ;
    public final EObject entryRuleNumberCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberCondition = null;


        try {
            // InternalAdaptDsl.g:930:56: (iv_ruleNumberCondition= ruleNumberCondition EOF )
            // InternalAdaptDsl.g:931:2: iv_ruleNumberCondition= ruleNumberCondition EOF
            {
             newCompositeNode(grammarAccess.getNumberConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberCondition=ruleNumberCondition();

            state._fsp--;

             current =iv_ruleNumberCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberCondition"


    // $ANTLR start "ruleNumberCondition"
    // InternalAdaptDsl.g:937:1: ruleNumberCondition returns [EObject current=null] : ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) ) ;
    public final EObject ruleNumberCondition() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        AntlrDatatypeRuleToken lv_fact_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:943:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) ) )
            // InternalAdaptDsl.g:944:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) )
            {
            // InternalAdaptDsl.g:944:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) ) )
            // InternalAdaptDsl.g:945:3: ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleNumberOperators ) ) ( (lv_val_2_0= RULE_INT ) )
            {
            // InternalAdaptDsl.g:945:3: ( (lv_fact_0_0= ruleFact ) )
            // InternalAdaptDsl.g:946:4: (lv_fact_0_0= ruleFact )
            {
            // InternalAdaptDsl.g:946:4: (lv_fact_0_0= ruleFact )
            // InternalAdaptDsl.g:947:5: lv_fact_0_0= ruleFact
            {

            					newCompositeNode(grammarAccess.getNumberConditionAccess().getFactFactParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_fact_0_0=ruleFact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberConditionRule());
            					}
            					set(
            						current,
            						"fact",
            						lv_fact_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Fact");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:964:3: ( (lv_op_1_0= ruleNumberOperators ) )
            // InternalAdaptDsl.g:965:4: (lv_op_1_0= ruleNumberOperators )
            {
            // InternalAdaptDsl.g:965:4: (lv_op_1_0= ruleNumberOperators )
            // InternalAdaptDsl.g:966:5: lv_op_1_0= ruleNumberOperators
            {

            					newCompositeNode(grammarAccess.getNumberConditionAccess().getOpNumberOperatorsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_op_1_0=ruleNumberOperators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNumberConditionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.NumberOperators");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:983:3: ( (lv_val_2_0= RULE_INT ) )
            // InternalAdaptDsl.g:984:4: (lv_val_2_0= RULE_INT )
            {
            // InternalAdaptDsl.g:984:4: (lv_val_2_0= RULE_INT )
            // InternalAdaptDsl.g:985:5: lv_val_2_0= RULE_INT
            {
            lv_val_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_val_2_0, grammarAccess.getNumberConditionAccess().getValINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNumberCondition"


    // $ANTLR start "entryRuleStringCondition"
    // InternalAdaptDsl.g:1005:1: entryRuleStringCondition returns [EObject current=null] : iv_ruleStringCondition= ruleStringCondition EOF ;
    public final EObject entryRuleStringCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringCondition = null;


        try {
            // InternalAdaptDsl.g:1005:56: (iv_ruleStringCondition= ruleStringCondition EOF )
            // InternalAdaptDsl.g:1006:2: iv_ruleStringCondition= ruleStringCondition EOF
            {
             newCompositeNode(grammarAccess.getStringConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringCondition=ruleStringCondition();

            state._fsp--;

             current =iv_ruleStringCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringCondition"


    // $ANTLR start "ruleStringCondition"
    // InternalAdaptDsl.g:1012:1: ruleStringCondition returns [EObject current=null] : ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringCondition() throws RecognitionException {
        EObject current = null;

        Token lv_val_2_0=null;
        AntlrDatatypeRuleToken lv_fact_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1018:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) ) )
            // InternalAdaptDsl.g:1019:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) )
            {
            // InternalAdaptDsl.g:1019:2: ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:1020:3: ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleStringOperators ) ) ( (lv_val_2_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:1020:3: ( (lv_fact_0_0= ruleFact ) )
            // InternalAdaptDsl.g:1021:4: (lv_fact_0_0= ruleFact )
            {
            // InternalAdaptDsl.g:1021:4: (lv_fact_0_0= ruleFact )
            // InternalAdaptDsl.g:1022:5: lv_fact_0_0= ruleFact
            {

            					newCompositeNode(grammarAccess.getStringConditionAccess().getFactFactParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_fact_0_0=ruleFact();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringConditionRule());
            					}
            					set(
            						current,
            						"fact",
            						lv_fact_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Fact");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1039:3: ( (lv_op_1_0= ruleStringOperators ) )
            // InternalAdaptDsl.g:1040:4: (lv_op_1_0= ruleStringOperators )
            {
            // InternalAdaptDsl.g:1040:4: (lv_op_1_0= ruleStringOperators )
            // InternalAdaptDsl.g:1041:5: lv_op_1_0= ruleStringOperators
            {

            					newCompositeNode(grammarAccess.getStringConditionAccess().getOpStringOperatorsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_op_1_0=ruleStringOperators();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringConditionRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.StringOperators");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1058:3: ( (lv_val_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:1059:4: (lv_val_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:1059:4: (lv_val_2_0= RULE_STRING )
            // InternalAdaptDsl.g:1060:5: lv_val_2_0= RULE_STRING
            {
            lv_val_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_2_0, grammarAccess.getStringConditionAccess().getValSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStringCondition"


    // $ANTLR start "entryRuleFact"
    // InternalAdaptDsl.g:1080:1: entryRuleFact returns [String current=null] : iv_ruleFact= ruleFact EOF ;
    public final String entryRuleFact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFact = null;


        try {
            // InternalAdaptDsl.g:1080:44: (iv_ruleFact= ruleFact EOF )
            // InternalAdaptDsl.g:1081:2: iv_ruleFact= ruleFact EOF
            {
             newCompositeNode(grammarAccess.getFactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFact=ruleFact();

            state._fsp--;

             current =iv_ruleFact.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFact"


    // $ANTLR start "ruleFact"
    // InternalAdaptDsl.g:1087:1: ruleFact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* ) ;
    public final AntlrDatatypeRuleToken ruleFact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1093:2: ( (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* ) )
            // InternalAdaptDsl.g:1094:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* )
            {
            // InternalAdaptDsl.g:1094:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* )
            // InternalAdaptDsl.g:1095:3: this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFactAccess().getIDTerminalRuleCall_0());
            		
            // InternalAdaptDsl.g:1102:3: (kw= '()' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAdaptDsl.g:1103:4: kw= '()'
                    {
                    kw=(Token)match(input,30,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_1());
                    			

                    }
                    break;

            }

            // InternalAdaptDsl.g:1109:3: (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAdaptDsl.g:1110:4: kw= '.' this_ID_3= RULE_ID (kw= '()' )?
            	    {
            	    kw=(Token)match(input,31,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFactAccess().getFullStopKeyword_2_0());
            	    			
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    				current.merge(this_ID_3);
            	    			

            	    				newLeafNode(this_ID_3, grammarAccess.getFactAccess().getIDTerminalRuleCall_2_1());
            	    			
            	    // InternalAdaptDsl.g:1122:4: (kw= '()' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==30) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAdaptDsl.g:1123:5: kw= '()'
            	            {
            	            kw=(Token)match(input,30,FOLLOW_32); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getFactAccess().getLeftParenthesisRightParenthesisKeyword_2_2());
            	            				

            	            }
            	            break;

            	    }


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
    // $ANTLR end "ruleFact"


    // $ANTLR start "entryRuleFactProperty"
    // InternalAdaptDsl.g:1134:1: entryRuleFactProperty returns [String current=null] : iv_ruleFactProperty= ruleFactProperty EOF ;
    public final String entryRuleFactProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFactProperty = null;


        try {
            // InternalAdaptDsl.g:1134:52: (iv_ruleFactProperty= ruleFactProperty EOF )
            // InternalAdaptDsl.g:1135:2: iv_ruleFactProperty= ruleFactProperty EOF
            {
             newCompositeNode(grammarAccess.getFactPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactProperty=ruleFactProperty();

            state._fsp--;

             current =iv_ruleFactProperty.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFactProperty"


    // $ANTLR start "ruleFactProperty"
    // InternalAdaptDsl.g:1141:1: ruleFactProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken ruleFactProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_3=null;
        Token this_ID_6=null;
        AntlrDatatypeRuleToken this_Value_8 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1147:2: ( (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? ) )
            // InternalAdaptDsl.g:1148:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? )
            {
            // InternalAdaptDsl.g:1148:2: (this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )? )
            // InternalAdaptDsl.g:1149:3: this_ID_0= RULE_ID (kw= '()' )? (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )* kw= '.' this_ID_6= RULE_ID (kw= '(' this_Value_8= ruleValue kw= ')' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_0());
            		
            // InternalAdaptDsl.g:1156:3: (kw= '()' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAdaptDsl.g:1157:4: kw= '()'
                    {
                    kw=(Token)match(input,30,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_1());
                    			

                    }
                    break;

            }

            // InternalAdaptDsl.g:1163:3: (kw= '.' this_ID_3= RULE_ID (kw= '()' )? )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==RULE_ID) ) {
                        int LA14_2 = input.LA(3);

                        if ( ((LA14_2>=30 && LA14_2<=31)) ) {
                            alt14=1;
                        }


                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalAdaptDsl.g:1164:4: kw= '.' this_ID_3= RULE_ID (kw= '()' )?
            	    {
            	    kw=(Token)match(input,31,FOLLOW_9); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getFullStopKeyword_2_0());
            	    			
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_33); 

            	    				current.merge(this_ID_3);
            	    			

            	    				newLeafNode(this_ID_3, grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_2_1());
            	    			
            	    // InternalAdaptDsl.g:1176:4: (kw= '()' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==30) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAdaptDsl.g:1177:5: kw= '()'
            	            {
            	            kw=(Token)match(input,30,FOLLOW_34); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getFactPropertyAccess().getLeftParenthesisRightParenthesisKeyword_2_2());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            kw=(Token)match(input,31,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFactPropertyAccess().getFullStopKeyword_3());
            		
            this_ID_6=(Token)match(input,RULE_ID,FOLLOW_35); 

            			current.merge(this_ID_6);
            		

            			newLeafNode(this_ID_6, grammarAccess.getFactPropertyAccess().getIDTerminalRuleCall_4());
            		
            // InternalAdaptDsl.g:1196:3: (kw= '(' this_Value_8= ruleValue kw= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAdaptDsl.g:1197:4: kw= '(' this_Value_8= ruleValue kw= ')'
                    {
                    kw=(Token)match(input,24,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getFactPropertyAccess().getValueParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_21);
                    this_Value_8=ruleValue();

                    state._fsp--;


                    				current.merge(this_Value_8);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,25,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFactPropertyAccess().getRightParenthesisKeyword_5_2());
                    			

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
    // $ANTLR end "ruleFactProperty"


    // $ANTLR start "entryRuleNumberOperators"
    // InternalAdaptDsl.g:1222:1: entryRuleNumberOperators returns [String current=null] : iv_ruleNumberOperators= ruleNumberOperators EOF ;
    public final String entryRuleNumberOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberOperators = null;


        try {
            // InternalAdaptDsl.g:1222:55: (iv_ruleNumberOperators= ruleNumberOperators EOF )
            // InternalAdaptDsl.g:1223:2: iv_ruleNumberOperators= ruleNumberOperators EOF
            {
             newCompositeNode(grammarAccess.getNumberOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberOperators=ruleNumberOperators();

            state._fsp--;

             current =iv_ruleNumberOperators.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNumberOperators"


    // $ANTLR start "ruleNumberOperators"
    // InternalAdaptDsl.g:1229:1: ruleNumberOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleNumberOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1235:2: ( (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' ) )
            // InternalAdaptDsl.g:1236:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' )
            {
            // InternalAdaptDsl.g:1236:2: (kw= '>' | kw= '<' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '===' )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            case 35:
                {
                alt16=4;
                }
                break;
            case 36:
                {
                alt16=5;
                }
                break;
            case 37:
                {
                alt16=6;
                }
                break;
            case 38:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalAdaptDsl.g:1237:3: kw= '>'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getGreaterThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1243:3: kw= '<'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getLessThanSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1249:3: kw= '=='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1255:3: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getExclamationMarkEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:1261:3: kw= '>='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getGreaterThanSignEqualsSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAdaptDsl.g:1267:3: kw= '<='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getLessThanSignEqualsSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAdaptDsl.g:1273:3: kw= '==='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNumberOperatorsAccess().getEqualsSignEqualsSignEqualsSignKeyword_6());
                    		

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
    // $ANTLR end "ruleNumberOperators"


    // $ANTLR start "entryRuleStringOperators"
    // InternalAdaptDsl.g:1282:1: entryRuleStringOperators returns [String current=null] : iv_ruleStringOperators= ruleStringOperators EOF ;
    public final String entryRuleStringOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStringOperators = null;


        try {
            // InternalAdaptDsl.g:1282:55: (iv_ruleStringOperators= ruleStringOperators EOF )
            // InternalAdaptDsl.g:1283:2: iv_ruleStringOperators= ruleStringOperators EOF
            {
             newCompositeNode(grammarAccess.getStringOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringOperators=ruleStringOperators();

            state._fsp--;

             current =iv_ruleStringOperators.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringOperators"


    // $ANTLR start "ruleStringOperators"
    // InternalAdaptDsl.g:1289:1: ruleStringOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '===' ) ;
    public final AntlrDatatypeRuleToken ruleStringOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1295:2: ( (kw= '==' | kw= '!=' | kw= '===' ) )
            // InternalAdaptDsl.g:1296:2: (kw= '==' | kw= '!=' | kw= '===' )
            {
            // InternalAdaptDsl.g:1296:2: (kw= '==' | kw= '!=' | kw= '===' )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case 38:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAdaptDsl.g:1297:3: kw= '=='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1303:3: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1309:3: kw= '==='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getStringOperatorsAccess().getEqualsSignEqualsSignEqualsSignKeyword_2());
                    		

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
    // $ANTLR end "ruleStringOperators"


    // $ANTLR start "entryRuleBoolOperators"
    // InternalAdaptDsl.g:1318:1: entryRuleBoolOperators returns [String current=null] : iv_ruleBoolOperators= ruleBoolOperators EOF ;
    public final String entryRuleBoolOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolOperators = null;


        try {
            // InternalAdaptDsl.g:1318:53: (iv_ruleBoolOperators= ruleBoolOperators EOF )
            // InternalAdaptDsl.g:1319:2: iv_ruleBoolOperators= ruleBoolOperators EOF
            {
             newCompositeNode(grammarAccess.getBoolOperatorsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolOperators=ruleBoolOperators();

            state._fsp--;

             current =iv_ruleBoolOperators.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolOperators"


    // $ANTLR start "ruleBoolOperators"
    // InternalAdaptDsl.g:1325:1: ruleBoolOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleBoolOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1331:2: ( (kw= '==' | kw= '!=' ) )
            // InternalAdaptDsl.g:1332:2: (kw= '==' | kw= '!=' )
            {
            // InternalAdaptDsl.g:1332:2: (kw= '==' | kw= '!=' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==35) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAdaptDsl.g:1333:3: kw= '=='
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1339:3: kw= '!='
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBoolOperatorsAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

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
    // $ANTLR end "ruleBoolOperators"


    // $ANTLR start "entryRuleActions"
    // InternalAdaptDsl.g:1348:1: entryRuleActions returns [EObject current=null] : iv_ruleActions= ruleActions EOF ;
    public final EObject entryRuleActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActions = null;


        try {
            // InternalAdaptDsl.g:1348:48: (iv_ruleActions= ruleActions EOF )
            // InternalAdaptDsl.g:1349:2: iv_ruleActions= ruleActions EOF
            {
             newCompositeNode(grammarAccess.getActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActions=ruleActions();

            state._fsp--;

             current =iv_ruleActions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActions"


    // $ANTLR start "ruleActions"
    // InternalAdaptDsl.g:1355:1: ruleActions returns [EObject current=null] : ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? ) ;
    public final EObject ruleActions() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        EObject lv_next_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1361:2: ( ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? ) )
            // InternalAdaptDsl.g:1362:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? )
            {
            // InternalAdaptDsl.g:1362:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )? )
            // InternalAdaptDsl.g:1363:3: ( (lv_action_0_0= ruleAction ) ) ( (lv_next_1_0= ruleActions ) )?
            {
            // InternalAdaptDsl.g:1363:3: ( (lv_action_0_0= ruleAction ) )
            // InternalAdaptDsl.g:1364:4: (lv_action_0_0= ruleAction )
            {
            // InternalAdaptDsl.g:1364:4: (lv_action_0_0= ruleAction )
            // InternalAdaptDsl.g:1365:5: lv_action_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getActionsAccess().getActionActionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_action_0_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionsRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1382:3: ( (lv_next_1_0= ruleActions ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39||(LA19_0>=41 && LA19_0<=53)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAdaptDsl.g:1383:4: (lv_next_1_0= ruleActions )
                    {
                    // InternalAdaptDsl.g:1383:4: (lv_next_1_0= ruleActions )
                    // InternalAdaptDsl.g:1384:5: lv_next_1_0= ruleActions
                    {

                    					newCompositeNode(grammarAccess.getActionsAccess().getNextActionsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_next_1_0=ruleActions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionsRule());
                    					}
                    					set(
                    						current,
                    						"next",
                    						lv_next_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.Actions");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "entryRuleAction"
    // InternalAdaptDsl.g:1405:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAdaptDsl.g:1405:47: (iv_ruleAction= ruleAction EOF )
            // InternalAdaptDsl.g:1406:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalAdaptDsl.g:1412:1: ruleAction returns [EObject current=null] : ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionCategory_0_0 = null;

        EObject lv_actionCategory_1_0 = null;

        EObject lv_actionCategory_2_0 = null;

        EObject lv_actionCategory_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1418:2: ( ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) ) )
            // InternalAdaptDsl.g:1419:2: ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) )
            {
            // InternalAdaptDsl.g:1419:2: ( ( (lv_actionCategory_0_0= ruleServiceOperation ) ) | ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) ) | ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) ) | ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 39:
            case 41:
            case 42:
                {
                alt20=1;
                }
                break;
            case 43:
            case 44:
                {
                alt20=2;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt20=3;
                }
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalAdaptDsl.g:1420:3: ( (lv_actionCategory_0_0= ruleServiceOperation ) )
                    {
                    // InternalAdaptDsl.g:1420:3: ( (lv_actionCategory_0_0= ruleServiceOperation ) )
                    // InternalAdaptDsl.g:1421:4: (lv_actionCategory_0_0= ruleServiceOperation )
                    {
                    // InternalAdaptDsl.g:1421:4: (lv_actionCategory_0_0= ruleServiceOperation )
                    // InternalAdaptDsl.g:1422:5: lv_actionCategory_0_0= ruleServiceOperation
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getActionCategoryServiceOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionCategory_0_0=ruleServiceOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"actionCategory",
                    						lv_actionCategory_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ServiceOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1440:3: ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1440:3: ( (lv_actionCategory_1_0= ruleTaskChangeOperation ) )
                    // InternalAdaptDsl.g:1441:4: (lv_actionCategory_1_0= ruleTaskChangeOperation )
                    {
                    // InternalAdaptDsl.g:1441:4: (lv_actionCategory_1_0= ruleTaskChangeOperation )
                    // InternalAdaptDsl.g:1442:5: lv_actionCategory_1_0= ruleTaskChangeOperation
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getActionCategoryTaskChangeOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionCategory_1_0=ruleTaskChangeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"actionCategory",
                    						lv_actionCategory_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.TaskChangeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1460:3: ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1460:3: ( (lv_actionCategory_2_0= ruleNavigationChangeOperation ) )
                    // InternalAdaptDsl.g:1461:4: (lv_actionCategory_2_0= ruleNavigationChangeOperation )
                    {
                    // InternalAdaptDsl.g:1461:4: (lv_actionCategory_2_0= ruleNavigationChangeOperation )
                    // InternalAdaptDsl.g:1462:5: lv_actionCategory_2_0= ruleNavigationChangeOperation
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getActionCategoryNavigationChangeOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionCategory_2_0=ruleNavigationChangeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"actionCategory",
                    						lv_actionCategory_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.NavigationChangeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:1480:3: ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) )
                    {
                    // InternalAdaptDsl.g:1480:3: ( (lv_actionCategory_3_0= ruleLayoutChangeOperation ) )
                    // InternalAdaptDsl.g:1481:4: (lv_actionCategory_3_0= ruleLayoutChangeOperation )
                    {
                    // InternalAdaptDsl.g:1481:4: (lv_actionCategory_3_0= ruleLayoutChangeOperation )
                    // InternalAdaptDsl.g:1482:5: lv_actionCategory_3_0= ruleLayoutChangeOperation
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getActionCategoryLayoutChangeOperationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionCategory_3_0=ruleLayoutChangeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"actionCategory",
                    						lv_actionCategory_3_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.LayoutChangeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleServiceOperation"
    // InternalAdaptDsl.g:1503:1: entryRuleServiceOperation returns [EObject current=null] : iv_ruleServiceOperation= ruleServiceOperation EOF ;
    public final EObject entryRuleServiceOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceOperation = null;


        try {
            // InternalAdaptDsl.g:1503:57: (iv_ruleServiceOperation= ruleServiceOperation EOF )
            // InternalAdaptDsl.g:1504:2: iv_ruleServiceOperation= ruleServiceOperation EOF
            {
             newCompositeNode(grammarAccess.getServiceOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceOperation=ruleServiceOperation();

            state._fsp--;

             current =iv_ruleServiceOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServiceOperation"


    // $ANTLR start "ruleServiceOperation"
    // InternalAdaptDsl.g:1510:1: ruleServiceOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) ) ;
    public final EObject ruleServiceOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1516:2: ( ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) ) )
            // InternalAdaptDsl.g:1517:2: ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) )
            {
            // InternalAdaptDsl.g:1517:2: ( ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) ) | ( (lv_operation_1_0= ruleEditFactOperation ) ) | ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 42:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAdaptDsl.g:1518:3: ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) )
                    {
                    // InternalAdaptDsl.g:1518:3: ( (lv_operation_0_0= ruleServiceFunctionCallOperation ) )
                    // InternalAdaptDsl.g:1519:4: (lv_operation_0_0= ruleServiceFunctionCallOperation )
                    {
                    // InternalAdaptDsl.g:1519:4: (lv_operation_0_0= ruleServiceFunctionCallOperation )
                    // InternalAdaptDsl.g:1520:5: lv_operation_0_0= ruleServiceFunctionCallOperation
                    {

                    					newCompositeNode(grammarAccess.getServiceOperationAccess().getOperationServiceFunctionCallOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_0_0=ruleServiceFunctionCallOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServiceOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ServiceFunctionCallOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1538:3: ( (lv_operation_1_0= ruleEditFactOperation ) )
                    {
                    // InternalAdaptDsl.g:1538:3: ( (lv_operation_1_0= ruleEditFactOperation ) )
                    // InternalAdaptDsl.g:1539:4: (lv_operation_1_0= ruleEditFactOperation )
                    {
                    // InternalAdaptDsl.g:1539:4: (lv_operation_1_0= ruleEditFactOperation )
                    // InternalAdaptDsl.g:1540:5: lv_operation_1_0= ruleEditFactOperation
                    {

                    					newCompositeNode(grammarAccess.getServiceOperationAccess().getOperationEditFactOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_1_0=ruleEditFactOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServiceOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.EditFactOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1558:3: ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) )
                    {
                    // InternalAdaptDsl.g:1558:3: ( (lv_operation_2_0= ruleSetDisplayPropertyOperation ) )
                    // InternalAdaptDsl.g:1559:4: (lv_operation_2_0= ruleSetDisplayPropertyOperation )
                    {
                    // InternalAdaptDsl.g:1559:4: (lv_operation_2_0= ruleSetDisplayPropertyOperation )
                    // InternalAdaptDsl.g:1560:5: lv_operation_2_0= ruleSetDisplayPropertyOperation
                    {

                    					newCompositeNode(grammarAccess.getServiceOperationAccess().getOperationSetDisplayPropertyOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_2_0=ruleSetDisplayPropertyOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getServiceOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.SetDisplayPropertyOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleServiceOperation"


    // $ANTLR start "entryRuleServiceFunctionCallOperation"
    // InternalAdaptDsl.g:1581:1: entryRuleServiceFunctionCallOperation returns [EObject current=null] : iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF ;
    public final EObject entryRuleServiceFunctionCallOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceFunctionCallOperation = null;


        try {
            // InternalAdaptDsl.g:1581:69: (iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF )
            // InternalAdaptDsl.g:1582:2: iv_ruleServiceFunctionCallOperation= ruleServiceFunctionCallOperation EOF
            {
             newCompositeNode(grammarAccess.getServiceFunctionCallOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceFunctionCallOperation=ruleServiceFunctionCallOperation();

            state._fsp--;

             current =iv_ruleServiceFunctionCallOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleServiceFunctionCallOperation"


    // $ANTLR start "ruleServiceFunctionCallOperation"
    // InternalAdaptDsl.g:1588:1: ruleServiceFunctionCallOperation returns [EObject current=null] : (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleServiceFunctionCallOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_service_2_0=null;
        Token otherlv_3=null;
        Token lv_function_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_val_6_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1594:2: ( (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:1595:2: (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:1595:2: (otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:1596:3: otherlv_0= 'functionCall' otherlv_1= '(' ( (lv_service_2_0= RULE_ID ) ) otherlv_3= ',' ( (lv_function_4_0= RULE_ID ) ) otherlv_5= ',' ( (lv_val_6_0= ruleValue ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceFunctionCallOperationAccess().getFunctionCallKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceFunctionCallOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1604:3: ( (lv_service_2_0= RULE_ID ) )
            // InternalAdaptDsl.g:1605:4: (lv_service_2_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1605:4: (lv_service_2_0= RULE_ID )
            // InternalAdaptDsl.g:1606:5: lv_service_2_0= RULE_ID
            {
            lv_service_2_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_service_2_0, grammarAccess.getServiceFunctionCallOperationAccess().getServiceIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceFunctionCallOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"service",
            						lv_service_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:1626:3: ( (lv_function_4_0= RULE_ID ) )
            // InternalAdaptDsl.g:1627:4: (lv_function_4_0= RULE_ID )
            {
            // InternalAdaptDsl.g:1627:4: (lv_function_4_0= RULE_ID )
            // InternalAdaptDsl.g:1628:5: lv_function_4_0= RULE_ID
            {
            lv_function_4_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_function_4_0, grammarAccess.getServiceFunctionCallOperationAccess().getFunctionIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceFunctionCallOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"function",
            						lv_function_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getServiceFunctionCallOperationAccess().getCommaKeyword_5());
            		
            // InternalAdaptDsl.g:1648:3: ( (lv_val_6_0= ruleValue ) )
            // InternalAdaptDsl.g:1649:4: (lv_val_6_0= ruleValue )
            {
            // InternalAdaptDsl.g:1649:4: (lv_val_6_0= ruleValue )
            // InternalAdaptDsl.g:1650:5: lv_val_6_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getServiceFunctionCallOperationAccess().getValValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_val_6_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceFunctionCallOperationRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_6_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceFunctionCallOperationAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceFunctionCallOperationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleServiceFunctionCallOperation"


    // $ANTLR start "entryRuleEditFactOperation"
    // InternalAdaptDsl.g:1679:1: entryRuleEditFactOperation returns [EObject current=null] : iv_ruleEditFactOperation= ruleEditFactOperation EOF ;
    public final EObject entryRuleEditFactOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditFactOperation = null;


        try {
            // InternalAdaptDsl.g:1679:58: (iv_ruleEditFactOperation= ruleEditFactOperation EOF )
            // InternalAdaptDsl.g:1680:2: iv_ruleEditFactOperation= ruleEditFactOperation EOF
            {
             newCompositeNode(grammarAccess.getEditFactOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEditFactOperation=ruleEditFactOperation();

            state._fsp--;

             current =iv_ruleEditFactOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEditFactOperation"


    // $ANTLR start "ruleEditFactOperation"
    // InternalAdaptDsl.g:1686:1: ruleEditFactOperation returns [EObject current=null] : (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleEditFactOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_prop_2_0 = null;

        AntlrDatatypeRuleToken lv_val_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1692:2: ( (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:1693:2: (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:1693:2: (otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:1694:3: otherlv_0= 'editFact' otherlv_1= '(' ( (lv_prop_2_0= ruleFactProperty ) ) (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )? otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEditFactOperationAccess().getEditFactKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEditFactOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1702:3: ( (lv_prop_2_0= ruleFactProperty ) )
            // InternalAdaptDsl.g:1703:4: (lv_prop_2_0= ruleFactProperty )
            {
            // InternalAdaptDsl.g:1703:4: (lv_prop_2_0= ruleFactProperty )
            // InternalAdaptDsl.g:1704:5: lv_prop_2_0= ruleFactProperty
            {

            					newCompositeNode(grammarAccess.getEditFactOperationAccess().getPropFactPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_prop_2_0=ruleFactProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEditFactOperationRule());
            					}
            					set(
            						current,
            						"prop",
            						lv_prop_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.FactProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAdaptDsl.g:1721:3: (otherlv_3= ',' ( (lv_val_4_0= ruleValue ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAdaptDsl.g:1722:4: otherlv_3= ',' ( (lv_val_4_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getEditFactOperationAccess().getCommaKeyword_3_0());
                    			
                    // InternalAdaptDsl.g:1726:4: ( (lv_val_4_0= ruleValue ) )
                    // InternalAdaptDsl.g:1727:5: (lv_val_4_0= ruleValue )
                    {
                    // InternalAdaptDsl.g:1727:5: (lv_val_4_0= ruleValue )
                    // InternalAdaptDsl.g:1728:6: lv_val_4_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getEditFactOperationAccess().getValValueParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_val_4_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEditFactOperationRule());
                    						}
                    						set(
                    							current,
                    							"val",
                    							lv_val_4_0,
                    							"org.xtext.example.adaptdsl.AdaptDsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getEditFactOperationAccess().getRightParenthesisKeyword_4());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEditFactOperationAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleEditFactOperation"


    // $ANTLR start "entryRuleSetDisplayPropertyOperation"
    // InternalAdaptDsl.g:1758:1: entryRuleSetDisplayPropertyOperation returns [EObject current=null] : iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF ;
    public final EObject entryRuleSetDisplayPropertyOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetDisplayPropertyOperation = null;


        try {
            // InternalAdaptDsl.g:1758:68: (iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF )
            // InternalAdaptDsl.g:1759:2: iv_ruleSetDisplayPropertyOperation= ruleSetDisplayPropertyOperation EOF
            {
             newCompositeNode(grammarAccess.getSetDisplayPropertyOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetDisplayPropertyOperation=ruleSetDisplayPropertyOperation();

            state._fsp--;

             current =iv_ruleSetDisplayPropertyOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSetDisplayPropertyOperation"


    // $ANTLR start "ruleSetDisplayPropertyOperation"
    // InternalAdaptDsl.g:1765:1: ruleSetDisplayPropertyOperation returns [EObject current=null] : (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleSetDisplayPropertyOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_property_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_propertyValue_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1771:2: ( (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:1772:2: (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:1772:2: (otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:1773:3: otherlv_0= 'setDisplayProperty' otherlv_1= '(' ( (lv_property_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getSetDisplayPropertyOperationAccess().getSetDisplayPropertyKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSetDisplayPropertyOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:1781:3: ( (lv_property_2_0= RULE_STRING ) )
            // InternalAdaptDsl.g:1782:4: (lv_property_2_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:1782:4: (lv_property_2_0= RULE_STRING )
            // InternalAdaptDsl.g:1783:5: lv_property_2_0= RULE_STRING
            {
            lv_property_2_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_property_2_0, grammarAccess.getSetDisplayPropertyOperationAccess().getPropertySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetDisplayPropertyOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getSetDisplayPropertyOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:1803:3: ( (lv_propertyValue_4_0= ruleDisplayPropertyValue ) )
            // InternalAdaptDsl.g:1804:4: (lv_propertyValue_4_0= ruleDisplayPropertyValue )
            {
            // InternalAdaptDsl.g:1804:4: (lv_propertyValue_4_0= ruleDisplayPropertyValue )
            // InternalAdaptDsl.g:1805:5: lv_propertyValue_4_0= ruleDisplayPropertyValue
            {

            					newCompositeNode(grammarAccess.getSetDisplayPropertyOperationAccess().getPropertyValueDisplayPropertyValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_propertyValue_4_0=ruleDisplayPropertyValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetDisplayPropertyOperationRule());
            					}
            					set(
            						current,
            						"propertyValue",
            						lv_propertyValue_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.DisplayPropertyValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getSetDisplayPropertyOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSetDisplayPropertyOperationAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleSetDisplayPropertyOperation"


    // $ANTLR start "entryRuleDisplayPropertyValue"
    // InternalAdaptDsl.g:1834:1: entryRuleDisplayPropertyValue returns [EObject current=null] : iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF ;
    public final EObject entryRuleDisplayPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplayPropertyValue = null;


        try {
            // InternalAdaptDsl.g:1834:61: (iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF )
            // InternalAdaptDsl.g:1835:2: iv_ruleDisplayPropertyValue= ruleDisplayPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getDisplayPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisplayPropertyValue=ruleDisplayPropertyValue();

            state._fsp--;

             current =iv_ruleDisplayPropertyValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDisplayPropertyValue"


    // $ANTLR start "ruleDisplayPropertyValue"
    // InternalAdaptDsl.g:1841:1: ruleDisplayPropertyValue returns [EObject current=null] : ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) ) ;
    public final EObject ruleDisplayPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_propertyClass_0_0 = null;

        EObject lv_propertyClass_1_0 = null;

        EObject lv_propertyClass_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:1847:2: ( ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) ) )
            // InternalAdaptDsl.g:1848:2: ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) )
            {
            // InternalAdaptDsl.g:1848:2: ( ( (lv_propertyClass_0_0= ruleIntValue ) ) | ( (lv_propertyClass_1_0= ruleStringValue ) ) | ( (lv_propertyClass_2_0= ruleBoolValue ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt23=1;
                }
                break;
            case RULE_STRING:
                {
                alt23=2;
                }
                break;
            case RULE_BOOL:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAdaptDsl.g:1849:3: ( (lv_propertyClass_0_0= ruleIntValue ) )
                    {
                    // InternalAdaptDsl.g:1849:3: ( (lv_propertyClass_0_0= ruleIntValue ) )
                    // InternalAdaptDsl.g:1850:4: (lv_propertyClass_0_0= ruleIntValue )
                    {
                    // InternalAdaptDsl.g:1850:4: (lv_propertyClass_0_0= ruleIntValue )
                    // InternalAdaptDsl.g:1851:5: lv_propertyClass_0_0= ruleIntValue
                    {

                    					newCompositeNode(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassIntValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyClass_0_0=ruleIntValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDisplayPropertyValueRule());
                    					}
                    					set(
                    						current,
                    						"propertyClass",
                    						lv_propertyClass_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.IntValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:1869:3: ( (lv_propertyClass_1_0= ruleStringValue ) )
                    {
                    // InternalAdaptDsl.g:1869:3: ( (lv_propertyClass_1_0= ruleStringValue ) )
                    // InternalAdaptDsl.g:1870:4: (lv_propertyClass_1_0= ruleStringValue )
                    {
                    // InternalAdaptDsl.g:1870:4: (lv_propertyClass_1_0= ruleStringValue )
                    // InternalAdaptDsl.g:1871:5: lv_propertyClass_1_0= ruleStringValue
                    {

                    					newCompositeNode(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassStringValueParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyClass_1_0=ruleStringValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDisplayPropertyValueRule());
                    					}
                    					set(
                    						current,
                    						"propertyClass",
                    						lv_propertyClass_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.StringValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:1889:3: ( (lv_propertyClass_2_0= ruleBoolValue ) )
                    {
                    // InternalAdaptDsl.g:1889:3: ( (lv_propertyClass_2_0= ruleBoolValue ) )
                    // InternalAdaptDsl.g:1890:4: (lv_propertyClass_2_0= ruleBoolValue )
                    {
                    // InternalAdaptDsl.g:1890:4: (lv_propertyClass_2_0= ruleBoolValue )
                    // InternalAdaptDsl.g:1891:5: lv_propertyClass_2_0= ruleBoolValue
                    {

                    					newCompositeNode(grammarAccess.getDisplayPropertyValueAccess().getPropertyClassBoolValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyClass_2_0=ruleBoolValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDisplayPropertyValueRule());
                    					}
                    					set(
                    						current,
                    						"propertyClass",
                    						lv_propertyClass_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.BoolValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleDisplayPropertyValue"


    // $ANTLR start "entryRuleIntValue"
    // InternalAdaptDsl.g:1912:1: entryRuleIntValue returns [EObject current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final EObject entryRuleIntValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntValue = null;


        try {
            // InternalAdaptDsl.g:1912:49: (iv_ruleIntValue= ruleIntValue EOF )
            // InternalAdaptDsl.g:1913:2: iv_ruleIntValue= ruleIntValue EOF
            {
             newCompositeNode(grammarAccess.getIntValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;

             current =iv_ruleIntValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // InternalAdaptDsl.g:1919:1: ruleIntValue returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1925:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAdaptDsl.g:1926:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAdaptDsl.g:1926:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalAdaptDsl.g:1927:3: (lv_value_0_0= RULE_INT )
            {
            // InternalAdaptDsl.g:1927:3: (lv_value_0_0= RULE_INT )
            // InternalAdaptDsl.g:1928:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalAdaptDsl.g:1947:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalAdaptDsl.g:1947:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalAdaptDsl.g:1948:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalAdaptDsl.g:1954:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1960:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAdaptDsl.g:1961:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAdaptDsl.g:1961:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAdaptDsl.g:1962:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalAdaptDsl.g:1962:3: (lv_value_0_0= RULE_STRING )
            // InternalAdaptDsl.g:1963:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleBoolValue"
    // InternalAdaptDsl.g:1982:1: entryRuleBoolValue returns [EObject current=null] : iv_ruleBoolValue= ruleBoolValue EOF ;
    public final EObject entryRuleBoolValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolValue = null;


        try {
            // InternalAdaptDsl.g:1982:50: (iv_ruleBoolValue= ruleBoolValue EOF )
            // InternalAdaptDsl.g:1983:2: iv_ruleBoolValue= ruleBoolValue EOF
            {
             newCompositeNode(grammarAccess.getBoolValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolValue=ruleBoolValue();

            state._fsp--;

             current =iv_ruleBoolValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoolValue"


    // $ANTLR start "ruleBoolValue"
    // InternalAdaptDsl.g:1989:1: ruleBoolValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleBoolValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:1995:2: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // InternalAdaptDsl.g:1996:2: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // InternalAdaptDsl.g:1996:2: ( (lv_value_0_0= RULE_BOOL ) )
            // InternalAdaptDsl.g:1997:3: (lv_value_0_0= RULE_BOOL )
            {
            // InternalAdaptDsl.g:1997:3: (lv_value_0_0= RULE_BOOL )
            // InternalAdaptDsl.g:1998:4: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getBoolValueAccess().getValueBOOLTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBoolValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.adaptdsl.AdaptDsl.BOOL");
            			

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
    // $ANTLR end "ruleBoolValue"


    // $ANTLR start "entryRuleTaskChangeOperation"
    // InternalAdaptDsl.g:2017:1: entryRuleTaskChangeOperation returns [EObject current=null] : iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF ;
    public final EObject entryRuleTaskChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2017:60: (iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF )
            // InternalAdaptDsl.g:2018:2: iv_ruleTaskChangeOperation= ruleTaskChangeOperation EOF
            {
             newCompositeNode(grammarAccess.getTaskChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskChangeOperation=ruleTaskChangeOperation();

            state._fsp--;

             current =iv_ruleTaskChangeOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTaskChangeOperation"


    // $ANTLR start "ruleTaskChangeOperation"
    // InternalAdaptDsl.g:2024:1: ruleTaskChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) ) ;
    public final EObject ruleTaskChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2030:2: ( ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) ) )
            // InternalAdaptDsl.g:2031:2: ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) )
            {
            // InternalAdaptDsl.g:2031:2: ( ( (lv_operation_0_0= ruleAddViewComponentOperation ) ) | ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            else if ( (LA24_0==44) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAdaptDsl.g:2032:3: ( (lv_operation_0_0= ruleAddViewComponentOperation ) )
                    {
                    // InternalAdaptDsl.g:2032:3: ( (lv_operation_0_0= ruleAddViewComponentOperation ) )
                    // InternalAdaptDsl.g:2033:4: (lv_operation_0_0= ruleAddViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:2033:4: (lv_operation_0_0= ruleAddViewComponentOperation )
                    // InternalAdaptDsl.g:2034:5: lv_operation_0_0= ruleAddViewComponentOperation
                    {

                    					newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getOperationAddViewComponentOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_0_0=ruleAddViewComponentOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.AddViewComponentOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:2052:3: ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) )
                    {
                    // InternalAdaptDsl.g:2052:3: ( (lv_operation_1_0= ruleDeleteViewComponentOperation ) )
                    // InternalAdaptDsl.g:2053:4: (lv_operation_1_0= ruleDeleteViewComponentOperation )
                    {
                    // InternalAdaptDsl.g:2053:4: (lv_operation_1_0= ruleDeleteViewComponentOperation )
                    // InternalAdaptDsl.g:2054:5: lv_operation_1_0= ruleDeleteViewComponentOperation
                    {

                    					newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getOperationDeleteViewComponentOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_1_0=ruleDeleteViewComponentOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.DeleteViewComponentOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleTaskChangeOperation"


    // $ANTLR start "entryRuleAddViewComponentOperation"
    // InternalAdaptDsl.g:2075:1: entryRuleAddViewComponentOperation returns [EObject current=null] : iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF ;
    public final EObject entryRuleAddViewComponentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:2075:66: (iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF )
            // InternalAdaptDsl.g:2076:2: iv_ruleAddViewComponentOperation= ruleAddViewComponentOperation EOF
            {
             newCompositeNode(grammarAccess.getAddViewComponentOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddViewComponentOperation=ruleAddViewComponentOperation();

            state._fsp--;

             current =iv_ruleAddViewComponentOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddViewComponentOperation"


    // $ANTLR start "ruleAddViewComponentOperation"
    // InternalAdaptDsl.g:2082:1: ruleAddViewComponentOperation returns [EObject current=null] : (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleAddViewComponentOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;

        AntlrDatatypeRuleToken lv_target_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2088:2: ( (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2089:2: (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2089:2: (otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2090:3: otherlv_0= 'addViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_target_4_0= ruleTargetContainer ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2098:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2099:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2099:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2100:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddViewComponentOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2121:3: ( (lv_target_4_0= ruleTargetContainer ) )
            // InternalAdaptDsl.g:2122:4: (lv_target_4_0= ruleTargetContainer )
            {
            // InternalAdaptDsl.g:2122:4: (lv_target_4_0= ruleTargetContainer )
            // InternalAdaptDsl.g:2123:5: lv_target_4_0= ruleTargetContainer
            {

            					newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getTargetTargetContainerParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_target_4_0=ruleTargetContainer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddViewComponentOperationRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.TargetContainer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleAddViewComponentOperation"


    // $ANTLR start "entryRuleDeleteViewComponentOperation"
    // InternalAdaptDsl.g:2152:1: entryRuleDeleteViewComponentOperation returns [EObject current=null] : iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF ;
    public final EObject entryRuleDeleteViewComponentOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteViewComponentOperation = null;


        try {
            // InternalAdaptDsl.g:2152:69: (iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF )
            // InternalAdaptDsl.g:2153:2: iv_ruleDeleteViewComponentOperation= ruleDeleteViewComponentOperation EOF
            {
             newCompositeNode(grammarAccess.getDeleteViewComponentOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteViewComponentOperation=ruleDeleteViewComponentOperation();

            state._fsp--;

             current =iv_ruleDeleteViewComponentOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeleteViewComponentOperation"


    // $ANTLR start "ruleDeleteViewComponentOperation"
    // InternalAdaptDsl.g:2159:1: ruleDeleteViewComponentOperation returns [EObject current=null] : (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteViewComponentOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2165:2: ( (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2166:2: (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2166:2: (otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2167:3: otherlv_0= 'deleteViewComponent' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2175:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2176:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2176:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2177:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getDeleteViewComponentOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteViewComponentOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDeleteViewComponentOperation"


    // $ANTLR start "entryRuleViewComponent"
    // InternalAdaptDsl.g:2206:1: entryRuleViewComponent returns [String current=null] : iv_ruleViewComponent= ruleViewComponent EOF ;
    public final String entryRuleViewComponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleViewComponent = null;


        try {
            // InternalAdaptDsl.g:2206:53: (iv_ruleViewComponent= ruleViewComponent EOF )
            // InternalAdaptDsl.g:2207:2: iv_ruleViewComponent= ruleViewComponent EOF
            {
             newCompositeNode(grammarAccess.getViewComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleViewComponent=ruleViewComponent();

            state._fsp--;

             current =iv_ruleViewComponent.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleViewComponent"


    // $ANTLR start "ruleViewComponent"
    // InternalAdaptDsl.g:2213:1: ruleViewComponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleViewComponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2219:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:2220:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getViewComponentAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleViewComponent"


    // $ANTLR start "entryRuleTargetContainer"
    // InternalAdaptDsl.g:2230:1: entryRuleTargetContainer returns [String current=null] : iv_ruleTargetContainer= ruleTargetContainer EOF ;
    public final String entryRuleTargetContainer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTargetContainer = null;


        try {
            // InternalAdaptDsl.g:2230:55: (iv_ruleTargetContainer= ruleTargetContainer EOF )
            // InternalAdaptDsl.g:2231:2: iv_ruleTargetContainer= ruleTargetContainer EOF
            {
             newCompositeNode(grammarAccess.getTargetContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTargetContainer=ruleTargetContainer();

            state._fsp--;

             current =iv_ruleTargetContainer.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTargetContainer"


    // $ANTLR start "ruleTargetContainer"
    // InternalAdaptDsl.g:2237:1: ruleTargetContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTargetContainer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2243:2: (this_ID_0= RULE_ID )
            // InternalAdaptDsl.g:2244:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getTargetContainerAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleTargetContainer"


    // $ANTLR start "entryRuleNavigationChangeOperation"
    // InternalAdaptDsl.g:2254:1: entryRuleNavigationChangeOperation returns [EObject current=null] : iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF ;
    public final EObject entryRuleNavigationChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigationChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2254:66: (iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF )
            // InternalAdaptDsl.g:2255:2: iv_ruleNavigationChangeOperation= ruleNavigationChangeOperation EOF
            {
             newCompositeNode(grammarAccess.getNavigationChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigationChangeOperation=ruleNavigationChangeOperation();

            state._fsp--;

             current =iv_ruleNavigationChangeOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNavigationChangeOperation"


    // $ANTLR start "ruleNavigationChangeOperation"
    // InternalAdaptDsl.g:2261:1: ruleNavigationChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) ) ;
    public final EObject ruleNavigationChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2267:2: ( ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) ) )
            // InternalAdaptDsl.g:2268:2: ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) )
            {
            // InternalAdaptDsl.g:2268:2: ( ( (lv_operation_0_0= ruleAddNavLinkOperation ) ) | ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) ) | ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) ) | ( (lv_operation_3_0= ruleClearNavOperation ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt25=1;
                }
                break;
            case 46:
                {
                alt25=2;
                }
                break;
            case 47:
                {
                alt25=3;
                }
                break;
            case 48:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAdaptDsl.g:2269:3: ( (lv_operation_0_0= ruleAddNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2269:3: ( (lv_operation_0_0= ruleAddNavLinkOperation ) )
                    // InternalAdaptDsl.g:2270:4: (lv_operation_0_0= ruleAddNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2270:4: (lv_operation_0_0= ruleAddNavLinkOperation )
                    // InternalAdaptDsl.g:2271:5: lv_operation_0_0= ruleAddNavLinkOperation
                    {

                    					newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getOperationAddNavLinkOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_0_0=ruleAddNavLinkOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNavigationChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.AddNavLinkOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:2289:3: ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2289:3: ( (lv_operation_1_0= ruleDeleteNavLinkOperation ) )
                    // InternalAdaptDsl.g:2290:4: (lv_operation_1_0= ruleDeleteNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2290:4: (lv_operation_1_0= ruleDeleteNavLinkOperation )
                    // InternalAdaptDsl.g:2291:5: lv_operation_1_0= ruleDeleteNavLinkOperation
                    {

                    					newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getOperationDeleteNavLinkOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_1_0=ruleDeleteNavLinkOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNavigationChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.DeleteNavLinkOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:2309:3: ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) )
                    {
                    // InternalAdaptDsl.g:2309:3: ( (lv_operation_2_0= ruleRedirectNavLinkOperation ) )
                    // InternalAdaptDsl.g:2310:4: (lv_operation_2_0= ruleRedirectNavLinkOperation )
                    {
                    // InternalAdaptDsl.g:2310:4: (lv_operation_2_0= ruleRedirectNavLinkOperation )
                    // InternalAdaptDsl.g:2311:5: lv_operation_2_0= ruleRedirectNavLinkOperation
                    {

                    					newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getOperationRedirectNavLinkOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_2_0=ruleRedirectNavLinkOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNavigationChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.RedirectNavLinkOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:2329:3: ( (lv_operation_3_0= ruleClearNavOperation ) )
                    {
                    // InternalAdaptDsl.g:2329:3: ( (lv_operation_3_0= ruleClearNavOperation ) )
                    // InternalAdaptDsl.g:2330:4: (lv_operation_3_0= ruleClearNavOperation )
                    {
                    // InternalAdaptDsl.g:2330:4: (lv_operation_3_0= ruleClearNavOperation )
                    // InternalAdaptDsl.g:2331:5: lv_operation_3_0= ruleClearNavOperation
                    {

                    					newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getOperationClearNavOperationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_3_0=ruleClearNavOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNavigationChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_3_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ClearNavOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleNavigationChangeOperation"


    // $ANTLR start "entryRuleAddNavLinkOperation"
    // InternalAdaptDsl.g:2352:1: entryRuleAddNavLinkOperation returns [EObject current=null] : iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF ;
    public final EObject entryRuleAddNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2352:60: (iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF )
            // InternalAdaptDsl.g:2353:2: iv_ruleAddNavLinkOperation= ruleAddNavLinkOperation EOF
            {
             newCompositeNode(grammarAccess.getAddNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddNavLinkOperation=ruleAddNavLinkOperation();

            state._fsp--;

             current =iv_ruleAddNavLinkOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddNavLinkOperation"


    // $ANTLR start "ruleAddNavLinkOperation"
    // InternalAdaptDsl.g:2359:1: ruleAddNavLinkOperation returns [EObject current=null] : (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleAddNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;

        AntlrDatatypeRuleToken lv_text_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2365:2: ( (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2366:2: (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2366:2: (otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2367:3: otherlv_0= 'addNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ',' ( (lv_text_4_0= ruleText ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2375:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2376:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2376:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2377:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddNavLinkOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2398:3: ( (lv_text_4_0= ruleText ) )
            // InternalAdaptDsl.g:2399:4: (lv_text_4_0= ruleText )
            {
            // InternalAdaptDsl.g:2399:4: (lv_text_4_0= ruleText )
            // InternalAdaptDsl.g:2400:5: lv_text_4_0= ruleText
            {

            					newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getTextTextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_text_4_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddNavLinkOperationRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleAddNavLinkOperation"


    // $ANTLR start "entryRuleDeleteNavLinkOperation"
    // InternalAdaptDsl.g:2429:1: entryRuleDeleteNavLinkOperation returns [EObject current=null] : iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF ;
    public final EObject entryRuleDeleteNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2429:63: (iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF )
            // InternalAdaptDsl.g:2430:2: iv_ruleDeleteNavLinkOperation= ruleDeleteNavLinkOperation EOF
            {
             newCompositeNode(grammarAccess.getDeleteNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteNavLinkOperation=ruleDeleteNavLinkOperation();

            state._fsp--;

             current =iv_ruleDeleteNavLinkOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeleteNavLinkOperation"


    // $ANTLR start "ruleDeleteNavLinkOperation"
    // InternalAdaptDsl.g:2436:1: ruleDeleteNavLinkOperation returns [EObject current=null] : (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleDeleteNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2442:2: ( (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2443:2: (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2443:2: (otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2444:3: otherlv_0= 'deleteNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2452:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2453:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2453:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2454:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getDeleteNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteNavLinkOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDeleteNavLinkOperation"


    // $ANTLR start "entryRuleRedirectNavLinkOperation"
    // InternalAdaptDsl.g:2483:1: entryRuleRedirectNavLinkOperation returns [EObject current=null] : iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF ;
    public final EObject entryRuleRedirectNavLinkOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirectNavLinkOperation = null;


        try {
            // InternalAdaptDsl.g:2483:65: (iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF )
            // InternalAdaptDsl.g:2484:2: iv_ruleRedirectNavLinkOperation= ruleRedirectNavLinkOperation EOF
            {
             newCompositeNode(grammarAccess.getRedirectNavLinkOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedirectNavLinkOperation=ruleRedirectNavLinkOperation();

            state._fsp--;

             current =iv_ruleRedirectNavLinkOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRedirectNavLinkOperation"


    // $ANTLR start "ruleRedirectNavLinkOperation"
    // InternalAdaptDsl.g:2490:1: ruleRedirectNavLinkOperation returns [EObject current=null] : (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleRedirectNavLinkOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_viewComp_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2496:2: ( (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2497:2: (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2497:2: (otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2498:3: otherlv_0= 'redirectNavLink' otherlv_1= '(' ( (lv_viewComp_2_0= ruleViewComponent ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2506:3: ( (lv_viewComp_2_0= ruleViewComponent ) )
            // InternalAdaptDsl.g:2507:4: (lv_viewComp_2_0= ruleViewComponent )
            {
            // InternalAdaptDsl.g:2507:4: (lv_viewComp_2_0= ruleViewComponent )
            // InternalAdaptDsl.g:2508:5: lv_viewComp_2_0= ruleViewComponent
            {

            					newCompositeNode(grammarAccess.getRedirectNavLinkOperationAccess().getViewCompViewComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_viewComp_2_0=ruleViewComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRedirectNavLinkOperationRule());
            					}
            					set(
            						current,
            						"viewComp",
            						lv_viewComp_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.ViewComponent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleRedirectNavLinkOperation"


    // $ANTLR start "entryRuleClearNavOperation"
    // InternalAdaptDsl.g:2537:1: entryRuleClearNavOperation returns [EObject current=null] : iv_ruleClearNavOperation= ruleClearNavOperation EOF ;
    public final EObject entryRuleClearNavOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClearNavOperation = null;


        try {
            // InternalAdaptDsl.g:2537:58: (iv_ruleClearNavOperation= ruleClearNavOperation EOF )
            // InternalAdaptDsl.g:2538:2: iv_ruleClearNavOperation= ruleClearNavOperation EOF
            {
             newCompositeNode(grammarAccess.getClearNavOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClearNavOperation=ruleClearNavOperation();

            state._fsp--;

             current =iv_ruleClearNavOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClearNavOperation"


    // $ANTLR start "ruleClearNavOperation"
    // InternalAdaptDsl.g:2544:1: ruleClearNavOperation returns [EObject current=null] : ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' ) ;
    public final EObject ruleClearNavOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2550:2: ( ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' ) )
            // InternalAdaptDsl.g:2551:2: ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' )
            {
            // InternalAdaptDsl.g:2551:2: ( () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';' )
            // InternalAdaptDsl.g:2552:3: () otherlv_1= 'clearNavigation' otherlv_2= '()' otherlv_3= ';'
            {
            // InternalAdaptDsl.g:2552:3: ()
            // InternalAdaptDsl.g:2553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClearNavOperationAccess().getClearNavOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getClearNavOperationAccess().getClearNavigationKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getClearNavOperationAccess().getLeftParenthesisRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getClearNavOperationAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleClearNavOperation"


    // $ANTLR start "entryRuleText"
    // InternalAdaptDsl.g:2575:1: entryRuleText returns [String current=null] : iv_ruleText= ruleText EOF ;
    public final String entryRuleText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleText = null;


        try {
            // InternalAdaptDsl.g:2575:44: (iv_ruleText= ruleText EOF )
            // InternalAdaptDsl.g:2576:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalAdaptDsl.g:2582:1: ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:2588:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:2589:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getTextAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleLayoutChangeOperation"
    // InternalAdaptDsl.g:2599:1: entryRuleLayoutChangeOperation returns [EObject current=null] : iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF ;
    public final EObject entryRuleLayoutChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutChangeOperation = null;


        try {
            // InternalAdaptDsl.g:2599:62: (iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF )
            // InternalAdaptDsl.g:2600:2: iv_ruleLayoutChangeOperation= ruleLayoutChangeOperation EOF
            {
             newCompositeNode(grammarAccess.getLayoutChangeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutChangeOperation=ruleLayoutChangeOperation();

            state._fsp--;

             current =iv_ruleLayoutChangeOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLayoutChangeOperation"


    // $ANTLR start "ruleLayoutChangeOperation"
    // InternalAdaptDsl.g:2606:1: ruleLayoutChangeOperation returns [EObject current=null] : ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) ) ;
    public final EObject ruleLayoutChangeOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operation_0_0 = null;

        EObject lv_operation_1_0 = null;

        EObject lv_operation_2_0 = null;

        EObject lv_operation_3_0 = null;

        EObject lv_operation_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2612:2: ( ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) ) )
            // InternalAdaptDsl.g:2613:2: ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) )
            {
            // InternalAdaptDsl.g:2613:2: ( ( (lv_operation_0_0= ruleChangeFontOperation ) ) | ( (lv_operation_1_0= ruleChangeFontSizeOperation ) ) | ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) ) | ( (lv_operation_3_0= ruleAdaptCssClassOperation ) ) | ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) ) )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt26=1;
                }
                break;
            case 49:
                {
                alt26=2;
                }
                break;
            case 52:
                {
                alt26=3;
                }
                break;
            case 53:
                {
                alt26=4;
                }
                break;
            case 50:
                {
                alt26=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalAdaptDsl.g:2614:3: ( (lv_operation_0_0= ruleChangeFontOperation ) )
                    {
                    // InternalAdaptDsl.g:2614:3: ( (lv_operation_0_0= ruleChangeFontOperation ) )
                    // InternalAdaptDsl.g:2615:4: (lv_operation_0_0= ruleChangeFontOperation )
                    {
                    // InternalAdaptDsl.g:2615:4: (lv_operation_0_0= ruleChangeFontOperation )
                    // InternalAdaptDsl.g:2616:5: lv_operation_0_0= ruleChangeFontOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeFontOperationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_0_0=ruleChangeFontOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_0_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ChangeFontOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:2634:3: ( (lv_operation_1_0= ruleChangeFontSizeOperation ) )
                    {
                    // InternalAdaptDsl.g:2634:3: ( (lv_operation_1_0= ruleChangeFontSizeOperation ) )
                    // InternalAdaptDsl.g:2635:4: (lv_operation_1_0= ruleChangeFontSizeOperation )
                    {
                    // InternalAdaptDsl.g:2635:4: (lv_operation_1_0= ruleChangeFontSizeOperation )
                    // InternalAdaptDsl.g:2636:5: lv_operation_1_0= ruleChangeFontSizeOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeFontSizeOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_1_0=ruleChangeFontSizeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_1_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ChangeFontSizeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:2654:3: ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) )
                    {
                    // InternalAdaptDsl.g:2654:3: ( (lv_operation_2_0= ruleChangeTableCssClassOperation ) )
                    // InternalAdaptDsl.g:2655:4: (lv_operation_2_0= ruleChangeTableCssClassOperation )
                    {
                    // InternalAdaptDsl.g:2655:4: (lv_operation_2_0= ruleChangeTableCssClassOperation )
                    // InternalAdaptDsl.g:2656:5: lv_operation_2_0= ruleChangeTableCssClassOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeTableCssClassOperationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_2_0=ruleChangeTableCssClassOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_2_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ChangeTableCssClassOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAdaptDsl.g:2674:3: ( (lv_operation_3_0= ruleAdaptCssClassOperation ) )
                    {
                    // InternalAdaptDsl.g:2674:3: ( (lv_operation_3_0= ruleAdaptCssClassOperation ) )
                    // InternalAdaptDsl.g:2675:4: (lv_operation_3_0= ruleAdaptCssClassOperation )
                    {
                    // InternalAdaptDsl.g:2675:4: (lv_operation_3_0= ruleAdaptCssClassOperation )
                    // InternalAdaptDsl.g:2676:5: lv_operation_3_0= ruleAdaptCssClassOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationAdaptCssClassOperationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_3_0=ruleAdaptCssClassOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_3_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.AdaptCssClassOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAdaptDsl.g:2694:3: ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) )
                    {
                    // InternalAdaptDsl.g:2694:3: ( (lv_operation_4_0= ruleChangeColorSchemeOperation ) )
                    // InternalAdaptDsl.g:2695:4: (lv_operation_4_0= ruleChangeColorSchemeOperation )
                    {
                    // InternalAdaptDsl.g:2695:4: (lv_operation_4_0= ruleChangeColorSchemeOperation )
                    // InternalAdaptDsl.g:2696:5: lv_operation_4_0= ruleChangeColorSchemeOperation
                    {

                    					newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getOperationChangeColorSchemeOperationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_operation_4_0=ruleChangeColorSchemeOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayoutChangeOperationRule());
                    					}
                    					set(
                    						current,
                    						"operation",
                    						lv_operation_4_0,
                    						"org.xtext.example.adaptdsl.AdaptDsl.ChangeColorSchemeOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleLayoutChangeOperation"


    // $ANTLR start "entryRuleChangeFontSizeOperation"
    // InternalAdaptDsl.g:2717:1: entryRuleChangeFontSizeOperation returns [EObject current=null] : iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF ;
    public final EObject entryRuleChangeFontSizeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeFontSizeOperation = null;


        try {
            // InternalAdaptDsl.g:2717:64: (iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF )
            // InternalAdaptDsl.g:2718:2: iv_ruleChangeFontSizeOperation= ruleChangeFontSizeOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeFontSizeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeFontSizeOperation=ruleChangeFontSizeOperation();

            state._fsp--;

             current =iv_ruleChangeFontSizeOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChangeFontSizeOperation"


    // $ANTLR start "ruleChangeFontSizeOperation"
    // InternalAdaptDsl.g:2724:1: ruleChangeFontSizeOperation returns [EObject current=null] : (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleChangeFontSizeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_sizePrimary_2_0 = null;

        AntlrDatatypeRuleToken lv_sizeSecondary_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2730:2: ( (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2731:2: (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2731:2: (otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2732:3: otherlv_0= 'changeFontSize' otherlv_1= '(' ( (lv_sizePrimary_2_0= ruleFontSize ) ) otherlv_3= ',' ( (lv_sizeSecondary_4_0= ruleFontSize ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2740:3: ( (lv_sizePrimary_2_0= ruleFontSize ) )
            // InternalAdaptDsl.g:2741:4: (lv_sizePrimary_2_0= ruleFontSize )
            {
            // InternalAdaptDsl.g:2741:4: (lv_sizePrimary_2_0= ruleFontSize )
            // InternalAdaptDsl.g:2742:5: lv_sizePrimary_2_0= ruleFontSize
            {

            					newCompositeNode(grammarAccess.getChangeFontSizeOperationAccess().getSizePrimaryFontSizeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
            lv_sizePrimary_2_0=ruleFontSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeFontSizeOperationRule());
            					}
            					set(
            						current,
            						"sizePrimary",
            						lv_sizePrimary_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.FontSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeFontSizeOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2763:3: ( (lv_sizeSecondary_4_0= ruleFontSize ) )
            // InternalAdaptDsl.g:2764:4: (lv_sizeSecondary_4_0= ruleFontSize )
            {
            // InternalAdaptDsl.g:2764:4: (lv_sizeSecondary_4_0= ruleFontSize )
            // InternalAdaptDsl.g:2765:5: lv_sizeSecondary_4_0= ruleFontSize
            {

            					newCompositeNode(grammarAccess.getChangeFontSizeOperationAccess().getSizeSecondaryFontSizeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_sizeSecondary_4_0=ruleFontSize();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeFontSizeOperationRule());
            					}
            					set(
            						current,
            						"sizeSecondary",
            						lv_sizeSecondary_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.FontSize");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleChangeFontSizeOperation"


    // $ANTLR start "entryRuleChangeColorSchemeOperation"
    // InternalAdaptDsl.g:2794:1: entryRuleChangeColorSchemeOperation returns [EObject current=null] : iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF ;
    public final EObject entryRuleChangeColorSchemeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeColorSchemeOperation = null;


        try {
            // InternalAdaptDsl.g:2794:67: (iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF )
            // InternalAdaptDsl.g:2795:2: iv_ruleChangeColorSchemeOperation= ruleChangeColorSchemeOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeColorSchemeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeColorSchemeOperation=ruleChangeColorSchemeOperation();

            state._fsp--;

             current =iv_ruleChangeColorSchemeOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChangeColorSchemeOperation"


    // $ANTLR start "ruleChangeColorSchemeOperation"
    // InternalAdaptDsl.g:2801:1: ruleChangeColorSchemeOperation returns [EObject current=null] : (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleChangeColorSchemeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_colorPrimary_2_0 = null;

        AntlrDatatypeRuleToken lv_colorSecondary_4_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2807:2: ( (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalAdaptDsl.g:2808:2: (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalAdaptDsl.g:2808:2: (otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalAdaptDsl.g:2809:3: otherlv_0= 'changeColorScheme' otherlv_1= '(' ( (lv_colorPrimary_2_0= ruleColor ) ) otherlv_3= ',' ( (lv_colorSecondary_4_0= ruleColor ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeColorSchemeOperationAccess().getChangeColorSchemeKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeColorSchemeOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2817:3: ( (lv_colorPrimary_2_0= ruleColor ) )
            // InternalAdaptDsl.g:2818:4: (lv_colorPrimary_2_0= ruleColor )
            {
            // InternalAdaptDsl.g:2818:4: (lv_colorPrimary_2_0= ruleColor )
            // InternalAdaptDsl.g:2819:5: lv_colorPrimary_2_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getChangeColorSchemeOperationAccess().getColorPrimaryColorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
            lv_colorPrimary_2_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeColorSchemeOperationRule());
            					}
            					set(
            						current,
            						"colorPrimary",
            						lv_colorPrimary_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeColorSchemeOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:2840:3: ( (lv_colorSecondary_4_0= ruleColor ) )
            // InternalAdaptDsl.g:2841:4: (lv_colorSecondary_4_0= ruleColor )
            {
            // InternalAdaptDsl.g:2841:4: (lv_colorSecondary_4_0= ruleColor )
            // InternalAdaptDsl.g:2842:5: lv_colorSecondary_4_0= ruleColor
            {

            					newCompositeNode(grammarAccess.getChangeColorSchemeOperationAccess().getColorSecondaryColorParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_colorSecondary_4_0=ruleColor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeColorSchemeOperationRule());
            					}
            					set(
            						current,
            						"colorSecondary",
            						lv_colorSecondary_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Color");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getChangeColorSchemeOperationAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChangeColorSchemeOperationAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleChangeColorSchemeOperation"


    // $ANTLR start "entryRuleChangeFontOperation"
    // InternalAdaptDsl.g:2871:1: entryRuleChangeFontOperation returns [EObject current=null] : iv_ruleChangeFontOperation= ruleChangeFontOperation EOF ;
    public final EObject entryRuleChangeFontOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeFontOperation = null;


        try {
            // InternalAdaptDsl.g:2871:60: (iv_ruleChangeFontOperation= ruleChangeFontOperation EOF )
            // InternalAdaptDsl.g:2872:2: iv_ruleChangeFontOperation= ruleChangeFontOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeFontOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeFontOperation=ruleChangeFontOperation();

            state._fsp--;

             current =iv_ruleChangeFontOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChangeFontOperation"


    // $ANTLR start "ruleChangeFontOperation"
    // InternalAdaptDsl.g:2878:1: ruleChangeFontOperation returns [EObject current=null] : (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleChangeFontOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2884:2: ( (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2885:2: (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2885:2: (otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2886:3: otherlv_0= 'changeFont' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2894:3: ( (lv_text_2_0= ruleText ) )
            // InternalAdaptDsl.g:2895:4: (lv_text_2_0= ruleText )
            {
            // InternalAdaptDsl.g:2895:4: (lv_text_2_0= ruleText )
            // InternalAdaptDsl.g:2896:5: lv_text_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getChangeFontOperationAccess().getTextTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_text_2_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeFontOperationRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleChangeFontOperation"


    // $ANTLR start "entryRuleChangeTableCssClassOperation"
    // InternalAdaptDsl.g:2925:1: entryRuleChangeTableCssClassOperation returns [EObject current=null] : iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF ;
    public final EObject entryRuleChangeTableCssClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeTableCssClassOperation = null;


        try {
            // InternalAdaptDsl.g:2925:69: (iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF )
            // InternalAdaptDsl.g:2926:2: iv_ruleChangeTableCssClassOperation= ruleChangeTableCssClassOperation EOF
            {
             newCompositeNode(grammarAccess.getChangeTableCssClassOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChangeTableCssClassOperation=ruleChangeTableCssClassOperation();

            state._fsp--;

             current =iv_ruleChangeTableCssClassOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleChangeTableCssClassOperation"


    // $ANTLR start "ruleChangeTableCssClassOperation"
    // InternalAdaptDsl.g:2932:1: ruleChangeTableCssClassOperation returns [EObject current=null] : (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) ;
    public final EObject ruleChangeTableCssClassOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_text_2_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2938:2: ( (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' ) )
            // InternalAdaptDsl.g:2939:2: (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            {
            // InternalAdaptDsl.g:2939:2: (otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';' )
            // InternalAdaptDsl.g:2940:3: otherlv_0= 'changeTableCss' otherlv_1= '(' ( (lv_text_2_0= ruleText ) ) otherlv_3= ')' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:2948:3: ( (lv_text_2_0= ruleText ) )
            // InternalAdaptDsl.g:2949:4: (lv_text_2_0= ruleText )
            {
            // InternalAdaptDsl.g:2949:4: (lv_text_2_0= ruleText )
            // InternalAdaptDsl.g:2950:5: lv_text_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getChangeTableCssClassOperationAccess().getTextTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_text_2_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChangeTableCssClassOperationRule());
            					}
            					set(
            						current,
            						"text",
            						lv_text_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getChangeTableCssClassOperationAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleChangeTableCssClassOperation"


    // $ANTLR start "entryRuleAdaptCssClassOperation"
    // InternalAdaptDsl.g:2979:1: entryRuleAdaptCssClassOperation returns [EObject current=null] : iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF ;
    public final EObject entryRuleAdaptCssClassOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptCssClassOperation = null;


        try {
            // InternalAdaptDsl.g:2979:63: (iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF )
            // InternalAdaptDsl.g:2980:2: iv_ruleAdaptCssClassOperation= ruleAdaptCssClassOperation EOF
            {
             newCompositeNode(grammarAccess.getAdaptCssClassOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdaptCssClassOperation=ruleAdaptCssClassOperation();

            state._fsp--;

             current =iv_ruleAdaptCssClassOperation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAdaptCssClassOperation"


    // $ANTLR start "ruleAdaptCssClassOperation"
    // InternalAdaptDsl.g:2986:1: ruleAdaptCssClassOperation returns [EObject current=null] : (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' ) ;
    public final EObject ruleAdaptCssClassOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_cssClass_2_0 = null;

        AntlrDatatypeRuleToken lv_cssAttribute_4_0 = null;

        AntlrDatatypeRuleToken lv_cssAttributeValue_6_0 = null;



        	enterRule();

        try {
            // InternalAdaptDsl.g:2992:2: ( (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' ) )
            // InternalAdaptDsl.g:2993:2: (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' )
            {
            // InternalAdaptDsl.g:2993:2: (otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';' )
            // InternalAdaptDsl.g:2994:3: otherlv_0= 'adaptCssClass' otherlv_1= '(' ( (lv_cssClass_2_0= ruleCssClass ) ) otherlv_3= ',' ( (lv_cssAttribute_4_0= ruleAttribute ) ) otherlv_5= ',' ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) ) otherlv_7= ')' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptCssClassOperationAccess().getAdaptCssClassKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAdaptCssClassOperationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalAdaptDsl.g:3002:3: ( (lv_cssClass_2_0= ruleCssClass ) )
            // InternalAdaptDsl.g:3003:4: (lv_cssClass_2_0= ruleCssClass )
            {
            // InternalAdaptDsl.g:3003:4: (lv_cssClass_2_0= ruleCssClass )
            // InternalAdaptDsl.g:3004:5: lv_cssClass_2_0= ruleCssClass
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssClassCssClassParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
            lv_cssClass_2_0=ruleCssClass();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptCssClassOperationRule());
            					}
            					set(
            						current,
            						"cssClass",
            						lv_cssClass_2_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.CssClass");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_3());
            		
            // InternalAdaptDsl.g:3025:3: ( (lv_cssAttribute_4_0= ruleAttribute ) )
            // InternalAdaptDsl.g:3026:4: (lv_cssAttribute_4_0= ruleAttribute )
            {
            // InternalAdaptDsl.g:3026:4: (lv_cssAttribute_4_0= ruleAttribute )
            // InternalAdaptDsl.g:3027:5: lv_cssAttribute_4_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeAttributeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_38);
            lv_cssAttribute_4_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptCssClassOperationRule());
            					}
            					set(
            						current,
            						"cssAttribute",
            						lv_cssAttribute_4_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getAdaptCssClassOperationAccess().getCommaKeyword_5());
            		
            // InternalAdaptDsl.g:3048:3: ( (lv_cssAttributeValue_6_0= ruleAttributeValue ) )
            // InternalAdaptDsl.g:3049:4: (lv_cssAttributeValue_6_0= ruleAttributeValue )
            {
            // InternalAdaptDsl.g:3049:4: (lv_cssAttributeValue_6_0= ruleAttributeValue )
            // InternalAdaptDsl.g:3050:5: lv_cssAttributeValue_6_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAdaptCssClassOperationAccess().getCssAttributeValueAttributeValueParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_21);
            lv_cssAttributeValue_6_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAdaptCssClassOperationRule());
            					}
            					set(
            						current,
            						"cssAttributeValue",
            						lv_cssAttributeValue_6_0,
            						"org.xtext.example.adaptdsl.AdaptDsl.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getAdaptCssClassOperationAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAdaptCssClassOperationAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleAdaptCssClassOperation"


    // $ANTLR start "entryRuleCssClass"
    // InternalAdaptDsl.g:3079:1: entryRuleCssClass returns [String current=null] : iv_ruleCssClass= ruleCssClass EOF ;
    public final String entryRuleCssClass() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCssClass = null;


        try {
            // InternalAdaptDsl.g:3079:48: (iv_ruleCssClass= ruleCssClass EOF )
            // InternalAdaptDsl.g:3080:2: iv_ruleCssClass= ruleCssClass EOF
            {
             newCompositeNode(grammarAccess.getCssClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCssClass=ruleCssClass();

            state._fsp--;

             current =iv_ruleCssClass.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCssClass"


    // $ANTLR start "ruleCssClass"
    // InternalAdaptDsl.g:3086:1: ruleCssClass returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleCssClass() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3092:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3093:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getCssClassAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleCssClass"


    // $ANTLR start "entryRuleAttribute"
    // InternalAdaptDsl.g:3103:1: entryRuleAttribute returns [String current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final String entryRuleAttribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttribute = null;


        try {
            // InternalAdaptDsl.g:3103:49: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalAdaptDsl.g:3104:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalAdaptDsl.g:3110:1: ruleAttribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleAttribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3116:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3117:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getAttributeAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalAdaptDsl.g:3127:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // InternalAdaptDsl.g:3127:54: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalAdaptDsl.g:3128:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalAdaptDsl.g:3134:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3140:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3141:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleColor"
    // InternalAdaptDsl.g:3151:1: entryRuleColor returns [String current=null] : iv_ruleColor= ruleColor EOF ;
    public final String entryRuleColor() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleColor = null;


        try {
            // InternalAdaptDsl.g:3151:45: (iv_ruleColor= ruleColor EOF )
            // InternalAdaptDsl.g:3152:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalAdaptDsl.g:3158:1: ruleColor returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleColor() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3164:2: (this_STRING_0= RULE_STRING )
            // InternalAdaptDsl.g:3165:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getColorAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleFontSize"
    // InternalAdaptDsl.g:3175:1: entryRuleFontSize returns [String current=null] : iv_ruleFontSize= ruleFontSize EOF ;
    public final String entryRuleFontSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFontSize = null;


        try {
            // InternalAdaptDsl.g:3175:48: (iv_ruleFontSize= ruleFontSize EOF )
            // InternalAdaptDsl.g:3176:2: iv_ruleFontSize= ruleFontSize EOF
            {
             newCompositeNode(grammarAccess.getFontSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFontSize=ruleFontSize();

            state._fsp--;

             current =iv_ruleFontSize.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFontSize"


    // $ANTLR start "ruleFontSize"
    // InternalAdaptDsl.g:3182:1: ruleFontSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleFontSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3188:2: (this_INT_0= RULE_INT )
            // InternalAdaptDsl.g:3189:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getFontSizeAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleFontSize"


    // $ANTLR start "entryRuleValue"
    // InternalAdaptDsl.g:3199:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalAdaptDsl.g:3199:45: (iv_ruleValue= ruleValue EOF )
            // InternalAdaptDsl.g:3200:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalAdaptDsl.g:3206:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_BOOL_2=null;


        	enterRule();

        try {
            // InternalAdaptDsl.g:3212:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL ) )
            // InternalAdaptDsl.g:3213:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL )
            {
            // InternalAdaptDsl.g:3213:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_BOOL_2= RULE_BOOL )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt27=1;
                }
                break;
            case RULE_STRING:
                {
                alt27=2;
                }
                break;
            case RULE_BOOL:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalAdaptDsl.g:3214:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAdaptDsl.g:3222:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAdaptDsl.g:3230:3: this_BOOL_2= RULE_BOOL
                    {
                    this_BOOL_2=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    			current.merge(this_BOOL_2);
                    		

                    			newLeafNode(this_BOOL_2, grammarAccess.getValueAccess().getBOOLTerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleValue"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\uffff\2\10\6\uffff\1\10\1\uffff\1\10";
    static final String dfa_3s = "\1\5\2\31\1\5\3\4\2\uffff\1\31\1\uffff\1\31";
    static final String dfa_4s = "\1\5\2\46\1\5\2\7\1\6\2\uffff\1\46\1\uffff\1\46";
    static final String dfa_5s = "\7\uffff\1\2\1\3\1\uffff\1\1\1\uffff";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\10\2\uffff\2\10\1\2\1\3\2\7\1\4\1\5\2\7\1\6",
            "\1\10\2\uffff\2\10\1\uffff\1\3\2\7\1\4\1\5\2\7\1\6",
            "\1\11",
            "\1\12\1\uffff\1\7\1\10",
            "\1\12\1\uffff\1\7\1\10",
            "\1\12\1\uffff\1\7",
            "",
            "",
            "\1\10\2\uffff\2\10\1\13\1\3\2\7\1\4\1\5\2\7\1\6",
            "",
            "\1\10\2\uffff\2\10\1\uffff\1\3\2\7\1\4\1\5\2\7\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "769:2: ( ( (lv_cond_0_0= ruleStringCondition ) ) | ( (lv_cond_1_0= ruleNumberCondition ) ) | ( (lv_cond_2_0= ruleBooleanCondition ) ) )";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\1\uffff\2\4\3\uffff\2\4";
    static final String dfa_10s = "\1\5\2\31\1\5\2\uffff\2\31";
    static final String dfa_11s = "\1\5\2\43\1\5\2\uffff\2\43";
    static final String dfa_12s = "\4\uffff\1\2\1\1\2\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\4\2\uffff\2\4\1\2\1\3\2\uffff\2\5",
            "\1\4\2\uffff\2\4\1\uffff\1\3\2\uffff\2\5",
            "\1\6",
            "",
            "",
            "\1\4\2\uffff\2\4\1\7\1\3\2\uffff\2\5",
            "\1\4\2\uffff\2\4\1\uffff\1\3\2\uffff\2\5"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "847:2: ( ( ( (lv_fact_0_0= ruleFact ) ) ( (lv_op_1_0= ruleBoolOperators ) ) ( (lv_val_2_0= RULE_BOOL ) ) ) | ( (lv_fact_3_0= ruleFact ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x003FFE8000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004C00000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x003FFE8000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000040000000L});

}