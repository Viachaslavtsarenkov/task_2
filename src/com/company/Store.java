package com.company;

import com.company.product.*;
import java.io.*;
import java.util.*;

public class Store<T> {

    private ArrayList<String> allGoods;
    private ArrayList<Kettle> teapots = new ArrayList<Kettle>();;
    private ArrayList<Laptop> laptops = new ArrayList<Laptop>();;
    private ArrayList<TabletPC> tabletPCs = new ArrayList<TabletPC>();;
    private ArrayList<Oven> ovens = new ArrayList<Oven>();;
    private ArrayList<Refrigerator> refrigerators = new ArrayList<Refrigerator>();;
    private ArrayList<Speakers> allSpeakers = new ArrayList<Speakers>();;
    private ArrayList<VacuumCleaner> vacuumCleaners = new ArrayList<VacuumCleaner>();;

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
                        teapots.add(new Kettle(Integer.parseInt(product[1]), Double.parseDouble(product[3]),
                                Double.parseDouble(product[5])));
                    break;
                    case "Laptop":
                        laptops.add(new Laptop(Double.parseDouble(product[1]), product[3],
                                Integer.parseInt(product[5]), Integer.parseInt(product[7]),Double.parseDouble(product[9]),
                                Double.parseDouble(product[11]), Double.parseDouble(product[13])));
                    break;
                    case "Oven":
                        ovens.add(new Oven(Integer.parseInt(product[1]), Double.parseDouble(product[3]),
                                Integer.parseInt(product[5]), Integer.parseInt(product[7]),
                                Double.parseDouble(product[9]), Double.parseDouble(product[11]),
                                Double.parseDouble(product[13])));
                        break;
                    case "Refrigerator":
                        refrigerators.add(new Refrigerator(Integer.parseInt(product[1]),
                                Double.parseDouble(product[3]),
                                Integer.parseInt(product[5]),Double.parseDouble(product[7]),
                                Integer.parseInt(product[9]), Integer.parseInt(product[11]),
                                Double.parseDouble(product[13])));
                        break;
                    case "Speakers":
                       allSpeakers.add(new Speakers(Integer.parseInt(product[1]), Integer.parseInt(product[3]),
                                product[5], Integer.parseInt(product[7]), Double.parseDouble(product[9])));
                        break;
                    case "TabletPC":
                        tabletPCs.add(new TabletPC(Double.parseDouble(product[1]), Double.parseDouble(product[3]),
                                Integer.parseInt(product[5]), Integer.parseInt(product[7]), product[9],
                                Double.parseDouble(product[11])));
                        break;
                    case "VacuumCleaner":
                        vacuumCleaners.add(new VacuumCleaner(Integer.parseInt(product[1]),product[3],
                                product[5], product[7], Integer.parseInt(product[9]), Integer.parseInt(product[11]),
                                Double.parseDouble(product[13])));
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

    public double getMinPrice(String name){
        double result = 0;
        switch (name) {
            case "Kettle":
                Collections.sort(teapots);
                result = teapots.get(0).getPrice();
                break;
            case "Laptop":
                Collections.sort(laptops);
                result = laptops.get(0).getPrice();
                break;
            case "Oven":
                Collections.sort(ovens);
                result = ovens.get(0).getPrice();
                break;
            case "Refrigerator":
                Collections.sort(refrigerators);
                result = refrigerators.get(0).getPrice();
                break;
            case "Speakers":
                Collections.sort(allSpeakers);
                result = allSpeakers.get(0).getPrice();
                break;
            case "TabletPC":
                Collections.sort(tabletPCs);
                result = tabletPCs.get(0).getPrice();
                break;
            case "VacuumCleaner":
                Collections.sort(vacuumCleaners);
                result = vacuumCleaners.get(0).getPrice();
                break;
            default:
                break;
        }
        return  result;
    }

    public void getAllInformation(String name) {
        switch (name) {
            case "Kettle":
                for (Kettle data : teapots) {
                    System.out.println(data.getInformation());
                }
                break;
            case "Laptop":
                for (Laptop data : laptops) {
                    System.out.println(data.getInformation());
                }
                break;
            case "Oven":
                for(Oven data : ovens) {
                    System.out.println(data.getInformation());
                }
                break;
            case "Refrigerator":
                for (Refrigerator data : refrigerators) {
                    System.out.println(data.getInformation());
                }
                break;
            case "Speakers":
                for (Speakers data : allSpeakers) {
                    System.out.println(data.getInformation());
                }
                break;
            case "TabletPC":
                for (TabletPC data : tabletPCs) {
                    System.out.println(data.getInformation());
                }

                break;
            case "VacuumCleaner":
                for (VacuumCleaner data : vacuumCleaners) {
                    System.out.println(data.getInformation());
                }
                break;
            default:
                break;
        }
    }

}
