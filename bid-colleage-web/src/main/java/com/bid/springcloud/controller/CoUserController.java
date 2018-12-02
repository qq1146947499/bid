package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.enums.UserType;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.service.CouserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/colleage")
public class CoUserController{


    @Resource
    private  CouserService couserServiceImpl;




    @RequestMapping("/add/couser")
    @ResponseBody
    public Object addCouser(CoUser coUser){
        ResponseBase base = couserServiceImpl.addCouser(coUser);
        if(base!=null){
            return  base;
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @RequestMapping("/getUserList")
    @ResponseBody
    public Object getUserList(@RequestParam("userName") String userName){
        ResponseBase base = couserServiceImpl.queryByPtuserName(userName);
        if(base!=null){
            return  base;
        }
        throw new SellException(ResultEnum.INSERT);
    }

    @RequestMapping("/login")
    @ResponseBody
    public Object login(CoUser coUser, HttpServletRequest request){
        if(coUser.getUserType().equals(UserType.COLLEAGE.getCode())){
            PtUser ptUser = new PtUser();
            ptUser.setUserName(coUser.getUserAccount());
            ptUser.setUserPass(coUser.getUserPass());
            ResponseBase base = couserServiceImpl.queryByPtuser(ptUser);
            request.getSession().setAttribute("userNmae",ptUser.getUserName());
            return base;
        }
        if(coUser.getUserType().equals(UserType.COLLEAGESON.getCode())){
            ResponseBase base = couserServiceImpl.updateCouserByUserId(coUser);
            request.getSession().setAttribute("userNmae",coUser.getUserAccount());
            return base;
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }

    @RequestMapping("/delete/CoUserById")
    @ResponseBody
    public Object deleteCoUserById( Integer userId) {
        ResponseBase base = couserServiceImpl.deleteCoUserById(userId);
        if (base!=null){
            return  base;
        }
        throw  new  SellException(ResultEnum.PARAM_ERROR);

    }
    @RequestMapping("/user/update")
    @ResponseBody
    public Object updateCouserByUserId(CoUser coUser) {
        ResponseBase base = couserServiceImpl.updateCouserByUserId(coUser);
        if (base!=null){
            return  base;
        }
       throw  new  SellException(ResultEnum.PARAM_ERROR);

    }
    @RequestMapping("/query/CoUserByUserid")
    @ResponseBody
    public Object queryCoUserByUserid(Integer userId) {
        return  couserServiceImpl.queryCoUserByUserid(userId);

    }
    @RequestMapping("/get/userIndex")
    public String getUserIndex(){
        return "/user/index";
    }
    @RequestMapping("/get/userEdit")
    public String editUserIndex( Integer id,Model model){
        ResponseBase base = couserServiceImpl.queryCoUserByUserid(id);
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
