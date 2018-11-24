package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.entities.PtUserRole;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;


@Component
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public  interface PtUserClientService {


    @GetMapping("/query1/{id}")
    PtUser query1(@PathVariable("id") Integer id);


    /**
     * 分页查询所有
     * @return
     */
    @GetMapping("/queryAll/{page}/{row}")
    ResponseBase queryAll(@PathVariable(value = "page") Integer page, @PathVariable(value = "row") Integer row);



    /**
     * 登陆查询
     * @param ptUser
     * @return
     */

    @PostMapping("/query4Login")
    ResponseBase query4Login(@ModelAttribute PtUser ptUser);


    /**
     * 增加用户
     * @param ptUser
     * @return
     */

    @PostMapping("/insertUser")
    ResponseBase insertUser(@ModelAttribute  PtUser ptUser);


    /**
     * 更新用户
     * @param ptUser
     * @return
     */

    @PostMapping("/updateUser")
    ResponseBase updateUser(@ModelAttribute  PtUser ptUser);



    /**
     * 用户id查询用户
     * @param userId
     * @return
     */
    @GetMapping("/queryById/{userId}")
    ResponseBase queryById(@PathVariable("userId") Integer userId);


    /**
     * 删除用户
     * @param userId
     * @return
     */

    @GetMapping("/deleteUserById/{userId}")
    ResponseBase deleteUserById(@PathVariable(value = "id") Integer userId);


    /**
     * 增加用户角色
     * @param
     * @return
     */

    @PostMapping("/insertUserRoles")
    ResponseBase insertUserRoles(@ModelAttribute PtUserRole ptUserRole);


    /**
     * 删除用户角色
     * @param
     * @return
     */

    @DeleteMapping("/deleteUserRoles1")
    ResponseBase deleteUserRoles(@ModelAttribute PtUserRole ptUserRole);



    /**
     * 查询用户角色
     * @param id
     * @return
     */

    @GetMapping("/queryRoleidsByUserid/{id}")
    ResponseBase queryRoleidsByUserid(@PathVariable(value = "id") Integer id);

}


