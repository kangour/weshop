package com.telang.weshop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.UserInfoMapper;
import com.telang.weshop.entity.UserInfo;

/***
 * 用户信息管理api
 * 
 * @author soulsjie
 *
 */
@RestController
public class UserInfoApi {
    //定义用户信息接口类对象
    @Autowired
    private UserInfoMapper use; 
    /***
     * 获取用户列表
     * @return  
     */
    @RequestMapping(value = "/api/v1/get/UserInfo/all", method = RequestMethod.GET)
    public UserInfo[] GetAllUserInfo() {
        
        return use.selectAll();
    }
    
    /***
     * 按用户名获取用户信息
     * @return  
     */
    @RequestMapping(value = "/api/v1/get/UserInfo/username", method = RequestMethod.GET)
    UserInfo selectByUsername(String username) {
        return use.selectByUsername("soulsjie");
    }
}
