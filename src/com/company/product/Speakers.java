package com.company.product;

public class Speakers extends Product{
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers(int powerConsumption, int numberOfSpeakers,
                    String frequencyRange, int cordLength, double price) {
        super(price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    @Override
    public String getInformation() {
        return "Power consumption:" + powerConsumption + ", Number of speakers:"  + numberOfSpeakers +
                ", Frequency range: " + frequencyRange +  ", Cord length:"+ cordLength +super.getInformation();
    }
}
