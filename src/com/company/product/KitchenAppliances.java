package com.company.product;

public class KitchenAppliances extends Product {
    private double width;
    private double height;
    private double weight;
    private int powerConsumption;

    public KitchenAppliances(double price, int powerConsumption, double width, double height, double weight) {
        super(price);
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.powerConsumption = powerConsumption;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String getInformation() {
        return ", Power consumption:" + powerConsumption + ", Width:" + width + ", Height:" + height +
                ", Weight:"  + weight + super.getInformation();
    }
}
