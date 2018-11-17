package com.bid.springcloud.entities;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CoOrderNode {
    private String orderNodeId;

    private String orderMainId;

    private String operationTitle;

    private String orderCode;

    private String orderDetailId;

    private String nodeType;

    private String nodeUserName;

    private String nodeUserId;

    private Date nodeTime;

    private String nodeReason;

    private String nodeResoult;

    private String remark;

    /**
     * Y:
     */
    private String isDxCenter;

    /**
     * Y:
     */
    private String isDxCollege;

    public String getOrderNodeId() {
        return orderNodeId;
    }

    public void setOrderNodeId(String orderNodeId) {
        this.orderNodeId = orderNodeId == null ? null : orderNodeId.trim();
    }

    public String getOrderMainId() {
        return orderMainId;
    }

    public void setOrderMainId(String orderMainId) {
        this.orderMainId = orderMainId == null ? null : orderMainId.trim();
    }

    public String getOperationTitle() {
        return operationTitle;
    }

    public void setOperationTitle(String operationTitle) {
        this.operationTitle = operationTitle == null ? null : operationTitle.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId == null ? null : orderDetailId.trim();
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType == null ? null : nodeType.trim();
    }

    public String getNodeUserName() {
        return nodeUserName;
    }

    public void setNodeUserName(String nodeUserName) {
        this.nodeUserName = nodeUserName == null ? null : nodeUserName.trim();
    }

    public String getNodeUserId() {
        return nodeUserId;
    }

    public void setNodeUserId(String nodeUserId) {
        this.nodeUserId = nodeUserId == null ? null : nodeUserId.trim();
    }

    public Date getNodeTime() {
        return nodeTime;
    }

    public void setNodeTime(Date nodeTime) {
        this.nodeTime = nodeTime;
    }

    public String getNodeReason() {
        return nodeReason;
    }

    public void setNodeReason(String nodeReason) {
        this.nodeReason = nodeReason == null ? null : nodeReason.trim();
    }

    public String getNodeResoult() {
        return nodeResoult;
    }

    public void setNodeResoult(String nodeResoult) {
        this.nodeResoult = nodeResoult == null ? null : nodeResoult.trim();
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
}