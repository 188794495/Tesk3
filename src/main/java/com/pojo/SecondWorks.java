package com.pojo;

import java.util.Date;
import java.util.List;

public class SecondWorks {
    private Long id;

    private String worksName;

    private String belongFirst;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String editor;

    private Long firstId;

    private List<FirstWorks> firstWorksList;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public Long getFirstId() {
        return firstId;
    }

    public void setFirstId(Long firstId) {
        this.firstId = firstId;
    }
}