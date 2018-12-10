package com.bid.springcloud.mapper;

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.entities.CoOrderMain;
import com.bid.springcloud.entities.CoOrderMainExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoOrderMainMapper {
    int countByExample(CoOrderMainExample example);

    int deleteByExample(CoOrderMainExample example);

    int deleteByPrimaryKey(Integer orderMainId);

    int insert(CoOrderMain record);

    int insertSelective(CoOrderMain record);

    List<CoOrderMain> selectByExample(CoOrderMainExample example);

    CoOrderMain selectByPrimaryKey(Integer orderMainId);

    int updateByExampleSelective(@Param("record") CoOrderMain record, @Param("example") CoOrderMainExample example);

    int updateByExample(@Param("record") CoOrderMain record, @Param("example") CoOrderMainExample example);

    int updateByPrimaryKeySelective(CoOrderMain record);

    int updateByPrimaryKey(CoOrderMain record);

    List<OrderDTD> selectOrderMainByOrderMainId(@Param("orderMainId") Integer orderMainId);


    List<OrderDTD> selectOrderListByProcessId(@Param("orderProcess") Integer orderProcess);

    List<OrderDTD> selectByCollgeIdAndProcess(OrderDTD orderDTD);
}