package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.entities.PtRoleExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PtRoleMapper {
    int countByExample(PtRoleExample example);

    int deleteByExample(PtRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(PtRole record);

    int insertSelective(PtRole record);

    List<PtRole> selectByExample(PtRoleExample example);

    PtRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") PtRole record, @Param("example") PtRoleExample example);

    int updateByExample(@Param("record") PtRole record, @Param("example") PtRoleExample example);

    int updateByPrimaryKeySelective(PtRole record);

    int updateByPrimaryKey(PtRole record);

    @Select("SELECT role_id from pt_user_role WHERE user_id =#{userId}")
    List<Integer>  queryRoleByUId(@Param("userId") Integer userId);

    @Select("select * from pt_role")
    List<PtRole> queryAll();


    List<Integer> notUserRole(@Param("userId") Integer userId);

    List<PtRole> getRoleByUser(@Param("userId") Integer userId);

}