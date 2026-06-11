package com.cognizant.rithin.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instance1 = LazyImplementationOfSingletonClass.getInstance();
        Singleton instance2 = LazyImplementationOfSingletonClass.getInstance();
        
        Singleton instance3 = EagerInitializationOfSingletonClass.getInstance();
        Singleton instance4 = EagerInitializationOfSingletonClass.getInstance();

    }


}
