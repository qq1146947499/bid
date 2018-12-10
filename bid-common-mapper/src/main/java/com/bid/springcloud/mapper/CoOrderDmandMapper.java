package com.bid.springcloud.mapper;


import com.bid.springcloud.DTD.OrderDTD;
import com.bid.springcloud.entities.CoOrderDmand;
import com.bid.springcloud.entities.CoOrderDmandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoOrderDmandMapper {
    int countByExample(CoOrderDmandExample example);

    int deleteByExample(CoOrderDmandExample example);

    int deleteByPrimaryKey(String dmainId);

    int insert(CoOrderDmand record);

    int insertSelective(CoOrderDmand record);

    List<CoOrderDmand> selectByExample(CoOrderDmandExample example);

    CoOrderDmand selectByPrimaryKey(String dmainId);

    int updateByExampleSelective(@Param("record") CoOrderDmand record, @Param("example") CoOrderDmandExample example);

    int updateByExample(@Param("record") CoOrderDmand record, @Param("example") CoOrderDmandExample example);

    int updateByPrimaryKeySelective(CoOrderDmand record);

    int updateByPrimaryKey(CoOrderDmand record);

    List<OrderDTD> selectByCollgeId(@Param("collegeId") String collegeId);
}