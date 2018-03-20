package com.telang.weshop;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

@MapperScan("com.telang.*.dao")
@SpringBootApplication
public class WeshopApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeshopApplication.class, args);
    }

    /**
     * Mybatis-PageHelper 通用分页拦截器
     * @author
     */
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        // 为插件添加配置，也可以指定配置文件路径
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
