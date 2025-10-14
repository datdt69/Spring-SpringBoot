package com.datdt.spring.ioc.v3di.constructor;

import org.springframework.stereotype.Component;

@Component
public class PdfGenerator {
    public void generatePdf(String pdfName) {
        System.out.println("V3 DI ---> Generating PDF: " + pdfName + ".pdf successfully!");
    }
}
