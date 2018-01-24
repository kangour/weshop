package com.telang.weshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WeshopApplication {
	public static void main(String[] args) {
		SpringApplication.run(WeshopApplication.class, args);
	}
}
