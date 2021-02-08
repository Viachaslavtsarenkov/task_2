package com.company.product;

public class TabletPC extends Computer {
    private int flashMemoryCapacity;
    private String color;
    public TabletPC(double batteryCapacity, double displayInches, int memoryROM,
                    int flashMemoryCapacity, String color, double price) {
        super(price, batteryCapacity, displayInches, memoryROM);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    @Override
    public String getInformation() {
        return "Flash memory capacity: " + flashMemoryCapacity +
                ", Color:" + color + super.getInformation();
    }
}
