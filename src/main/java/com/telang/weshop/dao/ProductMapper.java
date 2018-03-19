package com.telang.weshop.dao;

import com.telang.weshop.entity.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    // 查询所有商品数据
    Product[] selectAll();
    
    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

}