package com.mamitang.action;

import com.alibaba.fastjson.JSON;
import com.mamitang.ReturnStatus;
import com.mamitang.request.FoodUpdateRequest;
import com.mamitang.response.RetResponse;
import com.mamitang.service.IFoodService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lyy on 10/28/15.
 * hall_food management
 */

@RestController
@RequestMapping("/foodinfo")
public class FoodAction {

    @Autowired
    IFoodService foodService;

    /**
     * show the detail of a hall_food by the parameter id
     * @param id
     * @return
     */
    @RequestMapping(value = "show/{id}" , method = RequestMethod.GET)
    @ResponseBody
    public RetResponse showAdvertisement(@PathVariable("id") int id){
        RetResponse result = new RetResponse();
        try {
            result = foodService.getAdvertisementDetail(id);
        }catch (Exception e){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg(e.getMessage());
        }
        return result;
    }

    /**
     * show all the hall_foods by paging
     * @param page  查第几页
     * @param numOfPage 每页多少条记录
     * @return
     */
    @RequestMapping(value = "/foods/{page}/to/{numOfPage}" , method = RequestMethod.GET)
    @ResponseBody
    public RetResponse showAdvertisements(@PathVariable("page") int page ,
                                          @PathVariable("numOfPage") int numOfPage ,
                                          @RequestParam(value = "querykey" , required = false) String querykey ,
                                          @RequestParam(value = "queryvalue" , required = false) String queryvalue ,
                                          @RequestParam(value = "starttime" , required = false) String starttime ,
                                          @RequestParam(value = "endtime" , required = false) String endtime){
        RetResponse result = new RetResponse();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date start_time = null;
        Date end_time = null;
        try {
            //将字符串转换成日期类型
            if(!StringUtils.isEmpty(starttime)){
                start_time = sdf.parse(starttime);
            }
            if(!StringUtils.isEmpty(endtime)){
                end_time = sdf.parse(endtime);
            }
            result = foodService.getFoodList(page , numOfPage , querykey , queryvalue , start_time , end_time);
        }catch (Exception e){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg(e.getMessage());
        }
        return result;
    }

    /**
     *
     * @param id            要更新的菜品id
     * @param paraminfo     代表请求参数，对应菜品类
     * @return
     */
    @RequestMapping(value = "update/{id}" , method = RequestMethod.POST)
    @ResponseBody
    public RetResponse updateAdvertisement(@PathVariable("id") int id , @RequestBody String paraminfo){
        RetResponse result = new RetResponse();
        try {
            FoodUpdateRequest request_info = JSON.parseObject(paraminfo, FoodUpdateRequest.class);
            result = foodService.updateAdvertisement(id , request_info);
        }catch (Exception e){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg(e.getMessage());
        }
        return result;
    }

}


























