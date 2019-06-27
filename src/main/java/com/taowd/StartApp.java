package com.taowd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Taoweidong
 */
@SpringBootApplication
@MapperScan("com.taowd.mybatisplus.mapper")
public class StartApp {

	public static void main(String[] args) {

		SpringApplication.run(StartApp.class, args);
	}

}
