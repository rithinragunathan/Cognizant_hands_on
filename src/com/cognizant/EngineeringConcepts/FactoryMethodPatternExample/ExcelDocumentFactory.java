package com.cognizant.rithin.FactoryMethodPatternExample;

public class ExcelDocumentFactory extends DocumentFactory{

    @Override
    Document createDocument() {
        return new ExcelDocument();
    }
}
