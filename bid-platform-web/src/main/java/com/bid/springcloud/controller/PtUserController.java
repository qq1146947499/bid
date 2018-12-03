package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.VO.ResultVO;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.*;
import com.bid.springcloud.service.PtResourceClientService;
import com.bid.springcloud.service.PtRoleClientService;
import com.bid.springcloud.service.PtUserClientService;
import com.bid.springcloud.shiro.PtUserShiro;
import com.bid.springcloud.utils.JsonUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;


@Controller
public class PtUserController {


    @Resource
    private PtUserClientService ptUserClientService;

    @Resource
    private PtRoleClientService ptRoleClientService;

    @Resource
    private PtResourceClientService ptResourceClientService;


    @RequestMapping(value = "/demo/finauser", method = RequestMethod.GET)
    public PtUser demo(@RequestParam("userName") String userName) {
        return ptUserClientService.findByUsername(userName);
    }


    @RequestMapping("/pt/user/dounAssign")
    @ResponseBody
    public ResponseBase ptUserdounAssign(Integer userId, Integer[] assignroleids) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("roleids", assignroleids);
        ResponseBase base = ptUserClientService.deleteUserRoles(map);
        return base;
    }

    @RequestMapping("/pt/user/doAssign")
    @ResponseBody
    public ResponseBase ptUserDoAssignAdd(@RequestParam("userId") Integer userId, @RequestParam("unassignroleids") Integer[] unassignroleids) {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        map.put("roleids", unassignroleids);
        ResponseBase base = ptUserClientService.insertUserRoles(map);
        return base;
    }

    @RequestMapping("/pt/user/assign")
    public String ptuserAssign(@RequestParam("id") Integer id, Model model) {
        List<PtRole> assingedRoles = new ArrayList<>();
        List<PtRole> unassignRoles = new ArrayList<>();
        ResponseBase role = ptRoleClientService.queryAllRole();
        ResponseBase userRoleId = ptUserClientService.queryRoleidsByUserid(id);
        List<PtRole> roleList = (List<PtRole>) role.getData();
        System.out.println(roleList);
        List<Integer> userRoleIdData = (List<Integer>) userRoleId.getData();
        List<PtRole> tmp = new ArrayList<>();
        for (int i = 0; i < roleList.size(); i++) {
            String s = JsonUtils.objectToJson(roleList.get(i));
            PtRole ptRole1 = JsonUtils.jsonToPojo(s, PtRole.class);
            tmp.add(ptRole1);
        }

        for (PtRole ptRole : tmp) {
            if (userRoleIdData.contains(ptRole.getRoleId())) {
                assingedRoles.add(ptRole);
            } else {
                unassignRoles.add(ptRole);
            }


        }
        model.addAttribute("role", unassignRoles);
        model.addAttribute("userRole", assingedRoles);
        model.addAttribute("userId", id);
        return "/user/assign";
    }


    @RequestMapping("/pt/user/update")
    @ResponseBody
    public ResponseBase userDdit(PtUser ptUser) {
        ResponseBase responseBase = ptUserClientService.updateUser(ptUser);
        return responseBase;
    }

    @RequestMapping("/pt/user/insert")
    @ResponseBody
    public ResponseBase userAdd(PtUser ptUser) {
        ResponseBase responseBase = ptUserClientService.insertUser(ptUser);
        return responseBase;
    }

    @RequestMapping("/pt/user/edit")
    public String toDdit(@RequestParam("id") Integer id, Model model) {
        PtUser ptUser = ptUserClientService.query1(id);
        if (ptUser != null) {
            model.addAttribute("user", ptUser);
        }

        return "user/edit";
    }

    @ResponseBody
    @RequestMapping("/pt/user/delete")
    public ResponseBase delPtuser(@RequestParam(value = "id") Integer userId) {
        ResponseBase responseBase = ptUserClientService.deleteUserById(userId);
        return responseBase;
    }

    @ResponseBody
    @RequestMapping("/pagequery")
    public Object getEmpsWithJson(Model model,
                                  @RequestParam(value = "page", defaultValue = "1") Integer page) {
        ResponseBase responseBase = ptUserClientService.queryAll(page, 2);
        model.addAttribute(responseBase);
        return responseBase;
    }


    @RequestMapping("/user/list")
    public String getUserIndex(Model model) {
        return "/user/index";
    }


    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    public PtUser get2(@PathVariable Integer id) {

        return ptUserClientService.query1(id);
    }


    @ResponseBody
    @RequestMapping(value = "pt/login", method = RequestMethod.POST)
    public Object login(PtUser ptUser, HttpSession session) {

        ResultVO<Object> resultVO = new ResultVO<>();
        PtUser ptUsers = ptUserClientService.query4Login(ptUser);


        //获取用户权限信息
        List<PtResource> ptResources = ptResourceClientService.queryResourceByUserId(ptUsers);
        Map<Integer, Permission> permissionMap = new HashMap<Integer, Permission>();
        List<PtResource> tmp = new ArrayList<>();


        //遍历转换成集合放入tmp
        for (int i = 0; i < ptResources.size(); i++) {
            String s = JsonUtils.objectToJson(ptResources.get(i));
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
        session.setAttribute("root", root);


        UsernamePasswordToken token = new UsernamePasswordToken(ptUser.getUserName(), ptUser.getUserPass());
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            PtUserShiro ptUserShiro = (PtUserShiro) subject.getPrincipal();
            session.setAttribute("ptUserShiro", ptUserShiro);
            resultVO.setCode(200);
            return resultVO;
        } catch (Exception e) {
            return "login";
        }
    }
}
