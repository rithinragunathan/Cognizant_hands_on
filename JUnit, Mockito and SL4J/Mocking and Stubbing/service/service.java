package com.cognizant.javaframeworks.service;

public class Service {
    private final ExternalApi  api;
    public Service(ExternalApi api) {
        this.api = api;
    }
    public int dataFromService() {
        return api.getData();
    }
}
