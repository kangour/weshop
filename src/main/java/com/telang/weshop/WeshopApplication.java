package com.telang.weshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@MapperScan("com.telang.*.dao")
@SpringBootApplication 

public class WeshopApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeshopApplication.class, args);
	} 
}
