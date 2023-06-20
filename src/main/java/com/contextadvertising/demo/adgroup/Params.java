package com.contextadvertising.demo.adgroup;

import com.contextadvertising.demo.campaign.CampaignsSelectionCriteria;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Params {
    @SerializedName("SelectionCriteria")
    public AdGroupsSelectionCriteria adGroupsSelectionCriteria;
    public ArrayList<String> FieldNames;

    public Params(ArrayList<String> fieldNames) {
        FieldNames = fieldNames;
    }

    public Params(AdGroupsSelectionCriteria selCriteria, ArrayList<String> fieldNames) {
        adGroupsSelectionCriteria = selCriteria;
        FieldNames = fieldNames;
    }
}
