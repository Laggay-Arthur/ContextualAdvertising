
package com.contextadvertising.demo.adgroup;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class NegativeKeywords {

    @SerializedName("Items")
    @Expose
    private List<String> items = null;

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

}
