package com.bid.springcloud.service.impl;


import com.bid.springcloud.base.ResourceDTO;
import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
@author zhoucong
@date ${date}-${time}

*/
@SpringBootTest
@RunWith(SpringRunner.class)
public class CoUserServiceImplTest {


    @Resource
    private CoUserServiceIClientmpl coUserServiceImpl;
    @Test
    public void query1() {
        //List<CoUser> zhoucong = coUserServiceImpl.queryByPtuserName("zhoucong");
       /* for (CoUser coUser : zhoucong) {
            System.out.println(coUser);
        }*/

    }

    @Test
    public void queryByCoUser() {
        CoUser co  = new CoUser();

        co.setUserAccount("demo");
        co.setUserPass("demo");
        CoUser coUser = coUserServiceImpl.queryByCoUser(co);
        System.out.println(coUser);

    }

    @Test
    public void queryByPtuser() {
    }

    @Test
    public void getRoleByUser() {
        List<PtRole> roleByUser = coUserServiceImpl.getRoleByUser(1);
        for (PtRole ptRole : roleByUser) {
            System.out.println(ptRole);
        }
    }

    @Test
    public void findPermsByRoleId() {
        List<PtResource> permsByRoleId = coUserServiceImpl.findPermsByRoleId(9);
        for (PtResource ptResource : permsByRoleId) {
            System.out.println(ptResource);
        }
    }

    @Test
    public void findPermsByUserId() {
        List<PtResource> permsByUserId = coUserServiceImpl.findPermsByUserId(1);
        for (PtResource ptResource : permsByUserId) {
            System.out.println(ptResource);
        }

    }

    @Test
    public void findAllPerms() {
        List<PtResource> listResource = coUserServiceImpl.findPermsByUserId(1);



        Map<Integer, PtResource> permissionMap = new HashMap<Integer, PtResource>();
        for (PtResource ptResource : listResource) {
            permissionMap.put(ptResource.getResourceId(), ptResource);
        }

        //遍历出父子结构目录
        ResourceDTO resourceDTO = new ResourceDTO();
        for (PtResource ptResource : listResource) {
            PtResource  resource = ptResource;
            if(Integer.parseInt(resource.getpResourceId())==0){
                resourceDTO.setPtResource(resource);
            }else {
               PtResource parent =  permissionMap.get(resource.getpResourceId());
                resourceDTO.setPtResource(parent);
                resourceDTO.getChildren().add(resource);
            }
        }

        List<PtResource> children1 = resourceDTO.getChildren();
        for (PtResource ptResource : children1) {
            System.out.println(ptResource);
        }
        System.out.println("ss");
    }

    @Test
    public void queryByCoUser1() {
        CoUser coUser = new CoUser();
        coUser.setUserAccount("zhoucong");
      /*  coUser.setUserPass("zhoucong");*/
        CoUser coUser1 = coUserServiceImpl.queryByCoUser(coUser);
        System.out.println(coUser1);
    }
}
