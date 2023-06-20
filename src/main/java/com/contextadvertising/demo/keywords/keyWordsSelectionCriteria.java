package com.contextadvertising.demo.keywords;


import java.util.ArrayList;

public class keyWordsSelectionCriteria {
    ArrayList<Long> CampaignIds;
    ArrayList<Long> AdGroupIds;
    ArrayList<Long> Ids;

    public keyWordsSelectionCriteria(ArrayList<Long> adGroupIds) {
        AdGroupIds = adGroupIds;
    }
}
