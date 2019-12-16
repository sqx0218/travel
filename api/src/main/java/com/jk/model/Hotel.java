package com.jk.model;

public class Hotel {
    private Integer hotelid;

    private String hotelname;

    private String hotelsite;

    private String phone;

    private String hotelinfo;

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public String getHotelsite() {
        return hotelsite;
    }

    public void setHotelsite(String hotelsite) {
        this.hotelsite = hotelsite == null ? null : hotelsite.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getHotelinfo() {
        return hotelinfo;
    }

    public void setHotelinfo(String hotelinfo) {
        this.hotelinfo = hotelinfo == null ? null : hotelinfo.trim();
    }
}