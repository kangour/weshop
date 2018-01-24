package com.telang.weshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("【统一路径地址】")
@RestController
public class Hi {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("【单个路径地址】")
    public Object writeLog() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        return "Hi";
    }
}
