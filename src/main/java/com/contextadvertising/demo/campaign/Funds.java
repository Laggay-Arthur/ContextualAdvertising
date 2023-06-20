
package com.contextadvertising.demo.campaign;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Funds {

    @SerializedName("Mode")
    @Expose
    private String mode;
    @SerializedName("SharedAccountFunds")
    @Expose
    private SharedAccountFunds sharedAccountFunds;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public SharedAccountFunds getSharedAccountFunds() {
        return sharedAccountFunds;
    }

    public void setSharedAccountFunds(SharedAccountFunds sharedAccountFunds) {
        this.sharedAccountFunds = sharedAccountFunds;
    }

}
