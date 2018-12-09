package com.bid.springcloud.VO;

import com.bid.springcloud.enums.UserType;

public class AJAXResult {


    public static void main(String[] args) {

        System.out.println(UserType.COLLEAGE.getCode());
    }
	private boolean success;
	private Object data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
