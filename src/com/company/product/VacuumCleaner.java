package com.company.product;

public class VacuumCleaner extends Product {
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wantType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(int powerConsumption, String filterType, String bagType,
                         String wantType, int motorSpeedRegulation, int cleaningWidth, double price) {
        super(price);
        this.powerConsumption = powerConsumption;
        this. filterType = filterType;
        this.bagType = bagType;
        this.wantType = wantType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String getInformation() {
        return "Power consumption:" + powerConsumption + ", Filter type:" + filterType +
                ", Bag type" + bagType + ", Want type:" + wantType +
                ", Cleaning width" + cleaningWidth + super.getInformation();
    }
}
