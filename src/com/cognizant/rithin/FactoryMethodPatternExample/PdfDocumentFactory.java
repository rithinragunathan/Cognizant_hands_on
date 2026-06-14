package com.cognizant.rithin.FactoryMethodPatternExample;

public class PdfDocumentFactory extends DocumentFactory{
    @Override
    Document createDocument() {
        return new PdfDocument();
    }
}
