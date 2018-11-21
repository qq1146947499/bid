package com.bid.springcloud.entities;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CoUser {


    @Override
    public String toString() {
        return "CoUser{" +
                "userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userPass='" + userPass + '\'' +
                ", realName='" + realName + '\'' +
                ", userType='" + userType + '\'' +
                ", status='" + status + '\'' +
                ", officePhone='" + officePhone + '\'' +
                ", personPhone='" + personPhone + '\'' +
                ", email='" + email + '\'' +
                ", lastLogintime=" + lastLogintime +
                ", collegeId='" + collegeId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", regTime=" + regTime +
                ", auditor='" + auditor + '\'' +
                ", auditorTime=" + auditorTime +
                ", applyPriv='" + applyPriv + '\'' +
                ", applyOneself='" + applyOneself + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", createUserid='" + createUserid + '\'' +
                ", createUsername='" + createUsername + '\'' +
                ", isDxCenter='" + isDxCenter + '\'' +
                ", isDxCollege='" + isDxCollege + '\'' +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", lastUpdateUserid='" + lastUpdateUserid + '\'' +
                ", lastUpdateUsername='" + lastUpdateUsername + '\'' +
                '}';
    }

    private Integer userId;

    private String userAccount;

    private String userPass;

    private String realName;

    /**
     * SUPER
     */
    private String userType;

    /**
     * 0:
     */
    private String status;

    private String officePhone;

    private String personPhone;

    private String email;

    private Date lastLogintime;

    private String collegeId;

    private String departmentId;

    /**
     * ע
     */
    private Date regTime;

    private String auditor;

    private Date auditorTime;

    private String applyPriv;

    private String applyOneself;

    private String remark;

    private Date createTime;

    private String createUserid;

    private String createUsername;

    /**
     * Y:
     */
    private String isDxCenter;

    /**
     * Y:
     */
    private String isDxCollege;

    private String lastUpdateTime;

    private String lastUpdateUserid;

    private String lastUpdateUsername;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone == null ? null : officePhone.trim();
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone == null ? null : personPhone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(Date lastLogintime) {
        this.lastLogintime = lastLogintime;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getAuditorTime() {
        return auditorTime;
    }

    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
    }

    public String getApplyPriv() {
        return applyPriv;
    }

    public void setApplyPriv(String applyPriv) {
        this.applyPriv = applyPriv == null ? null : applyPriv.trim();
    }

    public String getApplyOneself() {
        return applyOneself;
    }

    public void setApplyOneself(String applyOneself) {
        this.applyOneself = applyOneself == null ? null : applyOneself.trim();
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

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime == null ? null : lastUpdateTime.trim();
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