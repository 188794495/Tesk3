package com.pojo;

import java.util.Date;

/**
 * @author Administrator
 */
public class Banner {
    private Long id;

    private String bannerCover;

    private String editor;

    private String url;

    private Integer status;

    private Date creatTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBannerCover() {
        return bannerCover;
    }

    public void setBannerCover(String bannerCover) {
        this.bannerCover = bannerCover;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "id=" + id +
                ", bannerCover='" + bannerCover + '\'' +
                ", editor='" + editor + '\'' +
                ", url='" + url + '\'' +
                ", status=" + status +
                ", creatTime=" + creatTime +
                ", updateTime=" + updateTime +
                '}';
    }
}