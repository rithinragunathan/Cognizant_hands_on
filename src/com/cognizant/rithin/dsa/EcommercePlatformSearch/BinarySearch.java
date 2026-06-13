package com.cognizant.rithin.dsa.EcommercePlatformSearch;

import java.util.List;

public class BinarySearch implements Search {

    @Override
    public int find(List<Product> productList, String product) {

        if(productList == null || product == null || product.isBlank()) {
            return -1;
        }

        int left = 0;
        int right = productList.size() - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            Product currProduct = productList.get(mid);
            if(currProduct == null) {
                return -1;
            }
            if(currProduct
                    .getProductName()
                    .equalsIgnoreCase(product)) {
                return mid;
            }
            else if (currProduct
                    .getProductName()
                    .compareToIgnoreCase(product) < 0) {
                    left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
