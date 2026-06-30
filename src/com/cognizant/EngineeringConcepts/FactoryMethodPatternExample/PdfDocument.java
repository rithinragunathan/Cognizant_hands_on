package com.cognizant.rithin.FactoryMethodPatternExample;

public class PdfDocument implements Document{
    @Override
    public void read() {
        System.out.println("Reading the Pdf Document");
    }

    @Override
    public void write() {
        System.out.println("Writing the Pdf Document");
    }
}
