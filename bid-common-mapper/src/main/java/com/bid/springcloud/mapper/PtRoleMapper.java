package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.PtRole;
import com.bid.springcloud.entities.PtRoleExample;
import org.apache.ibatis.annotations.Param;

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
}