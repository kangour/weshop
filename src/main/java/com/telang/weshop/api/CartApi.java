package com.telang.weshop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.CartMapper;
import com.telang.weshop.entity.Cart;

/***
 * 购物车相关api
 * 
 */
@RestController
public class CartApi {
    // 定义一个接口类对象
    @Autowired
    private CartMapper cart;

    /***
     * 通过id获取信息
     * 
     * @param id
     * @return 返回一个对象，springboot会自动转换为json字符串。
     */

    @RequestMapping(value = "/api/v1/get/cart/id", method = RequestMethod.GET)
    public Cart GetCartById(@RequestParam(value = "id", required = false) Integer id) {

        return cart.selectByPrimaryKey(id);
    }

    /***
     * 根据用户名 获取所有信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/cart/all", method = RequestMethod.GET)
    public Cart[] GetAllCart(@RequestParam(value = "username", required = false) String username) {

        return cart.selectAll(username);
    }

    /***
     * 根据id修改信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/patch/cart/id", method = RequestMethod.PATCH)
    public int PatchCartById(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "product_id", required = false) Integer product_id,
            @RequestParam(value = "number", required = false) Integer number) {
        if (id == null) {
            return 0;
        }
        Cart ca = new Cart();

        ca.setId(id);
        ca.setUsername(username);
        ca.setProductId(product_id);
        ca.setNumber(number);
        return cart.updateByPrimaryKeySelective(ca);
    }

    /***
     * 根据id删除
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/delete/cart/id", method = RequestMethod.DELETE)
    public int DeleteCartById(@RequestParam("id") Integer id) {

        return cart.deleteByPrimaryKey(id);
    }

    /***
     * 插入一条数据
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/v1/post/cart/a", method = RequestMethod.POST)
    public int PostCart(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "product_id", required = false) Integer product_id,
            @RequestParam(value = "number", required = false) Integer number) {

        Cart ca = new Cart();

        ca.setId(id);
        ca.setUsername(username);
        ca.setProductId(product_id);
        ca.setNumber(number);
        return cart.insertSelective(ca);
    }

}
