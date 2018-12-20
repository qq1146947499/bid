package com.bid.springcloud.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092300576623";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCjgxpfGTObKKns8BfI7UGi8HHrws8rocDGEaiex0bDbJDoo5NR3qtF07Akonq+ajCsRPErhr1pZMZ3ByksFvgMFaeBzjT51p2SHc2cAW4sqYbamjYKmvczD1FgJVBb5x681+d9H8Dg1Ixz/wBS4JW7XpeVtyMFtlyRpPFxPs0jgiXbkQZQjNzxOxeLYb8nfSa4sIhhJ+SycPCzfp2vL666v4cp4mewC1vKLgDZRMCB1WFttR2MycMRxcbRGtPrNZtxB26N/NjarQWfXTCx94fYpas7EIu9+cfwYBcHC1ZdzREwJOR1wj6xQpBx9DA17E/nwiTejcBcho164cviEtSVAgMBAAECggEAaWRdoSJbUw0YyfHPQuE6R033/+BnLFZsLL7BEuabQ+c8V9bnZAPEHZPemx5nQ0iq6r7dPBLzD3W3Po1NCnAbnZ5vg4loOAkPM1kmaAG8A+mZVFnFr3xHDZA4AWLLsxD7jPkU6l+HMOOPTEz25nR/zm+gAQ4z8sCiVfYc8cNq8hEvlTJHKu+mWlS9AhQ34LjjYMMXvladS4LKki4g2gtA5JsmiBk+zWtGCHspzY0SCe0sh45FQ2mUqI9A0eKtz0Zjh93gMRBpKV8UTXAGU9IivSY/hGPYHv5BiTzbuhYcg9BnMUQyVwVoD7bT4urOAjLxsKu7FcnxIvmsaMWtuTvz2QKBgQDPEq2d47evo7nHuVAwt+u6zSuLw/XkS6SRzqnY1DB4SgfhXnRq6bJNrbiOfNOQuKX4swh0U6hDTEfRe3kL5FYvkyKD5MpOdoOniTesO+xINtanTISKqCPVXaZqT+aKf1EMbXyQgdvy46nMv7lb1RnLsm9CNx5SAlXbudlb/sH3+wKBgQDKJYoQgbxh6Ax8JyXlJCL9ZN5TLt8AbM9EWxy5ErobctBhA7s6DX7c2rinaKeJwFeGkNdeg3MSEROtHOLb4XedhgLUfJDKD/Io9WgfK3yxwJCaJrGNBm2ZB2iFaiFTgvfTJxGPzAxosSHQnkyd+YZEJBRhdovosUWnmCARvc3wrwKBgGgMx6a1vSAJkhmUuYGxeUcFP2NclVsg01Hc2aW1gaF/+ZO6JZ9vTIQRzdHzUU/AKM3eEFp7iuo+Ezxk4b8i/lerhEVoGmvwy1jM72ehOKpUu+mW3mbZ9B+LjkqPWZWwQeaPwW7Pgdj7ot/aWuaVHwAm6hcIoTiuKbxeF6VNTuQvAoGBAK6Zaf0D8dCm+1GpBqQ6aDZxj05N57OYSBYElHSOZk0bCD0jWe20hmUATgna7QqgJXlHVZ5+7z8lnNcjYhcFUamvfHZH+U9uIn2aKgryJsvpRXy/+w+SA8vviCnkF1DoiGHLFvIbDoTGqixk7kxsn7nvZ+Me341mwIEXdmucg2plAoGBAIJmRRfOS2HqmHnD/RN7YeyWgD0zRKtmW/GvKO+LrNLHJ1W2hj3xv5FRxEYGixHgonkMlA+rV1vTv/gKlWkzasyc52LNMPPeyZ7jIJ668pKQbRcDP8xaGyRhhPYkQgxHGromfRHikIJdTHuF3adMQHoaSS4bpsGvjFYriOFm2rCA";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0ANRsJjU7jf3TJr6jitLbymbef4ByOFbfhtGi34lmlRzQYyorp8VoVtMDpd9UhjfFwwpSnVTHmyM5qtgVu2VjVeg0JCLKy+naFrcXdLWiuTE8vxSm/wCr42d30/J4qexDwxLp5/1Ll9Na0xcCn+jlUytl5ry+xQujKHAnC3IMaY4KT9pqP5MycJrAJmVPIK+sQ3vUkrpQ/pSMO9CDaIojmZxW2vFIoCQ45dsnB8wnR4KkLShmbuTCcGppzG0cjAaiO3AxQ5PDiRonHzHWg06vkrmkAf9KN1p/V0HHEf95oyrKNPBzR/gHwK9mwk23NOhaGD5+NrvgmD/Y59GDU9dUQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://cq.xuduan.tech:37770//colleage/notifyUrl";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://cq.xuduan.tech:37770//colleage/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    //public static String gatewayUrl = "https://openapi.alipay.com/gateway.do";
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";

	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord
	 *            要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
