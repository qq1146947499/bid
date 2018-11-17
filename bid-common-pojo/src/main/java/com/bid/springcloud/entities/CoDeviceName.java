package com.bid.springcloud.entities;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CoDeviceName {
    private String nameId;

    private String deviceName;

    private String devicetypeId;

    private String collegeId;

    private String remark;

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId == null ? null : nameId.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getDevicetypeId() {
        return devicetypeId;
    }

    public void setDevicetypeId(String devicetypeId) {
        this.devicetypeId = devicetypeId == null ? null : devicetypeId.trim();
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
}