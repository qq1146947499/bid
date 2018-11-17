package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.PtUser;
import com.bid.springcloud.entities.PtUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PtUserMapper {
    int countByExample(PtUserExample example);

    int deleteByExample(PtUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(PtUser record);

    int insertSelective(PtUser record);

    List<PtUser> selectByExample(PtUserExample example);

    PtUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") PtUser record, @Param("example") PtUserExample example);

    int updateByExample(@Param("record") PtUser record, @Param("example") PtUserExample example);

    int updateByPrimaryKeySelective(PtUser record);

    int updateByPrimaryKey(PtUser record);
}