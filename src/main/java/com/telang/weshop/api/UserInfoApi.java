package com.telang.weshop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    // 定义用户信息接口类对象
    @Autowired
    private UserInfoMapper use;

    /***
     * 获取用户列表
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/user_info/all", method = RequestMethod.GET)
    public UserInfo[] GetAllUserInfo() {

        return use.selectAll();
    }

    /***
     * 按用户名获取用户信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/user_info/username", method = RequestMethod.GET)
	public   UserInfo selectByUsername(String username) {
        return use.selectByUsername(username);
    }

    /***
     * 根据id删除用户信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/delete/user_info/id", method = RequestMethod.DELETE)
    public int DeleteUserInfoById(@RequestParam("id") Integer id) {

        return use.deleteByPrimaryKey(id);
    }

    /***
     * 插入一条用户信息记录
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/v1/post/user_info/a", method = RequestMethod.POST)
    public int PostUserInfo(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", required = false) String password,
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "address_id", required = false) Integer address_id,
            @RequestParam(value = "idcard", required = false) String idcard,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "user_img", required = false) String user_img) {
        UserInfo us = new UserInfo();
        us.setId(id);
        us.setUsername(username);
        us.setPassword(password);
        us.setStatus(status);
        us.setEmail(email);
        us.setAddressId(address_id);
        us.setIdcard(idcard);
        us.setPhone(phone);
        us.setUserImg(user_img);
        return use.insertSelective(us);
    }

    /***
     * 根据id修改用户信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/patch/user_info/id", method = RequestMethod.PATCH)
    public int PatchUserInfoById(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", required = false) String password,
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "address_id", required = false) Integer address_id,
            @RequestParam(value = "idcard", required = false) String idcard,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "user_img", required = false) String user_img) {
        UserInfo us = new UserInfo();
        us.setId(id);
        us.setUsername(username);
        us.setPassword(password);
        us.setStatus(status);
        us.setEmail(email);
        us.setAddressId(address_id);
        us.setIdcard(idcard);
        us.setPhone(phone);
        us.setUserImg(user_img);
        return use.updateByPrimaryKeySelective(us);
    }
}
