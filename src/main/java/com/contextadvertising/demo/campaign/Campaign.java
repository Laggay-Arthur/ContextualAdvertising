
package com.contextadvertising.demo.campaign;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Campaign {

    @SerializedName("TimeZone")
    @Expose
    private String timeZone;
    @SerializedName("StartDate")
    @Expose
    private String startDate;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("TimeTargeting")
    @Expose
    private TimeTargeting timeTargeting;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("EndDate")
    @Expose
    private Object endDate;
    @SerializedName("Statistics")
    @Expose
    private Statistics statistics;
    @SerializedName("NegativeKeywords")
    @Expose
    private NegativeKeywords negativeKeywords;
    @SerializedName("ClientInfo")
    @Expose
    private String clientInfo;
    @SerializedName("DailyBudget")
    @Expose
    private Object dailyBudget;
    @SerializedName("Funds")
    @Expose
    private Funds funds;
    @SerializedName("Status")
    @Expose
    private String status;

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TimeTargeting getTimeTargeting() {
        return timeTargeting;
    }

    public void setTimeTargeting(TimeTargeting timeTargeting) {
        this.timeTargeting = timeTargeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public NegativeKeywords getNegativeKeywords() {
        return negativeKeywords;
    }

    public void setNegativeKeywords(NegativeKeywords negativeKeywords) {
        this.negativeKeywords = negativeKeywords;
    }

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
    }

    public Object getDailyBudget() {
        return dailyBudget;
    }

    public void setDailyBudget(Object dailyBudget) {
        this.dailyBudget = dailyBudget;
    }

    public Funds getFunds() {
        return funds;
    }

    public void setFunds(Funds funds) {
        this.funds = funds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
