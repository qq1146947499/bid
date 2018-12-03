package com.bid.springcloud.config.shiro;

import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.service.PtUserClientService;
import com.bid.springcloud.shiro.PtRoleShiro;
import com.bid.springcloud.shiro.PtUserShiro;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
public class AuthRealm extends AuthorizingRealm {

    //222
    @Autowired
    private PtUserClientService ptUserClientService;

    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        PtUserShiro user = (PtUserShiro) principals.fromRealm(this.getClass().getName()).iterator().next();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        List<String> permissionList = new ArrayList<>();
        List<String> roleNameList = new ArrayList<>();
        if (user.getIsSuper().equals("Y")) {
            // 超级管理员，添加所有角色、添加所有权限
            authorizationInfo.addRole("*");
            authorizationInfo.addStringPermission("*");
        }else {
            Set<PtRoleShiro> roleSet = user.getPtRoleShiro();
            if (CollectionUtils.isNotEmpty(roleSet)) {
                for(PtRoleShiro role : roleSet) {
                    roleNameList.add(role.getRoleName());
                    Set<PtResource> permissionSet = role.getPtResource();
                    if (CollectionUtils.isNotEmpty(permissionSet)) {
                        for (PtResource permission : permissionSet) {
                            permissionList.add(permission.getResourceName());
                        }
                    }
                }


            }

        }
        authorizationInfo.addStringPermissions(permissionList);
        authorizationInfo.addRoles(roleNameList);
        return authorizationInfo;


    }

    // 认证登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        PtUserShiro user = ptUserClientService.findByUsername(username);

        if (user == null) {
            // 用户不存在
            return null;
        } else {
            // 密码存在
            // 第一个参数 ，登陆后，需要在session保存数据
            // 第二个参数，查询到密码(加密规则要和自定义的HashedCredentialsMatcher中的HashAlgorithmName散列算法一致)
            // 第三个参数 ，realm名字
            return new SimpleAuthenticationInfo(user, user.getUserName(), this.getClass().getName());
        }

    }
}
