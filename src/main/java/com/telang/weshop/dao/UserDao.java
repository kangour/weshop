package com.telang.weshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.telang.weshop.entity.UserEntity;

@Mapper
public interface UserDao{

    /**
     * 添加操作，返回新增元素的 ID
     *
     * @param person
     */
    @Insert("insert into UserInfo(username,password) values(#{username},#{password})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insert(UserEntity person);

    /**
     * 更新操作
     *
     * @param person
     * @return 受影响的行数
     */
    @Update("update UserInfo set username=#{username},password=#{password} where id=#{id}")
    Long update(UserEntity person);

    /**
     * 删除操作
     *
     * @param id
     * @return 受影响的行数
     */
    @Delete("delete from UserInfo where id=#{id}")
    Long delete(@Param("id") Long id);

    /**
     * 查询所有
     *
     * @return
     */
    @Select("select id,username,password from UserInfo")
    List<UserEntity> selectAll();

    /**
     * 根据主键查询单个
     *
     * @param id
     * @return
     */
    @Select("select id,username,password from UserInfo where id=#{id}")
    UserEntity selectById(@Param("id") Long id);
}
