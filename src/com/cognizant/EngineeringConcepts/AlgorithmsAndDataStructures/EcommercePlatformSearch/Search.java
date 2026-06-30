package com.cognizant.rithin.AlgorithmsAndDataStructures.EcommercePlatformSearch;

public class Search {
   public static Product linearSearch(Product[] productsList, String target) {
       for(Product product : productsList) {
           if (product.productName.equalsIgnoreCase(target)) {
               return product;
           }
       }
       return null;
   }

   public static Product binarySearch(Product[] productsList, int target) {
        int left = 0;
        int right  = productsList.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (productsList[mid].productId == target) {
                return productsList[mid];
            }
            else if (productsList[mid].productId < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
       return null;
   }
}
