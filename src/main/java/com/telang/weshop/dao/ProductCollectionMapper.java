package com.telang.weshop.dao;

import com.telang.weshop.entity.ProductCollection;

public interface ProductCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCollection record);

    int insertSelective(ProductCollection record);

    ProductCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductCollection record);

    int updateByPrimaryKey(ProductCollection record);
}