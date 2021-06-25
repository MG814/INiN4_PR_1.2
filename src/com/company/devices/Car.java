package com.company.devices;

public class Car extends Device{

    public String color;
    public Double value;

    public Car(String producer,String model, int year,String color,Double value){
        super(producer,model,year);
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "model: " + model + " producer: " + producer + " year: " + year +
                " color: " + color + " value: " + value;
    }

    @Override
    public void turnOn() {
        System.out.println("Uruchom samochód.");
    }
}
