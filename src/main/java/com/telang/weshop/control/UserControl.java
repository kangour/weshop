package com.telang.weshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.telang.weshop.entity.UserInfo;

@Controller
public class UserControl {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String page(Model model) {
        UserInfo user = new UserInfo();
        user.setUsername("Kangour");
        user.setPassword("123456");
        model.addAttribute("user",user);
        return "index.html";
    }
}