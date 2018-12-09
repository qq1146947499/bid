package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.shiro.CoUserShiro;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.List;


@Component
@FeignClient(value = "MICROSERVICECLOUD-COLLEAGE")
public  interface CoUserClientService{




    @PostMapping("/colleage/add/couser")
    int addCoUser(@RequestBody CoUser coUser);


    /**
     *用户登录接口
     * @param coUser
     * @return
     */

    @PostMapping("/colleage/query/coUser")
    CoUser queryByCoUser(@RequestBody CoUser coUser);




    /**
     * 根据用户名查询拥有的子用户
     * @param userName
     * @return
     */
    @PostMapping("/colleage/query/userName")
    List<CoUser> queryByuserName(@RequestBody String userName);


    /**
     * 删除子用户
     * @param userId
     * @return
     */
    @PostMapping("/colleage/delete/CoUserById/")
    int deleteCoUserById(@RequestParam(value = "userId") Integer userId);


    /**
     * 查询子用户
     * @param userId
     * @return
     */
    @GetMapping("/colleage/query/CoUserByUserid/{userId}")
    CoUser queryCoUserByUserid(@PathVariable(value = "userId") Integer userId);


    /**
     * 更新子用户
     * @param coUser
     * @return
     */
    @PostMapping("/colleage/colleage/update/CouserByUserId")
    int updateCouserByUserId(@RequestBody CoUser coUser);

    /**
     * 获取所有角色
     * @param userId
     * @return
     */
    @PostMapping("/colleage/get/RoleByUser")
    List<PtRole> getRoleByUser(@RequestParam("userId") Integer userId);

    /**
     * 获取角色所有权限
     * @param roleId
     * @return
     */
    @PostMapping("/colleage/find/PermsByRoleId")
    List<PtResource> findPermsByRoleId(@RequestParam("roleId") Integer roleId);


    /**
     * 获取用户拥有的所有权限
     * @param userId
     * @return
     */
    @PostMapping("/colleage/find/PermsByUserId")
  List<PtResource>  findPermsByUserId(@RequestParam("userId") Integer userId);


    /**
     * 查询所有权限
     * @return
     */
    @GetMapping("/colleage/findAllPerms")
    List<PtResource>  findAllPerms();


}


