package com.jk.model;

public class Scenic {
    private Integer scenicid;

    private String scenicname;

    private Integer scenicprice;

    private String scenicsite;

    private String phone;

    private Integer scenicinfoid;

    public Integer getScenicid() {
        return scenicid;
    }

    public void setScenicid(Integer scenicid) {
        this.scenicid = scenicid;
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

    public Integer getScenicinfoid() {
        return scenicinfoid;
    }

    public void setScenicinfoid(Integer scenicinfoid) {
        this.scenicinfoid = scenicinfoid;
    }
}