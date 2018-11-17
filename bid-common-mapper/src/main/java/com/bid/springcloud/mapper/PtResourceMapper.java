package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtResourceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PtResourceMapper {
    int countByExample(PtResourceExample example);

    int deleteByExample(PtResourceExample example);

    int deleteByPrimaryKey(Integer resourceId);

    int insert(PtResource record);

    int insertSelective(PtResource record);

    List<PtResource> selectByExample(PtResourceExample example);

    PtResource selectByPrimaryKey(Integer resourceId);

    int updateByExampleSelective(@Param("record") PtResource record, @Param("example") PtResourceExample example);

    int updateByExample(@Param("record") PtResource record, @Param("example") PtResourceExample example);

    int updateByPrimaryKeySelective(PtResource record);

    int updateByPrimaryKey(PtResource record);
}