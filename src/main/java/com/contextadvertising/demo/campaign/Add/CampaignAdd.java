package com.contextadvertising.demo.campaign.Add;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CampaignAdd {
    public String Name;
    public String StartDate;
    //public DailyBudget dailyBudget;
    public CampaignAdd(String name) {
        Name = name;
        StartDate =new SimpleDateFormat("YYYY-MM-DD").format(new Date());
        //dailyBudget = new DailyBudget(Long.valueOf(1),DailyBudgetModeEnum.STANDARD);
    }
}
