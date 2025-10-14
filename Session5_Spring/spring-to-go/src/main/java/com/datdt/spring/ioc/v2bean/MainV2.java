package com.datdt.spring.ioc.v2bean;

import com.datdt.spring.ioc.v1scan.PdfGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainV2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PdfGenenrator pdfGenerator = context.getBean("thanhThao",PdfGenenrator.class);
        pdfGenerator.generatePdf("952");
    }
}
