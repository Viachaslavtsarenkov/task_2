package com.company.product;

public class Product implements Comparable<Product> {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int compareTo(Product o) {
        return Double.compare(this.getPrice(), o.getPrice());
    }

    public String getInformation() {
        return ", Price:" + price;
    }
}
