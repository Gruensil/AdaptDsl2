/*
 * generated by Xtext 2.10.0
 */
grammar InternalAdaptDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.adaptdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getAdaptationRulesAdaptionRuleParserRuleCall_0());
			}
			lv_adaptationRules_0_0=ruleadaptionRule
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"adaptationRules",
					lv_adaptationRules_0_0,
					"org.xtext.example.adaptdsl.AdaptDsl.adaptionRule");
				afterParserOrEnumRuleCall();
			}
		)
	)+
;

// Entry rule entryRuleadaptionRule
entryRuleadaptionRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdaptionRuleRule()); }
	iv_ruleadaptionRule=ruleadaptionRule
	{ $current=$iv_ruleadaptionRule.current; }
	EOF;

// Rule adaptionRule
ruleadaptionRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rule'
		{
			newLeafNode(otherlv_0, grammarAccess.getAdaptionRuleAccess().getRuleKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getAdaptionRuleAccess().getRuleNameParserRuleCall_1());
		}
		this_RuleName_1=ruleRuleName
		{
			$current = $this_RuleName_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAdaptionRuleAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='IF'
		{
			newLeafNode(otherlv_3, grammarAccess.getAdaptionRuleAccess().getIFKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getAdaptionRuleAccess().getLeftParenthesisKeyword_4());
		}
		{
			newCompositeNode(grammarAccess.getAdaptionRuleAccess().getConditionsParserRuleCall_5());
		}
		ruleConditions
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getAdaptionRuleAccess().getRightParenthesisKeyword_6());
		}
		otherlv_7='THEN'
		{
			newLeafNode(otherlv_7, grammarAccess.getAdaptionRuleAccess().getTHENKeyword_7());
		}
		otherlv_8='('
		{
			newLeafNode(otherlv_8, grammarAccess.getAdaptionRuleAccess().getLeftParenthesisKeyword_8());
		}
		{
			newCompositeNode(grammarAccess.getAdaptionRuleAccess().getActionsParserRuleCall_9());
		}
		ruleActions
		{
			afterParserOrEnumRuleCall();
		}
		otherlv_10=')'
		{
			newLeafNode(otherlv_10, grammarAccess.getAdaptionRuleAccess().getRightParenthesisKeyword_10());
		}
		otherlv_11=';'
		{
			newLeafNode(otherlv_11, grammarAccess.getAdaptionRuleAccess().getSemicolonKeyword_11());
		}
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getAdaptionRuleAccess().getRightCurlyBracketKeyword_12());
		}
	)
;

// Entry rule entryRuleRuleName
entryRuleRuleName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleNameRule()); }
	iv_ruleRuleName=ruleRuleName
	{ $current=$iv_ruleRuleName.current; }
	EOF;

// Rule RuleName
ruleRuleName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_rule_0_0=RULE_ID
			{
				newLeafNode(lv_rule_0_0, grammarAccess.getRuleNameAccess().getRuleIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getRuleNameRule());
				}
				setWithLastConsumed(
					$current,
					"rule",
					lv_rule_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleConditions
entryRuleConditions returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConditionsRule()); }
	iv_ruleConditions=ruleConditions
	{ $current=$iv_ruleConditions.current.getText(); }
	EOF;

// Rule Conditions
ruleConditions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConditionsAccess().getConditionParserRuleCall_0());
		}
		this_Condition_0=ruleCondition
		{
			$current.merge(this_Condition_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			{
				newCompositeNode(grammarAccess.getConditionsAccess().getAndOrParserRuleCall_1_0());
			}
			this_AndOr_1=ruleAndOr
			{
				$current.merge(this_AndOr_1);
			}
			{
				afterParserOrEnumRuleCall();
			}
			{
				newCompositeNode(grammarAccess.getConditionsAccess().getConditionParserRuleCall_1_1());
			}
			this_Condition_2=ruleCondition
			{
				$current.merge(this_Condition_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)*
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [String current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current.getText(); }
	EOF;

// Rule Condition
ruleCondition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getConditionAccess().getFactParserRuleCall_0_0());
			}
			this_Fact_0=ruleFact
			{
				$current.merge(this_Fact_0);
			}
			{
				afterParserOrEnumRuleCall();
			}
			{
				newCompositeNode(grammarAccess.getConditionAccess().getOperatorParserRuleCall_0_1());
			}
			this_Operator_1=ruleOperator
			{
				$current.merge(this_Operator_1);
			}
			{
				afterParserOrEnumRuleCall();
			}
			{
				newCompositeNode(grammarAccess.getConditionAccess().getValueParserRuleCall_0_2());
			}
			this_Value_2=ruleValue
			{
				$current.merge(this_Value_2);
			}
			{
				afterParserOrEnumRuleCall();
			}
		)
		    |
		(
			{
				newCompositeNode(grammarAccess.getConditionAccess().getFactParserRuleCall_1_0());
			}
			this_Fact_3=ruleFact
			{
				$current.merge(this_Fact_3);
			}
			{
				afterParserOrEnumRuleCall();
			}
			kw='('
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1_1());
			}
			kw=')'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getConditionAccess().getRightParenthesisKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleAndOr
