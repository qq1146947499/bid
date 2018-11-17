package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoOrderProcess;
import com.bid.springcloud.entities.CoOrderProcessExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoOrderProcessMapper {
    int countByExample(CoOrderProcessExample example);

    int deleteByExample(CoOrderProcessExample example);

    int deleteByPrimaryKey(String processId);

    int insert(CoOrderProcess record);

    int insertSelective(CoOrderProcess record);

    List<CoOrderProcess> selectByExample(CoOrderProcessExample example);

    CoOrderProcess selectByPrimaryKey(String processId);

    int updateByExampleSelective(@Param("record") CoOrderProcess record, @Param("example") CoOrderProcessExample example);

    int updateByExample(@Param("record") CoOrderProcess record, @Param("example") CoOrderProcessExample example);

    int updateByPrimaryKeySelective(CoOrderProcess record);

    int updateByPrimaryKey(CoOrderProcess record);
}