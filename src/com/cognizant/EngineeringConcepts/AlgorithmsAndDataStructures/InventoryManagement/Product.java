package com.cognizant.rithin.AlgorithmsAndDataStructures.InventoryManagement;

public class Product {
    int productId;
    String productName;
    int quantity;
    double price;
    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }


    public String getProductName() {
        return productName;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getPrice() {
        return price;
    }

    
}
