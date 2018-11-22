package com.bid.springcloud.service;




import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.utils.EasyUIDataGrid;

//@FeignClient(value = "MICROSERVICECLOUD-PTUSER",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface PtResourceClientService {




    EasyUIDataGrid queryAll(int page, int rows);


    ResponseBase queryByRoleID(Integer id);



    ResponseBase updateResource(PtResource ptResource);


    ResponseBase deletePtResource(Integer roleId);
}
