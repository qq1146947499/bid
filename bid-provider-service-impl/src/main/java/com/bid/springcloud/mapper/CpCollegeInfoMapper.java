package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CpCollegeInfo;
import com.bid.springcloud.entities.CpCollegeInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CpCollegeInfoMapper {
    int countByExample(CpCollegeInfoExample example);

    int deleteByExample(CpCollegeInfoExample example);

    int deleteByPrimaryKey(Integer collegeId);

    int insert(CpCollegeInfo record);

    int insertSelective(CpCollegeInfo record);

    List<CpCollegeInfo> selectByExample(CpCollegeInfoExample example);

    CpCollegeInfo selectByPrimaryKey(Integer collegeId);

    int updateByExampleSelective(@Param("record") CpCollegeInfo record, @Param("example") CpCollegeInfoExample example);

    int updateByExample(@Param("record") CpCollegeInfo record, @Param("example") CpCollegeInfoExample example);

    int updateByPrimaryKeySelective(CpCollegeInfo record);

    int updateByPrimaryKey(CpCollegeInfo record);
}