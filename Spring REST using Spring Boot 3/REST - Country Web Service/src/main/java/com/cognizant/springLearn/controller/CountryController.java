package com.cognizant.springLearn.controller;

import com.cognizant.springLearn.entity.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class CountryController {
    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
    @GetMapping("/india")

    public Country getCountryIndia() {
        return context.getBean("india",Country.class);
    }

    @GetMapping("/countries")
    public Collection<Country> getCountries() {
        return context.getBeansOfType(Country.class).values();
    }
}
