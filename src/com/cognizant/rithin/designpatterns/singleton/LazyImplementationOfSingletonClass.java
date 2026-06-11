package com.cognizant.rithin.designpatterns.singleton;

public class LazyImplementationOfSingletonClass implements Singleton {

    private static Singleton instance;

    private LazyImplementationOfSingletonClass() {}

    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new LazyImplementationOfSingletonClass();
        }
        return instance;
    }
}