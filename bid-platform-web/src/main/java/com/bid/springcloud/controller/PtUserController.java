package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.ResultVO;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.service.PtUserClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
public class PtUserController {


    @Resource
    private PtUserClientService ptUserClientService;

    @RequestMapping("/pt/user/assign")
    public  String ptuserAssign(@RequestParam("id") Integer id,Model model) {
        ResponseBase responseBase = ptUserClientService.queryRoleidsByUserid(id);
        if (responseBase != null) {
            model.addAttribute("user", responseBase);
        }
        return "/user/assign";
    }




    @RequestMapping("/pt/user/update")
    @ResponseBody
    public ResponseBase userDdit(PtUser ptUser){
        ResponseBase responseBase = ptUserClientService.updateUser(ptUser);
        return responseBase;
    }
    @RequestMapping("/pt/user/insert")
    @ResponseBody
    public ResponseBase userAdd(PtUser ptUser){
        ResponseBase responseBase = ptUserClientService.insertUser(ptUser);
        return responseBase;
    }

    @RequestMapping("/pt/user/edit")
    public  String toDdit(@RequestParam("id") Integer id,Model model){
        PtUser ptUser = ptUserClientService.query1(id);
        if (ptUser !=null){
            model.addAttribute("user",ptUser);
        }

        return "user/edit";
    }

    @ResponseBody
    @RequestMapping("/pt/user/delete")
    public ResponseBase delPtuser(@RequestParam(value = "id") Integer userId){
        ResponseBase responseBase = ptUserClientService.deleteUserById(userId);
        return responseBase;
    }

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
    @ResponseBody
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