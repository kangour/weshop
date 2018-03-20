package com.telang.weshop.dao;

import com.telang.weshop.entity.AdminInfo;
import com.telang.weshop.entity.AdminInfo;
import com.telang.weshop.entity.OrderInfo;

public interface AdminInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);
    
    AdminInfo selectByPrimaryKey(Integer id);
    // 获取所有信息，返回到AdminInfo数组中
    AdminInfo[] selectAll();

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
    //根据用户名获取信息，返回到AdminInfo数组中
    AdminInfo[] selectByUsername(String username);
}