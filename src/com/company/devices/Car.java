package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public abstract class Car extends Device implements Sellable {

    private String color;
    private Double value;

    public Car(String producer,String model, int year,String color,Double value){
        super(producer,model,year);
        this.color = color;
        this.value = value;
    }

    public Double getValue() {
        return value;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getMyCar() != null && buyer.getCash() >= price){
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.setMyCar(seller.getMyCar());
            seller.removeCar();
            System.out.println("Kupujący nabył "+buyer.getMyCar()+" za kwotę "+price+"zl.");
        }
        else
            System.out.println("Upewnij się czy sprzedający ma samochód lub czy kupujący ma wystarczająco pieniędzy.");
    }

    public abstract void refuel();
}
