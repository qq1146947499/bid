package com.bid.springcloud.entities;

import java.util.Date;

/**
 * ƽ̨
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class PtRole {
    private Integer roleId;

    private String roleName;

    /**
     * Y
     */
    private String isCollegeDefsult;

    /**
     * Y
     */
    private String isFirstAudit;

    /**
     * Y
     */
    private String isSecondAudit;

    /**
     * Y
     */
    private String isCompany;

    /**
     * C
     */
    private String ptType;

    private Date createTime;

    private Integer createUserid;

    private String createUsername;

    /**
     * Y:
     */
    private String isDxCenter;

    /**
     * Y:
     */
    private String isDxCollege;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getIsCollegeDefsult() {
        return isCollegeDefsult;
    }

    public void setIsCollegeDefsult(String isCollegeDefsult) {
        this.isCollegeDefsult = isCollegeDefsult == null ? null : isCollegeDefsult.trim();
    }

    public String getIsFirstAudit() {
        return isFirstAudit;
    }

    public void setIsFirstAudit(String isFirstAudit) {
        this.isFirstAudit = isFirstAudit == null ? null : isFirstAudit.trim();
    }

    public String getIsSecondAudit() {
        return isSecondAudit;
    }

    public void setIsSecondAudit(String isSecondAudit) {
        this.isSecondAudit = isSecondAudit == null ? null : isSecondAudit.trim();
    }

    public String getIsCompany() {
        return isCompany;
    }

    public void setIsCompany(String isCompany) {
        this.isCompany = isCompany == null ? null : isCompany.trim();
    }

    public String getPtType() {
        return ptType;
    }

    public void setPtType(String ptType) {
        this.ptType = ptType == null ? null : ptType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
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
}