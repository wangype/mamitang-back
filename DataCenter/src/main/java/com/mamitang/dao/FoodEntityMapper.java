package com.mamitang.dao;

import com.mamitang.DaoMaster;
import com.mamitang.entity.FoodEntity;

import java.util.List;
import java.util.Map;

@DaoMaster
public interface FoodEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FoodEntity record);

    int insertSelective(FoodEntity record);

    FoodEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FoodEntity record);

    int updateByPrimaryKey(FoodEntity record);

    int getAllAdvertisementsCount();

    List<FoodEntity> getAllFoods(Map sql_map);
}