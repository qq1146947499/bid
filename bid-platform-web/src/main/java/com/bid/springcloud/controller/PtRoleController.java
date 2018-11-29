package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.VO.PtResourceVO;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.service.PtResourceClientService;
import com.bid.springcloud.service.PtRoleClientService;
import com.bid.springcloud.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pt/role")
public class PtRoleController {

    @Resource
    private PtRoleClientService ptRoleClientService;

    @Resource
    private PtResourceClientService ptResourceClientService;


    @RequestMapping("/resource/add")
    public  String addResource(@RequestParam("roleId") Integer roleId, Model model){
        model.addAttribute("roleId",roleId);
        return "/role/assign";
    }
    @RequestMapping("/assign/resource")
    public  String to(@RequestParam("roleId") Integer roleId, Model model){
        model.addAttribute("roleId",roleId);
        return "/role/assign";
    }

/*
    @ResponseBody
    @RequestMapping("/resource/list")
    public Object ptRoleResourec(){

        // 查询所有的许可数据
        ResponseBase base = ptResourceClientService.queryAll();
        List<PtResource> ptResources = (List<PtResource>) base.getData();
        List<PtResource> tmp = new ArrayList<>();
        for (int i =0;i<ptResources.size();i++ ){
            String s = JsonUtils.objectToJson(ptResources.get(i));
            PtResource resourcetmp = JsonUtils.jsonToPojo(s, PtResource.class);
            tmp.add(resourcetmp);
        }
        List<Permission> ps = new ArrayList<>();
        for (PtResource ptResource:tmp){
            Permission permission = new Permission();
            permission.setName(ptResource.getResourceName());
            permission.setId(ptResource.getResourceId());
            permission.setPid(Integer.parseInt(ptResource.getpResourceId()));
            permission.setUrl(ptResource.getResourcePath());
            ps.add(permission);
        }

        List<Permission> permissions = new ArrayList<Permission>();

        Map<Integer, Permission> permissionMap = new HashMap<Integer, Permission>();

        //将数据全部存储到map集合当中
        for (Permission p : ps) {
            permissionMap.put(p.getId(), p);
        }

        //遍历map集合
        for ( Permission p : ps ) {
            Permission child = p;
            //当pid为0的时候为根结点
            if ( child.getPid() == 0 ) {
                permissions.add(p);
            } else {
                //不为0的时候，从map取出值，以子节点添加到返回的集合当中
                Permission parent = permissionMap.get(child.getPid());
                parent.getChildren().add(child);
            }
        }




        return  permissions;
    }*/


    @RequestMapping("/dounAssign")
    @ResponseBody
    public ResponseBase ptUserdounAssign(@RequestParam("roleId") Integer roleId,@RequestParam("resourceIds") Integer[] resourceIds  ){
        Map<String, Object> map = new HashMap<>();
        map.put("roleId",roleId);
        map.put("resourceIds",resourceIds);
        ResponseBase base = ptRoleClientService.deleteRoleResources(map);
        return base;
    }



    @RequestMapping("/doAssign")
    @ResponseBody
    public ResponseBase ptUserDoAssignAdd( @RequestParam("roleId") Integer roleId, @RequestParam("resourceIds")Integer[] unassignroleids  ){
        Map<String, Object> map = new HashMap<>();
        map.put("roleId",roleId);
        map.put("resourceIds",unassignroleids);
        ResponseBase base = ptRoleClientService.insertRoleResources(map);
        return base;
    }

    @RequestMapping("/resource")
    public  String ptuserAssign(@RequestParam("id") Integer id,Model model) {
        List<PtRole> assingedRoles = new ArrayList<>();
        List<PtRole> unassignRoles = new ArrayList<>();
        ResponseBase role = ptRoleClientService.queryAllRole();
        ResponseBase userRoleId = ptRoleClientService.queryAllRole();
        List<PtRole> roleList = (List<PtRole>) role.getData();
        System.out.println(roleList);
        List<Integer> userRoleIdData = (List<Integer>) userRoleId.getData();
        List<PtRole> tmp = new ArrayList<>();
        for (int i =0;i<roleList.size();i++ ){
            String s = JsonUtils.objectToJson(roleList.get(i));
            PtRole ptRole1 = JsonUtils.jsonToPojo(s, PtRole.class);
            tmp.add(ptRole1);
        }

        for (PtRole ptRole:tmp ){
            if (userRoleIdData.contains(ptRole.getRoleId())){
                assingedRoles.add(ptRole);
            }else {
                unassignRoles.add(ptRole);
            }


        }
        model.addAttribute("role", unassignRoles);
        model.addAttribute("userRole", assingedRoles);
        model.addAttribute("userId",id);
        return "/role/assign";
    }



    @ResponseBody
    @RequestMapping("/delete")
    public ResponseBase delPtuser(@RequestParam(value = "id") Integer roleId){
        ResponseBase responseBase = ptRoleClientService.deleRole(roleId);
        return responseBase;
    }

    @RequestMapping("/assign")
    public String getAssign(@RequestParam(value = "id") Integer roleId,Model model){
        ResponseBase responseBase = ptRoleClientService.queryRole(roleId);
        model.addAttribute("data",responseBase);
        return "/role/assign";
    }


    @ResponseBody
    @RequestMapping("/insert")
    public ResponseBase insertPtuser(PtRole ptRole){
        ResponseBase responseBase = ptRoleClientService.insertRole(ptRole);
        return responseBase;
    }

    @ResponseBody
    @RequestMapping("/pagequery")
    public Object getEmpsWithJson(Model model,
                                  @RequestParam(value = "page", defaultValue = "1") Integer page ) {
        ResponseBase responseBase = ptRoleClientService.queryAll(page, 2);
        model.addAttribute(responseBase);
        return responseBase;
    }

}
