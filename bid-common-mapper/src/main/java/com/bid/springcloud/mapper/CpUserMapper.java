package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CpUser;
import com.bid.springcloud.entities.CpUserExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CpUserMapper {
    int countByExample(CpUserExample example);

    int deleteByExample(CpUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(CpUser record);

    int insertSelective(CpUser record);

    List<CpUser> selectByExample(CpUserExample example);

    CpUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") CpUser record, @Param("example") CpUserExample example);

    int updateByExample(@Param("record") CpUser record, @Param("example") CpUserExample example);

    int updateByPrimaryKeySelective(CpUser record);

    int updateByPrimaryKey(CpUser record);




    @Select("SELECT * from co_user WHERE create_username = #{createName}")
    List<CpUser> selectByPtuserName(@Param("userName") String userName);

    int insertSelectiveZ(CpUser cpUser);

    CpUser selectCpuser(CpUser cpUser);
}