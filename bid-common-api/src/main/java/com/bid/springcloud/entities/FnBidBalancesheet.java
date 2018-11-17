package com.bid.springcloud.entities;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class FnBidBalancesheet {
    private String balanceId;

    private String balanceCode;

    private String balanceAmount;

    private String chargingTime;

    /**
     * ʵ
     */
    private String realAmount;

    private String differenceAmout;

    private Date payEndtime;

    private String companyId;

    private String companyName;

    private String isPayed;

    /**
     * 1
     */
    private String paymentType;

    private Date payTime;

    private Date comfirmTime;

    /**
     * ȷ
     */
    private String comfirmUserid;

    /**
     * ȷ
     */
    private String comfirmUsername;

    private String companyComfirmPay;

    private String applyId;

    /**
     * Y
     */
    private String isInvoice;

    /**
     * Y
     */
    private String delStatus;

    private Date createTime;

    private String createUserid;

    private String createUsername;

    private String isDxCenter;

    private String isDxCollege;

    private Date lastUpdateTime;

    private String lastUpdateUserid;

    private String lastUpdateUsername;

    private Date chargeStartTime;

    private String chargeEndTime;

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId == null ? null : balanceId.trim();
    }

    public String getBalanceCode() {
        return balanceCode;
    }

    public void setBalanceCode(String balanceCode) {
        this.balanceCode = balanceCode == null ? null : balanceCode.trim();
    }

    public String getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = balanceAmount == null ? null : balanceAmount.trim();
    }

    public String getChargingTime() {
        return chargingTime;
    }

    public void setChargingTime(String chargingTime) {
        this.chargingTime = chargingTime == null ? null : chargingTime.trim();
    }

    public String getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(String realAmount) {
        this.realAmount = realAmount == null ? null : realAmount.trim();
    }

    public String getDifferenceAmout() {
        return differenceAmout;
    }

    public void setDifferenceAmout(String differenceAmout) {
        this.differenceAmout = differenceAmout == null ? null : differenceAmout.trim();
    }

    public Date getPayEndtime() {
        return payEndtime;
    }

    public void setPayEndtime(Date payEndtime) {
        this.payEndtime = payEndtime;
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

    public String getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(String isPayed) {
        this.isPayed = isPayed == null ? null : isPayed.trim();
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getComfirmTime() {
        return comfirmTime;
    }

    public void setComfirmTime(Date comfirmTime) {
        this.comfirmTime = comfirmTime;
    }

    public String getComfirmUserid() {
        return comfirmUserid;
    }

    public void setComfirmUserid(String comfirmUserid) {
        this.comfirmUserid = comfirmUserid == null ? null : comfirmUserid.trim();
    }

    public String getComfirmUsername() {
        return comfirmUsername;
    }

    public void setComfirmUsername(String comfirmUsername) {
        this.comfirmUsername = comfirmUsername == null ? null : comfirmUsername.trim();
    }

    public String getCompanyComfirmPay() {
        return companyComfirmPay;
    }

    public void setCompanyComfirmPay(String companyComfirmPay) {
        this.companyComfirmPay = companyComfirmPay == null ? null : companyComfirmPay.trim();
    }

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public String getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(String isInvoice) {
        this.isInvoice = isInvoice == null ? null : isInvoice.trim();
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus == null ? null : delStatus.trim();
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

    public Date getChargeStartTime() {
        return chargeStartTime;
    }

    public void setChargeStartTime(Date chargeStartTime) {
        this.chargeStartTime = chargeStartTime;
    }

    public String getChargeEndTime() {
        return chargeEndTime;
    }

    public void setChargeEndTime(String chargeEndTime) {
        this.chargeEndTime = chargeEndTime == null ? null : chargeEndTime.trim();
    }
}