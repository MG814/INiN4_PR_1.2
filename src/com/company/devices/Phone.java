package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public class Phone extends Device implements Sellable {

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.myPhone != null && buyer.cash >= price){
            buyer.cash -= price;
            seller.cash += price;
            buyer.myPhone = seller.myPhone;
            seller.myPhone = null;
            System.out.println("Kupujący nabył "+buyer.myPhone +" za kwotę "+price+" zl.");
        }
        else
            System.out.println("Upewnij się czy sprzedający ma telefon lub czy kupujący ma wystarczająco pieniędzy.");
    }
}
