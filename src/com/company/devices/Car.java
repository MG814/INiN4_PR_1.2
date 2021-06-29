package com.company.devices;

import com.company.Human;
import com.company.Sellable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Sellable {

    private final String color;
    private int numberTran;
    List<Human> owners = new ArrayList<>();

    public Car(String producer, String model, int year, String color, Double value) {
        super(producer, model, year, value);
        this.color = color;
        this.numberTran = 0;
    }

    @Override
    public String toString() {
        return "producer: " + producer + " model: " + model + " year: " + year +
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

        if(owners.size()-1 >= 0)
        {
            if (!owners.get(owners.size() - 1).equals(seller)) {
                throw new Exception("Sprzedający nie jest obecnym właścicielem pojazdu.");
            }
        }
        else
            owners.add(seller);

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
        owners.add(buyer);
        System.out.println(buyer);
        this.numberTran++;
        System.out.println("Kupujący nabył " + this + " za kwotę " + price + "zl.");
    }

    public void isOwner(Human human){
        int count = 0;
        for (Human owner:owners) {
            if(owner.equals(human)){
                count++;
                break;
            }
        }
        if(count > 0)
            System.out.println(human + " Był/a właścicielem/ką.");
        else
            System.out.println(human + " Nie był/a właścicielem/ką.");
    }

    public void isSold(Human seller, Human buyer){
        if(owners.get(owners.size()-2).equals(seller) && owners.get(owners.size()-1).equals(buyer))
            System.out.println(seller + " sprzedał/a samochód osobie "+ buyer);
        else
            System.out.println(seller + " nie sprzedał/a samochodu osobie " + buyer);
    }

    public void transactions(){
        System.out.println(this + " uczestniczył w " + this.numberTran + " tranzakcji/ach sprzedaży.");
    }

    public abstract void refuel();
}
