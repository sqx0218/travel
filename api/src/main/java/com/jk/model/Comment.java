package com.jk.model;

import java.util.Date;

public class Comment {
    private Integer commentid;

    private Integer usreid;

    private String usreidinfo;

    private Integer scenicid;

    private String commentcount;

    private Date commenttime;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getUsreid() {
        return usreid;
    }

    public void setUsreid(Integer usreid) {
        this.usreid = usreid;
    }

    public String getUsreidinfo() {
        return usreidinfo;
    }

    public void setUsreidinfo(String usreidinfo) {
        this.usreidinfo = usreidinfo == null ? null : usreidinfo.trim();
    }

    public Integer getScenicid() {
        return scenicid;
    }

    public void setScenicid(Integer scenicid) {
        this.scenicid = scenicid;
    }

    public String getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(String commentcount) {
        this.commentcount = commentcount == null ? null : commentcount.trim();
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }
}