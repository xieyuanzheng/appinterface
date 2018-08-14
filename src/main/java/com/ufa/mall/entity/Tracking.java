package com.ufa.mall.entity;

import javax.persistence.*;
import java.sql.Timestamp;

//@Entity
public class Tracking {
    private int id;
    private Integer number;
    private String date;
    private String feedbackman;
    private String feedbackdept;
    private String feedbacktype;
    private String item;
    private String module;
    private String description;
    private String reason;
    private String followman;
    private String followresult;
    private String chandaono;
    private String remark;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "number")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "feedbackman")
    public String getFeedbackman() {
        return feedbackman;
    }

    public void setFeedbackman(String feedbackman) {
        this.feedbackman = feedbackman;
    }

    @Basic
    @Column(name = "feedbackdept")
    public String getFeedbackdept() {
        return feedbackdept;
    }

    public void setFeedbackdept(String feedbackdept) {
        this.feedbackdept = feedbackdept;
    }

    @Basic
    @Column(name = "feedbacktype")
    public String getFeedbacktype() {
        return feedbacktype;
    }

    public void setFeedbacktype(String feedbacktype) {
        this.feedbacktype = feedbacktype;
    }

    @Basic
    @Column(name = "item")
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Basic
    @Column(name = "module")
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "followman")
    public String getFollowman() {
        return followman;
    }

    public void setFollowman(String followman) {
        this.followman = followman;
    }

    @Basic
    @Column(name = "followresult")
    public String getFollowresult() {
        return followresult;
    }

    public void setFollowresult(String followresult) {
        this.followresult = followresult;
    }

    @Basic
    @Column(name = "chandaono")
    public String getChandaono() {
        return chandaono;
    }

    public void setChandaono(String chandaono) {
        this.chandaono = chandaono;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tracking tracking = (Tracking) o;

        if (id != tracking.id) return false;
        if (number != null ? !number.equals(tracking.number) : tracking.number != null) return false;
        if (date != null ? !date.equals(tracking.date) : tracking.date != null) return false;
        if (feedbackman != null ? !feedbackman.equals(tracking.feedbackman) : tracking.feedbackman != null)
            return false;
        if (feedbackdept != null ? !feedbackdept.equals(tracking.feedbackdept) : tracking.feedbackdept != null)
            return false;
        if (feedbacktype != null ? !feedbacktype.equals(tracking.feedbacktype) : tracking.feedbacktype != null)
            return false;
        if (item != null ? !item.equals(tracking.item) : tracking.item != null) return false;
        if (module != null ? !module.equals(tracking.module) : tracking.module != null) return false;
        if (description != null ? !description.equals(tracking.description) : tracking.description != null)
            return false;
        if (reason != null ? !reason.equals(tracking.reason) : tracking.reason != null) return false;
        if (followman != null ? !followman.equals(tracking.followman) : tracking.followman != null) return false;
        if (followresult != null ? !followresult.equals(tracking.followresult) : tracking.followresult != null)
            return false;
        if (chandaono != null ? !chandaono.equals(tracking.chandaono) : tracking.chandaono != null) return false;
        if (remark != null ? !remark.equals(tracking.remark) : tracking.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (feedbackman != null ? feedbackman.hashCode() : 0);
        result = 31 * result + (feedbackdept != null ? feedbackdept.hashCode() : 0);
        result = 31 * result + (feedbacktype != null ? feedbacktype.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (module != null ? module.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (followman != null ? followman.hashCode() : 0);
        result = 31 * result + (followresult != null ? followresult.hashCode() : 0);
        result = 31 * result + (chandaono != null ? chandaono.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
