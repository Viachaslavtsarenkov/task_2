package com.company;

import com.company.product.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String name = "Kettle";
        Store stock = new Store();
        List<Product> category = stock.getAllInformation(name);
        category.forEach(System.out::println);
        System.out.println("Min price: " + stock.getMinPrice(category));
    }
}
