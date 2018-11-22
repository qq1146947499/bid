package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.utils.EasyUIDataGrid;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public  interface PtUserClientService {

    /**
     * 查询所有用户
     * @param
     * @return
     */
    @RequestMapping("/queryAll")
    EasyUIDataGrid queryAll(int page, int rows);

    /**
     * 用户登陆
     * @param ptUser
     * @return
     */

    @RequestMapping("/query4Login")
    ResponseBase query4Login(PtUser ptUser);

    /**
     * 添加用户
     * @param ptUser
     * @return
     */
    @RequestMapping("/insertCoCoUser")
    ResponseBase insertCoCoUser(PtUser ptUser);

    /**
     * 更新用户
     * @param ptUser
     * @return
     */
    @RequestMapping("/updateCoCoUser")
    ResponseBase updateCoCoUser(PtUser ptUser);

    /**
     * 查询用户
     * @param id
     * @return
     */
    @RequestMapping("/deleteCoCoUserById")
    ResponseBase deleteCoCoUserById(Integer id);

    /**
     * 查询用户角色
     * @param id
     * @return
     */

    @RequestMapping("/queryRoleidsByCoCoUserid")
    ResponseBase queryRoleidsByCoCoUserid(Integer id);
}


