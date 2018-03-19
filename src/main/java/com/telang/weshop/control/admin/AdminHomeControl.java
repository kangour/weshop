package com.telang.weshop.control.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminHomeControl {

    /**
     * 测试页面：前端ajax请求api数据
     * 
     * @author 开朗
     * @param model
     * @return
     */
    @RequestMapping(value = "apiTest.html", method = RequestMethod.GET)
    public String apiTest(Model model) {
        return "admin/home/apiTest.html";
    }

    /**
     * 管理员后台登陆
     * 
     * @author zhangxy
     * @param model
     * @return
     */
    @RequestMapping(value = "admin/adminLogin", method = RequestMethod.GET)
    public String productList(Model model) {
        return "admin/home/adminLogin.html";
    }

    /**
     * 后台首页
     * 
     * @author wangchengyang
     * @param model
     * @return
     */
    @RequestMapping(value = "admin", method = RequestMethod.GET)
    public String index(Model model) {
        return "admin/home/index.html";
    }

    /**
     * 后台首页内容页
     * 
     * @author wangchengyang
     * @param model
     * @return
     */
    @RequestMapping(value = "admin/home/indexContent", method = RequestMethod.GET)
    public String indexContent(Model model) {
        return "admin/home/indexContent.html";
    }

}