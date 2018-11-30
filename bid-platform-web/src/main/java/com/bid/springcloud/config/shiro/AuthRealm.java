package com.bid.springcloud.config.shiro;

import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.service.PtUserClientService;
import com.bid.springcloud.shiro.PtRoleShiro;
import com.bid.springcloud.shiro.PtUserShiro;
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

public class AuthRealm extends AuthorizingRealm {

    //222
    @Autowired
    private PtUserClientService ptUserClientService;

    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        PtUserShiro user = (PtUserShiro) principals.fromRealm(this.getClass().getName()).iterator().next();
        List<String> permissionList = new ArrayList<>();
        List<String> roleNameList = new ArrayList<>();
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
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(permissionList);
        info.addRoles(roleNameList);
        return info;
    }

    // 认证登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        PtUserShiro user = ptUserClientService.findByUsername(username);
        return new SimpleAuthenticationInfo(user, user.getUserName(), this.getClass().getName());
    }
}
