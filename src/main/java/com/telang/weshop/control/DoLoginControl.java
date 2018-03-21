package com.telang.weshop.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoLoginControl {
    //do login for user
    @RequestMapping(value="/DoLogin",method= RequestMethod.POST)
    public void sayHello(@RequestParam("username")  String username,@RequestParam("password") String password){
       System.out.println("用户名："+username+"密码："+password);
    }
}
