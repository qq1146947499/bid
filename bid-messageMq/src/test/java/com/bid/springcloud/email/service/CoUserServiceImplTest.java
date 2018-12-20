package com.bid.springcloud.email.service;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/*
@author zhoucong
@date ${date}-${time}

*/
@SpringBootTest
@RunWith(SpringRunner.class)

public class CoUserServiceImplTest {
//zuzfwiwywgtdbafj

    @Resource
    private JavaMailSenderImpl mailSender;
    @Test
    public void  test(){

            SimpleMailMessage message = new SimpleMailMessage();
            message.setSubject("通知今晚开会");
            message.setText("7:30");
            message.setFrom("1146947499@qq.com");
            message.setTo("1466199762@qq.com");
            mailSender.send(message);

  }

}
