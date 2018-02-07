package com.telang.weshop.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.UserDao;
import com.telang.weshop.entity.UserEntity;


@EnableTransactionManagement  // 需要事务的时候加上
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

    @RequestMapping("/update")
    public Long update() {
        UserEntity person = new UserEntity();
        person.setId(58);
        person.setUsername("旺旺");
        person.setPassword("123");
        return personMapper.update(person);
    }

    @RequestMapping("/delete")
    public Long delete() {
        return personMapper.delete(57L);
    }

    @RequestMapping("/selectById")
    public UserEntity selectById() {
        return personMapper.selectById(58L);
    }

    @RequestMapping("/selectAll")
    public List<UserEntity> selectAll() {
        return personMapper.selectAll();
    }

    @RequestMapping("/transaction")
    @Transactional  // 需要事务的时候加上
    public Boolean transaction() {
        delete();

        int i = 3 / 0;

        save();

        return true;
    }

}
