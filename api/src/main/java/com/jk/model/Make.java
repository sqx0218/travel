package com.jk.model;

import java.util.Date;

public class Make {
    private Integer makeid;

    private String scenicname;

    private Integer scenicprice;

    private String scenicsite;

    private Date maketime;

    private String state;

    public Integer getMakeid() {
        return makeid;
    }

    public void setMakeid(Integer makeid) {
        this.makeid = makeid;
    }

    public String getScenicname() {
        return scenicname;
    }

    public void setScenicname(String scenicname) {
        this.scenicname = scenicname == null ? null : scenicname.trim();
    }

    public Integer getScenicprice() {
        return scenicprice;
    }

    public void setScenicprice(Integer scenicprice) {
        this.scenicprice = scenicprice;
    }

    public String getScenicsite() {
        return scenicsite;
    }

    public void setScenicsite(String scenicsite) {
        this.scenicsite = scenicsite == null ? null : scenicsite.trim();
    }

    public Date getMaketime() {
        return maketime;
    }

    public void setMaketime(Date maketime) {
        this.maketime = maketime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}