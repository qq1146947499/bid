package com.bid.springcloud.service.impl;


import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtResourceExample;
import com.bid.springcloud.mapper.PtResourceMapper;
import com.bid.springcloud.service.PtResourceClientService;
import com.bid.springcloud.utils.EasyUIDataGrid;

import javax.annotation.Resource;
import java.util.List;



import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;


@Service
public class PtResourceClientServiceImpl extends BaseApiService implements PtResourceClientService {


    @Resource
    private PtResourceMapper ptResourceMapper;



    @Override
    public EasyUIDataGrid queryAll(int page, int rows) {
        PageHelper.startPage(page,rows);
        List<PtResource> list = ptResourceMapper.selectByExample(new PtResourceExample());
        PageInfo<PtResource> pageInfo = new PageInfo<>(list);
        EasyUIDataGrid easyUIDataGrid = new EasyUIDataGrid();
        easyUIDataGrid.setRows(pageInfo.getList());
        easyUIDataGrid.setTotal(pageInfo.getTotal());
        return easyUIDataGrid;
    }

    @Override
    public ResponseBase queryByRoleID(Integer id) {
        PtResource ptResource = ptResourceMapper.selectByPrimaryKey(id);
        if(ptResource!=null){
            return setResultSuccess(ptResource);
        }
        return setResultError("查询资源失败");
    }

    @Override
    public ResponseBase updateResource(PtResource ptResource) {
        int i = ptResourceMapper.updateByPrimaryKeySelective(ptResource);
        if(i>0){
           return setResultSuccess("更新资源成功");
        }

        return setResultError("更新资源失败");
    }

    @Override
    public ResponseBase deletePtResource(Integer roleId) {
        int i = ptResourceMapper.deleteByPrimaryKey(roleId);
        if(i>0){
            return setResultSuccess("删除资源成功");
        }
        return setResultError("删除资源失败");
    }
}


