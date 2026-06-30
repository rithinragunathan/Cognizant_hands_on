package com.cognizant.rithin.BuilderPatternExample;

public class TestClass {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGPU("RTX 4080")
                .setMotherboard("ASUS Z790")
                .setOs("Windows 11")
                .build();
        gamingPC.displayConfiguration();
    }
}