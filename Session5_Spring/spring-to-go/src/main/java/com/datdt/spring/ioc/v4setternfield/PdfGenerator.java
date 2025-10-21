package com.datdt.spring.ioc.v4setternfield;

import org.springframework.stereotype.Component;

@Component
public class PdfGenerator {
    public void generatePdf(String pdfName) {
        System.out.println("V4 Setter ---> Generating PDF: " + pdfName + ".pdf successfully!");
    }
}
