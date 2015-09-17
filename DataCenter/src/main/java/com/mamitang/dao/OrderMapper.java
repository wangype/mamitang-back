package com.mamitang.dao;

import com.mamitang.DaoMaster;

/** 订单数据库操作
 * Created by wyp on 15-7-22.
 */
@DaoMaster
public interface OrderMapper {

    public int countOrderNumByType(int orderStatus);


}
