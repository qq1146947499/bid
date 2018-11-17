package com.bid.springcloud.entities;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CpUser {
    private Integer userId;

    private Integer companyId;

    private String userPass;

    private String realName;

    private String userType;

    private String status;

    private String isDxCenter;

    private String isDxCollege;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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