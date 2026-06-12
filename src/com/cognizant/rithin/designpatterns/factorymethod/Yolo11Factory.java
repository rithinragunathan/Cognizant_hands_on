package com.cognizant.rithin.designpatterns.factorymethod;

public class Yolo11Factory extends DetectorFactory{
    @Override
    public Detector getFactory() {
        return new Yolo11Detector();
    }
}
