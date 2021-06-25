package com.company.devices;

public class Car {
    public final String model;
    public final String producer;
    public int year;
    public String color;
    public Double value;

    public Car(String producer,String model, int year,String color,Double value){
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "model: " + model + " producer: " + producer + " year: " + year +
                " color: " + color + " value: " + value;
    }
}
