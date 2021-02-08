package com.company.product;

public class Oven extends KitchenAppliances {

    private int capacity;
    private int depth;

    public Oven (int powerConsumption, double weight, int capacity, int depth,
                 double height, double width, double price) {
        super(price, powerConsumption,width, height, weight);
        this.capacity = capacity;
        this.depth = depth;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDepth() {
        return  depth;
    }

    @Override
    public String getInformation() {
        return "Capacity:" + capacity + " depth:" + depth + super.getInformation();
    }
}
