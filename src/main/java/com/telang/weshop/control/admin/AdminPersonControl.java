package com.telang.weshop.control.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminPersonControl {
	/**
	 *  会员列表
	 *  @author zxy
	 * @param model
	 * @return
	 */
	 
	@RequestMapping(value = "admin/person/personlist", method = RequestMethod.GET)
    public String search(Model model) {
        return "admin/person/personList.html";
 }
}