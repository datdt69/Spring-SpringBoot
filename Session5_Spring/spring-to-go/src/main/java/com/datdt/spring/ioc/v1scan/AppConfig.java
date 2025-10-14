package com.datdt.spring.ioc.v1scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//các dependency sẽ được khai báo ở đây và nhờ thằng Spring quản lý giúp
@Configuration
@ComponentScan("com.datdt.spring.ioc.v1scan")
public class AppConfig {
}
