package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoDeviceBrand;
import com.bid.springcloud.entities.CoDeviceBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoDeviceBrandMapper {
    int countByExample(CoDeviceBrandExample example);

    int deleteByExample(CoDeviceBrandExample example);

    int deleteByPrimaryKey(Integer brandId);

    int insert(CoDeviceBrand record);

    int insertSelective(CoDeviceBrand record);

    List<CoDeviceBrand> selectByExample(CoDeviceBrandExample example);

    CoDeviceBrand selectByPrimaryKey(Integer brandId);

    int updateByExampleSelective(@Param("record") CoDeviceBrand record, @Param("example") CoDeviceBrandExample example);

    int updateByExample(@Param("record") CoDeviceBrand record, @Param("example") CoDeviceBrandExample example);

    int updateByPrimaryKeySelective(CoDeviceBrand record);

    int updateByPrimaryKey(CoDeviceBrand record);
}