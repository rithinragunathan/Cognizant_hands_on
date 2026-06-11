package com.cognizant.rithin.designpatterns.singleton;

public class DoubleCheckedLockingSingleton implements Singleton {
    private static volatile Singleton instance;
    private DoubleCheckedLockingSingleton() {}

    public Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
