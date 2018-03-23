package com.telang.weshop.control;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.telang.weshop.entity.UserInfo;
import com.telang.weshop.service.LoginService;

@Controller
public class HomeControl {
	
	 @Autowired
 	LoginService service;
    /***
     * 首页
     * @param model
     * @return 
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(Model model) {
        return "home/index.html";
    }
   
    /***
     * 登录页
     * @param model
     * @return
     */
    
    @RequestMapping(value = "/userlogin", method = RequestMethod.GET)
    public String userlogin(Model model) {
        return "home/login.html";
    }
    
    @RequestMapping(value="/Login",method= RequestMethod.POST)
    public String login(@RequestParam("username")  String username,@RequestParam("password") String password,Model model,HttpSession session){
    	
    	 Map<String, Object> result=service.doLogin(username, password);
    	
    	 if (result.get("status").equals("success")) {   
    		 UserInfo user=(UserInfo) result.get("result");
    		 System.out.println(user.getUsername());
    		
    		 session.setAttribute("user", user);
    		 return "redirect:/";
		} else {
              
			model.addAttribute("result",result.get("result") );
			return "home/login.html";
		}
    	
    	
    }
    
    /***
     * 用户注销
     */
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 移除session
    	
        session.removeAttribute("user");
        return "redirect:/";
    }
    
    
    /***
     * 注册页
     * @param model
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {
        return "home/register.html";
    }
    /***
     * 关于我们
     * @param model
     * @return
     */
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        return "home/about.html";
    }
    /***
     * 联系我们
     * @param model
     * @return
     */
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(Model model) {
        return "home/contact.html";
    }
    /***
     * 联系我们
     * @param model
     * @return
     */
    @RequestMapping(value = "/joinus", method = RequestMethod.GET)
    public String joinus(Model model) {
        return "home/joinus.html";
    }
    /***
     * 新闻资讯内容
     * @param model
     * @return
     */
    @RequestMapping(value = "/newsContent", method = RequestMethod.GET)
    public String newsContent(Model model) {
        return "home/newsContent.html";
    }

    // 错误页跳转（自动跳转到根目录的error.html）
    @GetMapping("/error")
    public String errPage(Model model) { 
        return "";
    }

}