package com.bid.springcloud.base;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.entities.PtResource;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ResourceDTO  {
    private  PtResource ptResource;
    private List<PtResource> children = new ArrayList<PtResource>();
}
