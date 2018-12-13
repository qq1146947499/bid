package com.bid.springcloud.mapper;

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.entities.CpBidOrder;
import com.bid.springcloud.entities.CpBidOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CpBidOrderMapper {
    int countByExample(CpBidOrderExample example);

    int deleteByExample(CpBidOrderExample example);

    int deleteByPrimaryKey(Integer bidInfoId);

    int insert(CpBidOrder record);

    int insertSelective(CpBidOrder record);

    List<CpBidOrder> selectByExample(CpBidOrderExample example);

    CpBidOrder selectByPrimaryKey(Integer bidInfoId);

    int updateByExampleSelective(@Param("record") CpBidOrder record, @Param("example") CpBidOrderExample example);

    int updateByExample(@Param("record") CpBidOrder record, @Param("example") CpBidOrderExample example);

    int updateByPrimaryKeySelective(CpBidOrder record);

    int updateByPrimaryKey(CpBidOrder record);

    OrderDTD selectprimaryDescByOrderMainId(Integer orderMainId);

}