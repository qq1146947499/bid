package com.bid.springcloud.enums;

import lombok.Getter;

/**
 * Created by 廖师兄
 * 2017-06-11 17:12
 */
@Getter
public enum OrderProcessEnum{
    THENFILL("1", "填单"),
    APPROVAL("2", "发布审批中"),
    RELEASE("3", "发布"),
    BIDDING("4", "竞价中"),
    SUPPLIERQUOTATION("5", "供应商报价"),
    AFTERENDING("6", "截至后"),
    PRIMARY("7", "采购人初选后提交"),
    APROVAL("8", "采购初选审批"),
    RELEASEBIDDINGRESULTS("9", "发布竞价结果"),
    DELIVERY("10", "发货"),
    RECEIVING("11", "收货"),
    ACCEPTANCE("12", "验收"),
    PAYMENT("13", "支付"),
    ;

    private String code;

    private String message;

    OrderProcessEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
