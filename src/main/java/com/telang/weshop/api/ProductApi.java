package com.telang.weshop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.ProductMapper;
import com.telang.weshop.entity.Product;

/***
 * 产品相关api
 * 
 * @author 开朗
 *
 */
@RestController
public class ProductApi {
	// 定义一个产品对象
    @Autowired
	private ProductMapper prod;

	/***
	 * 通过id获取产品信息
	 * @return 返回一个商品对象，springboot会自动转换为json字符串。
	 */
	@RequestMapping(value = "/api/v1/get/product/id", method = RequestMethod.GET)
	public Product GetProductById() {
	    
		return prod.selectByPrimaryKey(1);
	}

	/***
	 * 获取所有产品信息
	 * @return  
	 */
	@RequestMapping(value = "/api/v1/get/product/all", method = RequestMethod.GET)
	public Product[] GetAllProduct() {
	    
		return prod.selectAll();
	}
}
