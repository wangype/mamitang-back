package com.mamitang.action;

import com.mamitang.ReturnStatus;
import com.mamitang.entity.UserEntity;
import com.mamitang.response.RetResponse;
import com.mamitang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lyy on 15-9-24.
 * show all the users
 */

@Controller
@RequestMapping(value = "/userinfo")
public class ShowUserAction {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/users" , method = RequestMethod.GET)
    @ResponseBody
    public RetResponse showUsers(@RequestParam int page , @RequestParam int numOfPage){
        RetResponse result = new RetResponse();
        List<UserEntity> users = userService.getAllUsers(page , numOfPage);
        result.setStatus(0);
        result.setData(users);
        return result;
    }
}
