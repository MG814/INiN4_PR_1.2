package com.company.devices;

public abstract class Device {
    public String producer;
    public String model;
    public int year;

    public Device(String producer,String model,int year){
        this.producer = producer;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "producer: " + producer + " model: " + model + " year: " + year;
    }

    abstract void turnOn();
}
