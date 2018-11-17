package com.bid.springcloud.entities;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CpCompanyInfo {
    private Integer companyId;

    private String regResourceId;

    private String companyName;

    private String companyAbstract;

    private String address;

    private String inProvince;

    private String inCity;

    private String juridicalPerson;

    private String certificateType;

    /**
     * ֤
     */
    private String certificateCode;

    /**
     * Ӫҵִ
     */
    private String registrationCode;

    /**
     * 0
     */
    private String status;

    /**
     * 0
     */
    private String bidRight;

    private String email;

    private String authorizedBidder;

    private String authorizedBidderTel;

    private String authorizedEmail;

    /**
     * ָ
     */
    private String auditCollegeId;

    /**
     * Y
     */
    private String isRecommend;

    private String remark;

    /**
     * Y:
     */
    private String isDxCenter;

    /**
     * Y:
     */
    private String isDxCollege;

    /**
     * ע
     */
    private String registCapital;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getRegResourceId() {
        return regResourceId;
    }

    public void setRegResourceId(String regResourceId) {
        this.regResourceId = regResourceId == null ? null : regResourceId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyAbstract() {
        return companyAbstract;
    }

    public void setCompanyAbstract(String companyAbstract) {
        this.companyAbstract = companyAbstract == null ? null : companyAbstract.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getJuridicalPerson() {
        return juridicalPerson;
    }

    public void setJuridicalPerson(String juridicalPerson) {
        this.juridicalPerson = juridicalPerson == null ? null : juridicalPerson.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getCertificateCode() {
        return certificateCode;
    }

    public void setCertificateCode(String certificateCode) {
        this.certificateCode = certificateCode == null ? null : certificateCode.trim();
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode == null ? null : registrationCode.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBidRight() {
        return bidRight;
    }

    public void setBidRight(String bidRight) {
        this.bidRight = bidRight == null ? null : bidRight.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAuthorizedBidder() {
        return authorizedBidder;
    }

    public void setAuthorizedBidder(String authorizedBidder) {
        this.authorizedBidder = authorizedBidder == null ? null : authorizedBidder.trim();
    }

    public String getAuthorizedBidderTel() {
        return authorizedBidderTel;
    }

    public void setAuthorizedBidderTel(String authorizedBidderTel) {
        this.authorizedBidderTel = authorizedBidderTel == null ? null : authorizedBidderTel.trim();
    }

    public String getAuthorizedEmail() {
        return authorizedEmail;
    }

    public void setAuthorizedEmail(String authorizedEmail) {
        this.authorizedEmail = authorizedEmail == null ? null : authorizedEmail.trim();
    }

    public String getAuditCollegeId() {
        return auditCollegeId;
    }

    public void setAuditCollegeId(String auditCollegeId) {
        this.auditCollegeId = auditCollegeId == null ? null : auditCollegeId.trim();
    }

    public String getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(String isRecommend) {
        this.isRecommend = isRecommend == null ? null : isRecommend.trim();
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

    public String getRegistCapital() {
        return registCapital;
    }

    public void setRegistCapital(String registCapital) {
        this.registCapital = registCapital == null ? null : registCapital.trim();
    }
}