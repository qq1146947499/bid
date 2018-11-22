package com.bid.springcloud.service;


import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.utils.EasyUIDataGrid;

//@FeignClient(value = "MICROSERVICECLOUD-PTUSER",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface PtRoleClientService {


    EasyUIDataGrid queryAll(int page, int rows);


    ResponseBase queryRole(PtRole ptRole);



    ResponseBase updatePtRole(PtRole ptRole);


    ResponseBase insertRolePermission(PtRole ptRole);


}
