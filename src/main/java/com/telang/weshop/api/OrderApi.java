package com.telang.weshop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.OrderInfoMapper;
import com.telang.weshop.entity.OrderInfo;

/***
 * 订单相关api
 *
 */
@RestController
public class OrderApi {
    // 定义一个产品接口类对象
    @Autowired
    private OrderInfoMapper order;

    /***
     * 获取所有订单信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/order_info/all", method = RequestMethod.GET)
    public OrderInfo[] GetAllOrderInfo() {

        return order.selectAll();
    }
    
    /***
     * 根据订单id获取信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/order_info/productid", method = RequestMethod.GET)
   OrderInfo SelectByProductid(Integer productid) {

        return order.selectByPrimaryKey(productid);
    }
    /***
     * 插入一条数据
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/v1/patch/order_info/a", method = RequestMethod.POST)
    public int PostProduct(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "product_id", required = false) Integer product_id,
            @RequestParam(value = "price", required = false) Double price,
            @RequestParam(value = "status_id", required = false) Integer status_id)
            {

    	OrderInfo or = new OrderInfo();

    	or.setId(id);
    	or.setProductId(product_id);
    	or.setPrice(price);
    	or.setStatusId(status_id);
        return order.insertSelective(or);
    }
    /***
     * 根据订单id删除信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/delete/order_info/productid", method = RequestMethod.DELETE)
     public int DeleteByProductid(@RequestParam("id") Integer productid) {

        return order.deleteByPrimaryKey(productid);
    }
    /***
     * 根据订单id修改信息
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/v1/post/order_info/productid", method = RequestMethod.PATCH)
      public int PatchProduct(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "product_id", required = false) Integer product_id,
            @RequestParam(value = "price", required = false) Double price,
            @RequestParam(value = "status_id", required = false) Integer status_id)
            {

    	OrderInfo or = new OrderInfo();

    	or.setId(id);
    	or.setProductId(product_id);
    	or.setPrice(price);
    	or.setStatusId(status_id);
        return order.updateByPrimaryKeySelective(or);
    }

}