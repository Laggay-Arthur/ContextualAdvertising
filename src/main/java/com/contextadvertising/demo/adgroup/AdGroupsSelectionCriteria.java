package com.contextadvertising.demo.adgroup;

import java.util.ArrayList;

public class AdGroupsSelectionCriteria {
    ArrayList<Long> CampaignIds;
    ArrayList<Long> Ids;
    ArrayList<AdGroupTypesEnum> Types;
    ArrayList<AdGroupStatusSelectionEnum> Statuses;
    ArrayList<ServingStatusEnum> ServingStatuses;
    ArrayList<AdGroupAppIconStatusSelectionEnum> AppIconStatuses;
    ArrayList<Long> NegativeKeywordSharedSetIds;

    public AdGroupsSelectionCriteria(ArrayList<Long> campaignIds) {
        CampaignIds = campaignIds;
    }
}
