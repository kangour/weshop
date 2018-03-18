package com.telang.weshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.telang.*.dao")
@SpringBootApplication
public class WeshopApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeshopApplication.class, args);
    } 
}
