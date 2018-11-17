package com.bid.springcloud.entities;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CoOrderProcess {
    private String processId;

    private String orderMainId;

    /**
     * 1
     */
    private String orderBidType;

    private String sourceCollegeId;

    private String processName;

    private Date processTime;

    private String auditResult;

    private String remark;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
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

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult == null ? null : auditResult.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}