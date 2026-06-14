package com.cognizant.rithin.FactoryMethodPatternExample;

public class ExcelDocument implements Document{
    @Override
    public void read() {
        System.out.println("Reading The Excel Document");
    }

    @Override
    public void write() {
        System.out.println("Writing The Excel Document");
    }
}
