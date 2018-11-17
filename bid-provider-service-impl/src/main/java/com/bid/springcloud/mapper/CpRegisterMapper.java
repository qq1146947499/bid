package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CpRegister;
import com.bid.springcloud.entities.CpRegisterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CpRegisterMapper {
    int countByExample(CpRegisterExample example);

    int deleteByExample(CpRegisterExample example);

    int deleteByPrimaryKey(String regResourceId);

    int insert(CpRegister record);

    int insertSelective(CpRegister record);

    List<CpRegister> selectByExample(CpRegisterExample example);

    CpRegister selectByPrimaryKey(String regResourceId);

    int updateByExampleSelective(@Param("record") CpRegister record, @Param("example") CpRegisterExample example);

    int updateByExample(@Param("record") CpRegister record, @Param("example") CpRegisterExample example);

    int updateByPrimaryKeySelective(CpRegister record);

    int updateByPrimaryKey(CpRegister record);
}