package com.lyw.source.dao;

import com.lyw.source.entity.DiningRoom;

public interface DiningRoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiningRoom record);

    int insertSelective(DiningRoom record);

    DiningRoom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiningRoom record);

    int updateByPrimaryKey(DiningRoom record);
}