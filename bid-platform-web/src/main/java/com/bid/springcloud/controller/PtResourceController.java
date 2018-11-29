package com.bid.springcloud.controller;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.VO.Permission;
import com.bid.springcloud.base.BaseApiService;
import com.bid.springcloud.base.ResponseBase;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.service.PtResourceClientService;
import com.bid.springcloud.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/pt")
public class PtResourceController extends BaseApiService {

    @Resource
    private PtResourceClientService ptResourceClientService;




    @ResponseBody
    @RequestMapping("/resource/role/list")
    public Object ptroleLstResourec(@RequestParam("roleId") Integer roleId){
        // 查询所有的许可数据
        try {
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
                permission.setIcon(ptResource.getIcon());
                ps.add(permission);
            }

            List<Permission> permissions = new ArrayList<Permission>();


            List<Integer> integers = ptResourceClientService.queryByRoleId(roleId);
            Map<Integer, Permission> permissionMap = new HashMap<Integer, Permission>();

            //将数据全部存储到map集合当中
            for (Permission p : ps) {
                if (integers.contains(p.getId())){
                    p.setChecked(true);
                }else {
                    p.setChecked(false);
                }
                permissionMap.put(p.getId(), p);
            }

            //遍历map集合
            for ( Permission p : ps ) {
                Permission child = p;
                //当pid为0的时候为根结点
                if ( child.getPid() == 0 ) {
                    permissions.add(p);
                } else {
                    //不为0的时候，从map取出父节点，以子节点添加到返回的集合当中
                    Permission parent = permissionMap.get(child.getPid());
                    parent.getChildren().add(child);
                }
            }
            return  permissions;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return setResultError("查询所有的许可数据失败");
        }

    }



    ///resource/list
    @RequestMapping("/edit/resource")
    @ResponseBody
    public  Object editResource(PtResource ptResource) {
        try {
            ResponseBase base = ptResourceClientService.editResource(ptResource);

            return base;
        } catch (Exception e) {
            e.printStackTrace();
            return setResultError("添加失败");
        }
    }


    @RequestMapping("/resource/insert")
    @ResponseBody
    public  Object insertResource(PtResource ptResource){
        try {
            ResponseBase base = ptResourceClientService.addResource(ptResource);

            return  base;
        } catch (Exception e) {
            e.printStackTrace();
            return  setResultError("添加失败");
        }


    }


    @ResponseBody
    @RequestMapping("/resource/list")
    public Object ptRoleResourec(){
        // 查询所有的许可数据
        try {
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
                permission.setIcon(ptResource.getIcon());
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
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return setResultError("查询所有的许可数据失败");
        }
    }






    @RequestMapping("/resource/add")
    public  String addResource(@RequestParam("id") Integer id, Model model){
        model.addAttribute("resourceId",id);
        return "/resource/add";
    }

    @RequestMapping("/resource/edit")
    public  String editResource(@RequestParam("id") Integer id,Model model){
        model.addAttribute("resourceId",id);
        return "/resource/edit";
    }
    @RequestMapping("/resource/delete")
    @ResponseBody
    public  Object deleteResource(@RequestParam("id") Integer id){

        try {
            ResponseBase base = ptResourceClientService.delResource(id);
            return base;
        }catch (Exception e){
            e.printStackTrace();
            return  setResultError("删除失败");
        }

    }


}
