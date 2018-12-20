package com.bid.springcloud.service;


import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtUser;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Component
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface PtResourceClientService {


    /**
     * 查询用户具有的权限
     * @param ptUser
     * @return
     */

    @RequestMapping("/query/Resource/ByUserId")
    List<PtResource> queryResourceByUserId(@RequestBody PtUser ptUser);

    /**
     * 查询所有权限
     * @return
     */
    @RequestMapping("/queryAll/resource")
    ResponseBase queryAll();


    /**
     * 删除权限
     * @param id
     * @return
     */

    @PostMapping("/del/resource")
    ResponseBase delResource(@RequestParam("id") Integer id);

    /**
     * 添加权限
     * @param ptResource
     * @return
     */

    @PostMapping("/add/resource")
    ResponseBase addResource(@RequestBody PtResource ptResource);


    /**
     * 更新权限
     * @param ptResource
     * @return
     */
    @PostMapping("/edit/resource")
    ResponseBase editResource(@RequestBody PtResource ptResource);

    /**
     * 查询角色拥有的权限id
     * @param roleId
     * @return
     */
    @PostMapping("/query/ByRoleId")
    List<Integer> queryByRoleId(@RequestParam("roleId") Integer roleId);
}
