package com.datdt.spring.ioc.v1scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PdfGenerator pdfGenerator = (PdfGenerator) context.getBean("generatePdf");
        pdfGenerator.generatePdf("936");
    }
}
