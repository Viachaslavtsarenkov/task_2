package com.company;

public class Main {
    public static void main(String[] args) {
        String name = "Kettle";
        Store market = new Store();
        market.getAllInformation(name);
        System.out.println(market.getMinPrice(name));
    }



}
