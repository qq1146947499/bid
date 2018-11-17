package com.bid.springcloud.entities;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class Device {
    private Integer deviceId;

    private String mediaId;

    private Integer brandId;

    private Integer bidInfoId;

    private String nameId;

    private String dmainId;

    private String deviceTypeId;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getBidInfoId() {
        return bidInfoId;
    }

    public void setBidInfoId(Integer bidInfoId) {
        this.bidInfoId = bidInfoId;
    }

    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId == null ? null : nameId.trim();
    }

    public String getDmainId() {
        return dmainId;
    }

    public void setDmainId(String dmainId) {
        this.dmainId = dmainId == null ? null : dmainId.trim();
    }

    public String getDeviceTypeId() {
        return deviceTypeId;
    }

    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId == null ? null : deviceTypeId.trim();
    }
}