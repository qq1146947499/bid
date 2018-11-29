package com.bid.springcloud.service.impl;

import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.*;
import com.bid.springcloud.mapper.PtRoleMapper;
import com.bid.springcloud.mapper.RoleResourceMapper;
import com.bid.springcloud.service.PtRoleClientService;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class PtRoleServiceImpl extends BaseApiService implements PtRoleClientService {

    @Resource
    private PtRoleMapper ptRoleMapper;

    @Resource
    private RoleResourceMapper roleResourceMapper;



    @Override
    public ResponseBase queryAllRole() {
        List<PtRole> ptRoles = ptRoleMapper.queryAll();
        if (isNotNull(ptRoles)){
            return  setResultSuccess(ptRoles);
        }
        return setResultError("用户查询失败");
    }

    @Override
    public ResponseBase deleteRoleResources(@RequestBody Map<String, Object> map) {

        int i = roleResourceMapper.deleteRoleResources(map);
        if(i>0){
            return  setResultSuccess("删除权限成功");
        }
        return setResultSuccess("删除权限失败");

    }

    @Override
    public ResponseBase insertRoleResources(@RequestBody Map<String, Object> map) {
        roleResourceMapper.deleteRoleResources(map);
        int i =   roleResourceMapper.insertRoleResources(map);
        if (i>0){
            return setResultSuccess("插入权限成功");
        }

        return setResultError("插入权限失败");

    }

    @Override
    public ResponseBase queryAll(@PathVariable(value = "page") Integer page, @PathVariable(value = "rows") Integer rows) {
        PageHelper.startPage(page, rows);
        List<PtRole> list = ptRoleMapper.selectByExample(new PtRoleExample());
        PageInfo<PtRole> pageInfo = new PageInfo<>(list,4);

        if (pageInfo != null) {
            return setResultSuccess(pageInfo);
        }
        return setResultError("查询失败");

    }


    @Override
    public ResponseBase insertRole(@RequestBody PtRole ptRole) {
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
