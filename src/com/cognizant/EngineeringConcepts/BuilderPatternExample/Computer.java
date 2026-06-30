package com.cognizant.rithin.BuilderPatternExample;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String motherboard;
    private String os;

    private Computer(Builder builderInstance) {
        this.CPU = builderInstance.CPU;
        this.RAM = builderInstance.RAM;
        this.storage = builderInstance.storage;
        this.GPU = builderInstance.GPU;
        this.motherboard = builderInstance.motherboard;
        this.os = builderInstance.os;
    }

    public void displayConfiguration() {
        System.out.println("CPU: " + CPU);
        System.out.println("RAM: " + RAM);
        System.out.println("Storage: " + storage);
        System.out.println("GPU: " + GPU);
        System.out.println("OS: " + os);
        System.out.println("motherboard: " + motherboard);
    }

    public static class Builder {

        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private String motherboard;
        private String os;

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
