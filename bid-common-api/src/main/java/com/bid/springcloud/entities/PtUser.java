package com.bid.springcloud.entities;

import java.util.Date;

/**
 * ƽ̨
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class PtUser {
    private Integer userId;

    private String userName;

    private String realName;

    private String userPass;

    /**
     * C
     */
    private String userType;

    /**
     * Y
     */
    private String isSuper;

    /**
     * 0:
     */
    private String userStatus;

    private String personPhone;

    private Integer collegeId;

    /**
     * ѧУ
     */
    private String collegeName;

    private String companyId;

    private String companyName;

    private String coDepartmentId;

    private String departmentName;

    /**
     * У
     */
    private Integer compusId;

    /**
     * У
     */
    private String compusName;

    /**
     * ԺϵID
     */
    private Integer institueId;

    /**
     * Ժϵ
     */
    private String institueName;

    private String applyPriv;

    private String applyOneself;

    private String email;

    private Integer auditUserid;

    private String auditUsername;

    private Date auditorTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(String isSuper) {
        this.isSuper = isSuper == null ? null : isSuper.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone == null ? null : personPhone.trim();
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCoDepartmentId() {
        return coDepartmentId;
    }

    public void setCoDepartmentId(String coDepartmentId) {
        this.coDepartmentId = coDepartmentId == null ? null : coDepartmentId.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getCompusId() {
        return compusId;
    }

    public void setCompusId(Integer compusId) {
        this.compusId = compusId;
    }

    public String getCompusName() {
        return compusName;
    }

    public void setCompusName(String compusName) {
        this.compusName = compusName == null ? null : compusName.trim();
    }

    public Integer getInstitueId() {
        return institueId;
    }

    public void setInstitueId(Integer institueId) {
        this.institueId = institueId;
    }

    public String getInstitueName() {
        return institueName;
    }

    public void setInstitueName(String institueName) {
        this.institueName = institueName == null ? null : institueName.trim();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getAuditUserid() {
        return auditUserid;
    }

    public void setAuditUserid(Integer auditUserid) {
        this.auditUserid = auditUserid;
    }

    public String getAuditUsername() {
        return auditUsername;
    }

    public void setAuditUsername(String auditUsername) {
        this.auditUsername = auditUsername == null ? null : auditUsername.trim();
    }

    public Date getAuditorTime() {
        return auditorTime;
    }

    public void setAuditorTime(Date auditorTime) {
        this.auditorTime = auditorTime;
    }
}