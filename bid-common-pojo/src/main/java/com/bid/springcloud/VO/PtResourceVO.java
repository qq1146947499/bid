package com.bid.springcloud.VO;/*
@author zhoucong
@date ${date}-${time}

*/

import com.bid.springcloud.entities.PtResource;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PtResourceVO {

    private Integer resourceId;

    private String resourceName;

    private String resourcePath;

    private String resourceType;

    private String pResourceId;

    private String ptType;

    private  boolean open;

    private List<PtResourceVO> childern = new ArrayList<>();
}
