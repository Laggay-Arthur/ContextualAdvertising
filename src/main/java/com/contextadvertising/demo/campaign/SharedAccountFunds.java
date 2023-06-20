
package com.contextadvertising.demo.campaign;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class SharedAccountFunds {

    @SerializedName("Spend")
    @Expose
    private Integer spend;
    @SerializedName("Refund")
    @Expose
    private Integer refund;

    public Integer getSpend() {
        return spend;
    }

    public void setSpend(Integer spend) {
        this.spend = spend;
    }

    public Integer getRefund() {
        return refund;
    }

    public void setRefund(Integer refund) {
        this.refund = refund;
    }

}
