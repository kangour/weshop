package com.telang.weshop.api; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.OrderInfoMapper;
import com.telang.weshop.entity.OrderInfo;

/***
 * 产品相关ape
 * 
 * @author 开朗
 *
 */
@RestController
public class OrderApi {
	// 定义一个产品对象
	@Autowired
	private OrderInfoMapper order;

	/***
	 * 获取所有订单信息
	 * 
	 * @return
	 */
	@RequestMapping(value = "/api/v1/get/orderinfo/all", method = RequestMethod.GET)
	public OrderInfo[] GetAllOrderInfo() {

		return order.selectAll();
	}
	
	
}