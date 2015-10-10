package com.mamitang.action;

import com.mamitang.ReturnStatus;
import com.mamitang.entity.UserEntity;
import com.mamitang.model.UserDetail;
import com.mamitang.response.RetResponse;
import com.mamitang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lyy on 15-9-24.
 * show all the users
 */


@RestController
@RequestMapping(value = "/userinfo")
public class ShowUserAction {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/users/{page}/to/{numOfPage}" , method = RequestMethod.GET)
    @ResponseBody
    public RetResponse showUsers(@PathVariable("page") int page ,
                                 @PathVariable("numOfPage") int numOfPage ,
                                 @RequestParam(value = "querykey" , required = false) String querykey ,
                                 @RequestParam(value = "queryvalue" , required = false) String queryvalue ){
        RetResponse result = new RetResponse();
        if(page<=0 || numOfPage<1){
            result.setRetMsg("the error parameters");
            result.setStatus(ReturnStatus.FAIL);
            return result;
        }
        Map result_map = userService.getAllUsers(page , numOfPage , querykey , queryvalue);
        result.setStatus(ReturnStatus.SUCCESS);
        result.setData(result_map);
        return result;
    }

    @RequestMapping(value = "/user/{id}" , method = RequestMethod.GET)
    @ResponseBody
    public RetResponse showUser(@PathVariable("id") int id){
        RetResponse result = new RetResponse();
        if(id<0){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg("the error parameters");
            return result;
        }
        UserEntity userEntity = userService.getUserById(id);
        if(userEntity==null){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg("the user is not existed");
            return result;
        }
        UserDetail userDetail = new UserDetail();

        //convert start (temp)
        userDetail.setAddress("example_address");
        userDetail.setBank("example_bank");
        userDetail.setCreatetime(userEntity.getCreatetime());
        userDetail.setEmail("example_email");
        userDetail.setIsactive(userEntity.getIsactive());
        userDetail.setNickname(userEntity.getNickname());
        userDetail.setRole("example_role");
        userDetail.setTelephone(userEntity.getUsername());
        //convert over (temp)

        result.setStatus(ReturnStatus.SUCCESS);
        result.setData(userDetail);
        return result;
    }
}
