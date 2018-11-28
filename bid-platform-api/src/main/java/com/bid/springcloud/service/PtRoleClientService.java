package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/


import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtRole;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface PtRoleClientService {



    @RequestMapping("/queryAllRole")
    ResponseBase queryAllRole();





    /**
     * 删除多个用户角色
     * @param map
     * @return
     */
    @PostMapping("/delete/RoleResources")
    ResponseBase deleteRoleResources(@RequestBody Map<String,Object> map);


    /**
     * 增加用户多个角色
     * @param
     * @return
     */

    @PostMapping("/insert/RoleResources")
    ResponseBase insertRoleResources( @RequestBody Map<String,Object> map);

    /**
     * 分页查询所有
     * @return
     */
    @GetMapping("/queryAll/role/{page}/{rows}")
    ResponseBase queryAll(@PathVariable(value = "page") Integer page, @PathVariable(value = "rows") Integer row);


    /**
     * 插入角色
     * @param ptRole
     * @return
     */
    @PostMapping("/insertRole")
    ResponseBase insertRole(@RequestBody PtRole ptRole);

    /**
     * 查询角色
     * @param roleId
     * @return
     */
    @GetMapping("/queryRole/{roleId}")
    ResponseBase queryRole(@PathVariable(value = "roleId") Integer roleId);

    /**
     * 删除角色
     * @param roleId
     * @return
     */
    @GetMapping("/deleRole/{roleId}")
    ResponseBase deleRole(@PathVariable(value = "roleId") Integer roleId);
}
