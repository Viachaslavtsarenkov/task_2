package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String name = "Kettle";
        Store market = new Store();
        ArrayList<String> category = market.getCategory(name);
        for (String good : category) {
            System.out.println(good);
        }
        System.out.println("Min price " + market.getMinPrice());


    }


}
