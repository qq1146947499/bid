package com.bid.springcloud.entities;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CoOrderDmand {

    private String dmainId;

    private String orderMainId;


    private String collegeId;

    @NotBlank(message="申购主题不能为空")
    private String orderCode;

    private Integer deviceId;

    private Integer orderNum;


    private String unit;

    private String inquirePrice;

    private String priceCompany;

    private String isStandard;

    private String afterService;

    /**
     * 1
     */
    private String status3;

    private String initBidId;

    private String bidId;

    /**
     * Y
     */
    private String isCheapest;

    private String initTime;

    private String initUserId;

    private String initUsername;

    private String userInitReason;

    private String closeReason;

    private String companyId;

    private String companyName;

    private String bidPrice;

    private String bidAmount;

    private String bidAmountRenminbi;

    private Date deliverTime;

    private String deliverUserid;

    private String deliverUsername;

    private String deliverRemark;

    private Date receiveTime;

    private String receiveUserid;

    private String receiveRemark;

    private String receiveUsername;

    private Date acceptionTime;

    private String acceptionUserid;

    private String acceptionUsername;

    private String acceptionRemark;

    private Date registerTime;

    private String registerUserid;

    private String registerUsername;

    private String registerRemark;

    /**
     * Y
     */
    private String buyerIsAssessed;

    /**
     * Y
     */
    private String sellerIsAssessed;

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

    private Date lastUpdateTime;

    private String lastUpdateUserid;

    private String lastUpdateUsername;

    /**
     * Y:
     */
    private String isReaudit;

    private Date reAuditTime;

    private String reAuditUserid;

    private String reAuditUsername;

    private String reAuditReason;

    private String diffrencesDesc;

    private String isAutoSubmit;

    public String getDmainId() {
        return dmainId;
    }

    public void setDmainId(String dmainId) {
        this.dmainId = dmainId == null ? null : dmainId.trim();
    }

    public String getOrderMainId() {
        return orderMainId;
    }

    public void setOrderMainId(String orderMainId) {
        this.orderMainId = orderMainId == null ? null : orderMainId.trim();
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getInquirePrice() {
        return inquirePrice;
    }

    public void setInquirePrice(String inquirePrice) {
        this.inquirePrice = inquirePrice == null ? null : inquirePrice.trim();
    }

    public String getPriceCompany() {
        return priceCompany;
    }

    public void setPriceCompany(String priceCompany) {
        this.priceCompany = priceCompany == null ? null : priceCompany.trim();
    }

    public String getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(String isStandard) {
        this.isStandard = isStandard == null ? null : isStandard.trim();
    }

    public String getAfterService() {
        return afterService;
    }

    public void setAfterService(String afterService) {
        this.afterService = afterService == null ? null : afterService.trim();
    }

    public String getStatus3() {
        return status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3 == null ? null : status3.trim();
    }

    public String getInitBidId() {
        return initBidId;
    }

    public void setInitBidId(String initBidId) {
        this.initBidId = initBidId == null ? null : initBidId.trim();
    }

    public String getBidId() {
        return bidId;
    }

    public void setBidId(String bidId) {
        this.bidId = bidId == null ? null : bidId.trim();
    }

    public String getIsCheapest() {
        return isCheapest;
    }

    public void setIsCheapest(String isCheapest) {
        this.isCheapest = isCheapest == null ? null : isCheapest.trim();
    }

    public String getInitTime() {
        return initTime;
    }

    public void setInitTime(String initTime) {
        this.initTime = initTime == null ? null : initTime.trim();
    }

    public String getInitUserId() {
        return initUserId;
    }

    public void setInitUserId(String initUserId) {
        this.initUserId = initUserId == null ? null : initUserId.trim();
    }

    public String getInitUsername() {
        return initUsername;
    }

    public void setInitUsername(String initUsername) {
        this.initUsername = initUsername == null ? null : initUsername.trim();
    }

    public String getUserInitReason() {
        return userInitReason;
    }

    public void setUserInitReason(String userInitReason) {
        this.userInitReason = userInitReason == null ? null : userInitReason.trim();
    }

    public String getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason == null ? null : closeReason.trim();
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

    public String getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice == null ? null : bidPrice.trim();
    }

    public String getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(String bidAmount) {
        this.bidAmount = bidAmount == null ? null : bidAmount.trim();
    }

    public String getBidAmountRenminbi() {
        return bidAmountRenminbi;
    }

    public void setBidAmountRenminbi(String bidAmountRenminbi) {
        this.bidAmountRenminbi = bidAmountRenminbi == null ? null : bidAmountRenminbi.trim();
    }

    public Date getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Date deliverTime) {
        this.deliverTime = deliverTime;
    }

    public String getDeliverUserid() {
        return deliverUserid;
    }

    public void setDeliverUserid(String deliverUserid) {
        this.deliverUserid = deliverUserid == null ? null : deliverUserid.trim();
    }

    public String getDeliverUsername() {
        return deliverUsername;
    }

    public void setDeliverUsername(String deliverUsername) {
        this.deliverUsername = deliverUsername == null ? null : deliverUsername.trim();
    }

    public String getDeliverRemark() {
        return deliverRemark;
    }

    public void setDeliverRemark(String deliverRemark) {
        this.deliverRemark = deliverRemark == null ? null : deliverRemark.trim();
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getReceiveUserid() {
        return receiveUserid;
    }

    public void setReceiveUserid(String receiveUserid) {
        this.receiveUserid = receiveUserid == null ? null : receiveUserid.trim();
    }

    public String getReceiveRemark() {
        return receiveRemark;
    }

    public void setReceiveRemark(String receiveRemark) {
        this.receiveRemark = receiveRemark == null ? null : receiveRemark.trim();
    }

    public String getReceiveUsername() {
        return receiveUsername;
    }

    public void setReceiveUsername(String receiveUsername) {
        this.receiveUsername = receiveUsername == null ? null : receiveUsername.trim();
    }

    public Date getAcceptionTime() {
        return acceptionTime;
    }

    public void setAcceptionTime(Date acceptionTime) {
        this.acceptionTime = acceptionTime;
    }

    public String getAcceptionUserid() {
        return acceptionUserid;
    }

    public void setAcceptionUserid(String acceptionUserid) {
        this.acceptionUserid = acceptionUserid == null ? null : acceptionUserid.trim();
    }

    public String getAcceptionUsername() {
        return acceptionUsername;
    }

    public void setAcceptionUsername(String acceptionUsername) {
        this.acceptionUsername = acceptionUsername == null ? null : acceptionUsername.trim();
    }

    public String getAcceptionRemark() {
        return acceptionRemark;
    }

    public void setAcceptionRemark(String acceptionRemark) {
        this.acceptionRemark = acceptionRemark == null ? null : acceptionRemark.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterUserid() {
        return registerUserid;
    }

    public void setRegisterUserid(String registerUserid) {
        this.registerUserid = registerUserid == null ? null : registerUserid.trim();
    }

    public String getRegisterUsername() {
        return registerUsername;
    }

    public void setRegisterUsername(String registerUsername) {
        this.registerUsername = registerUsername == null ? null : registerUsername.trim();
    }

    public String getRegisterRemark() {
        return registerRemark;
    }

    public void setRegisterRemark(String registerRemark) {
        this.registerRemark = registerRemark == null ? null : registerRemark.trim();
    }

    public String getBuyerIsAssessed() {
        return buyerIsAssessed;
    }

    public void setBuyerIsAssessed(String buyerIsAssessed) {
        this.buyerIsAssessed = buyerIsAssessed == null ? null : buyerIsAssessed.trim();
    }

    public String getSellerIsAssessed() {
        return sellerIsAssessed;
    }

    public void setSellerIsAssessed(String sellerIsAssessed) {
        this.sellerIsAssessed = sellerIsAssessed == null ? null : sellerIsAssessed.trim();
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

    public String getIsReaudit() {
        return isReaudit;
    }

    public void setIsReaudit(String isReaudit) {
        this.isReaudit = isReaudit == null ? null : isReaudit.trim();
    }

    public Date getReAuditTime() {
        return reAuditTime;
    }

    public void setReAuditTime(Date reAuditTime) {
        this.reAuditTime = reAuditTime;
    }

    public String getReAuditUserid() {
        return reAuditUserid;
    }

    public void setReAuditUserid(String reAuditUserid) {
        this.reAuditUserid = reAuditUserid == null ? null : reAuditUserid.trim();
    }

    public String getReAuditUsername() {
        return reAuditUsername;
    }

    public void setReAuditUsername(String reAuditUsername) {
        this.reAuditUsername = reAuditUsername == null ? null : reAuditUsername.trim();
    }

    public String getReAuditReason() {
        return reAuditReason;
    }

    public void setReAuditReason(String reAuditReason) {
        this.reAuditReason = reAuditReason == null ? null : reAuditReason.trim();
    }

    public String getDiffrencesDesc() {
        return diffrencesDesc;
    }

    public void setDiffrencesDesc(String diffrencesDesc) {
        this.diffrencesDesc = diffrencesDesc == null ? null : diffrencesDesc.trim();
    }

    public String getIsAutoSubmit() {
        return isAutoSubmit;
    }

    public void setIsAutoSubmit(String isAutoSubmit) {
        this.isAutoSubmit = isAutoSubmit == null ? null : isAutoSubmit.trim();
    }
}