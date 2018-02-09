package com.telang.weshop.control;

import javax.activation.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.generator.config.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telang.weshop.entity.UserInfo;

@EnableTransactionManagement // 需要事务的时候加上
@RestController
public class UserControl {
  

	@SuppressWarnings("unchecked")
	@RequestMapping("/")
	UserInfo xxx() {
//		DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
//		TransactionFactory transactionFactory = new JdbcTransactionFactory();
//		Environment environment = new Environment("development", transactionFactory, dataSource);
//		Configuration configuration = new Configuration(environment);
//		configuration.addMapper(BlogMapper.class);
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
//		
        return null;
	}

}
