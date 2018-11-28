package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.PtUserRole;
import com.bid.springcloud.entities.PtUserRoleExample;
import com.bid.springcloud.entities.PtUserRoleKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PtUserRoleMapper {
    int countByExample(PtUserRoleExample example);

    int deleteByExample(PtUserRoleExample example);

    int deleteByPrimaryKey(PtUserRoleKey key);

    int insert(PtUserRole record);

    int insertSelective(PtUserRole record);

    List<PtUserRole> selectByExample(PtUserRoleExample example);

    PtUserRole selectByPrimaryKey(PtUserRoleKey key);

    int updateByExampleSelective(@Param("record") PtUserRole record, @Param("example") PtUserRoleExample example);

    int updateByExample(@Param("record") PtUserRole record, @Param("example") PtUserRoleExample example);

    int updateByPrimaryKeySelective(PtUserRole record);

    int updateByPrimaryKey(PtUserRole record);

    int insertUserRoles(Map<String, Object> map);

    int deleteUserRoles(Map<String, Object> map);
}