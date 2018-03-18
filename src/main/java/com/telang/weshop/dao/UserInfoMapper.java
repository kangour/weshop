package com.telang.weshop.dao;


import com.telang.weshop.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);//删除指定id的用户

    int insert(UserInfo record); //插入用户信息

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    //获取用户列表
    UserInfo[] selectAll();
    //获取指定用户名的用户信息
    UserInfo selectByUsername(String username);
}