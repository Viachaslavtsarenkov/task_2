package com.company.product;

public class Kettle extends Product {
    private int powerConsumption;
    private double size;

    public Kettle(KettleBuilder builder) {
        super(builder.price);
        this.powerConsumption = builder.powerConsumption;
        this.size = builder.size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "Power consumption: " + powerConsumption +
                " Size: " + size +
                " Price: " + getPrice();
    }

    public static class KettleBuilder {

        public int powerConsumption;
        public double size;
        public double price;

        public KettleBuilder(String[] allDescription) {
            this.powerConsumption = Integer.parseInt(allDescription[1]);
            this.size = Double.parseDouble(allDescription[3]);
            this.price = Double.parseDouble(allDescription[5]);
        }

        public Kettle build() {
            return new Kettle(this);
        }
    }

}
