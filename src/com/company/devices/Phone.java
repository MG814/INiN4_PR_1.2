package com.company.devices;

public class Phone extends Device{

    public Phone(String producer, String model, int year){
        super(producer,model,year);
    }

    @Override
    public String toString() {
        return "model: " + model + " producer: " + producer + " year: " + year;
    }

    @Override
    public void turnOn() {
        System.out.println("Włącz telefon.");
    }
}
