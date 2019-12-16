package com.jk.model;

import java.util.Date;

public class Footprint {
    private Integer footprintid;

    private String scenicname;

    private Integer scenicprice;

    private Date ordertime;

    private String scenicsite;

    private Integer usreid;

    private String scenicphoto;

    public Integer getFootprintid() {
        return footprintid;
    }

    public void setFootprintid(Integer footprintid) {
        this.footprintid = footprintid;
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

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getScenicsite() {
        return scenicsite;
    }

    public void setScenicsite(String scenicsite) {
        this.scenicsite = scenicsite == null ? null : scenicsite.trim();
    }

    public Integer getUsreid() {
        return usreid;
    }

    public void setUsreid(Integer usreid) {
        this.usreid = usreid;
    }

    public String getScenicphoto() {
        return scenicphoto;
    }

    public void setScenicphoto(String scenicphoto) {
        this.scenicphoto = scenicphoto == null ? null : scenicphoto.trim();
    }
}