package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.alibaba.fastjson.JSON;
import com.bid.springcloud.VO.ResultVO;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.constants.Constants;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.service.PtResourceClientService;
import com.bid.springcloud.service.PtUserClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Controller
public class PtUserController {


    @Resource
    private PtUserClientService ptUserClientService;



    @ResponseBody
    @RequestMapping("/pagequery")
    public Object getEmpsWithJson(Model model,
            @RequestParam(value = "page", defaultValue = "1") Integer page ) {
        ResponseBase responseBase = ptUserClientService.queryAll(page, 2);
        model.addAttribute(responseBase);

        return responseBase;
    }



    @RequestMapping("/user/list")
    public String  getUserIndex(Model model){
        ResponseBase responseBase = ptUserClientService.queryAll(1, 5);
        model.addAttribute(responseBase);
        return  "/user/index";
    }
    @RequestMapping(value = "pt/login", method = RequestMethod.POST)
    public Object login(PtUser ptUser, Model model,HttpSession session){
        ResultVO<Object> objectResultVO = new ResultVO<>();
        ResponseBase responseBase = ptUserClientService.query4Login(ptUser);
        Integer rtnCode = responseBase.getRtnCode();
        if(rtnCode==200){
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("username",ptUser.getUserName());
            objectResultVO.setCode(200);
            return objectResultVO;
        }else{
            //登陆失败

            return  "login";
        }

    }

    @RequestMapping(value = "/user/get/{id}",method = RequestMethod.GET)
    public PtUser get2(@PathVariable Integer id)
    {
        System.out.println("sss");
        return ptUserClientService.query1(id);
    }


 /*   @RequestMapping(value = "/user/list/{page}/{rows}",method = RequestMethod.GET)
    public String getUserList(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "3") Integer row
            ,Model model
    )
    {
        ResponseBase responseBase = ptUserClientService.queryAll(page, row);
        model.addAttribute()
            return responseBase;
    }*/



}
