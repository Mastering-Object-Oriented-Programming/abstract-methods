package com.trainginmug.abstraction;

public class Main {

    public static void main(String[] args) {

        //ProductServiceImpl productService = new ProductServiceImpl();

        //ProductService productService = new ProductService(); Abstract classes can't be instantiated

        //ProductService productService = new ProductServiceImpl();

        ProductService productService = new ProductServiceImpl2();

        Product product = new Product(111, "Iphone 14 Pro Max", "Apple", 850.5F, 8.5F, 4.5F);
        productService.addProduct(product);
    }
}
