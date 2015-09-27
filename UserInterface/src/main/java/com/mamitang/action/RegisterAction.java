package com.mamitang.action;

import com.mamitang.ReturnStatus;
import com.mamitang.entity.UserEntity;
import com.mamitang.model.UserRegisterDTO;
import com.mamitang.response.RetResponse;
import com.mamitang.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyy on 15-9-23.
 */

@Controller
@RequestMapping(value = "/userinfo")
public class RegisterAction {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/register" , method = RequestMethod.POST)
    @ResponseBody
    public RetResponse register(@ModelAttribute("userDTO") UserRegisterDTO userDTO){
        RetResponse result = new RetResponse();
        UserEntity user_result = userService.getUserByName(userDTO.getUsername());
        if(user_result!=null){
            result.setStatus(1);
            result.setRetMsg("user is existed");
            return result;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setSpecialDish(userDTO.getSpecialDish());
        userEntity.setNickname(userDTO.getNickname());
        //throw exception in service layer???
        userService.register(userEntity);
        result.setStatus(0);
        return result;
    }
}
