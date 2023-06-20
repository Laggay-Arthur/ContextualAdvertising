package com.contextadvertising.demo.keywords;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class KeyWord {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Keyword")
    @Expose
    private String keyword;
    @SerializedName("CampaignId")
    @Expose
    private Integer campaignId;
    @SerializedName("AdGroupId")
    @Expose
    private Integer AdGroupId;
    @SerializedName("Bid")
    @Expose
    private String bid;
    @SerializedName("ContextBid")
    @Expose
    private String contextbid;
    @SerializedName("Status")
    @Expose
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public Integer getAdGroupId() {
        return AdGroupId;
    }

    public void setAdGroupId(Integer adGroupId) {
        AdGroupId = adGroupId;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getContextbid() {
        return contextbid;
    }

    public void setContextbid(String contextbid) {
        this.contextbid = contextbid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
