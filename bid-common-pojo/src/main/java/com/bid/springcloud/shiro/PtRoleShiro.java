package com.bid.springcloud.shiro;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.entities.PtUser;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class PtRoleShiro extends PtRole {

    private Set<PtResource> ptResource = new HashSet<>();

    private Set<PtRoleShiro> PtRoleShiro = new HashSet<>();
}
