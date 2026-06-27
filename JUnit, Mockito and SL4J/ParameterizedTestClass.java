package com.cognizant.javaframeworks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTestClass{
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void test(int a) {
        assert (a < 5);
    }

    @ParameterizedTest
    @CsvSource({
            "3,3",
            "5,5",
            "4,4",
            "3,3"
    })
    void testWithCsv(int a, int b) {
        assertEquals(a, b);
    }
}
