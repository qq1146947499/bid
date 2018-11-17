package com.bid.springcloud.entities;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CoDeviceType {
    private String deviceTypeId;

    private String devicetypeName;

    private String parentId;

    private String collegeId;

    private String remark;

    private String budget;

    public String getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId == null ? null : deviceTypeId.trim();
    }

    public String getDevicetypeName() {
        return devicetypeName;
    }

    public void setDevicetypeName(String devicetypeName) {
        this.devicetypeName = devicetypeName == null ? null : devicetypeName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId == null ? null : collegeId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget == null ? null : budget.trim();
    }
}