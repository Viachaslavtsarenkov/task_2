package com.company.product;

public class Computer extends Product {

    private double batteryCapacity;
    private double displayInches;
    private int memoryROM;

    public Computer(double price, double batteryCapacity, double displayInches,
                    int memoryROM) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    @Override
    public String getInformation() {
        return ", Battery Capacity:" + batteryCapacity + ", Memory ROM:" + memoryROM +
                ", Display inches: " + getDisplayInches() + super.getInformation();
    }
}
