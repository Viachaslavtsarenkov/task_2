package com.company.product;

public class Refrigerator extends KitchenAppliances {

    private double freezerCapacity;
    private double overallCapacity;

    public Refrigerator(int powerConsumption, double weight, int freezerCapacity,
                        double overallCapacity, int width, int height, double price) {
        super(price, powerConsumption,width, height, weight);
        this.freezerCapacity = freezerCapacity;
        this. overallCapacity = overallCapacity;
    }

    @Override
    public String getInformation() {
        return "Freezer capacity: " + freezerCapacity +
                ", Overall capacity: " + overallCapacity + super.getInformation();
    }
}
