package com.bid.springcloud.entities;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class CpAttention {
    private Integer attentionId;

    private String companyId;

    private String collegeId;

    private String remark;

    private String orderMainId;

    private String followType;

    /**
     * Y:
     */
    private String isDxCenter;

    /**
     * Y:
     */
    private String isDxCollege;

    public Integer getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Integer attentionId) {
        this.attentionId = attentionId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
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

    public String getOrderMainId() {
        return orderMainId;
    }

    public void setOrderMainId(String orderMainId) {
        this.orderMainId = orderMainId == null ? null : orderMainId.trim();
    }

    public String getFollowType() {
        return followType;
    }

    public void setFollowType(String followType) {
        this.followType = followType == null ? null : followType.trim();
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