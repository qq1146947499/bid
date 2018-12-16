package com.bid.springcloud.mapper;

import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.entities.CoOrderMain;
import com.bid.springcloud.entities.CoOrderMainExample;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    //根据订单状态查询订单相关
    List<OrderDTD> selectByCollgeIdAndProcess(OrderDTD orderDTD);

    List<OrderDTD> selectBycompanyIdAndProcess(OrderDTD orderDTD);

    List<OrderDTD> getOrderByCompanyId(OrderDTD orderDTD);

    List<OrderDTD> demo(Map<String , Object> map);


    /**
     * 查询被企业竞价过的订单待初选的
     * @param orderDTD
     * @return
     */
    List<OrderDTD> getTobePrimedOrder(OrderDTD orderDTD);


    /**
     *平台审核初选订单详情
     * @param orderMainId
     * @return
     */
    OrderDTD selectPrimaryTeByOrderMainId(Integer orderMainId);
}