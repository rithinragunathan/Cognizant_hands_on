package com.cognizant.rithin.FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory{

    @Override
    Document createDocument() {
        return new WordDocument();
    }
}
