package com.bid.springcloud.email.service;

import com.bid.springcloud.adapter.MessageAdapter;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

//处理第三方发送邮件
@Slf4j
@Service
public class EmailService implements MessageAdapter {



    private  String eamil2;
    @Value("${msg.subject}")
    private String subject;
    @Value("${msg.text}")
    private String text;
    @Resource
    private JavaMailSenderImpl mailSender;
    @Override
    public void sendMsg(JSONObject body) {
        // 处理发送邮件
        String email = body.getString("email");
        if (StringUtils.isEmpty(email)) {
            return;
        }
        log.info("消息服务平台发送邮件:{}开始", email);
        SimpleMailMessage message = new SimpleMailMessage();
        ;
        // 来自账号 自己发自己
        message.setFrom("1146947499@qq.com");
        // 发送账号
        message.setTo(email);
        // 标题
        message.setSubject(subject);
        // 内容
        message.setText(text.replace("{}", email));
        // 发送邮件
        mailSender.send(message);
        log.info("消息服务平台发送邮件:{}完成", email);
    }
}
