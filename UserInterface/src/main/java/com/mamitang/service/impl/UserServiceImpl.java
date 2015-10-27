package com.mamitang.service.impl;

import com.mamitang.MD5Utils;
import com.mamitang.dao.UserEntityMapper;
import com.mamitang.entity.UserEntity;
import com.mamitang.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wyp on 15-7-2.
 */
@Service("userService")
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

    public UserEntity getUserByName(String username) {
        UserEntity user = userDao.getUserByName(username);
        return user;
    }

    public int register(UserEntity user) {
        String passStr = null;
        try {
            //convert to md5 before insert into database
            passStr = MD5Utils.string2MD5(user.getPassword());
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.getMessage());
            return 0;
        }
        int result_id = userDao.insert(user);
        return result_id;
    }

    public Map getAllUsers(int page , int numOfPage , String querykey , String queryvalue) {
        int count = userDao.getAllUsersCount();
        int countOfPage = (int)Math.ceil((double)count / (double)numOfPage);
        int start = (page-1)*numOfPage;
        Map map = new HashMap();
        map.put("start" , start);
        map.put("end", numOfPage);
        map.put("querykey", querykey);
        map.put("queryvalue", queryvalue);
        List<UserEntity> list = userDao.getAllUsers(map);
        Map result_map = new HashMap();
        result_map.put("countOfPage",countOfPage);
        result_map.put("currentList",list);
        return result_map;
    }

}
