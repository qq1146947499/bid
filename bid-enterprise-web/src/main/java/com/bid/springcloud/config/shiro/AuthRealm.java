package com.bid.springcloud.config.shiro;

import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.CpUser;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.service.CpuserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Slf4j
public class AuthRealm extends AuthorizingRealm {

    @Resource
    private CpuserService couserService;

    // 授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //授权
        log.debug("授予角色和权限");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 添加权限 和 角色信息
        Subject subject = SecurityUtils.getSubject();
        CoUser user = (CoUser) subject.getPrincipal();
        if (user.getUserType().equals("C")) {
            // 超级管理员，添加所有角色、添加所有权限
            authorizationInfo.addRole("*");
            authorizationInfo.addStringPermission("*");
        } else {
            Integer userId = user.getUserId();
            List<PtRole> roles = couserService.getRoleByUser(userId);
            if (null != roles && roles.size() > 0) {
                for (PtRole role : roles) {
                    authorizationInfo.addRole(role.getRoleName());
                    // 角色对应的权限数据
                    List<PtResource> perms = this.couserService.findPermsByRoleId(role
                            .getRoleId());
                    if (null != perms && perms.size() > 0) {
                        // 授权角色下所有权限
                        for (PtResource perm : perms) {
                            authorizationInfo.addStringPermission(perm
                                    .getResourceName());
                        }
                    }
                }
            }
        }
        return authorizationInfo;
    }

    // 认证登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String username = usernamePasswordToken.getUsername();
        CpUser cpUser= new CpUser();
        cpUser.setUserAccount(username);
        CpUser user = couserService.queryByCpUser(cpUser);

        if (user == null) {
            // 用户不存在
            return null;
        } else {
            // 密码存在
            // 第一个参数 ，登陆后，需要在session保存数据
            // 第二个参数，查询到密码(加密规则要和自定义的HashedCredentialsMatcher中的HashAlgorithmName散列算法一致)
            // 第三个参数 ，realm名字
            return new SimpleAuthenticationInfo(user, user.getUserPass(), this.getClass().getName());
        }

    }
}
