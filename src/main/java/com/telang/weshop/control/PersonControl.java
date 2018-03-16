package com.telang.weshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonControl {
	/***
	 * 用户订单
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "order", method = RequestMethod.GET)
	public String order(Model model) {
		return "person/order.html";
	}
	/***
	 * 个人中心
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public String index(Model model) {
		return "person/index.html";
	}
	/***
	 * 个人信息
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "information", method = RequestMethod.GET)
	public String information(Model model) {
		return "person/information.html";
	}
	/**
	  * 购物车
	  */
	@RequestMapping(value = "person/shopcar", method = RequestMethod.GET)
	public String shopcart(Model model) {
		return "person/shopcart.html";
	}
	
}