package com.company;

import com.company.product.*;
import java.io.*;
import java.util.*;

public class Store<T> {

    private List<Product> allGoods = new ArrayList<>();

    public Store() {
        getDate();
    }

    private void getDate() {
        try {
            File file = new File("appliances_db.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();

            while(line != null) {
                String name = "";
                if (line.indexOf(":") >= 0) {
                    name = line.substring(0, line.indexOf(":") - 1);
                } else {
                    line = reader.readLine();
                    continue;
                }
                String product[] = line.substring(name.length() + 3).split("=|, ");
                switch (name) {
                    case "Kettle":
                        allGoods.add(new Kettle.KettleBuilder(product).build());
                    break;
                    case "Laptop":
                        allGoods.add(new Laptop.LaptopBuilder(product).build());
                    break;
                    case "Oven":
                        allGoods.add(new Oven.OvenBuilder(product).build());
                        break;
                    case "Refrigerator":
                        allGoods.add(new Refrigerator.RefrigeratorBuilder(product).build());
                        break;
                    case "Speakers":
                        allGoods.add(new Speakers.SpeakersBuilder(product).build());
                        break;
                    case "TabletPC":
                        allGoods.add(new TabletPC.TabletPCBuilder(product).build());
                        break;
                    case "VacuumCleaner":
                        allGoods.add(new VacuumCleaner.VacuumCleanerBuilder(product).build());
                        break;
                    default:
                        break;
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public double getMinPrice(List<Product> category){
        double result = 0;
        Collections.sort(category);
        result = category.get(0).getPrice();
        return  result;
    }

    public List<Product> getAllInformation(String name) {
        List<Product> allInformationOfCategory = new ArrayList<>();
        for(Product good : allGoods) {
            if(good instanceof Kettle){
               allInformationOfCategory.add(good);
            }
        }
        return allInformationOfCategory;
    }

}
