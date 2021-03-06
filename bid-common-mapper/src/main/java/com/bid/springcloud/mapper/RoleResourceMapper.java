package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.entities.RoleResource;
import com.bid.springcloud.entities.RoleResourceExample;
import com.bid.springcloud.entities.RoleResourceKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface RoleResourceMapper {


    int countByExample(RoleResourceExample example);

    int deleteByExample(RoleResourceExample example);

    int deleteByPrimaryKey(RoleResourceKey key);

    int insert(RoleResource record);

    int insertSelective(RoleResource record);

    List<RoleResource> selectByExample(RoleResourceExample example);

    RoleResource selectByPrimaryKey(RoleResourceKey key);

    int updateByExampleSelective(@Param("record") RoleResource record, @Param("example") RoleResourceExample example);

    int updateByExample(@Param("record") RoleResource record, @Param("example") RoleResourceExample example);

    int updateByPrimaryKeySelective(RoleResource record);

    int updateByPrimaryKey(RoleResource record);

    @Select("SELECT * from pt_role")
    List<PtRole> selRoleAll();


    int deleteRoleResources(Map<String, Object> map);

    int insertRoleResources(Map<String, Object> map);
}