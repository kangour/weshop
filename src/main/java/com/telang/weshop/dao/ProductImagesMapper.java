package com.telang.weshop.dao;

import com.telang.weshop.entity.ProductImages;

public interface ProductImagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductImages record);

    int insertSelective(ProductImages record);

    ProductImages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductImages record);

    int updateByPrimaryKey(ProductImages record);
}