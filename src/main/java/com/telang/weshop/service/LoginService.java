package com.telang.weshop.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.dao.UserInfoMapper;
import com.telang.weshop.entity.UserInfo;

@RestController
public class LoginService {
		
	 @Autowired
	private UserInfoMapper use;	    
         /** @author zhangxy
          * 处理用户登陆        
          * 20180323
          * @param username
          * @param password
          * @return
          */
    public Map<String,Object> doLogin( String username,String password){
           Map<String, Object> result=new HashMap<>();
                    
    	  UserInfo userInfo=use.selectByUsername(username);    	   
    	 
    	if (username.equals(userInfo.getUsername())) {
			
    		if (password.equals(userInfo.getPassword())) {
    			   result.put("status", "success");
    			   result.put("result", userInfo);    			
    	    	 return result;
			} else {
				result.put("status", "error");
 			   result.put("result", "密码错误");				
 			  return result;
			}
		}else {
			result.put("status", "error");
			   result.put("result", "用户名错误");			
			return result;
		}
    	
    
    }
}
