package com.telang.weshop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.AddressMapper;
import com.telang.weshop.entity.Address;

/***
 * 地址相关api
 * 
 */
@RestController
public class AddressApi {
    // 定义一个接口类对象
    @Autowired
    private AddressMapper address;

    /***
     * 通过id获取信息
     * 
     * @param id
     * @return 
     */

    @RequestMapping(value = "/api/v1/get/address/id", method = RequestMethod.GET)
    public Address GetAddressById(@RequestParam(value = "id", required = false) Integer id) {

        return address.selectByPrimaryKey(id);
    }

    /***
     * 获取所有信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/address/all", method = RequestMethod.GET)
    public Address[] GetAllAddress() {

        return address.selectAll();
    }

    /***
     * 根据用户名 获取所有信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/address/username", method = RequestMethod.GET)
    public Address[] GetAllCart(@RequestParam(value = "username", required = false) String username) {

        return address.selectByUsername(username);
    }
    /***
     * 根据id修改信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/patch/address/id", method = RequestMethod.PATCH)
    public int PatchAddressById(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "accept_name", required = false) String accept_name,
            @RequestParam(value = "accept_region", required = false) String accept_region,
            @RequestParam(value = "street_address", required = false) String street_address,
            @RequestParam(value = "phone_number", required = false) String phone_number,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "zipcode", required = false) String zipcode) {
        if (id == null) {
            return 0;
        }
        Address ca = new Address();

        ca.setId(id);
        ca.setUsername(username);
        ca.setAcceptName(accept_name);
        ca.setAcceptRegion(accept_region);
        ca.setStreetAddress(street_address);
        ca.setPhoneNumber(phone_number);
        ca.setEmail(email);
        ca.setZipcode(zipcode); 
        
        return address.updateByPrimaryKeySelective(ca);
    }

    /***
     * 根据id删除
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/delete/address/id", method = RequestMethod.DELETE)
    public int DeleteAddressById(@RequestParam("id") Integer id) {

        return address.deleteByPrimaryKey(id);
    }

    /***
     * 插入一条数据
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/v1/post/address/a", method = RequestMethod.POST)
    public int PostAddress(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "accept_name", required = false) String accept_name,
            @RequestParam(value = "accept_region", required = false) String accept_region,
            @RequestParam(value = "street_address", required = false) String street_address,
            @RequestParam(value = "phone_number", required = false) String phone_number,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "zipcode", required = false) String zipcode) {

        Address ca = new Address();

        ca.setId(id);
        ca.setUsername(username);
        ca.setAcceptName(accept_name);
        ca.setAcceptRegion(accept_region);
        ca.setStreetAddress(street_address);
        ca.setPhoneNumber(phone_number);
        ca.setEmail(email);
        ca.setZipcode(zipcode); 
        
        return address.updateByPrimaryKeySelective(ca);
    }

}
