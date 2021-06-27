package com.company.devices;

public class Electric extends Car{
    public Electric(String producer, String model, int year, String color, Double value) {
        super(producer, model, year, color, value);
    }

    @Override
    public void refuel() {
        System.out.println("Ładuję");
    }
}
