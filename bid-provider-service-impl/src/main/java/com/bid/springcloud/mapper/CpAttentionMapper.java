package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.CpAttention;
import com.bid.springcloud.entities.CpAttentionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CpAttentionMapper {
    int countByExample(CpAttentionExample example);

    int deleteByExample(CpAttentionExample example);

    int deleteByPrimaryKey(Integer attentionId);

    int insert(CpAttention record);

    int insertSelective(CpAttention record);

    List<CpAttention> selectByExample(CpAttentionExample example);

    CpAttention selectByPrimaryKey(Integer attentionId);

    int updateByExampleSelective(@Param("record") CpAttention record, @Param("example") CpAttentionExample example);

    int updateByExample(@Param("record") CpAttention record, @Param("example") CpAttentionExample example);

    int updateByPrimaryKeySelective(CpAttention record);

    int updateByPrimaryKey(CpAttention record);
}