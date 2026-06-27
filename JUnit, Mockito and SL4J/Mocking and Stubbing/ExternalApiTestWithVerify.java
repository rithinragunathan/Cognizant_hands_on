package com.cognizant.javaframeworks;

import com.cognizant.javaframeworks.service.ExternalApi;
import com.cognizant.javaframeworks.service.Service;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class ExternalApiTestWithVerify {
    ExternalApi mockObj;
    Service service;

    @BeforeEach
    protected void setMockObj() {
        mockObj  = Mockito.mock(ExternalApi.class);
        service = new Service(mockObj);;
    }
    @AfterEach
    protected void removeMockObj () {
        mockObj = null;
        service = null;
    }

    @Test
    protected void testApi () {
        when(mockObj.getData()).thenReturn(12);
        assertEquals(12,service.dataFromService());
        verify(mockObj).getData();
    }
    @Test
    protected void testMethod() {
        when(mockObj.getData()).thenReturn(12);
        service.dataFromService();
        verify(mockObj).getData();
    }
}