entryRuleAndOr returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAndOrRule()); }
	iv_ruleAndOr=ruleAndOr
	{ $current=$iv_ruleAndOr.current.getText(); }
	EOF;

// Rule AndOr
ruleAndOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='AND'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAndOrAccess().getANDKeyword_0());
		}
		    |
		kw='&'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAndOrAccess().getAmpersandKeyword_1());
		}
		    |
		kw='OR'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAndOrAccess().getORKeyword_2());
		}
		    |
		kw='|'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAndOrAccess().getVerticalLineKeyword_3());
		}
	)
;

// Entry rule entryRuleFact
entryRuleFact returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFactRule()); }
	iv_ruleFact=ruleFact
	{ $current=$iv_ruleFact.current.getText(); }
	EOF;

// Rule Fact
ruleFact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getFactAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleOperator
entryRuleOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getOperatorRule()); }
	iv_ruleOperator=ruleOperator
	{ $current=$iv_ruleOperator.current.getText(); }
	EOF;

// Rule Operator
ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='>'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_0());
		}
		    |
		kw='<'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_1());
		}
		    |
		kw='=='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2());
		}
		    |
		kw='!='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_3());
		}
		    |
		kw='>='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_4());
		}
		    |
		kw='<='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_5());
		}
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current.getText(); }
	EOF;

// Rule Value
ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
		}
		    |
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleActions
entryRuleActions returns [String current=null]:
	{ newCompositeNode(grammarAccess.getActionsRule()); }
	iv_ruleActions=ruleActions
	{ $current=$iv_ruleActions.current.getText(); }
	EOF;

// Rule Actions
ruleActions returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionsAccess().getActionParserRuleCall());
		}
		this_Action_0=ruleAction
		{
			$current.merge(this_Action_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)*
;

// Entry rule entryRuleAction
entryRuleAction returns [String current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current.getText(); }
	EOF;

// Rule Action
ruleAction returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getTaskChangeOperationParserRuleCall_0());
		}
		this_TaskChangeOperation_0=ruleTaskChangeOperation
		{
			$current.merge(this_TaskChangeOperation_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getNavigationChangeOperationParserRuleCall_1());
		}
		this_NavigationChangeOperation_1=ruleNavigationChangeOperation
		{
			$current.merge(this_NavigationChangeOperation_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getLayoutChangeOperationParserRuleCall_2());
		}
		this_LayoutChangeOperation_2=ruleLayoutChangeOperation
		{
			$current.merge(this_LayoutChangeOperation_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTaskChangeOperation
entryRuleTaskChangeOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTaskChangeOperationRule()); }
	iv_ruleTaskChangeOperation=ruleTaskChangeOperation
	{ $current=$iv_ruleTaskChangeOperation.current.getText(); }
	EOF;

// Rule TaskChangeOperation
ruleTaskChangeOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getAddViewComponentOperationParserRuleCall_0());
		}
		this_AddViewComponentOperation_0=ruleAddViewComponentOperation
		{
			$current.merge(this_AddViewComponentOperation_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTaskChangeOperationAccess().getDeleteViewComponentOperationParserRuleCall_1());
		}
		this_DeleteViewComponentOperation_1=ruleDeleteViewComponentOperation
		{
			$current.merge(this_DeleteViewComponentOperation_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAddViewComponentOperation
entryRuleAddViewComponentOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAddViewComponentOperationRule()); }
	iv_ruleAddViewComponentOperation=ruleAddViewComponentOperation
	{ $current=$iv_ruleAddViewComponentOperation.current.getText(); }
	EOF;

// Rule AddViewComponentOperation
ruleAddViewComponentOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='addViewComponent'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getAddViewComponentKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getViewComponentParserRuleCall_2());
		}
		this_ViewComponent_2=ruleViewComponent
		{
			$current.merge(this_ViewComponent_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=','
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getCommaKeyword_3());
		}
		{
			newCompositeNode(grammarAccess.getAddViewComponentOperationAccess().getTargetContainerParserRuleCall_4());
		}
		this_TargetContainer_4=ruleTargetContainer
		{
			$current.merge(this_TargetContainer_4);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getRightParenthesisKeyword_5());
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddViewComponentOperationAccess().getSemicolonKeyword_6());
		}
	)
