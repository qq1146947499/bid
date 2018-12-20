package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CpUser;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtRole;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public interface CpuserService {


    CpUser queryByCpUser(CpUser cpUser);

    Permission findPermsByUserId(Integer userId);

    ResponseBase addCpUser(CpUser cpUser);


    ResponseBase queryByuserName(String userAccount);


    ResponseBase deleteCpUserById(Integer userId);


    ResponseBase queryCpUserByUserid(Integer userId);


    ResponseBase updateCpUserByUserId(CpUser cpUser);


    CpUser queryLoginByCpUser(CpUser cpUser);


    List<PtRole> getRoleByUser(Integer userId);

    List<PtResource> findPermsByRoleId(Integer roleId);
}

