package com.telang.weshop.dao;

import com.telang.weshop.entity.OrderStatus;

public interface OrderStatusMapper {
    int deleteByPrimaryKey(Integer statusId);

    int insert(OrderStatus record);

    int insertSelective(OrderStatus record);

    OrderStatus selectByPrimaryKey(Integer statusId);

    int updateByPrimaryKeySelective(OrderStatus record);

    int updateByPrimaryKey(OrderStatus record);
}