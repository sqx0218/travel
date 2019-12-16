package com.jk.model;

public class Scenicinfo {
    private Integer scenicinfoid;

    private String scenicfo;

    private String scenicphoto;

    public Integer getScenicinfoid() {
        return scenicinfoid;
    }

    public void setScenicinfoid(Integer scenicinfoid) {
        this.scenicinfoid = scenicinfoid;
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