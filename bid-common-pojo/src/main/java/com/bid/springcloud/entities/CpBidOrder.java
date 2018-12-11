package com.bid.springcloud.entities;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CpBidOrder {
    private Integer bidInfoId;

    private String detailId;

    private String orderMainId;

    /**
     * 1
     */
    private String orderBidType;

    private String sourceCollegeId;

    private String sourceCompanyId;

    private Integer deviceId;

    @NotBlank(message="价格不能为空")
    private String bidPrice;

    private String totalAmount;

    private String totalAmountRenminbi;

    private String afterService;

    /**
     * N
     */
    private String isFulfil;

    private String diffrencesDesc;

    private String bidPerson;

    private String bidUserId;

    private String companyId;

    private String companyName;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String bidTime;

    /**
     * N
     */
    private String bidStatus;

    /**
     * ѡ
     */
    private String bidReason;

    @DateTimeFormat(pattern="yyyy-MM-dd")
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

    /**
     * Y
     */
    private String isInquire;

    private String celNum;

    private String eccNum;

    private String nodeReason;

    private String warrantyPeriod;

    public Integer getBidInfoId() {
        return bidInfoId;
    }

    public void setBidInfoId(Integer bidInfoId) {
        this.bidInfoId = bidInfoId;
    }

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    public String getOrderMainId() {
        return orderMainId;
    }

    public void setOrderMainId(String orderMainId) {
        this.orderMainId = orderMainId == null ? null : orderMainId.trim();
    }

    public String getOrderBidType() {
        return orderBidType;
    }

    public void setOrderBidType(String orderBidType) {
        this.orderBidType = orderBidType == null ? null : orderBidType.trim();
    }

    public String getSourceCollegeId() {
        return sourceCollegeId;
    }

    public void setSourceCollegeId(String sourceCollegeId) {
        this.sourceCollegeId = sourceCollegeId == null ? null : sourceCollegeId.trim();
    }

    public String getSourceCompanyId() {
        return sourceCompanyId;
    }

    public void setSourceCompanyId(String sourceCompanyId) {
        this.sourceCompanyId = sourceCompanyId == null ? null : sourceCompanyId.trim();
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice == null ? null : bidPrice.trim();
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount == null ? null : totalAmount.trim();
    }

    public String getTotalAmountRenminbi() {
        return totalAmountRenminbi;
    }

    public void setTotalAmountRenminbi(String totalAmountRenminbi) {
        this.totalAmountRenminbi = totalAmountRenminbi == null ? null : totalAmountRenminbi.trim();
    }

    public String getAfterService() {
        return afterService;
    }

    public void setAfterService(String afterService) {
        this.afterService = afterService == null ? null : afterService.trim();
    }

    public String getIsFulfil() {
        return isFulfil;
    }

    public void setIsFulfil(String isFulfil) {
        this.isFulfil = isFulfil == null ? null : isFulfil.trim();
    }

    public String getDiffrencesDesc() {
        return diffrencesDesc;
    }

    public void setDiffrencesDesc(String diffrencesDesc) {
        this.diffrencesDesc = diffrencesDesc == null ? null : diffrencesDesc.trim();
    }

    public String getBidPerson() {
        return bidPerson;
    }

    public void setBidPerson(String bidPerson) {
        this.bidPerson = bidPerson == null ? null : bidPerson.trim();
    }

    public String getBidUserId() {
        return bidUserId;
    }

    public void setBidUserId(String bidUserId) {
        this.bidUserId = bidUserId == null ? null : bidUserId.trim();
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

    public String getBidTime() {
        return bidTime;
    }

    public void setBidTime(String bidTime) {
        this.bidTime = bidTime == null ? null : bidTime.trim();
    }

    public String getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(String bidStatus) {
        this.bidStatus = bidStatus == null ? null : bidStatus.trim();
    }

    public String getBidReason() {
        return bidReason;
    }

    public void setBidReason(String bidReason) {
        this.bidReason = bidReason == null ? null : bidReason.trim();
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

    public String getIsInquire() {
        return isInquire;
    }

    public void setIsInquire(String isInquire) {
        this.isInquire = isInquire == null ? null : isInquire.trim();
    }

    public String getCelNum() {
        return celNum;
    }

    public void setCelNum(String celNum) {
        this.celNum = celNum == null ? null : celNum.trim();
    }

    public String getEccNum() {
        return eccNum;
    }

    public void setEccNum(String eccNum) {
        this.eccNum = eccNum == null ? null : eccNum.trim();
    }

    public String getNodeReason() {
        return nodeReason;
    }

    public void setNodeReason(String nodeReason) {
        this.nodeReason = nodeReason == null ? null : nodeReason.trim();
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod == null ? null : warrantyPeriod.trim();
    }
}