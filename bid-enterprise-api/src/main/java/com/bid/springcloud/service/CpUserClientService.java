package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.*;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import java.util.List;


@Component
@FeignClient(value = "MICROSERVICECLOUD-ENTERPRISE")
public  interface CpUserClientService {




    @PostMapping("/enterprise/findByTokenUser")
     ResponseBase findByTokenUser(@RequestParam("token") String token);
    /**
     * 查询企业用户
     * @param cpUser
     * @return
     */

    @PostMapping("/enterprise/queryCouser")
    CpUser queryCouser(@RequestBody CpUser cpUser);

    /**
     * 添加企业用户
     * @param cpUser
     * @return
     */
    @PostMapping("/enterprise/addCpuser")
    int addCpuser(@RequestBody CpUser cpUser);

    /**
     * 获取所有角色
     * @param userId
     * @return
     */
    @PostMapping("/enterprise/get/RoleByUser")
    List<PtRole> getRoleByUser(@RequestParam("userId") Integer userId);

    /**
     * 获取角色所有权限
     * @param roleId
     * @return
     */
    @PostMapping("/enterprise/find/PermsByRoleId")
    List<PtResource> findPermsByRoleId(@RequestParam("roleId") Integer roleId);


    /**
     * 获取用户拥有的所有权限
     * @param userId
     * @return
     */
    @PostMapping("/enterprise/find/PermsByUserId")
  List<PtResource>  findPermsByUserId(@RequestParam("userId") Integer userId);


    /**
     * 查询所有权限
     * @return
     */
    @GetMapping("/enterprise/findAllPerms")
    List<PtResource>  findAllPerms();


    /**
     * 查询用户拥有的子用户
     * @param userAccount
     * @return
     */
    @PostMapping("/enterprise/query/ByuserName")
    List<CpUser> queryByuserName(@RequestParam ("userAccount")String userAccount);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    @GetMapping("enterprise/delete/CpUserById/{userId}")
    int deleteCpUserById(@PathVariable("userId") Integer userId);

    /**
     * id查询用户
     * @param userId
     * @return
     */
    @GetMapping("/enterprise/queryCpUser/ByUserid/{userId}")
    CpUser queryCpUserByUserid(@PathVariable("userId") Integer userId);

    /**
     * 更新用户
     * @param cpUser
     * @return
     */
    @PostMapping("/enterprise/updateCpUser/ByUserId")
    int updateCpUserByUserId(@RequestBody CpUser cpUser);
}


