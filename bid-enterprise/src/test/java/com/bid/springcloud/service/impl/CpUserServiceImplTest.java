package com.bid.springcloud.service.impl;


import com.bid.springcloud.entities.CpUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;



/*
@author zhoucong
@date ${date}-${time}

*/
@SpringBootTest
@RunWith(SpringRunner.class)
public class CpUserServiceImplTest {

    @Resource
    private  CpUserServiceImpl cpUserServiceImpl;
    @Test
    public void addCpUser() {
        CpUser cpUser = new CpUser();
        cpUser.setUserId(121);
        cpUser.setUserAccount("animal");
        cpUser.setCompanyId(1);
        cpUser.setUserPass("animal");
        cpUser.setCreateUsername("demo");
        cpUser.setStatus("1");
        cpUser.setUserType("E");
        int i = cpUserServiceImpl.addCpuser(cpUser);
        System.out.println(i);
    }

    @Test
    public void queryByCpUser() {
        CpUser cpUser = new CpUser();

        cpUser.setUserAccount("demo");

        CpUser cpUser1 = cpUserServiceImpl.queryCouser(cpUser);
        System.out.println(cpUser1);
    }

    @Test
    public void queryByuserName() {
    }

    @Test
    public void deleteCpUserById() {
    }

    @Test
    public void queryCpUserByUserid() {
    }

    @Test
    public void updateCpUserByUserId() {
    }

    @Test
    public void getRoleByUser() {
    }

    @Test
    public void findPermsByRoleId() {
    }

    @Test
    public void findPermsByUserId() {
    }

    @Test
    public void findAllPerms() {
    }
}
