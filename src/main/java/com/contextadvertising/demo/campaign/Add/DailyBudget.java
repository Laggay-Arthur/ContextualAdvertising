package com.contextadvertising.demo.campaign.Add;

public class DailyBudget {
    public Long Amount;
    public DailyBudgetModeEnum dailyBudgetModeEnum;

    public DailyBudget(Long amount, DailyBudgetModeEnum dailyBudgetModeEnum) {
        Amount = amount;
        this.dailyBudgetModeEnum = dailyBudgetModeEnum;
    }
}
