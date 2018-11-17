package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.CoUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoUserMapper {
    int countByExample(CoUserExample example);

    int deleteByExample(CoUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(CoUser record);

    int insertSelective(CoUser record);

    List<CoUser> selectByExample(CoUserExample example);

    CoUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") CoUser record, @Param("example") CoUserExample example);

    int updateByExample(@Param("record") CoUser record, @Param("example") CoUserExample example);

    int updateByPrimaryKeySelective(CoUser record);

    int updateByPrimaryKey(CoUser record);
}