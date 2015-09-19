package com.mamitang.utils.convert;

import com.mamitang.entity.UserEntity;
import com.mamitang.model.UserModel;

/**
 * Created by wyp on 15-7-16.
 */
public class UserEntityToModel {


    public UserModel convertEntity(UserEntity userEntity){
        UserModel userModel = new UserModel();
        userModel.setUserName(userEntity.getUsername());
        return userModel;
    }


}
