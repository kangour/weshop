package com.telang.weshop.control.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminHomeControl {
   
	  /**
	   * 管理员后台登陆
	   * @author zhangxy
	   * @param model
	   * @return
	   */
	@RequestMapping(value="admin/home/adminLogin", method = RequestMethod.GET)
    public String productList(Model model) {
        return "admin/home/adminLogin.html";
    }
	
}