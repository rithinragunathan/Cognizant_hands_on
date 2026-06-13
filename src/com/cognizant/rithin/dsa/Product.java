package com.cognizant.rithin.dsa;

public class Product {
    private String productName;
    private String id;

    public Product(String productName, String id) {
        this.id = id;
        this.productName = productName;
    }
    public String getProductName(){
        return productName;
    }
    public String getId() {
        return id;
    }
}
