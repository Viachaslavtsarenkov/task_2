package com.company;

import java.io.*;
import java.util.ArrayList;

public class Store {

    private ArrayList<String> allGoods;
    private ArrayList<String> category;
    String result[][];

    public Store() {
        this.allGoods = new ArrayList<String>();
        this.category = new ArrayList<String>();
        getDate();
    }

    private void getDate() {
        try {
            File file = new File("appliances_db.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line != null) {
                allGoods.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public ArrayList<String> getCategory(String name) {
        for (String good : allGoods) {
            if (good.indexOf(name) >= 0) {
                category.add(good.substring(name.length() + 3));
            }
        }
        result = new String[category.size()][];
        for (int i = 0; i < category.size(); ++i) {
            result[i] = category.get(i).split(", |=");
        }
        return category;
    }

    public int getMinPrice() {
        int min = 0;
        for (int j = 0; j < result[0].length; ++j) {
            if ("PRICE".equals(result[0][j])) {
                min = Integer.parseInt(result[0][j + 1]);
                for (int i = 1; i < result.length; ++i) {
                    if (min > Integer.parseInt(result[i][j + 1])) {
                        min = Integer.parseInt(result[i][j + 1]);
                    }
                }
            }
        }
        return min;
    }
}
