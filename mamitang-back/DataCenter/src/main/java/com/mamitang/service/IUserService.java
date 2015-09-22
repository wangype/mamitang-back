package com.mamitang.service;

import com.mamitang.entity.UserEntity;

/**
 * Created by wyp on 15-7-22.
 */
public interface IUserService {

    public UserEntity getUserById(int id);

    public UserEntity login(String userName, String passWord);
}
