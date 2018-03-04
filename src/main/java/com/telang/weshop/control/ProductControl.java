package com.telang.weshop.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductControl {

    /*** 
     * 搜索页
     * @param model
     * @return
     */
    @RequestMapping(value = "product/search", method = RequestMethod.GET)
    public String search(Model model) {
        return "product/search.html";
    }
    /***
     * 产品详情页
     * @param model
     * @return
     */
    @RequestMapping(value = "product/introduction", method = RequestMethod.GET)
    public String introduction(Model model) {
        return "product/introduction.html";
    }
    /***
     * 购买成功页
     * @param model
     * @return
     */
    @RequestMapping(value = "product/success", method = RequestMethod.GET)
    public String success(Model model) {
        return "product/success.html";
    }
    /***
     * 后台订单列表
     * @param model
     * @return
     */
    @RequestMapping(value="admin/product/orderList", method = RequestMethod.GET)
    public String orderList(Model model) {
        return "admin/product/orderList.html";
    }
}
