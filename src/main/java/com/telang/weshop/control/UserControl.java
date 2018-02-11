package com.telang.weshop.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.UserInfoMapper;
import com.telang.weshop.entity.UserInfo;


@RestController
public class UserControl {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @RequestMapping("/")
    public UserInfo haha() {
        UserInfo user = new UserInfo();
        user.setUsername("Kangour");
        user.setPassword("123456");
        
        userInfoMapper.insert(user);
        return user;
    }

}
