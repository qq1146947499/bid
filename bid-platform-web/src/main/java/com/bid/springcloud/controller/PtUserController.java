package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.service.PtUserClientService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class PtUserController {

    @Resource
    private PtUserClientService ptUserClientService;
}
