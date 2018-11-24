package com.bid.springcloud.service;




import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.entities.RoleResource;
import com.bid.springcloud.utils.EasyUIDataGrid;
import org.apache.ibatis.annotations.Select;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.List;

@Component
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface PtResourceClientService {

    /**
     * 查询所有权限
     * @return
     */
    //@Select("SELECT * FROM pt_resource WHERE resource_id IS NOT NULL")

    @GetMapping("/queryAllRootPtResource/{page/{row}")
    ResponseBase queryAllRootPtResource(@PathVariable(value = "page") Integer page, @PathVariable(value = "row") Integer row);

    /**
     * 查询子目录
     * @param pid
     * @return
     */
        //@Select("SELECT * FROM pt_resource WHERE p_resource_id ="#{pResourceId}")
    @GetMapping("/queryChildPermissions/{id}")
    ResponseBase queryChildPermissions(@PathVariable(value = "pid") Integer pid);



   // ResponseBase queryAll(Integer page, Integer rows);


    /**
     * 插入权限
     * @param ptResource
     * @return
     */
    @PostMapping("/insertPtResource")
    ResponseBase insertPtResource(@ModelAttribute PtResource ptResource);

    /**
     * 查找权限
     * @param id
     * @return
     */

    @GetMapping("/queryResourceById/{id}")
    ResponseBase queryResourceById(@PathVariable(value = "id") Integer id);


    /**
     * 更新权限
     * @param ptResource
     * @return
     */
    @PostMapping("/updatePtResource")
    ResponseBase updatePtResource(@ModelAttribute PtResource ptResource);

    /**
     * 删除权限
     * @param ptResource
     * @return
     */
    @PostMapping("/deletePtResource")
    ResponseBase deletePtResource(@ModelAttribute PtResource ptResource);

    /**
     * 查找角色拥有的权限
     * @param roleid
     * @return
     */
    //@Select("SELECT resource_id FROM role_resource WHERE role_id ="#{roleId}"")
    @GetMapping("/queryPtResourcesByRoleid/{roleid}")
    ResponseBase queryPtResourcesByRoleid(@PathVariable(value = "roleid") Integer roleid);

    /**
     * 查找用户具有的权限
     * @param ptUser
     * @return
     */
    @PostMapping("/queryPtResourcesByUser")
    ResponseBase queryPtResourcesByUser(@ModelAttribute PtUser ptUser);

}
