package com.bid.springcloud.mapper;

import com.bid.springcloud.entities.PtResource;
import com.bid.springcloud.entities.PtResourceExample;
import com.bid.springcloud.entities.PtUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PtResourceMapper {
    int countByExample(PtResourceExample example);

    int deleteByExample(PtResourceExample example);

    int deleteByPrimaryKey(Integer resourceId);

    int insert(PtResource record);

    int insertSelective(PtResource record);

    int insertIcon(PtResource record);

    List<PtResource> selectByExample(PtResourceExample example);

    PtResource selectByPrimaryKey(Integer resourceId);

    int updateByExampleSelective(@Param("record") PtResource record, @Param("example") PtResourceExample example);

    int updateByExample(@Param("record") PtResource record, @Param("example") PtResourceExample example);

    int updateByPrimaryKeySelective(PtResource record);

    int updateByPrimaryKey(PtResource record);

    @Select("SELECT resource_id FROM role_resource WHERE role_id = #{roleId}")
    List<Integer> queryPtResourcesByRoleid(@Param("roleId") Integer roleId);

    @Select("SELECT * FROM pt_resource")
    List<PtResource> queryAll();

    List<PtResource> queryResourceByUserIdCurrency(@Param("userId") Integer  userId);


    List<PtResource> queryResourceByUserId(PtUser ptUser);

    List<PtResource> findPermsByRoleId(@Param("roleId") Integer roleId);
}