package com.bid.springcloud.service.impl;

import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.entities.*;
import com.bid.springcloud.mapper.CpUserMapper;
import com.bid.springcloud.mapper.PtResourceMapper;
import com.bid.springcloud.mapper.PtRoleMapper;
import com.bid.springcloud.service.CpUserClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@Slf4j
public class CpUserServiceImpl extends BaseApiService implements CpUserClientService {

    @Resource
    private  CpUserMapper cpUserMapper;

    @Resource
    private PtRoleMapper ptRoleMapper;

    @Resource
    private PtResourceMapper ptResourceMapper;


    @Override
    public CpUser queryCouser(@RequestBody CpUser cpUser) {

        CpUser cpUser1 = cpUserMapper.selectCpuser(cpUser);
        if (cpUser != null){
            return cpUser1;
        }
        return null;
    }

    @Override
    public int addCpuser(@RequestBody CpUser cpUser) {
        int i = cpUserMapper.insertSelectiveZ(cpUser);
        if (i>0){
            return  i;
        }
        return 0;
    }

    @Override
    public List<PtRole> getRoleByUser(@RequestParam("userId") Integer userId) {

        List<PtRole> roleByUser = ptRoleMapper.getRoleByUser(userId);
        if (roleByUser!=null){
            return roleByUser;
        }
        return null;
    }

    @Override
    public List<PtResource> findPermsByRoleId(@RequestParam("roleId") Integer roleId) {
        List<PtResource> permsByRoleId = ptResourceMapper.findPermsByRoleId(roleId);
        if (permsByRoleId!=null){
            return permsByRoleId;
        }
      return null;
    }

    @Override
    public List<PtResource> findPermsByUserId(@RequestParam("userId") Integer userId) {
        List<PtResource> ptResources = ptResourceMapper.queryResourceByUserIdCurrency(userId);
        if (ptResources != null){
            return  ptResources;
        }
        return null;
    }

    @Override
    public List<PtResource> findAllPerms() {
        List<PtResource> ptResources = ptResourceMapper.queryAll();
        if (ptResources!=null){
    return ptResources;
}
        return null;
    }

    @Override
    public List<CpUser> queryByuserName(@RequestParam("userAccount") String userAccount) {
        List<CpUser> list =ptResourceMapper.selectByUserAccount(userAccount);
        if (list !=null){
            return list;
        }
        return null;
    }

    @Override
    public int deleteCpUserById(@PathVariable("userId") Integer userId) {
        int i = cpUserMapper.deleteByPrimaryKey(userId);
        if(i>0){
            return  i;
        }

        return 0;
    }

    @Override
    public CpUser queryCpUserByUserid(@PathVariable("userId") Integer userId) {
        CpUser cpUser = cpUserMapper.selectByPrimaryKey(userId);
        if (cpUser !=null){
            return  cpUser;
        }
        return null;
    }

    @Override
    public int updateCpUserByUserId(@RequestBody CpUser cpUser) {
        int i = cpUserMapper.updateByPrimaryKeySelective(cpUser);
        if (i>0){
            return i;
        }
        return 0;
    }


}

