package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CpUser;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.service.CpuserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/enterprise")
public class CpUserController {


    @Resource
    private CpuserService cpUserServiceImpl;




    @RequestMapping("/add/cpUser")
    @ResponseBody
    public Object addCpUser(CpUser cpUser){
        ResponseBase base = cpUserServiceImpl.addCpUser(cpUser);
        if(base != null){
            return  base;
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @RequestMapping("/getUserList")
    @ResponseBody
    public Object getUserList(@RequestParam("userName") String userName){
        ResponseBase base = cpUserServiceImpl.queryByuserName(userName);
        if(base!=null){
            return  base;
        }
        throw new SellException(ResultEnum.INSERT);
    }

    @RequestMapping("/login")
    @ResponseBody
    public Object login(CpUser cpUser, HttpSession session){


        UsernamePasswordToken token = new UsernamePasswordToken(cpUser.getUserAccount(), cpUser.getUserPass());
        Subject subject = SecurityUtils.getSubject();
        try {
            CpUser base = cpUserServiceImpl.queryByCpUser(cpUser);
            Permission presource = cpUserServiceImpl.findPermsByUserId(base.getUserId());
            subject.login(token);
            CpUser user = (CpUser) subject.getPrincipal();
            session.setAttribute("root",presource);
            session.setAttribute("user", user);
            return "main";
        } catch (Exception e) {
            throw new SellException(ResultEnum.PARAM_ERROR);
        }



    }

    @RequestMapping("/delete/CpUserById")
    @ResponseBody
    public Object deleteCpUserById( Integer userId) {
        ResponseBase base = cpUserServiceImpl.deleteCpUserById(userId);
        if (base!=null){
            return  base;
        }
        throw  new  SellException(ResultEnum.PARAM_ERROR);

    }
    @RequestMapping("/user/update")
    @ResponseBody
    public Object updateCpUserByUserId(CpUser cpUser) {
        ResponseBase base = cpUserServiceImpl.updateCpUserByUserId(cpUser);
        if (base!=null){
            return  base;
        }
       throw  new  SellException(ResultEnum.PARAM_ERROR);

    }
    @RequestMapping("/query/CpUserByUserid")
    @ResponseBody
    public Object queryCpUserByUserid(Integer userId) {
        return  cpUserServiceImpl.queryCpUserByUserid(userId);

    }
    @RequestMapping("/get/userIndex")
    public String getUserIndex(){
        return "/user/index";
    }
    @RequestMapping("/get/userEdit")
    public String editUserIndex( @RequestParam("id") Integer id,Model model){
        ResponseBase base = cpUserServiceImpl.queryCpUserByUserid(id);
        model.addAttribute("user",base.getData());
        return "/user/edit";
    }

    @RequestMapping("/get/userAdd")
    public String addUserIndex(){

        return "/user/add";
    }

    @RequestMapping("/get/main")
    public String getIndex(){

        return "main";
    }



}
