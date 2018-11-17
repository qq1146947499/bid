package com.bid.springcloud.entities;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CpRegister {
    private String regResourceId;

    private String auditCollegeId;

    private String inviteCode;

    private String ainfoType;

    private String remark;

    private String isDxCenter;

    private String isDxCollege;

    public String getRegResourceId() {
        return regResourceId;
    }

    public void setRegResourceId(String regResourceId) {
        this.regResourceId = regResourceId == null ? null : regResourceId.trim();
    }

    public String getAuditCollegeId() {
        return auditCollegeId;
    }

    public void setAuditCollegeId(String auditCollegeId) {
        this.auditCollegeId = auditCollegeId == null ? null : auditCollegeId.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getAinfoType() {
        return ainfoType;
    }

    public void setAinfoType(String ainfoType) {
        this.ainfoType = ainfoType == null ? null : ainfoType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}