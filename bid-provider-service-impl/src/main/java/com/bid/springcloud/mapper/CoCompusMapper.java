package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoCompus;
import com.bid.springcloud.entities.CoCompusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoCompusMapper {
    int countByExample(CoCompusExample example);

    int deleteByExample(CoCompusExample example);

    int deleteByPrimaryKey(Integer compusId);

    int insert(CoCompus record);

    int insertSelective(CoCompus record);

    List<CoCompus> selectByExample(CoCompusExample example);

    CoCompus selectByPrimaryKey(Integer compusId);

    int updateByExampleSelective(@Param("record") CoCompus record, @Param("example") CoCompusExample example);

    int updateByExample(@Param("record") CoCompus record, @Param("example") CoCompusExample example);

    int updateByPrimaryKeySelective(CoCompus record);

    int updateByPrimaryKey(CoCompus record);
}