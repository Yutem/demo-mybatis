package com.xuanrui.demomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类
 *
 * @author xiasl
 */
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.xuanrui.demomybatis.mapper")
public class DemoMybatisApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoMybatisApplication.class, args);
	}
}
