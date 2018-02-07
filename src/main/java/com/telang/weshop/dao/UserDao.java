package com.telang.weshop.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.telang.weshop.entity.UserEntity;
/**
 * 插入一条数据到数据库。
 * @author 开朗
 *
 */
@Mapper
public interface UserDao {
    @Insert("insert into UserInfo(username,password) values(#{username},#{password})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(UserEntity personDO);
}
