package com.cognizant.rithin.designpatterns.factorymethod;

public class Yolo8Factory extends DetectorFactory{

    @Override
    public Detector getFactory() {
        return new Yolo8Detector();
    }
}
