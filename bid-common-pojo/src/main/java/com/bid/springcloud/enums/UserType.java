package com.bid.springcloud.enums;/*
@author zhoucong
@date ${date}-${time}

*/

import lombok.Getter;

@Getter
public enum UserType {

    Platform("P"),
    COLLEAGE("C"),
    ENTERPRISE("E"),
    COLLEAGESON("CS");
    private String code;

    UserType(String code) {
        this.code = code;
    }
}
