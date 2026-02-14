package com.techelevator.Product1;

import java.util.List;
public class Application {
    public static void main(String[] args) {
        List<Product> productItems = Loader.loadProducts("mediaInput.csv");
        VendingMachine.menuDisplay(productItems);
    }
}



