package com.datdt.spring.ioc.v2bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean
    public PdfGenenrator thanhThao() {
        return new PdfGenenrator();
    }
}
