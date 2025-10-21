package com.datdt.spring.ioc.v3di.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractService {
   private PdfGenerator pdfGenerator;

   public ContractService(PdfGenerator pdfGenerator) {
       this.pdfGenerator = pdfGenerator;
   }
   public void generateContractPdf(String pdfName) {
       pdfGenerator.generatePdf(pdfName);
   }

}
