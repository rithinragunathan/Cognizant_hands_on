package com.cognizant.rithin.designpatterns.singleton;

public class EagerInitializationOfSingletonClass implements Singleton {
        private static final Singleton instance =  new EagerInitializationOfSingletonClass();
        private EagerInitializationOfSingletonClass() {}
        public static Singleton getInstance() {
            return instance;
        }
}
