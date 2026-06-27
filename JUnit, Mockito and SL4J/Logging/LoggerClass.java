package com.cognizant.javaframeworks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerClass {
    private static final Logger logger =  LoggerFactory.getLogger(LoggerClass.class);

    public static void main(String[] args) {
        logger.error("This is an error");
        logger.warn("This is an warning");
    }
}
