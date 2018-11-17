package com.bid.springcloud.entities;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2018-11-15
 */
public class PtProcessParam {
    private String processId;

    private String processValue;

    private String processName;

    private String processOrdernum;

    private String remark;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    public String getProcessValue() {
        return processValue;
    }

    public void setProcessValue(String processValue) {
        this.processValue = processValue == null ? null : processValue.trim();
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public String getProcessOrdernum() {
        return processOrdernum;
    }

    public void setProcessOrdernum(String processOrdernum) {
        this.processOrdernum = processOrdernum == null ? null : processOrdernum.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}