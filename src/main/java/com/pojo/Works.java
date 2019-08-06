package com.pojo;

import java.util.Date;

public class Works {
    private Long id;

    private String worksName;

    private String belongFirst;

    private String belongSecond;

    private Integer status;

    private Date creatTime;

    private Date updateTime;

    private String editor;

    private Long secondId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorksName() {
        return worksName;
    }

    public void setWorksName(String worksName) {
        this.worksName = worksName == null ? null : worksName.trim();
    }

    public String getBelongFirst() {
        return belongFirst;
    }

    public void setBelongFirst(String belongFirst) {
        this.belongFirst = belongFirst == null ? null : belongFirst.trim();
    }

    public String getBelongSecond() {
        return belongSecond;
    }

    public void setBelongSecond(String belongSecond) {
        this.belongSecond = belongSecond == null ? null : belongSecond.trim();
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

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Long getSecondId() {
        return secondId;
    }

    public void setSecondId(Long secondId) {
        this.secondId = secondId;
    }
}