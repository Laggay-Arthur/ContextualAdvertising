
package com.contextadvertising.demo.adgroup;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("AdGroups")
    @Expose
    private List<AdGroup> adGroups = null;

    public List<AdGroup> getAdGroups() {
        return adGroups;
    }

    public void setAdGroups(List<AdGroup> adGroups) {
        this.adGroups = adGroups;
    }

}
