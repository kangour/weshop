package com.telang.weshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class TestControl {

    /***
     *测试控制器
     */
    @RequestMapping(value = "/admin/home/apiTest", method = RequestMethod.GET)
    public String testContent(Model model) {
        return "/admin/home/apiTest.html"; 
    }
}
