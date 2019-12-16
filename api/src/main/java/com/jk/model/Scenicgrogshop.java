package com.jk.model;

public class Scenicgrogshop {
    private Integer id;

    private Integer scenicid;

    private Integer grogshopid;

    private String relative;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getScenicid() {
        return scenicid;
    }

    public void setScenicid(Integer scenicid) {
        this.scenicid = scenicid;
    }

    public Integer getGrogshopid() {
        return grogshopid;
    }

    public void setGrogshopid(Integer grogshopid) {
        this.grogshopid = grogshopid;
    }

    public String getRelative() {
        return relative;
    }

    public void setRelative(String relative) {
        this.relative = relative == null ? null : relative.trim();
    }
}