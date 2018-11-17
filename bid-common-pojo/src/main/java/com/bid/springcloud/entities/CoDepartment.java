package com.bid.springcloud.entities;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CoDepartment extends CoDepartmentKey {
    private Integer cpCollegeId;

    private String collegeId;

    private String remark;

    private Date createTime;

    private String createUserid;

    private String createUsername;

    /**
     * Y:
     */
    private String isDxCenter3;

    /**
     * Y:
     */
    private String isDxCollege3;

    private Date lastUpdateTime;

    private String lastUpdateUserid;

    private String lastUpdateUsername;

    public Integer getCpCollegeId() {
        return cpCollegeId;
    }

    public void setCpCollegeId(Integer cpCollegeId) {
        this.cpCollegeId = cpCollegeId;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
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

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername == null ? null : createUsername.trim();
    }

    public String getIsDxCenter3() {
        return isDxCenter3;
    }

    public void setIsDxCenter3(String isDxCenter3) {
        this.isDxCenter3 = isDxCenter3 == null ? null : isDxCenter3.trim();
    }

    public String getIsDxCollege3() {
        return isDxCollege3;
    }

    public void setIsDxCollege3(String isDxCollege3) {
        this.isDxCollege3 = isDxCollege3 == null ? null : isDxCollege3.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getLastUpdateUserid() {
        return lastUpdateUserid;
    }

    public void setLastUpdateUserid(String lastUpdateUserid) {
        this.lastUpdateUserid = lastUpdateUserid == null ? null : lastUpdateUserid.trim();
    }

    public String getLastUpdateUsername() {
        return lastUpdateUsername;
    }

    public void setLastUpdateUsername(String lastUpdateUsername) {
        this.lastUpdateUsername = lastUpdateUsername == null ? null : lastUpdateUsername.trim();
    }
}