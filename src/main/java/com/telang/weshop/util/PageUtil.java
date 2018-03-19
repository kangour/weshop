package com.telang.weshop.util;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class PageUtil {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 捕捉全局异常
	 * 
	 * @param req
	 * @param e
	 */
	@ExceptionHandler(value = Exception.class)
	public void getException(HttpServletRequest req, Exception e) {
		logger.error("捕获到一个全局异常！");
		logger.error("异常信息：" + e.getMessage());
	}
}
