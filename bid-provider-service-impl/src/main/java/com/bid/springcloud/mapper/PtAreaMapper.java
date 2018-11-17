package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.PtArea;
import com.bid.springcloud.entities.PtAreaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PtAreaMapper {
    int countByExample(PtAreaExample example);

    int deleteByExample(PtAreaExample example);

    int deleteByPrimaryKey(Integer areaId);

    int insert(PtArea record);

    int insertSelective(PtArea record);

    List<PtArea> selectByExample(PtAreaExample example);

    PtArea selectByPrimaryKey(Integer areaId);

    int updateByExampleSelective(@Param("record") PtArea record, @Param("example") PtAreaExample example);

    int updateByExample(@Param("record") PtArea record, @Param("example") PtAreaExample example);

    int updateByPrimaryKeySelective(PtArea record);

    int updateByPrimaryKey(PtArea record);
}