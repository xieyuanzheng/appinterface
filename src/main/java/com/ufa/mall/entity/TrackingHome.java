package com.ufa.mall.entity;

public class TrackingHome {
    private Tracking tracking;
    private String imgUrl;
    private String telephone;

    public Tracking getTracking() {
        return tracking;
    }

    public void setTracking(Tracking tracking) {
        this.tracking = tracking;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public TrackingHome() {
    }

    public TrackingHome(Tracking tracking, String imgUrl, String telephone) {
        this.tracking = tracking;
        this.imgUrl = imgUrl;
        this.telephone = telephone;
    }
}
