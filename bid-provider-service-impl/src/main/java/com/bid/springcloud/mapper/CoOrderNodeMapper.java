package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoOrderNode;
import com.bid.springcloud.entities.CoOrderNodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoOrderNodeMapper {
    int countByExample(CoOrderNodeExample example);

    int deleteByExample(CoOrderNodeExample example);

    int deleteByPrimaryKey(String orderNodeId);

    int insert(CoOrderNode record);

    int insertSelective(CoOrderNode record);

    List<CoOrderNode> selectByExample(CoOrderNodeExample example);

    CoOrderNode selectByPrimaryKey(String orderNodeId);

    int updateByExampleSelective(@Param("record") CoOrderNode record, @Param("example") CoOrderNodeExample example);

    int updateByExample(@Param("record") CoOrderNode record, @Param("example") CoOrderNodeExample example);

    int updateByPrimaryKeySelective(CoOrderNode record);

    int updateByPrimaryKey(CoOrderNode record);
}