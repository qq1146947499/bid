package com.bid.springcloud.exception;


import com.bid.springcloud.enums.ResultEnum;

/**
 * Created by 廖师兄
 * 2017-06-11 18:55
 */
public class SellException extends RuntimeException{

    private Integer code;

    private  String msg;
    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
