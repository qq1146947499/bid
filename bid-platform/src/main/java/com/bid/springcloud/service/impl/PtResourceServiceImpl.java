package com.bid.springcloud.service.impl;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.*;
import com.bid.springcloud.mapper.PtResourceMapper;
import com.bid.springcloud.mapper.RoleResourceMapper;
import com.bid.springcloud.service.PtResourceClientService;
import com.bid.springcloud.utils.EasyUIDataGrid;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class PtResourceServiceImpl extends BaseApiService implements PtResourceClientService {



    @Resource
    private PtResourceMapper ptResourceMapper;

    @Resource
    private RoleResourceMapper roleResourceMapper;


    @Override
    public ResponseBase queryAllRootPtResource(@PathVariable(value = "page") Integer page, @PathVariable(value = "row") Integer row) {
        PageHelper.startPage(page,row);
        List<PtResource> list = ptResourceMapper.selectByExample(new PtResourceExample());
        PageInfo<PtResource> pageInfo = new PageInfo<>(list);
        EasyUIDataGrid easyUIDataGrid = new EasyUIDataGrid();
        easyUIDataGrid.setRows(pageInfo.getList());
        easyUIDataGrid.setTotal(pageInfo.getTotal());
        if(easyUIDataGrid!=null){
            return  setResultSuccess(easyUIDataGrid);
        }

        return setResultError("查询失败");
    }

    @Override
    public ResponseBase queryChildPermissions(@PathVariable(value = "pid") Integer pid) {

        List<PtResource> ptResources = ptResourceMapper.queryChildPermissions(pid);
        if (isNotNull(ptResources)){
            return  setResultSuccess(ptResources);
        }
        return setResultError("查询失败");
    }



    @Override
    public ResponseBase insertPtResource(@ModelAttribute PtResource ptResource) {
        int i = ptResourceMapper.insertSelective(ptResource);
        if (i>0){
            return setResultSuccess("增加成功");
        }
        return setResultError("增加成功");

    }


    @Override
    public ResponseBase queryResourceById(@PathVariable(value = "id") Integer id) {
        PtResource ptResource = ptResourceMapper.selectByPrimaryKey(id);
        if(isNotNull(ptResource)){
            return  setResultSuccess(ptResource);
        }
        return setResultError("查询失败");
    }

    @Override
    public ResponseBase updatePtResource(@ModelAttribute PtResource ptResource) {
        int i = ptResourceMapper.insertSelective(ptResource);
        if(isNotNull(i)){
            return  setResultSuccess("更新成功");
        }
        return setResultError("更新失败");
    }

    @Override
    public ResponseBase deletePtResource(@ModelAttribute PtResource ptResource) {
        PtResourceExample ptResourceExample = new PtResourceExample();
        ptResourceExample.createCriteria().andPResourceIdEqualTo(ptResource.getpResourceId());
        int i = ptResourceMapper.deleteByExample(ptResourceExample);
        if(isNotNull(i)){
            return  setResultSuccess("删除成功");
        }
        return setResultError("删除失败");

    }

    @Override
    public ResponseBase queryPtResourcesByRoleid(@PathVariable(value = "roleid") Integer roleid) {

        List<Integer> ptResources = ptResourceMapper.queryPtResourcesByRoleid(roleid);

        if(isNotNull(ptResources)){
            return  setResultSuccess(ptResources);
        }
        return setResultError("查询失败");

    }

    public ResponseBase queryPtResourcesByUser(@ModelAttribute PtUser ptUser) {

        PtResource ptResource = ptResourceMapper.queryPtResourcesByUser(ptUser);
        if (isNotNull(ptResource)){
            return   setResultSuccess(ptResource);
        }

        return setResultError("查询失败");
    }

}
