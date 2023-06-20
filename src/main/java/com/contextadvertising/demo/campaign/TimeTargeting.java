
package com.contextadvertising.demo.campaign;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class TimeTargeting {

    @SerializedName("ConsiderWorkingWeekends")
    @Expose
    private String considerWorkingWeekends;
    @SerializedName("Schedule")
    @Expose
    private Schedule schedule;
    @SerializedName("HolidaysSchedule")
    @Expose
    private Object holidaysSchedule;

    public String getConsiderWorkingWeekends() {
        return considerWorkingWeekends;
    }

    public void setConsiderWorkingWeekends(String considerWorkingWeekends) {
        this.considerWorkingWeekends = considerWorkingWeekends;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Object getHolidaysSchedule() {
        return holidaysSchedule;
    }

    public void setHolidaysSchedule(Object holidaysSchedule) {
        this.holidaysSchedule = holidaysSchedule;
    }

}
