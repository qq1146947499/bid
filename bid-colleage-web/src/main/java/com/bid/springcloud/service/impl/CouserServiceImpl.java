package com.bid.springcloud.service.impl;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.service.CoUserClientService;
import com.bid.springcloud.service.CouserService;
import com.bid.springcloud.service.RegisterMailboxProducer;
import com.bid.springcloud.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.*;

@Service
@Slf4j
public class CouserServiceImpl extends BaseApiService implements CouserService {


    @Resource
    private CoUserClientService coUserClientService;


    @Autowired
    private RegisterMailboxProducer registerMailboxProducer;
    @Value("${messages.queue}")
    private String MESSAGESQUEUE;




    @Override
    public CoUser queryByCoUser(CoUser coUser) {
        CoUser coUser1 = coUserClientService.queryByCoUser(coUser);
        log.debug(coUser+"开始查询");
            if (coUser1!=null){
                return  coUser1;
            }
        log.debug("查询失败");
        throw new SellException(ResultEnum.SELECT);
    }

    @Override
    public Permission  findPermsByUserId(Integer userId) {
        List<PtResource> permsByUserId = coUserClientService.findPermsByUserId(userId);
        Map<Integer, Permission> permissionMap = new HashMap<Integer, Permission>();
        List<PtResource> tmp = new ArrayList<>();

        //遍历转换成集合放入tmp
        for (int i =0;i<permsByUserId.size();i++ ){
            String s = JsonUtils.objectToJson(permsByUserId.get(i));
            PtResource resourcetmp = JsonUtils.jsonToPojo(s, PtResource.class);
            tmp.add(resourcetmp);
        }


        //遍历所有权限，放入放入Permission对象中
        List<Permission> ps = new ArrayList<>();

        for (PtResource ptResource:tmp){
            Permission permission = new Permission();
            permission.setName(ptResource.getResourceName());
            permission.setId(ptResource.getResourceId());
            permission.setPid(Integer.parseInt(ptResource.getpResourceId()));
            permission.setUrl(ptResource.getResourcePath());
            permission.setIcon(ptResource.getIcon());
            ps.add(permission);
        }

        //遍历ps，
        Permission root=null;
        for (Permission p :ps){
            permissionMap.put(p.getId(),p);
        }
        for (Permission p :ps){
            Permission child =  p;
            if(child.getPid()==0){
                root = p;
            }else {
                Permission parent = permissionMap.get(child.getPid());
                parent.getChildren().add(child);
            }
        }

        return root;
    }

    @Override
    public ResponseBase addCouser(CoUser coUser,boolean isRegister) {
        isRegister=false;
        int i = coUserClientService.addCoUser(coUser,isRegister);
        if (i>0){
            return  setResultSuccess("插入成功");
        }
        throw  new SellException(ResultEnum.PARAM_ERROR);
    }

    @Override
    public ResponseBase queryByuserName(String userName) {
        List<CoUser> coUsers = coUserClientService.queryByuserName(userName);
        if (isNotNull(coUsers)){
            return setResultSuccess(coUsers);
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }

    @Override
    public ResponseBase deleteCoUserById(Integer userId) {
        int i = coUserClientService.deleteCoUserById(userId);
        if (i>0){
            return  setResultSuccess("删除成功");
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }

    @Override
    public ResponseBase queryCoUserByUserid(Integer userId) {
        CoUser coUser = coUserClientService.queryCoUserByUserid(userId);
        if (isNotNull(coUser)){
            return  setResultSuccess(coUser);
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }

    @Override
    public ResponseBase updateCouserByUserId(CoUser coUser) {
       int i = coUserClientService.updateCouserByUserId(coUser);
        if (i>0){
            return  setResultSuccess(coUser);
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }

    @Override
    public CoUser queryLoginByCouser( CoUser coUser) {
        CoUser coUser1    = coUserClientService.queryByCoUser(coUser);
        if (isNotNull(coUser1)){
            return  coUser1;
        }
        throw new SellException(ResultEnum.PARAM_ERROR);

    }

    @Override
    public List<PtRole> getRoleByUser(Integer userId) {
        log.debug("用户查询角色开始");
        List<PtRole> roleByUser = coUserClientService.getRoleByUser(userId);
        if(roleByUser!=null){
            return roleByUser;
        }
       throw  new SellException(ResultEnum.SELECT);
    }

    @Override
    public List<PtResource> findPermsByRoleId(Integer roleId) {
        log.debug("用户查询权限开始");
        List<PtResource> permsByRoleId = coUserClientService.findPermsByRoleId(roleId);
        if(permsByRoleId!=null){
            return permsByRoleId;
        }
        throw  new SellException(ResultEnum.SELECT);

    }

    @Override
    public ResponseBase registerUser(CoUser coUser,boolean isRegister) {
        int orderMainId = RandomUtils.nextInt(1, 1000000);
        coUser.setUserId(orderMainId);
        int i = coUserClientService.addCoUser(coUser,isRegister);

        return setResultSuccess("添加成功");
    }
}
