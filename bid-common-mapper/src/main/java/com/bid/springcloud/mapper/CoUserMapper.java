package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoUser;
import com.bid.springcloud.entities.CoUserExample;
import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtRole;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

    @Select("SELECT * from co_user WHERE create_username = #{createName}")
    List<CoUser> selectByPtuserName(@Param("createName") String createName);

    CoUser selectByCouser(CoUser coUser);


    List<PtRole> getRoleByUser(@Param("userId") Integer userId);

    List<PtResource> findPermsByRoleId(@Param("userId") Integer roleId);
}