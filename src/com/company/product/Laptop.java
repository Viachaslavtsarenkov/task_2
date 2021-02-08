package com.company.product;

public class Laptop extends Computer{
    private String OS;
    private int systemMemory;
    private double CPU;

    public Laptop(double batteryCapacity, String OS, int memoryROM, int systemMemory,
                  double CPU, double displayInches, double price) {
        super(price, batteryCapacity, displayInches, memoryROM);
        this.OS = OS;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
    }

    public String getOS() {
        return OS;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    @Override
    public String getInformation() {
        return "OS:"+ OS + ", System memory:" + systemMemory + super.getInformation();
    }
}
