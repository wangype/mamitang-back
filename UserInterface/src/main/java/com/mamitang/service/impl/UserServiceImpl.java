package com.mamitang.service.impl;

import com.mamitang.MD5Utils;
import com.mamitang.ReturnStatus;
import com.mamitang.dao.UserEntityMapper;
import com.mamitang.entity.UserEntity;
import com.mamitang.model.UserDetail;
import com.mamitang.model.UserRegisterDTO;
import com.mamitang.response.RetResponse;
import com.mamitang.service.IUserService;
import org.apache.commons.lang.StringUtils;
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


    public RetResponse register(UserRegisterDTO request_info) {
        RetResponse result = new RetResponse();
        //表单数据项服务端验证
        if(StringUtils.isEmpty(request_info.getUsername())){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg("the username is invalid");
            return result;
        }
        if(StringUtils.isEmpty(request_info.getPassword())){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg("the password is invalid");
            return result;
        }

        UserEntity user_result = userDao.getUserByName(request_info.getUsername());
        if(user_result!=null){
            result.setStatus(1);
            result.setRetMsg("user is existed");
            return result;
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(request_info.getUsername());
        userEntity.setPassword(request_info.getPassword());
        userEntity.setSpecialDish(request_info.getSpecialDish());
        userEntity.setNickname(request_info.getNickname());
        int result_id = registerToDao(userEntity);
        if(result_id < 0){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg("errors");
            return result;
        }
        result.setStatus(ReturnStatus.SUCCESS);
        result.setRetMsg("register successfully");
        return result;
    }

    private int registerToDao(UserEntity user) {
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

    public RetResponse getAllUsers(int page , int numOfPage , String querykey , String queryvalue) {
        RetResponse result = new RetResponse();
        if(page<=0 || numOfPage<1){
            result.setRetMsg("the error parameters");
            result.setStatus(ReturnStatus.FAIL);
            return result;
        }
        //获取总数
        int count = userDao.getAllUsersCount();
        //转换总页数，并最终返回
        int countOfPage = (int) Math.ceil((double) count / (double) numOfPage);
        int start = (page - 1) * numOfPage;
        //sql条件map
        Map sql_map = new HashMap();
        sql_map.put("start", start);
        sql_map.put("end", numOfPage);
        sql_map.put("querykey", querykey);
        sql_map.put("queryvalue", queryvalue);

        List<UserEntity> list = userDao.getAllUsers(sql_map);
        //返回结果map,返回总页数和当前列表数据
        Map result_map = new HashMap();
        result_map.put("countOfPage", countOfPage);
        result_map.put("currentList", list);
        result.setData(result_map);
        result.setStatus(ReturnStatus.SUCCESS);
        return result;
    }

    public RetResponse getUserDetail(int id) {
        RetResponse result = new RetResponse();
        if(id<0){
            result.setStatus(ReturnStatus.FAIL);
            result.setRetMsg("the error parameters");
            return result;
        }
        UserEntity userEntity = userDao.selectByPrimaryKey(id);
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
