package com.telang.weshop.control;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.entity.UserEntity;

@RestController
public class UserControl {
    @RequestMapping("/getUser")
    public ArrayList<UserEntity> getUser() {
        ArrayList<UserEntity> userList = new ArrayList<UserEntity>();
        for (int i = 0; i < 5; i++) {
            UserEntity user = new UserEntity();
            user.setName("user"+i);
            user.setAge(i);
            user.setSex("男");
            userList.add(user);
        }
        return userList;
    }
}
