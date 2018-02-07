package com.telang.weshop.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.UserDao;
import com.telang.weshop.entity.UserEntity;

@RestController
public class UserControl {
    @Autowired
    private UserDao personMapper;
    @RequestMapping("/insertUser")
    public Integer save() {
        UserEntity person = new UserEntity();
        person.setUsername("Kangour");
        person.setPassword("123456");
        personMapper.insert(person);
        return person.getId();
    } 
}
