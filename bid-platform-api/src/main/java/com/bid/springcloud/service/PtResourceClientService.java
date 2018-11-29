package com.bid.springcloud.service;


import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.entities.RoleResource;
import com.bid.springcloud.utils.EasyUIDataGrid;
import org.apache.ibatis.annotations.Select;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.List;


@Component
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface PtResourceClientService {



    @RequestMapping("/query/Resource/ByUserId")
    List<PtResource> queryResourceByUserId(@RequestBody PtUser ptUser);

    @RequestMapping("/queryAll/resource")
    ResponseBase queryAll();



    @PostMapping("/del/resource")
    ResponseBase delResource(@RequestParam("id") Integer id);


    @PostMapping("/add/resource")
    ResponseBase addResource(@RequestBody PtResource ptResource);


    @PostMapping("/edit/resource")
    ResponseBase editResource(@RequestBody PtResource ptResource);

    @PostMapping("/query/ByRoleId")
    List<Integer> queryByRoleId(@RequestParam("roleId") Integer roleId);
}
