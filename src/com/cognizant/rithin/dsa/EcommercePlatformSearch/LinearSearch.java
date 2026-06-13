package com.cognizant.rithin.dsa.EcommercePlatformSearch;

import java.util.List;

public class LinearSearch implements Search {
    public  int find(List<Product> productList, String target) {

        if (productList == null || target == null) {
            return -1;
        }

        for(int i = 0; i < productList.size();i++) {
            Product currentProduct = productList.get(i);
               if(currentProduct != null &&
                       currentProduct.getProductName()
                       .equalsIgnoreCase(target)) {
                   return i;
               }
        }
        return -1;
    }
}
