package com.leyou.config;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {

//    @Bean  //声明在方法上，将方法的返回值加入Bean容器，代替<bean>标签
//    public DataSource dataSource( JdbcProperties jdbc){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setUrl(jdbc.getUrl());
//        dataSource.setDriverClassName(jdbc.getDriverClassName());
//        dataSource.setUsername(jdbc.getUsername());
//        dataSource.setPassword(jdbc.getPassword());
//        return dataSource;
//    }


}
