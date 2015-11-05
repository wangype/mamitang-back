package com.mamitang.action;

import com.mamitang.ReturnStatus;
import com.mamitang.response.RetResponse;
import com.mamitang.service.IHallService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lyy on 11/2/15.
 * hall management
 */

@RestController
@RequestMapping("/hallinfo")
public class HallAction {

    @Autowired
    IHallService hallService;

    /**
     * show the detail of a hall by the parameter id
     * @param id
     * @return
     */
    @RequestMapping(value = "show/{id}" , method = RequestMethod.GET)
    @ResponseBody
    public RetResponse showHall(@PathVariable("id") int id){
        RetResponse result = new RetResponse();
        try {
            result = hallService.getHallDetail(id);
        }catch (Exception e){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg(e.getMessage());
        }
        return result;
    }

    /**
     * show all the halls by paging
     * @param page
     * @param numOfPage
     * @param querykey
     * @param queryvalue
     * @param starttime
     * @param endtime
     * @return
     */
    @RequestMapping(value = "/halls/{page}/to/{numOfPage}" , method = RequestMethod.GET)
    @ResponseBody
    public RetResponse showHalls(@PathVariable("page") int page ,
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
            result = hallService.getHallList(page , numOfPage , querykey , queryvalue , start_time , end_time);
        }catch (Exception e){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg(e.getMessage());
        }
        return result;
    }

}




















