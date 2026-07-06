package com.cognizant.springLearn.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private String code;
    private String country;

    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    public Country() {
        LOGGER.info("Inside Constructor {}",country);
    }

    public void setCode(String code) {
        LOGGER.debug("Inside setCode method {}",code);
        this.code = code;
    }

    public String getCode() {
        LOGGER.debug("Invoked getCode getter method");
        return code;
    }

    public String getCountry() {
        LOGGER.debug("Invoked getCountry getter method");
        return country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public void setCountry(String country) {
        LOGGER.debug("Inside setCountry method {}",country);
        this.country = country;
    }
}