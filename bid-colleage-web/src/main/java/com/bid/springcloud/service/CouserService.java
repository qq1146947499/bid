package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtRole;

import java.util.List;


public interface CouserService {


    CoUser queryByCoUser(CoUser coUser);

    Permission findPermsByUserId(Integer userId);

    ResponseBase addCouser(CoUser ptUser,boolean isRegiste);


    ResponseBase queryByuserName(String userName);


    ResponseBase deleteCoUserById(Integer userId);


    ResponseBase queryCoUserByUserid(Integer userId);


    ResponseBase updateCouserByUserId(CoUser coUser);


    CoUser queryLoginByCouser(CoUser coUser);


    List<PtRole> getRoleByUser(Integer userId);

    List<PtResource> findPermsByRoleId(Integer roleId);

    ResponseBase registerUser(CoUser coUser,boolean isRegister);
}

