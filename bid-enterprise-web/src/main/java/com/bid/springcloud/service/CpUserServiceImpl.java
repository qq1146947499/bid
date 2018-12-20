package com.bid.springcloud.service;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.*;
import com.bid.springcloud.enums.ResultEnum;
import com.bid.springcloud.exception.SellException;
import com.bid.springcloud.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

@Slf4j
public class CpUserServiceImpl extends BaseApiService implements CpuserService {

    @Resource
    private CpUserClientService cpUserClientService;


    @Override
    public CpUser queryByCpUser(CpUser cpUser) {

        CpUser CpUser1 = cpUserClientService.queryCouser(cpUser);
        log.debug(cpUser + "开始查询");
        if (CpUser1 != null) {
            return CpUser1;
        }
        log.debug("查询失败");
        throw new SellException(ResultEnum.SELECT);
    }


    @Override
    public Permission findPermsByUserId(Integer userId) {
        List<PtResource> permsByUserId = cpUserClientService.findPermsByUserId(userId);
        Map<Integer, Permission> permissionMap = new HashMap<Integer, Permission>();
        List<PtResource> tmp = new ArrayList<>();

        //遍历转换成集合放入tmp
        for (int i = 0; i < permsByUserId.size(); i++) {
            String s = JsonUtils.objectToJson(permsByUserId.get(i));
            PtResource resourcetmp = JsonUtils.jsonToPojo(s, PtResource.class);
            tmp.add(resourcetmp);
        }


        //遍历所有权限，放入放入Permission对象中
        List<Permission> ps = new ArrayList<>();

        for (PtResource ptResource : tmp) {
            Permission permission = new Permission();
            permission.setName(ptResource.getResourceName());
            permission.setId(ptResource.getResourceId());
            permission.setPid(Integer.parseInt(ptResource.getpResourceId()));
            permission.setUrl(ptResource.getResourcePath());
            permission.setIcon(ptResource.getIcon());
            ps.add(permission);
        }

        //遍历ps，
        Permission root = null;
        for (Permission p : ps) {
            permissionMap.put(p.getId(), p);
        }
        for (Permission p : ps) {
            Permission child = p;
            if (child.getPid() == 0) {
                root = p;
            } else {
                Permission parent = permissionMap.get(child.getPid());
                parent.getChildren().add(child);
            }
        }

        return root;
    }

    @Override
    public ResponseBase addCpUser(CpUser cpUser) {
        int i = cpUserClientService.addCpuser(cpUser);
        if (i > 0) {
            return setResultSuccess("插入成功");
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }









    @Override
    public CpUser queryLoginByCpUser(CpUser cpUser) {
        return null;
    }

    @Override
    public ResponseBase queryByuserName(String userAccount) {
        List<CpUser> CpUsers = cpUserClientService.queryByuserName(userAccount);
        if (isNotNull(CpUsers)) {
            return setResultSuccess(CpUsers);
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }
    @Override
    public ResponseBase deleteCpUserById(Integer userId) {
        int i = cpUserClientService.deleteCpUserById(userId);
        if (i > 0) {
            return setResultSuccess("删除成功");
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }

    @Override
    public ResponseBase queryCpUserByUserid(Integer userId) {
        CpUser cpUser = cpUserClientService.queryCpUserByUserid(userId);
        if (isNotNull(cpUser)) {
            return setResultSuccess(cpUser);
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }

    @Override
    public ResponseBase updateCpUserByUserId(CpUser cpUser) {
        int i = cpUserClientService.updateCpUserByUserId(cpUser);
        if (i > 0) {
            return setResultSuccess(cpUser);
        }
        throw new SellException(ResultEnum.PARAM_ERROR);
    }

/*    @Override
    public CpUser queryLoginByCpUser(@RequestBody CpUser cpUser) {
        CpUser CpUser1 = cpUserClientService.queryByCpUser(cpUser);
        if (isNotNull(CpUser1)) {
            return CpUser1;
        }
        throw new SellException(ResultEnum.PARAM_ERROR);

    }*/

    @Override
    public List<PtRole> getRoleByUser(Integer userId) {
        log.debug("用户查询角色开始");
        List<PtRole> roleByUser = cpUserClientService.getRoleByUser(userId);
        if (roleByUser != null) {
            return roleByUser;
        }
        throw new SellException(ResultEnum.SELECT);
    }

    @Override
    public List<PtResource> findPermsByRoleId(Integer roleId) {
        log.debug("用户查询权限开始");
        List<PtResource> permsByRoleId = cpUserClientService.findPermsByRoleId(roleId);
        if (permsByRoleId != null) {
            return permsByRoleId;
        }
        throw new SellException(ResultEnum.SELECT);

    }
}
