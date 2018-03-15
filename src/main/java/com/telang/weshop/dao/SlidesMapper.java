package com.telang.weshop.dao;

import com.telang.weshop.entity.Slides;

public interface SlidesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Slides record);

    int insertSelective(Slides record);

    Slides selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Slides record);

    int updateByPrimaryKey(Slides record);
}