package com.cognizant.rithin.designpatterns.singleton;

public class BillPughSingleton implements Singleton{
    private BillPughSingleton() {}

    private static class Holder {
        private static final Singleton SINGLETON = new BillPughSingleton();
    }
    public Singleton getInstance() {
        return Holder.SINGLETON;
    }
}
