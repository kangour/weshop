package com.telang.weshop.control.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminProductControl {
    /***
     * 后台订单列表
     * @param model
     * @return
     */
    @RequestMapping(value="admin/product/orderList", method = RequestMethod.GET)
    public String orderList(Model model) {
        return "admin/product/orderList.html";
    }
    /***
     * 后台评论列表
     * @param model
     * @return
     */
    @RequestMapping(value="admin/product/comment", method = RequestMethod.GET)
    public String comment(Model model) {
        return "admin/product/comment.html";
    }
    
    /***
     * 后台评论列表
     * @author zxy
     * @param model
     * @return
     */
    @RequestMapping(value="admin/product/productList", method = RequestMethod.GET)
    public String productList(Model model) {
        return "admin/product/productList.html";
    }
 }

