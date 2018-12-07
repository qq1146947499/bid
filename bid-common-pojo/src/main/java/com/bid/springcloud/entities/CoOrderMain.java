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
public class CoOrderMain {



    private Integer orderMainId;



    private String orderCode;

    @NotBlank(message="申购主题不能为空")
    private String orderTitle;

    private String deviceType;

    private String foundsSubject;

    private String foundsCode;

    /**
     * ʹ
     */
    private String usingCorrency;

    private String isDeliver;




    @DateTimeFormat(pattern="yyyy-MM-dd")
    private String deliverTime;


    private String isTax;

    private String isInvoice;

    private String deliverPlace;

    private String isImplemented;

    private String budget;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String adviceExpiredTime;

    /**
     * 1:
     */
    private String orderType;

    /**
     * 1
     */

    private String currentProcee;

    /**
     * 1
     */

    private String orderStatus;

    /**
     * Y:
     */
    private String isAdvanceEndbid;

    private String collegeId;

    private String collegeName;

    private String departmentId;

    private String orderUnit;

    private String orderPerson;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String orderTime;

    private String personPhone;


    private String itemNum;

    private String orderTotalAmount;

    private String readCount;

    private String bidCount;


    private String orderProcess;


    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startBidtime;


    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endBidtime;

    private String auditSuggestion;

    private String auditUserid;

    private String auditUsername;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date auditTime;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastEndBidtime;

    private String isExtend;

    private String extendBidReason;

    private String extendUserid;

    private String extendUsername;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String chooseTime;

    private String chooseOption;

    private String chooseReason;

    private String chooseUserId;

    private String chooseUserName;

    /**
     * һ
     */

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date firstTime;

    /**
     * Y
     */
    private String firstAudit;

    private String firstAuditReason;

    /**
     * һ
     */
    private String firstAuditUserId;

    /**
     * һ
     */
    private String firstAuditUserName;

    /**
     * Y
     */
    private String secondAudit;

    private String secondAuditReason;

    private String secondAuditUserId;

    private String secondAuditUserName;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String secondTime;

    private String bidAmount;

    private String bidAmountRenminbi;

    /**
     * Y
     */
    private String isPublishBidresult;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date publishBidresultTime;

    private String publishBidresultUserid;

    private String publishBidresultUsername;

    /**
     * Y
     */
    private String bidFinished;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date stopBidTime;

    private String stopBidReason;

    private String stopBidUserid;

    private String stopBidUsername;


    private String remark;


    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
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

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lastUpdateTime;

    private String lastUpdateUserid;

    private String lastUpdateUsername;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reAuditTime;

    private String reAuditUserid;

    private String reAuditUsername;

    private String reAuditReason;

    /**
     * Y:
     */
    private String isReaudit;

    /**
     * ȷ
     */
    private String confNum;

    private String agentUserId;

    private String agentUserName;

    private String agentRealName;


    private String payType;

    private String invoiceType;

    private String deliverType;

    private String transportType;

    private String installationgSite;


    private String packLevel;

    private String accpetanceLevel;

    private String isFinanceAudit;

    private String financeAuditUserId;

    private String financeAuditUserName;

    private String financeAuditReason;

    private String isAutoSubmit;

    private String pauseReason;

    private String winningPrinciple;

    public Integer getOrderMainId() {
        return orderMainId;
    }

