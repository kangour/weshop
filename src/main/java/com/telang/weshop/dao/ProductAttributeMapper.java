package com.telang.weshop.dao;

import com.telang.weshop.entity.ProductAttribute;

public interface ProductAttributeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductAttribute record);

    int insertSelective(ProductAttribute record);

    ProductAttribute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductAttribute record);

    int updateByPrimaryKey(ProductAttribute record);
}