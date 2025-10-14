package com.datdt.spring.ioc.v2bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean
    public PdfGenenrator pdfGenerator() {
        return new PdfGenenrator();
    }
}
