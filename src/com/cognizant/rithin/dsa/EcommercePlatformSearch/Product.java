package com.cognizant.rithin.dsa.EcommercePlatformSearch;

public class Product {
    private String productName;
    private String id;

    public Product(String id, String productName) {
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
