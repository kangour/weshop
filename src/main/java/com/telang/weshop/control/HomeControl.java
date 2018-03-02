package com.telang.weshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeControl {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String page(Model model) {
        int a = 111/0;
        model.addAttribute("user",666);
        return "index.html";
    }
}