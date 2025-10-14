package com.datdt.spring.ioc.v3di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV3  {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ContractService contract = context.getBean(ContractService.class);
        contract.generateContractPdf("v3");
    }
}
