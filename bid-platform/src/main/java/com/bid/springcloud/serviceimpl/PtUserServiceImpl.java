package com.bid.springcloud.serviceimpl;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.entities.PtUserExample;
import com.bid.springcloud.mapper.CoUserMapper;
import com.bid.springcloud.mapper.PtUserMapper;
import com.bid.springcloud.service.PtUserClientService;
import com.bid.springcloud.utils.EasyUIDataGrid;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class PtUserServiceImpl extends BaseApiService implements PtUserClientService {

    @Resource
    private CoUserMapper coUserMapper;

    @Resource
    private PtUserMapper ptUserMapper;

    public CoUser get(@PathVariable Integer id) {
        System.out.println("coUserService");
        CoUser coUser = coUserMapper.selectByPrimaryKey(id);
        System.out.println(coUser.toString());
        return coUser;
    }

    public PtUser get1(@PathVariable Integer id) {
        System.out.println("coUserService");
        PtUser coUser = ptUserMapper.selectByPrimaryKey(id);
        System.out.println(coUser.toString());
        return coUser;
    }

    public EasyUIDataGrid queryAll( int page, int rows) {
        PageHelper.startPage(page,rows);
        List<PtUser> list = ptUserMapper.selectByExample(new PtUserExample());
        PageInfo<PtUser> pageInfo = new PageInfo<>(list);
        EasyUIDataGrid easyUIDataGrid = new EasyUIDataGrid();
        easyUIDataGrid.setRows(pageInfo.getList());
        easyUIDataGrid.setTotal(pageInfo.getTotal());

        return easyUIDataGrid;
    }

    @Override
    public ResponseBase query4Login(PtUser ptUser) {
        PtUserExample example = new PtUserExample();
        example.createCriteria().andUserIdEqualTo(ptUser.getUserId());
        example.createCriteria().andUserNameEqualTo(ptUser.getUserName());
        List<PtUser> ptUsers = ptUserMapper.selectByExample(example);
        if(ptUsers.size()>0){
            PtUser coUser1 = ptUsers.get(0);
            return setResultSuccess(coUser1);
        }
        return setResultError("查询失败");

    }

    @Override
    public ResponseBase insertCoCoUser(PtUser ptUser) {
           int i = ptUserMapper.insertSelective(ptUser);
        if(i>0){
            return setResultSuccess("添加用户成功");
        }
        return setResultError("添加用户失败");

    }

    @Override
    public ResponseBase updateCoCoUser(PtUser ptUser) {

        int i = ptUserMapper.updateByPrimaryKey(ptUser);
        if(i>0){
            return  setResultSuccess("更新成功");
        }
        return  setResultError("更新失败");

    }

    @Override
    public ResponseBase deleteCoCoUserById(Integer id) {
        int i = ptUserMapper.deleteByPrimaryKey(id);
        if(isNotNull(i)){
            return setResultSuccess("删除成功");
        }
        return  setResultError("删除失败");

    }


    @Override
    public ResponseBase queryRoleidsByCoCoUserid(Integer id) {
        PtUser ptUser = ptUserMapper.selectByPrimaryKey(2);
        boolean aNull = isNull(ptUser);
        if(isNull(ptUser)){
            System.out.println(ptUser);
            return  setResultSuccess("查询用户角色失败");
        }
        return setResultSuccess(ptUser);
    }


}
