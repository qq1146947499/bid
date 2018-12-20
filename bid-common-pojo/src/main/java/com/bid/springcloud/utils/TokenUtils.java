package com.bid.springcloud.utils;

import com.bid.springcloud.constants.Constants;

import java.util.UUID;


public class TokenUtils {

	public static String getColleageToken() {
		return Constants.TOKEN_COLLEAGE + "-" + UUID.randomUUID();
	}

	public static String getPayToken() {
		return Constants.TOKEN_PAY + "-" + UUID.randomUUID();
	}
}
