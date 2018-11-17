package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.PtProcessParam;
import com.bid.springcloud.entities.PtProcessParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PtProcessParamMapper {
    int countByExample(PtProcessParamExample example);

    int deleteByExample(PtProcessParamExample example);

    int deleteByPrimaryKey(String processId);

    int insert(PtProcessParam record);

    int insertSelective(PtProcessParam record);

    List<PtProcessParam> selectByExample(PtProcessParamExample example);

    PtProcessParam selectByPrimaryKey(String processId);

    int updateByExampleSelective(@Param("record") PtProcessParam record, @Param("example") PtProcessParamExample example);

    int updateByExample(@Param("record") PtProcessParam record, @Param("example") PtProcessParamExample example);

    int updateByPrimaryKeySelective(PtProcessParam record);

    int updateByPrimaryKey(PtProcessParam record);
}