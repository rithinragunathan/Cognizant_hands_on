package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.country.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping("/country/{id}")
    public Country getCountry(@PathVariable String id) {
        return context.getBean(id,Country.class);
    }
}

