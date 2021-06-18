package com.chaoppo.db.jyst;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ExpressionEvaluator {
	
	public static void main(String[] a) {
		
		PostedSpeedSignals postedSpeedSignals = new PostedSpeedSignals();
		postedSpeedSignals.TSR_Func_Stat_MPC = 2;
		postedSpeedSignals.TrafSign1 = 4;
		postedSpeedSignals.TrafSign2 = 4;
		postedSpeedSignals.TrafSign3 = 4;
		postedSpeedSignals.TrafSign4 = 4;
		postedSpeedSignals.SuppSign1_MPC = 0;
		postedSpeedSignals.SuppSign2_MPC = 0;
		postedSpeedSignals.SuppSign3_MPC = 0;
		postedSpeedSignals.SuppSign4_MPC = 0;
		
	    StandardEvaluationContext testContext = new StandardEvaluationContext(postedSpeedSignals);
	    ExpressionParser expressionParser = new SpelExpressionParser();
	    Expression expression = expressionParser.parseExpression(PostedRoadConditions.MPH20SIGNFOUND.getExpression(), ParserContext.TEMPLATE_EXPRESSION);
	    Boolean o = expression.getValue(testContext, Boolean.class);
	    System.out.println("o = " + o);
	}
}
