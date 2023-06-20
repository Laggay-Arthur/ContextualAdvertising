
package com.contextadvertising.demo.campaign;

import java.util.List;
import javax.annotation.Generated;

import com.contextadvertising.demo.campaign.Campaign;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("Campaigns")
    @Expose
    private List<Campaign> campaigns = null;

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

}
