package com.cognizant.rithin.designpatterns.factorymethod;

public class Main {
    public static void main(String[] args) {
        DetectorFactory factory = new Yolo11Factory();
        Detector detector = factory.getFactory();
        detector.detect();
    }
}
