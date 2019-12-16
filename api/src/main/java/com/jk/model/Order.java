package com.jk.model;

import java.util.Date;

public class Order {
    private Integer orderid;

    private String scenicname;

    private Integer scenicprice;

    private Date ordertime;

    private String scenicsite;

    private Integer ordernumber;

    private String orderstate;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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

    public Integer getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(String orderstate) {
        this.orderstate = orderstate == null ? null : orderstate.trim();
    }
}