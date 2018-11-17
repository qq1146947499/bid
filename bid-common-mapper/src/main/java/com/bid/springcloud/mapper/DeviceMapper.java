package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.Device;
import com.bid.springcloud.entities.DeviceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper {
    int countByExample(DeviceExample example);

    int deleteByExample(DeviceExample example);

    int deleteByPrimaryKey(Integer deviceId);

    int insert(Device record);

    int insertSelective(Device record);

    List<Device> selectByExample(DeviceExample example);

    Device selectByPrimaryKey(Integer deviceId);

    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    int updateByPrimaryKeySelective(Device record);

    int updateByPrimaryKey(Device record);
}