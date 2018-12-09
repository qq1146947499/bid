package com.bid.springcloud.shiro;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.entities.PtUser;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class PtUserShiro extends PtUser {

    private Set<PtRoleShiro> ptRoleShiro = new HashSet<>();
}
