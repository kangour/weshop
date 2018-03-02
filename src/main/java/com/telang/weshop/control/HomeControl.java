package com.telang.weshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeControl {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(Model model) {
        return "index.html";
    }
    @RequestMapping(value = "/install", method = RequestMethod.GET)
    public String install(Model model) {
        return "install/install.html";
    }
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        return "home/index.html";
    }
}