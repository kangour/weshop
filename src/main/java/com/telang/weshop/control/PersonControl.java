package com.telang.weshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/***
 * 个人中心
 * @author wangchengyang
 *
 */
@Controller
public class PersonControl {
	/***
	 * 订单
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/person/order", method = RequestMethod.GET)
	public String welcome(Model model) {
		return "person/order.html";
	}
}
