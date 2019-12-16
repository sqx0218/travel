package com.jk.model;

import java.util.Date;

public class Touringparty {
    private Integer partyid;

    private String partyname;

    private Date gotime;

    private Date endtime;

    private Integer odysseystatus;

    private Integer typeid;

    public Integer getPartyid() {
        return partyid;
    }

    public void setPartyid(Integer partyid) {
        this.partyid = partyid;
    }

    public String getPartyname() {
        return partyname;
    }

    public void setPartyname(String partyname) {
        this.partyname = partyname == null ? null : partyname.trim();
    }

    public Date getGotime() {
        return gotime;
    }

    public void setGotime(Date gotime) {
        this.gotime = gotime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getOdysseystatus() {
        return odysseystatus;
    }

    public void setOdysseystatus(Integer odysseystatus) {
        this.odysseystatus = odysseystatus;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}