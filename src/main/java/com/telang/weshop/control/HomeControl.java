package com.telang.weshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeControl {
    /***
     * 首页
     * @param model
     * @return 
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(Model model) {
        return "home/index.html";
    }
    /***
     * 登录页
     * @param model
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        return "home/login.html";
    }
    /***
     * 注册页
     * @param model
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {
        return "home/register.html";
    }
    /***
     * 关于我们
     * @param model
     * @return
     */
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        return "home/about.html";
    }
    /***
     * 联系我们
     * @param model
     * @return
     */
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(Model model) {
        return "home/contact.html";
    }
    /***
     * 联系我们
     * @param model
     * @return
     */
    @RequestMapping(value = "/joinus", method = RequestMethod.GET)
    public String joinus(Model model) {
        return "home/joinus.html";
    }
}