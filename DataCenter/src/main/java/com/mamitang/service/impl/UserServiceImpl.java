package com.mamitang.service.impl;

import com.mamitang.MD5Utils;
import com.mamitang.dao.UserEntityMapper;
import com.mamitang.entity.UserEntity;
import com.mamitang.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

/**
 * Created by wyp on 15-7-2.
 */
@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserEntityMapper userDao;

    private Logger logger = Logger.getLogger(UserServiceImpl.class);

    public UserEntity getUserById(int id) {
        return userDao.selectByPrimaryKey(id);
    }

    public UserEntity login(String userName, String passWord) {
        String passStr = null;
        try {
            passStr = MD5Utils.string2MD5(passWord);
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.getMessage());
            return null;
        }
        return userDao.selectByUserName(userName, passStr);
    }

}
