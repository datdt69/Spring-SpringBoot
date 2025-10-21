package com.datdt.spring.ioc.v4setternfield;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ContractService contract = context.getBean(ContractService.class);
        contract.generatePdf("contract");

    }
}
