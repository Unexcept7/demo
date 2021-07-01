package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 20210608
 * zhaops
 * (exclude= {DataSourceAutoConfiguration.class})
 * 配置的作用=‘在解决Failed to configure a DataSource:
 * 'url' attribute is not specified and no embedded datasource could be configured.“
 * 项目刚建立，不配置数据库配置也不报错
 */
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@SpringBootApplication
@MapperScan({"com.example.demo.dao"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
