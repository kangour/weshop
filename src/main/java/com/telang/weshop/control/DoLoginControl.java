package com.telang.weshop.control;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoLoginControl {
    //do login for user
    @RequestMapping(value="/DoLogin",method= RequestMethod.POST)
    public String sayHello(@RequestParam("username")  String username,@RequestParam("password") String password,Model model,HttpSession session){
        
    	if (username.equals("zxy")) {
			
    		if (password.equals("123")) {
    			//System.out.println("用户名："+username+"密码："+password);
    	    	//model.addAttribute("result", "登陆成功");
    	    	session.setAttribute("username", username);
    	    	/*return "home/index.html";*/
    	    	 return "redirect:/";
			} else {

				model.addAttribute("result", "密码错误");
				//System.out.println("用户名："+username+"密码："+password);
				return "home/login.html";
			}
		}else {
			//System.out.println("用户名："+username+"密码："+password);
			model.addAttribute("result", "用户名错误");
			return "home/login.html";
		}
    	
    
    }
}
