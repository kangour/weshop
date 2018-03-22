package com.telang.weshop.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.telang.weshop.dao.ProductMapper;
import com.telang.weshop.entity.Product;

@Controller
public class ProductControl {

	@Autowired
	private ProductMapper prod;
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
    public String GetProductById(@RequestParam(value = "id", required = false) Integer id,Model model) {
		     Product  product=prod.selectByPrimaryKey(id);
		      model.addAttribute("product", product);    	
            return "product/introduction.html";
    	
    }
    
    /**
     * 支付页面
     * @param model
     * @return
     */
   @RequestMapping(value = "product/pay", method = RequestMethod.GET)
   public String pay(Model model) {
       return "product/pay.html";
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
}
