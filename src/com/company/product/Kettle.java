package com.company.product;

public class Kettle extends Product {
    private int powerConsumption;
    private double size;

    public Kettle(int powerConsumption, double size, double price) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String getInformation() {
        return "power consumption: " + powerConsumption + "size: " + size +
                super.getInformation();
    }

}
