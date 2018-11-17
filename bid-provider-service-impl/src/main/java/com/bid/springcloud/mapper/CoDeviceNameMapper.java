package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoDeviceName;
import com.bid.springcloud.entities.CoDeviceNameExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoDeviceNameMapper {
    int countByExample(CoDeviceNameExample example);

    int deleteByExample(CoDeviceNameExample example);

    int deleteByPrimaryKey(String nameId);

    int insert(CoDeviceName record);

    int insertSelective(CoDeviceName record);

    List<CoDeviceName> selectByExample(CoDeviceNameExample example);

    CoDeviceName selectByPrimaryKey(String nameId);

    int updateByExampleSelective(@Param("record") CoDeviceName record, @Param("example") CoDeviceNameExample example);

    int updateByExample(@Param("record") CoDeviceName record, @Param("example") CoDeviceNameExample example);

    int updateByPrimaryKeySelective(CoDeviceName record);

    int updateByPrimaryKey(CoDeviceName record);
}