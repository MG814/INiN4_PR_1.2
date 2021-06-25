package com.company;

public class Car {
    public final String model;
    public final String producer;
    public int year;
    public String color;

    public Car(String producer,String model, int year,String color){
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
