package com.cognizant.rithin.AlgorithmsAndDataStructures.EcommercePlatformSearch;

public class Main {
    public static void main(String[] args) {
        Product[] sortedProducts = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Phone", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Tablet", "Electronics")
        };
        System.out.println(Search.binarySearch(sortedProducts,103).productName);
        System.out.println(Search.linearSearch(sortedProducts,"laptop").productId);
    }
}
