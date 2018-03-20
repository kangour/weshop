package com.telang.weshop.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.AdminInfoMapper;
import com.telang.weshop.entity.AdminInfo;

/***
 * 管理员相关api
 * 
 */
@RestController
public class AdminInfoApi {
    // 定义一个接口类对象
    @Autowired
    private AdminInfoMapper admin_info;

    /***
     * 通过id获取信息
     * 
     * @param id
     * @return 
     */

    @RequestMapping(value = "/api/v1/get/admin_info/id", method = RequestMethod.GET)
    public AdminInfo GetAdminInfoById(@RequestParam(value = "id", required = false) Integer id) {

        return admin_info.selectByPrimaryKey(id);
    }

    /***
     * 获取所有信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/admin_info/all", method = RequestMethod.GET)
    public AdminInfo[] GetAllAdminInfo() {

        return admin_info.selectAll();
    }

    /***
     * 根据用户名 获取所有信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/get/admin_info/username", method = RequestMethod.GET)
    public AdminInfo[] GetAllCart(@RequestParam(value = "username", required = false) String username) {

        return admin_info.selectByUsername(username);
    }
    /***
     * 根据id修改信息
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/patch/admin_info/id", method = RequestMethod.PATCH)
    public int PatchAdminInfoById(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", required = false) String password,
            @RequestParam(value = "ip", required = false) String ip,
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "user_img", required = false) String user_img) {
        if (id == null) {
            return 0;
        }
        AdminInfo ca = new AdminInfo();

        ca.setId(id);
        ca.setUsername(username);
        ca.setPassword(password);
        ca.setIp(ip);
        ca.setStatus(status);
        ca.setEmail(email);
        ca.setUserImg(user_img); 
        
        return admin_info.updateByPrimaryKeySelective(ca);
    }

    /***
     * 根据id删除
     * 
     * @return
     */
    @RequestMapping(value = "/api/v1/delete/admin_info/id", method = RequestMethod.DELETE)
    public int DeleteAdminInfoById(@RequestParam("id") Integer id) {

        return admin_info.deleteByPrimaryKey(id);
    }

    /***
     * 插入一条数据
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "/api/v1/post/admin_info/a", method = RequestMethod.POST)
    public int PostAdminInfo(@RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", required = false) String password,
            @RequestParam(value = "ip", required = false) String ip,
            @RequestParam(value = "status", required = false) String status,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "user_img", required = false) String user_img) {

        AdminInfo ca = new AdminInfo();

        ca.setId(id);
        ca.setUsername(username);
        ca.setPassword(password);
        ca.setIp(ip);
        ca.setStatus(status);
        ca.setEmail(email);
        ca.setUserImg(user_img);
        
        return admin_info.insertSelective(ca);
    }

}
