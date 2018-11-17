package com.bid.springcloud.entities;

import java.util.Date;

/**
 * У
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CoCompus {
    private Integer compusId;

    /**
     * У
     */
    private String collegeId;

    /**
     * У
     */
    private String compusName;

    private String remark;

    private Date createTime;

    private String createUserid;

    public Integer getCompusId() {
        return compusId;
    }

    public void setCompusId(Integer compusId) {
        this.compusId = compusId;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getCompusName() {
        return compusName;
    }

    public void setCompusName(String compusName) {
        this.compusName = compusName == null ? null : compusName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid == null ? null : createUserid.trim();
    }
}