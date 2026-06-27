package com.cognizant.rithin.FactoryMethodPatternExample;

public class WordDocument implements Document {

    @Override
    public void read() {
        System.out.println("reading Word Document");
    }

    @Override
    public void write() {
        System.out.println("writing the Word Document");
    }
}
