package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.utils.EasyUIDataGrid;
import org.springframework.cloud.netflix.feign.FeignClient;


@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public  interface PtUserClientService {

    /**
     * 查询所有用户
     * @param
     * @return
     */
    EasyUIDataGrid queryAll(int page, int rows);

    /**
     * 用户登陆
     * @param ptUser
     * @return
     */

    ResponseBase query4Login(PtUser ptUser);

    /**
     * 添加用户
     * @param ptUser
     * @return
     */

    ResponseBase insertCoCoUser(PtUser ptUser);

    /**
     * 更新用户
     * @param ptUser
     * @return
     */
    ResponseBase updateCoCoUser(PtUser ptUser);

    /**
     * 查询用户
     * @param id
     * @return
     */

    ResponseBase deleteCoCoUserById(Integer id);

    /**
     * 查询用户角色
     * @param id
     * @return
     */

    ResponseBase queryRoleidsByCoCoUserid(Integer id);
}


