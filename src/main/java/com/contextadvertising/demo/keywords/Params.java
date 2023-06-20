package com.contextadvertising.demo.keywords;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Params {
    @SerializedName("SelectionCriteria")
    public keyWordsSelectionCriteria keyWordsSelectionCriteria;
    public ArrayList<String> FieldNames;

    public Params(ArrayList<String> fieldNames) {
        FieldNames = fieldNames;
    }

    public Params(keyWordsSelectionCriteria selCriteria, ArrayList<String> fieldNames) {
        keyWordsSelectionCriteria = selCriteria;
        FieldNames = fieldNames;
    }
}
