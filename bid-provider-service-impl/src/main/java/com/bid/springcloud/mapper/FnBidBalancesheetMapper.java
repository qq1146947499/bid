package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.FnBidBalancesheet;
import com.bid.springcloud.entities.FnBidBalancesheetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FnBidBalancesheetMapper {
    int countByExample(FnBidBalancesheetExample example);

    int deleteByExample(FnBidBalancesheetExample example);

    int deleteByPrimaryKey(String balanceId);

    int insert(FnBidBalancesheet record);

    int insertSelective(FnBidBalancesheet record);

    List<FnBidBalancesheet> selectByExample(FnBidBalancesheetExample example);

    FnBidBalancesheet selectByPrimaryKey(String balanceId);

    int updateByExampleSelective(@Param("record") FnBidBalancesheet record, @Param("example") FnBidBalancesheetExample example);

    int updateByExample(@Param("record") FnBidBalancesheet record, @Param("example") FnBidBalancesheetExample example);

    int updateByPrimaryKeySelective(FnBidBalancesheet record);

    int updateByPrimaryKey(FnBidBalancesheet record);
}