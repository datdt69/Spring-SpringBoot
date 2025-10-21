package com.datdt.spring.ioc.v4setternfield;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {
    @Autowired
    private PdfGenerator pdfGenerator;
//    @Autowired
    public void  setPdfGenerator(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }
    public void generatePdf(String pdfName) {
        System.out.println("V4 Setter ---> Generating PDF: " + pdfName + ".pdf successfully!");
    }
}
