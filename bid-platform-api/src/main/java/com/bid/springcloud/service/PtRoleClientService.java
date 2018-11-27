package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/


import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.entities.RoleResource;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;


@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface PtRoleClientService {



    @RequestMapping("/queryAllRole")
    ResponseBase queryAllRole();

    @PostMapping("/addRoleResource")
    ResponseBase addRoleResource(@ModelAttribute RoleResource roleResource);

    /**
     * 更新角色权限
     * @param roleResource
     * @return
     */
    @PostMapping("/updateRoleResource")
    ResponseBase updateRoleResource(@RequestParam("roleIdX") Integer roleIdX, @ModelAttribute RoleResource roleResource);

    /**
     * 插入角色
     * @param ptRole
     * @return
     */
    @PostMapping("/insertRole")
    ResponseBase insertRole(@ModelAttribute PtRole ptRole);

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