;

// Entry rule entryRuleDeleteViewComponentOperation
entryRuleDeleteViewComponentOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDeleteViewComponentOperationRule()); }
	iv_ruleDeleteViewComponentOperation=ruleDeleteViewComponentOperation
	{ $current=$iv_ruleDeleteViewComponentOperation.current.getText(); }
	EOF;

// Rule DeleteViewComponentOperation
ruleDeleteViewComponentOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='deleteViewComponent'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteViewComponentOperationAccess().getDeleteViewComponentKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteViewComponentOperationAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getDeleteViewComponentOperationAccess().getViewComponentParserRuleCall_2());
		}
		this_ViewComponent_2=ruleViewComponent
		{
			$current.merge(this_ViewComponent_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteViewComponentOperationAccess().getRightParenthesisKeyword_3());
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteViewComponentOperationAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleViewComponent
entryRuleViewComponent returns [String current=null]:
	{ newCompositeNode(grammarAccess.getViewComponentRule()); }
	iv_ruleViewComponent=ruleViewComponent
	{ $current=$iv_ruleViewComponent.current.getText(); }
	EOF;

// Rule ViewComponent
ruleViewComponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getViewComponentAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleTargetContainer
entryRuleTargetContainer returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTargetContainerRule()); }
	iv_ruleTargetContainer=ruleTargetContainer
	{ $current=$iv_ruleTargetContainer.current.getText(); }
	EOF;

// Rule TargetContainer
ruleTargetContainer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getTargetContainerAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleNavigationChangeOperation
entryRuleNavigationChangeOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNavigationChangeOperationRule()); }
	iv_ruleNavigationChangeOperation=ruleNavigationChangeOperation
	{ $current=$iv_ruleNavigationChangeOperation.current.getText(); }
	EOF;

// Rule NavigationChangeOperation
ruleNavigationChangeOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getAddNavLinkOperationParserRuleCall_0());
		}
		this_AddNavLinkOperation_0=ruleAddNavLinkOperation
		{
			$current.merge(this_AddNavLinkOperation_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getDeleteNavLinkOperationParserRuleCall_1());
		}
		this_DeleteNavLinkOperation_1=ruleDeleteNavLinkOperation
		{
			$current.merge(this_DeleteNavLinkOperation_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNavigationChangeOperationAccess().getRedirectNavLinkOperationParserRuleCall_2());
		}
		this_RedirectNavLinkOperation_2=ruleRedirectNavLinkOperation
		{
			$current.merge(this_RedirectNavLinkOperation_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAddNavLinkOperation
entryRuleAddNavLinkOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getAddNavLinkOperationRule()); }
	iv_ruleAddNavLinkOperation=ruleAddNavLinkOperation
	{ $current=$iv_ruleAddNavLinkOperation.current.getText(); }
	EOF;

// Rule AddNavLinkOperation
ruleAddNavLinkOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='addNavLink'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getAddNavLinkKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getViewComponentParserRuleCall_2());
		}
		this_ViewComponent_2=ruleViewComponent
		{
			$current.merge(this_ViewComponent_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=','
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getCommaKeyword_3());
		}
		{
			newCompositeNode(grammarAccess.getAddNavLinkOperationAccess().getTextParserRuleCall_4());
		}
		this_Text_4=ruleText
		{
			$current.merge(this_Text_4);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getRightParenthesisKeyword_5());
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getAddNavLinkOperationAccess().getSemicolonKeyword_6());
		}
	)
;

// Entry rule entryRuleDeleteNavLinkOperation
entryRuleDeleteNavLinkOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDeleteNavLinkOperationRule()); }
	iv_ruleDeleteNavLinkOperation=ruleDeleteNavLinkOperation
	{ $current=$iv_ruleDeleteNavLinkOperation.current.getText(); }
	EOF;

// Rule DeleteNavLinkOperation
ruleDeleteNavLinkOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='deleteNavLink'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteNavLinkOperationAccess().getDeleteNavLinkKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteNavLinkOperationAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getDeleteNavLinkOperationAccess().getViewComponentParserRuleCall_2());
		}
		this_ViewComponent_2=ruleViewComponent
		{
			$current.merge(this_ViewComponent_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteNavLinkOperationAccess().getRightParenthesisKeyword_3());
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDeleteNavLinkOperationAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleRedirectNavLinkOperation
entryRuleRedirectNavLinkOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRedirectNavLinkOperationRule()); }
	iv_ruleRedirectNavLinkOperation=ruleRedirectNavLinkOperation
	{ $current=$iv_ruleRedirectNavLinkOperation.current.getText(); }
	EOF;

