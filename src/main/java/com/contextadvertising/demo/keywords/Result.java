
package com.contextadvertising.demo.keywords;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("Keywords")
    @Expose
    private List<KeyWord> Keywords = null;

    public List<KeyWord> getKeyWords() {
        return Keywords;
    }

    public void setAdGroups(List<KeyWord> keyWord) {
        this.Keywords = keyWord;
    }

}
