package com.lyw.source.dao;

import com.lyw.source.entity.DiningOrder;

public interface DiningOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiningOrder record);

    int insertSelective(DiningOrder record);

    DiningOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiningOrder record);

    int updateByPrimaryKey(DiningOrder record);
}