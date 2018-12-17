package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.service.CouserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;


@Controller
@RequestMapping("/colleage")
public class CoUserController{


    @Resource
    private CouserService couserServiceImpl;







    @RequestMapping("/userRegiste")
    public Object userRegister(@Valid CoUser coUser, BindingResult bindingResult, Model model){

        boolean isRegisterr =true;

        if (bindingResult.hasErrors()) {

            for (ObjectError error :bindingResult.getAllErrors() ) {
                System.out.println(error);
                model.addAttribute(error);
            }
            return model;
        }
        ResponseBase base = couserServiceImpl.registerUser(coUser, isRegisterr);

        return base;
    }





    @RequestMapping("/add/couser")
    @ResponseBody
    public Object addCouser(CoUser coUser){
        boolean isRegister = false;
        ResponseBase base = couserServiceImpl.addCouser(coUser,isRegister);
        if(base!=null){
            return  base;
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @RequestMapping("/getUserList")
    @ResponseBody
    public Object getUserList(@RequestParam("userName") String userName){
        ResponseBase base = couserServiceImpl.queryByuserName(userName);
        if(base!=null){
            return  base;
        }
        throw new SellException(ResultEnum.INSERT);
    }

    @RequestMapping("/login")
    @ResponseBody
    public Object login(CoUser coUser, HttpSession session){


        UsernamePasswordToken token = new UsernamePasswordToken(coUser.getUserAccount(), coUser.getUserPass());
        Subject subject = SecurityUtils.getSubject();
        try {
            CoUser base = couserServiceImpl.queryLoginByCouser(coUser);
            Permission presource = couserServiceImpl.findPermsByUserId(base.getUserId());
            subject.login(token);
            CoUser user = (CoUser) subject.getPrincipal();
            session.setAttribute("root",presource);
            session.setAttribute("user", user);
            return "main";
        } catch (Exception e) {
            throw new SellException(ResultEnum.PARAM_ERROR);
        }



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
