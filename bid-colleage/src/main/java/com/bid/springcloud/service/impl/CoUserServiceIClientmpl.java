package com.bid.springcloud.service.impl;

import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.entities.*;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.mapper.CoUserMapper;
import com.bid.springcloud.mapper.PtResourceMapper;
import com.bid.springcloud.mapper.PtRoleMapper;
import com.bid.springcloud.service.CoUserClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@Slf4j
public class CoUserServiceIClientmpl extends BaseApiService implements CoUserClientService {

    @Resource
    private  CoUserMapper coUserMapper;

    @Resource
    private PtRoleMapper ptRoleMapper;



    @Resource
    private PtResourceMapper ptResourceMapper;



    @Override
    public int addCoUser(@RequestBody CoUser coUser) {

        int i = coUserMapper.insertSelective(coUser);
        if(i>0){
           return  i;
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @Override
    public CoUser queryByCoUser(@RequestBody CoUser coUser) {
        CoUser coUser1 = coUserMapper.selectByCouser(coUser);
        if (coUser1!=null){
            return coUser1;
        }

        throw  new SellException(ResultEnum.INSERT);
    }



    @Override
    public List<CoUser> queryByuserName(@RequestBody String userName) {
        try {
            log.debug("查询用户拥有的子账号");
            List<CoUser> coUsers = coUserMapper.selectByPtuserName(userName);
            if (coUsers!=null){
                return coUsers;
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.debug("查询用户拥有的子账号错误");
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @Override
    public int deleteCoUserById(@RequestParam("userId") Integer userId) {
        try {
            log.debug("删除开始");
            int i = coUserMapper.deleteByPrimaryKey(userId);
            if (i>0){
                return i;
            }
        } catch (Exception e) {
            log.debug("删除错误");
            e.printStackTrace();
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @Override
    public CoUser queryCoUserByUserid(@PathVariable("userId") Integer userId) {
        CoUser coUser = coUserMapper.selectByPrimaryKey(userId);

        return coUser;

    }

    @Override
    public int updateCouserByUserId(@RequestBody CoUser coUser) {
        int i = coUserMapper.updateByPrimaryKeySelective(coUser);
        if(i>0){
            return  i;
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @Override
    public List<PtRole> getRoleByUser(@RequestParam("userId") Integer userId) {

        List<PtRole> roleByUser = ptRoleMapper.getRoleByUser(userId);
        if (roleByUser!=null){
            return roleByUser;
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @Override
    public List<PtResource> findPermsByRoleId(@RequestParam("roleId") Integer roleId) {
        List<PtResource> permsByRoleId = ptResourceMapper.findPermsByRoleId(roleId);
        if (permsByRoleId!=null){
            return permsByRoleId;
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @Override
    public List<PtResource> findPermsByUserId(@RequestParam("userId") Integer userId) {
        List<PtResource> ptResources = ptResourceMapper.queryResourceByUserIdCurrency(userId);
        if (ptResources != null){
            return  ptResources;
        }
        throw  new SellException(ResultEnum.INSERT);
    }

    @Override
    public List<PtResource> findAllPerms() {
        List<PtResource> ptResources = ptResourceMapper.queryAll();
        if (ptResources!=null){
    return ptResources;
}
        throw  new SellException(ResultEnum.INSERT);
    }



}

