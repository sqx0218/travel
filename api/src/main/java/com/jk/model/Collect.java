package com.jk.model;

public class Collect {
    private Integer collectid;

    private Integer usreid;

    private String scenicname;

    private Integer scenicprice;

    private String scenicsite;

    private String phone;

    private String regionalidentity;

    private String scenicfo;

    private String scenicphoto;

    public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
    }

    public Integer getUsreid() {
        return usreid;
    }

    public void setUsreid(Integer usreid) {
        this.usreid = usreid;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRegionalidentity() {
        return regionalidentity;
    }

    public void setRegionalidentity(String regionalidentity) {
        this.regionalidentity = regionalidentity == null ? null : regionalidentity.trim();
    }

    public String getScenicfo() {
        return scenicfo;
    }

    public void setScenicfo(String scenicfo) {
        this.scenicfo = scenicfo == null ? null : scenicfo.trim();
    }

    public String getScenicphoto() {
        return scenicphoto;
    }

    public void setScenicphoto(String scenicphoto) {
        this.scenicphoto = scenicphoto == null ? null : scenicphoto.trim();
    }
}