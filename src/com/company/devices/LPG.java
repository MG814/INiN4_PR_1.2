package com.company.devices;

public class LPG extends Car{
    public LPG(String producer, String model, int year, String color, Double value) {
        super(producer, model, year, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Tankuję LPG");
    }
}
