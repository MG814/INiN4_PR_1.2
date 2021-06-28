package com.company.devices;

public abstract class Device {
    public String producer;
    public String model;
    public int year;
    private Double value;

    public Device(String producer,String model,int year, Double value){
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "producer: " + producer + " model: " + model + " year: " + year;
    }

    abstract void turnOn();
}
