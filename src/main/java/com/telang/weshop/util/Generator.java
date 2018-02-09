package com.telang.weshop.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generator {

	public static void main(String[] args) throws Exception {
		generator();
	}

	/***
	 * 创建和执行代码生成器。
	 * 
	 * @throws Exception
	 */
	public static void generator() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		System.out.println("mybatis逆向工程：开始");
		System.out.println("mybatis逆向工程：获取配置文件！");
		// 指定逆向工程配置文件（生成器文件） ，generator.xml文件可以使用绝对路径。
		File configFile = new File("src\\main\\resources\\generator.xml");
		// 创建配置解析器
		System.out.println("mybatis逆向工程：创建生成器！");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		// 加载配置文件
		System.out.println("mybatis逆向工程：加载配置！");
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		// 封装生成器
		System.out.println("mybatis逆向工程：封装生成器！");
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		// 执行生成器
		System.out.println("mybatis逆向工程：生成中，请稍后...");
		myBatisGenerator.generate(null);
		System.out.println("mybatis逆向工程：执行结束，成功生成！");
	}
}