// Rule RedirectNavLinkOperation
ruleRedirectNavLinkOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='redirectNavLink'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRedirectNavLinkOperationAccess().getRedirectNavLinkKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRedirectNavLinkOperationAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getRedirectNavLinkOperationAccess().getViewComponentParserRuleCall_2());
		}
		this_ViewComponent_2=ruleViewComponent
		{
			$current.merge(this_ViewComponent_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRedirectNavLinkOperationAccess().getRightParenthesisKeyword_3());
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getRedirectNavLinkOperationAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleText
entryRuleText returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTextRule()); }
	iv_ruleText=ruleText
	{ $current=$iv_ruleText.current.getText(); }
	EOF;

// Rule Text
ruleText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_STRING_0=RULE_STRING
	{
		$current.merge(this_STRING_0);
	}
	{
		newLeafNode(this_STRING_0, grammarAccess.getTextAccess().getSTRINGTerminalRuleCall());
	}
;

// Entry rule entryRuleLayoutChangeOperation
entryRuleLayoutChangeOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLayoutChangeOperationRule()); }
	iv_ruleLayoutChangeOperation=ruleLayoutChangeOperation
	{ $current=$iv_ruleLayoutChangeOperation.current.getText(); }
	EOF;

// Rule LayoutChangeOperation
ruleLayoutChangeOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getChangeFontOperationParserRuleCall_0());
		}
		this_ChangeFontOperation_0=ruleChangeFontOperation
		{
			$current.merge(this_ChangeFontOperation_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getChangeFontSizeOperationParserRuleCall_1());
		}
		this_ChangeFontSizeOperation_1=ruleChangeFontSizeOperation
		{
			$current.merge(this_ChangeFontSizeOperation_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLayoutChangeOperationAccess().getChangeTableCssClassOperationParserRuleCall_2());
		}
		this_ChangeTableCssClassOperation_2=ruleChangeTableCssClassOperation
		{
			$current.merge(this_ChangeTableCssClassOperation_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleChangeFontSizeOperation
entryRuleChangeFontSizeOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getChangeFontSizeOperationRule()); }
	iv_ruleChangeFontSizeOperation=ruleChangeFontSizeOperation
	{ $current=$iv_ruleChangeFontSizeOperation.current.getText(); }
	EOF;

// Rule ChangeFontSizeOperation
ruleChangeFontSizeOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='changeFontSize'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeFontSizeOperationAccess().getChangeFontSizeKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeFontSizeOperationAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getChangeFontSizeOperationAccess().getFontSizeParserRuleCall_2());
		}
		this_FontSize_2=ruleFontSize
		{
			$current.merge(this_FontSize_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeFontSizeOperationAccess().getRightParenthesisKeyword_3());
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeFontSizeOperationAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleChangeFontOperation
entryRuleChangeFontOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getChangeFontOperationRule()); }
	iv_ruleChangeFontOperation=ruleChangeFontOperation
	{ $current=$iv_ruleChangeFontOperation.current.getText(); }
	EOF;

// Rule ChangeFontOperation
ruleChangeFontOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='changeFont'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeFontOperationAccess().getChangeFontKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeFontOperationAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getChangeFontOperationAccess().getTextParserRuleCall_2());
		}
		this_Text_2=ruleText
		{
			$current.merge(this_Text_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeFontOperationAccess().getRightParenthesisKeyword_3());
		}
		kw=';'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeFontOperationAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleChangeTableCssClassOperation
entryRuleChangeTableCssClassOperation returns [String current=null]:
	{ newCompositeNode(grammarAccess.getChangeTableCssClassOperationRule()); }
	iv_ruleChangeTableCssClassOperation=ruleChangeTableCssClassOperation
	{ $current=$iv_ruleChangeTableCssClassOperation.current.getText(); }
	EOF;

// Rule ChangeTableCssClassOperation
ruleChangeTableCssClassOperation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='changeTableCss'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeTableCssClassOperationAccess().getChangeTableCssKeyword_0());
		}
		kw='('
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeTableCssClassOperationAccess().getLeftParenthesisKeyword_1());
		}
		{
			newCompositeNode(grammarAccess.getChangeTableCssClassOperationAccess().getTextParserRuleCall_2());
		}
		this_Text_2=ruleText
		{
			$current.merge(this_Text_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		kw=')'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getChangeTableCssClassOperationAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleFontSize
entryRuleFontSize returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFontSizeRule()); }
	iv_ruleFontSize=ruleFontSize
	{ $current=$iv_ruleFontSize.current.getText(); }
	EOF;

// Rule FontSize
ruleFontSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_INT_0=RULE_INT
	{
		$current.merge(this_INT_0);
	}
	{
		newLeafNode(this_INT_0, grammarAccess.getFontSizeAccess().getINTTerminalRuleCall());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;