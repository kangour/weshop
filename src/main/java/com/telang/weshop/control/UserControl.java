package com.telang.weshop.control;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class UserControl {
    
    @RequestMapping("/")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("index.html");
        mv.addObject("status",0);
        return mv;
    }    
    @RequestMapping("/login333")
    public ModelAndView test2(ModelAndView mv) {
        mv.setViewName("login.html");
        mv.addObject("name","Kangour");
        mv.addObject("message","你的到来小站感到很荣幸！");
        
        return mv;
    }
}
