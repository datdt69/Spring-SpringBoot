package com.datdt.spring.noioc;

public class MainNoIoC {
    public static void main(String[] args) {
        PdfGenerator pdfGenerator = new PdfGenerator();
        ContractService contract = new ContractService(pdfGenerator);
        contract.generateContractPdf("contract.pdf");
    }
}