    public void setOrderMainId(Integer orderMainId) {
        this.orderMainId = orderMainId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderTitle() {
        return orderTitle;
    }

    public void setOrderTitle(String orderTitle) {
        this.orderTitle = orderTitle == null ? null : orderTitle.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getFoundsSubject() {
        return foundsSubject;
    }

    public void setFoundsSubject(String foundsSubject) {
        this.foundsSubject = foundsSubject == null ? null : foundsSubject.trim();
    }

    public String getFoundsCode() {
        return foundsCode;
    }

    public void setFoundsCode(String foundsCode) {
        this.foundsCode = foundsCode == null ? null : foundsCode.trim();
    }

    public String getUsingCorrency() {
        return usingCorrency;
    }

    public void setUsingCorrency(String usingCorrency) {
        this.usingCorrency = usingCorrency == null ? null : usingCorrency.trim();
    }

    public String getIsDeliver() {
        return isDeliver;
    }

    public void setIsDeliver(String isDeliver) {
        this.isDeliver = isDeliver == null ? null : isDeliver.trim();
    }

    public String getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime == null ? null : deliverTime.trim();
    }

    public String getIsTax() {
        return isTax;
    }

    public void setIsTax(String isTax) {
        this.isTax = isTax == null ? null : isTax.trim();
    }

    public String getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(String isInvoice) {
        this.isInvoice = isInvoice == null ? null : isInvoice.trim();
    }

    public String getDeliverPlace() {
        return deliverPlace;
    }

    public void setDeliverPlace(String deliverPlace) {
        this.deliverPlace = deliverPlace == null ? null : deliverPlace.trim();
    }

    public String getIsImplemented() {
        return isImplemented;
    }

    public void setIsImplemented(String isImplemented) {
        this.isImplemented = isImplemented == null ? null : isImplemented.trim();
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget == null ? null : budget.trim();
    }

    public String getAdviceExpiredTime() {
        return adviceExpiredTime;
    }

    public void setAdviceExpiredTime(String adviceExpiredTime) {
        this.adviceExpiredTime = adviceExpiredTime == null ? null : adviceExpiredTime.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getCurrentProcee() {
        return currentProcee;
    }

    public void setCurrentProcee(String currentProcee) {
        this.currentProcee = currentProcee == null ? null : currentProcee.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getIsAdvanceEndbid() {
        return isAdvanceEndbid;
    }

    public void setIsAdvanceEndbid(String isAdvanceEndbid) {
        this.isAdvanceEndbid = isAdvanceEndbid == null ? null : isAdvanceEndbid.trim();
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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getOrderUnit() {
        return orderUnit;
    }

    public void setOrderUnit(String orderUnit) {
        this.orderUnit = orderUnit == null ? null : orderUnit.trim();
    }

    public String getOrderPerson() {
        return orderPerson;
    }

    public void setOrderPerson(String orderPerson) {
        this.orderPerson = orderPerson == null ? null : orderPerson.trim();
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime == null ? null : orderTime.trim();
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone == null ? null : personPhone.trim();
    }

    public String getItemNum() {
        return itemNum;
    }

    public void setItemNum(String itemNum) {
        this.itemNum = itemNum == null ? null : itemNum.trim();
    }

    public String getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(String orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount == null ? null : orderTotalAmount.trim();
    }

    public String getReadCount() {
        return readCount;
    }

    public void setReadCount(String readCount) {
        this.readCount = readCount == null ? null : readCount.trim();
    }

    public String getBidCount() {
        return bidCount;
    }

    public void setBidCount(String bidCount) {
        this.bidCount = bidCount == null ? null : bidCount.trim();
    }

    public String getOrderProcess() {
        return orderProcess;
    }

    public void setOrderProcess(String orderProcess) {
        this.orderProcess = orderProcess == null ? null : orderProcess.trim();
    }

    public Date getStartBidtime() {
        return startBidtime;
    }

    public void setStartBidtime(Date startBidtime) {
        this.startBidtime = startBidtime;
    }

    public Date getEndBidtime() {
        return endBidtime;
    }

    public void setEndBidtime(Date endBidtime) {
        this.endBidtime = endBidtime;
    }

    public String getAuditSuggestion() {
        return auditSuggestion;
    }

    public void setAuditSuggestion(String auditSuggestion) {
        this.auditSuggestion = auditSuggestion == null ? null : auditSuggestion.trim();
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

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getLastEndBidtime() {
        return lastEndBidtime;
    }

    public void setLastEndBidtime(Date lastEndBidtime) {
        this.lastEndBidtime = lastEndBidtime;
    }

    public String getIsExtend() {
        return isExtend;
    }

    public void setIsExtend(String isExtend) {
        this.isExtend = isExtend == null ? null : isExtend.trim();
    }

    public String getExtendBidReason() {
        return extendBidReason;
    }

    public void setExtendBidReason(String extendBidReason) {
        this.extendBidReason = extendBidReason == null ? null : extendBidReason.trim();
    }

    public String getExtendUserid() {
        return extendUserid;
    }

    public void setExtendUserid(String extendUserid) {
        this.extendUserid = extendUserid == null ? null : extendUserid.trim();
    }

    public String getExtendUsername() {
        return extendUsername;
    }

    public void setExtendUsername(String extendUsername) {
        this.extendUsername = extendUsername == null ? null : extendUsername.trim();
    }

    public String getChooseTime() {
        return chooseTime;
    }

    public void setChooseTime(String chooseTime) {
        this.chooseTime = chooseTime == null ? null : chooseTime.trim();
    }

    public String getChooseOption() {
        return chooseOption;
    }

    public void setChooseOption(String chooseOption) {
        this.chooseOption = chooseOption == null ? null : chooseOption.trim();
    }

    public String getChooseReason() {
        return chooseReason;
    }

    public void setChooseReason(String chooseReason) {
        this.chooseReason = chooseReason == null ? null : chooseReason.trim();
    }

    public String getChooseUserId() {
        return chooseUserId;
    }

    public void setChooseUserId(String chooseUserId) {
        this.chooseUserId = chooseUserId == null ? null : chooseUserId.trim();
    }

    public String getChooseUserName() {
        return chooseUserName;
    }

    public void setChooseUserName(String chooseUserName) {
        this.chooseUserName = chooseUserName == null ? null : chooseUserName.trim();
    }

    public Date getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(Date firstTime) {
        this.firstTime = firstTime;
    }

    public String getFirstAudit() {
        return firstAudit;
    }

    public void setFirstAudit(String firstAudit) {
        this.firstAudit = firstAudit == null ? null : firstAudit.trim();
    }

    public String getFirstAuditReason() {
        return firstAuditReason;
    }

    public void setFirstAuditReason(String firstAuditReason) {
        this.firstAuditReason = firstAuditReason == null ? null : firstAuditReason.trim();
    }

    public String getFirstAuditUserId() {
        return firstAuditUserId;
    }

    public void setFirstAuditUserId(String firstAuditUserId) {
        this.firstAuditUserId = firstAuditUserId == null ? null : firstAuditUserId.trim();
    }

    public String getFirstAuditUserName() {
        return firstAuditUserName;
    }

    public void setFirstAuditUserName(String firstAuditUserName) {
        this.firstAuditUserName = firstAuditUserName == null ? null : firstAuditUserName.trim();
    }

    public String getSecondAudit() {
        return secondAudit;
    }

    public void setSecondAudit(String secondAudit) {
        this.secondAudit = secondAudit == null ? null : secondAudit.trim();
    }

    public String getSecondAuditReason() {
        return secondAuditReason;
    }

    public void setSecondAuditReason(String secondAuditReason) {
        this.secondAuditReason = secondAuditReason == null ? null : secondAuditReason.trim();
    }

    public String getSecondAuditUserId() {
        return secondAuditUserId;
    }

    public void setSecondAuditUserId(String secondAuditUserId) {
        this.secondAuditUserId = secondAuditUserId == null ? null : secondAuditUserId.trim();
    }

    public String getSecondAuditUserName() {
        return secondAuditUserName;
    }

    public void setSecondAuditUserName(String secondAuditUserName) {
        this.secondAuditUserName = secondAuditUserName == null ? null : secondAuditUserName.trim();
    }

    public String getSecondTime() {
        return secondTime;
    }

    public void setSecondTime(String secondTime) {
        this.secondTime = secondTime == null ? null : secondTime.trim();
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

    public String getIsPublishBidresult() {
        return isPublishBidresult;
    }

    public void setIsPublishBidresult(String isPublishBidresult) {
        this.isPublishBidresult = isPublishBidresult == null ? null : isPublishBidresult.trim();
    }

    public Date getPublishBidresultTime() {
        return publishBidresultTime;
    }

    public void setPublishBidresultTime(Date publishBidresultTime) {
        this.publishBidresultTime = publishBidresultTime;
    }

    public String getPublishBidresultUserid() {
        return publishBidresultUserid;
    }

    public void setPublishBidresultUserid(String publishBidresultUserid) {
        this.publishBidresultUserid = publishBidresultUserid == null ? null : publishBidresultUserid.trim();
    }

    public String getPublishBidresultUsername() {
        return publishBidresultUsername;
    }

    public void setPublishBidresultUsername(String publishBidresultUsername) {
        this.publishBidresultUsername = publishBidresultUsername == null ? null : publishBidresultUsername.trim();
    }

    public String getBidFinished() {
        return bidFinished;
    }

    public void setBidFinished(String bidFinished) {
        this.bidFinished = bidFinished == null ? null : bidFinished.trim();
    }

    public Date getStopBidTime() {
        return stopBidTime;
    }

    public void setStopBidTime(Date stopBidTime) {
        this.stopBidTime = stopBidTime;
    }

    public String getStopBidReason() {
        return stopBidReason;
    }

    public void setStopBidReason(String stopBidReason) {
        this.stopBidReason = stopBidReason == null ? null : stopBidReason.trim();
    }

    public String getStopBidUserid() {
        return stopBidUserid;
    }

    public void setStopBidUserid(String stopBidUserid) {
        this.stopBidUserid = stopBidUserid == null ? null : stopBidUserid.trim();
    }

    public String getStopBidUsername() {
        return stopBidUsername;
    }

    public void setStopBidUsername(String stopBidUsername) {
        this.stopBidUsername = stopBidUsername == null ? null : stopBidUsername.trim();
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

    public String getIsReaudit() {
        return isReaudit;
    }

    public void setIsReaudit(String isReaudit) {
        this.isReaudit = isReaudit == null ? null : isReaudit.trim();
    }

    public String getConfNum() {
        return confNum;
    }

    public void setConfNum(String confNum) {
        this.confNum = confNum == null ? null : confNum.trim();
    }

    public String getAgentUserId() {
        return agentUserId;
    }

    public void setAgentUserId(String agentUserId) {
        this.agentUserId = agentUserId == null ? null : agentUserId.trim();
    }

    public String getAgentUserName() {
        return agentUserName;
    }

    public void setAgentUserName(String agentUserName) {
        this.agentUserName = agentUserName == null ? null : agentUserName.trim();
    }

    public String getAgentRealName() {
        return agentRealName;
    }

    public void setAgentRealName(String agentRealName) {
        this.agentRealName = agentRealName == null ? null : agentRealName.trim();
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getDeliverType() {
        return deliverType;
    }

    public void setDeliverType(String deliverType) {
        this.deliverType = deliverType == null ? null : deliverType.trim();
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType == null ? null : transportType.trim();
    }

    public String getInstallationgSite() {
        return installationgSite;
    }

    public void setInstallationgSite(String installationgSite) {
        this.installationgSite = installationgSite == null ? null : installationgSite.trim();
    }

    public String getPackLevel() {
        return packLevel;
    }

    public void setPackLevel(String packLevel) {
        this.packLevel = packLevel == null ? null : packLevel.trim();
    }

    public String getAccpetanceLevel() {
        return accpetanceLevel;
    }

    public void setAccpetanceLevel(String accpetanceLevel) {
        this.accpetanceLevel = accpetanceLevel == null ? null : accpetanceLevel.trim();
    }

    public String getIsFinanceAudit() {
        return isFinanceAudit;
    }

    public void setIsFinanceAudit(String isFinanceAudit) {
        this.isFinanceAudit = isFinanceAudit == null ? null : isFinanceAudit.trim();
    }

    public String getFinanceAuditUserId() {
        return financeAuditUserId;
    }

    public void setFinanceAuditUserId(String financeAuditUserId) {
        this.financeAuditUserId = financeAuditUserId == null ? null : financeAuditUserId.trim();
    }

    public String getFinanceAuditUserName() {
        return financeAuditUserName;
    }

    public void setFinanceAuditUserName(String financeAuditUserName) {
        this.financeAuditUserName = financeAuditUserName == null ? null : financeAuditUserName.trim();
    }

    public String getFinanceAuditReason() {
        return financeAuditReason;
    }

    public void setFinanceAuditReason(String financeAuditReason) {
        this.financeAuditReason = financeAuditReason == null ? null : financeAuditReason.trim();
    }

    public String getIsAutoSubmit() {
        return isAutoSubmit;
    }

    public void setIsAutoSubmit(String isAutoSubmit) {
        this.isAutoSubmit = isAutoSubmit == null ? null : isAutoSubmit.trim();
    }

    public String getPauseReason() {
        return pauseReason;
    }

    public void setPauseReason(String pauseReason) {
        this.pauseReason = pauseReason == null ? null : pauseReason.trim();
    }

    public String getWinningPrinciple() {
        return winningPrinciple;
    }

    public void setWinningPrinciple(String winningPrinciple) {
        this.winningPrinciple = winningPrinciple == null ? null : winningPrinciple.trim();
    }
}