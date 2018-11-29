package com.bid.springcloud.entities;

import lombok.Data;

import java.io.Serializable;

/**
 * ƽ̨
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
@Data
public class PtResource implements Serializable {
    private Integer resourceId;

    private String resourceName;

    private String resourcePath;

    private String resourceType;

    private String pResourceId;

    private String ptType;


    private String icon;

    public String getIcon() {
        return icon;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath == null ? null : resourcePath.trim();
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }

    public String getpResourceId() {
        return pResourceId;
    }

    public void setpResourceId(String pResourceId) {
        this.pResourceId = pResourceId == null ? null : pResourceId.trim();
    }

    public String getPtType() {
        return ptType;
    }

    public void setPtType(String ptType) {
        this.ptType = ptType == null ? null : ptType.trim();
    }
}