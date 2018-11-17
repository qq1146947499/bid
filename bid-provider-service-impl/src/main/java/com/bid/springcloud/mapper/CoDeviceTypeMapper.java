package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoDeviceType;
import com.bid.springcloud.entities.CoDeviceTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoDeviceTypeMapper {
    int countByExample(CoDeviceTypeExample example);

    int deleteByExample(CoDeviceTypeExample example);

    int deleteByPrimaryKey(String deviceTypeId);

    int insert(CoDeviceType record);

    int insertSelective(CoDeviceType record);

    List<CoDeviceType> selectByExample(CoDeviceTypeExample example);

    CoDeviceType selectByPrimaryKey(String deviceTypeId);

    int updateByExampleSelective(@Param("record") CoDeviceType record, @Param("example") CoDeviceTypeExample example);

    int updateByExample(@Param("record") CoDeviceType record, @Param("example") CoDeviceTypeExample example);

    int updateByPrimaryKeySelective(CoDeviceType record);

    int updateByPrimaryKey(CoDeviceType record);
}