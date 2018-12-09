package com.bid.springcloud.shiro;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.entities.CoUser;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class CoUserShiro extends CoUser {
    private Set<PtRoleShiro> ptRoleShiro = new HashSet<>();
}
