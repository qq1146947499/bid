package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CpCompanyInfo;
import com.bid.springcloud.entities.CpCompanyInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CpCompanyInfoMapper {
    int countByExample(CpCompanyInfoExample example);

    int deleteByExample(CpCompanyInfoExample example);

    int deleteByPrimaryKey(Integer companyId);

    int insert(CpCompanyInfo record);

    int insertSelective(CpCompanyInfo record);

    List<CpCompanyInfo> selectByExample(CpCompanyInfoExample example);

    CpCompanyInfo selectByPrimaryKey(Integer companyId);

    int updateByExampleSelective(@Param("record") CpCompanyInfo record, @Param("example") CpCompanyInfoExample example);

    int updateByExample(@Param("record") CpCompanyInfo record, @Param("example") CpCompanyInfoExample example);

    int updateByPrimaryKeySelective(CpCompanyInfo record);

    int updateByPrimaryKey(CpCompanyInfo record);
}