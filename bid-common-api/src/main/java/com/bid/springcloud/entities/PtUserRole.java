package com.bid.springcloud.entities;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class PtUserRole extends PtUserRoleKey {
    private String userSourceType;

    public String getUserSourceType() {
        return userSourceType;
    }

    public void setUserSourceType(String userSourceType) {
        this.userSourceType = userSourceType == null ? null : userSourceType.trim();
    }
}