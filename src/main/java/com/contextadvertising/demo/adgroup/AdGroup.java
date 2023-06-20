package com.contextadvertising.demo.adgroup;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AdGroup {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("CampaignId")
    @Expose
    private Integer campaignId;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("ServingStatus")
    @Expose
    private String servingStatus;
    @SerializedName("RestrictedRegionIds")
    @Expose
    private Object restrictedRegionIds;
    @SerializedName("RegionIds")
    @Expose
    private List<Integer> regionIds = null;
    @SerializedName("NegativeKeywords")
    @Expose
    private NegativeKeywords negativeKeywords;
    @SerializedName("NegativeKeywordSharedSetIds")
    @Expose
    private Object negativeKeywordSharedSetIds;
    @SerializedName("TrackingParams")
    @Expose
    private String trackingParams;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getServingStatus() {
        return servingStatus;
    }

    public void setServingStatus(String servingStatus) {
        this.servingStatus = servingStatus;
    }

    public Object getRestrictedRegionIds() {
        return restrictedRegionIds;
    }

    public void setRestrictedRegionIds(Object restrictedRegionIds) {
        this.restrictedRegionIds = restrictedRegionIds;
    }

    public List<Integer> getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(List<Integer> regionIds) {
        this.regionIds = regionIds;
    }

    public NegativeKeywords getNegativeKeywords() {
        return negativeKeywords;
    }

    public void setNegativeKeywords(NegativeKeywords negativeKeywords) {
        this.negativeKeywords = negativeKeywords;
    }

    public Object getNegativeKeywordSharedSetIds() {
        return negativeKeywordSharedSetIds;
    }

    public void setNegativeKeywordSharedSetIds(Object negativeKeywordSharedSetIds) {
        this.negativeKeywordSharedSetIds = negativeKeywordSharedSetIds;
    }

    public String getTrackingParams() {
        return trackingParams;
    }

    public void setTrackingParams(String trackingParams) {
        this.trackingParams = trackingParams;
    }

}
