package com.mamitang.service;

import com.mamitang.entity.UserEntity;

import java.util.Map;

/**
 * Created by wyp on 15-7-22.
 */
public interface IUserService {

    UserEntity getUserById(int id);

    UserEntity login(String userName, String passWord);

    UserEntity getUserByName(String username);

    int register(UserEntity user);

    Map getAllUsers(int num, int numOfPage, String querykey, String queryvalue);

}
