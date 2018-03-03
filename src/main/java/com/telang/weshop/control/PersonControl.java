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
	 * 用户订单
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/person/order", method = RequestMethod.GET)
	public String order(Model model) {
		return "person/order.html";
	}
	/***
	 * 订单
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public String index(Model model) {
		return "person/index.html";
	}
	/***
     * 收藏夹页面
     * @param model
     * @return
     */
    @RequestMapping(value = "person/collection", method = RequestMethod.GET)
    public String collection(Model model) {
        return "person/collection.html";
    }
}
