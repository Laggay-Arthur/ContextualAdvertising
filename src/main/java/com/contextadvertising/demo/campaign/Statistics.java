
package com.contextadvertising.demo.campaign;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Statistics {

    @SerializedName("Impressions")
    @Expose
    private Integer impressions;
    @SerializedName("Clicks")
    @Expose
    private Integer clicks;

    public Integer getImpressions() {
        return impressions;
    }

    public void setImpressions(Integer impressions) {
        this.impressions = impressions;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

}
