package com.datdt.spring.ioc.v1scan;

import org.springframework.stereotype.Component;

@Component
// thằng component này nó bao gồm của thằng @Service và @Repository rồi
//có thể dùng 2 cái annotation kia nhưng mà dùng component cho tiện
public class PdfGenerator {
    public void generatePdf(String pdfName) {
        System.out.println("Generating PDF: " + pdfName + ".pdf successfully!");
    }
}
