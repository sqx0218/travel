package com.jk.model;

public class Course {
    private Integer courseid;

    private String courseinfo;

    private String courseduration;

    private Integer courseprice;

    private String coursetitle;

    private String regionalidentity;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCourseinfo() {
        return courseinfo;
    }

    public void setCourseinfo(String courseinfo) {
        this.courseinfo = courseinfo == null ? null : courseinfo.trim();
    }

    public String getCourseduration() {
        return courseduration;
    }

    public void setCourseduration(String courseduration) {
        this.courseduration = courseduration == null ? null : courseduration.trim();
    }

    public Integer getCourseprice() {
        return courseprice;
    }

    public void setCourseprice(Integer courseprice) {
        this.courseprice = courseprice;
    }

    public String getCoursetitle() {
        return coursetitle;
    }

    public void setCoursetitle(String coursetitle) {
        this.coursetitle = coursetitle == null ? null : coursetitle.trim();
    }

    public String getRegionalidentity() {
        return regionalidentity;
    }

    public void setRegionalidentity(String regionalidentity) {
        this.regionalidentity = regionalidentity == null ? null : regionalidentity.trim();
    }
}