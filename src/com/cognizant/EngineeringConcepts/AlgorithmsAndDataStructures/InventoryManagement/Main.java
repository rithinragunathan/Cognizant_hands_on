package com.cognizant.rithin.AlgorithmsAndDataStructures.InventoryManagement;

public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        manager.addProduct(
                new Product(101, "Laptop", 10, 50000)
        );

        manager.updateProduct(101, 20);

        System.out.println(manager.getProductById(101).productName);
        manager.deleteProduct(101);

        System.out.println(manager.getProductById(101));
    }
}