package com.bid.springcloud.entities;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class co_advance_endbid {
    private String advanceEndbidId;

    private Date advanceEndbidTime;

    private String applyReason;

    /**
     * ѧУID
     */
    private String collegeId;

    /**
     * ѧУ
     */
    private String collegeName;

    private String orderMainId;

    private String auditUserid;

    private String auditUsername;

    private String auditReason;

    private String auditStatus;

    private Date auditTime;

    private Date createTime;

    private String createUserid;

    private String createUsername;

    private String isDxCenter;

    private String isDxCollege;

    private Date lastUpdateTime;

    private String lastUpdateUserid;

    private String lastUpdateUsername;

    public String getAdvanceEndbidId() {
        return advanceEndbidId;
    }

    public void setAdvanceEndbidId(String advanceEndbidId) {
        this.advanceEndbidId = advanceEndbidId == null ? null : advanceEndbidId.trim();
    }

    public Date getAdvanceEndbidTime() {
        return advanceEndbidTime;
    }

    public void setAdvanceEndbidTime(Date advanceEndbidTime) {
        this.advanceEndbidTime = advanceEndbidTime;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getOrderMainId() {
        return orderMainId;
    }

    public void setOrderMainId(String orderMainId) {
        this.orderMainId = orderMainId == null ? null : orderMainId.trim();
    }

    public String getAuditUserid() {
        return auditUserid;
    }

    public void setAuditUserid(String auditUserid) {
        this.auditUserid = auditUserid == null ? null : auditUserid.trim();
    }

    public String getAuditUsername() {
        return auditUsername;
    }

    public void setAuditUsername(String auditUsername) {
        this.auditUsername = auditUsername == null ? null : auditUsername.trim();
    }

    public String getAuditReason() {
        return auditReason;
    }

    public void setAuditReason(String auditReason) {
        this.auditReason = auditReason == null ? null : auditReason.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
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

    public String getIsDxCenter() {
        return isDxCenter;
    }

    public void setIsDxCenter(String isDxCenter) {
        this.isDxCenter = isDxCenter == null ? null : isDxCenter.trim();
    }

    public String getIsDxCollege() {
        return isDxCollege;
    }

    public void setIsDxCollege(String isDxCollege) {
        this.isDxCollege = isDxCollege == null ? null : isDxCollege.trim();
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