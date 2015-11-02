package com.mamitang.dao;

import com.mamitang.DaoMaster;
import com.mamitang.entity.HallEntity;

@DaoMaster
public interface HallEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HallEntity record);

    int insertSelective(HallEntity record);

    HallEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HallEntity record);

    int updateByPrimaryKey(HallEntity record);
}