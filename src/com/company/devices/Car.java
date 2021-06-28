package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public abstract class Car extends Device implements Sellable {

    private final String color;

    public Car(String producer,String model, int year,String color,Double value){
        super(producer,model,year,value);
        this.color = color;
    }

    @Override
    public String toString() {
        return  "producer: " + producer + " model: " + model + " year: " + year +
                " color: " + color + " value: " + getValue();
    }

    @Override
    public void turnOn() {
        System.out.println("Uruchom samochód.");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.haveCar(this)) {
            throw new Exception("Brak samochodu.");
        }

//        if(owners.get(owners.size()-1) != seller && owners.size()!=0){
//            throw new Exception("Brak samochodu.");
//        }

        if (!buyer.haveFreeSpace()) {
            throw new Exception("Brak wolnego miejsca.");
        }
        if (buyer.getCash() < price) {
            throw new Exception("Brak gotówki.");
        }
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            buyer.addCar(this);
            seller.removeCar(this);
            System.out.println("Kupujący nabył "+" za kwotę "+price+"zl.");
    }

    public abstract void refuel();
}
