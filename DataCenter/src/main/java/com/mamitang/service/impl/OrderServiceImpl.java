package com.mamitang.service.impl;

import com.mamitang.dao.OrderMapper;
import com.mamitang.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wyp on 15-7-22.
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    private OrderMapper orderDao;

    @Override
    public int getOrderNumByStatus(int orderStatus) {
        return orderDao.countOrderNumByType(orderStatus);
    }
}
