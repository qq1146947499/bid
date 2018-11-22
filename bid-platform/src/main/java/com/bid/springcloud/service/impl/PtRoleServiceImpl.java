package com.bid.springcloud.service.impl;

import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.entities.PtRoleExample;
import com.bid.springcloud.mapper.PtRoleMapper;
import com.bid.springcloud.service.PtRoleClientService;
import com.bid.springcloud.utils.EasyUIDataGrid;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PtRoleServiceImpl extends BaseApiService implements PtRoleClientService {

    @Resource
    private PtRoleMapper ptRoleMapper;

    @Override
    public EasyUIDataGrid queryAll(int page, int rows) {
        PageHelper.startPage(page,rows);
        List<PtRole> list = ptRoleMapper.selectByExample(new PtRoleExample());
        PageInfo<PtRole> pageInfo = new PageInfo<>(list);
        EasyUIDataGrid easyUIDataGrid = new EasyUIDataGrid();
        easyUIDataGrid.setRows(pageInfo.getList());
        easyUIDataGrid.setTotal(pageInfo.getTotal());
        return easyUIDataGrid;
    }

    @Override
    public ResponseBase queryRole(PtRole ptRole) {
        PtRoleExample example = new PtRoleExample();
        example.createCriteria().andRoleIdEqualTo(ptRole.getRoleId());
        List<PtRole> ptRoles = ptRoleMapper.selectByExample(example);
        if(ptRoles.size()>0){
            PtRole ptRoles1 = ptRoles.get(0);
            return setResultSuccess(ptRoles1);
        }
        return setResultError("查询角色失败");
    }

    @Override
    public ResponseBase updatePtRole(PtRole ptRole) {
        int i = ptRoleMapper.updateByPrimaryKeySelective(ptRole);
        if(i>0){
            return  setResultSuccess("更新角色成功");
        }
        return  setResultError("更新角色失败");

    }

    @Override
    public ResponseBase insertRolePermission(PtRole ptRole) {
        int i = ptRoleMapper.insertSelective(ptRole);
        if(i>0){
            return setResultSuccess("添加角色成功");
        }
        return setResultError("添加角色失败");
    }
}


