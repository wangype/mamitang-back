package com.mamitang.dao;

import com.mamitang.DaoMaster;
import com.mamitang.entity.ADPictureEntity;

import java.util.List;

@DaoMaster
public interface ADPictureEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ADPictureEntity record);

    int insertSelective(ADPictureEntity record);

    ADPictureEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ADPictureEntity record);

    int updateByPrimaryKey(ADPictureEntity record);

    //获取指定id广告的所有图片
    List<ADPictureEntity> getImgsByAID(Integer ad_id);

    int deleteByAdId(int id);
}