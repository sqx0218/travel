package com.jk.model;

public class Tour {
    private Integer tourid;

    private String tourname;

    private String toursex;

    private String tourphone;

    private String tournumber;

    public Integer getTourid() {
        return tourid;
    }

    public void setTourid(Integer tourid) {
        this.tourid = tourid;
    }

    public String getTourname() {
        return tourname;
    }

    public void setTourname(String tourname) {
        this.tourname = tourname == null ? null : tourname.trim();
    }

    public String getToursex() {
        return toursex;
    }

    public void setToursex(String toursex) {
        this.toursex = toursex == null ? null : toursex.trim();
    }

    public String getTourphone() {
        return tourphone;
    }

    public void setTourphone(String tourphone) {
        this.tourphone = tourphone == null ? null : tourphone.trim();
    }

    public String getTournumber() {
        return tournumber;
    }

    public void setTournumber(String tournumber) {
        this.tournumber = tournumber == null ? null : tournumber.trim();
    }
}