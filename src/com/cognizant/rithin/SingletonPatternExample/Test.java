package com.cognizant.rithin.SingletonPatternExample;

public class Test {
    public static void main(String[] args) {
       // Logger logger = new Logger();
        Logger loggerInstance1 = Logger.getInstance();
        Logger loggerInstance2 = Logger.getInstance();
        System.out.println("Hash Code of both is objects " +
                 loggerInstance2.hashCode() + " "
                + loggerInstance1.hashCode());
        System.out.println(loggerInstance1 == loggerInstance2);
    }
}
