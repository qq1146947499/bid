package com.bid.springcloud.service.impl;

import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.*;
import com.bid.springcloud.mapper.CoUserMapper;
import com.bid.springcloud.mapper.PtRoleMapper;
import com.bid.springcloud.mapper.PtUserMapper;
import com.bid.springcloud.mapper.PtUserRoleMapper;
import com.bid.springcloud.service.PtUserClientService;
import com.bid.springcloud.shiro.PtUserShiro;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
public class PtUserServiceImpl extends BaseApiService implements PtUserClientService {



    @Resource
    private PtUserMapper ptUserMapper;

    @Resource
    private PtUserRoleMapper ptUserRoleMapper;


    @Resource
    private PtRoleMapper ptRoleMapper;




    @Override
    public PtUser query1(@PathVariable("id") Integer id) {
        return ptUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public ResponseBase deleteUserRoles(@RequestBody Map<String, Object> map) {
        int i = ptUserRoleMapper.deleteUserRoles(map);
        if(i>0){
            return  setResultSuccess("删除角色成功");
        }
        return setResultSuccess("删除角色失败");
    }


    @Override
    public ResponseBase queryAll(@PathVariable(value = "page") Integer page, @PathVariable(value = "rows") Integer rows) {
        PageHelper.startPage(page, rows);
        List<PtUser> list = ptUserMapper.selectByExample(new PtUserExample());
        PageInfo<PtUser> pageInfo = new PageInfo<>(list,4);

        if (pageInfo != null) {
            return setResultSuccess(pageInfo);
        }

        return setResultError("查询失败");
    }


    @Override
    public PtUser query4Login(@RequestBody PtUser ptUser) {
        try {
            PtUserExample ptUserExample = new PtUserExample();
            ptUserExample.createCriteria().andUserNameEqualTo(ptUser.getUserName())
                    .andUserPassEqualTo(ptUser.getUserPass());
            List<PtUser> ptUsers = ptUserMapper.selectByExample(ptUserExample);
            if (isNotNull(ptUsers)) {
               return ptUsers.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ResponseBase insertUser(@RequestBody PtUser ptUser) {

        int i = ptUserMapper.insertSelective(ptUser);
        if(i>0){
            return setResultSuccess("添加用户成功");
        }
        return setResultError("添加用户失败");
    }

    @Override
    public ResponseBase queryById(@PathVariable(value = "userId") Integer userId) {

        PtUser ptUser = ptUserMapper.selectByPrimaryKey(userId);
        if(isNotNull(ptUser)){
            return  setResultSuccess(ptUser);
        }
        return setResultError("没找到用户");
    }

    @Override
    public ResponseBase deleteUserById(@RequestParam(value = "userId") Integer userId) {
        int i = ptUserMapper.deleteByPrimaryKey(userId);
        if(i>0){
            return  setResultSuccess("删除用户成功");
        }
        return setResultError("删除用户失败");
    }

    @Override
    public ResponseBase insertUserRoles( @RequestBody Map<String, Object> map) {

      int i =   ptUserRoleMapper.insertUserRoles(map);
      if (i>0){
          return setResultSuccess("插入角色成功");
      }

        return setResultError("插入角色失败");
    }

    @Override
    public ResponseBase insertUserRole(@RequestBody PtUserRole ptUserRole) {

        int i = ptUserRoleMapper.insertSelective(ptUserRole);
        if(i>0){
            return  setResultSuccess("增加角色成功");
        }
        return setResultError("增加角色失败");
    }


    @Override
    public ResponseBase queryRoleidsByUserid(@PathVariable(value = "id") Integer id) {
        List<Integer> UserRoles = ptRoleMapper.queryRoleByUId(id);
        if(isNotNull(UserRoles)){
            return  setResultSuccess(UserRoles);
        }
        return setResultError("没找到用户角色");
    }



    public ResponseBase updateUser(@RequestBody PtUser ptUser) {
        int i = ptUserMapper.updateByPrimaryKeySelective(ptUser);
        if(i>0){
            return  setResultSuccess("更新用户成功");
        }
        return setResultError("更新用户失败");
    }

    @Override
    public PtUserShiro findByUsername(@RequestParam("userName") String userName) {
        PtUserShiro byUsername = ptUserMapper.findByUsername(userName);
        if(byUsername!=null){
            return  byUsername;
        }
        return null;
    }

    @Override
    public PtUserShiro findByUsernameLogin(@RequestParam("userName") String userName) {
        PtUserShiro byUsernameLogin = ptUserMapper.findByUsernameLogin(userName);
        return byUsernameLogin;
    }

}

