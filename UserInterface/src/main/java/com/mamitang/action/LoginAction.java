package com.mamitang.action;

import com.alibaba.fastjson.JSON;
import com.mamitang.common.Constant;
import com.mamitang.common.ReturnStatus;
import com.mamitang.entity.UserEntity;
import com.mamitang.model.UserModel;
import com.mamitang.request.UserLoginRequest;
import com.mamitang.response.RetResponse;
import com.mamitang.service.IUserService;
import com.mamitang.utils.ConvertToolUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录controller
 * Created by wyp on 15-7-13.
 */
@RestController
@RequestMapping("/userinfo")
public class LoginAction {

    @Autowired
    private IUserService userService;


    @RequestMapping(value = "login/{userName}", method = RequestMethod.GET)
    @ResponseBody
    public RetResponse login(@PathVariable("userName") String userName,
                             @RequestBody String passWordRequest,
                             HttpServletRequest request) {
        RetResponse retResponse = new RetResponse();
        if (passWordRequest == null || passWordRequest.equals("")) {
            retResponse.setStatus(ReturnStatus.UNKOWN_ERROR);
            return retResponse;
        }
        UserLoginRequest userLoginRequest = JSON.parseObject(passWordRequest, UserLoginRequest.class);
        if (userLoginRequest == null || userLoginRequest.getPassWord() == null) {
            retResponse.setStatus(ReturnStatus.UNKOWN_ERROR);
            return retResponse;
        }
        UserEntity userEntity = userService.login(userName, userLoginRequest.getPassWord());
        if (userEntity == null) {
            retResponse.setStatus(ReturnStatus.LOGIN_FAIL);
            return retResponse;
        }
        UserModel userModel = ConvertToolUtils.userEntityToModel.convertEntity(userEntity);
        request.getSession().setAttribute(Constant.USERSESSION, userModel);
        retResponse.setStatus(ReturnStatus.LOGIN_SUCCESS);
        retResponse.setData(userModel);
        return retResponse;
    }


}
