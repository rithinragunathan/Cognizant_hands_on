package com.cognizant.rithin.FactoryMethodPatternExample;

public class TestClass {
    public static void main(String[] args) {
        DocumentFactory wordDocumentFactory = new WordDocumentFactory();
        Document wordDocs = wordDocumentFactory.createDocument();
        wordDocs.read();
        wordDocs.write();

        DocumentFactory PdfDocumentFactory = new PdfDocumentFactory();
        Document pdfDocs = PdfDocumentFactory.createDocument();
        pdfDocs.read();
        pdfDocs.write();

        DocumentFactory excelDocumentFactory = new ExcelDocumentFactory();
        Document excelDocument = excelDocumentFactory.createDocument();
        excelDocument.write();
        excelDocument.read();
    }
}
