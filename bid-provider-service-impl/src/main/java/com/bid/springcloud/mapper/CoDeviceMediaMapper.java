package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoDeviceMedia;
import com.bid.springcloud.entities.CoDeviceMediaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoDeviceMediaMapper {
    int countByExample(CoDeviceMediaExample example);

    int deleteByExample(CoDeviceMediaExample example);

    int deleteByPrimaryKey(String mediaId);

    int insert(CoDeviceMedia record);

    int insertSelective(CoDeviceMedia record);

    List<CoDeviceMedia> selectByExample(CoDeviceMediaExample example);

    CoDeviceMedia selectByPrimaryKey(String mediaId);

    int updateByExampleSelective(@Param("record") CoDeviceMedia record, @Param("example") CoDeviceMediaExample example);

    int updateByExample(@Param("record") CoDeviceMedia record, @Param("example") CoDeviceMediaExample example);

    int updateByPrimaryKeySelective(CoDeviceMedia record);

    int updateByPrimaryKey(CoDeviceMedia record);
}