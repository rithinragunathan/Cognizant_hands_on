package com.cognizant.rithin.SingletonPatternExample;

public class Logger {
    private static final Logger loggerInstance = new Logger();
    private Logger() {}

    public static Logger getInstance() {
        return loggerInstance;
    }
    public void log(String message) {
        System.out.println("log" + " " + message);
    }
}
