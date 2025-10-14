package com.datdt.spring.ioc.v2bean;

import org.springframework.stereotype.Component;

@Component
public class PdfGenenrator {
    public void generatePdf(String pdfName) {
        System.out.println("Generating PDF: " + pdfName + ".pdf successfully!");
    }
}
