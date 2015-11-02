package com.mamitang.service.impl;

import com.mamitang.ReturnStatus;
import com.mamitang.dao.HallEntityMapper;
import com.mamitang.entity.HallEntity;
import com.mamitang.model.HallDetail;
import com.mamitang.response.RetResponse;
import com.mamitang.service.IHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lyy on 11/2/15.
 */
@Service("hallService")
public class HallServiceImpl implements IHallService{

    @Autowired
    HallEntityMapper hallDao;

    public RetResponse getHallDetail(int id) {
        RetResponse result = new RetResponse();
        if (id < 0) {
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg("the parameter id is invalid");
            return result;
        }
        //获取指定id的HallEntity
        HallEntity hallEntity = hallDao.selectByPrimaryKey(id);
        if (hallEntity == null) {
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg("the hall is not existed");
            return result;
        }
        //代表堂详情页的实体
        HallDetail hallDetail = new HallDetail();
        //field start
        hallDetail.setHallName(hallEntity.getHallName());
        hallDetail.setHallSupplyType(hallEntity.getHallSupplyType());
        hallDetail.setRoll("堂主");
        hallDetail.setHallPhone(hallEntity.getHallPhone());
        hallDetail.setHallPraiseNum(hallEntity.getHallPraiseNum());
        hallDetail.setHallCollectionNum(hallEntity.getHallCollectionNum());
        hallDetail.setHallAddress(hallEntity.getHallAddress());
        hallDetail.setHallCreateDate(hallEntity.getHallCreateDate());
        hallDetail.setHallCoverUrl(hallEntity.getHallCoverUrl());
        //field end
        result.setData(hallDetail);
        result.setStatus(ReturnStatus.SUCCESS);
        return result;
    }

    /**
     * @param page          查第几页
     * @param numOfPage     每页多少条记录
     * @param querykey      查询条件(可选)
     * @param queryvalue    查询值(可选)
     * @param start_time
     * @param end_time
     * @return
     */
    public RetResponse getHallList(int page, int numOfPage, String querykey, String queryvalue, Date start_time, Date end_time) {
        RetResponse result = new RetResponse();
        if (page <= 0 || numOfPage < 1) {
            result.setRetMsg("the error paging parameters");
            result.setStatus(ReturnStatus.FAIL);
            return result;
        }
        //获取总数
        int count = hallDao.getAllHallsCount();
        //转换总页数，并最终返回
        int countOfPage = (int) Math.ceil((double) count / (double) numOfPage);
        int start = (page - 1) * numOfPage;
        //sql条件map
        Map sql_map = new HashMap();
        sql_map.put("start", start);
        sql_map.put("end", numOfPage);
        sql_map.put("querykey", querykey);
        if (querykey!=null && querykey.equals("hallSupplyType")){
            //对查询条件进行判断和转换
            if(queryvalue!=null && queryvalue!=""){
                int i = Integer.parseInt(queryvalue);
                if(!(i==0 || i==1)){
                    result.setRetMsg("the error query parameters");
                    result.setStatus(ReturnStatus.FAIL);
                    return result;
                }
                sql_map.put("queryvalue", i);
            }else {
                sql_map.put("queryvalue",queryvalue);
            }
        }else{
            sql_map.put("queryvalue",queryvalue);
        }
        sql_map.put("starttime" , start_time);
        sql_map.put("endtime" , end_time);

        List<HallEntity> list = hallDao.getAllHalls(sql_map);
        //返回结果map,返回总页数和当前列表数据
        Map result_map = new HashMap();
        result_map.put("countOfPage", countOfPage);
        result_map.put("currentList", list);
        result.setData(result_map);
        result.setStatus(ReturnStatus.SUCCESS);
        return result;
    }
}




















