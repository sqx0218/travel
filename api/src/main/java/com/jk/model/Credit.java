package com.jk.model;

public class Credit {
    private Integer creditid;

    private Integer usreid;

    private String creditintrgral;

    public Integer getCreditid() {
        return creditid;
    }

    public void setCreditid(Integer creditid) {
        this.creditid = creditid;
    }

    public Integer getUsreid() {
        return usreid;
    }

    public void setUsreid(Integer usreid) {
        this.usreid = usreid;
    }

    public String getCreditintrgral() {
        return creditintrgral;
    }

    public void setCreditintrgral(String creditintrgral) {
        this.creditintrgral = creditintrgral == null ? null : creditintrgral.trim();
    }
}