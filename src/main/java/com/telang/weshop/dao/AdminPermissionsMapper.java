package com.telang.weshop.dao;

import com.telang.weshop.entity.AdminPermissions;

public interface AdminPermissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminPermissions record);

    int insertSelective(AdminPermissions record);

    AdminPermissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminPermissions record);

    int updateByPrimaryKey(AdminPermissions record);
}