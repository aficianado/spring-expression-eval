package com.chaoppo.db.jyst;

public enum PostedRoadConditions {

	MPH20SIGNFOUND("#{((TSR_Func_Stat_MPC == 2 || TSR_Func_Stat_MPC == 4) && ((TrafSign1 == 4 && SuppSign1_MPC == 0) || (TrafSign2 == 4 && SuppSign2_MPC == 0)  || (TrafSign3 == 4 && SuppSign3_MPC == 0)  || (TrafSign4 == 4 && SuppSign4_MPC == 0)))}");

	private String expression;

	public String getExpression() {
		return this.expression;
	}

	private PostedRoadConditions(String expression) {
		this.expression = expression;
	}
}
