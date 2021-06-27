package com.company.devices;

public class Disel extends Car{
    public Disel(String producer, String model, int year, String color, Double value) {
        super(producer, model, year, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Tankuję ON");
    }
}
