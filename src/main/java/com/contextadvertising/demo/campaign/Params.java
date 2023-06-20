package com.contextadvertising.demo.campaign;

import com.contextadvertising.demo.adgroup.AdGroupsSelectionCriteria;
import com.contextadvertising.demo.campaign.CampaignsSelectionCriteria;

import java.util.ArrayList;

public class Params {
    public CampaignsSelectionCriteria campaignsSelectionCriteria;
    public ArrayList<String> FieldNames;

    public Params(ArrayList<String> fieldNames) {
        FieldNames = fieldNames;
    }
    public Params(CampaignsSelectionCriteria selCriteria, ArrayList<String> fieldNames) {
        campaignsSelectionCriteria = selCriteria;
        FieldNames = fieldNames;
    }
}
