package com.datdt.spring.noioc;

public class ContractService {
    private PdfGenerator pdfGenerator;
    public ContractService(PdfGenerator pdfGenerator) {
        this.pdfGenerator = pdfGenerator;
    }
    public void generateContractPdf(String pdfName) {
        pdfGenerator.generatePdf(pdfName);
    }
}
