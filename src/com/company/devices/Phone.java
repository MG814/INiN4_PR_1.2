package com.company.devices;

public class Phone {
    public String producer;
    public String model;
    public int year;

    public Phone(String producer, String model, int year){
        this.producer = producer;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "model: " + model + " producer: " + producer + " year: " + year;
    }
}
