package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CoDepartment;
import com.bid.springcloud.entities.CoDepartmentExample;
import com.bid.springcloud.entities.CoDepartmentKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoDepartmentMapper {
    int countByExample(CoDepartmentExample example);

    int deleteByExample(CoDepartmentExample example);

    int deleteByPrimaryKey(CoDepartmentKey key);

    int insert(CoDepartment record);

    int insertSelective(CoDepartment record);

    List<CoDepartment> selectByExample(CoDepartmentExample example);

    CoDepartment selectByPrimaryKey(CoDepartmentKey key);

    int updateByExampleSelective(@Param("record") CoDepartment record, @Param("example") CoDepartmentExample example);

    int updateByExample(@Param("record") CoDepartment record, @Param("example") CoDepartmentExample example);

    int updateByPrimaryKeySelective(CoDepartment record);

    int updateByPrimaryKey(CoDepartment record);
}