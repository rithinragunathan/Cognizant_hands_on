package com.cognizant;

import com.cognizant.country.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    static void displayCountry(ApplicationContext context) {
        Country india = context.getBean("india",Country.class);
        LOGGER.debug("Country : {}",india);

    }

    public static void main( String[] args ) {
        LOGGER.info("main method is invoked");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        LOGGER.info("Application Context is created");
        App.displayCountry(context);
    }
}
