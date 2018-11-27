package com.bid.springcloud.service.impl;

import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.entities.PtRoleExample;
import com.bid.springcloud.entities.RoleResource;
import com.bid.springcloud.entities.RoleResourceExample;
import com.bid.springcloud.mapper.PtRoleMapper;
import com.bid.springcloud.mapper.RoleResourceMapper;
import com.bid.springcloud.service.PtRoleClientService;
import com.bid.springcloud.utils.EasyUIDataGrid;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PtRoleServiceImpl extends BaseApiService implements PtRoleClientService {

    @Resource
    private PtRoleMapper ptRoleMapper;

    @Resource
    private RoleResourceMapper roleResourceMapper;


    public ResponseBase demo(Integer userId){

        //List<PtRole> ptRoles = roleResourceMapper.selRoleAll();
        List<Integer> ptRoles = ptRoleMapper.queryRoleByUId(userId);

        return setResultSuccess(ptRoles);
    }

    @Override
    public ResponseBase queryAllRole() {
        List<PtRole> ptRoles = ptRoleMapper.queryAll();
        if (isNotNull(ptRoles)){
            return  setResultSuccess(ptRoles);
        }
        return setResultError("用户查询失败");
    }

    @Override
    public ResponseBase addRoleResource(@ModelAttribute RoleResource roleResource) {
        int i = roleResourceMapper.insertSelective(roleResource);
        if (i>0){
            return  setResultSuccess("增加用户权限成功");
        }

        return setResultError("增加用户权限失败");
    }

    @Override
    public ResponseBase updateRoleResource(@RequestParam("roleIdX") Integer roleIdX, @ModelAttribute RoleResource roleResource) {
        RoleResourceExample roleResourceExample = new RoleResourceExample();
        roleResourceExample.createCriteria()
                .andRoleIdEqualTo(roleIdX);

        int i = roleResourceMapper.updateByExampleSelective(roleResource,roleResourceExample);
        if (i>0){
            return  setResultSuccess("更新角色权限成功");
        }

        return setResultError("更新角色权限失败");

    }

    @Override
    public ResponseBase insertRole(@ModelAttribute PtRole ptRole) {
        int i = ptRoleMapper.insertSelective(ptRole);
        if (i > 0) {
            return setResultSuccess("添加成功");
        }
        return setResultError("添加失败");
    }

    @Override
    public ResponseBase queryRole(@PathVariable(value = "roleId") Integer roleId) {
        PtRole ptRole = ptRoleMapper.selectByPrimaryKey(roleId);
        if (isNotNull(ptRole)) {
            return setResultSuccess(ptRole);
        }

        return setResultError("查询失败");
    }

    @Override
    public ResponseBase deleRole(@PathVariable(value = "roleId") Integer roleId) {
        int i = ptRoleMapper.deleteByPrimaryKey(roleId);
        if (i > 0) {
            return setResultSuccess("删除成功");
        }
        return setResultError("删除失败");
    }

}
