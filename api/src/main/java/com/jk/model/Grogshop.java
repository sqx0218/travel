package com.jk.model;

public class Grogshop {
    private Integer grogshopid;

    private String grogshopname;

    private String grogshopsite;

    private String phone;

    private String grogshopinfo;

    public Integer getGrogshopid() {
        return grogshopid;
    }

    public void setGrogshopid(Integer grogshopid) {
        this.grogshopid = grogshopid;
    }

    public String getGrogshopname() {
        return grogshopname;
    }

    public void setGrogshopname(String grogshopname) {
        this.grogshopname = grogshopname == null ? null : grogshopname.trim();
    }

    public String getGrogshopsite() {
        return grogshopsite;
    }

    public void setGrogshopsite(String grogshopsite) {
        this.grogshopsite = grogshopsite == null ? null : grogshopsite.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getGrogshopinfo() {
        return grogshopinfo;
    }

    public void setGrogshopinfo(String grogshopinfo) {
        this.grogshopinfo = grogshopinfo == null ? null : grogshopinfo.trim();
    }
}