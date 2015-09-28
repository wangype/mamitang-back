package com.mamitang.action;

import com.mamitang.ReturnStatus;
import com.mamitang.response.RetResponse;
import com.mamitang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    public RetResponse showUsers(@PathVariable("page") int page , @PathVariable("numOfPage") int numOfPage){
        RetResponse result = new RetResponse();
        if(page<=0 || numOfPage<1){
            result.setRetMsg("the error parameters");
            result.setStatus(ReturnStatus.FAIL);
            return result;
        }
        Map result_map = userService.getAllUsers(page , numOfPage);
        result.setStatus(ReturnStatus.SUCCESS);
        result.setData(result_map);
        return result;
    }
}
