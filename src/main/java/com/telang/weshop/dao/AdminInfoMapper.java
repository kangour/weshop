package com.telang.weshop.dao;

import com.telang.weshop.entity.AdminInfo;

public interface AdminInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}