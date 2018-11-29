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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PtResourceServiceImpl extends BaseApiService implements PtResourceClientService {



    @Resource
    private PtResourceMapper ptResourceMapper;

    @Resource
    private RoleResourceMapper roleResourceMapper;



    @Override
    public ResponseBase queryAll() {
        List<PtResource> ptResources = ptResourceMapper.queryAll();
        if (ptResources!=null){
            return  setResultSuccess(ptResources);
        }
        return setResultSuccess("查询失败");
    }

    @Override
    public ResponseBase delResource(@RequestParam("id") Integer resourceId) {
        int i = ptResourceMapper.deleteByPrimaryKey(resourceId);
        if (i>0){
            return setResultSuccess("删除成功");
        }
        return setResultError("删除失败");
    }


    @Override
    public ResponseBase addResource(@RequestBody PtResource ptResource) {

        int i= ptResourceMapper.insertIcon(ptResource);
        if (i>0){
            return  setResultSuccess("增加成功");
        }
        return setResultError("增加失败");
    }

    @Override
    public ResponseBase editResource(@RequestBody PtResource ptResource) {
        int i = ptResourceMapper.updateByPrimaryKey(ptResource);
        if (i>0){
            return  setResultSuccess("更新成功");
        }
        return setResultError("更新失败");
    }


}
