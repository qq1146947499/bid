package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.base.BaseRedisService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.constants.Constants;
import com.bid.springcloud.entities.CpUser;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.service.CpuserService;
import com.bid.springcloud.utils.CookieUtils;
import com.bid.springcloud.utils.TokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/enterprise")
@Slf4j
public class CpUserController {


    @Resource
    private BaseRedisService baseRedisService;


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
    public Object login(CpUser cpUser, HttpSession session, HttpServletRequest request, HttpServletResponse response){
            UsernamePasswordToken token = new UsernamePasswordToken(cpUser.getUserAccount(), cpUser.getUserPass());
        Subject subject = SecurityUtils.getSubject();
        try {
            CpUser base = cpUserServiceImpl.queryByCpUser(cpUser);
            Permission presource = cpUserServiceImpl.findPermsByUserId(base.getUserId());
            subject.login(token);
            CpUser user = (CpUser) subject.getPrincipal();
            // 如果账号密码正确，对应生成token
            String colleageToken = TokenUtils.getColleageToken();
            // 存放在redis中，key为token value 为 userid
            Integer userId = user.getUserId();
            log.info("####用户信息token存放在redis中... key为:{},value", colleageToken, userId);
            baseRedisService.setString(colleageToken, userId + "", Constants.TOKEN_MEMBER_TIME);
            //产生cockie
            CookieUtils.setCookie(request, response, "COLLEAGE_TOKEN", colleageToken, 60*60*24*7);
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
