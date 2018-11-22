package com.bid.springcloud.service;




import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.utils.EasyUIDataGrid;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface PtResourceClientService {




    EasyUIDataGrid queryAll(int page, int rows);


    ResponseBase queryByRoleID(Integer id);



    ResponseBase updateResource(PtResource ptResource);


    ResponseBase deletePtResource(Integer roleId);
}
