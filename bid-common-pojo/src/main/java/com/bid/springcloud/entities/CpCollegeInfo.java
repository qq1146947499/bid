package com.bid.springcloud.entities;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CpCollegeInfo {
    private Integer collegeId;

    private String collegeCode;

    private String collegeName;

    private String logoPath;

    /**
     * ʡ
     */
    private String inProvince;

    private String inCity;

    private String auditCompany;

    /**
     * Y:
     */
    private String isRedution;

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

    private Integer sortNum8;

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeCode() {
        return collegeCode;
    }

    public void setCollegeCode(String collegeCode) {
        this.collegeCode = collegeCode == null ? null : collegeCode.trim();
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath == null ? null : logoPath.trim();
    }

    public String getInProvince() {
        return inProvince;
    }

    public void setInProvince(String inProvince) {
        this.inProvince = inProvince == null ? null : inProvince.trim();
    }

    public String getInCity() {
        return inCity;
    }

    public void setInCity(String inCity) {
        this.inCity = inCity == null ? null : inCity.trim();
    }

    public String getAuditCompany() {
        return auditCompany;
    }

    public void setAuditCompany(String auditCompany) {
        this.auditCompany = auditCompany == null ? null : auditCompany.trim();
    }

    public String getIsRedution() {
        return isRedution;
    }

    public void setIsRedution(String isRedution) {
        this.isRedution = isRedution == null ? null : isRedution.trim();
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

    public Integer getSortNum8() {
        return sortNum8;
    }

    public void setSortNum8(Integer sortNum8) {
        this.sortNum8 = sortNum8;
    }
}