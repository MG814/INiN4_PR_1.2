package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public class Car extends Device implements Sellable {

    public String color;
    public Double value;
    public Car cart;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        Car caro = new Car(null,null,0,null,0.0);
        if(seller.getMyCar() != null && buyer.cash >= price){
            buyer.cash -= price;
            seller.cash += price;
            buyer.setMyCar(seller.getMyCar());
            seller.setMyCar(caro);
            System.out.println("Kupujący nabył "+buyer.getMyCar()+" za kwotę "+price+"zl.");
        }
        else
            System.out.println("Upewnij się czy sprzedający ma samochód lub czy kupujący ma wystarczająco pieniędzy.");
    }
}
