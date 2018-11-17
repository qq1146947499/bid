package com.bid.springcloud.mapper;


import com.bid.springcloud.entities.co_advance_endbid;

public interface co_advance_endbidMapper {
    int deleteByPrimaryKey(String advanceEndbidId);

    int insert(co_advance_endbid record);

    int insertSelective(co_advance_endbid record);

    co_advance_endbid selectByPrimaryKey(String advanceEndbidId);

    int updateByPrimaryKeySelective(co_advance_endbid record);

    int updateByPrimaryKey(co_advance_endbid record);
}