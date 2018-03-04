package com.telang.weshop.control.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminProductControl {

	@RequestMapping(value = "admin/product/orderlist", method = RequestMethod.GET)
    public String search(Model model) {
        return "admin/product/orderList.html";
    }
}
