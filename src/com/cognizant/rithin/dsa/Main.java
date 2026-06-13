package com.cognizant.rithin.dsa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("P101", "Laptop"));
        productList.add(new Product("P102", "Mouse"));
        productList.add(new Product("P103", "Keyboard"));
        productList.add(new Product("P104", "Monitor"));
        productList.add(new Product("P105", "Smartphone"));
        productList.add(new Product("P106", "Tablet"));
        productList.add(new Product("P107", "Smartwatch"));
        productList.add(new Product("P108", "Headphones"));
        productList.add(new Product("P109", "Printer"));
        productList.add(new Product("P110", "Webcam"));

    }
}
